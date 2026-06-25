package F0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f6119b;

    public a(long j10, float f10) {
        this.f6118a = j10;
        this.f6119b = f10;
    }

    public final float a() {
        return this.f6119b;
    }

    public final long b() {
        return this.f6118a;
    }

    public final void c(float f10) {
        this.f6119b = f10;
    }

    public final void d(long j10) {
        this.f6118a = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6118a == aVar.f6118a && Float.compare(this.f6119b, aVar.f6119b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f6118a) * 31) + Float.hashCode(this.f6119b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f6118a + ", dataPoint=" + this.f6119b + ')';
    }
}
