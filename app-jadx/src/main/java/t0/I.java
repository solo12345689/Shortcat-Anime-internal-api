package t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f60186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f60187b;

    public I(float f10, float f11) {
        this.f60186a = f10;
        this.f60187b = f11;
    }

    public final float a() {
        return this.f60186a;
    }

    public final float b() {
        return this.f60187b;
    }

    public final float[] c() {
        float f10 = this.f60186a;
        float f11 = this.f60187b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return Float.compare(this.f60186a, i10.f60186a) == 0 && Float.compare(this.f60187b, i10.f60187b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f60186a) * 31) + Float.hashCode(this.f60187b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f60186a + ", y=" + this.f60187b + ')';
    }
}
