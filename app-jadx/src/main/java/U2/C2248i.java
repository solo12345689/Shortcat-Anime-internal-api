package U2;

import U2.J;

/* JADX INFO: renamed from: U2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2248i implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f19039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19045g;

    public C2248i(long j10, long j11, int i10, int i11, boolean z10) {
        this.f19039a = j10;
        this.f19040b = j11;
        this.f19041c = i11 == -1 ? 1 : i11;
        this.f19043e = i10;
        this.f19045g = z10;
        if (j10 == -1) {
            this.f19042d = -1L;
            this.f19044f = -9223372036854775807L;
        } else {
            this.f19042d = j10 - j11;
            this.f19044f = c(j10, j11, i10);
        }
    }

    private long a(long j10) {
        long j11 = (j10 * ((long) this.f19043e)) / 8000000;
        int i10 = this.f19041c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f19042d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f19040b + Math.max(jMin, 0L);
    }

    private static long c(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    public long b(long j10) {
        return c(j10, this.f19040b, this.f19043e);
    }

    @Override // U2.J
    public J.a g(long j10) {
        if (this.f19042d == -1 && !this.f19045g) {
            return new J.a(new K(0L, this.f19040b));
        }
        long jA = a(j10);
        long jB = b(jA);
        K k10 = new K(jB, jA);
        if (this.f19042d != -1 && jB < j10) {
            int i10 = this.f19041c;
            if (((long) i10) + jA < this.f19039a) {
                long j11 = jA + ((long) i10);
                return new J.a(k10, new K(b(j11), j11));
            }
        }
        return new J.a(k10);
    }

    @Override // U2.J
    public boolean k() {
        return this.f19042d != -1 || this.f19045g;
    }

    @Override // U2.J
    public long n() {
        return this.f19044f;
    }
}
