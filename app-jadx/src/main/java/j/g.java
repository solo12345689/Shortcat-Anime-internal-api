package J;

import i1.InterfaceC5011d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f9196a;

    public g(float f10) {
        this.f9196a = f10;
    }

    @Override // J.b
    public float a(long j10, InterfaceC5011d interfaceC5011d) {
        return this.f9196a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f9196a, ((g) obj).f9196a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f9196a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f9196a + ".px)";
    }
}
