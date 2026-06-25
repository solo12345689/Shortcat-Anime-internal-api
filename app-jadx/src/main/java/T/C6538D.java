package t;

import Ud.AbstractC2273n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6538D extends AbstractC6560j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f59962f;

    public C6538D(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC6705d.a("Capacity must be a positive value.");
        }
        o(d0.e(i10));
    }

    private final int k(int i10) {
        int i11 = this.f60083d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f60080a;
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

    private final int l(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f60083d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f60080a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                int i21 = i19;
                if (this.f60081b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iK = k(i12);
                if (this.f59962f == 0 && ((this.f60080a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i12);
                }
                this.f60084e++;
                int i23 = this.f59962f;
                long[] jArr2 = this.f60080a;
                int i24 = iK >> 3;
                long j14 = jArr2[i24];
                int i25 = (iK & 7) << 3;
                this.f59962f = i23 - (((j14 >> i25) & 255) == 128 ? i22 : 0);
                int i26 = this.f60083d;
                long j15 = ((~(255 << i25)) & j14) | (j11 << i25);
                jArr2[i24] = j15;
                jArr2[(((iK - 7) & i26) + (i26 & 7)) >> 3] = j15;
                return ~iK;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final void m() {
        this.f59962f = d0.a(d()) - this.f60084e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = d0.f60048a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC2273n.y(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f60080a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, d0.d(i10)) : 0;
        this.f60083d = iMax;
        n(iMax);
        this.f60081b = new int[iMax];
        this.f60082c = new int[iMax];
    }

    public final void h() {
        if (this.f60083d <= 8 || Long.compare(Td.F.b(Td.F.b(this.f60084e) * 32) ^ Long.MIN_VALUE, Td.F.b(Td.F.b(this.f60083d) * 25) ^ Long.MIN_VALUE) > 0) {
            q(d0.c(this.f60083d));
        } else {
            j();
        }
    }

    public final void i() {
        this.f60084e = 0;
        long[] jArr = this.f60080a;
        if (jArr != d0.f60048a) {
            AbstractC2273n.y(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f60080a;
            int i10 = this.f60083d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        m();
    }

    public final void j() {
        long j10;
        long[] jArr = this.f60080a;
        int i10 = this.f60083d;
        int[] iArr = this.f60081b;
        int[] iArr2 = this.f60082c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iE0 = AbstractC2273n.e0(jArr);
        int i14 = iE0 - 1;
        long j12 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iE0] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j13 = (jArr[i16] >> i17) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Integer.hashCode(iArr[i15]) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iK = k(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iK - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC2273n.e0(jArr)] = (jArr[i21] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iK >> 3;
                    long j14 = jArr[i22];
                    int i23 = (iK & 7) << 3;
                    if (((j14 >> i23) & 255) == 128) {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        iArr[iK] = iArr[i15];
                        iArr[i15] = i21;
                        iArr2[iK] = iArr2[i15];
                        iArr2[i15] = i21;
                    } else {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        int i24 = iArr[iK];
                        iArr[iK] = iArr[i15];
                        iArr[i15] = i24;
                        int i25 = iArr2[iK];
                        iArr2[iK] = iArr2[i15];
                        iArr2[i15] = i25;
                        i15--;
                    }
                    jArr[AbstractC2273n.e0(jArr)] = (jArr[i21] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        m();
    }

    public final void p(int i10, int i11) {
        r(i10, i11);
    }

    public final void q(int i10) {
        long[] jArr;
        C6538D c6538d = this;
        long[] jArr2 = c6538d.f60080a;
        int[] iArr = c6538d.f60081b;
        int[] iArr2 = c6538d.f60082c;
        int i11 = c6538d.f60083d;
        o(i10);
        long[] jArr3 = c6538d.f60080a;
        int[] iArr3 = c6538d.f60081b;
        int[] iArr4 = c6538d.f60082c;
        int i12 = c6538d.f60083d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = c6538d.k(i15 >>> 7);
                long j10 = i15 & 127;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iK - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr3[iK] = i14;
                iArr4[iK] = iArr2[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c6538d = this;
            jArr2 = jArr;
        }
    }

    public final void r(int i10, int i11) {
        int iL = l(i10);
        if (iL < 0) {
            iL = ~iL;
        }
        this.f60081b[iL] = i10;
        this.f60082c[iL] = i11;
    }

    public /* synthetic */ C6538D(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
