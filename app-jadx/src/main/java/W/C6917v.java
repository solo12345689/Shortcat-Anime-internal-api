package w;

/* JADX INFO: renamed from: w.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6917v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f62726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f62727b;

    public C6917v(double d10, double d11) {
        this.f62726a = d10;
        this.f62727b = d11;
    }

    public final double e() {
        return this.f62727b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6917v)) {
            return false;
        }
        C6917v c6917v = (C6917v) obj;
        return Double.compare(this.f62726a, c6917v.f62726a) == 0 && Double.compare(this.f62727b, c6917v.f62727b) == 0;
    }

    public final double f() {
        return this.f62726a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f62726a) * 31) + Double.hashCode(this.f62727b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f62726a + ", _imaginary=" + this.f62727b + ')';
    }
}
