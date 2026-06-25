package E2;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import q2.C6109x;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a */
    final i f4272a;

    /* JADX INFO: renamed from: b */
    final long f4273b;

    /* JADX INFO: renamed from: c */
    final long f4274c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends k {

        /* JADX INFO: renamed from: d */
        final long f4275d;

        /* JADX INFO: renamed from: e */
        final long f4276e;

        /* JADX INFO: renamed from: f */
        final List f4277f;

        /* JADX INFO: renamed from: g */
        private final long f4278g;

        /* JADX INFO: renamed from: h */
        private final long f4279h;

        /* JADX INFO: renamed from: i */
        final long f4280i;

        public a(i iVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f4275d = j12;
            this.f4276e = j13;
            this.f4277f = list;
            this.f4280i = j14;
            this.f4278g = j15;
            this.f4279h = j16;
        }

        public long c(long j10, long j11) {
            long jG = g(j10);
            return jG != -1 ? jG : (int) (i((j11 - this.f4279h) + this.f4280i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f4278g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f4279h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f4275d;
        }

        public long f(long j10, long j11) {
            if (this.f4277f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j10, j11) + c(j10, j11);
            return (j(jD) + h(jD, j10)) - this.f4280i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List list = this.f4277f;
            if (list != null) {
                return (((d) list.get((int) (j10 - this.f4275d))).f4286b * 1000000) / this.f4273b;
            }
            long jG = g(j11);
            return (jG == -1 || j10 != (e() + jG) - 1) ? (this.f4276e * 1000000) / this.f4273b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long jE = e();
            long jG = g(j11);
            if (jG != 0) {
                if (this.f4277f != null) {
                    long j12 = (jG + jE) - 1;
                    long j13 = jE;
                    while (j13 <= j12) {
                        long j14 = ((j12 - j13) / 2) + j13;
                        long j15 = j(j14);
                        if (j15 < j10) {
                            j13 = j14 + 1;
                        } else {
                            if (j15 <= j10) {
                                return j14;
                            }
                            j12 = j14 - 1;
                        }
                    }
                    return j13 == jE ? j13 : j12;
                }
                long j16 = this.f4275d + (j10 / ((this.f4276e * 1000000) / this.f4273b));
                if (j16 >= jE) {
                    return jG == -1 ? j16 : Math.min(j16, (jE + jG) - 1);
                }
            }
            return jE;
        }

        public final long j(long j10) {
            List list = this.f4277f;
            return a0.m1(list != null ? ((d) list.get((int) (j10 - this.f4275d))).f4285a - this.f4274c : (j10 - this.f4275d) * this.f4276e, 1000000L, this.f4273b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f4277f != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends a {

        /* JADX INFO: renamed from: j */
        final List f4281j;

        public b(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f4281j = list2;
        }

        @Override // E2.k.a
        public long g(long j10) {
            return this.f4281j.size();
        }

        @Override // E2.k.a
        public i k(j jVar, long j10) {
            return (i) this.f4281j.get((int) (j10 - this.f4275d));
        }

        @Override // E2.k.a
        public boolean l() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends a {

        /* JADX INFO: renamed from: j */
        final n f4282j;

        /* JADX INFO: renamed from: k */
        final n f4283k;

        /* JADX INFO: renamed from: l */
        final long f4284l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f4282j = nVar;
            this.f4283k = nVar2;
            this.f4284l = j13;
        }

        @Override // E2.k
        public i a(j jVar) {
            n nVar = this.f4282j;
            if (nVar == null) {
                return super.a(jVar);
            }
            C6109x c6109x = jVar.f4259b;
            return new i(nVar.a(c6109x.f57008a, 0L, c6109x.f57017j, 0L), 0L, -1L);
        }

        @Override // E2.k.a
        public long g(long j10) {
            if (this.f4277f != null) {
                return r0.size();
            }
            long j11 = this.f4284l;
            if (j11 != -1) {
                return (j11 - this.f4275d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return R9.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f4273b)), BigInteger.valueOf(this.f4276e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // E2.k.a
        public i k(j jVar, long j10) {
            List list = this.f4277f;
            long j11 = list != null ? ((d) list.get((int) (j10 - this.f4275d))).f4285a : (j10 - this.f4275d) * this.f4276e;
            n nVar = this.f4283k;
            C6109x c6109x = jVar.f4259b;
            return new i(nVar.a(c6109x.f57008a, j10, c6109x.f57017j, j11), 0L, -1L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        final long f4285a;

        /* JADX INFO: renamed from: b */
        final long f4286b;

        public d(long j10, long j11) {
            this.f4285a = j10;
            this.f4286b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f4285a == dVar.f4285a && this.f4286b == dVar.f4286b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f4285a) * 31) + ((int) this.f4286b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f4272a = iVar;
        this.f4273b = j10;
        this.f4274c = j11;
    }

    public i a(j jVar) {
        return this.f4272a;
    }

    public long b() {
        return a0.m1(this.f4274c, 1000000L, this.f4273b);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e extends k {

        /* JADX INFO: renamed from: d */
        final long f4287d;

        /* JADX INFO: renamed from: e */
        final long f4288e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f4287d = j12;
            this.f4288e = j13;
        }

        public i c() {
            long j10 = this.f4288e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f4287d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
