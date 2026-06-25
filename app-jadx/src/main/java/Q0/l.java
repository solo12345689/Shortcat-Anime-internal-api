package Q0;

import I0.InterfaceC1690p;
import R0.s;
import i1.C5023p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f14260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5023p f14262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1690p f14263d;

    public l(s sVar, int i10, C5023p c5023p, InterfaceC1690p interfaceC1690p) {
        this.f14260a = sVar;
        this.f14261b = i10;
        this.f14262c = c5023p;
        this.f14263d = interfaceC1690p;
    }

    public final InterfaceC1690p a() {
        return this.f14263d;
    }

    public final int b() {
        return this.f14261b;
    }

    public final s c() {
        return this.f14260a;
    }

    public final C5023p d() {
        return this.f14262c;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.f14260a + ", depth=" + this.f14261b + ", viewportBoundsInWindow=" + this.f14262c + ", coordinates=" + this.f14263d + ')';
    }
}
