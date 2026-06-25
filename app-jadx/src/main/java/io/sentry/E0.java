package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class E0 implements InterfaceC5232m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f49141a;

    public E0(C5322z3 c5322z3) {
        this.f49141a = c5322z3;
    }

    @Override // io.sentry.InterfaceC5232m0
    public boolean a() {
        io.sentry.internal.a.a().b();
        return C5205g3.d().c(this.f49141a.getFatalLogger());
    }
}
