package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.n0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: f */
    private static final i0 f29337f = new i0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    private int f29338a;

    /* JADX INFO: renamed from: b */
    private int[] f29339b;

    /* JADX INFO: renamed from: c */
    private Object[] f29340c;

    /* JADX INFO: renamed from: d */
    private int f29341d;

    /* JADX INFO: renamed from: e */
    private boolean f29342e;

    private i0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f29339b;
        if (i10 > iArr.length) {
            int i11 = this.f29338a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f29339b = Arrays.copyOf(iArr, i10);
            this.f29340c = Arrays.copyOf(this.f29340c, i10);
        }
    }

    public static i0 c() {
        return f29337f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static i0 j(i0 i0Var, i0 i0Var2) {
        int i10 = i0Var.f29338a + i0Var2.f29338a;
        int[] iArrCopyOf = Arrays.copyOf(i0Var.f29339b, i10);
        System.arraycopy(i0Var2.f29339b, 0, iArrCopyOf, i0Var.f29338a, i0Var2.f29338a);
        Object[] objArrCopyOf = Arrays.copyOf(i0Var.f29340c, i10);
        System.arraycopy(i0Var2.f29340c, 0, objArrCopyOf, i0Var.f29338a, i0Var2.f29338a);
        return new i0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static i0 k() {
        return new i0();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, n0 n0Var) {
        int iA = m0.a(i10);
        int iB = m0.b(i10);
        if (iB == 0) {
            n0Var.A(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            n0Var.x(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            n0Var.j(iA, (AbstractC2802f) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(C2817v.e());
            }
            n0Var.c(iA, ((Integer) obj).intValue());
        } else if (n0Var.y() == n0.a.ASCENDING) {
            n0Var.D(iA);
            ((i0) obj).r(n0Var);
            n0Var.I(iA);
        } else {
            n0Var.I(iA);
            ((i0) obj).r(n0Var);
            n0Var.D(iA);
        }
    }

    void a() {
        if (!this.f29342e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iR;
        int i10 = this.f29341d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f29338a; i12++) {
            int i13 = this.f29339b[i12];
            int iA = m0.a(i13);
            int iB = m0.b(i13);
            if (iB == 0) {
                iR = AbstractC2805i.R(iA, ((Long) this.f29340c[i12]).longValue());
            } else if (iB == 1) {
                iR = AbstractC2805i.n(iA, ((Long) this.f29340c[i12]).longValue());
            } else if (iB == 2) {
                iR = AbstractC2805i.f(iA, (AbstractC2802f) this.f29340c[i12]);
            } else if (iB == 3) {
                iR = (AbstractC2805i.O(iA) * 2) + ((i0) this.f29340c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(C2817v.e());
                }
                iR = AbstractC2805i.l(iA, ((Integer) this.f29340c[i12]).intValue());
            }
            i11 += iR;
        }
        this.f29341d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f29341d;
        if (i10 != -1) {
            return i10;
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f29338a; i11++) {
            iD += AbstractC2805i.D(m0.a(this.f29339b[i11]), (AbstractC2802f) this.f29340c[i11]);
        }
        this.f29341d = iD;
        return iD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        int i10 = this.f29338a;
        return i10 == i0Var.f29338a && o(this.f29339b, i0Var.f29339b, i10) && l(this.f29340c, i0Var.f29340c, this.f29338a);
    }

    public void h() {
        if (this.f29342e) {
            this.f29342e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f29338a;
        return ((((527 + i10) * 31) + f(this.f29339b, i10)) * 31) + g(this.f29340c, this.f29338a);
    }

    i0 i(i0 i0Var) {
        if (i0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f29338a + i0Var.f29338a;
        b(i10);
        System.arraycopy(i0Var.f29339b, 0, this.f29339b, this.f29338a, i0Var.f29338a);
        System.arraycopy(i0Var.f29340c, 0, this.f29340c, this.f29338a, i0Var.f29338a);
        this.f29338a = i10;
        return this;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f29338a; i11++) {
            M.d(sb2, i10, String.valueOf(m0.a(this.f29339b[i11])), this.f29340c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f29338a + 1);
        int[] iArr = this.f29339b;
        int i11 = this.f29338a;
        iArr[i11] = i10;
        this.f29340c[i11] = obj;
        this.f29338a = i11 + 1;
    }

    void p(n0 n0Var) {
        if (n0Var.y() == n0.a.DESCENDING) {
            for (int i10 = this.f29338a - 1; i10 >= 0; i10--) {
                n0Var.b(m0.a(this.f29339b[i10]), this.f29340c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f29338a; i11++) {
            n0Var.b(m0.a(this.f29339b[i11]), this.f29340c[i11]);
        }
    }

    public void r(n0 n0Var) {
        if (this.f29338a == 0) {
            return;
        }
        if (n0Var.y() == n0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f29338a; i10++) {
                q(this.f29339b[i10], this.f29340c[i10], n0Var);
            }
            return;
        }
        for (int i11 = this.f29338a - 1; i11 >= 0; i11--) {
            q(this.f29339b[i11], this.f29340c[i11], n0Var);
        }
    }

    private i0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f29341d = -1;
        this.f29338a = i10;
        this.f29339b = iArr;
        this.f29340c = objArr;
        this.f29342e = z10;
    }
}
