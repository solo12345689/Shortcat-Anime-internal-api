package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3749w2 {

    /* JADX INFO: renamed from: f */
    private static final C3749w2 f40584f = new C3749w2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    private int f40585a;

    /* JADX INFO: renamed from: b */
    private int[] f40586b;

    /* JADX INFO: renamed from: c */
    private Object[] f40587c;

    /* JADX INFO: renamed from: d */
    private int f40588d = -1;

    /* JADX INFO: renamed from: e */
    private boolean f40589e;

    private C3749w2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f40585a = i10;
        this.f40586b = iArr;
        this.f40587c = objArr;
        this.f40589e = z10;
    }

    public static C3749w2 c() {
        return f40584f;
    }

    static C3749w2 e(C3749w2 c3749w2, C3749w2 c3749w22) {
        int i10 = c3749w2.f40585a + c3749w22.f40585a;
        int[] iArrCopyOf = Arrays.copyOf(c3749w2.f40586b, i10);
        System.arraycopy(c3749w22.f40586b, 0, iArrCopyOf, c3749w2.f40585a, c3749w22.f40585a);
        Object[] objArrCopyOf = Arrays.copyOf(c3749w2.f40587c, i10);
        System.arraycopy(c3749w22.f40587c, 0, objArrCopyOf, c3749w2.f40585a, c3749w22.f40585a);
        return new C3749w2(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static C3749w2 f() {
        return new C3749w2(0, new int[8], new Object[8], true);
    }

    private final void l(int i10) {
        int[] iArr = this.f40586b;
        if (i10 > iArr.length) {
            int i11 = this.f40585a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f40586b = Arrays.copyOf(iArr, i10);
            this.f40587c = Arrays.copyOf(this.f40587c, i10);
        }
    }

    public final int a() {
        int iC;
        int iD;
        int iC2;
        int i10 = this.f40588d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f40585a; i12++) {
            int i13 = this.f40586b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f40587c[i12]).getClass();
                    iC2 = AbstractC3744v1.c(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    AbstractC3710o1 abstractC3710o1 = (AbstractC3710o1) this.f40587c[i12];
                    int iC3 = AbstractC3744v1.c(i16);
                    int iD2 = abstractC3710o1.d();
                    iC2 = iC3 + AbstractC3744v1.c(iD2) + iD2;
                } else if (i15 == 3) {
                    int iC4 = AbstractC3744v1.c(i14 << 3);
                    iC = iC4 + iC4;
                    iD = ((C3749w2) this.f40587c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new Q1("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f40587c[i12]).getClass();
                    iC2 = AbstractC3744v1.c(i14 << 3) + 4;
                }
                i11 += iC2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f40587c[i12]).longValue();
                iC = AbstractC3744v1.c(i17);
                iD = AbstractC3744v1.d(jLongValue);
            }
            iC2 = iC + iD;
            i11 += iC2;
        }
        this.f40588d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f40588d;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.f40585a; i11++) {
            int i12 = this.f40586b[i11] >>> 3;
            AbstractC3710o1 abstractC3710o1 = (AbstractC3710o1) this.f40587c[i11];
            int iC2 = AbstractC3744v1.c(8);
            int iC3 = AbstractC3744v1.c(16) + AbstractC3744v1.c(i12);
            int iC4 = AbstractC3744v1.c(24);
            int iD = abstractC3710o1.d();
            iC += iC2 + iC2 + iC3 + iC4 + AbstractC3744v1.c(iD) + iD;
        }
        this.f40588d = iC;
        return iC;
    }

    final C3749w2 d(C3749w2 c3749w2) {
        if (c3749w2.equals(f40584f)) {
            return this;
        }
        g();
        int i10 = this.f40585a + c3749w2.f40585a;
        l(i10);
        System.arraycopy(c3749w2.f40586b, 0, this.f40586b, this.f40585a, c3749w2.f40585a);
        System.arraycopy(c3749w2.f40587c, 0, this.f40587c, this.f40585a, c3749w2.f40585a);
        this.f40585a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3749w2)) {
            return false;
        }
        C3749w2 c3749w2 = (C3749w2) obj;
        int i10 = this.f40585a;
        if (i10 == c3749w2.f40585a) {
            int[] iArr = this.f40586b;
            int[] iArr2 = c3749w2.f40586b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f40587c;
                    Object[] objArr2 = c3749w2.f40587c;
                    int i12 = this.f40585a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    final void g() {
        if (!this.f40589e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f40589e) {
            this.f40589e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f40585a;
        int i11 = i10 + 527;
        int[] iArr = this.f40586b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f40587c;
        int i15 = this.f40585a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f40585a; i11++) {
            AbstractC3676h2.b(sb2, i10, String.valueOf(this.f40586b[i11] >>> 3), this.f40587c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        l(this.f40585a + 1);
        int[] iArr = this.f40586b;
        int i11 = this.f40585a;
        iArr[i11] = i10;
        this.f40587c[i11] = obj;
        this.f40585a = i11 + 1;
    }

    public final void k(G2 g22) {
        if (this.f40585a != 0) {
            for (int i10 = 0; i10 < this.f40585a; i10++) {
                int i11 = this.f40586b[i10];
                Object obj = this.f40587c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    g22.o(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    g22.H(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    g22.n(i13, (AbstractC3710o1) obj);
                } else if (i12 == 3) {
                    g22.y(i13);
                    ((C3749w2) obj).k(g22);
                    g22.x(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new Q1("Protocol message tag had invalid wire type."));
                    }
                    g22.e(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
