package t;

import Ud.AbstractC2273n;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6702a;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.N */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6548N extends Z {

    /* JADX INFO: renamed from: h */
    private int f59969h;

    public /* synthetic */ C6548N(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final int m(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f60022f;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f60017a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC5504s.c(this.f60018b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iN = n(i11);
                if (this.f59969h == 0 && ((this.f60017a[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    i();
                    iN = n(i11);
                }
                this.f60023g++;
                int i19 = this.f59969h;
                long[] jArr2 = this.f60017a;
                int i20 = iN >> 3;
                long j14 = jArr2[i20];
                int i21 = (iN & 7) << 3;
                this.f59969h = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f60022f;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iN - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iN;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int n(int i10) {
        int i11 = this.f60022f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f60017a;
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

    private final void o(int[] iArr) {
        long[] jArr = this.f60019c;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & 2147483647L);
            int i13 = (int) (j10 & 2147483647L);
            long j11 = ((j10 & (-4611686018427387904L)) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i12]))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = iArr[i13];
            }
            jArr[i10] = j11 | ((long) i11);
            i10++;
        }
        int i14 = this.f60020d;
        if (i14 != Integer.MAX_VALUE) {
            this.f60020d = iArr[i14];
        }
        int i15 = this.f60021e;
        if (i15 != Integer.MAX_VALUE) {
            this.f60021e = iArr[i15];
        }
    }

    private final void p(long[] jArr) {
        long[] jArr2 = this.f60019c;
        int length = jArr2.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr2[i10];
            int i12 = (int) ((j10 >> 31) & 2147483647L);
            int i13 = (int) (j10 & 2147483647L);
            long j11 = ((j10 & (-4611686018427387904L)) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i12] & 4294967295L)))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = (int) (4294967295L & jArr[i13]);
            }
            jArr2[i10] = ((long) i11) | j11;
            i10++;
        }
        int i14 = this.f60020d;
        if (i14 != Integer.MAX_VALUE) {
            this.f60020d = (int) (jArr[i14] & 4294967295L);
        }
        int i15 = this.f60021e;
        if (i15 != Integer.MAX_VALUE) {
            this.f60021e = (int) (jArr[i15] & 4294967295L);
        }
    }

    private final void q() {
        this.f59969h = d0.a(b()) - this.f60023g;
    }

    private final void r(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = d0.f60048a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC2273n.y(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f60017a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        q();
    }

    private final void s(int i10) {
        long[] jArrA;
        int iMax = i10 > 0 ? Math.max(7, d0.d(i10)) : 0;
        this.f60022f = iMax;
        r(iMax);
        this.f60018b = iMax == 0 ? AbstractC6702a.f61095c : new Object[iMax];
        if (iMax == 0) {
            jArrA = h0.a();
        } else {
            long[] jArr = new long[iMax];
            AbstractC2273n.y(jArr, 4611686018427387903L, 0, 0, 6, null);
            jArrA = jArr;
        }
        this.f60019c = jArrA;
    }

    public final void A(int i10) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.f60017a;
        Object[] objArr2 = this.f60018b;
        long[] jArr3 = this.f60019c;
        int i11 = this.f60022f;
        int[] iArr = new int[i11];
        s(i10);
        long[] jArr4 = this.f60017a;
        Object[] objArr3 = this.f60018b;
        long[] jArr5 = this.f60019c;
        int i12 = this.f60022f;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iN = n(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iN >> 3;
                int i16 = (iN & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j11 = (jArr4[i15] & (~(255 << i16))) | (j10 << i16);
                jArr4[i15] = j11;
                jArr4[(((iN - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr3[iN] = obj;
                jArr5[iN] = jArr3[i13];
                iArr[i13] = iN;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i13++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        o(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.AbstractC5504s.h(r1, r2)
            java.lang.Object[] r2 = r0.f60018b
            int r3 = r0.f60023g
            long[] r4 = r0.f60017a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = Ud.AbstractC2279u.e0(r14, r15)
            if (r14 != 0) goto L4c
            r0.z(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.f60023g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C6548N.B(java.util.Collection):boolean");
    }

    public final boolean g(Object obj) {
        int iC = c();
        int iM = m(obj);
        this.f60018b[iM] = obj;
        long[] jArr = this.f60019c;
        int i10 = this.f60020d;
        jArr[iM] = (((long) i10) & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((((long) iM) & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f60020d = iM;
        if (this.f60021e == Integer.MAX_VALUE) {
            this.f60021e = iM;
        }
        return c() != iC;
    }

    public final boolean h(Iterable elements) {
        AbstractC5504s.h(elements, "elements");
        int iC = c();
        v(elements);
        return iC != c();
    }

    public final void i() {
        if (this.f60022f <= 8 || Long.compare(Td.F.b(Td.F.b(this.f60023g) * 32) ^ Long.MIN_VALUE, Td.F.b(Td.F.b(this.f60022f) * 25) ^ Long.MIN_VALUE) > 0) {
            A(d0.c(this.f60022f));
        } else {
            l();
        }
    }

    public final Set j() {
        return new C6549O(this);
    }

    public final void k() {
        this.f60023g = 0;
        long[] jArr = this.f60017a;
        if (jArr != d0.f60048a) {
            AbstractC2273n.y(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f60017a;
            int i10 = this.f60022f;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC2273n.w(this.f60018b, null, 0, this.f60022f);
        AbstractC2273n.y(this.f60019c, 4611686018427387903L, 0, 0, 6, null);
        this.f60020d = Integer.MAX_VALUE;
        this.f60021e = Integer.MAX_VALUE;
        q();
    }

    public final void l() {
        int i10;
        long[] jArr = this.f60017a;
        if (jArr == null) {
            return;
        }
        int i11 = this.f60022f;
        Object[] objArr = this.f60018b;
        long[] jArr2 = this.f60019c;
        long[] jArr3 = new long[i11];
        long j10 = 9223372034707292159L;
        int i12 = 0;
        AbstractC2273n.v(jArr3, 9223372034707292159L, 0, i11);
        int i13 = (i11 + 7) >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            long j11 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iE0 = AbstractC2273n.e0(jArr);
        int i15 = iE0 - 1;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[iE0] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j12 = (jArr[i17] >> i18) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr[i16];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i19 = iHashCode ^ (iHashCode << 16);
                int i20 = i19 >>> 7;
                long j13 = j10;
                int iN = n(i20);
                int i21 = i20 & i11;
                if (((iN - i21) & i11) / 8 == ((i16 - i21) & i11) / 8) {
                    jArr[i17] = (((long) (i19 & 127)) << i18) | (jArr[i17] & (~(255 << i18)));
                    if (jArr3[i16] == j13) {
                        long j14 = i16;
                        jArr3[i16] = j14 | (j14 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i12];
                    i16++;
                    j10 = j13;
                } else {
                    int i22 = iN >> 3;
                    long j15 = jArr[i22];
                    int i23 = (iN & 7) << 3;
                    int i24 = i12;
                    if (((j15 >> i23) & 255) == 128) {
                        int i25 = i16;
                        jArr[i22] = (j15 & (~(255 << i23))) | (((long) (i19 & 127)) << i23);
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        objArr[iN] = objArr[i25];
                        objArr[i25] = null;
                        jArr2[iN] = jArr2[i25];
                        jArr2[i25] = 4611686018427387903L;
                        int i26 = (int) ((jArr3[i25] >> 32) & 4294967295L);
                        if (i26 != Integer.MAX_VALUE) {
                            jArr3[i26] = (jArr3[i26] & (-4294967296L)) | ((long) iN);
                            jArr3[i25] = (jArr3[i25] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i25] = (((long) Integer.MAX_VALUE) << 32) | ((long) iN);
                        }
                        i10 = i25;
                        jArr3[iN] = ((long) Integer.MAX_VALUE) | (((long) i10) << 32);
                    } else {
                        jArr[i22] = (((long) (i19 & 127)) << i23) | (j15 & (~(255 << i23)));
                        Object obj2 = objArr[iN];
                        objArr[iN] = objArr[i16];
                        objArr[i16] = obj2;
                        long j16 = jArr2[iN];
                        jArr2[iN] = jArr2[i16];
                        jArr2[i16] = j16;
                        int i27 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i27 != Integer.MAX_VALUE) {
                            long j17 = iN;
                            jArr3[i27] = (jArr3[i27] & (-4294967296L)) | j17;
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (j17 << 32);
                        } else {
                            long j18 = iN;
                            jArr3[i16] = j18 | (j18 << 32);
                            i27 = i16;
                        }
                        jArr3[iN] = (((long) i27) << 32) | ((long) i16);
                        i10 = i16 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i24];
                    i16 = i10 + 1;
                    j10 = j13;
                    i12 = i24;
                }
            } else {
                i16++;
            }
        }
        q();
        p(jArr3);
    }

    public final void t(Iterable elements) {
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            u(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.lang.Object r14) {
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
            int r3 = r13.f60022f
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f60017a
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
            java.lang.Object[] r11 = r13.f60018b
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
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.z(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C6548N.u(java.lang.Object):void");
    }

    public final void v(Iterable elements) {
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public final void w(Object obj) {
        int iM = m(obj);
        this.f60018b[iM] = obj;
        long[] jArr = this.f60019c;
        int i10 = this.f60020d;
        jArr[iM] = (((long) i10) & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((((long) iM) & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f60020d = iM;
        if (this.f60021e == Integer.MAX_VALUE) {
            this.f60021e = iM;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f60022f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f60017a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f60018b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC5504s.c(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.z(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C6548N.x(java.lang.Object):boolean");
    }

    public final boolean y(Iterable elements) {
        AbstractC5504s.h(elements, "elements");
        int iC = c();
        t(elements);
        return iC != c();
    }

    public final void z(int i10) {
        this.f60023g--;
        long[] jArr = this.f60017a;
        int i11 = this.f60022f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f60018b[i10] = null;
        long[] jArr2 = this.f60019c;
        long j11 = jArr2[i10];
        int i14 = (int) ((j11 >> 31) & 2147483647L);
        int i15 = (int) (j11 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (((long) i15) & 2147483647L);
        } else {
            this.f60020d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((((long) i14) & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f60021e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    public C6548N(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC6705d.a("Capacity must be a positive value.");
        }
        s(d0.e(i10));
    }
}
