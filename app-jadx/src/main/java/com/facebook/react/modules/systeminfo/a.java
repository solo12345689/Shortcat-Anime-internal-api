package com.facebook.react.modules.systeminfo;

import Df.r;
import Td.z;
import Ud.S;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.facebook.react.AbstractC3248m;
import com.facebook.react.AbstractC3250o;
import com.revenuecat.purchases.common.Constants;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public static final a f37076a = new a();

    /* JADX INFO: renamed from: b */
    private static final String f37077b = a.class.getSimpleName();

    /* JADX INFO: renamed from: c */
    private static String f37078c;

    private a() {
    }

    public static final String a(int i10) {
        return "adb reverse tcp:" + i10 + " tcp:" + i10;
    }

    public static final String b(Context context) {
        AbstractC5504s.h(context, "context");
        return a(f37076a.d(context));
    }

    private final int d(Context context) {
        return context.getResources().getInteger(AbstractC3248m.f36933a);
    }

    public static final String e() {
        if (f37076a.k()) {
            String str = Build.MODEL;
            AbstractC5504s.e(str);
            return str;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static final Map f(Context context) {
        String packageName;
        String string;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            packageName = context.getPackageName();
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                AbstractC5504s.e(string);
            }
        } else {
            packageName = null;
            string = null;
        }
        return S.l(z.a("appDisplayName", string), z.a("appIdentifier", packageName), z.a("platform", "android"), z.a("deviceName", Build.MODEL), z.a("reactNativeVersion", f37076a.h()));
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized java.lang.String g() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = com.facebook.react.modules.systeminfo.a.f37078c     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            kotlin.jvm.internal.AbstractC5504s.e(r0)     // Catch: java.lang.Throwable -> La
            monitor-exit(r7)
            return r0
        La:
            r0 = move-exception
            goto L82
        Ld:
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L58
            java.lang.String r2 = "/system/bin/getprop"
            java.lang.String r3 = "metro.host"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L58
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L58
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4e
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4e
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4e
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4e
            java.lang.String r0 = ""
        L34:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            if (r3 == 0) goto L3c
            r0 = r3
            goto L34
        L3c:
            com.facebook.react.modules.systeminfo.a.f37078c = r0     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r2.close()     // Catch: java.lang.Throwable -> La
        L41:
            r1.destroy()     // Catch: java.lang.Throwable -> La
            goto L6f
        L45:
            r0 = move-exception
            goto L77
        L47:
            r0 = move-exception
            goto L5c
        L49:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L77
        L4e:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
            goto L5c
        L53:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L77
        L58:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L5c:
            java.lang.String r3 = com.facebook.react.modules.systeminfo.a.f37077b     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "Failed to query for metro.host prop:"
            z5.AbstractC7283a.J(r3, r4, r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = ""
            com.facebook.react.modules.systeminfo.a.f37078c = r0     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L6c
            r2.close()     // Catch: java.lang.Throwable -> La
        L6c:
            if (r1 == 0) goto L6f
            goto L41
        L6f:
            java.lang.String r0 = com.facebook.react.modules.systeminfo.a.f37078c     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L75
            java.lang.String r0 = ""
        L75:
            monitor-exit(r7)
            return r0
        L77:
            if (r2 == 0) goto L7c
            r2.close()     // Catch: java.lang.Throwable -> La
        L7c:
            if (r1 == 0) goto L81
            r1.destroy()     // Catch: java.lang.Throwable -> La
        L81:
            throw r0     // Catch: java.lang.Throwable -> La
        L82:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.a.g():java.lang.String");
    }

    private final String h() {
        String str;
        Map map = b.f37080b;
        Object obj = map.get("major");
        Object obj2 = map.get("minor");
        Object obj3 = map.get("patch");
        Object obj4 = map.get("prerelease");
        if (obj4 != null) {
            str = "-" + obj4;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return obj + "." + obj2 + "." + obj3 + str;
    }

    public static final String i(Context context) {
        AbstractC5504s.h(context, "context");
        a aVar = f37076a;
        return aVar.j(context, aVar.d(context));
    }

    private final String j(Context context, int i10) {
        String strG = g().length() > 0 ? g() : k() ? "10.0.3.2" : l() ? "10.0.2.2" : "localhost";
        U u10 = U.f52264a;
        String str = String.format(Locale.US, "%s:%d", Arrays.copyOf(new Object[]{strG, Integer.valueOf(i10)}, 2));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    private final boolean k() {
        String FINGERPRINT = Build.FINGERPRINT;
        AbstractC5504s.g(FINGERPRINT, "FINGERPRINT");
        return r.W(FINGERPRINT, "vbox", false, 2, null);
    }

    private final boolean l() {
        String FINGERPRINT = Build.FINGERPRINT;
        AbstractC5504s.g(FINGERPRINT, "FINGERPRINT");
        if (r.W(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(FINGERPRINT, "FINGERPRINT");
        return r.Q(FINGERPRINT, "google/sdk_gphone", false, 2, null);
    }

    public final String c(Context context) {
        AbstractC5504s.h(context, "context");
        return context.getResources().getString(AbstractC3250o.f37114L) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + d(context);
    }
}
