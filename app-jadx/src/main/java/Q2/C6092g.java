package q2;

/* JADX INFO: renamed from: q2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6092g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56875b;

    public C6092g(int i10, float f10) {
        this.f56874a = i10;
        this.f56875b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6092g.class == obj.getClass()) {
            C6092g c6092g = (C6092g) obj;
            if (this.f56874a == c6092g.f56874a && Float.compare(c6092g.f56875b, this.f56875b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f56874a) * 31) + Float.floatToIntBits(this.f56875b);
    }
}
