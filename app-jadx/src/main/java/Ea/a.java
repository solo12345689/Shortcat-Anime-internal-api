package Ea;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f5818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f5819b;

    public a(double d10, double d11) {
        this.f5818a = d10;
        this.f5819b = d11;
    }

    public final double a() {
        return this.f5819b;
    }

    public final double b() {
        return this.f5818a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f5818a, aVar.f5818a) == 0 && Double.compare(this.f5819b, aVar.f5819b) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.f5818a) * 31) + Double.hashCode(this.f5819b);
    }

    public String toString() {
        return "Dimensions(width=" + this.f5818a + ", height=" + this.f5819b + ")";
    }
}
