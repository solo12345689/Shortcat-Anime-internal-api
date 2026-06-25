package t;

import Ud.AbstractC2273n;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6543I extends AbstractC6570u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f59965f;

    public C6543I(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC6705d.a("Capacity must be a positive value.");
        }
        m(d0.e(i10));
    }

    private final int i(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f60133d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f60130a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f60131b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iJ = j(i11);
                if (this.f59965f == 0 && ((this.f60130a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    f();
                    iJ = j(i11);
                }
                this.f60134e++;
                int i19 = this.f59965f;
                long[] jArr2 = this.f60130a;
                int i20 = iJ >> 3;
                long j15 = jArr2[i20];
                int i21 = (iJ & 7) << 3;
                this.f59965f = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f60133d;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iJ - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return iJ;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int j(int i10) {
        int i11 = this.f60133d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f60130a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void k() {
        this.f59965f = d0.a(c()) - this.f60134e;
    }

    private final void l(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = d0.f60048a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC2273n.y(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f60130a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        k();
    }

    private final void m(int i10) {
        int iMax = i10 > 0 ? Math.max(7, d0.d(i10)) : 0;
        this.f60133d = iMax;
        l(iMax);
        this.f60131b = new long[iMax];
        this.f60132c = new Object[iMax];
    }

    public final void f() {
        if (this.f60133d <= 8 || Long.compare(Td.F.b(Td.F.b(this.f60134e) * 32) ^ Long.MIN_VALUE, Td.F.b(Td.F.b(this.f60133d) * 25) ^ Long.MIN_VALUE) > 0) {
            n(d0.c(this.f60133d));
        } else {
            h();
        }
    }

    public final void g() {
        this.f60134e = 0;
        long[] jArr = this.f60130a;
        if (jArr != d0.f60048a) {
            AbstractC2273n.y(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f60130a;
            int i10 = this.f60133d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC2273n.w(this.f60132c, null, 0, this.f60133d);
        k();
    }

    public final void h() {
        long j10;
        long[] jArr = this.f60130a;
        int i10 = this.f60133d;
        long[] jArr2 = this.f60131b;
        Object[] objArr = this.f60132c;
        int i11 = (i10 + 7) >> 3;
        char c10 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = jArr[i12] & (-9187201950435737472L);
            jArr[i12] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iE0 = AbstractC2273n.e0(jArr);
        int i13 = iE0 - 1;
        long j12 = 72057594037927935L;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[iE0] = jArr[0];
        int i14 = 0;
        while (i14 != i10) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j13 = (jArr[i15] >> i16) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Long.hashCode(jArr2[i14]) * (-862048943);
                int i17 = iHashCode ^ (iHashCode << 16);
                int i18 = i17 >>> 7;
                int iJ = j(i18);
                int i19 = i18 & i10;
                char c11 = c10;
                if (((iJ - i19) & i10) / 8 == ((i14 - i19) & i10) / 8) {
                    jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[AbstractC2273n.e0(jArr)] = (jArr[c11] & j12) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                } else {
                    int i20 = iJ >> 3;
                    long j14 = jArr[i20];
                    int i21 = (iJ & 7) << 3;
                    if (((j14 >> i21) & 255) == 128) {
                        j10 = j12;
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j14 & (~(255 << i21)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        jArr2[iJ] = jArr2[i14];
                        jArr2[i14] = 0;
                        objArr[iJ] = objArr[i14];
                        objArr[i14] = null;
                    } else {
                        j10 = j12;
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j14 & (~(255 << i21)));
                        long j15 = jArr2[iJ];
                        jArr2[iJ] = jArr2[i14];
                        jArr2[i14] = j15;
                        Object obj = objArr[iJ];
                        objArr[iJ] = objArr[i14];
                        objArr[i14] = obj;
                        i14--;
                    }
                    jArr[AbstractC2273n.e0(jArr)] = (jArr[c11] & j10) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                    j12 = j10;
                }
            } else {
                i14++;
            }
        }
        k();
    }

    public final void n(int i10) {
        long[] jArr;
        C6543I c6543i = this;
        long[] jArr2 = c6543i.f60130a;
        long[] jArr3 = c6543i.f60131b;
        Object[] objArr = c6543i.f60132c;
        int i11 = c6543i.f60133d;
        m(i10);
        long[] jArr4 = c6543i.f60130a;
        long[] jArr5 = c6543i.f60131b;
        Object[] objArr2 = c6543i.f60132c;
        int i12 = c6543i.f60133d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i13];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iJ = c6543i.j(i14 >>> 7);
                long j11 = i14 & 127;
                int i15 = iJ >> 3;
                int i16 = (iJ & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i15] & (~(255 << i16))) | (j11 << i16);
                jArr4[i15] = j12;
                jArr4[(((iJ - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr5[iJ] = j10;
                objArr2[iJ] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c6543i = this;
            jArr2 = jArr;
        }
    }

    public final void o(long j10, Object obj) {
        int i10 = i(j10);
        this.f60131b[i10] = j10;
        this.f60132c[i10] = obj;
    }
}
