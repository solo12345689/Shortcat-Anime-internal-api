package xa;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z {

    /* JADX INFO: renamed from: f */
    private static final Z f64118f = new Z(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    private int f64119a;

    /* JADX INFO: renamed from: b */
    private int[] f64120b;

    /* JADX INFO: renamed from: c */
    private Object[] f64121c;

    /* JADX INFO: renamed from: d */
    private int f64122d;

    /* JADX INFO: renamed from: e */
    private boolean f64123e;

    private Z() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f64120b;
        if (i10 > iArr.length) {
            int i11 = this.f64119a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f64120b = Arrays.copyOf(iArr, i10);
            this.f64121c = Arrays.copyOf(this.f64121c, i10);
        }
    }

    public static Z c() {
        return f64118f;
    }

    private static int d(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int e(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static Z h(Z z10, Z z11) {
        int i10 = z10.f64119a + z11.f64119a;
        int[] iArrCopyOf = Arrays.copyOf(z10.f64120b, i10);
        System.arraycopy(z11.f64120b, 0, iArrCopyOf, z10.f64119a, z11.f64119a);
        Object[] objArrCopyOf = Arrays.copyOf(z10.f64121c, i10);
        System.arraycopy(z11.f64121c, 0, objArrCopyOf, z10.f64119a, z11.f64119a);
        return new Z(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static Z i() {
        return new Z();
    }

    private static boolean j(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean m(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    void a() {
        if (!this.f64123e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        int i10 = this.f64119a;
        return i10 == z10.f64119a && m(this.f64120b, z10.f64120b, i10) && j(this.f64121c, z10.f64121c, this.f64119a);
    }

    public void f() {
        if (this.f64123e) {
            this.f64123e = false;
        }
    }

    Z g(Z z10) {
        if (z10.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f64119a + z10.f64119a;
        b(i10);
        System.arraycopy(z10.f64120b, 0, this.f64120b, this.f64119a, z10.f64119a);
        System.arraycopy(z10.f64121c, 0, this.f64121c, this.f64119a, z10.f64119a);
        this.f64119a = i10;
        return this;
    }

    public int hashCode() {
        int i10 = this.f64119a;
        return ((((527 + i10) * 31) + d(this.f64120b, i10)) * 31) + e(this.f64121c, this.f64119a);
    }

    final void k(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f64119a; i11++) {
            AbstractC7072F.d(sb2, i10, String.valueOf(e0.a(this.f64120b[i11])), this.f64121c[i11]);
        }
    }

    void l(int i10, Object obj) {
        a();
        b(this.f64119a + 1);
        int[] iArr = this.f64120b;
        int i11 = this.f64119a;
        iArr[i11] = i10;
        this.f64121c[i11] = obj;
        this.f64119a = i11 + 1;
    }

    private Z(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f64122d = -1;
        this.f64119a = i10;
        this.f64120b = iArr;
        this.f64121c = objArr;
        this.f64123e = z10;
    }
}
