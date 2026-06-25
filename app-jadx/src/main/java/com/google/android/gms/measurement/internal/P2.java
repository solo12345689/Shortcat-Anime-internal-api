package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C3421b2;
import com.google.android.gms.internal.measurement.C3446e0;
import com.google.android.gms.internal.measurement.C3448e2;
import com.google.android.gms.internal.measurement.C3466g2;
import com.google.android.gms.internal.measurement.C3475h2;
import com.google.android.gms.internal.measurement.C3493j2;
import com.google.android.gms.internal.measurement.C3502k2;
import com.google.android.gms.internal.measurement.C3523m5;
import com.google.android.gms.internal.measurement.C3567r5;
import com.google.android.gms.internal.measurement.C3573s2;
import com.google.android.gms.internal.measurement.C3634z3;
import com.google.android.gms.internal.measurement.InterfaceC3596u7;
import com.google.android.gms.internal.measurement.P7;
import com.google.android.gms.internal.measurement.Q7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import t.C6551a;
import t.C6575z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class P2 extends AbstractC3777b6 implements InterfaceC3849l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f40897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map f40898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map f40899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map f40900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f40901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f40902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final C6575z f40903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final InterfaceC3596u7 f40904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f40905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f40906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f40907n;

    P2(q6 q6Var) {
        super(q6Var);
        this.f40897d = new C6551a();
        this.f40898e = new C6551a();
        this.f40899f = new C6551a();
        this.f40900g = new C6551a();
        this.f40901h = new C6551a();
        this.f40905l = new C6551a();
        this.f40906m = new C6551a();
        this.f40907n = new C6551a();
        this.f40902i = new C6551a();
        this.f40903j = new I2(this, 20);
        this.f40904k = new J2(this);
    }

    private final void q(String str) throws Throwable {
        j();
        h();
        AbstractC2115p.f(str);
        Map map = this.f40901h;
        if (map.get(str) == null) {
            C3877p c3877pN0 = this.f41010b.F0().N0(str);
            if (c3877pN0 != null) {
                C3493j2 c3493j2 = (C3493j2) t(str, c3877pN0.f41485a).p();
                r(str, c3493j2);
                this.f40897d.put(str, u((C3502k2) c3493j2.q()));
                map.put(str, (C3502k2) c3493j2.q());
                s(str, (C3502k2) c3493j2.q());
                this.f40905l.put(str, c3493j2.C());
                this.f40906m.put(str, c3877pN0.f41486b);
                this.f40907n.put(str, c3877pN0.f41487c);
                return;
            }
            this.f40897d.put(str, null);
            this.f40899f.put(str, null);
            this.f40898e.put(str, null);
            this.f40900g.put(str, null);
            map.put(str, null);
            this.f40905l.put(str, null);
            this.f40906m.put(str, null);
            this.f40907n.put(str, null);
            this.f40902i.put(str, null);
        }
    }

    private final void r(String str, C3493j2 c3493j2) {
        HashSet hashSet = new HashSet();
        C6551a c6551a = new C6551a();
        C6551a c6551a2 = new C6551a();
        C6551a c6551a3 = new C6551a();
        Iterator it = c3493j2.B().iterator();
        while (it.hasNext()) {
            hashSet.add(((C3466g2) it.next()).C());
        }
        for (int i10 = 0; i10 < c3493j2.t(); i10++) {
            C3475h2 c3475h2 = (C3475h2) c3493j2.u(i10).p();
            if (c3475h2.t().isEmpty()) {
                this.f40611a.a().r().a("EventConfig contained null event name");
            } else {
                String strT = c3475h2.t();
                String strB = j9.w.b(c3475h2.t());
                if (!TextUtils.isEmpty(strB)) {
                    c3475h2.u(strB);
                    c3493j2.v(i10, c3475h2);
                }
                if (c3475h2.v() && c3475h2.x()) {
                    c6551a.put(strT, Boolean.TRUE);
                }
                if (c3475h2.y() && c3475h2.A()) {
                    c6551a2.put(c3475h2.t(), Boolean.TRUE);
                }
                if (c3475h2.B()) {
                    if (c3475h2.C() < 2 || c3475h2.C() > 65535) {
                        this.f40611a.a().r().c("Invalid sampling rate. Event name, sample rate", c3475h2.t(), Integer.valueOf(c3475h2.C()));
                    } else {
                        c6551a3.put(c3475h2.t(), Integer.valueOf(c3475h2.C()));
                    }
                }
            }
        }
        this.f40898e.put(str, hashSet);
        this.f40899f.put(str, c6551a);
        this.f40900g.put(str, c6551a2);
        this.f40902i.put(str, c6551a3);
    }

    private final void s(final String str, C3502k2 c3502k2) {
        if (c3502k2.L() == 0) {
            this.f40903j.g(str);
            return;
        }
        X2 x22 = this.f40611a;
        x22.a().w().b("EES programs found", Integer.valueOf(c3502k2.L()));
        com.google.android.gms.internal.measurement.C3 c32 = (com.google.android.gms.internal.measurement.C3) c3502k2.K().get(0);
        try {
            C3446e0 c3446e0 = new C3446e0();
            c3446e0.a("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.O2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new C3567r5("internal.remoteConfig", new K2(this.f40885a, str));
                }
            });
            c3446e0.a("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.L2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final P2 p22 = this.f40841a;
                    final String str2 = str;
                    return new Q7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.N2
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            P2 p23 = p22;
                            C3911u c3911uF0 = p23.f41010b.F0();
                            String str3 = str2;
                            C3928w2 c3928w2J0 = c3911uF0.J0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            p23.f40611a.w().A();
                            map.put("gmp_version", 133005L);
                            if (c3928w2J0 != null) {
                                String strD0 = c3928w2J0.D0();
                                if (strD0 != null) {
                                    map.put("app_version", strD0);
                                }
                                map.put("app_version_int", Long.valueOf(c3928w2J0.F0()));
                                map.put("dynamite_version", Long.valueOf(c3928w2J0.b()));
                            }
                            return map;
                        }
                    });
                }
            });
            c3446e0.a("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.M2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new P7(this.f40852a.f40904k);
                }
            });
            c3446e0.f(c32);
            this.f40903j.f(str, c3446e0);
            x22.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(c32.D().D()));
            Iterator it = c32.D().C().iterator();
            while (it.hasNext()) {
                x22.a().w().b("EES program activity", ((C3634z3) it.next()).C());
            }
        } catch (com.google.android.gms.internal.measurement.D0 unused) {
            this.f40611a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    private final C3502k2 t(String str, byte[] bArr) {
        if (bArr == null) {
            return C3502k2.T();
        }
        try {
            C3502k2 c3502k2 = (C3502k2) ((C3493j2) u6.W(C3502k2.S(), bArr)).q();
            this.f40611a.a().w().c("Parsed config. version, gmp_app_id", c3502k2.C() ? Long.valueOf(c3502k2.D()) : null, c3502k2.E() ? c3502k2.F() : null);
            return c3502k2;
        } catch (C3523m5 e10) {
            this.f40611a.a().r().c("Unable to merge remote config. appId", C3887q2.x(str), e10);
            return C3502k2.T();
        } catch (RuntimeException e11) {
            this.f40611a.a().r().c("Unable to merge remote config. appId", C3887q2.x(str), e11);
            return C3502k2.T();
        }
    }

    private static final Map u(C3502k2 c3502k2) {
        C6551a c6551a = new C6551a();
        if (c3502k2 != null) {
            for (C3573s2 c3573s2 : c3502k2.G()) {
                c6551a.put(c3573s2.C(), c3573s2.D());
            }
        }
        return c6551a;
    }

    private static final j9.v v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return j9.v.AD_STORAGE;
        }
        if (i11 == 2) {
            return j9.v.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return j9.v.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return j9.v.AD_PERSONALIZATION;
    }

    protected final void A(String str) {
        h();
        this.f40906m.put(str, null);
    }

    final void B(String str) {
        h();
        this.f40901h.remove(str);
    }

    protected final boolean C(String str, byte[] bArr, String str2, String str3) throws Throwable {
        j();
        h();
        AbstractC2115p.f(str);
        C3493j2 c3493j2 = (C3493j2) t(str, bArr).p();
        r(str, c3493j2);
        s(str, (C3502k2) c3493j2.q());
        this.f40901h.put(str, (C3502k2) c3493j2.q());
        this.f40905l.put(str, c3493j2.C());
        this.f40906m.put(str, str2);
        this.f40907n.put(str, str3);
        this.f40897d.put(str, u((C3502k2) c3493j2.q()));
        this.f41010b.F0().Y(str, new ArrayList(c3493j2.x()));
        try {
            c3493j2.y();
            bArr = ((C3502k2) c3493j2.q()).b();
        } catch (RuntimeException e10) {
            this.f40611a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", C3887q2.x(str), e10);
        }
        C3911u c3911uF0 = this.f41010b.F0();
        AbstractC2115p.f(str);
        c3911uF0.h();
        c3911uF0.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c3911uF0.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c3911uF0.f40611a.a().o().b("Failed to update remote config (got 0). appId", C3887q2.x(str));
            }
        } catch (SQLiteException e11) {
            c3911uF0.f40611a.a().o().c("Error storing remote config. appId", C3887q2.x(str), e11);
        }
        c3493j2.A();
        this.f40901h.put(str, (C3502k2) c3493j2.q());
        return true;
    }

    final boolean D(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if (H(str) && z6.N(str2)) {
            return true;
        }
        if (I(str) && z6.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f40899f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f40900g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final Set F(String str) {
        h();
        q(str);
        return (Set) this.f40898e.get(str);
    }

    final int G(String str, String str2) throws Throwable {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f40902i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final boolean H(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_internal"));
    }

    final boolean I(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_public"));
    }

    final boolean J(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f40898e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean K(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f40898e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean L(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f40898e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    final boolean M(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f40898e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    final boolean N(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f40898e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    final boolean O(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f40898e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    final boolean P(String str, j9.v vVar) throws Throwable {
        h();
        q(str);
        C3448e2 c3448e2R = R(str);
        if (c3448e2R == null) {
            return false;
        }
        Iterator it = c3448e2R.C().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.S1 s12 = (com.google.android.gms.internal.measurement.S1) it.next();
            if (vVar == v(s12.D())) {
                if (s12.E() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final j9.v Q(String str, j9.v vVar) {
        h();
        q(str);
        C3448e2 c3448e2R = R(str);
        if (c3448e2R == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.U1 u12 : c3448e2R.D()) {
            if (vVar == v(u12.D())) {
                return v(u12.E());
            }
        }
        return null;
    }

    final C3448e2 R(String str) {
        h();
        q(str);
        C3502k2 c3502k2W = w(str);
        if (c3502k2W == null || !c3502k2W.O()) {
            return null;
        }
        return c3502k2W.P();
    }

    final boolean S(String str) {
        h();
        q(str);
        C3448e2 c3448e2R = R(str);
        return c3448e2R == null || !c3448e2R.F() || c3448e2R.G();
    }

    final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        C3448e2 c3448e2R = R(str);
        if (c3448e2R != null) {
            Iterator it = c3448e2R.E().iterator();
            while (it.hasNext()) {
                treeSet.add(((C3421b2) it.next()).C());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3849l
    public final String f(String str, String str2) throws Throwable {
        h();
        q(str);
        Map map = (Map) this.f40897d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3777b6
    protected final boolean l() {
        return false;
    }

    final j9.u m(String str, j9.v vVar) {
        h();
        q(str);
        C3448e2 c3448e2R = R(str);
        if (c3448e2R == null) {
            return j9.u.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.S1 s12 : c3448e2R.H()) {
            if (v(s12.D()) == vVar) {
                int iE = s12.E() - 1;
                return iE != 1 ? iE != 2 ? j9.u.UNINITIALIZED : j9.u.DENIED : j9.u.GRANTED;
            }
        }
        return j9.u.UNINITIALIZED;
    }

    final boolean n(String str) throws Throwable {
        h();
        q(str);
        C3448e2 c3448e2R = R(str);
        if (c3448e2R == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.S1 s12 : c3448e2R.C()) {
            if (s12.D() == 3 && s12.F() == 3) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ C3446e0 o(String str) throws Throwable {
        j();
        AbstractC2115p.f(str);
        C3877p c3877pN0 = this.f41010b.F0().N0(str);
        if (c3877pN0 == null) {
            return null;
        }
        this.f40611a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, c3877pN0.f41485a));
        return (C3446e0) this.f40903j.k().get(str);
    }

    final /* synthetic */ Map p() {
        return this.f40897d;
    }

    protected final C3502k2 w(String str) {
        j();
        h();
        AbstractC2115p.f(str);
        q(str);
        return (C3502k2) this.f40901h.get(str);
    }

    final String x(String str) {
        h();
        q(str);
        return (String) this.f40905l.get(str);
    }

    protected final String y(String str) {
        h();
        return (String) this.f40906m.get(str);
    }

    protected final String z(String str) {
        h();
        return (String) this.f40907n.get(str);
    }
}
