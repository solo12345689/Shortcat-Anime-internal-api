package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Bundle;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class M4 extends AbstractC3805f2 {

    /* JADX INFO: renamed from: c */
    private volatile E4 f40855c;

    /* JADX INFO: renamed from: d */
    private volatile E4 f40856d;

    /* JADX INFO: renamed from: e */
    protected E4 f40857e;

    /* JADX INFO: renamed from: f */
    private final Map f40858f;

    /* JADX INFO: renamed from: g */
    private com.google.android.gms.internal.measurement.J0 f40859g;

    /* JADX INFO: renamed from: h */
    private volatile boolean f40860h;

    /* JADX INFO: renamed from: i */
    private volatile E4 f40861i;

    /* JADX INFO: renamed from: j */
    private E4 f40862j;

    /* JADX INFO: renamed from: k */
    private boolean f40863k;

    /* JADX INFO: renamed from: l */
    private final Object f40864l;

    public M4(X2 x22) {
        super(x22);
        this.f40864l = new Object();
        this.f40858f = new ConcurrentHashMap();
    }

    private final void F(String str, E4 e42, boolean z10) {
        E4 e43;
        E4 e44 = this.f40855c == null ? this.f40856d : this.f40855c;
        if (e42.f40742b == null) {
            e43 = new E4(e42.f40741a, str != null ? r(str, "Activity") : null, e42.f40743c, e42.f40745e, e42.f40746f);
        } else {
            e43 = e42;
        }
        this.f40856d = this.f40855c;
        this.f40855c = e43;
        X2 x22 = this.f40611a;
        x22.b().t(new G4(this, e43, e44, x22.e().c(), z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void G(com.google.android.gms.measurement.internal.E4 r15, com.google.android.gms.measurement.internal.E4 r16, long r17, boolean r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.M4.G(com.google.android.gms.measurement.internal.E4, com.google.android.gms.measurement.internal.E4, long, boolean, android.os.Bundle):void");
    }

    private final void o(E4 e42, boolean z10, long j10) {
        X2 x22 = this.f40611a;
        x22.M().k(x22.e().c());
        if (!x22.z().f40880f.d(e42 != null && e42.f40744d, z10, j10) || e42 == null) {
            return;
        }
        e42.f40744d = false;
    }

    private final E4 p(com.google.android.gms.internal.measurement.J0 j02) {
        AbstractC2115p.l(j02);
        Integer numValueOf = Integer.valueOf(j02.f39394a);
        Map map = this.f40858f;
        E4 e42 = (E4) map.get(numValueOf);
        if (e42 == null) {
            E4 e43 = new E4(null, r(j02.f39395b, "Activity"), this.f40611a.C().p0());
            map.put(numValueOf, e43);
            e42 = e43;
        }
        return this.f40861i != null ? this.f40861i : e42;
    }

    final /* synthetic */ void A(Bundle bundle, E4 e42, E4 e43, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(e42, e43, j10, true, this.f40611a.C().t(null, "screen_view", bundle, null, false));
    }

    final /* synthetic */ void B(E4 e42, E4 e43, long j10, boolean z10, Bundle bundle) {
        G(e42, e43, j10, z10, null);
    }

    final /* synthetic */ void C(E4 e42, boolean z10, long j10) {
        o(e42, false, j10);
    }

    final /* synthetic */ E4 D() {
        return this.f40862j;
    }

    final /* synthetic */ void E(E4 e42) {
        this.f40862j = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3805f2
    protected final boolean m() {
        return false;
    }

    public final E4 q(boolean z10) {
        j();
        h();
        if (!z10) {
            return this.f40857e;
        }
        E4 e42 = this.f40857e;
        return e42 != null ? e42 : this.f40862j;
    }

    final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        X2 x22 = this.f40611a;
        return str3.length() > x22.w().x(null, false) ? str3.substring(0, x22.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f40864l) {
            try {
                if (!this.f40863k) {
                    this.f40611a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f40611a.w().x(null, false))) {
                    this.f40611a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f40611a.w().x(null, false))) {
                    this.f40611a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.J0 j02 = this.f40859g;
                    string2 = j02 != null ? r(j02.f39395b, "Activity") : "Activity";
                }
                E4 e42 = this.f40855c;
                if (this.f40860h && e42 != null) {
                    this.f40860h = false;
                    boolean zEquals = Objects.equals(e42.f40742b, string2);
                    boolean zEquals2 = Objects.equals(e42.f40741a, string);
                    if (zEquals && zEquals2) {
                        this.f40611a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                X2 x22 = this.f40611a;
                x22.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                E4 e43 = this.f40855c == null ? this.f40856d : this.f40855c;
                E4 e44 = new E4(string, string2, x22.C().p0(), true, j10);
                this.f40855c = e44;
                this.f40856d = e43;
                this.f40861i = e44;
                x22.b().t(new F4(this, bundle, e44, e43, x22.e().c()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t(com.google.android.gms.internal.measurement.J0 j02, String str, String str2) {
        X2 x22 = this.f40611a;
        if (!x22.w().N()) {
            x22.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        E4 e42 = this.f40855c;
        if (e42 == null) {
            x22.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f40858f;
        Integer numValueOf = Integer.valueOf(j02.f39394a);
        if (map.get(numValueOf) == null) {
            x22.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(j02.f39395b, "Activity");
        }
        String str3 = e42.f40742b;
        String str4 = e42.f40741a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            x22.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > x22.w().x(null, false))) {
            x22.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > x22.w().x(null, false))) {
            x22.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        x22.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        E4 e43 = new E4(str, str2, x22.C().p0());
        map.put(numValueOf, e43);
        F(j02.f39395b, e43, true);
    }

    public final E4 u() {
        return this.f40855c;
    }

    public final void v(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        Bundle bundle2;
        if (!this.f40611a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f40858f.put(Integer.valueOf(j02.f39394a), new E4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(DiagnosticsEntry.ID_KEY)));
    }

    public final void w(com.google.android.gms.internal.measurement.J0 j02) {
        Object obj = this.f40864l;
        synchronized (obj) {
            this.f40863k = true;
            if (!Objects.equals(j02, this.f40859g)) {
                synchronized (obj) {
                    this.f40859g = j02;
                    this.f40860h = false;
                    X2 x22 = this.f40611a;
                    if (x22.w().N()) {
                        this.f40861i = null;
                        x22.b().t(new L4(this));
                    }
                }
            }
        }
        X2 x23 = this.f40611a;
        if (!x23.w().N()) {
            this.f40855c = this.f40861i;
            x23.b().t(new H4(this));
            return;
        }
        F(j02.f39395b, p(j02), false);
        C0 c0M = this.f40611a.M();
        X2 x24 = c0M.f40611a;
        x24.b().t(new RunnableC3771b0(c0M, x24.e().c()));
    }

    public final void x(com.google.android.gms.internal.measurement.J0 j02) {
        synchronized (this.f40864l) {
            this.f40863k = false;
            this.f40860h = true;
        }
        X2 x22 = this.f40611a;
        long jC = x22.e().c();
        if (!x22.w().N()) {
            this.f40855c = null;
            x22.b().t(new I4(this, jC));
        } else {
            E4 e4P = p(j02);
            this.f40856d = this.f40855c;
            this.f40855c = null;
            x22.b().t(new J4(this, e4P, jC));
        }
    }

    public final void y(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        E4 e42;
        if (!this.f40611a.w().N() || bundle == null || (e42 = (E4) this.f40858f.get(Integer.valueOf(j02.f39394a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(DiagnosticsEntry.ID_KEY, e42.f40743c);
        bundle2.putString("name", e42.f40741a);
        bundle2.putString("referrer_name", e42.f40742b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(com.google.android.gms.internal.measurement.J0 j02) {
        synchronized (this.f40864l) {
            try {
                if (Objects.equals(this.f40859g, j02)) {
                    this.f40859g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f40611a.w().N()) {
            this.f40858f.remove(Integer.valueOf(j02.f39394a));
        }
    }
}
