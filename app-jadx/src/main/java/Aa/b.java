package Aa;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f330h;

    public b(double d10, double d11, double d12, double d13, double d14, double d15, int i10, int i11) {
        this.f323a = d10;
        this.f324b = d11;
        this.f325c = d12;
        this.f326d = d13;
        this.f327e = d14;
        this.f328f = d15;
        this.f329g = i10;
        this.f330h = i11;
    }

    public final double a() {
        return this.f327e;
    }

    public final double b() {
        return this.f328f;
    }

    public final double c() {
        return this.f326d;
    }

    public final int d() {
        return this.f330h;
    }

    public final int e() {
        return this.f329g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f323a, bVar.f323a) == 0 && Double.compare(this.f324b, bVar.f324b) == 0 && Double.compare(this.f325c, bVar.f325c) == 0 && Double.compare(this.f326d, bVar.f326d) == 0 && Double.compare(this.f327e, bVar.f327e) == 0 && Double.compare(this.f328f, bVar.f328f) == 0 && this.f329g == bVar.f329g && this.f330h == bVar.f330h;
    }

    public final double f() {
        return this.f325c;
    }

    public final double g() {
        return this.f323a;
    }

    public final double h() {
        return this.f324b;
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.f323a) * 31) + Double.hashCode(this.f324b)) * 31) + Double.hashCode(this.f325c)) * 31) + Double.hashCode(this.f326d)) * 31) + Double.hashCode(this.f327e)) * 31) + Double.hashCode(this.f328f)) * 31) + Integer.hashCode(this.f329g)) * 31) + Integer.hashCode(this.f330h);
    }

    public String toString() {
        return "FocusedInputLayoutChangedEventData(x=" + this.f323a + ", y=" + this.f324b + ", width=" + this.f325c + ", height=" + this.f326d + ", absoluteX=" + this.f327e + ", absoluteY=" + this.f328f + ", target=" + this.f329g + ", parentScrollViewTarget=" + this.f330h + ")";
    }
}
