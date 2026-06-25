package B3;

import U2.AbstractC2244e;
import U2.InterfaceC2256q;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class z extends AbstractC2244e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements AbstractC2244e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t2.O f1476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C6609I f1477b;

        private AbstractC2244e.C0323e c(C6609I c6609i, long j10, long j11) {
            int iG = -1;
            int iG2 = -1;
            long j12 = -9223372036854775807L;
            while (c6609i.a() >= 4) {
                if (z.k(c6609i.f(), c6609i.g()) != 442) {
                    c6609i.c0(1);
                } else {
                    c6609i.c0(4);
                    long jL = A.l(c6609i);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f1476a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? AbstractC2244e.C0323e.d(jB, j11) : AbstractC2244e.C0323e.e(j11 + ((long) iG2));
                        }
                        if (100000 + jB > j10) {
                            return AbstractC2244e.C0323e.e(j11 + ((long) c6609i.g()));
                        }
                        iG2 = c6609i.g();
                        j12 = jB;
                    }
                    d(c6609i);
                    iG = c6609i.g();
                }
            }
            return j12 != -9223372036854775807L ? AbstractC2244e.C0323e.f(j12, j11 + ((long) iG)) : AbstractC2244e.C0323e.f19028d;
        }

        private static void d(C6609I c6609i) {
            int iK;
            int iJ = c6609i.j();
            if (c6609i.a() < 10) {
                c6609i.b0(iJ);
                return;
            }
            c6609i.c0(9);
            int iM = c6609i.M() & 7;
            if (c6609i.a() < iM) {
                c6609i.b0(iJ);
                return;
            }
            c6609i.c0(iM);
            if (c6609i.a() < 4) {
                c6609i.b0(iJ);
                return;
            }
            if (z.k(c6609i.f(), c6609i.g()) == 443) {
                c6609i.c0(4);
                int iU = c6609i.U();
                if (c6609i.a() < iU) {
                    c6609i.b0(iJ);
                    return;
                }
                c6609i.c0(iU);
            }
            while (c6609i.a() >= 4 && (iK = z.k(c6609i.f(), c6609i.g())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                c6609i.c0(4);
                if (c6609i.a() < 2) {
                    c6609i.b0(iJ);
                    return;
                }
                c6609i.b0(Math.min(c6609i.j(), c6609i.g() + c6609i.U()));
            }
        }

        @Override // U2.AbstractC2244e.f
        public AbstractC2244e.C0323e a(InterfaceC2256q interfaceC2256q, long j10) {
            long position = interfaceC2256q.getPosition();
            int iMin = (int) Math.min(20000L, interfaceC2256q.getLength() - position);
            this.f1477b.X(iMin);
            interfaceC2256q.o(this.f1477b.f(), 0, iMin);
            return c(this.f1477b, j10, position);
        }

        @Override // U2.AbstractC2244e.f
        public void b() {
            this.f1477b.Y(a0.f60567f);
        }

        private b(t2.O o10) {
            this.f1476a = o10;
            this.f1477b = new C6609I();
        }
    }

    public z(t2.O o10, long j10, long j11) {
        super(new AbstractC2244e.b(), new b(o10), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
