package io.sentry;

/* JADX INFO: renamed from: io.sentry.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5113a implements InterfaceC5227l0 {
    @Override // io.sentry.InterfaceC5227l0
    public io.sentry.transport.p a(C5322z3 c5322z3, B1 b12) {
        io.sentry.util.w.c(c5322z3, "options is required");
        io.sentry.util.w.c(b12, "requestDetails is required");
        return new io.sentry.transport.e(c5322z3, new io.sentry.transport.z(c5322z3), c5322z3.getTransportGate(), b12);
    }
}
