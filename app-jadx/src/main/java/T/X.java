package t;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6702a;
import u.AbstractC6705d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f60011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f60012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f60013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60015e;

    public /* synthetic */ X(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Object obj) {
        return b(obj);
    }

    public final boolean b(Object obj) {
        return c(obj) >= 0;
    }

    public final int c(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f60014d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f60011a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (AbstractC5504s.c(this.f60012b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final long d(Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            AbstractC6705d.d("There is no key " + obj + " in the map");
        }
        return this.f60013c[iC];
    }

    public final int e() {
        return this.f60014d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof t.X
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            t.X r1 = (t.X) r1
            int r3 = r1.g()
            int r5 = r0.g()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.f60012b
            long[] r5 = r0.f60013c
            long[] r6 = r0.f60011a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L6d
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L68
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L62
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r16 = r5[r14]
            int r14 = r1.c(r15)
            if (r14 < 0) goto L61
            long[] r15 = r1.f60013c
            r14 = r15[r14]
            int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r14 == 0) goto L62
        L61:
            return r4
        L62:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L41
        L66:
            if (r11 != r12) goto L6d
        L68:
            if (r8 == r7) goto L6d
            int r8 = r8 + 1
            goto L27
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t.X.equals(java.lang.Object):boolean");
    }

    public final long f(Object obj, long j10) {
        int iC = c(obj);
        return iC >= 0 ? this.f60013c[iC] : j10;
    }

    public final int g() {
        return this.f60015e;
    }

    public final boolean h() {
        return this.f60015e == 0;
    }

    public int hashCode() {
        Object[] objArr = this.f60012b;
        long[] jArr = this.f60013c;
        long[] jArr2 = this.f60011a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public String toString() {
        int i10;
        int i11;
        if (h()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        Object[] objArr = this.f60012b;
        long[] jArr = this.f60013c;
        long[] jArr2 = this.f60011a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = objArr[i16];
                            i11 = i12;
                            long j11 = jArr[i16];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(com.amazon.a.a.o.b.f.f34695b);
                            sb2.append(j11);
                            i13++;
                            if (i13 < this.f60015e) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    private X() {
        this.f60011a = d0.f60048a;
        this.f60012b = AbstractC6702a.f61095c;
        this.f60013c = AbstractC6572w.a();
    }
}
