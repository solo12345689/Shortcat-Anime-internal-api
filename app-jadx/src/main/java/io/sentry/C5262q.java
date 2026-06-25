package io.sentry;

/* JADX INFO: renamed from: io.sentry.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5262q implements InterfaceC5232m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f51162a;

    public C5262q(C5322z3 c5322z3) {
        this.f51162a = c5322z3;
    }

    @Override // io.sentry.InterfaceC5232m0
    public boolean a() {
        return C5205g3.d().c(this.f51162a.getFatalLogger());
    }
}
