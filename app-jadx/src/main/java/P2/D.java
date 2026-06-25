package P2;

import A2.N;
import M2.D;
import M2.n0;
import android.util.Pair;
import androidx.media3.exoplayer.O0;
import java.util.Arrays;
import java.util.Objects;
import q2.Y;
import q2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class D extends G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f13266c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f13268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f13269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final n0[] f13270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f13271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f13272f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final n0 f13273g;

        a(String[] strArr, int[] iArr, n0[] n0VarArr, int[] iArr2, int[][][] iArr3, n0 n0Var) {
            this.f13268b = strArr;
            this.f13269c = iArr;
            this.f13270d = n0VarArr;
            this.f13272f = iArr3;
            this.f13271e = iArr2;
            this.f13273g = n0Var;
            this.f13267a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f13270d[i10].b(i11).f56702a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iG = g(i10, i11, i14);
                if (iG == 4 || (z10 && iG == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f13270d[i10].b(i11).c(iArr[i12]).f57022o;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, O0.s(this.f13272f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f13271e[i10]) : iMin;
        }

        public int c(int i10, int i11, int i12) {
            return this.f13272f[i10][i11][i12];
        }

        public int d() {
            return this.f13267a;
        }

        public int e(int i10) {
            return this.f13269c[i10];
        }

        public n0 f(int i10) {
            return this.f13270d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return O0.Q(c(i10, i11, i12));
        }

        public n0 h() {
            return this.f13273g;
        }
    }

    private static int n(O0[] o0Arr, a0 a0Var, int[] iArr, boolean z10) {
        int length = o0Arr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < o0Arr.length; i11++) {
            O0 o02 = o0Arr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < a0Var.f56702a; i12++) {
                iMax = Math.max(iMax, O0.Q(o02.b(a0Var.c(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    private static int[] o(O0 o02, a0 a0Var) {
        int[] iArr = new int[a0Var.f56702a];
        for (int i10 = 0; i10 < a0Var.f56702a; i10++) {
            iArr[i10] = o02.b(a0Var.c(i10));
        }
        return iArr;
    }

    private static int[] p(O0[] o0Arr) {
        int length = o0Arr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = o0Arr[i10].L();
        }
        return iArr;
    }

    @Override // P2.G
    public final void i(Object obj) {
        this.f13266c = (a) obj;
    }

    @Override // P2.G
    public final H k(O0[] o0Arr, n0 n0Var, D.b bVar, Y y10) {
        int[] iArr = new int[o0Arr.length + 1];
        int length = o0Arr.length + 1;
        a0[][] a0VarArr = new a0[length][];
        int[][][] iArr2 = new int[o0Arr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = n0Var.f12003a;
            a0VarArr[i10] = new a0[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrP = p(o0Arr);
        for (int i12 = 0; i12 < n0Var.f12003a; i12++) {
            a0 a0VarB = n0Var.b(i12);
            int iN = n(o0Arr, a0VarB, iArr, a0VarB.f56704c == 5);
            int[] iArrO = iN == o0Arr.length ? new int[a0VarB.f56702a] : o(o0Arr[iN], a0VarB);
            int i13 = iArr[iN];
            a0VarArr[iN][i13] = a0VarB;
            iArr2[iN][i13] = iArrO;
            iArr[iN] = i13 + 1;
        }
        n0[] n0VarArr = new n0[o0Arr.length];
        String[] strArr = new String[o0Arr.length];
        int[] iArr3 = new int[o0Arr.length];
        for (int i14 = 0; i14 < o0Arr.length; i14++) {
            int i15 = iArr[i14];
            n0VarArr[i14] = new n0((a0[]) t2.a0.b1(a0VarArr[i14], i15));
            iArr2[i14] = (int[][]) t2.a0.b1(iArr2[i14], i15);
            strArr[i14] = o0Arr[i14].getName();
            iArr3[i14] = o0Arr[i14].f();
        }
        a aVar = new a(strArr, iArr3, n0VarArr, iArrP, iArr2, new n0((a0[]) t2.a0.b1(a0VarArr[o0Arr.length], iArr[o0Arr.length])));
        Pair pairQ = q(aVar, iArr2, iArrP, bVar, y10);
        return new H((N[]) pairQ.first, (A[]) pairQ.second, F.a(aVar, (E[]) pairQ.second), aVar);
    }

    protected abstract Pair q(a aVar, int[][][] iArr, int[] iArr2, D.b bVar, Y y10);
}
