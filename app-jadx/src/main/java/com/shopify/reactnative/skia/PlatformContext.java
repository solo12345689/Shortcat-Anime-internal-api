package com.shopify.reactnative.skia;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f44217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44218b = "PlatformContext";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f44219c = new Handler(Looper.getMainLooper());
    private final HybridData mHybridData;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44220a;

        a(String str) {
            this.f44220a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformContext.this.f44217a.handleException(new Exception(this.f44220a));
        }
    }

    public PlatformContext(ReactContext reactContext) {
        this.f44217a = reactContext;
        this.mHybridData = initHybrid(reactContext.getResources().getDisplayMetrics().density);
    }

    private byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 4096);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private native HybridData initHybrid(float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void notifyTaskReadyNative();

    public Object createVideo(String str) {
        return new f(this.f44217a, str);
    }

    protected void finalize() throws Throwable {
        this.mHybridData.resetNative();
        super.finalize();
    }

    public byte[] getJniStreamFromSource(String str) {
        int identifier = this.f44217a.getResources().getIdentifier(str, "drawable", this.f44217a.getPackageName());
        if (identifier == 0) {
            identifier = this.f44217a.getResources().getIdentifier(str, "raw", this.f44217a.getPackageName());
        }
        if (identifier != 0) {
            return c(this.f44217a.getResources().openRawResource(identifier));
        }
        try {
            URI uri = new URI(str);
            if (uri.getScheme() == null) {
                throw new Exception("Invalid URI scheme");
            }
            URL url = uri.toURL();
            url.openConnection().connect();
            return c(new BufferedInputStream(url.openStream(), 8192));
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
            return null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        } catch (URISyntaxException e12) {
            e12.printStackTrace();
            return null;
        } catch (Exception e13) {
            e13.printStackTrace();
            return null;
        }
    }

    public void notifyTaskReady() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            notifyTaskReadyNative();
        } else {
            this.f44219c.post(new Runnable() { // from class: com.shopify.reactnative.skia.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44224a.notifyTaskReadyNative();
                }
            });
        }
    }

    public void raise(String str) {
        this.f44219c.post(new a(str));
    }

    Object takeScreenshotFromViewTag(int i10) {
        return n.k(this.f44217a, i10);
    }
}
