package k4;

/* JADX INFO: renamed from: k4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5446b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f52048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f52049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f52050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f52051d;

    public C5446b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f52048a = z10;
        this.f52049b = z11;
        this.f52050c = z12;
        this.f52051d = z13;
    }

    public final boolean a() {
        return this.f52048a;
    }

    public final boolean b() {
        return this.f52050c;
    }

    public final boolean c() {
        return this.f52051d;
    }

    public final boolean d() {
        return this.f52049b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5446b)) {
            return false;
        }
        C5446b c5446b = (C5446b) obj;
        return this.f52048a == c5446b.f52048a && this.f52049b == c5446b.f52049b && this.f52050c == c5446b.f52050c && this.f52051d == c5446b.f52051d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z10 = this.f52048a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.f52049b;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        int i11 = (i10 + r22) * 31;
        boolean z12 = this.f52050c;
        ?? r23 = z12;
        if (z12) {
            r23 = 1;
        }
        int i12 = (i11 + r23) * 31;
        boolean z13 = this.f52051d;
        return i12 + (z13 ? 1 : z13);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f52048a + ", isValidated=" + this.f52049b + ", isMetered=" + this.f52050c + ", isNotRoaming=" + this.f52051d + ')';
    }
}
