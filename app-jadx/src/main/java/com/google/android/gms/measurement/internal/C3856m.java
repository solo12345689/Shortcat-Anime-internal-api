package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3856m extends A3 {

    /* JADX INFO: renamed from: b */
    private Boolean f41419b;

    /* JADX INFO: renamed from: c */
    private String f41420c;

    /* JADX INFO: renamed from: d */
    private InterfaceC3849l f41421d;

    /* JADX INFO: renamed from: e */
    private Boolean f41422e;

    C3856m(X2 x22) {
        super(x22);
        this.f41421d = C3842k.f41393a;
    }

    public static final long n() {
        return ((Long) AbstractC3789d2.f41205e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) AbstractC3789d2.f41220j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) AbstractC3789d2.f41226l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) AbstractC3789d2.f41177S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) AbstractC3789d2.f41167N.b(null)).longValue();
    }

    private final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName(com.amazon.a.a.o.b.at).getMethod(com.amazon.a.a.o.b.au, String.class, String.class).invoke(null, str, "");
            AbstractC2115p.l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f40611a.a().o().b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f40611a.a().o().b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f40611a.a().o().b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f40611a.a().o().b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public final long A() {
        this.f40611a.c();
        return 133005L;
    }

    public final boolean B() {
        if (this.f41422e == null) {
            synchronized (this) {
                try {
                    if (this.f41422e == null) {
                        X2 x22 = this.f40611a;
                        ApplicationInfo applicationInfo = x22.d().getApplicationInfo();
                        String strA = com.google.android.gms.common.util.o.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(strA)) {
                                z10 = true;
                            }
                            this.f41422e = Boolean.valueOf(z10);
                        }
                        if (this.f41422e == null) {
                            this.f41422e = Boolean.TRUE;
                            x22.a().o().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f41422e.booleanValue();
    }

    public final String C(String str, C3781c2 c3781c2) {
        return TextUtils.isEmpty(str) ? (String) c3781c2.b(null) : (String) c3781c2.b(this.f41421d.f(str, c3781c2.a()));
    }

    public final long D(String str, C3781c2 c3781c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c3781c2.b(null)).longValue();
        }
        String strF = this.f41421d.f(str, c3781c2.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Long) c3781c2.b(null)).longValue();
        }
        try {
            return ((Long) c3781c2.b(Long.valueOf(Long.parseLong(strF)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c3781c2.b(null)).longValue();
        }
    }

    public final int E(String str, C3781c2 c3781c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c3781c2.b(null)).intValue();
        }
        String strF = this.f41421d.f(str, c3781c2.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Integer) c3781c2.b(null)).intValue();
        }
        try {
            return ((Integer) c3781c2.b(Integer.valueOf(Integer.parseInt(strF)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c3781c2.b(null)).intValue();
        }
    }

    public final int F(String str, C3781c2 c3781c2, int i10, int i11) {
        return Math.max(Math.min(E(str, c3781c2), i11), i10);
    }

    public final double G(String str, C3781c2 c3781c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c3781c2.b(null)).doubleValue();
        }
        String strF = this.f41421d.f(str, c3781c2.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Double) c3781c2.b(null)).doubleValue();
        }
        try {
            return ((Double) c3781c2.b(Double.valueOf(Double.parseDouble(strF)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c3781c2.b(null)).doubleValue();
        }
    }

    public final boolean H(String str, C3781c2 c3781c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c3781c2.b(null)).booleanValue();
        }
        String strF = this.f41421d.f(str, c3781c2.a());
        return TextUtils.isEmpty(strF) ? ((Boolean) c3781c2.b(null)).booleanValue() : ((Boolean) c3781c2.b(Boolean.valueOf("1".equals(strF)))).booleanValue();
    }

    final Bundle I() {
        try {
            X2 x22 = this.f40611a;
            if (x22.d().getPackageManager() == null) {
                x22.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = X8.e.a(x22.d()).c(x22.d().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            x22.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f40611a.a().o().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    final Boolean J(String str) {
        AbstractC2115p.f(str);
        Bundle bundleI = I();
        if (bundleI == null) {
            this.f40611a.a().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleI.containsKey(str)) {
            return Boolean.valueOf(bundleI.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List K(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            R8.AbstractC2115p.f(r4)
            android.os.Bundle r0 = r3.I()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.X2 r4 = r3.f40611a
            com.google.android.gms.measurement.internal.q2 r4 = r4.a()
            com.google.android.gms.measurement.internal.o2 r4 = r4.o()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.X2 r0 = r3.f40611a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.d()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.X2 r0 = r3.f40611a
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()
            com.google.android.gms.measurement.internal.o2 r0 = r0.o()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3856m.K(java.lang.String):java.util.List");
    }

    public final boolean L() {
        this.f40611a.c();
        Boolean boolJ = J("firebase_analytics_collection_deactivated");
        return boolJ != null && boolJ.booleanValue();
    }

    public final boolean M() {
        Boolean boolJ = J("google_analytics_adid_collection_enabled");
        return boolJ == null || boolJ.booleanValue();
    }

    public final boolean N() {
        Boolean boolJ = J("google_analytics_automatic_screen_reporting_enabled");
        return boolJ == null || boolJ.booleanValue();
    }

    public final j9.u O(String str, boolean z10) {
        Object obj;
        AbstractC2115p.f(str);
        X2 x22 = this.f40611a;
        Bundle bundleI = I();
        if (bundleI == null) {
            x22.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleI.get(str);
        }
        if (obj == null) {
            return j9.u.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return j9.u.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return j9.u.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return j9.u.POLICY;
        }
        x22.a().r().b("Invalid manifest metadata for", str);
        return j9.u.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean boolJ = J("google_analytics_sgtm_upload_enabled");
        if (boolJ == null) {
            return false;
        }
        return boolJ.booleanValue();
    }

    public final void Q(String str) {
        this.f41420c = str;
    }

    public final String R() {
        return this.f41420c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", "");
    }

    public final String j() {
        return s("debug.deferred.deeplink", "");
    }

    public final boolean k(String str) {
        return "1".equals(this.f41421d.f(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f41421d.f(str, "measurement.event_sampling_enabled"));
    }

    final boolean m() {
        if (this.f41419b == null) {
            Boolean boolJ = J("app_measurement_lite");
            this.f41419b = boolJ;
            if (boolJ == null) {
                this.f41419b = Boolean.FALSE;
            }
        }
        return this.f41419b.booleanValue() || !this.f40611a.G();
    }

    final void t(InterfaceC3849l interfaceC3849l) {
        this.f41421d = interfaceC3849l;
    }

    final String u() {
        this.f40611a.c();
        return "FA";
    }

    public final int v() {
        return this.f40611a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(String str) {
        return F(str, AbstractC3789d2.f41189Y, 25, 100);
    }

    final int x(String str, boolean z10) {
        if (z10) {
            return F(str, AbstractC3789d2.f41218i0, 100, 500);
        }
        return 500;
    }

    final int y(String str, boolean z10) {
        return Math.max(x(str, z10), IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    final int z(String str) {
        return F(str, AbstractC3789d2.f41187X, 500, 2000);
    }
}
