package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3425b6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C3425b6 f39717f = new C3425b6(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f39719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f39720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39721d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39722e;

    private C3425b6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f39718a = i10;
        this.f39719b = iArr;
        this.f39720c = objArr;
        this.f39722e = z10;
    }

    public static C3425b6 a() {
        return f39717f;
    }

    static C3425b6 b() {
        return new C3425b6(0, new int[8], new Object[8], true);
    }

    static C3425b6 c(C3425b6 c3425b6, C3425b6 c3425b62) {
        int i10 = c3425b6.f39718a + c3425b62.f39718a;
        int[] iArrCopyOf = Arrays.copyOf(c3425b6.f39719b, i10);
        System.arraycopy(c3425b62.f39719b, 0, iArrCopyOf, c3425b6.f39718a, c3425b62.f39718a);
        Object[] objArrCopyOf = Arrays.copyOf(c3425b6.f39720c, i10);
        System.arraycopy(c3425b62.f39720c, 0, objArrCopyOf, c3425b6.f39718a, c3425b62.f39718a);
        return new C3425b6(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void l(int i10) {
        int[] iArr = this.f39719b;
        if (i10 > iArr.length) {
            int i11 = this.f39718a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f39719b = Arrays.copyOf(iArr, i10);
            this.f39720c = Arrays.copyOf(this.f39720c, i10);
        }
    }

    public final void d() {
        if (this.f39722e) {
            this.f39722e = false;
        }
    }

    final void e() {
        if (!this.f39722e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3425b6)) {
            return false;
        }
        C3425b6 c3425b6 = (C3425b6) obj;
        int i10 = this.f39718a;
        if (i10 == c3425b6.f39718a) {
            int[] iArr = this.f39719b;
            int[] iArr2 = c3425b6.f39719b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f39720c;
                    Object[] objArr2 = c3425b6.f39720c;
                    int i12 = this.f39718a;
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

    public final void f(InterfaceC3533n6 interfaceC3533n6) {
        if (this.f39718a != 0) {
            for (int i10 = 0; i10 < this.f39718a; i10++) {
                int i11 = this.f39719b[i10];
                Object obj = this.f39720c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC3533n6.m(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC3533n6.x(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC3533n6.w(i13, (I4) obj);
                } else if (i12 == 3) {
                    interfaceC3533n6.o(i13);
                    ((C3425b6) obj).f(interfaceC3533n6);
                    interfaceC3533n6.p(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C3514l5("Protocol message tag had invalid wire type."));
                    }
                    interfaceC3533n6.e(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int g() {
        int i10 = this.f39721d;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f39718a; i11++) {
            int i12 = this.f39719b[i11] >>> 3;
            I4 i42 = (I4) this.f39720c[i11];
            int iE2 = N4.E(8);
            int iE3 = N4.E(16) + N4.E(i12);
            int iE4 = N4.E(24);
            int iD = i42.d();
            iE += iE2 + iE2 + iE3 + iE4 + N4.E(iD) + iD;
        }
        this.f39721d = iE;
        return iE;
    }

    public final int h() {
        int iE;
        int iA;
        int iE2;
        int i10 = this.f39721d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f39718a; i12++) {
            int i13 = this.f39719b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f39720c[i12]).getClass();
                    iE2 = N4.E(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    I4 i42 = (I4) this.f39720c[i12];
                    int iE3 = N4.E(i16);
                    int iD = i42.d();
                    iE2 = iE3 + N4.E(iD) + iD;
                } else if (i15 == 3) {
                    int iE4 = N4.E(i14 << 3);
                    iE = iE4 + iE4;
                    iA = ((C3425b6) this.f39720c[i12]).h();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new C3514l5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f39720c[i12]).getClass();
                    iE2 = N4.E(i14 << 3) + 4;
                }
                i11 += iE2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f39720c[i12]).longValue();
                iE = N4.E(i17);
                iA = N4.a(jLongValue);
            }
            iE2 = iE + iA;
            i11 += iE2;
        }
        this.f39721d = i11;
        return i11;
    }

    public final int hashCode() {
        int i10 = this.f39718a;
        int i11 = i10 + 527;
        int[] iArr = this.f39719b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f39720c;
        int i15 = this.f39718a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f39718a; i11++) {
            G5.b(sb2, i10, String.valueOf(this.f39719b[i11] >>> 3), this.f39720c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        e();
        l(this.f39718a + 1);
        int[] iArr = this.f39719b;
        int i11 = this.f39718a;
        iArr[i11] = i10;
        this.f39720c[i11] = obj;
        this.f39718a = i11 + 1;
    }

    final C3425b6 k(C3425b6 c3425b6) {
        if (c3425b6.equals(f39717f)) {
            return this;
        }
        e();
        int i10 = this.f39718a + c3425b6.f39718a;
        l(i10);
        System.arraycopy(c3425b6.f39719b, 0, this.f39719b, this.f39718a, c3425b6.f39718a);
        System.arraycopy(c3425b6.f39720c, 0, this.f39720c, this.f39718a, c3425b6.f39718a);
        this.f39718a = i10;
        return this;
    }
}
