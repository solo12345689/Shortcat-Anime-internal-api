package C;

/* JADX INFO: renamed from: C.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1150v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2185d;

    public C1150v(int i10, int i11, int i12, int i13) {
        this.f2182a = i10;
        this.f2183b = i11;
        this.f2184c = i12;
        this.f2185d = i13;
    }

    public final int a() {
        return this.f2185d;
    }

    public final int b() {
        return this.f2182a;
    }

    public final int c() {
        return this.f2184c;
    }

    public final int d() {
        return this.f2183b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1150v)) {
            return false;
        }
        C1150v c1150v = (C1150v) obj;
        return this.f2182a == c1150v.f2182a && this.f2183b == c1150v.f2183b && this.f2184c == c1150v.f2184c && this.f2185d == c1150v.f2185d;
    }

    public int hashCode() {
        return (((((this.f2182a * 31) + this.f2183b) * 31) + this.f2184c) * 31) + this.f2185d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f2182a + ", top=" + this.f2183b + ", right=" + this.f2184c + ", bottom=" + this.f2185d + ')';
    }
}
