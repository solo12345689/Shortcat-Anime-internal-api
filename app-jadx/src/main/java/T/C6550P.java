package t;

import Ud.AbstractC2273n;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6702a;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.P */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6550P extends c0 {

    /* JADX INFO: renamed from: f */
    private int f59982f;

    public /* synthetic */ C6550P(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final int m(int i10) {
        int i11 = this.f60046d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f60043a;
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

    private final void o() {
        this.f59982f = d0.a(f()) - this.f60047e;
    }

    private final void p(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = d0.f60048a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC2273n.y(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.f60043a = jArr;
        o();
    }

    private final void q(int i10) {
        int iMax = i10 > 0 ? Math.max(7, d0.d(i10)) : 0;
        this.f60046d = iMax;
        p(iMax);
        this.f60044b = iMax == 0 ? AbstractC6702a.f61095c : new Object[iMax];
        this.f60045c = iMax == 0 ? AbstractC6702a.f61095c : new Object[iMax];
    }

    public final void j() {
        if (this.f60046d <= 8 || Long.compare(Td.F.b(Td.F.b(this.f60047e) * 32) ^ Long.MIN_VALUE, Td.F.b(Td.F.b(this.f60046d) * 25) ^ Long.MIN_VALUE) > 0) {
            w(d0.c(this.f60046d));
        } else {
            l();
        }
    }

    public final void k() {
        this.f60047e = 0;
        long[] jArr = this.f60043a;
        if (jArr != d0.f60048a) {
            AbstractC2273n.y(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f60043a;
            int i10 = this.f60046d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC2273n.w(this.f60045c, null, 0, this.f60046d);
        AbstractC2273n.w(this.f60044b, null, 0, this.f60046d);
        o();
    }

    public final void l() {
        long[] jArr = this.f60043a;
        int i10 = this.f60046d;
        Object[] objArr = this.f60044b;
        Object[] objArr2 = this.f60045c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int iE0 = AbstractC2273n.e0(jArr);
        int i14 = iE0 - 1;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iE0] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j11 = (jArr[i16] >> i17) & 255;
            if (j11 != 128 && j11 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iM = m(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iM - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC2273n.e0(jArr)] = jArr[i21];
                } else {
                    int i22 = iM >> 3;
                    long j12 = jArr[i22];
                    int i23 = (iM & 7) << 3;
                    if (((j12 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iM] = objArr[i15];
                        objArr[i15] = null;
                        objArr2[iM] = objArr2[i15];
                        objArr2[i15] = null;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        Object obj2 = objArr[iM];
                        objArr[iM] = objArr[i15];
                        objArr[i15] = obj2;
                        Object obj3 = objArr2[iM];
                        objArr2[iM] = objArr2[i15];
                        objArr2[i15] = obj3;
                        i15--;
                    }
                    jArr[AbstractC2273n.e0(jArr)] = jArr[i21];
                }
                i15++;
                i12 = i21;
            } else {
                i15++;
            }
        }
        o();
    }

    public final int n(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f60046d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f60043a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC5504s.c(this.f60044b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM = m(i11);
                if (this.f59982f == 0 && ((this.f60043a[iM >> 3] >> ((iM & 7) << 3)) & 255) != 254) {
                    j();
                    iM = m(i11);
                }
                this.f60047e++;
                int i19 = this.f59982f;
                long[] jArr2 = this.f60043a;
                int i20 = iM >> 3;
                long j14 = jArr2[i20];
                int i21 = (iM & 7) << 3;
                this.f59982f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f60046d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iM - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iM;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final Object r(Object obj, Object obj2) {
        int iN = n(obj);
        if (iN < 0) {
            iN = ~iN;
        }
        Object[] objArr = this.f60045c;
        Object obj3 = objArr[iN];
        this.f60044b[iN] = obj;
        objArr[iN] = obj2;
        return obj3;
    }

    public final void s(Map from) {
        AbstractC5504s.h(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            x(entry.getKey(), entry.getValue());
        }
    }

    public final void t(c0 from) {
        AbstractC5504s.h(from, "from");
        Object[] objArr = from.f60044b;
        Object[] objArr2 = from.f60045c;
        long[] jArr = from.f60043a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        x(objArr[i13], objArr2[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f60046d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f60043a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f60044b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.AbstractC5504s.c(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.v(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C6550P.u(java.lang.Object):java.lang.Object");
    }

    public final Object v(int i10) {
        this.f60047e--;
        long[] jArr = this.f60043a;
        int i11 = this.f60046d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f60044b[i10] = null;
        Object[] objArr = this.f60045c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void w(int i10) {
        int i11;
        long[] jArr = this.f60043a;
        Object[] objArr = this.f60044b;
        Object[] objArr2 = this.f60045c;
        int i12 = this.f60046d;
        q(i10);
        long[] jArr2 = this.f60043a;
        Object[] objArr3 = this.f60044b;
        Object[] objArr4 = this.f60045c;
        int i13 = this.f60046d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iM = m(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iM >> 3;
                int i17 = (iM & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iM - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr3[iM] = obj;
                objArr4[iM] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void x(Object obj, Object obj2) {
        int iN = n(obj);
        if (iN < 0) {
            iN = ~iN;
        }
        this.f60044b[iN] = obj;
        this.f60045c[iN] = obj2;
    }

    public C6550P(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC6705d.a("Capacity must be a positive value.");
        }
        q(d0.e(i10));
    }
}
