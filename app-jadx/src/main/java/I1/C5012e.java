package i1;

/* JADX INFO: renamed from: i1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5012e implements InterfaceC5011d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f48542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f48543b;

    public C5012e(float f10, float f11) {
        this.f48542a = f10;
        this.f48543b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5012e)) {
            return false;
        }
        C5012e c5012e = (C5012e) obj;
        return Float.compare(this.f48542a, c5012e.f48542a) == 0 && Float.compare(this.f48543b, c5012e.f48543b) == 0;
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f48542a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f48542a) * 31) + Float.hashCode(this.f48543b);
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f48543b;
    }

    public String toString() {
        return "DensityImpl(density=" + this.f48542a + ", fontScale=" + this.f48543b + ')';
    }
}
