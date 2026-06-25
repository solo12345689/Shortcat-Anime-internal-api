package Y;

/* JADX INFO: renamed from: Y.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2392b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22271a;

    public C2392b(int i10) {
        this.f22271a = i10;
    }

    public final int a() {
        return this.f22271a;
    }

    public final boolean b() {
        return this.f22271a != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.f22271a = i10;
    }

    public final int d(E1 e12) {
        return e12.d(this);
    }

    public final int e(H1 h12) {
        return h12.C(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f22271a + " }";
    }
}
