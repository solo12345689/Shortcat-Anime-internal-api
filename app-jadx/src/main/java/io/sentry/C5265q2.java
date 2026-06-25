package io.sentry;

import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5265q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5269r2 f51167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterable f51168b;

    public C5265q2(C5269r2 c5269r2, Iterable iterable) {
        this.f51167a = (C5269r2) io.sentry.util.w.c(c5269r2, "SentryEnvelopeHeader is required.");
        this.f51168b = (Iterable) io.sentry.util.w.c(iterable, "SentryEnvelope items are required.");
    }

    public static C5265q2 a(InterfaceC5197f0 interfaceC5197f0, O3 o32, io.sentry.protocol.r rVar) {
        io.sentry.util.w.c(interfaceC5197f0, "Serializer is required.");
        io.sentry.util.w.c(o32, "session is required.");
        return new C5265q2(null, rVar, T2.K(interfaceC5197f0, o32));
    }

    public C5269r2 b() {
        return this.f51167a;
    }

    public Iterable c() {
        return this.f51168b;
    }

    public C5265q2(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar, T2 t22) {
        io.sentry.util.w.c(t22, "SentryEnvelopeItem is required.");
        this.f51167a = new C5269r2(xVar, rVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(t22);
        this.f51168b = arrayList;
    }
}
