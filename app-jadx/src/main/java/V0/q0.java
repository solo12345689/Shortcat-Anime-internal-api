package V0;

import Ud.AbstractC2273n;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n0 f19690a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f19691b = a(0, 0);

    public static final long a(int i10, int i11) {
        return r0.a((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt h(o0 o0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, X0.h[] hVarArr) {
        int iM = o0Var.m() - 1;
        if (o0Var.i().getLineStart(iM) != o0Var.i().getLineEnd(iM) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        X0.h hVar = (X0.h) AbstractC2273n.X(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iM == 0 || !hVar.e()) ? hVar.e() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutB = j0.b(j0.f19640a, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, o0Var.h(), o0Var.e(), 0, 0, 0, 0, null, null, 2072512, null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutB.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutB.getLineDescent(0);
        fontMetricsInt.top = staticLayoutB.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutB.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(X0.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (X0.h hVar : hVarArr) {
            if (hVar.c() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.d()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f19691b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X0.h[] j(o0 o0Var) {
        if (!(o0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = o0Var.G();
        AbstractC5504s.f(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!U.a((Spanned) charSequenceG, X0.h.class) && o0Var.G().length() > 0) {
            return null;
        }
        CharSequence charSequenceG2 = o0Var.G();
        AbstractC5504s.f(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (X0.h[]) ((Spanned) charSequenceG2).getSpans(0, o0Var.G().length(), X0.h.class);
    }

    public static final TextDirectionHeuristic k(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(o0 o0Var) {
        if (o0Var.h() || o0Var.J()) {
            return f19691b;
        }
        TextPaint paint = o0Var.i().getPaint();
        CharSequence text = o0Var.i().getText();
        Rect rectC = T.c(paint, text, o0Var.i().getLineStart(0), o0Var.i().getLineEnd(0));
        int lineAscent = o0Var.i().getLineAscent(0);
        int i10 = rectC.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : o0Var.i().getTopPadding();
        if (o0Var.m() != 1) {
            int iM = o0Var.m() - 1;
            rectC = T.c(paint, text, o0Var.i().getLineStart(iM), o0Var.i().getLineEnd(iM));
        }
        int lineDescent = o0Var.i().getLineDescent(o0Var.m() - 1);
        int i11 = rectC.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : o0Var.i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f19691b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i10) {
        return layout.getEllipsisCount(i10) > 0;
    }
}
