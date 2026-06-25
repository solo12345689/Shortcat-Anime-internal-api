package k0;

import Y.AbstractC2411h0;
import Y.C2392b;
import Y.D1;

/* JADX INFO: renamed from: k0.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5431u extends AbstractC5411a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D1 f51992b;

    public C5431u(D1 d12) {
        this.f51992b = d12;
    }

    @Override // k0.AbstractC5411a
    public int d(C2392b c2392b) {
        D1 d12 = this.f51992b;
        return d12.D(d12.z().d(c2392b));
    }

    @Override // k0.AbstractC5411a
    public AbstractC2411h0 g(C2392b c2392b) {
        return this.f51992b.z().L(this.f51992b.z().d(c2392b));
    }
}
