package P2;

import P2.A;
import P9.AbstractC2011u;
import P9.AbstractC2014x;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q2.C6109x;
import q2.a0;
import t2.AbstractC6635w;
import t2.InterfaceC6623j;

/* JADX INFO: renamed from: P2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C1984a extends AbstractC1986c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q2.d f13281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f13282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f13283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f13284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f13285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f13286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f13287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f13288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC2011u f13289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC6623j f13290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f13291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f13292t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f13293u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f13294v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private N2.m f13295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f13296x;

    /* JADX INFO: renamed from: P2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0213a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f13297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f13298b;

        public C0213a(long j10, long j11) {
            this.f13297a = j10;
            this.f13298b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0213a)) {
                return false;
            }
            C0213a c0213a = (C0213a) obj;
            return this.f13297a == c0213a.f13297a && this.f13298b == c0213a.f13298b;
        }

        public int hashCode() {
            return (((int) this.f13297a) * 31) + ((int) this.f13298b);
        }
    }

    /* JADX INFO: renamed from: P2.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements A.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f13301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f13302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f13303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f13304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f13305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final InterfaceC6623j f13306h;

        public b() {
            this(ColorExtractionConstants.MAX_PIXEL_SAMPLES, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // P2.A.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final P2.A[] a(P2.A.a[] r10, Q2.d r11, M2.D.b r12, q2.Y r13) {
            /*
                r9 = this;
                P9.u r12 = P2.C1984a.u(r10)
                int r13 = r10.length
                P2.A[] r13 = new P2.A[r13]
                r0 = 0
                r1 = r0
            L9:
                int r2 = r10.length
                if (r1 >= r2) goto L40
                r2 = r10[r1]
                if (r2 == 0) goto L15
                int[] r5 = r2.f13261b
                int r3 = r5.length
                if (r3 != 0) goto L17
            L15:
                r7 = r11
                goto L3c
            L17:
                int r3 = r5.length
                r4 = 1
                if (r3 != r4) goto L28
                P2.B r3 = new P2.B
                q2.a0 r4 = r2.f13260a
                r5 = r5[r0]
                int r2 = r2.f13262c
                r3.<init>(r4, r5, r2)
                r7 = r11
                goto L3a
            L28:
                q2.a0 r4 = r2.f13260a
                int r6 = r2.f13262c
                java.lang.Object r2 = r12.get(r1)
                r8 = r2
                P9.u r8 = (P9.AbstractC2011u) r8
                r3 = r9
                r7 = r11
                P2.a r11 = r3.b(r4, r5, r6, r7, r8)
                r3 = r11
            L3a:
                r13[r1] = r3
            L3c:
                int r1 = r1 + 1
                r11 = r7
                goto L9
            L40:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: P2.C1984a.b.a(P2.A$a[], Q2.d, M2.D$b, q2.Y):P2.A[]");
        }

        protected C1984a b(a0 a0Var, int[] iArr, int i10, Q2.d dVar, AbstractC2011u abstractC2011u) {
            return new C1984a(a0Var, iArr, i10, dVar, this.f13299a, this.f13300b, this.f13301c, this.f13302d, this.f13303e, this.f13304f, this.f13305g, abstractC2011u, this.f13306h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, InterfaceC6623j.f60596a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, InterfaceC6623j interfaceC6623j) {
            this.f13299a = i10;
            this.f13300b = i11;
            this.f13301c = i12;
            this.f13302d = i13;
            this.f13303e = i14;
            this.f13304f = f10;
            this.f13305g = f11;
            this.f13306h = interfaceC6623j;
        }
    }

    protected C1984a(a0 a0Var, int[] iArr, int i10, Q2.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, InterfaceC6623j interfaceC6623j) {
        long j13;
        super(a0Var, iArr, i10);
        if (j12 < j10) {
            AbstractC6635w.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f13281i = dVar;
        this.f13282j = j10 * 1000;
        this.f13283k = j11 * 1000;
        this.f13284l = j13 * 1000;
        this.f13285m = i11;
        this.f13286n = i12;
        this.f13287o = f10;
        this.f13288p = f11;
        this.f13289q = AbstractC2011u.w(list);
        this.f13290r = interfaceC6623j;
        this.f13291s = 1.0f;
        this.f13293u = 0;
        this.f13294v = -9223372036854775807L;
        this.f13296x = -2147483647L;
    }

    private long A(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        N2.m mVar = (N2.m) AbstractC2014x.d(list);
        long j10 = mVar.f12611g;
        if (j10 != -9223372036854775807L) {
            long j11 = mVar.f12612h;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
        }
        return -9223372036854775807L;
    }

    private long C(N2.n[] nVarArr, List list) {
        int i10 = this.f13292t;
        if (i10 < nVarArr.length && nVarArr[i10].next()) {
            N2.n nVar = nVarArr[this.f13292t];
            return nVar.b() - nVar.a();
        }
        for (N2.n nVar2 : nVarArr) {
            if (nVar2.next()) {
                return nVar2.b() - nVar2.a();
            }
        }
        return A(list);
    }

    private static long[][] D(A.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            A.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f13261b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f13261b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f13260a.c(iArr[i11]).f57017j;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static AbstractC2011u E(long[][] jArr) {
        P9.z zVarE = P9.E.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    zVarE.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return AbstractC2011u.w(zVarE.values());
    }

    private long F(long j10) {
        long jD = this.f13281i.d();
        this.f13296x = jD;
        long j11 = (long) (jD * this.f13287o);
        long jA = this.f13281i.a();
        if (jA == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (j11 / this.f13291s);
        }
        float f10 = j10;
        return (long) ((j11 * Math.max((f10 / this.f13291s) - jA, 0.0f)) / f10);
    }

    private long G(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f13282j;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (j10 * this.f13288p), this.f13282j);
    }

    private static void v(List list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            AbstractC2011u.a aVar = (AbstractC2011u.a) list.get(i10);
            if (aVar != null) {
                aVar.a(new C0213a(j10, jArr[i10]));
            }
        }
    }

    private int x(long j10, long j11) {
        long jZ = z(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f13308b; i11++) {
            if (j10 == Long.MIN_VALUE || !a(i11, j10)) {
                C6109x c6109xD = d(i11);
                if (w(c6109xD, c6109xD.f57017j, jZ)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC2011u y(A.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (A.a aVar : aVarArr) {
            if (aVar == null || aVar.f13261b.length <= 1) {
                arrayList.add(null);
            } else {
                AbstractC2011u.a aVarT = AbstractC2011u.t();
                aVarT.a(new C0213a(0L, 0L));
                arrayList.add(aVarT);
            }
        }
        long[][] jArrD = D(aVarArr);
        int[] iArr = new int[jArrD.length];
        long[] jArr = new long[jArrD.length];
        for (int i10 = 0; i10 < jArrD.length; i10++) {
            long[] jArr2 = jArrD[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        v(arrayList, jArr);
        AbstractC2011u abstractC2011uE = E(jArrD);
        for (int i11 = 0; i11 < abstractC2011uE.size(); i11++) {
            int iIntValue = ((Integer) abstractC2011uE.get(i11)).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrD[iIntValue][i12];
            v(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        v(arrayList, jArr);
        AbstractC2011u.a aVarT2 = AbstractC2011u.t();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            AbstractC2011u.a aVar2 = (AbstractC2011u.a) arrayList.get(i14);
            aVarT2.a(aVar2 == null ? AbstractC2011u.A() : aVar2.k());
        }
        return aVarT2.k();
    }

    private long z(long j10) {
        long jF = F(j10);
        if (this.f13289q.isEmpty()) {
            return jF;
        }
        int i10 = 1;
        while (i10 < this.f13289q.size() - 1 && ((C0213a) this.f13289q.get(i10)).f13297a < jF) {
            i10++;
        }
        C0213a c0213a = (C0213a) this.f13289q.get(i10 - 1);
        C0213a c0213a2 = (C0213a) this.f13289q.get(i10);
        long j11 = c0213a.f13297a;
        float f10 = (jF - j11) / (c0213a2.f13297a - j11);
        return c0213a.f13298b + ((long) (f10 * (c0213a2.f13298b - r2)));
    }

    protected long B() {
        return this.f13284l;
    }

    protected boolean H(long j10, List list) {
        long j11 = this.f13294v;
        if (j11 == -9223372036854775807L || j10 - j11 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((N2.m) AbstractC2014x.d(list)).equals(this.f13295w)) ? false : true;
    }

    @Override // P2.A
    public int b() {
        return this.f13292t;
    }

    @Override // P2.AbstractC1986c, P2.A
    public void disable() {
        this.f13295w = null;
    }

    @Override // P2.AbstractC1986c, P2.A
    public void enable() {
        this.f13294v = -9223372036854775807L;
        this.f13295w = null;
    }

    @Override // P2.AbstractC1986c, P2.A
    public void h(float f10) {
        this.f13291s = f10;
    }

    @Override // P2.A
    public Object i() {
        return null;
    }

    @Override // P2.A
    public void k(long j10, long j11, long j12, List list, N2.n[] nVarArr) {
        long jC = this.f13290r.c();
        long jC2 = C(nVarArr, list);
        int i10 = this.f13293u;
        if (i10 == 0) {
            this.f13293u = 1;
            this.f13292t = x(jC, jC2);
            return;
        }
        int i11 = this.f13292t;
        int iE = list.isEmpty() ? -1 : e(((N2.m) AbstractC2014x.d(list)).f12608d);
        if (iE != -1) {
            i10 = ((N2.m) AbstractC2014x.d(list)).f12609e;
            i11 = iE;
        }
        int iX = x(jC, jC2);
        if (iX != i11 && !a(i11, jC)) {
            C6109x c6109xD = d(i11);
            C6109x c6109xD2 = d(iX);
            long jG = G(j12, jC2);
            int i12 = c6109xD2.f57017j;
            int i13 = c6109xD.f57017j;
            if ((i12 > i13 && j11 < jG) || (i12 < i13 && j11 >= this.f13283k)) {
                iX = i11;
            }
        }
        if (iX != i11) {
            i10 = 3;
        }
        this.f13293u = i10;
        this.f13292t = iX;
    }

    @Override // P2.AbstractC1986c, P2.A
    public int o(long j10, List list) {
        int i10;
        int i11;
        long jC = this.f13290r.c();
        if (!H(jC, list)) {
            return list.size();
        }
        this.f13294v = jC;
        this.f13295w = list.isEmpty() ? null : (N2.m) AbstractC2014x.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jP0 = t2.a0.p0(((N2.m) list.get(size - 1)).f12611g - j10, this.f13291s);
        long jB = B();
        if (jP0 >= jB) {
            C6109x c6109xD = d(x(jC, A(list)));
            for (int i12 = 0; i12 < size; i12++) {
                N2.m mVar = (N2.m) list.get(i12);
                C6109x c6109x = mVar.f12608d;
                if (t2.a0.p0(mVar.f12611g - j10, this.f13291s) >= jB && c6109x.f57017j < c6109xD.f57017j && (i10 = c6109x.f57030w) != -1 && i10 <= this.f13286n && (i11 = c6109x.f57029v) != -1 && i11 <= this.f13285m && i10 < c6109xD.f57030w) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // P2.A
    public int r() {
        return this.f13293u;
    }

    protected boolean w(C6109x c6109x, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
