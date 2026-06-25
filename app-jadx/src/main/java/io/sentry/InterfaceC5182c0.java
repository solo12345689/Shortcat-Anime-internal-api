package io.sentry;

/* JADX INFO: renamed from: io.sentry.c0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5182c0 {
    io.sentry.protocol.x a(A3 a32, Y y10, H h10);

    io.sentry.protocol.x b(io.sentry.protocol.E e10, f4 f4Var, Y y10, H h10, C5300v1 c5300v1);

    void c(boolean z10);

    void d(long j10);

    void e(O3 o32, H h10);

    default boolean f() {
        return true;
    }

    void g(C5235m3 c5235m3);

    void h(C5266q3 c5266q3);

    io.sentry.protocol.x i(C5268r1 c5268r1, Y y10);

    boolean isEnabled();

    io.sentry.protocol.x j(V2 v22, Y y10, H h10);

    io.sentry.transport.z n();

    io.sentry.protocol.x o(C5265q2 c5265q2, H h10);
}
