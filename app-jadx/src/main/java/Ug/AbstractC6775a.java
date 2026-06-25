package ug;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC5504s;
import tg.AbstractC6680e;
import tg.C6683h;
import tg.N;
import tg.U;
import tg.d0;

/* JADX INFO: renamed from: ug.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6775a {

    /* JADX INFO: renamed from: a */
    private static final byte[] f61522a = d0.a("0123456789abcdef");

    public static final C6683h.a a(C6683h c6683h, C6683h.a unsafeCursor) {
        AbstractC5504s.h(c6683h, "<this>");
        AbstractC5504s.h(unsafeCursor, "unsafeCursor");
        C6683h.a aVarG = AbstractC6680e.g(unsafeCursor);
        if (aVarG.f61035a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarG.f61035a = c6683h;
        aVarG.f61036b = true;
        return aVarG;
    }

    public static final byte[] b() {
        return f61522a;
    }

    public static final boolean c(U segment, int i10, byte[] bytes, int i11, int i12) {
        AbstractC5504s.h(segment, "segment");
        AbstractC5504s.h(bytes, "bytes");
        int i13 = segment.f60988c;
        byte[] bArr = segment.f60986a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f60991f;
                AbstractC5504s.e(segment);
                byte[] bArr2 = segment.f60986a;
                bArr = bArr2;
                i10 = segment.f60987b;
                i13 = segment.f60988c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(C6683h c6683h, long j10) throws EOFException {
        AbstractC5504s.h(c6683h, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c6683h.D(j11) == 13) {
                String strV0 = c6683h.V0(j11);
                c6683h.skip(2L);
                return strV0;
            }
        }
        String strV02 = c6683h.V0(j10);
        c6683h.skip(1L);
        return strV02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0064, code lost:
    
        if (r19 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a5 A[LOOP:0: B:63:0x0026->B:101:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int e(tg.C6683h r17, tg.N r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.AbstractC5504s.h(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.AbstractC5504s.h(r2, r1)
            tg.U r0 = r0.f61033a
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L18
            if (r19 == 0) goto L17
            return r1
        L17:
            return r3
        L18:
            byte[] r4 = r0.f60986a
            int r5 = r0.f60987b
            int r6 = r0.f60988c
            int[] r2 = r2.p()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L26:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L31
            r10 = r11
        L31:
            if (r9 != 0) goto L34
            goto L64
        L34:
            r11 = 0
            if (r12 >= 0) goto L7d
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L3b:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L48
            goto L87
        L48:
            if (r14 != r13) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = r7
        L4d:
            if (r12 != r6) goto L6d
            kotlin.jvm.internal.AbstractC5504s.e(r9)
            tg.U r4 = r9.f60991f
            kotlin.jvm.internal.AbstractC5504s.e(r4)
            int r6 = r4.f60987b
            byte[] r8 = r4.f60986a
            int r9 = r4.f60988c
            if (r4 != r0) goto L67
            if (r5 == 0) goto L64
            r4 = r8
            r8 = r11
            goto L70
        L64:
            if (r19 == 0) goto L87
            return r1
        L67:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L70
        L6d:
            r8 = r9
            r9 = r6
            r6 = r12
        L70:
            if (r5 == 0) goto L78
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La2
        L78:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L3b
        L7d:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L85:
            if (r8 != r14) goto L88
        L87:
            return r10
        L88:
            r15 = r2[r8]
            if (r5 != r15) goto La9
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto La2
            tg.U r9 = r9.f60991f
            kotlin.jvm.internal.AbstractC5504s.e(r9)
            int r4 = r9.f60987b
            byte[] r6 = r9.f60986a
            int r8 = r9.f60988c
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La2
            r9 = r11
        La2:
            if (r5 < 0) goto La5
            return r5
        La5:
            int r8 = -r5
            r5 = r13
            goto L26
        La9:
            int r8 = r8 + 1
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.AbstractC6775a.e(tg.h, tg.N, boolean):int");
    }

    public static /* synthetic */ int f(C6683h c6683h, N n10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(c6683h, n10, z10);
    }
}
