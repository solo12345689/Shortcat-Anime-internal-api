package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l4 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3854l4 implements Application.ActivityLifecycleCallbacks, j9.B {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3937x4 f41415a;

    C3854l4(C3937x4 c3937x4) {
        Objects.requireNonNull(c3937x4);
        this.f41415a = c3937x4;
    }

    @Override // j9.B
    public final void a(com.google.android.gms.internal.measurement.J0 j02) {
        X2 x22 = this.f41415a.f40611a;
        x22.I().x(j02);
        N5 n5Z = x22.z();
        X2 x23 = n5Z.f40611a;
        x23.b().t(new F5(n5Z, x23.e().c()));
    }

    @Override // j9.B
    public final void b(com.google.android.gms.internal.measurement.J0 j02) {
        this.f41415a.f40611a.I().z(j02);
    }

    @Override // j9.B
    public final void c(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        this.f41415a.f40611a.I().y(j02, bundle);
    }

    @Override // j9.B
    public final void d(com.google.android.gms.internal.measurement.J0 j02) {
        X2 x22 = this.f41415a.f40611a;
        N5 n5Z = x22.z();
        X2 x23 = n5Z.f40611a;
        x23.b().t(new E5(n5Z, x23.e().c()));
        x22.I().w(j02);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    @Override // j9.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.measurement.J0 r8, android.os.Bundle r9) throws java.lang.Throwable {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.x4 r0 = r7.f41415a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.X2 r1 = r0.f40611a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.q2 r2 = r1.a()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.o2 r2 = r2.w()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r3 = "onActivityCreated"
            r2.a(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            android.content.Intent r2 = r8.f39396c     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L4c
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2c
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r4 != 0) goto L22
            goto L2c
        L22:
            r4 = r3
            goto L44
        L24:
            r0 = move-exception
            r2 = r7
            goto Lb6
        L28:
            r0 = move-exception
            r2 = r7
            goto La0
        L2c:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r4 = 0
            if (r3 == 0) goto L44
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r5 != 0) goto L44
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            goto L22
        L44:
            if (r4 == 0) goto L4c
            boolean r3 = r4.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L4e
        L4c:
            r2 = r7
            goto L96
        L4e:
            r1.C()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r0 == 0) goto L70
            goto L74
        L70:
            java.lang.String r0 = "auto"
        L72:
            r5 = r0
            goto L77
        L74:
            java.lang.String r0 = "gs"
            goto L72
        L77:
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r9 != 0) goto L82
            r0 = 1
        L80:
            r3 = r0
            goto L84
        L82:
            r0 = 0
            goto L80
        L84:
            com.google.android.gms.measurement.internal.T2 r0 = r1.b()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.k4 r1 = new com.google.android.gms.measurement.internal.k4     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            r0.t(r1)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            goto Lb1
        L92:
            r0 = move-exception
            goto Lb6
        L94:
            r0 = move-exception
            goto La0
        L96:
            com.google.android.gms.measurement.internal.X2 r0 = r0.f40611a
        L98:
            com.google.android.gms.measurement.internal.M4 r0 = r0.I()
            r0.v(r8, r9)
            return
        La0:
            com.google.android.gms.measurement.internal.x4 r1 = r2.f41415a     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.X2 r1 = r1.f40611a     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.q2 r1 = r1.a()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.o2 r1 = r1.o()     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r1.b(r3, r0)     // Catch: java.lang.Throwable -> L92
        Lb1:
            com.google.android.gms.measurement.internal.x4 r0 = r2.f41415a
            com.google.android.gms.measurement.internal.X2 r0 = r0.f40611a
            goto L98
        Lb6:
            com.google.android.gms.measurement.internal.x4 r1 = r2.f41415a
            com.google.android.gms.measurement.internal.X2 r1 = r1.f40611a
            com.google.android.gms.measurement.internal.M4 r1 = r1.I()
            r1.v(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3854l4.e(com.google.android.gms.internal.measurement.J0, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        e(com.google.android.gms.internal.measurement.J0.c(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.J0.c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(com.google.android.gms.internal.measurement.J0.c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(com.google.android.gms.internal.measurement.J0.c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(com.google.android.gms.internal.measurement.J0.c(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
