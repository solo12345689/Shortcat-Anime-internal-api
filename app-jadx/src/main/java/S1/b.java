package s1;

import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.Constants;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import m1.C5625d;
import t1.AbstractC6599l;
import t1.C6592e;
import t1.C6593f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class b extends AbstractC6599l {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    C6593f f59004a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private C6592e[] f59005b1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f59007d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f59008e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f59009f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f59010g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private float f59011h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private float f59012i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private String f59013j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private String f59014k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private String f59015l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private String f59016m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f59017n1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean[][] f59019p1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int[][] f59021r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f59022s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private int[][] f59023t1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private boolean f59006c1 = false;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f59018o1 = 0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    Set f59020q1 = new HashSet();

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private int f59024u1 = 0;

    public b() {
        t2();
        Y1();
    }

    public static /* synthetic */ int L1(String str, String str2) {
        return Integer.parseInt(str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)[0]) - Integer.parseInt(str2.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)[0]);
    }

    private void M1() {
        h2();
        g2();
        N1();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void N1() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f60494M0
            if (r1 >= r2) goto L73
            java.util.Set r2 = r10.f59020q1
            t1.e[] r3 = r10.f60493L0
            r3 = r3[r1]
            java.lang.String r3 = r3.f60381o
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L15
            goto L70
        L15:
            int r2 = r10.U1()
            int r5 = r10.V1(r2)
            int r6 = r10.T1(r2)
            r3 = -1
            if (r2 != r3) goto L25
            goto L73
        L25:
            boolean r3 = r10.b2()
            if (r3 == 0) goto L66
            int[][] r3 = r10.f59023t1
            if (r3 == 0) goto L66
            int r4 = r10.f59024u1
            int r7 = r3.length
            if (r4 >= r7) goto L66
            r3 = r3[r4]
            r4 = r3[r0]
            if (r4 != r2) goto L66
            boolean[][] r2 = r10.f59019p1
            r2 = r2[r5]
            r9 = 1
            r2[r6] = r9
            r2 = r3[r9]
            r4 = 2
            r3 = r3[r4]
            boolean r2 = r10.a2(r5, r6, r2, r3)
            if (r2 != 0) goto L4d
            goto L70
        L4d:
            t1.e[] r2 = r10.f60493L0
            r2 = r2[r1]
            int[][] r3 = r10.f59023t1
            int r7 = r10.f59024u1
            r3 = r3[r7]
            r7 = r3[r9]
            r8 = r3[r4]
            r3 = r10
            r4 = r2
            r3.Q1(r4, r5, r6, r7, r8)
            int r2 = r3.f59024u1
            int r2 = r2 + r9
            r3.f59024u1 = r2
            goto L70
        L66:
            r3 = r10
            t1.e[] r2 = r3.f60493L0
            r4 = r2[r1]
            r7 = 1
            r8 = 1
            r3.Q1(r4, r5, r6, r7, r8)
        L70:
            int r1 = r1 + 1
            goto L2
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.b.N1():void");
    }

    private void O1(C6592e c6592e) {
        c6592e.N0(-1.0f);
        c6592e.f60341O.q();
        c6592e.f60343Q.q();
    }

    private void P1(C6592e c6592e) {
        c6592e.e1(-1.0f);
        c6592e.f60342P.q();
        c6592e.f60344R.q();
        c6592e.f60345S.q();
    }

    private void Q1(C6592e c6592e, int i10, int i11, int i12, int i13) {
        c6592e.f60341O.a(this.f59005b1[i11].f60341O, 0);
        c6592e.f60342P.a(this.f59005b1[i10].f60342P, 0);
        c6592e.f60343Q.a(this.f59005b1[(i11 + i13) - 1].f60343Q, 0);
        c6592e.f60344R.a(this.f59005b1[(i10 + i12) - 1].f60344R, 0);
    }

    private void R1() {
        int iMax = Math.max(this.f59007d1, this.f59009f1);
        C6592e[] c6592eArr = this.f59005b1;
        int i10 = 0;
        if (c6592eArr == null) {
            this.f59005b1 = new C6592e[iMax];
            while (true) {
                C6592e[] c6592eArr2 = this.f59005b1;
                if (i10 >= c6592eArr2.length) {
                    return;
                }
                c6592eArr2[i10] = d2();
                i10++;
            }
        } else {
            if (iMax == c6592eArr.length) {
                return;
            }
            C6592e[] c6592eArr3 = new C6592e[iMax];
            while (i10 < iMax) {
                C6592e[] c6592eArr4 = this.f59005b1;
                if (i10 < c6592eArr4.length) {
                    c6592eArr3[i10] = c6592eArr4[i10];
                } else {
                    c6592eArr3[i10] = d2();
                }
                i10++;
            }
            while (true) {
                C6592e[] c6592eArr5 = this.f59005b1;
                if (iMax >= c6592eArr5.length) {
                    this.f59005b1 = c6592eArr3;
                    return;
                } else {
                    this.f59004a1.q1(c6592eArr5[iMax]);
                    iMax++;
                }
            }
        }
    }

    private void S1(boolean z10) {
        int[][] iArrE2;
        int[][] iArrE22;
        if (z10) {
            for (int i10 = 0; i10 < this.f59019p1.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f59019p1;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            for (int i12 = 0; i12 < this.f59021r1.length; i12++) {
                int i13 = 0;
                while (true) {
                    int[][] iArr = this.f59021r1;
                    if (i13 < iArr[0].length) {
                        iArr[i12][i13] = -1;
                        i13++;
                    }
                }
            }
        }
        this.f59018o1 = 0;
        String str = this.f59016m1;
        if (str != null && !str.trim().isEmpty() && (iArrE22 = e2(this.f59016m1, false)) != null) {
            W1(iArrE22);
        }
        String str2 = this.f59015l1;
        if (str2 == null || str2.trim().isEmpty() || (iArrE2 = e2(this.f59015l1, true)) == null) {
            return;
        }
        X1(iArrE2);
    }

    private int T1(int i10) {
        return this.f59017n1 == 1 ? i10 / this.f59007d1 : i10 % this.f59009f1;
    }

    private int U1() {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10 = this.f59018o1;
            if (i10 >= this.f59007d1 * this.f59009f1) {
                return -1;
            }
            int iV1 = V1(i10);
            int iT1 = T1(this.f59018o1);
            boolean[] zArr = this.f59019p1[iV1];
            if (zArr[iT1]) {
                zArr[iT1] = false;
                z10 = true;
            }
            this.f59018o1++;
        }
        return i10;
    }

    private int V1(int i10) {
        return this.f59017n1 == 1 ? i10 % this.f59007d1 : i10 / this.f59009f1;
    }

    private void W1(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!a2(V1(iArr2[0]), T1(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void X1(int[][] iArr) {
        if (!b2()) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                int iV1 = V1(iArr[i10][0]);
                int iT1 = T1(iArr[i10][0]);
                int[] iArr2 = iArr[i10];
                if (!a2(iV1, iT1, iArr2[1], iArr2[2])) {
                    break;
                }
                C6592e c6592e = this.f60493L0[i10];
                int[] iArr3 = iArr[i10];
                Q1(c6592e, iV1, iT1, iArr3[1], iArr3[2]);
                this.f59020q1.add(this.f60493L0[i10].f60381o);
            }
        }
    }

    private void Y1() {
        boolean[][] zArr;
        int[][] iArr = this.f59021r1;
        boolean z10 = false;
        if (iArr != null && iArr.length == this.f60494M0 && (zArr = this.f59019p1) != null && zArr.length == this.f59007d1 && zArr[0].length == this.f59009f1) {
            z10 = true;
        }
        if (!z10) {
            Z1();
        }
        S1(z10);
    }

    private void Z1() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f59007d1, this.f59009f1);
        this.f59019p1 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.f60494M0;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.f59021r1 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean a2(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.f59019p1;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean b2() {
        return (this.f59022s1 & 2) > 0;
    }

    private boolean c2() {
        return (this.f59022s1 & 1) > 0;
    }

    private C6592e d2() {
        C6592e c6592e = new C6592e();
        C6592e.b[] bVarArr = c6592e.f60352Z;
        C6592e.b bVar = C6592e.b.MATCH_CONSTRAINT;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        c6592e.f60381o = String.valueOf(c6592e.hashCode());
        return c6592e;
    }

    private int[][] e2(String str, boolean z10) {
        try {
            String[] strArrSplit = str.split(f.f34694a);
            Arrays.sort(strArrSplit, new Comparator() { // from class: s1.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return b.L1((String) obj, (String) obj2);
                }
            });
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.f59007d1 != 1 && this.f59009f1 != 1) {
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    String[] strArrSplit2 = strArrSplit[i10].trim().split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i10][0] = Integer.parseInt(strArrSplit2[0]);
                    if (c2()) {
                        iArr[i10][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i10][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i10][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i10][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                String[] strArrSplit4 = strArrSplit[i13].trim().split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                iArr[i13][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i13];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.f59009f1 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i11 += iArr[i13][1];
                    if (z10) {
                        i11--;
                    }
                }
                if (this.f59007d1 == 1) {
                    iArr[i13][2] = Integer.parseInt(strArrSplit4[1]);
                    i12 += iArr[i13][2];
                    if (z10) {
                        i12--;
                    }
                }
            }
            if (i11 != 0 && !this.f59006c1) {
                o2(this.f59007d1 + i11);
            }
            if (i12 != 0 && !this.f59006c1) {
                j2(this.f59009f1 + i12);
            }
            this.f59006c1 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] f2(int i10, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(f.f34694a);
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < strArrSplit.length) {
                try {
                    fArr[i11] = Float.parseFloat(strArrSplit[i11]);
                } catch (Exception e10) {
                    System.err.println("Error parsing `" + strArrSplit[i11] + "`: " + e10.getMessage());
                    fArr[i11] = 1.0f;
                }
            } else {
                fArr[i11] = 1.0f;
            }
        }
        return fArr;
    }

    private void g2() {
        int i10;
        int iMax = Math.max(this.f59007d1, this.f59009f1);
        C6592e c6592e = this.f59005b1[0];
        float[] fArrF2 = f2(this.f59009f1, this.f59014k1);
        if (this.f59009f1 == 1) {
            O1(c6592e);
            c6592e.f60341O.a(this.f60341O, 0);
            c6592e.f60343Q.a(this.f60343Q, 0);
            return;
        }
        int i11 = 0;
        while (true) {
            i10 = this.f59009f1;
            if (i11 >= i10) {
                break;
            }
            C6592e c6592e2 = this.f59005b1[i11];
            O1(c6592e2);
            if (fArrF2 != null) {
                c6592e2.N0(fArrF2[i11]);
            }
            if (i11 > 0) {
                c6592e2.f60341O.a(this.f59005b1[i11 - 1].f60343Q, 0);
            } else {
                c6592e2.f60341O.a(this.f60341O, 0);
            }
            if (i11 < this.f59009f1 - 1) {
                c6592e2.f60343Q.a(this.f59005b1[i11 + 1].f60341O, 0);
            } else {
                c6592e2.f60343Q.a(this.f60343Q, 0);
            }
            if (i11 > 0) {
                c6592e2.f60341O.f60303g = (int) this.f59011h1;
            }
            i11++;
        }
        while (i10 < iMax) {
            C6592e c6592e3 = this.f59005b1[i10];
            O1(c6592e3);
            c6592e3.f60341O.a(this.f60341O, 0);
            c6592e3.f60343Q.a(this.f60343Q, 0);
            i10++;
        }
    }

    private void h2() {
        int i10;
        int iMax = Math.max(this.f59007d1, this.f59009f1);
        C6592e c6592e = this.f59005b1[0];
        float[] fArrF2 = f2(this.f59007d1, this.f59013j1);
        if (this.f59007d1 == 1) {
            P1(c6592e);
            c6592e.f60342P.a(this.f60342P, 0);
            c6592e.f60344R.a(this.f60344R, 0);
            return;
        }
        int i11 = 0;
        while (true) {
            i10 = this.f59007d1;
            if (i11 >= i10) {
                break;
            }
            C6592e c6592e2 = this.f59005b1[i11];
            P1(c6592e2);
            if (fArrF2 != null) {
                c6592e2.e1(fArrF2[i11]);
            }
            if (i11 > 0) {
                c6592e2.f60342P.a(this.f59005b1[i11 - 1].f60344R, 0);
            } else {
                c6592e2.f60342P.a(this.f60342P, 0);
            }
            if (i11 < this.f59007d1 - 1) {
                c6592e2.f60344R.a(this.f59005b1[i11 + 1].f60342P, 0);
            } else {
                c6592e2.f60344R.a(this.f60344R, 0);
            }
            if (i11 > 0) {
                c6592e2.f60342P.f60303g = (int) this.f59012i1;
            }
            i11++;
        }
        while (i10 < iMax) {
            C6592e c6592e3 = this.f59005b1[i10];
            P1(c6592e3);
            c6592e3.f60342P.a(this.f60342P, 0);
            c6592e3.f60344R.a(this.f60344R, 0);
            i10++;
        }
    }

    private void s2(boolean z10) {
        int[][] iArrE2;
        if (this.f59007d1 < 1 || this.f59009f1 < 1) {
            return;
        }
        if (z10) {
            for (int i10 = 0; i10 < this.f59019p1.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f59019p1;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            this.f59020q1.clear();
        }
        this.f59018o1 = 0;
        String str = this.f59016m1;
        if (str != null && !str.trim().isEmpty() && (iArrE2 = e2(this.f59016m1, false)) != null) {
            W1(iArrE2);
        }
        String str2 = this.f59015l1;
        if (str2 != null && !str2.trim().isEmpty()) {
            this.f59023t1 = e2(this.f59015l1, true);
        }
        R1();
        int[][] iArr = this.f59023t1;
        if (iArr != null) {
            X1(iArr);
        }
    }

    private void t2() {
        int i10;
        int i11 = this.f59008e1;
        if (i11 != 0 && (i10 = this.f59010g1) != 0) {
            this.f59007d1 = i11;
            this.f59009f1 = i10;
            return;
        }
        int i12 = this.f59010g1;
        if (i12 > 0) {
            this.f59009f1 = i12;
            this.f59007d1 = ((this.f60494M0 + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.f59007d1 = i11;
            this.f59009f1 = ((this.f60494M0 + i11) - 1) / i11;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f60494M0) + 1.5d);
            this.f59007d1 = iSqrt;
            this.f59009f1 = ((this.f60494M0 + iSqrt) - 1) / iSqrt;
        }
    }

    @Override // t1.C6592e
    public void g(C5625d c5625d, boolean z10) {
        super.g(c5625d, z10);
        M1();
    }

    public void i2(String str) {
        String str2 = this.f59014k1;
        if (str2 == null || !str2.equals(str)) {
            this.f59014k1 = str;
        }
    }

    public void j2(int i10) {
        if (i10 <= 50 && this.f59010g1 != i10) {
            this.f59010g1 = i10;
            t2();
            Z1();
        }
    }

    public void k2(int i10) {
        this.f59022s1 = i10;
    }

    public void l2(float f10) {
        if (f10 >= 0.0f && this.f59011h1 != f10) {
            this.f59011h1 = f10;
        }
    }

    public void m2(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f59017n1 != i10) {
            this.f59017n1 = i10;
        }
    }

    public void n2(String str) {
        String str2 = this.f59013j1;
        if (str2 == null || !str2.equals(str)) {
            this.f59013j1 = str;
        }
    }

    public void o2(int i10) {
        if (i10 <= 50 && this.f59008e1 != i10) {
            this.f59008e1 = i10;
            t2();
            Z1();
        }
    }

    public void p2(String str) {
        String str2 = this.f59016m1;
        if (str2 == null || !str2.equals(str)) {
            this.f59006c1 = false;
            this.f59016m1 = str;
        }
    }

    public void q2(CharSequence charSequence) {
        String str = this.f59015l1;
        if (str == null || !str.equals(charSequence.toString())) {
            this.f59006c1 = false;
            this.f59015l1 = charSequence.toString();
        }
    }

    public void r2(float f10) {
        if (f10 >= 0.0f && this.f59012i1 != f10) {
            this.f59012i1 = f10;
        }
    }

    @Override // t1.AbstractC6599l
    public void y1(int i10, int i11, int i12, int i13) {
        super.y1(i10, i11, i12, i13);
        this.f59004a1 = (C6593f) L();
        s2(false);
        this.f59004a1.n1(this.f59005b1);
    }
}
