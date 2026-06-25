package t;

import Ud.AbstractC2273n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6540F extends AbstractC6565o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f59963f;

    public /* synthetic */ C6540F(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final int j(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f60108d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f60105a;
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
                if (this.f60106b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iK = k(i12);
                if (this.f59963f == 0 && ((this.f60105a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    g();
                    iK = k(i12);
                }
                this.f60109e++;
                int i23 = this.f59963f;
                long[] jArr2 = this.f60105a;
                int i24 = iK >> 3;
                long j14 = jArr2[i24];
                int i25 = (iK & 7) << 3;
                this.f59963f = i23 - (((j14 >> i25) & 255) == 128 ? i22 : 0);
                int i26 = this.f60108d;
                long j15 = ((~(255 << i25)) & j14) | (j11 << i25);
                jArr2[i24] = j15;
                jArr2[(((iK - 7) & i26) + (i26 & 7)) >> 3] = j15;
                return iK;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int k(int i10) {
        int i11 = this.f60108d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f60105a;
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

    private final void l() {
        this.f59963f = d0.a(d()) - this.f60109e;
    }

    private final void m(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = d0.f60048a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC2273n.y(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f60105a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        l();
    }

    private final void n(int i10) {
        int iMax = i10 > 0 ? Math.max(7, d0.d(i10)) : 0;
        this.f60108d = iMax;
        m(iMax);
        this.f60106b = new int[iMax];
        this.f60107c = new Object[iMax];
    }

    public final void g() {
        if (this.f60108d <= 8 || Long.compare(Td.F.b(Td.F.b(this.f60109e) * 32) ^ Long.MIN_VALUE, Td.F.b(Td.F.b(this.f60108d) * 25) ^ Long.MIN_VALUE) > 0) {
            r(d0.c(this.f60108d));
        } else {
            i();
        }
    }

    public final void h() {
        this.f60109e = 0;
        long[] jArr = this.f60105a;
        if (jArr != d0.f60048a) {
            AbstractC2273n.y(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f60105a;
            int i10 = this.f60108d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC2273n.w(this.f60107c, null, 0, this.f60108d);
        l();
    }

    public final void i() {
        long j10;
        long[] jArr = this.f60105a;
        int i10 = this.f60108d;
        int[] iArr = this.f60106b;
        Object[] objArr = this.f60107c;
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
                        objArr[iK] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        int i24 = iArr[iK];
                        iArr[iK] = iArr[i15];
                        iArr[i15] = i24;
                        Object obj = objArr[iK];
                        objArr[iK] = objArr[i15];
                        objArr[i15] = obj;
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
        l();
    }

    public final Object o(int i10, Object obj) {
        int iJ = j(i10);
        Object[] objArr = this.f60107c;
        Object obj2 = objArr[iJ];
        this.f60106b[iJ] = i10;
        objArr[iJ] = obj;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f60108d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f60105a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f60106b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.q(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C6540F.p(int):java.lang.Object");
    }

    public final Object q(int i10) {
        this.f60109e--;
        long[] jArr = this.f60105a;
        int i11 = this.f60108d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        Object[] objArr = this.f60107c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void r(int i10) {
        long[] jArr;
        C6540F c6540f = this;
        long[] jArr2 = c6540f.f60105a;
        int[] iArr = c6540f.f60106b;
        Object[] objArr = c6540f.f60107c;
        int i11 = c6540f.f60108d;
        n(i10);
        long[] jArr3 = c6540f.f60105a;
        int[] iArr2 = c6540f.f60106b;
        Object[] objArr2 = c6540f.f60107c;
        int i12 = c6540f.f60108d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = c6540f.k(i15 >>> 7);
                long j10 = i15 & 127;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iK - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[iK] = i14;
                objArr2[iK] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c6540f = this;
            jArr2 = jArr;
        }
    }

    public final void s(int i10, Object obj) {
        int iJ = j(i10);
        this.f60106b[iJ] = i10;
        this.f60107c[iJ] = obj;
    }

    public C6540F(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC6705d.a("Capacity must be a positive value.");
        }
        n(d0.e(i10));
    }
}
