package t;

import Ud.AbstractC2273n;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.M, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6547M extends X {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f59968f;

    public /* synthetic */ C6547M(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final int k(int i10) {
        int i11 = this.f60014d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f60011a;
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

    private final int l(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f60014d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f60011a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC5504s.c(this.f60012b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iK = k(i11);
                if (this.f59968f == 0 && ((this.f60011a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    i();
                    iK = k(i11);
                }
                this.f60015e++;
                int i19 = this.f59968f;
                long[] jArr2 = this.f60011a;
                int i20 = iK >> 3;
                long j14 = jArr2[i20];
                int i21 = (iK & 7) << 3;
                this.f59968f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f60014d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iK - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iK;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final void m() {
        this.f59968f = d0.a(e()) - this.f60015e;
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
        this.f60011a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, d0.d(i10)) : 0;
        this.f60014d = iMax;
        n(iMax);
        this.f60012b = new Object[iMax];
        this.f60013c = new long[iMax];
    }

    public final void i() {
        if (this.f60014d <= 8 || Long.compare(Td.F.b(Td.F.b(this.f60015e) * 32) ^ Long.MIN_VALUE, Td.F.b(Td.F.b(this.f60014d) * 25) ^ Long.MIN_VALUE) > 0) {
            p(d0.c(this.f60014d));
        } else {
            j();
        }
    }

    public final void j() {
        long j10;
        long[] jArr = this.f60011a;
        int i10 = this.f60014d;
        Object[] objArr = this.f60012b;
        long[] jArr2 = this.f60013c;
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
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
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
                        objArr[iK] = objArr[i15];
                        objArr[i15] = null;
                        jArr2[iK] = jArr2[i15];
                        jArr2[i15] = 0;
                    } else {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        Object obj2 = objArr[iK];
                        objArr[iK] = objArr[i15];
                        objArr[i15] = obj2;
                        long j15 = jArr2[iK];
                        jArr2[iK] = jArr2[i15];
                        jArr2[i15] = j15;
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

    public final void p(int i10) {
        int i11;
        long[] jArr = this.f60011a;
        Object[] objArr = this.f60012b;
        long[] jArr2 = this.f60013c;
        int i12 = this.f60014d;
        o(i10);
        long[] jArr3 = this.f60011a;
        Object[] objArr2 = this.f60012b;
        long[] jArr4 = this.f60013c;
        int i13 = this.f60014d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = k(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j11 = (j10 << i17) | (jArr3[i16] & (~(255 << i17)));
                jArr3[i16] = j11;
                jArr3[(((iK - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr2[iK] = obj;
                jArr4[iK] = jArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void q(Object obj, long j10) {
        int iL = l(obj);
        if (iL < 0) {
            iL = ~iL;
        }
        this.f60012b[iL] = obj;
        this.f60013c[iL] = j10;
    }

    public C6547M(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC6705d.a("Capacity must be a positive value.");
        }
        o(d0.e(i10));
    }
}
