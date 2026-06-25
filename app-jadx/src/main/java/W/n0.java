package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements InterfaceC6894d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f62576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0 f62577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f62578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f62579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC6913q f62580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC6913q f62581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC6913q f62582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f62583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC6913q f62584i;

    public n0(v0 v0Var, s0 s0Var, Object obj, Object obj2, AbstractC6913q abstractC6913q) {
        AbstractC6913q abstractC6913qE;
        this.f62576a = v0Var;
        this.f62577b = s0Var;
        this.f62578c = obj2;
        this.f62579d = obj;
        this.f62580e = (AbstractC6913q) e().a().invoke(obj);
        this.f62581f = (AbstractC6913q) e().a().invoke(obj2);
        this.f62582g = (abstractC6913q == null || (abstractC6913qE = r.e(abstractC6913q)) == null) ? r.g((AbstractC6913q) e().a().invoke(obj)) : abstractC6913qE;
        this.f62583h = -1L;
    }

    private final AbstractC6913q h() {
        AbstractC6913q abstractC6913q = this.f62584i;
        if (abstractC6913q != null) {
            return abstractC6913q;
        }
        AbstractC6913q abstractC6913qG = this.f62576a.g(this.f62580e, this.f62581f, this.f62582g);
        this.f62584i = abstractC6913qG;
        return abstractC6913qG;
    }

    @Override // w.InterfaceC6894d
    public boolean a() {
        return this.f62576a.a();
    }

    @Override // w.InterfaceC6894d
    public AbstractC6913q b(long j10) {
        return !c(j10) ? this.f62576a.e(j10, this.f62580e, this.f62581f, this.f62582g) : h();
    }

    @Override // w.InterfaceC6894d
    public long d() {
        if (this.f62583h < 0) {
            this.f62583h = this.f62576a.b(this.f62580e, this.f62581f, this.f62582g);
        }
        return this.f62583h;
    }

    @Override // w.InterfaceC6894d
    public s0 e() {
        return this.f62577b;
    }

    @Override // w.InterfaceC6894d
    public Object f(long j10) {
        if (c(j10)) {
            return g();
        }
        AbstractC6913q abstractC6913qD = this.f62576a.d(j10, this.f62580e, this.f62581f, this.f62582g);
        int iB = abstractC6913qD.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(abstractC6913qD.a(i10))) {
                AbstractC6889a0.b("AnimationVector cannot contain a NaN. " + abstractC6913qD + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return e().b().invoke(abstractC6913qD);
    }

    @Override // w.InterfaceC6894d
    public Object g() {
        return this.f62578c;
    }

    public final Object i() {
        return this.f62579d;
    }

    public String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + g() + ",initial velocity: " + this.f62582g + ", duration: " + AbstractC6898f.b(this) + " ms,animationSpec: " + this.f62576a;
    }

    public /* synthetic */ n0(InterfaceC6904i interfaceC6904i, s0 s0Var, Object obj, Object obj2, AbstractC6913q abstractC6913q, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6904i, s0Var, obj, obj2, (i10 & 16) != 0 ? null : abstractC6913q);
    }

    public n0(InterfaceC6904i interfaceC6904i, s0 s0Var, Object obj, Object obj2, AbstractC6913q abstractC6913q) {
        this(interfaceC6904i.a(s0Var), s0Var, obj, obj2, abstractC6913q);
    }
}
