package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class Q1 implements InterfaceC5114a0 {

    /* JADX INFO: renamed from: a */
    private static final Q1 f49292a = new Q1();

    private Q1() {
    }

    public static Q1 b() {
        return f49292a;
    }

    @Override // io.sentry.InterfaceC5114a0
    public Boolean A() {
        return AbstractC5204g2.E();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x B(io.sentry.protocol.E e10, f4 f4Var, H h10, C5300v1 c5300v1) {
        return AbstractC5204g2.r().B(e10, f4Var, h10, c5300v1);
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5114a0 C(String str) {
        return AbstractC5204g2.q(str);
    }

    @Override // io.sentry.InterfaceC5114a0
    public void a(C5191e c5191e) {
        e(c5191e, new H());
    }

    @Override // io.sentry.InterfaceC5114a0
    public void c(boolean z10) {
        AbstractC5204g2.k();
    }

    @Override // io.sentry.InterfaceC5114a0
    public void d(long j10) {
        AbstractC5204g2.p(j10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public void e(C5191e c5191e, H h10) {
        AbstractC5204g2.h(c5191e, h10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public boolean f() {
        return AbstractC5204g2.G();
    }

    @Override // io.sentry.InterfaceC5114a0
    public void g(Throwable th2, InterfaceC5207h0 interfaceC5207h0, String str) {
        AbstractC5204g2.r().g(th2, interfaceC5207h0, str);
    }

    @Override // io.sentry.InterfaceC5114a0
    public C5322z3 h() {
        return AbstractC5204g2.r().h();
    }

    @Override // io.sentry.InterfaceC5114a0
    public boolean isEnabled() {
        return AbstractC5204g2.F();
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5217j0 j() {
        return AbstractC5204g2.r().j();
    }

    @Override // io.sentry.InterfaceC5114a0
    public void l() {
        AbstractC5204g2.n();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.transport.z n() {
        return AbstractC5204g2.r().n();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x o(C5265q2 c5265q2, H h10) {
        return AbstractC5204g2.r().o(c5265q2, h10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public void p() {
        AbstractC5204g2.L();
    }

    @Override // io.sentry.InterfaceC5114a0
    public void t(I1 i12, G1 g12) {
        AbstractC5204g2.m(i12, g12);
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x u(A3 a32, H h10) {
        return AbstractC5204g2.r().u(a32, h10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public Y v() {
        return AbstractC5204g2.t();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x w(C5268r1 c5268r1) {
        return AbstractC5204g2.r().w(c5268r1);
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x y(V2 v22, H h10) {
        return AbstractC5204g2.j(v22, h10);
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5217j0 z(i4 i4Var, k4 k4Var) {
        return AbstractC5204g2.M(i4Var, k4Var);
    }

    @Override // io.sentry.InterfaceC5114a0
    /* JADX INFO: renamed from: clone */
    public S m950clone() {
        return AbstractC5204g2.r().m952clone();
    }
}
