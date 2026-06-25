package C2;

import C2.P;
import U2.AbstractC2257s;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class W implements P.e {

    /* JADX INFO: renamed from: b */
    protected final int f2675b;

    /* JADX INFO: renamed from: c */
    protected final int f2676c;

    /* JADX INFO: renamed from: d */
    protected final int f2677d;

    /* JADX INFO: renamed from: e */
    protected final int f2678e;

    /* JADX INFO: renamed from: f */
    protected final int f2679f;

    /* JADX INFO: renamed from: g */
    public final int f2680g;

    /* JADX INFO: renamed from: h */
    public final int f2681h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        private int f2682a = 250000;

        /* JADX INFO: renamed from: b */
        private int f2683b = 750000;

        /* JADX INFO: renamed from: c */
        private int f2684c = 4;

        /* JADX INFO: renamed from: d */
        private int f2685d = 250000;

        /* JADX INFO: renamed from: e */
        private int f2686e = 50000000;

        /* JADX INFO: renamed from: f */
        private int f2687f = 2;

        /* JADX INFO: renamed from: g */
        private int f2688g = 4;

        public W h() {
            return new W(this);
        }
    }

    protected W(a aVar) {
        this.f2675b = aVar.f2682a;
        this.f2676c = aVar.f2683b;
        this.f2677d = aVar.f2684c;
        this.f2678e = aVar.f2685d;
        this.f2679f = aVar.f2686e;
        this.f2680g = aVar.f2687f;
        this.f2681h = aVar.f2688g;
    }

    protected static int b(int i10, int i11, int i12) {
        return S9.f.e(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    private static int d(int i10) {
        int iB = AbstractC2257s.b(i10);
        AbstractC6614a.g(iB != -2147483647);
        return iB;
    }

    @Override // C2.P.e
    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) c(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i10) {
        return S9.f.e((((long) this.f2679f) * ((long) d(i10))) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int f(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f2678e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lb
            int r1 = r3.f2680g
        L9:
            int r0 = r0 * r1
            goto L10
        Lb:
            if (r4 != r2) goto L10
            int r1 = r3.f2681h
            goto L9
        L10:
            r1 = -1
            if (r5 == r1) goto L1a
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = R9.d.b(r5, r2, r4)
            goto L1e
        L1a:
            int r4 = d(r4)
        L1e:
            long r0 = (long) r0
            long r4 = (long) r4
            long r0 = r0 * r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            int r4 = S9.f.e(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.W.f(int, int):int");
    }

    protected int g(int i10, int i11, int i12) {
        return t2.a0.r(i10 * this.f2677d, b(this.f2675b, i11, i12), b(this.f2676c, i11, i12));
    }
}
