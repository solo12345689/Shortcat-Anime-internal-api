package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class L implements S {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5114a0 f49220a;

    public L(InterfaceC5114a0 interfaceC5114a0) {
        this.f49220a = interfaceC5114a0;
    }

    @Override // io.sentry.InterfaceC5114a0
    public Boolean A() {
        return this.f49220a.A();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x B(io.sentry.protocol.E e10, f4 f4Var, H h10, C5300v1 c5300v1) {
        return this.f49220a.B(e10, f4Var, h10, c5300v1);
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5114a0 C(String str) {
        return this.f49220a.C(str);
    }

    @Override // io.sentry.InterfaceC5114a0
    public void a(C5191e c5191e) {
        this.f49220a.a(c5191e);
    }

    @Override // io.sentry.InterfaceC5114a0
    public void c(boolean z10) {
        this.f49220a.c(z10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public void d(long j10) {
        this.f49220a.d(j10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public void e(C5191e c5191e, H h10) {
        this.f49220a.e(c5191e, h10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public boolean f() {
        return this.f49220a.f();
    }

    @Override // io.sentry.InterfaceC5114a0
    public void g(Throwable th2, InterfaceC5207h0 interfaceC5207h0, String str) {
        this.f49220a.g(th2, interfaceC5207h0, str);
    }

    @Override // io.sentry.InterfaceC5114a0
    public C5322z3 h() {
        return this.f49220a.h();
    }

    @Override // io.sentry.InterfaceC5114a0
    public boolean isEnabled() {
        return this.f49220a.isEnabled();
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5217j0 j() {
        return this.f49220a.j();
    }

    @Override // io.sentry.InterfaceC5114a0
    public void l() {
        this.f49220a.l();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.transport.z n() {
        return this.f49220a.n();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x o(C5265q2 c5265q2, H h10) {
        return this.f49220a.o(c5265q2, h10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public void p() {
        this.f49220a.p();
    }

    @Override // io.sentry.InterfaceC5114a0
    public void t(I1 i12, G1 g12) {
        this.f49220a.t(i12, g12);
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x u(A3 a32, H h10) {
        return this.f49220a.u(a32, h10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public Y v() {
        return AbstractC5204g2.t();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x w(C5268r1 c5268r1) {
        return this.f49220a.w(c5268r1);
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x y(V2 v22, H h10) {
        return this.f49220a.y(v22, h10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5217j0 z(i4 i4Var, k4 k4Var) {
        return this.f49220a.z(i4Var, k4Var);
    }

    @Override // io.sentry.InterfaceC5114a0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public S m947clone() {
        return this.f49220a.m947clone();
    }
}
