package B3;

import U2.InterfaceC2256q;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1098a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1103f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t2.O f1099b = new t2.O(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1104g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1105h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f1106i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f1100c = new C6609I();

    I(int i10) {
        this.f1098a = i10;
    }

    private int a(InterfaceC2256q interfaceC2256q) {
        this.f1100c.Y(a0.f60567f);
        this.f1101d = true;
        interfaceC2256q.g();
        return 0;
    }

    private int f(InterfaceC2256q interfaceC2256q, U2.I i10, int i11) {
        int iMin = (int) Math.min(this.f1098a, interfaceC2256q.getLength());
        long j10 = 0;
        if (interfaceC2256q.getPosition() != j10) {
            i10.f18917a = j10;
            return 1;
        }
        this.f1100c.X(iMin);
        interfaceC2256q.g();
        interfaceC2256q.o(this.f1100c.f(), 0, iMin);
        this.f1104g = g(this.f1100c, i11);
        this.f1102e = true;
        return 0;
    }

    private long g(C6609I c6609i, int i10) {
        int iJ = c6609i.j();
        for (int iG = c6609i.g(); iG < iJ; iG++) {
            if (c6609i.f()[iG] == 71) {
                long jC = M.c(c6609i, iG, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(InterfaceC2256q interfaceC2256q, U2.I i10, int i11) {
        long length = interfaceC2256q.getLength();
        int iMin = (int) Math.min(this.f1098a, length);
        long j10 = length - ((long) iMin);
        if (interfaceC2256q.getPosition() != j10) {
            i10.f18917a = j10;
            return 1;
        }
        this.f1100c.X(iMin);
        interfaceC2256q.g();
        interfaceC2256q.o(this.f1100c.f(), 0, iMin);
        this.f1105h = i(this.f1100c, i11);
        this.f1103f = true;
        return 0;
    }

    private long i(C6609I c6609i, int i10) {
        int iG = c6609i.g();
        int iJ = c6609i.j();
        for (int i11 = iJ - 188; i11 >= iG; i11--) {
            if (M.b(c6609i.f(), iG, iJ, i11)) {
                long jC = M.c(c6609i, i11, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f1106i;
    }

    public t2.O c() {
        return this.f1099b;
    }

    public boolean d() {
        return this.f1101d;
    }

    public int e(InterfaceC2256q interfaceC2256q, U2.I i10, int i11) {
        if (i11 <= 0) {
            return a(interfaceC2256q);
        }
        if (!this.f1103f) {
            return h(interfaceC2256q, i10, i11);
        }
        if (this.f1105h == -9223372036854775807L) {
            return a(interfaceC2256q);
        }
        if (!this.f1102e) {
            return f(interfaceC2256q, i10, i11);
        }
        long j10 = this.f1104g;
        if (j10 == -9223372036854775807L) {
            return a(interfaceC2256q);
        }
        this.f1106i = this.f1099b.c(this.f1105h) - this.f1099b.b(j10);
        return a(interfaceC2256q);
    }
}
