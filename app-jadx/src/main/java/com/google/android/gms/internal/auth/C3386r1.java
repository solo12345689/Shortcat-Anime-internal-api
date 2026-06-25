package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.r1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3386r1 {

    /* JADX INFO: renamed from: e */
    private static final C3386r1 f39295e = new C3386r1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    private int f39296a;

    /* JADX INFO: renamed from: b */
    private int[] f39297b;

    /* JADX INFO: renamed from: c */
    private Object[] f39298c;

    /* JADX INFO: renamed from: d */
    private boolean f39299d;

    private C3386r1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f39296a = i10;
        this.f39297b = iArr;
        this.f39298c = objArr;
        this.f39299d = z10;
    }

    public static C3386r1 a() {
        return f39295e;
    }

    static C3386r1 c(C3386r1 c3386r1, C3386r1 c3386r12) {
        int i10 = c3386r1.f39296a + c3386r12.f39296a;
        int[] iArrCopyOf = Arrays.copyOf(c3386r1.f39297b, i10);
        System.arraycopy(c3386r12.f39297b, 0, iArrCopyOf, c3386r1.f39296a, c3386r12.f39296a);
        Object[] objArrCopyOf = Arrays.copyOf(c3386r1.f39298c, i10);
        System.arraycopy(c3386r12.f39298c, 0, objArrCopyOf, c3386r1.f39296a, c3386r12.f39296a);
        return new C3386r1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static C3386r1 d() {
        return new C3386r1(0, new int[8], new Object[8], true);
    }

    private final void i(int i10) {
        int[] iArr = this.f39297b;
        if (i10 > iArr.length) {
            int i11 = this.f39296a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f39297b = Arrays.copyOf(iArr, i10);
            this.f39298c = Arrays.copyOf(this.f39298c, i10);
        }
    }

    final C3386r1 b(C3386r1 c3386r1) {
        if (c3386r1.equals(f39295e)) {
            return this;
        }
        e();
        int i10 = this.f39296a + c3386r1.f39296a;
        i(i10);
        System.arraycopy(c3386r1.f39297b, 0, this.f39297b, this.f39296a, c3386r1.f39296a);
        System.arraycopy(c3386r1.f39298c, 0, this.f39298c, this.f39296a, c3386r1.f39296a);
        this.f39296a = i10;
        return this;
    }

    final void e() {
        if (!this.f39299d) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3386r1)) {
            return false;
        }
        C3386r1 c3386r1 = (C3386r1) obj;
        int i10 = this.f39296a;
        if (i10 == c3386r1.f39296a) {
            int[] iArr = this.f39297b;
            int[] iArr2 = c3386r1.f39297b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f39298c;
                    Object[] objArr2 = c3386r1.f39298c;
                    int i12 = this.f39296a;
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

    public final void f() {
        if (this.f39299d) {
            this.f39299d = false;
        }
    }

    final void g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f39296a; i11++) {
            AbstractC3339b1.b(sb2, i10, String.valueOf(this.f39297b[i11] >>> 3), this.f39298c[i11]);
        }
    }

    final void h(int i10, Object obj) {
        e();
        i(this.f39296a + 1);
        int[] iArr = this.f39297b;
        int i11 = this.f39296a;
        iArr[i11] = i10;
        this.f39298c[i11] = obj;
        this.f39296a = i11 + 1;
    }

    public final int hashCode() {
        int i10 = this.f39296a;
        int i11 = i10 + 527;
        int[] iArr = this.f39297b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 * 31) + i12;
        Object[] objArr = this.f39298c;
        int i15 = this.f39296a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + iHashCode;
    }
}
