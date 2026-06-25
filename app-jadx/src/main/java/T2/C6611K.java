package t2;

/* JADX INFO: renamed from: t2.K, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6611K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C6611K f60536c = new C6611K(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C6611K f60537d = new C6611K(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60539b;

    public C6611K(int i10, int i11) {
        AbstractC6614a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f60538a = i10;
        this.f60539b = i11;
    }

    public int a() {
        return this.f60539b;
    }

    public int b() {
        return this.f60538a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6611K) {
            C6611K c6611k = (C6611K) obj;
            if (this.f60538a == c6611k.f60538a && this.f60539b == c6611k.f60539b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f60539b;
        int i11 = this.f60538a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f60538a + "x" + this.f60539b;
    }
}
