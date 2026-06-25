package io.sentry;

/* JADX INFO: renamed from: io.sentry.a0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5114a0 {
    Boolean A();

    io.sentry.protocol.x B(io.sentry.protocol.E e10, f4 f4Var, H h10, C5300v1 c5300v1);

    InterfaceC5114a0 C(String str);

    void a(C5191e c5191e);

    void c(boolean z10);

    /* JADX INFO: renamed from: clone */
    S m950clone();

    void d(long j10);

    void e(C5191e c5191e, H h10);

    boolean f();

    void g(Throwable th2, InterfaceC5207h0 interfaceC5207h0, String str);

    C5322z3 h();

    boolean isEnabled();

    InterfaceC5217j0 j();

    void l();

    io.sentry.transport.z n();

    io.sentry.protocol.x o(C5265q2 c5265q2, H h10);

    void p();

    default io.sentry.protocol.x q(io.sentry.protocol.E e10, f4 f4Var, H h10) {
        return B(e10, f4Var, h10, null);
    }

    default void r(G1 g12) {
        t(null, g12);
    }

    default boolean s() {
        return false;
    }

    void t(I1 i12, G1 g12);

    io.sentry.protocol.x u(A3 a32, H h10);

    Y v();

    io.sentry.protocol.x w(C5268r1 c5268r1);

    default io.sentry.protocol.x x(C5265q2 c5265q2) {
        return o(c5265q2, new H());
    }

    io.sentry.protocol.x y(V2 v22, H h10);

    InterfaceC5217j0 z(i4 i4Var, k4 k4Var);
}
