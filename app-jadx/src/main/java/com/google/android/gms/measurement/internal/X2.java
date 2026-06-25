package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.AbstractC3540o4;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class X2 implements C3 {

    /* JADX INFO: renamed from: E */
    private static volatile X2 f41014E;

    /* JADX INFO: renamed from: A */
    private int f41015A;

    /* JADX INFO: renamed from: B */
    private int f41016B;

    /* JADX INFO: renamed from: D */
    final long f41018D;

    /* JADX INFO: renamed from: a */
    private final Context f41019a;

    /* JADX INFO: renamed from: b */
    private final boolean f41020b;

    /* JADX INFO: renamed from: c */
    private final C3802f f41021c;

    /* JADX INFO: renamed from: d */
    private final C3856m f41022d;

    /* JADX INFO: renamed from: e */
    private final E2 f41023e;

    /* JADX INFO: renamed from: f */
    private final C3887q2 f41024f;

    /* JADX INFO: renamed from: g */
    private final T2 f41025g;

    /* JADX INFO: renamed from: h */
    private final N5 f41026h;

    /* JADX INFO: renamed from: i */
    private final z6 f41027i;

    /* JADX INFO: renamed from: j */
    private final C3837j2 f41028j;

    /* JADX INFO: renamed from: k */
    private final com.google.android.gms.common.util.d f41029k;

    /* JADX INFO: renamed from: l */
    private final M4 f41030l;

    /* JADX INFO: renamed from: m */
    private final C3937x4 f41031m;

    /* JADX INFO: renamed from: n */
    private final C0 f41032n;

    /* JADX INFO: renamed from: o */
    private final B4 f41033o;

    /* JADX INFO: renamed from: p */
    private final String f41034p;

    /* JADX INFO: renamed from: q */
    private C3829i2 f41035q;

    /* JADX INFO: renamed from: r */
    private C3931w5 f41036r;

    /* JADX INFO: renamed from: s */
    private A f41037s;

    /* JADX INFO: renamed from: t */
    private C3813g2 f41038t;

    /* JADX INFO: renamed from: u */
    private D4 f41039u;

    /* JADX INFO: renamed from: w */
    private Boolean f41041w;

    /* JADX INFO: renamed from: x */
    private long f41042x;

    /* JADX INFO: renamed from: y */
    private volatile Boolean f41043y;

    /* JADX INFO: renamed from: z */
    private volatile boolean f41044z;

    /* JADX INFO: renamed from: v */
    private boolean f41040v = false;

    /* JADX INFO: renamed from: C */
    private final AtomicInteger f41017C = new AtomicInteger(0);

    X2(G3 g32) {
        AbstractC2115p.l(g32);
        Context context = g32.f40772a;
        C3802f c3802f = new C3802f(context);
        this.f41021c = c3802f;
        W1.f41005a = c3802f;
        this.f41019a = context;
        this.f41020b = g32.f40776e;
        this.f41043y = g32.f40773b;
        this.f41034p = g32.f40778g;
        this.f41044z = true;
        AbstractC3540o4.b(context);
        com.google.android.gms.common.util.d dVarD = com.google.android.gms.common.util.g.d();
        this.f41029k = dVarD;
        Long l10 = g32.f40777f;
        this.f41018D = l10 != null ? l10.longValue() : dVarD.a();
        this.f41022d = new C3856m(this);
        E2 e22 = new E2(this);
        e22.m();
        this.f41023e = e22;
        C3887q2 c3887q2 = new C3887q2(this);
        c3887q2.m();
        this.f41024f = c3887q2;
        z6 z6Var = new z6(this);
        z6Var.m();
        this.f41027i = z6Var;
        this.f41028j = new C3837j2(new F3(g32, this));
        this.f41032n = new C0(this);
        M4 m42 = new M4(this);
        m42.k();
        this.f41030l = m42;
        C3937x4 c3937x4 = new C3937x4(this);
        c3937x4.k();
        this.f41031m = c3937x4;
        N5 n52 = new N5(this);
        n52.k();
        this.f41026h = n52;
        B4 b42 = new B4(this);
        b42.m();
        this.f41033o = b42;
        T2 t22 = new T2(this);
        t22.m();
        this.f41025g = t22;
        com.google.android.gms.internal.measurement.H0 h02 = g32.f40775d;
        boolean z10 = h02 == null || h02.f39356b == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(c3937x4);
            if (c3937x4.f40611a.f41019a.getApplicationContext() instanceof Application) {
                Application application = (Application) c3937x4.f40611a.f41019a.getApplicationContext();
                if (c3937x4.f41749c == null) {
                    c3937x4.f41749c = new C3854l4(c3937x4);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(c3937x4.f41749c);
                    application.registerActivityLifecycleCallbacks(c3937x4.f41749c);
                    C3887q2 c3887q22 = c3937x4.f40611a.f41024f;
                    u(c3887q22);
                    c3887q22.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(c3887q2);
            c3887q2.r().a("Application context is not an Application");
        }
        t22.t(new V2(this, g32));
    }

    public static X2 O(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l10) {
        Bundle bundle;
        if (h02 != null) {
            Bundle bundle2 = h02.f39358d;
            h02 = new com.google.android.gms.internal.measurement.H0(h02.f39355a, h02.f39356b, h02.f39357c, bundle2, null);
        }
        AbstractC2115p.l(context);
        AbstractC2115p.l(context.getApplicationContext());
        if (f41014E == null) {
            synchronized (X2.class) {
                try {
                    if (f41014E == null) {
                        f41014E = new X2(new G3(context, h02, l10));
                    }
                } finally {
                }
            }
        } else if (h02 != null && (bundle = h02.f39358d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC2115p.l(f41014E);
            f41014E.f41043y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC2115p.l(f41014E);
        return f41014E;
    }

    static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void r(E1 e12) {
        if (e12 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void s(A3 a32) {
        if (a32 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void t(AbstractC3805f2 abstractC3805f2) {
        if (abstractC3805f2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC3805f2.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC3805f2.getClass())));
        }
    }

    private static final void u(B3 b32) {
        if (b32 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!b32.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b32.getClass())));
        }
    }

    final T2 A() {
        return this.f41025g;
    }

    public final C3937x4 B() {
        C3937x4 c3937x4 = this.f41031m;
        t(c3937x4);
        return c3937x4;
    }

    public final z6 C() {
        z6 z6Var = this.f41027i;
        s(z6Var);
        return z6Var;
    }

    public final C3837j2 D() {
        return this.f41028j;
    }

    public final C3829i2 E() {
        t(this.f41035q);
        return this.f41035q;
    }

    public final B4 F() {
        B4 b42 = this.f41033o;
        u(b42);
        return b42;
    }

    public final boolean G() {
        return this.f41020b;
    }

    public final String H() {
        return this.f41034p;
    }

    public final M4 I() {
        M4 m42 = this.f41030l;
        t(m42);
        return m42;
    }

    public final C3931w5 J() {
        t(this.f41036r);
        return this.f41036r;
    }

    public final A K() {
        u(this.f41037s);
        return this.f41037s;
    }

    public final C3813g2 L() {
        t(this.f41038t);
        return this.f41038t;
    }

    public final C0 M() {
        C0 c02 = this.f41032n;
        r(c02);
        return c02;
    }

    public final D4 N() {
        r(this.f41039u);
        return this.f41039u;
    }

    final void P(boolean z10) {
        this.f41043y = Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C3887q2 a() {
        C3887q2 c3887q2 = this.f41024f;
        u(c3887q2);
        return c3887q2;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final T2 b() {
        T2 t22 = this.f41025g;
        u(t22);
        return t22;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C3802f c() {
        return this.f41021c;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final Context d() {
        return this.f41019a;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final com.google.android.gms.common.util.d e() {
        return this.f41029k;
    }

    public final boolean f() {
        return this.f41043y != null && this.f41043y.booleanValue();
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        T2 t22 = this.f41025g;
        u(t22);
        t22.h();
        C3856m c3856m = this.f41022d;
        if (c3856m.L()) {
            return 1;
        }
        u(t22);
        t22.h();
        if (!this.f41044z) {
            return 8;
        }
        E2 e22 = this.f41023e;
        s(e22);
        Boolean boolT = e22.t();
        if (boolT != null) {
            return boolT.booleanValue() ? 0 : 3;
        }
        C3802f c3802f = c3856m.f40611a.f41021c;
        Boolean boolJ = c3856m.J("firebase_analytics_collection_enabled");
        return boolJ != null ? boolJ.booleanValue() ? 0 : 4 : (this.f41043y == null || this.f41043y.booleanValue()) ? 0 : 7;
    }

    public final void i(boolean z10) {
        T2 t22 = this.f41025g;
        u(t22);
        t22.h();
        this.f41044z = z10;
    }

    public final boolean j() {
        T2 t22 = this.f41025g;
        u(t22);
        t22.h();
        return this.f41044z;
    }

    final void k() {
        this.f41015A++;
    }

    final void l() {
        this.f41017C.incrementAndGet();
    }

    protected final boolean m() {
        if (!this.f41040v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        T2 t22 = this.f41025g;
        u(t22);
        t22.h();
        Boolean bool = this.f41041w;
        if (bool == null || this.f41042x == 0 || (!bool.booleanValue() && Math.abs(this.f41029k.c() - this.f41042x) > 1000)) {
            this.f41042x = this.f41029k.c();
            z6 z6Var = this.f41027i;
            s(z6Var);
            boolean z10 = false;
            if (z6Var.M("android.permission.INTERNET")) {
                s(z6Var);
                if (z6Var.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f41019a;
                    if (X8.e.a(context).f() || this.f41022d.m() || (z6.j0(context) && z6.E(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f41041w = boolValueOf;
            if (boolValueOf.booleanValue()) {
                s(z6Var);
                this.f41041w = Boolean.valueOf(z6Var.o(L().r()));
            }
        }
        return this.f41041w.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.X2.n():boolean");
    }

    final /* synthetic */ void o(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        int i11;
        if (i10 != 200 && i10 != 204) {
            i11 = RCHTTPStatusCodes.NOT_MODIFIED;
            if (i10 != 304) {
                i11 = i10;
            }
            C3887q2 c3887q2 = this.f41024f;
            u(c3887q2);
            c3887q2.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        i11 = i10;
        if (th2 == null) {
            E2 e22 = this.f41023e;
            s(e22);
            e22.f40732u.b(true);
            if (bArr == null || bArr.length == 0) {
                C3887q2 c3887q22 = this.f41024f;
                u(c3887q22);
                c3887q22.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString(Constants.DEEPLINK, "");
                if (TextUtils.isEmpty(strOptString)) {
                    C3887q2 c3887q23 = this.f41024f;
                    u(c3887q23);
                    c3887q23.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble(DiagnosticsEntry.TIMESTAMP_KEY, 0.0d);
                Bundle bundle = new Bundle();
                z6 z6Var = this.f41027i;
                s(z6Var);
                X2 x22 = z6Var.f40611a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = x22.f41019a;
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.f41031m.t("auto", "_cmp", bundle);
                        s(z6Var);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString(Constants.DEEPLINK, strOptString);
                            editorEdit.putLong(DiagnosticsEntry.TIMESTAMP_KEY, Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = z6Var.f40611a.f41019a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e10) {
                            C3887q2 c3887q24 = z6Var.f40611a.f41024f;
                            u(c3887q24);
                            c3887q24.o().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                C3887q2 c3887q25 = this.f41024f;
                u(c3887q25);
                c3887q25.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e11) {
                C3887q2 c3887q26 = this.f41024f;
                u(c3887q26);
                c3887q26.o().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        C3887q2 c3887q27 = this.f41024f;
        u(c3887q27);
        c3887q27.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    final /* synthetic */ void p(G3 g32) {
        T2 t22 = this.f41025g;
        u(t22);
        t22.h();
        C3856m c3856m = this.f41022d;
        c3856m.u();
        A a10 = new A(this);
        a10.m();
        this.f41037s = a10;
        com.google.android.gms.internal.measurement.H0 h02 = g32.f40775d;
        C3813g2 c3813g2 = new C3813g2(this, g32.f40774c, h02 == null ? 0L : h02.f39355a);
        c3813g2.k();
        this.f41038t = c3813g2;
        C3829i2 c3829i2 = new C3829i2(this);
        c3829i2.k();
        this.f41035q = c3829i2;
        C3931w5 c3931w5 = new C3931w5(this);
        c3931w5.k();
        this.f41036r = c3931w5;
        z6 z6Var = this.f41027i;
        z6Var.n();
        this.f41023e.n();
        this.f41038t.l();
        D4 d42 = new D4(this);
        d42.k();
        this.f41039u = d42;
        d42.l();
        C3887q2 c3887q2 = this.f41024f;
        u(c3887q2);
        C3873o2 c3873o2U = c3887q2.u();
        c3856m.A();
        c3873o2U.b("App measurement initialized, version", 133005L);
        u(c3887q2);
        c3887q2.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strQ = c3813g2.q();
        s(z6Var);
        if (z6Var.P(strQ, c3856m.R())) {
            u(c3887q2);
            c3887q2.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(c3887q2);
            c3887q2.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strQ)));
        }
        u(c3887q2);
        c3887q2.v().a("Debug-level message logging enabled");
        int i10 = this.f41015A;
        AtomicInteger atomicInteger = this.f41017C;
        if (i10 != atomicInteger.get()) {
            u(c3887q2);
            c3887q2.o().c("Not all components initialized", Integer.valueOf(this.f41015A), Integer.valueOf(atomicInteger.get()));
        }
        this.f41040v = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void v(com.google.android.gms.internal.measurement.H0 r14) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.X2.v(com.google.android.gms.internal.measurement.H0):void");
    }

    public final C3856m w() {
        return this.f41022d;
    }

    public final E2 x() {
        E2 e22 = this.f41023e;
        s(e22);
        return e22;
    }

    public final C3887q2 y() {
        C3887q2 c3887q2 = this.f41024f;
        if (c3887q2 == null || !c3887q2.k()) {
            return null;
        }
        return c3887q2;
    }

    public final N5 z() {
        N5 n52 = this.f41026h;
        t(n52);
        return n52;
    }
}
