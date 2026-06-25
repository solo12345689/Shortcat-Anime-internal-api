package io.sentry;

import com.adjust.sdk.Constants;
import java.net.URI;

/* JADX INFO: renamed from: io.sentry.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C5298v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f51450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final URI f51451e;

    C5298v(String str) {
        try {
            io.sentry.util.w.c(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !Constants.SCHEME.equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1);
            String str2 = strArrSplit[0];
            this.f51450d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f51449c = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            if (!strSubstring.endsWith("/")) {
                strSubstring = strSubstring + "/";
            }
            this.f51448b = strSubstring;
            String strSubstring2 = path.substring(iLastIndexOf);
            this.f51447a = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            String str3 = strSubstring;
            this.f51451e = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), str3 + "api/" + strSubstring2, null, null);
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    public String a() {
        return this.f51450d;
    }

    public String b() {
        return this.f51449c;
    }

    URI c() {
        return this.f51451e;
    }
}
