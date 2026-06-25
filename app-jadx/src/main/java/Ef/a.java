package Ef;

import Df.r;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5873i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0060a f5961b = new C0060a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f5962c = p(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f5963d = c.j(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f5964e = c.j(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f5965a;

    /* JADX INFO: renamed from: Ef.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0060a {
        public /* synthetic */ C0060a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f5963d;
        }

        public final long b() {
            return a.f5962c;
        }

        public final long c(String value) {
            AbstractC5504s.h(value, "value");
            try {
                return c.p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        private C0060a() {
        }
    }

    private /* synthetic */ a(long j10) {
        this.f5965a = j10;
    }

    public static final int A(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (G(j10) ? c.n(D(j10) % ((long) 1000)) : D(j10) % ((long) 1000000000));
    }

    public static final int B(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (y(j10) % ((long) 60));
    }

    private static final d C(long j10) {
        return H(j10) ? d.f5968b : d.f5970d;
    }

    private static final long D(long j10) {
        return j10 >> 1;
    }

    public static int E(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean F(long j10) {
        return !I(j10);
    }

    private static final boolean G(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean H(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean I(long j10) {
        return j10 == f5963d || j10 == f5964e;
    }

    public static final boolean J(long j10) {
        return j10 < 0;
    }

    public static final boolean K(long j10) {
        return j10 > 0;
    }

    public static final long L(long j10, long j11) {
        if (I(j10)) {
            if (F(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (I(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return G(j10) ? c(j10, D(j10), D(j11)) : c(j10, D(j11), D(j10));
        }
        long jD = D(j10) + D(j11);
        return H(j10) ? c.m(jD) : c.k(jD);
    }

    public static final long M(long j10, int i10) {
        if (I(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : R(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return f5962c;
        }
        long jD = D(j10);
        long j11 = i10;
        long j12 = jD * j11;
        if (!H(j10)) {
            return j12 / j11 == jD ? c.j(AbstractC5874j.p(j12, new C5873i(-4611686018427387903L, 4611686018427387903L))) : AbstractC5466a.b(jD) * AbstractC5466a.a(i10) > 0 ? f5963d : f5964e;
        }
        if (-2147483647L <= jD && jD < 2147483648L) {
            return c.l(j12);
        }
        if (j12 / j11 == jD) {
            return c.m(j12);
        }
        long jO = c.o(jD);
        long j13 = jO * j11;
        long jO2 = c.o((jD - c.n(jO)) * j11) + j13;
        return (j13 / j11 != jO || (jO2 ^ j13) < 0) ? AbstractC5466a.b(jD) * AbstractC5466a.a(i10) > 0 ? f5963d : f5964e : c.j(AbstractC5874j.p(jO2, new C5873i(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final double N(long j10, d unit) {
        AbstractC5504s.h(unit, "unit");
        if (j10 == f5963d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f5964e) {
            return Double.NEGATIVE_INFINITY;
        }
        return e.a(D(j10), C(j10), unit);
    }

    public static final String O(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (J(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jR = r(j10);
        long jU = u(jR);
        int iZ = z(jR);
        int iB = B(jR);
        int iA = A(jR);
        long j11 = I(j10) ? 9999999999999L : jU;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iB == 0 && iA == 0) ? false : true;
        if (iZ != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iZ);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            h(j10, sb2, iB, iA, 9, "S", true);
        }
        return sb2.toString();
    }

    public static final long P(long j10, d unit) {
        AbstractC5504s.h(unit, "unit");
        if (j10 == f5963d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f5964e) {
            return Long.MIN_VALUE;
        }
        return e.b(D(j10), C(j10), unit);
    }

    public static String Q(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f5963d) {
            return "Infinity";
        }
        if (j10 == f5964e) {
            return "-Infinity";
        }
        boolean zJ = J(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zJ) {
            sb2.append('-');
        }
        long jR = r(j10);
        long jT = t(jR);
        int iS = s(jR);
        int iZ = z(jR);
        int iB = B(jR);
        int iA = A(jR);
        int i10 = 0;
        boolean z10 = jT != 0;
        boolean z11 = iS != 0;
        boolean z12 = iZ != 0;
        boolean z13 = (iB == 0 && iA == 0) ? false : true;
        if (z10) {
            sb2.append(jT);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iS);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iZ);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iB != 0 || z10 || z11 || z12) {
                h(j10, sb2, iB, iA, 9, "s", false);
            } else if (iA >= 1000000) {
                h(j10, sb2, iA / 1000000, iA % 1000000, 6, "ms", false);
            } else if (iA >= 1000) {
                h(j10, sb2, iA / 1000, iA % 1000, 3, "us", false);
            } else {
                sb2.append(iA);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zJ && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long R(long j10) {
        return c.i(-D(j10), ((int) j10) & 1);
    }

    private static final long c(long j10, long j11, long j12) {
        long jO = c.o(j12);
        long j13 = j11 + jO;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return c.j(AbstractC5874j.o(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j13) + (j12 - c.n(jO)));
    }

    private static final void h(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
            String strU0 = r.u0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strU0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strU0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strU0, 0, ((i13 + 3) / 3) * 3);
                AbstractC5504s.g(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strU0, 0, i15);
                AbstractC5504s.g(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a k(long j10) {
        return new a(j10);
    }

    public static int n(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return AbstractC5504s.j(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return J(j10) ? -i10 : i10;
    }

    public static long p(long j10) {
        if (!b.a()) {
            return j10;
        }
        if (H(j10)) {
            long jD = D(j10);
            if (-4611686018426999999L <= jD && jD < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(D(j10) + " ns is out of nanoseconds range");
        }
        long jD2 = D(j10);
        if (-4611686018427387903L > jD2 || jD2 >= 4611686018427387904L) {
            throw new AssertionError(D(j10) + " ms is out of milliseconds range");
        }
        long jD3 = D(j10);
        if (-4611686018426L > jD3 || jD3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(D(j10) + " ms is denormalized");
    }

    public static boolean q(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).S();
    }

    public static final long r(long j10) {
        return J(j10) ? R(j10) : j10;
    }

    public static final int s(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (u(j10) % ((long) 24));
    }

    public static final long t(long j10) {
        return P(j10, d.f5974h);
    }

    public static final long u(long j10) {
        return P(j10, d.f5973g);
    }

    public static final long v(long j10) {
        return P(j10, d.f5969c);
    }

    public static final long w(long j10) {
        return (G(j10) && F(j10)) ? D(j10) : P(j10, d.f5970d);
    }

    public static final long x(long j10) {
        return P(j10, d.f5972f);
    }

    public static final long y(long j10) {
        return P(j10, d.f5971e);
    }

    public static final int z(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (x(j10) % ((long) 60));
    }

    public final /* synthetic */ long S() {
        return this.f5965a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m(((a) obj).S());
    }

    public boolean equals(Object obj) {
        return q(this.f5965a, obj);
    }

    public int hashCode() {
        return E(this.f5965a);
    }

    public int m(long j10) {
        return n(this.f5965a, j10);
    }

    public String toString() {
        return Q(this.f5965a);
    }
}
