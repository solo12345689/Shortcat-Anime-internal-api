package com.google.android.gms.measurement.internal;

import P9.AbstractC2011u;
import P9.AbstractC2012v;
import P9.AbstractC2013w;
import R8.AbstractC2115p;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.C3498j7;
import com.google.android.gms.internal.measurement.EnumC3566r4;
import com.google.android.gms.internal.measurement.EnumC3575s4;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import j9.InterfaceC5343A;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import t.C6551a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x4 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3937x4 extends AbstractC3805f2 {

    /* JADX INFO: renamed from: c */
    protected C3854l4 f41749c;

    /* JADX INFO: renamed from: d */
    private j9.z f41750d;

    /* JADX INFO: renamed from: e */
    private final Set f41751e;

    /* JADX INFO: renamed from: f */
    private boolean f41752f;

    /* JADX INFO: renamed from: g */
    private final AtomicReference f41753g;

    /* JADX INFO: renamed from: h */
    private final Object f41754h;

    /* JADX INFO: renamed from: i */
    private boolean f41755i;

    /* JADX INFO: renamed from: j */
    private int f41756j;

    /* JADX INFO: renamed from: k */
    private AbstractC3932x f41757k;

    /* JADX INFO: renamed from: l */
    private AbstractC3932x f41758l;

    /* JADX INFO: renamed from: m */
    private PriorityQueue f41759m;

    /* JADX INFO: renamed from: n */
    private boolean f41760n;

    /* JADX INFO: renamed from: o */
    private E3 f41761o;

    /* JADX INFO: renamed from: p */
    private final AtomicLong f41762p;

    /* JADX INFO: renamed from: q */
    private long f41763q;

    /* JADX INFO: renamed from: r */
    final H6 f41764r;

    /* JADX INFO: renamed from: s */
    protected boolean f41765s;

    /* JADX INFO: renamed from: t */
    private AbstractC3932x f41766t;

    /* JADX INFO: renamed from: u */
    private SharedPreferences.OnSharedPreferenceChangeListener f41767u;

    /* JADX INFO: renamed from: v */
    private AbstractC3932x f41768v;

    /* JADX INFO: renamed from: w */
    private final y6 f41769w;

    protected C3937x4(X2 x22) {
        super(x22);
        this.f41751e = new CopyOnWriteArraySet();
        this.f41754h = new Object();
        this.f41755i = false;
        this.f41756j = 1;
        this.f41765s = true;
        this.f41769w = new C3775b4(this);
        this.f41753g = new AtomicReference();
        this.f41761o = E3.f40738c;
        this.f41763q = -1L;
        this.f41762p = new AtomicLong(0L);
        this.f41764r = new H6(x22);
    }

    private final j9.F e0(final X5 x52) {
        try {
            URL url = new URI(x52.f41051c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strS = this.f40611a.L().s();
            X2 x22 = this.f40611a;
            C3873o2 c3873o2W = x22.a().w();
            Long lValueOf = Long.valueOf(x52.f41049a);
            c3873o2W.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, x52.f41051c, Integer.valueOf(x52.f41050b.length));
            if (!TextUtils.isEmpty(x52.f41055g)) {
                x22.a().w().c("[sgtm] Uploading data from app. row_id", lValueOf, x52.f41055g);
            }
            HashMap map = new HashMap();
            Bundle bundle = x52.f41052d;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            B4 b4F = x22.F();
            byte[] bArr = x52.f41050b;
            InterfaceC3944y4 interfaceC3944y4 = new InterfaceC3944y4() { // from class: com.google.android.gms.measurement.internal.m4
                /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.InterfaceC3944y4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final /* synthetic */ void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
                    /*
                        r6 = this;
                        com.google.android.gms.measurement.internal.x4 r7 = r6.f41432a
                        r7.h()
                        com.google.android.gms.measurement.internal.X5 r10 = r3
                        r11 = 200(0xc8, float:2.8E-43)
                        if (r8 == r11) goto L14
                        r11 = 204(0xcc, float:2.86E-43)
                        if (r8 == r11) goto L14
                        r11 = 304(0x130, float:4.26E-43)
                        if (r8 != r11) goto L2e
                        r8 = r11
                    L14:
                        if (r9 != 0) goto L2e
                        com.google.android.gms.measurement.internal.X2 r8 = r7.f40611a
                        com.google.android.gms.measurement.internal.q2 r8 = r8.a()
                        com.google.android.gms.measurement.internal.o2 r8 = r8.w()
                        long r0 = r10.f41049a
                        java.lang.Long r9 = java.lang.Long.valueOf(r0)
                        java.lang.String r11 = "[sgtm] Upload succeeded for row_id"
                        r8.b(r11, r9)
                        j9.F r8 = j9.F.SUCCESS
                        goto L69
                    L2e:
                        com.google.android.gms.measurement.internal.X2 r11 = r7.f40611a
                        com.google.android.gms.measurement.internal.q2 r11 = r11.a()
                        com.google.android.gms.measurement.internal.o2 r11 = r11.r()
                        long r0 = r10.f41049a
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                        java.lang.String r2 = "[sgtm] Upload failed for row_id. response, exception"
                        r11.d(r2, r0, r1, r9)
                        com.google.android.gms.measurement.internal.c2 r9 = com.google.android.gms.measurement.internal.AbstractC3789d2.f41245u
                        r11 = 0
                        java.lang.Object r9 = r9.b(r11)
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.String r11 = ","
                        java.lang.String[] r9 = r9.split(r11)
                        java.util.List r9 = java.util.Arrays.asList(r9)
                        java.lang.String r8 = java.lang.String.valueOf(r8)
                        boolean r8 = r9.contains(r8)
                        if (r8 == 0) goto L67
                        j9.F r8 = j9.F.BACKOFF
                        goto L69
                    L67:
                        j9.F r8 = j9.F.FAILURE
                    L69:
                        java.util.concurrent.atomic.AtomicReference r9 = r2
                        com.google.android.gms.measurement.internal.X2 r11 = r7.f40611a
                        com.google.android.gms.measurement.internal.w5 r11 = r11.J()
                        com.google.android.gms.measurement.internal.g r0 = new com.google.android.gms.measurement.internal.g
                        long r1 = r10.f41049a
                        int r3 = r8.zza()
                        long r4 = r10.f41054f
                        r0.<init>(r1, r3, r4)
                        r11.k0(r0)
                        com.google.android.gms.measurement.internal.X2 r7 = r7.f40611a
                        com.google.android.gms.measurement.internal.q2 r7 = r7.a()
                        com.google.android.gms.measurement.internal.o2 r7 = r7.w()
                        java.lang.Long r10 = java.lang.Long.valueOf(r1)
                        java.lang.String r11 = "[sgtm] Updated status for row_id"
                        r7.c(r11, r10, r8)
                        monitor-enter(r9)
                        r9.set(r8)     // Catch: java.lang.Throwable -> L9d
                        r9.notifyAll()     // Catch: java.lang.Throwable -> L9d
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        return
                    L9d:
                        r0 = move-exception
                        r7 = r0
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3861m4.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
                }
            };
            b4F.l();
            AbstractC2115p.l(url);
            AbstractC2115p.l(bArr);
            AbstractC2115p.l(interfaceC3944y4);
            b4F.f40611a.b().w(new A4(b4F, strS, url, bArr, map, interfaceC3944y4));
            try {
                X2 x23 = x22.C().f40611a;
                long jA = x23.e().a() + 60000;
                synchronized (atomicReference) {
                    for (long jA2 = 60000; atomicReference.get() == null && jA2 > 0; jA2 = jA - x23.e().a()) {
                        try {
                            atomicReference.wait(jA2);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f40611a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? j9.F.UNKNOWN : (j9.F) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f40611a.a().o().d("[sgtm] Bad upload url for row_id", x52.f41051c, Long.valueOf(x52.f41049a), e10);
            return j9.F.FAILURE;
        }
    }

    private final void f0(Boolean bool, boolean z10) {
        h();
        j();
        X2 x22 = this.f40611a;
        x22.a().v().b("Setting app measurement enabled (FE)", bool);
        x22.x().s(bool);
        if (z10) {
            E2 e2X = x22.x();
            X2 x23 = e2X.f40611a;
            e2X.h();
            SharedPreferences.Editor editorEdit = e2X.p().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f40611a.j() || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void Y() {
        C3937x4 c3937x4;
        h();
        X2 x22 = this.f40611a;
        String strA = x22.x().f40725n.a();
        if (strA == null) {
            c3937x4 = this;
        } else if ("unset".equals(strA)) {
            c3937x4 = this;
            c3937x4.B("app", "_npa", null, x22.e().a());
        } else {
            B("app", "_npa", Long.valueOf(true != com.amazon.a.a.o.b.f34640af.equals(strA) ? 0L : 1L), x22.e().a());
            c3937x4 = this;
        }
        if (!c3937x4.f40611a.g() || !c3937x4.f41765s) {
            x22.a().v().a("Updating Scion state (FE)");
            c3937x4.f40611a.J().X();
        } else {
            x22.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            H();
            c3937x4.f40611a.z().f40879e.a();
            x22.b().t(new N3(this));
        }
    }

    final void A(String str, String str2, long j10, Object obj) {
        this.f40611a.b().t(new S3(this, str, str2, obj, j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void B(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            R8.AbstractC2115p.f(r10)
            R8.AbstractC2115p.f(r11)
            r9.h()
            r9.j()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L74
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            r12 = 1
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r12 == r11) goto L37
            r11 = 0
            goto L38
        L37:
            r11 = r2
        L38:
            com.google.android.gms.measurement.internal.X2 r4 = r9.f40611a
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            com.google.android.gms.measurement.internal.E2 r11 = r4.x()
            com.google.android.gms.measurement.internal.D2 r11 = r11.f40725n
            long r4 = r12.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r11.b(r0)
        L51:
            r11 = r1
            goto L63
        L53:
            if (r12 != 0) goto L63
            com.google.android.gms.measurement.internal.X2 r11 = r9.f40611a
            com.google.android.gms.measurement.internal.E2 r11 = r11.x()
            com.google.android.gms.measurement.internal.D2 r11 = r11.f40725n
            java.lang.String r0 = "unset"
            r11.b(r0)
            goto L51
        L63:
            com.google.android.gms.measurement.internal.X2 r0 = r9.f40611a
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()
            com.google.android.gms.measurement.internal.o2 r0 = r0.w()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.c(r1, r2, r12)
        L74:
            r4 = r11
            r7 = r12
            com.google.android.gms.measurement.internal.X2 r11 = r9.f40611a
            boolean r12 = r11.g()
            if (r12 != 0) goto L8e
            com.google.android.gms.measurement.internal.X2 r10 = r9.f40611a
            com.google.android.gms.measurement.internal.q2 r10 = r10.a()
            com.google.android.gms.measurement.internal.o2 r10 = r10.w()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L8e:
            boolean r11 = r11.m()
            if (r11 != 0) goto L95
            return
        L95:
            com.google.android.gms.measurement.internal.X2 r11 = r9.f40611a
            com.google.android.gms.measurement.internal.v6 r3 = new com.google.android.gms.measurement.internal.v6
            r8 = r10
            r5 = r13
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.w5 r10 = r11.J()
            r10.o(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3937x4.B(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final Map C(String str, String str2, boolean z10) {
        X2 x22 = this.f40611a;
        if (x22.b().p()) {
            x22.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        x22.c();
        if (C3802f.a()) {
            x22.a().o().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f40611a.b().u(atomicReference, HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, "get user properties", new Z3(this, atomicReference, null, str, str2, z10));
        List<v6> list = (List) atomicReference.get();
        if (list == null) {
            x22.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        C6551a c6551a = new C6551a(list.size());
        for (v6 v6Var : list) {
            Object objC = v6Var.c();
            if (objC != null) {
                c6551a.put(v6Var.f41669b, objC);
            }
        }
        return c6551a;
    }

    public final String D() {
        return (String) this.f41753g.get();
    }

    final void E(String str) {
        this.f41753g.set(str);
    }

    public final void F() {
        h();
        X2 x22 = this.f40611a;
        if (x22.x().f40732u.a()) {
            x22.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = x22.x().f40733v.a();
        x22.x().f40733v.b(1 + jA);
        x22.w();
        if (jA >= 5) {
            x22.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            x22.x().f40732u.b(true);
        } else {
            if (this.f41766t == null) {
                this.f41766t = new U3(this, this.f40611a);
            }
            this.f41766t.b(0L);
        }
    }

    public final void G(long j10) {
        this.f41753g.set(null);
        this.f40611a.b().t(new V3(this, j10));
    }

    public final void H() {
        h();
        j();
        if (this.f40611a.m()) {
            X2 x22 = this.f40611a;
            C3856m c3856mW = x22.w();
            c3856mW.f40611a.c();
            Boolean boolJ = c3856mW.J("google_analytics_deferred_deep_link_enabled");
            if (boolJ != null && boolJ.booleanValue()) {
                x22.a().v().a("Deferred Deep Link feature enabled.");
                x22.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.v4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f41666a.F();
                    }
                });
            }
            this.f40611a.J().s();
            this.f41765s = false;
            E2 e2X = x22.x();
            e2X.h();
            String string = e2X.p().getString("previous_os_version", null);
            e2X.f40611a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = e2X.p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            x22.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void I(j9.z zVar) {
        j9.z zVar2;
        h();
        j();
        if (zVar != null && zVar != (zVar2 = this.f41750d)) {
            AbstractC2115p.p(zVar2 == null, "EventInterceptor already set.");
        }
        this.f41750d = zVar;
    }

    public final void J(InterfaceC5343A interfaceC5343A) {
        j();
        AbstractC2115p.l(interfaceC5343A);
        if (this.f41751e.add(interfaceC5343A)) {
            return;
        }
        this.f40611a.a().r().a("OnEventListener already registered");
    }

    public final void K(InterfaceC5343A interfaceC5343A) {
        j();
        AbstractC2115p.l(interfaceC5343A);
        if (this.f41751e.remove(interfaceC5343A)) {
            return;
        }
        this.f40611a.a().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        AbstractC2115p.f(str);
        this.f40611a.w();
        return 25;
    }

    public final void M(Bundle bundle) {
        N(bundle, this.f40611a.e().a());
    }

    public final void N(Bundle bundle, long j10) {
        AbstractC2115p.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f40611a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC2115p.l(bundle2);
        j9.t.b(bundle2, "app_id", String.class, null);
        j9.t.b(bundle2, "origin", String.class, null);
        j9.t.b(bundle2, "name", String.class, null);
        j9.t.b(bundle2, "value", Object.class, null);
        j9.t.b(bundle2, "trigger_event_name", String.class, null);
        j9.t.b(bundle2, "trigger_timeout", Long.class, 0L);
        j9.t.b(bundle2, "timed_out_event_name", String.class, null);
        j9.t.b(bundle2, "timed_out_event_params", Bundle.class, null);
        j9.t.b(bundle2, "triggered_event_name", String.class, null);
        j9.t.b(bundle2, "triggered_event_params", Bundle.class, null);
        j9.t.b(bundle2, "time_to_live", Long.class, 0L);
        j9.t.b(bundle2, "expired_event_name", String.class, null);
        j9.t.b(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC2115p.f(bundle2.getString("name"));
        AbstractC2115p.f(bundle2.getString("origin"));
        AbstractC2115p.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        X2 x22 = this.f40611a;
        if (x22.C().y0(string) != 0) {
            x22.a().o().b("Invalid conditional user property name", x22.D().c(string));
            return;
        }
        if (x22.C().y(string, obj) != 0) {
            x22.a().o().c("Invalid conditional user property value", x22.D().c(string), obj);
            return;
        }
        Object objZ = x22.C().z(string, obj);
        if (objZ == null) {
            x22.a().o().c("Unable to normalize conditional user property value", x22.D().c(string), obj);
            return;
        }
        j9.t.a(bundle2, objZ);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            x22.w();
            if (j11 > 15552000000L || j11 < 1) {
                x22.a().o().c("Invalid conditional user property timeout", x22.D().c(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        x22.w();
        if (j12 > 15552000000L || j12 < 1) {
            x22.a().o().c("Invalid conditional user property time to live", x22.D().c(string), Long.valueOf(j12));
        } else {
            x22.b().t(new W3(this, bundle2));
        }
    }

    public final void O(String str, String str2, Bundle bundle) {
        X2 x22 = this.f40611a;
        long jA = x22.e().a();
        AbstractC2115p.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        x22.b().t(new X3(this, bundle2));
    }

    public final ArrayList P(String str, String str2) {
        X2 x22 = this.f40611a;
        if (x22.b().p()) {
            x22.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        x22.c();
        if (C3802f.a()) {
            x22.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f40611a.b().u(atomicReference, HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, "get conditional user properties", new Y3(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return z6.h0(list);
        }
        x22.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String Q() {
        E4 e4U = this.f40611a.I().u();
        if (e4U != null) {
            return e4U.f40741a;
        }
        return null;
    }

    public final String R() {
        E4 e4U = this.f40611a.I().u();
        if (e4U != null) {
            return e4U.f40742b;
        }
        return null;
    }

    public final String S() {
        try {
            return j9.H.a(this.f40611a.d(), "google_app_id", this.f40611a.H());
        } catch (IllegalStateException e10) {
            this.f40611a.a().o().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    final /* synthetic */ void T(SharedPreferences sharedPreferences, String str) {
        X2 x22 = this.f40611a;
        if (!x22.w().H(null, AbstractC3789d2.f41195a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                x22.a().w().a("IABTCF_TCString change picked up in listener.");
                ((AbstractC3932x) AbstractC2115p.l(this.f41768v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            x22.a().w().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC3932x) AbstractC2115p.l(this.f41768v)).b(500L);
        }
    }

    final /* synthetic */ void U(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            X2 x22 = this.f40611a;
            bundle2 = new Bundle(x22.x().f40737z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (x22.C().B0(obj)) {
                        x22.C().B(this.f41769w, null, 27, null, null, 0);
                    }
                    x22.a().t().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (z6.N(next)) {
                    x22.a().t().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (x22.C().C0("param", next, x22.w().x(null, false), obj)) {
                    x22.C().A(bundle2, next, obj);
                }
            }
            x22.C();
            int iV = x22.w().v();
            if (bundle2.size() > iV) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > iV) {
                        bundle2.remove(str);
                    }
                }
                x22.C().B(this.f41769w, null, 26, null, null, 0);
                x22.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        X2 x23 = this.f40611a;
        x23.x().f40737z.b(bundle2);
        if (!bundle.isEmpty() || x23.w().H(null, AbstractC3789d2.f41188X0)) {
            this.f40611a.J().v(bundle2);
        }
    }

    final /* synthetic */ void V(int i10) {
        if (this.f41757k == null) {
            this.f41757k = new L3(this, this.f40611a);
        }
        this.f41757k.b(((long) i10) * 1000);
    }

    final /* synthetic */ void W(Boolean bool, boolean z10) {
        f0(bool, true);
    }

    final /* synthetic */ void X(E3 e32, long j10, boolean z10, boolean z11) {
        h();
        j();
        X2 x22 = this.f40611a;
        E3 e3W = x22.x().w();
        if (j10 <= this.f41763q && E3.u(e3W.b(), e32.b())) {
            x22.a().u().b("Dropped out-of-date consent setting, proposed settings", e32);
            return;
        }
        E2 e2X = x22.x();
        X2 x23 = e2X.f40611a;
        e2X.h();
        int iB = e32.b();
        if (!e2X.v(iB)) {
            x22.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(e32.b()));
            return;
        }
        X2 x24 = this.f40611a;
        SharedPreferences.Editor editorEdit = e2X.p().edit();
        editorEdit.putString("consent_settings", e32.l());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        x22.a().w().b("Setting storage consent(FE)", e32);
        this.f41763q = j10;
        if (x24.J().D()) {
            x24.J().Z(z10);
        } else {
            x24.J().Y(z10);
        }
        if (z11) {
            x24.J().q(new AtomicReference());
        }
    }

    final /* synthetic */ void Z(boolean z10) {
        this.f41755i = false;
    }

    final /* synthetic */ int a0() {
        return this.f41756j;
    }

    final /* synthetic */ void b0(int i10) {
        this.f41756j = i10;
    }

    final /* synthetic */ AbstractC3932x c0() {
        return this.f41766t;
    }

    final /* synthetic */ int d0(Throwable th2) {
        String message = th2.getMessage();
        this.f41760n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f41760n = true;
        return 1;
    }

    public final void h0() {
        X2 x22 = this.f40611a;
        if (!(x22.d().getApplicationContext() instanceof Application) || this.f41749c == null) {
            return;
        }
        ((Application) x22.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f41749c);
    }

    public final Boolean i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f40611a.b().u(atomicReference, 15000L, "boolean test flag value", new T3(this, atomicReference));
    }

    public final String j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f40611a.b().u(atomicReference, 15000L, "String test flag value", new RunnableC3783c4(this, atomicReference));
    }

    public final Long k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f40611a.b().u(atomicReference, 15000L, "long test flag value", new RunnableC3791d4(this, atomicReference));
    }

    public final Integer l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f40611a.b().u(atomicReference, 15000L, "int test flag value", new RunnableC3799e4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3805f2
    protected final boolean m() {
        return false;
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f40611a.b().u(atomicReference, 15000L, "double test flag value", new RunnableC3807f4(this, atomicReference));
    }

    public final void n0(Boolean bool) {
        j();
        this.f40611a.b().t(new RunnableC3815g4(this, bool));
    }

    final void o(E3 e32) {
        h();
        boolean z10 = (e32.o(j9.v.ANALYTICS_STORAGE) && e32.o(j9.v.AD_STORAGE)) || this.f40611a.J().C();
        X2 x22 = this.f40611a;
        if (z10 != x22.j()) {
            x22.i(z10);
            E2 e2X = this.f40611a.x();
            X2 x23 = e2X.f40611a;
            e2X.h();
            Boolean boolValueOf = e2X.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(e2X.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                f0(Boolean.valueOf(z10), false);
            }
        }
    }

    final void o0(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        j();
        E3 e32 = E3.f40738c;
        j9.v[] vVarArrB = D3.STORAGE.b();
        int length = vVarArrB.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = vVarArrB[i11].f51715a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            X2 x22 = this.f40611a;
            x22.a().t().b("Ignoring invalid consent setting", obj);
            x22.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zP = this.f40611a.b().p();
        E3 e3E = E3.e(bundle, i10);
        if (e3E.c()) {
            q0(e3E, zP);
        }
        C3939y c3939yH = C3939y.h(bundle, i10);
        if (c3939yH.d()) {
            p0(c3939yH, zP);
        }
        Boolean boolI = C3939y.i(bundle);
        if (boolI != null) {
            String str2 = i10 == -30 ? "tcf" : "app";
            if (zP) {
                B(str2, "allow_personalized_ads", boolI.toString(), j10);
            } else {
                z(str2, "allow_personalized_ads", boolI.toString(), false, j10);
            }
        }
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f40611a.e().a());
    }

    final void p0(C3939y c3939y, boolean z10) {
        RunnableC3823h4 runnableC3823h4 = new RunnableC3823h4(this, c3939y);
        if (!z10) {
            this.f40611a.b().t(runnableC3823h4);
        } else {
            h();
            runnableC3823h4.run();
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f40611a.I().s(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f41750d != null && !z6.N(str2)) {
            z12 = false;
        }
        boolean z13 = z12;
        if (str == null) {
            str = "app";
        }
        x(str, str2, j10, bundle2, z11, z13, z10, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:121:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void q0(com.google.android.gms.measurement.internal.E3 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3937x4.q0(com.google.android.gms.measurement.internal.E3, boolean):void");
    }

    public final void r() {
        X2 x22;
        O5 o52;
        O5 o53;
        EnumC3575s4 enumC3575s4;
        h();
        X2 x23 = this.f40611a;
        x23.a().v().a("Handle tcf update.");
        SharedPreferences sharedPreferencesQ = x23.x().q();
        HashMap map = new HashMap();
        C3781c2 c3781c2 = AbstractC3789d2.f41195a1;
        if (((Boolean) c3781c2.b(null)).booleanValue()) {
            AbstractC2011u abstractC2011u = Q5.f40927a;
            EnumC3566r4 enumC3566r4 = EnumC3566r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            P5 p52 = P5.CONSENT;
            Map.Entry entryA = j9.D.a(enumC3566r4, p52);
            int i10 = 2;
            EnumC3566r4 enumC3566r42 = EnumC3566r4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i11 = 1;
            P5 p53 = P5.FLEXIBLE_LEGITIMATE_INTEREST;
            x22 = x23;
            AbstractC2012v abstractC2012vO = AbstractC2012v.o(entryA, j9.D.a(enumC3566r42, p53), j9.D.a(EnumC3566r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, p52), j9.D.a(EnumC3566r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, p52), j9.D.a(EnumC3566r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, p53), j9.D.a(EnumC3566r4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, p53), j9.D.a(EnumC3566r4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, p53));
            AbstractC2013w abstractC2013wA = AbstractC2013w.A("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesQ.contains("IABTCF_TCString");
            int iB = Q5.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            int iB2 = Q5.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            int iB3 = Q5.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            int iB4 = Q5.b(sharedPreferencesQ, "IABTCF_PurposeOneTreatment");
            int iB5 = Q5.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            String strA = Q5.a(sharedPreferencesQ, "IABTCF_PublisherCC");
            AbstractC2012v.a aVarA = AbstractC2012v.a();
            P9.X it = abstractC2012vO.keySet().iterator();
            while (it.hasNext()) {
                EnumC3566r4 enumC3566r43 = (EnumC3566r4) it.next();
                int iZza = enumC3566r43.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iZza);
                String strA2 = Q5.a(sharedPreferencesQ, sb2.toString());
                if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                    enumC3575s4 = EnumC3575s4.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    enumC3575s4 = (iDigit < 0 || iDigit > EnumC3575s4.values().length || iDigit == 0) ? EnumC3575s4.PURPOSE_RESTRICTION_NOT_ALLOWED : iDigit != i11 ? iDigit != i10 ? EnumC3575s4.PURPOSE_RESTRICTION_UNDEFINED : EnumC3575s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : EnumC3575s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                aVarA.f(enumC3566r43, enumC3575s4);
                i10 = 2;
                i11 = 1;
            }
            AbstractC2012v abstractC2012vC = aVarA.c();
            String strA3 = Q5.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            String strA4 = Q5.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = Q5.a(sharedPreferencesQ, "IABTCF_PurposeLegitimateInterests");
            String strA6 = Q5.a(sharedPreferencesQ, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            o52 = new O5(Q5.d(abstractC2012vO, abstractC2012vC, abstractC2013wA, cArr, iB, iB5, iB3, iB2, iB4, strA, strA3, strA5, z10, z11, zContains));
        } else {
            x22 = x23;
            String strA7 = Q5.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            if (!"".equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            int iB6 = Q5.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            if (iB6 != -1) {
                map.put("gdprApplies", String.valueOf(iB6));
            }
            int iB7 = Q5.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            if (iB7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iB7));
            }
            int iB8 = Q5.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            if (iB8 != -1) {
                map.put("PolicyVersion", String.valueOf(iB8));
            }
            String strA8 = Q5.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            if (!"".equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            int iB9 = Q5.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            if (iB9 != -1) {
                map.put("CmpSdkID", String.valueOf(iB9));
            }
            o52 = new O5(map);
        }
        x22.a().w().b("Tcf preferences read", o52);
        if (!x22.w().H(null, c3781c2)) {
            if (x22.x().x(o52)) {
                Bundle bundleB = o52.b();
                x22.a().w().b("Consent generated from Tcf", bundleB);
                if (bundleB != Bundle.EMPTY) {
                    o0(bundleB, -30, x22.e().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", o52.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        E2 e2X = x22.x();
        e2X.h();
        String string = e2X.p().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            o53 = new O5(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f34695b);
                if (strArrSplit.length >= 2 && Q5.f40927a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            o53 = new O5(map2);
        }
        if (x22.x().x(o52)) {
            Bundle bundleB2 = o52.b();
            x22.a().w().b("Consent generated from Tcf", bundleB2);
            if (bundleB2 != Bundle.EMPTY) {
                o0(bundleB2, -30, x22.e().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", o52.d(o53));
            bundle2.putString("_tcfd2", o52.c());
            bundle2.putString("_tcfd", o52.e());
            t("auto", "_tcf", bundle2);
        }
    }

    final void r0(Runnable runnable) {
        j();
        X2 x22 = this.f40611a;
        if (x22.b().p()) {
            x22.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (x22.b().q()) {
            x22.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        x22.c();
        if (C3802f.a()) {
            x22.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        x22.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            x22.a().w().a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            x22.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.w4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f41727a.f40611a.J().j0(atomicReference, j9.J.c(j9.G.SGTM_CLIENT));
                }
            });
            Z5 z52 = (Z5) atomicReference.get();
            if (z52 == null) {
                break;
            }
            List list = z52.f41084a;
            if (!list.isEmpty()) {
                x22.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    j9.F fE0 = e0((X5) it.next());
                    if (fE0 == j9.F.SUCCESS) {
                        i10++;
                    } else if (fE0 == j9.F.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        x22.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        runnable.run();
    }

    public final void s() {
        h();
        X2 x22 = this.f40611a;
        x22.a().v().a("Register tcfPrefChangeListener.");
        if (this.f41767u == null) {
            this.f41768v = new Q3(this, this.f40611a);
            this.f41767u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.s4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f41587a.T(sharedPreferences, str);
                }
            };
        }
        x22.x().q().registerOnSharedPreferenceChangeListener(this.f41767u);
    }

    final void s0(long j10) {
        h();
        if (this.f41758l == null) {
            this.f41758l = new I3(this, this.f40611a);
        }
        this.f41758l.b(j10);
    }

    final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f40611a.e().a(), bundle);
    }

    final void t0() {
        h();
        AbstractC3932x abstractC3932x = this.f41758l;
        if (abstractC3932x != null) {
            abstractC3932x.d();
        }
    }

    final void u(String str, String str2, long j10, Bundle bundle) {
        h();
        boolean z10 = true;
        if (this.f41750d != null && !z6.N(str2)) {
            z10 = false;
        }
        v(str, str2, j10, bundle, true, z10, true, null);
    }

    final void u0() {
        C3498j7.a();
        X2 x22 = this.f40611a;
        if (x22.w().H(null, AbstractC3789d2.f41176R0)) {
            if (x22.b().p()) {
                x22.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            x22.c();
            if (C3802f.a()) {
                x22.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            x22.a().w().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            x22.b().u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.o4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C3937x4 c3937x4 = this.f41479a;
                    c3937x4.f40611a.J().i0(atomicReference, c3937x4.f40611a.x().f40726o.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                x22.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                x22.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.p4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C3937x4 c3937x4 = this.f41494a;
                        c3937x4.h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<S5> list2 = list;
                        SparseArray sparseArrayR = c3937x4.f40611a.x().r();
                        for (S5 s52 : list2) {
                            int i10 = s52.f40964c;
                            if (!sparseArrayR.contains(i10) || ((Long) sparseArrayR.get(i10)).longValue() < s52.f40963b) {
                                c3937x4.w0().add(s52);
                            }
                        }
                        c3937x4.x0();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        int i10;
        X2 x22;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        AbstractC2115p.f(str5);
        AbstractC2115p.l(bundle);
        h();
        j();
        X2 x23 = this.f40611a;
        if (!x23.g()) {
            this.f40611a.a().v().a("Event not sent since app measurement is disabled");
            return;
        }
        List listW = this.f40611a.L().w();
        if (listW != null && !listW.contains(str2)) {
            this.f40611a.a().v().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f41752f) {
            this.f41752f = true;
            try {
                try {
                    (!x23.G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f40611a.d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f40611a.d());
                } catch (Exception e10) {
                    this.f40611a.a().r().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f40611a.a().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        X2 x24 = this.f40611a;
        if (!x24.w().H(null, AbstractC3789d2.f41213g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            x24.c();
            B("auto", "_lgclid", bundle.getString("gclid"), x24.e().a());
        }
        C3937x4 c3937x4 = this;
        x24.c();
        if (z10 && z6.U(str2)) {
            x24.C().w(bundle, x24.x().f40737z.a());
        }
        if (!z12) {
            x24.c();
            if (!"_iap".equals(str2)) {
                X2 x25 = c3937x4.f40611a;
                z6 z6VarC = x25.C();
                int i11 = 2;
                if (z6VarC.t0("event", str2)) {
                    if (z6VarC.v0("event", j9.w.f51716a, j9.w.f51717b, str2)) {
                        z6VarC.f40611a.w();
                        if (z6VarC.w0("event", 40, str2)) {
                            i11 = 0;
                        }
                    } else {
                        i11 = 13;
                    }
                }
                if (i11 != 0) {
                    x24.a().q().b("Invalid public event name. Event will not be logged (FE)", x24.D().a(str2));
                    z6 z6VarC2 = x25.C();
                    x25.w();
                    x25.C().B(c3937x4.f41769w, null, i11, "_ev", z6VarC2.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        x24.c();
        X2 x26 = c3937x4.f40611a;
        E4 e4Q = x26.I().q(false);
        if (e4Q != null && !bundle.containsKey("_sc")) {
            e4Q.f40744d = true;
        }
        z6.k0(e4Q, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str5);
        boolean zN = z6.N(str2);
        if (!z10 || c3937x4.f41750d == null || zN) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                x24.a().v().c("Passing event to registered event handler (FE)", x24.D().a(str2), x24.D().e(bundle));
                AbstractC2115p.l(c3937x4.f41750d);
                c3937x4.f41750d.a(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        X2 x27 = c3937x4.f40611a;
        if (x27.m()) {
            int iX0 = x24.C().x0(str2);
            if (iX0 != 0) {
                x24.a().q().b("Invalid event name. Event will not be logged (FE)", x24.D().a(str2));
                z6 z6VarC3 = x24.C();
                x24.w();
                x27.C().B(c3937x4.f41769w, str3, iX0, "_ev", z6VarC3.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleT = x24.C().t(str3, str2, bundle, com.google.android.gms.common.util.e.b("_o", "_sn", "_sc", "_si"), z12);
            AbstractC2115p.l(bundleT);
            x24.c();
            if (x26.I().q(false) == null || !"_ae".equals(str2)) {
                i10 = 0;
                x22 = x26;
                j11 = 0;
            } else {
                L5 l52 = x26.z().f40880f;
                j11 = 0;
                long jC = l52.f40848d.f40611a.e().c();
                i10 = 0;
                x22 = x26;
                long j14 = jC - l52.f40846b;
                l52.f40846b = jC;
                if (j14 > 0) {
                    x24.C().Z(bundleT, j14);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                z6 z6VarC4 = x24.C();
                String string = bundleT.getString("_ffr");
                if (com.google.android.gms.common.util.p.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                X2 x28 = z6VarC4.f40611a;
                if (Objects.equals(string, x28.x().f40734w.a())) {
                    x28.a().v().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                x28.x().f40734w.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = x24.C().f40611a.x().f40734w.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleT.putString("_ffr", strA);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleT);
            boolean zP = x24.w().H(null, AbstractC3789d2.f41184V0) ? x22.z().p() : x24.x().f40731t.a();
            if (x24.x().f40728q.a() > j11 && x24.x().A(j10) && zP) {
                x24.a().w().a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j12 = j11;
                B("auto", "_sid", null, x24.e().a());
                B("auto", "_sno", null, x24.e().a());
                B("auto", "_se", null, x24.e().a());
                c3937x4 = this;
                x24.x().f40729r.b(j12);
            } else {
                j12 = j11;
                str4 = "_ae";
            }
            if (bundleT.getLong("extend_session", j12) == 1) {
                x24.a().w().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                x27.z().f40879e.b(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(bundleT.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i12 = i10; i12 < size; i12++) {
                String str6 = (String) arrayList2.get(i12);
                if (str6 != null) {
                    x24.C();
                    Object obj = bundleT.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i10] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleT.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i13 = i10;
            while (i13 < arrayList.size()) {
                Bundle bundleQ = (Bundle) arrayList.get(i13);
                String str7 = i13 != 0 ? "_ep" : str2;
                bundleQ.putString("_o", str5);
                if (z11) {
                    bundleQ = x24.C().Q(bundleQ, null);
                }
                Bundle bundle2 = bundleQ;
                x22.J().c0(new G(str7, new E(bundle2), str5, j13), str3);
                if (!z13) {
                    Iterator it = c3937x4.f41751e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5343A) it.next()).a(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i13++;
                str5 = str;
                j13 = j10;
            }
            x24.c();
            if (x22.I().q(i10) == null || !str4.equals(str2)) {
                return;
            }
            x22.z().f40880f.d(true, true, x24.e().c());
        }
    }

    final boolean v0() {
        return this.f41760n;
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        X2.q();
        x("auto", str2, this.f40611a.e().a(), bundle, false, true, true, str3);
    }

    final PriorityQueue w0() {
        if (this.f41759m == null) {
            this.f41759m = new PriorityQueue(Comparator.comparing(C3889q4.f41523a, C3895r4.f41577a));
        }
        return this.f41759m;
    }

    protected final void x(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        int i10 = z6.f41820k;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.f40611a.b().t(new R3(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    final void x0() {
        S5 s52;
        h();
        this.f41760n = false;
        if (w0().isEmpty() || this.f41755i || (s52 = (S5) w0().poll()) == null) {
            return;
        }
        X2 x22 = this.f40611a;
        J3.a aVarH = x22.C().H();
        if (aVarH != null) {
            this.f41755i = true;
            C3873o2 c3873o2W = x22.a().w();
            String str = s52.f40962a;
            c3873o2W.b("Registering trigger URI", str);
            com.google.common.util.concurrent.p pVarC = aVarH.c(Uri.parse(str));
            if (pVarC != null) {
                com.google.common.util.concurrent.j.a(pVarC, new K3(this, s52), new J3(this));
            } else {
                this.f41755i = false;
                w0().add(s52);
            }
        }
    }

    public final void y(String str, String str2, Object obj, boolean z10) {
        z("auto", "_ldl", obj, true, this.f40611a.e().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = r19
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L17
            com.google.android.gms.measurement.internal.X2 r5 = r0.f40611a
            com.google.android.gms.measurement.internal.z6 r5 = r5.C()
            int r5 = r5.y0(r2)
        L15:
            r12 = r5
            goto L41
        L17:
            com.google.android.gms.measurement.internal.X2 r5 = r0.f40611a
            com.google.android.gms.measurement.internal.z6 r5 = r5.C()
            java.lang.String r6 = "user property"
            boolean r7 = r5.t0(r6, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = j9.y.f51724a
            r9 = 0
            boolean r7 = r5.v0(r6, r7, r9, r2)
            if (r7 != 0) goto L34
            r5 = 15
            goto L15
        L34:
            com.google.android.gms.measurement.internal.X2 r7 = r5.f40611a
            r7.w()
            boolean r5 = r5.w0(r6, r4, r2)
            if (r5 != 0) goto L40
            goto L26
        L40:
            r12 = r3
        L41:
            r5 = 1
            if (r12 == 0) goto L67
            com.google.android.gms.measurement.internal.X2 r1 = r0.f40611a
            com.google.android.gms.measurement.internal.z6 r6 = r1.C()
            r1.w()
            java.lang.String r14 = r6.q(r2, r4, r5)
            if (r2 == 0) goto L57
            int r3 = r2.length()
        L57:
            r15 = r3
            com.google.android.gms.measurement.internal.X2 r1 = r0.f40611a
            com.google.android.gms.measurement.internal.y6 r10 = r0.f41769w
            com.google.android.gms.measurement.internal.z6 r9 = r1.C()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.B(r10, r11, r12, r13, r14, r15)
            return
        L67:
            if (r17 != 0) goto L6c
            java.lang.String r6 = "app"
            goto L6e
        L6c:
            r6 = r17
        L6e:
            if (r1 == 0) goto Lbb
            com.google.android.gms.measurement.internal.X2 r7 = r0.f40611a
            com.google.android.gms.measurement.internal.z6 r8 = r7.C()
            int r12 = r8.y(r2, r1)
            if (r12 == 0) goto Laa
            com.google.android.gms.measurement.internal.z6 r6 = r7.C()
            r7.w()
            java.lang.String r14 = r6.q(r2, r4, r5)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 != 0) goto L92
            boolean r2 = r1 instanceof java.lang.CharSequence
            if (r2 == 0) goto L90
            goto L92
        L90:
            r15 = r3
            goto L9b
        L92:
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            goto L90
        L9b:
            com.google.android.gms.measurement.internal.X2 r1 = r0.f40611a
            com.google.android.gms.measurement.internal.y6 r10 = r0.f41769w
            com.google.android.gms.measurement.internal.z6 r9 = r1.C()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.B(r10, r11, r12, r13, r14, r15)
            return
        Laa:
            com.google.android.gms.measurement.internal.z6 r3 = r7.C()
            java.lang.Object r5 = r3.z(r2, r1)
            if (r5 == 0) goto Lba
            r3 = r21
            r1 = r6
            r0.A(r1, r2, r3, r5)
        Lba:
            return
        Lbb:
            r1 = r6
            r5 = 0
            r0 = r16
            r2 = r18
            r3 = r21
            r0.A(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3937x4.z(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }
}
