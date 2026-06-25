package w;

import oe.AbstractC5874j;

/* JADX INFO: renamed from: w.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6920y implements InterfaceC6894d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f62736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0 f62737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f62738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC6913q f62739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC6913q f62740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC6913q f62741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f62742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f62743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f62744i;

    public C6920y(x0 x0Var, s0 s0Var, Object obj, AbstractC6913q abstractC6913q) {
        this.f62736a = x0Var;
        this.f62737b = s0Var;
        this.f62738c = obj;
        AbstractC6913q abstractC6913q2 = (AbstractC6913q) e().a().invoke(obj);
        this.f62739d = abstractC6913q2;
        this.f62740e = r.e(abstractC6913q);
        this.f62742g = e().b().invoke(x0Var.b(abstractC6913q2, abstractC6913q));
        this.f62743h = x0Var.c(abstractC6913q2, abstractC6913q);
        AbstractC6913q abstractC6913qE = r.e(x0Var.e(d(), abstractC6913q2, abstractC6913q));
        this.f62741f = abstractC6913qE;
        int iB = abstractC6913qE.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC6913q abstractC6913q3 = this.f62741f;
            abstractC6913q3.e(i10, AbstractC5874j.l(abstractC6913q3.a(i10), -this.f62736a.a(), this.f62736a.a()));
        }
    }

    @Override // w.InterfaceC6894d
    public boolean a() {
        return this.f62744i;
    }

    @Override // w.InterfaceC6894d
    public AbstractC6913q b(long j10) {
        return !c(j10) ? this.f62736a.e(j10, this.f62739d, this.f62740e) : this.f62741f;
    }

    @Override // w.InterfaceC6894d
    public long d() {
        return this.f62743h;
    }

    @Override // w.InterfaceC6894d
    public s0 e() {
        return this.f62737b;
    }

    @Override // w.InterfaceC6894d
    public Object f(long j10) {
        return !c(j10) ? e().b().invoke(this.f62736a.d(j10, this.f62739d, this.f62740e)) : g();
    }

    @Override // w.InterfaceC6894d
    public Object g() {
        return this.f62742g;
    }

    public C6920y(InterfaceC6921z interfaceC6921z, s0 s0Var, Object obj, AbstractC6913q abstractC6913q) {
        this(interfaceC6921z.a(s0Var), s0Var, obj, abstractC6913q);
    }
}
