package Aa;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f339g;

    public d(int i10, double d10, double d11, double d12, double d13, int i11, int i12) {
        this.f333a = i10;
        this.f334b = d10;
        this.f335c = d11;
        this.f336d = d12;
        this.f337e = d13;
        this.f338f = i11;
        this.f339g = i12;
    }

    public final int a() {
        return this.f339g;
    }

    public final double b() {
        return this.f336d;
    }

    public final double c() {
        return this.f337e;
    }

    public final int d() {
        return this.f338f;
    }

    public final double e() {
        return this.f334b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f333a == dVar.f333a && Double.compare(this.f334b, dVar.f334b) == 0 && Double.compare(this.f335c, dVar.f335c) == 0 && Double.compare(this.f336d, dVar.f336d) == 0 && Double.compare(this.f337e, dVar.f337e) == 0 && this.f338f == dVar.f338f && this.f339g == dVar.f339g;
    }

    public final double f() {
        return this.f335c;
    }

    public final int g() {
        return this.f333a;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f333a) * 31) + Double.hashCode(this.f334b)) * 31) + Double.hashCode(this.f335c)) * 31) + Double.hashCode(this.f336d)) * 31) + Double.hashCode(this.f337e)) * 31) + Integer.hashCode(this.f338f)) * 31) + Integer.hashCode(this.f339g);
    }

    public String toString() {
        return "FocusedInputSelectionChangedEventData(target=" + this.f333a + ", startX=" + this.f334b + ", startY=" + this.f335c + ", endX=" + this.f336d + ", endY=" + this.f337e + ", start=" + this.f338f + ", end=" + this.f339g + ")";
    }
}
