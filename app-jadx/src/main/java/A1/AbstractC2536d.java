package a1;

import U0.T0;
import U0.W0;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import g1.EnumC4829i;
import oe.AbstractC5874j;
import r0.C6226h;

/* JADX INFO: renamed from: a1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2536d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, a1.InterfaceC2517J r20, U0.T0 r21, r0.C6226h r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.b(r2)
            int r5 = r1.b(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            U0.n r7 = r21.w()
            long r8 = U0.X0.b(r4, r5)
            r5 = 0
            r7.c(r8, r6, r5)
            r11 = r2
        L23:
            if (r11 >= r0) goto L8b
            int r2 = r1.b(r11)
            int r5 = r2 - r4
            int r5 = r5 * 4
            r0.h r7 = new r0.h
            r8 = r6[r5]
            int r9 = r5 + 1
            r9 = r6[r9]
            int r10 = r5 + 2
            r10 = r6[r10]
            int r5 = r5 + 3
            r5 = r6[r5]
            r7.<init>(r8, r9, r10, r5)
            boolean r5 = r3.r(r7)
            float r8 = r7.i()
            float r9 = r7.l()
            boolean r8 = c(r3, r8, r9)
            if (r8 == 0) goto L64
            float r8 = r7.j()
            float r9 = r7.e()
            boolean r8 = c(r3, r8, r9)
            if (r8 != 0) goto L61
            goto L64
        L61:
            r8 = r21
            goto L67
        L64:
            r5 = r5 | 2
            goto L61
        L67:
            g1.i r2 = r8.c(r2)
            g1.i r9 = g1.EnumC4829i.f47275b
            if (r2 != r9) goto L71
            r5 = r5 | 4
        L71:
            r16 = r5
            float r12 = r7.i()
            float r13 = r7.l()
            float r14 = r7.j()
            float r15 = r7.e()
            r10 = r17
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r11 = r11 + 1
            goto L23
        L8b:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.AbstractC2536d.a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, a1.J, U0.T0, r0.h):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, C2527U c2527u, InterfaceC2517J interfaceC2517J, T0 t02, Matrix matrix, C6226h c6226h, C6226h c6226h2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = W0.l(c2527u.k());
        builder.setSelectionRange(iL, W0.k(c2527u.k()));
        if (z10) {
            d(builder, iL, interfaceC2517J, t02, c6226h);
        }
        if (z11) {
            W0 w0J = c2527u.j();
            int iL2 = w0J != null ? W0.l(w0J.r()) : -1;
            W0 w0J2 = c2527u.j();
            int iK = w0J2 != null ? W0.k(w0J2.r()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, c2527u.l().subSequence(iL2, iK));
                a(builder, iL2, iK, interfaceC2517J, t02, c6226h);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z12) {
            C2534b.a(builder, c6226h2);
        }
        if (i10 >= 34 && z13) {
            C2535c.a(builder, t02, c6226h);
        }
        return builder.build();
    }

    private static final boolean c(C6226h c6226h, float f10, float f11) {
        float fI = c6226h.i();
        if (f10 > c6226h.j() || fI > f10) {
            return false;
        }
        return f11 <= c6226h.e() && c6226h.l() <= f11;
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i10, InterfaceC2517J interfaceC2517J, T0 t02, C6226h c6226h) {
        if (i10 < 0) {
            return builder;
        }
        int iB = interfaceC2517J.b(i10);
        C6226h c6226hE = t02.e(iB);
        float fL = AbstractC5874j.l(c6226hE.i(), 0.0f, (int) (t02.B() >> 32));
        boolean zC = c(c6226h, fL, c6226hE.l());
        boolean zC2 = c(c6226h, fL, c6226hE.e());
        boolean z10 = t02.c(iB) == EnumC4829i.f47275b;
        int i11 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i11 |= 2;
        }
        if (z10) {
            i11 |= 4;
        }
        builder.setInsertionMarkerLocation(fL, c6226hE.l(), c6226hE.e(), c6226hE.e(), i11);
        return builder;
    }
}
