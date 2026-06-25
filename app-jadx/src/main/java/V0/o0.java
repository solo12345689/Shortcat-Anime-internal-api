package V0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import b1.AbstractC2968a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f19671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextUtils.TruncateAt f19672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O f19675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private W0.i f19677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Layout f19678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f19680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f19682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f19683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f19684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint.FontMetricsInt f19685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f19686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final X0.h[] f19687q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f19688r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private M f19689s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public o0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, O o10) {
        boolean z12;
        int i18;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout layoutA;
        this.f19671a = textPaint;
        this.f19672b = truncateAt;
        this.f19673c = z10;
        this.f19674d = z11;
        this.f19675e = o10;
        this.f19688r = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicK = q0.k(i11);
        Layout.Alignment alignmentA = m0.f19667a.a(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, X0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsE = o10.e();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsE == null || o10.i() > f10 || z14) {
                z12 = true;
                this.f19684n = false;
                i18 = i12;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                textPaint2 = textPaint;
                layoutA = j0.f19640a.a(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignmentA, i18, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                z12 = true;
                this.f19684n = true;
                layoutA = C2295k.f19643a.a(charSequence, textPaint, iCeil, metricsE, alignmentA, z10, z11, truncateAt, iCeil);
                textPaint2 = textPaint;
                i18 = i12;
                textDirectionHeuristic = textDirectionHeuristicK;
                z13 = false;
            }
            this.f19678h = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i18);
            this.f19679i = iMin;
            int i19 = iMin - 1;
            this.f19676f = (iMin >= i18 && (layoutA.getEllipsisCount(i19) > 0 || layoutA.getLineEnd(i19) != charSequence.length())) ? z12 : z13;
            long jL = q0.l(this);
            X0.h[] hVarArrJ = q0.j(this);
            this.f19687q = hVarArrJ;
            long jI = hVarArrJ != null ? q0.i(hVarArrJ) : q0.f19691b;
            this.f19680j = Math.max(r0.c(jL), r0.c(jI));
            this.f19681k = Math.max(r0.b(jL), r0.b(jI));
            Paint.FontMetricsInt fontMetricsIntH = q0.h(this, textPaint2, textDirectionHeuristic, hVarArrJ);
            this.f19686p = fontMetricsIntH != null ? fontMetricsIntH.bottom - ((int) s(i19)) : z13;
            this.f19685o = fontMetricsIntH;
            this.f19682l = X0.d.b(layoutA, i19, null, 2, null);
            this.f19683m = X0.d.d(layoutA, i19, null, 2, null);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ float B(o0 o0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return o0Var.A(i10, z10);
    }

    public static /* synthetic */ float E(o0 o0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return o0Var.D(i10, z10);
    }

    private final float g(int i10) {
        if (i10 == this.f19679i - 1) {
            return this.f19682l + this.f19683m;
        }
        return 0.0f;
    }

    private final M j() {
        M m10 = this.f19689s;
        if (m10 != null) {
            AbstractC5504s.e(m10);
            return m10;
        }
        M m11 = new M(this.f19678h);
        this.f19689s = m11;
        return m11;
    }

    public final float A(int i10, boolean z10) {
        return j().c(i10, true, z10) + g(q(i10));
    }

    public final int[] C(RectF rectF, int i10, Function2 function2) {
        return Build.VERSION.SDK_INT >= 34 ? C2290f.f19636a.c(this, rectF, i10, function2) : p0.d(this, this.f19678h, j(), rectF, i10, function2);
    }

    public final float D(int i10, boolean z10) {
        return j().c(i10, false, z10) + g(q(i10));
    }

    public final void F(int i10, int i11, Path path) {
        this.f19678h.getSelectionPath(i10, i11, path);
        if (this.f19680j == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.f19680j);
    }

    public final CharSequence G() {
        return this.f19678h.getText();
    }

    public final TextPaint H() {
        return this.f19671a;
    }

    public final W0.i I() {
        W0.i iVar = this.f19677g;
        if (iVar != null) {
            return iVar;
        }
        W0.i iVar2 = new W0.i(this.f19678h.getText(), 0, this.f19678h.getText().length(), this.f19671a.getTextLocale());
        this.f19677g = iVar2;
        return iVar2;
    }

    public final boolean J() {
        if (this.f19684n) {
            C2295k c2295k = C2295k.f19643a;
            Layout layout = this.f19678h;
            AbstractC5504s.f(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return c2295k.b((BoringLayout) layout);
        }
        j0 j0Var = j0.f19640a;
        Layout layout2 = this.f19678h;
        AbstractC5504s.f(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return j0Var.c((StaticLayout) layout2, this.f19674d);
    }

    public final boolean K(int i10) {
        return q0.m(this.f19678h, i10);
    }

    public final boolean L(int i10) {
        return this.f19678h.isRtlCharAt(i10);
    }

    public final void M(Canvas canvas) {
        if (canvas.getClipBounds(this.f19688r)) {
            int i10 = this.f19680j;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            n0 n0Var = q0.f19690a;
            n0Var.a(canvas);
            this.f19678h.draw(n0Var);
            int i11 = this.f19680j;
            if (i11 != 0) {
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public final void a(int i10, int i11, float[] fArr, int i12) {
        float fD;
        float fE;
        int length = G().length();
        if (!(i10 >= 0)) {
            AbstractC2968a.a("startOffset must be > 0");
        }
        if (!(i10 < length)) {
            AbstractC2968a.a("startOffset must be less than text length");
        }
        if (!(i11 > i10)) {
            AbstractC2968a.a("endOffset must be greater than startOffset");
        }
        if (!(i11 <= length)) {
            AbstractC2968a.a("endOffset must be smaller or equal to text length");
        }
        if (!(fArr.length - i12 >= (i11 - i10) * 4)) {
            AbstractC2968a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iQ = q(i10);
        int iQ2 = q(i11 - 1);
        J j10 = new J(this);
        if (iQ > iQ2) {
            return;
        }
        int i13 = iQ;
        int i14 = i12;
        while (true) {
            int iV = v(i13);
            int iP = p(i13);
            int iMin = Math.min(i11, iP);
            float fW = w(i13);
            float fL = l(i13);
            boolean z10 = z(i13) == 1;
            for (int iMax = Math.max(i10, iV); iMax < iMin; iMax++) {
                boolean zL = L(iMax);
                if (z10 && !zL) {
                    fD = j10.b(iMax);
                    fE = j10.c(iMax + 1);
                } else if (z10 && zL) {
                    fE = j10.d(iMax);
                    fD = j10.e(iMax + 1);
                } else if (z10 || !zL) {
                    fD = j10.d(iMax);
                    fE = j10.e(iMax + 1);
                } else {
                    fE = j10.b(iMax);
                    fD = j10.c(iMax + 1);
                }
                fArr[i14] = fD;
                fArr[i14 + 1] = fW;
                fArr[i14 + 2] = fE;
                fArr[i14 + 3] = fL;
                i14 += 4;
            }
            if (i13 == iQ2) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void b(int i10, float[] fArr) {
        float fD;
        float fE;
        int iV = v(i10);
        int iP = p(i10);
        int i11 = 0;
        if (!(fArr.length >= (iP - iV) * 2)) {
            AbstractC2968a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        J j10 = new J(this);
        boolean z10 = z(i10) == 1;
        while (iV < iP) {
            boolean zL = L(iV);
            if (z10 && !zL) {
                fD = j10.b(iV);
                fE = j10.c(iV + 1);
            } else if (z10 && zL) {
                fE = j10.d(iV);
                fD = j10.e(iV + 1);
            } else if (zL) {
                fE = j10.b(iV);
                fD = j10.c(iV + 1);
            } else {
                fD = j10.d(iV);
                fE = j10.e(iV + 1);
            }
            fArr[i11] = fD;
            fArr[i11 + 1] = fE;
            i11 += 2;
            iV++;
        }
    }

    public final RectF c(int i10) {
        float fD;
        float fD2;
        float fA;
        float fA2;
        int iQ = q(i10);
        float fW = w(iQ);
        float fL = l(iQ);
        boolean z10 = z(iQ) == 1;
        boolean zIsRtlCharAt = this.f19678h.isRtlCharAt(i10);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fA = D(i10, false);
                fA2 = D(i10 + 1, true);
            } else if (zIsRtlCharAt) {
                fA = A(i10, false);
                fA2 = A(i10 + 1, true);
            } else {
                fD = D(i10, false);
                fD2 = D(i10 + 1, true);
            }
            float f10 = fA;
            fD = fA2;
            fD2 = f10;
        } else {
            fD = A(i10, false);
            fD2 = A(i10 + 1, true);
        }
        return new RectF(fD, fW, fD2, fL);
    }

    public final boolean d() {
        return this.f19676f;
    }

    public final boolean e() {
        return this.f19674d;
    }

    public final int f() {
        return (this.f19676f ? this.f19678h.getLineBottom(this.f19679i - 1) : this.f19678h.getHeight()) + this.f19680j + this.f19681k + this.f19686p;
    }

    public final boolean h() {
        return this.f19673c;
    }

    public final Layout i() {
        return this.f19678h;
    }

    public final float k(int i10) {
        return this.f19680j + ((i10 != this.f19679i + (-1) || this.f19685o == null) ? this.f19678h.getLineBaseline(i10) : w(i10) - this.f19685o.ascent);
    }

    public final float l(int i10) {
        if (i10 != this.f19679i - 1 || this.f19685o == null) {
            return this.f19680j + this.f19678h.getLineBottom(i10) + (i10 == this.f19679i + (-1) ? this.f19681k : 0);
        }
        return this.f19678h.getLineBottom(i10 - 1) + this.f19685o.bottom;
    }

    public final int m() {
        return this.f19679i;
    }

    public final int n(int i10) {
        return this.f19678h.getEllipsisCount(i10);
    }

    public final int o(int i10) {
        return this.f19678h.getEllipsisStart(i10);
    }

    public final int p(int i10) {
        return (q0.m(this.f19678h, i10) && this.f19672b == TextUtils.TruncateAt.END) ? this.f19678h.getText().length() : this.f19678h.getLineEnd(i10);
    }

    public final int q(int i10) {
        return this.f19678h.getLineForOffset(i10);
    }

    public final int r(int i10) {
        return this.f19678h.getLineForVertical(i10 - this.f19680j);
    }

    public final float s(int i10) {
        return l(i10) - w(i10);
    }

    public final float t(int i10) {
        return this.f19678h.getLineLeft(i10) + (i10 == this.f19679i + (-1) ? this.f19682l : 0.0f);
    }

    public final float u(int i10) {
        return this.f19678h.getLineRight(i10) + (i10 == this.f19679i + (-1) ? this.f19683m : 0.0f);
    }

    public final int v(int i10) {
        return this.f19678h.getLineStart(i10);
    }

    public final float w(int i10) {
        return this.f19678h.getLineTop(i10) + (i10 == 0 ? 0 : this.f19680j);
    }

    public final int x(int i10) {
        return (q0.m(this.f19678h, i10) && this.f19672b == TextUtils.TruncateAt.END) ? this.f19678h.getLineStart(i10) + this.f19678h.getEllipsisStart(i10) : j().e(i10);
    }

    public final int y(int i10, float f10) {
        return this.f19678h.getOffsetForHorizontal(i10, f10 + ((-1) * g(i10)));
    }

    public final int z(int i10) {
        return this.f19678h.getParagraphDirection(i10);
    }

    public /* synthetic */ o0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, O o10, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        O o11;
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        float f13 = (i18 & 64) != 0 ? 1.0f : f11;
        float f14 = (i18 & 128) != 0 ? 0.0f : f12;
        boolean z12 = (i18 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z10;
        boolean z13 = (i18 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? true : z11;
        int i21 = (i18 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Integer.MAX_VALUE : i12;
        int i22 = (i18 & 2048) != 0 ? 0 : i13;
        int i23 = (i18 & 4096) != 0 ? 0 : i14;
        int i24 = (i18 & 8192) != 0 ? 0 : i15;
        int i25 = (i18 & 16384) != 0 ? 0 : i16;
        int i26 = (32768 & i18) != 0 ? 0 : i17;
        int[] iArr3 = (65536 & i18) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i18) != 0 ? null : iArr2;
        if ((i18 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            o11 = new O(charSequence2, textPaint2, i20);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            o11 = o10;
        }
        this(charSequence2, f10, textPaint2, i19, truncateAt2, i20, f13, f14, z12, z13, i21, i22, i23, i24, i25, i26, iArr3, iArr4, o11);
    }
}
