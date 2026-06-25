package i0;

import g0.C4819a;

/* JADX INFO: renamed from: i0.V, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4977V implements InterfaceC4976U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4819a f48449a = new C4819a(0);

    public final boolean q(int i10) {
        return (i10 & AbstractC4989h.a(this.f48449a.get())) != 0;
    }

    public final void s(int i10) {
        int iA;
        do {
            iA = AbstractC4989h.a(this.f48449a.get());
            if ((iA & i10) != 0) {
                return;
            }
        } while (!this.f48449a.compareAndSet(iA, AbstractC4989h.a(iA | i10)));
    }
}
