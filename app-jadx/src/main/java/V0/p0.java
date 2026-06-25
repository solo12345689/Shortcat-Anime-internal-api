package V0;

import Ud.AbstractC2273n;
import V0.M;
import android.graphics.RectF;
import android.text.Layout;
import kotlin.jvm.functions.Function2;
import oe.AbstractC5874j;
import oe.C5868d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {
    private static final float a(int i10, int i11, float[] fArr) {
        return fArr[(i10 - i11) * 2];
    }

    private static final float b(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    private static final int c(M.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, W0.f fVar, Function2 function2) {
        int iB;
        int iC;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.c() || rectF.right < f11) && (!aVar.c() || rectF.left > f10)) {
            iB = aVar.b();
            int iA = aVar.a();
            while (iA - iB > 1) {
                int i13 = (iA + iB) / 2;
                float fA = a(i13, i10, fArr);
                if ((aVar.c() || fA <= rectF.right) && (!aVar.c() || fA >= rectF.left)) {
                    iB = i13;
                } else {
                    iA = i13;
                }
            }
            if (aVar.c()) {
                iB = iA;
            }
        } else {
            iB = aVar.a() - 1;
        }
        int iB2 = fVar.b(iB + 1);
        if (iB2 == -1 || (iC = fVar.c(iB2)) <= aVar.b()) {
            return -1;
        }
        int iE = AbstractC5874j.e(iB2, aVar.b());
        int i14 = AbstractC5874j.i(iC, aVar.a());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = aVar.c() ? a(i14 - 1, i10, fArr) : a(iE, i10, fArr);
            rectF2.right = aVar.c() ? b(iE, i10, fArr) : b(i14 - 1, i10, fArr);
            if (((Boolean) function2.invoke(rectF2, rectF)).booleanValue()) {
                return i14;
            }
            i14 = fVar.d(i14);
            if (i14 == -1 || i14 <= aVar.b()) {
                break;
            }
            iE = AbstractC5874j.e(fVar.b(i14), aVar.b());
        }
        return -1;
    }

    public static final int[] d(o0 o0Var, Layout layout, M m10, RectF rectF, int i10, Function2 function2) {
        int i11;
        W0.f jVar = i10 == 1 ? new W0.j(o0Var.G(), o0Var.I()) : W0.g.a(o0Var.G(), o0Var.H());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > o0Var.l(lineForVertical) && (lineForVertical = lineForVertical + 1) >= o0Var.m()) {
            return null;
        }
        int i12 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < o0Var.w(0)) {
            return null;
        }
        int iF = f(o0Var, layout, m10, i12, rectF, jVar, function2, true);
        while (true) {
            i11 = i12;
            if (iF != -1 || i11 >= lineForVertical2) {
                break;
            }
            i12 = i11 + 1;
            iF = f(o0Var, layout, m10, i12, rectF, jVar, function2, true);
        }
        if (iF == -1) {
            return null;
        }
        int iF2 = f(o0Var, layout, m10, lineForVertical2, rectF, jVar, function2, false);
        while (iF2 == -1 && i11 < lineForVertical2) {
            int i13 = lineForVertical2 - 1;
            iF2 = f(o0Var, layout, m10, i13, rectF, jVar, function2, false);
            lineForVertical2 = i13;
        }
        if (iF2 == -1) {
            return null;
        }
        return new int[]{jVar.b(iF + 1), jVar.c(iF2 - 1)};
    }

    private static final int e(M.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, W0.f fVar, Function2 function2) {
        int iB;
        int iB2;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.c() || rectF.left > f10) && (!aVar.c() || rectF.right < f11)) {
            iB = aVar.b();
            int iA = aVar.a();
            while (iA - iB > 1) {
                int i13 = (iA + iB) / 2;
                float fA = a(i13, i10, fArr);
                if ((aVar.c() || fA <= rectF.left) && (!aVar.c() || fA >= rectF.right)) {
                    iB = i13;
                } else {
                    iA = i13;
                }
            }
            if (aVar.c()) {
                iB = iA;
            }
        } else {
            iB = aVar.b();
        }
        int iC = fVar.c(iB);
        if (iC == -1 || (iB2 = fVar.b(iC)) >= aVar.a()) {
            return -1;
        }
        int iE = AbstractC5874j.e(iB2, aVar.b());
        int i14 = AbstractC5874j.i(iC, aVar.a());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = aVar.c() ? a(i14 - 1, i10, fArr) : a(iE, i10, fArr);
            rectF2.right = aVar.c() ? b(iE, i10, fArr) : b(i14 - 1, i10, fArr);
            if (((Boolean) function2.invoke(rectF2, rectF)).booleanValue()) {
                return iE;
            }
            iE = fVar.a(iE);
            if (iE == -1 || iE >= aVar.a()) {
                break;
            }
            i14 = AbstractC5874j.i(fVar.c(iE), aVar.a());
        }
        return -1;
    }

    private static final int f(o0 o0Var, Layout layout, M m10, int i10, RectF rectF, W0.f fVar, Function2 function2, boolean z10) {
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        o0Var.b(i10, fArr);
        M.a[] aVarArrD = m10.d(i10);
        C5868d c5868dB0 = z10 ? AbstractC2273n.b0(aVarArrD) : AbstractC5874j.s(AbstractC2273n.f0(aVarArrD), 0);
        int iF = c5868dB0.f();
        int i11 = c5868dB0.i();
        int iL = c5868dB0.l();
        if ((iL > 0 && iF <= i11) || (iL < 0 && i11 <= iF)) {
            int i12 = iF;
            while (true) {
                M.a aVar = aVarArrD[i12];
                float fA = aVar.c() ? a(aVar.a() - 1, lineStart, fArr) : a(aVar.b(), lineStart, fArr);
                float fB = aVar.c() ? b(aVar.b(), lineStart, fArr) : b(aVar.a() - 1, lineStart, fArr);
                int iE = z10 ? e(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, fVar, function2) : c(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, fVar, function2);
                if (iE < 0) {
                    if (i12 == i11) {
                        break;
                    }
                    i12 += iL;
                } else {
                    return iE;
                }
            }
        }
        return -1;
    }

    private static final boolean g(RectF rectF, float f10, float f11) {
        return f11 >= rectF.left && f10 <= rectF.right;
    }
}
