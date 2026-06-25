package io.sentry;

import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5261k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class S3 implements InterfaceC5207h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC5244o2 f49305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC5244o2 f49306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T3 f49307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L3 f49308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f49309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5114a0 f49310f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Z3 f49313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private V3 f49314j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49311g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f49312h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f49315k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f49316l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C5253c f49317m = new C5253c();

    S3(L3 l32, InterfaceC5114a0 interfaceC5114a0, T3 t32, Z3 z32, V3 v32) {
        this.f49307c = t32;
        t32.t(z32.a());
        this.f49308d = (L3) io.sentry.util.w.c(l32, "transaction is required");
        this.f49310f = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        this.f49313i = z32;
        this.f49314j = v32;
        AbstractC5244o2 abstractC5244o2C = z32.c();
        if (abstractC5244o2C != null) {
            this.f49305a = abstractC5244o2C;
        } else {
            this.f49305a = interfaceC5114a0.h().getDateProvider().now();
        }
    }

    private void I(AbstractC5244o2 abstractC5244o2) {
        this.f49305a = abstractC5244o2;
    }

    private List v() {
        ArrayList arrayList = new ArrayList();
        for (S3 s32 : this.f49308d.N()) {
            if (s32.z() != null && s32.z().equals(C())) {
                arrayList.add(s32);
            }
        }
        return arrayList;
    }

    public h4 A() {
        return this.f49307c.l();
    }

    V3 B() {
        return this.f49314j;
    }

    public Y3 C() {
        return this.f49307c.m();
    }

    public Map D() {
        return this.f49307c.o();
    }

    public io.sentry.protocol.x E() {
        return this.f49307c.p();
    }

    public Boolean F() {
        return this.f49307c.i();
    }

    void G(V3 v32) {
        this.f49314j = v32;
    }

    public boolean H(AbstractC5244o2 abstractC5244o2) {
        if (this.f49306b == null) {
            return false;
        }
        this.f49306b = abstractC5244o2;
        return true;
    }

    @Override // io.sentry.InterfaceC5207h0
    public a4 b() {
        return this.f49307c.n();
    }

    @Override // io.sentry.InterfaceC5207h0
    public Boolean c() {
        return this.f49307c.k();
    }

    @Override // io.sentry.InterfaceC5207h0
    public void d() {
        j(this.f49307c.n());
    }

    @Override // io.sentry.InterfaceC5207h0
    public void e(String str) {
        this.f49307c.r(str);
    }

    @Override // io.sentry.InterfaceC5207h0
    public void g(String str, Number number) {
        if (isFinished()) {
            this.f49310f.h().getLogger().c(EnumC5215i3.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f49316l.put(str, new C5261k(number, null));
        if (this.f49308d.L() != this) {
            this.f49308d.V(str, number);
        }
    }

    @Override // io.sentry.InterfaceC5207h0
    public String getDescription() {
        return this.f49307c.c();
    }

    @Override // io.sentry.InterfaceC5207h0
    public void i(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f49315k.remove(str);
        } else {
            this.f49315k.put(str, obj);
        }
    }

    @Override // io.sentry.InterfaceC5207h0
    public boolean isFinished() {
        return this.f49311g;
    }

    @Override // io.sentry.InterfaceC5207h0
    public void j(a4 a4Var) {
        s(a4Var, this.f49310f.h().getDateProvider().now());
    }

    @Override // io.sentry.InterfaceC5207h0
    public InterfaceC5207h0 k(String str, String str2, AbstractC5244o2 abstractC5244o2, EnumC5242o0 enumC5242o0) {
        return o(str, str2, abstractC5244o2, enumC5242o0, new Z3());
    }

    @Override // io.sentry.InterfaceC5207h0
    public void l(String str, Number number, F0 f02) {
        if (isFinished()) {
            this.f49310f.h().getLogger().c(EnumC5215i3.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f49316l.put(str, new C5261k(number, f02.apiName()));
        if (this.f49308d.L() != this) {
            this.f49308d.W(str, number, f02);
        }
    }

    @Override // io.sentry.InterfaceC5207h0
    public InterfaceC5207h0 o(String str, String str2, AbstractC5244o2 abstractC5244o2, EnumC5242o0 enumC5242o0, Z3 z32) {
        return this.f49311g ? C5188d1.u() : this.f49308d.X(this.f49307c.m(), str, str2, abstractC5244o2, enumC5242o0, z32);
    }

    @Override // io.sentry.InterfaceC5207h0
    public T3 q() {
        return this.f49307c;
    }

    @Override // io.sentry.InterfaceC5207h0
    public AbstractC5244o2 r() {
        return this.f49306b;
    }

    @Override // io.sentry.InterfaceC5207h0
    public void s(a4 a4Var, AbstractC5244o2 abstractC5244o2) {
        AbstractC5244o2 abstractC5244o22;
        if (this.f49311g || !this.f49312h.compareAndSet(false, true)) {
            return;
        }
        this.f49307c.v(a4Var);
        if (abstractC5244o2 == null) {
            abstractC5244o2 = this.f49310f.h().getDateProvider().now();
        }
        this.f49306b = abstractC5244o2;
        if (this.f49313i.f() || this.f49313i.e()) {
            AbstractC5244o2 abstractC5244o2T = null;
            AbstractC5244o2 abstractC5244o2R = null;
            for (S3 s32 : this.f49308d.L().C().equals(C()) ? this.f49308d.H() : v()) {
                if (abstractC5244o2T == null || s32.t().h(abstractC5244o2T)) {
                    abstractC5244o2T = s32.t();
                }
                if (abstractC5244o2R == null || (s32.r() != null && s32.r().c(abstractC5244o2R))) {
                    abstractC5244o2R = s32.r();
                }
            }
            if (this.f49313i.f() && abstractC5244o2T != null && this.f49305a.h(abstractC5244o2T)) {
                I(abstractC5244o2T);
            }
            if (this.f49313i.e() && abstractC5244o2R != null && ((abstractC5244o22 = this.f49306b) == null || abstractC5244o22.c(abstractC5244o2R))) {
                H(abstractC5244o2R);
            }
        }
        Throwable th2 = this.f49309e;
        if (th2 != null) {
            this.f49310f.g(th2, this, this.f49308d.getName());
        }
        V3 v32 = this.f49314j;
        if (v32 != null) {
            v32.a(this);
        }
        this.f49311g = true;
    }

    @Override // io.sentry.InterfaceC5207h0
    public AbstractC5244o2 t() {
        return this.f49305a;
    }

    public Map u() {
        return this.f49315k;
    }

    public Map w() {
        return this.f49316l;
    }

    public String x() {
        return this.f49307c.f();
    }

    Z3 y() {
        return this.f49313i;
    }

    public Y3 z() {
        return this.f49307c.h();
    }

    public S3(i4 i4Var, L3 l32, InterfaceC5114a0 interfaceC5114a0, Z3 z32) {
        T3 t32 = (T3) io.sentry.util.w.c(i4Var, "context is required");
        this.f49307c = t32;
        t32.t(z32.a());
        this.f49308d = (L3) io.sentry.util.w.c(l32, "sentryTracer is required");
        this.f49310f = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "scopes are required");
        this.f49314j = null;
        AbstractC5244o2 abstractC5244o2C = z32.c();
        if (abstractC5244o2C != null) {
            this.f49305a = abstractC5244o2C;
        } else {
            this.f49305a = interfaceC5114a0.h().getDateProvider().now();
        }
        this.f49313i = z32;
    }
}
