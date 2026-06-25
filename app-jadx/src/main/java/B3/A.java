package B3;

import U2.InterfaceC2256q;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1059e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t2.O f1055a = new t2.O(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f1060f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1061g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1062h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f1056b = new C6609I();

    A() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(InterfaceC2256q interfaceC2256q) {
        this.f1056b.Y(a0.f60567f);
        this.f1057c = true;
        interfaceC2256q.g();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(InterfaceC2256q interfaceC2256q, U2.I i10) {
        int iMin = (int) Math.min(20000L, interfaceC2256q.getLength());
        long j10 = 0;
        if (interfaceC2256q.getPosition() != j10) {
            i10.f18917a = j10;
            return 1;
        }
        this.f1056b.X(iMin);
        interfaceC2256q.g();
        interfaceC2256q.o(this.f1056b.f(), 0, iMin);
        this.f1060f = i(this.f1056b);
        this.f1058d = true;
        return 0;
    }

    private long i(C6609I c6609i) {
        int iJ = c6609i.j();
        for (int iG = c6609i.g(); iG < iJ - 3; iG++) {
            if (f(c6609i.f(), iG) == 442) {
                c6609i.b0(iG + 4);
                long jL = l(c6609i);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(InterfaceC2256q interfaceC2256q, U2.I i10) {
        long length = interfaceC2256q.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (interfaceC2256q.getPosition() != j10) {
            i10.f18917a = j10;
            return 1;
        }
        this.f1056b.X(iMin);
        interfaceC2256q.g();
        interfaceC2256q.o(this.f1056b.f(), 0, iMin);
        this.f1061g = k(this.f1056b);
        this.f1059e = true;
        return 0;
    }

    private long k(C6609I c6609i) {
        int iG = c6609i.g();
        for (int iJ = c6609i.j() - 4; iJ >= iG; iJ--) {
            if (f(c6609i.f(), iJ) == 442) {
                c6609i.b0(iJ + 4);
                long jL = l(c6609i);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(C6609I c6609i) {
        int iG = c6609i.g();
        if (c6609i.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c6609i.q(bArr, 0, 9);
        c6609i.b0(iG);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f1062h;
    }

    public t2.O d() {
        return this.f1055a;
    }

    public boolean e() {
        return this.f1057c;
    }

    public int g(InterfaceC2256q interfaceC2256q, U2.I i10) {
        if (!this.f1059e) {
            return j(interfaceC2256q, i10);
        }
        if (this.f1061g == -9223372036854775807L) {
            return b(interfaceC2256q);
        }
        if (!this.f1058d) {
            return h(interfaceC2256q, i10);
        }
        long j10 = this.f1060f;
        if (j10 == -9223372036854775807L) {
            return b(interfaceC2256q);
        }
        this.f1062h = this.f1055a.c(this.f1061g) - this.f1055a.b(j10);
        return b(interfaceC2256q);
    }
}
