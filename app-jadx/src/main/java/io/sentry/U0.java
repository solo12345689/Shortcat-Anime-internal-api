package io.sentry;

import io.sentry.util.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class U0 implements InterfaceC5114a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U0 f49344b = new U0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.p f49345a = new io.sentry.util.p(new p.a() { // from class: io.sentry.T0
        @Override // io.sentry.util.p.a
        public final Object a() {
            return C5322z3.empty();
        }
    });

    private U0() {
    }

    public static U0 i() {
        return f49344b;
    }

    @Override // io.sentry.InterfaceC5114a0
    public Boolean A() {
        return null;
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x B(io.sentry.protocol.E e10, f4 f4Var, H h10, C5300v1 c5300v1) {
        return io.sentry.protocol.x.f51153b;
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5114a0 C(String str) {
        return i();
    }

    @Override // io.sentry.InterfaceC5114a0
    public boolean f() {
        return true;
    }

    @Override // io.sentry.InterfaceC5114a0
    public C5322z3 h() {
        return (C5322z3) this.f49345a.a();
    }

    @Override // io.sentry.InterfaceC5114a0
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5217j0 j() {
        return null;
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.transport.z n() {
        return null;
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x o(C5265q2 c5265q2, H h10) {
        return io.sentry.protocol.x.f51153b;
    }

    @Override // io.sentry.InterfaceC5114a0
    public boolean s() {
        return true;
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x u(A3 a32, H h10) {
        return io.sentry.protocol.x.f51153b;
    }

    @Override // io.sentry.InterfaceC5114a0
    public Y v() {
        return S0.T();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x w(C5268r1 c5268r1) {
        return io.sentry.protocol.x.f51153b;
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x y(V2 v22, H h10) {
        return io.sentry.protocol.x.f51153b;
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5217j0 z(i4 i4Var, k4 k4Var) {
        return C5198f1.u();
    }

    @Override // io.sentry.InterfaceC5114a0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public S m952clone() {
        return M0.b();
    }

    @Override // io.sentry.InterfaceC5114a0
    public void l() {
    }

    @Override // io.sentry.InterfaceC5114a0
    public void p() {
    }

    @Override // io.sentry.InterfaceC5114a0
    public void a(C5191e c5191e) {
    }

    @Override // io.sentry.InterfaceC5114a0
    public void c(boolean z10) {
    }

    @Override // io.sentry.InterfaceC5114a0
    public void d(long j10) {
    }

    @Override // io.sentry.InterfaceC5114a0
    public void e(C5191e c5191e, H h10) {
    }

    @Override // io.sentry.InterfaceC5114a0
    public void t(I1 i12, G1 g12) {
    }

    @Override // io.sentry.InterfaceC5114a0
    public void g(Throwable th2, InterfaceC5207h0 interfaceC5207h0, String str) {
    }
}
