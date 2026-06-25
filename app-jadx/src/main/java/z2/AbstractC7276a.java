package z2;

/* JADX INFO: renamed from: z2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7276a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f65540a;

    public final void k(int i10) {
        this.f65540a = i10 | this.f65540a;
    }

    public void m() {
        this.f65540a = 0;
    }

    protected final boolean n(int i10) {
        return (this.f65540a & i10) == i10;
    }

    public final boolean p() {
        return n(268435456);
    }

    public final boolean q() {
        return n(4);
    }

    public final boolean r() {
        return n(134217728);
    }

    public final boolean s() {
        return n(1);
    }

    public final boolean t() {
        return n(536870912);
    }

    public final boolean u() {
        return n(67108864);
    }

    public final void v(int i10) {
        this.f65540a = i10;
    }
}
