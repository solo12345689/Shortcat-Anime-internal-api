package B3;

import U2.AbstractC2244e;
import U2.InterfaceC2256q;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class H extends AbstractC2244e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements AbstractC2244e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t2.O f1094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C6609I f1095b = new C6609I();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1097d;

        public a(int i10, t2.O o10, int i11) {
            this.f1096c = i10;
            this.f1094a = o10;
            this.f1097d = i11;
        }

        private AbstractC2244e.C0323e c(C6609I c6609i, long j10, long j11) {
            int iA;
            int iA2;
            int iJ = c6609i.j();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (c6609i.a() >= 188 && (iA2 = (iA = M.a(c6609i.f(), c6609i.g(), iJ)) + 188) <= iJ) {
                long jC = M.c(c6609i, iA, this.f1096c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f1094a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? AbstractC2244e.C0323e.d(jB, j11) : AbstractC2244e.C0323e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return AbstractC2244e.C0323e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB;
                }
                c6609i.b0(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? AbstractC2244e.C0323e.f(j14, j11 + j12) : AbstractC2244e.C0323e.f19028d;
        }

        @Override // U2.AbstractC2244e.f
        public AbstractC2244e.C0323e a(InterfaceC2256q interfaceC2256q, long j10) {
            long position = interfaceC2256q.getPosition();
            int iMin = (int) Math.min(this.f1097d, interfaceC2256q.getLength() - position);
            this.f1095b.X(iMin);
            interfaceC2256q.o(this.f1095b.f(), 0, iMin);
            return c(this.f1095b, j10, position);
        }

        @Override // U2.AbstractC2244e.f
        public void b() {
            this.f1095b.Y(a0.f60567f);
        }
    }

    public H(t2.O o10, long j10, long j11, int i10, int i11) {
        super(new AbstractC2244e.b(), new a(i10, o10, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
