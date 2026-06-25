package nd;

import android.net.Uri;
import com.adjust.sdk.Constants;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: nd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5781e {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int b(String str) {
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case 3804:
                return str.equals("ws") ? 80 : -1;
            case 101730:
                return !str.equals("ftp") ? -1 : 21;
            case 118039:
                return !str.equals("wss") ? -1 : 443;
            case 3213448:
                return !str.equals("http") ? -1 : 80;
            case 99617003:
                return !str.equals(Constants.SCHEME) ? -1 : 443;
            default:
                return -1;
        }
    }

    public static final String c(Uri url) {
        AbstractC5504s.h(url, "url");
        String scheme = url.getScheme();
        int port = url.getPort();
        if (port == b(scheme)) {
            port = -1;
        }
        String host = url.getHost();
        if (port <= -1) {
            return scheme + "://" + host;
        }
        return scheme + "://" + host + com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + port;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(String str, Uri uri) {
        return str == null ? c(uri) : str;
    }
}
