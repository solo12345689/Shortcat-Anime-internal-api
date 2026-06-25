package com.adjust.sdk;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class AdjustLinkResolution {
    private static volatile ExecutorService executor = null;
    private static final String[] expectedUrlHostSuffixArray = {"adjust.com", "adj.st", "go.link", "adjust.net.in", "adjust.cn", "adjust.world", "adjust.io"};
    private static final int maxRecursions = 10;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface AdjustLinkResolutionCallback {
        void resolvedLinkCallback(Uri uri);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ URL f34009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdjustLinkResolutionCallback f34010b;

        public a(URL url, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
            this.f34009a = url;
            this.f34010b = adjustLinkResolutionCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdjustLinkResolution.requestAndResolve(this.f34009a, 0, this.f34010b);
        }
    }

    private AdjustLinkResolution() {
    }

    private static URL convertToHttps(URL url) {
        String externalForm;
        if (url != null && (externalForm = url.toExternalForm()) != null && externalForm.startsWith("http:")) {
            try {
                return new URL("https:" + externalForm.substring(5));
            } catch (MalformedURLException unused) {
            }
        }
        return url;
    }

    private static Uri convertToUri(URL url) {
        if (url == null) {
            return null;
        }
        return Uri.parse(url.toString());
    }

    private static boolean isTerminalUrl(String str) {
        return urlMatchesSuffix(str, expectedUrlHostSuffixArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requestAndResolve(URL url, int i10, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        HttpURLConnection httpURLConnection;
        URL urlConvertToHttps = convertToHttps(url);
        try {
            httpURLConnection = (HttpURLConnection) urlConvertToHttps.openConnection();
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.connect();
                String headerField = httpURLConnection.getHeaderField("Location");
                URL url2 = headerField != null ? new URL(headerField) : null;
                httpURLConnection.disconnect();
                resolveLink(url2, urlConvertToHttps, i10 + 1, adjustLinkResolutionCallback);
            } catch (Throwable unused) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                resolveLink(null, urlConvertToHttps, i10 + 1, adjustLinkResolutionCallback);
            }
        } catch (Throwable unused2) {
            httpURLConnection = null;
        }
    }

    public static void resolveLink(String str, String[] strArr, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        URL url;
        if (adjustLinkResolutionCallback == null) {
            return;
        }
        if (str == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        if (!urlMatchesSuffix(url.getHost(), strArr)) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
            return;
        }
        if (executor == null) {
            synchronized (expectedUrlHostSuffixArray) {
                try {
                    if (executor == null) {
                        executor = Executors.newSingleThreadExecutor();
                    }
                } finally {
                }
            }
        }
        executor.execute(new a(url, adjustLinkResolutionCallback));
    }

    private static boolean urlMatchesSuffix(String str, String[] strArr) {
        if (str == null || strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static void resolveLink(URL url, URL url2, int i10, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url2));
            return;
        }
        if (isTerminalUrl(url.getHost())) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
        } else if (i10 > maxRecursions) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
        } else {
            requestAndResolve(url, i10, adjustLinkResolutionCallback);
        }
    }
}
