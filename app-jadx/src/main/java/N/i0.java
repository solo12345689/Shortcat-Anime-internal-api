package N;

import Df.InterfaceC1279l;
import K.C1774y;
import U0.C2197e;
import U0.N0;
import U0.R0;
import U0.S0;
import U0.T0;
import U0.W0;
import U0.X0;
import a1.C2524Q;
import a1.C2533a;
import a1.C2539g;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.A1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.s1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f12493a = new i0();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f12494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f12495b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.L l10, kotlin.jvm.internal.L l11) {
            super(1);
            this.f12494a = l10;
            this.f12495b = l11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(InterfaceC1279l interfaceC1279l) {
            kotlin.jvm.internal.L l10 = this.f12494a;
            if (l10.f52257a == -1) {
                l10.f52257a = interfaceC1279l.c().f();
            }
            this.f12495b.f52257a = interfaceC1279l.c().i() + 1;
            return "";
        }
    }

    private i0() {
    }

    private final void A(x0 x0Var, DeleteGesture deleteGesture, w0 w0Var) {
        e(x0Var, j0.w(w0Var, s1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), R0.f18757a.h()), M.d.f11612a.a());
    }

    private final void B(C1774y c1774y, DeleteRangeGesture deleteRangeGesture, Q.F f10) {
        if (f10 != null) {
            f10.X(j0.x(c1774y, s1.f(deleteRangeGesture.getDeletionStartArea()), s1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), R0.f18757a.h()));
        }
    }

    private final void C(x0 x0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        e(x0Var, j0.y(w0Var, s1.f(deleteRangeGesture.getDeletionStartArea()), s1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), R0.f18757a.h()), M.d.f11612a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(x0 x0Var) {
        x0.b(x0Var);
        x0.a(x0Var);
        O.a aVar = O.a.MergeIfPossible;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Q.F f10) {
        if (f10 != null) {
            f10.n();
        }
    }

    private final void H(C1774y c1774y, SelectGesture selectGesture, Q.F f10) {
        if (f10 != null) {
            f10.g0(j0.v(c1774y, s1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), R0.f18757a.h()));
        }
    }

    private final void I(x0 x0Var, SelectGesture selectGesture, w0 w0Var) {
        e(x0Var, j0.w(w0Var, s1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), R0.f18757a.h()), M.d.f11612a.b());
    }

    private final void J(C1774y c1774y, SelectRangeGesture selectRangeGesture, Q.F f10) {
        if (f10 != null) {
            f10.g0(j0.x(c1774y, s1.f(selectRangeGesture.getSelectionStartArea()), s1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), R0.f18757a.h()));
        }
    }

    private final void K(x0 x0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        e(x0Var, j0.y(w0Var, s1.f(selectRangeGesture.getSelectionStartArea()), s1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), R0.f18757a.h()), M.d.f11612a.b());
    }

    private final int L(int i10) {
        return i10 != 1 ? i10 != 2 ? N0.f18754a.a() : N0.f18754a.a() : N0.f18754a.b();
    }

    private final int c(x0 x0Var, HandwritingGesture handwritingGesture) {
        x0.b(x0Var);
        x0.a(x0Var);
        O.a aVar = O.a.MergeIfPossible;
        throw null;
    }

    private final int d(HandwritingGesture handwritingGesture, Function1 function1) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        function1.invoke(new C2533a(fallbackText, 1));
        return 5;
    }

    private final void e(x0 x0Var, long j10, int i10) {
        if (!W0.h(j10)) {
            throw null;
        }
        x0.b(x0Var);
        x0.a(x0Var);
        O.a aVar = O.a.MergeIfPossible;
        throw null;
    }

    private final int f(C1774y c1774y, DeleteGesture deleteGesture, C2197e c2197e, Function1 function1) {
        int iL = L(deleteGesture.getGranularity());
        long jV = j0.v(c1774y, s1.f(deleteGesture.getDeletionArea()), iL, R0.f18757a.h());
        if (W0.h(jV)) {
            return f12493a.d(d0.a(deleteGesture), function1);
        }
        k(jV, c2197e, N0.d(iL, N0.f18754a.b()), function1);
        return 1;
    }

    private final int g(x0 x0Var, DeleteGesture deleteGesture, w0 w0Var) {
        int iL = L(deleteGesture.getGranularity());
        long jW = j0.w(w0Var, s1.f(deleteGesture.getDeletionArea()), iL, R0.f18757a.h());
        if (W0.h(jW)) {
            return f12493a.c(x0Var, d0.a(deleteGesture));
        }
        j(x0Var, jW, N0.d(iL, N0.f18754a.b()));
        return 1;
    }

    private final int h(C1774y c1774y, DeleteRangeGesture deleteRangeGesture, C2197e c2197e, Function1 function1) {
        int iL = L(deleteRangeGesture.getGranularity());
        long jX = j0.x(c1774y, s1.f(deleteRangeGesture.getDeletionStartArea()), s1.f(deleteRangeGesture.getDeletionEndArea()), iL, R0.f18757a.h());
        if (W0.h(jX)) {
            return f12493a.d(d0.a(deleteRangeGesture), function1);
        }
        k(jX, c2197e, N0.d(iL, N0.f18754a.b()), function1);
        return 1;
    }

    private final int i(x0 x0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        int iL = L(deleteRangeGesture.getGranularity());
        long jY = j0.y(w0Var, s1.f(deleteRangeGesture.getDeletionStartArea()), s1.f(deleteRangeGesture.getDeletionEndArea()), iL, R0.f18757a.h());
        if (W0.h(jY)) {
            return f12493a.c(x0Var, d0.a(deleteRangeGesture));
        }
        j(x0Var, jY, N0.d(iL, N0.f18754a.b()));
        return 1;
    }

    private final void j(x0 x0Var, long j10, boolean z10) {
        if (z10) {
            throw null;
        }
        x0.c(x0Var, "", j10, null, false, 12, null);
    }

    private final void k(long j10, C2197e c2197e, boolean z10, Function1 function1) {
        if (z10) {
            j10 = j0.m(j10, c2197e);
        }
        function1.invoke(j0.n(new C2524Q(W0.i(j10), W0.i(j10)), new C2539g(W0.j(j10), 0)));
    }

    private final int n(C1774y c1774y, InsertGesture insertGesture, A1 a12, Function1 function1) {
        K.Z zJ;
        T0 t0F;
        if (a12 == null) {
            return d(d0.a(insertGesture), function1);
        }
        int iQ = j0.q(c1774y, j0.F(insertGesture.getInsertionPoint()), a12);
        if (iQ == -1 || !((zJ = c1774y.j()) == null || (t0F = zJ.f()) == null || !j0.z(t0F, iQ))) {
            return d(d0.a(insertGesture), function1);
        }
        p(iQ, insertGesture.getTextToInsert(), function1);
        return 1;
    }

    private final int o(x0 x0Var, InsertGesture insertGesture, w0 w0Var, A1 a12) {
        int iR = j0.r(w0Var, j0.F(insertGesture.getInsertionPoint()), a12);
        if (iR == -1) {
            return c(x0Var, d0.a(insertGesture));
        }
        x0.c(x0Var, insertGesture.getTextToInsert(), X0.a(iR), null, false, 12, null);
        return 1;
    }

    private final void p(int i10, String str, Function1 function1) {
        function1.invoke(j0.n(new C2524Q(i10, i10), new C2533a(str, 1)));
    }

    private final int q(C1774y c1774y, JoinOrSplitGesture joinOrSplitGesture, C2197e c2197e, A1 a12, Function1 function1) {
        K.Z zJ;
        T0 t0F;
        if (a12 == null) {
            return d(d0.a(joinOrSplitGesture), function1);
        }
        int iQ = j0.q(c1774y, j0.F(joinOrSplitGesture.getJoinOrSplitPoint()), a12);
        if (iQ == -1 || !((zJ = c1774y.j()) == null || (t0F = zJ.f()) == null || !j0.z(t0F, iQ))) {
            return d(d0.a(joinOrSplitGesture), function1);
        }
        long jE = j0.E(c2197e, iQ);
        if (W0.h(jE)) {
            p(W0.n(jE), " ", function1);
        } else {
            k(jE, c2197e, false, function1);
        }
        return 1;
    }

    private final int r(x0 x0Var, JoinOrSplitGesture joinOrSplitGesture, w0 w0Var, A1 a12) {
        throw null;
    }

    private final int s(C1774y c1774y, RemoveSpaceGesture removeSpaceGesture, C2197e c2197e, A1 a12, Function1 function1) {
        K.Z zJ = c1774y.j();
        long jT = j0.t(zJ != null ? zJ.f() : null, j0.F(removeSpaceGesture.getStartPoint()), j0.F(removeSpaceGesture.getEndPoint()), c1774y.i(), a12);
        if (W0.h(jT)) {
            return f12493a.d(d0.a(removeSpaceGesture), function1);
        }
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f52257a = -1;
        kotlin.jvm.internal.L l11 = new kotlin.jvm.internal.L();
        l11.f52257a = -1;
        String strJ = new Df.p("\\s+").j(X0.e(c2197e, jT), new a(l10, l11));
        if (l10.f52257a == -1 || l11.f52257a == -1) {
            return d(d0.a(removeSpaceGesture), function1);
        }
        int iN = W0.n(jT) + l10.f52257a;
        int iN2 = W0.n(jT) + l11.f52257a;
        String strSubstring = strJ.substring(l10.f52257a, strJ.length() - (W0.j(jT) - l11.f52257a));
        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        function1.invoke(j0.n(new C2524Q(iN, iN2), new C2533a(strSubstring, 1)));
        return 1;
    }

    private final int t(x0 x0Var, RemoveSpaceGesture removeSpaceGesture, w0 w0Var, A1 a12) {
        throw null;
    }

    private final int u(C1774y c1774y, SelectGesture selectGesture, Q.F f10, Function1 function1) {
        long jV = j0.v(c1774y, s1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), R0.f18757a.h());
        if (W0.h(jV)) {
            return f12493a.d(d0.a(selectGesture), function1);
        }
        y(jV, f10, function1);
        return 1;
    }

    private final int v(x0 x0Var, SelectGesture selectGesture, w0 w0Var) {
        if (W0.h(j0.w(w0Var, s1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), R0.f18757a.h()))) {
            return f12493a.c(x0Var, d0.a(selectGesture));
        }
        throw null;
    }

    private final int w(C1774y c1774y, SelectRangeGesture selectRangeGesture, Q.F f10, Function1 function1) {
        long jX = j0.x(c1774y, s1.f(selectRangeGesture.getSelectionStartArea()), s1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), R0.f18757a.h());
        if (W0.h(jX)) {
            return f12493a.d(d0.a(selectRangeGesture), function1);
        }
        y(jX, f10, function1);
        return 1;
    }

    private final int x(x0 x0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        if (W0.h(j0.y(w0Var, s1.f(selectRangeGesture.getSelectionStartArea()), s1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), R0.f18757a.h()))) {
            return f12493a.c(x0Var, d0.a(selectRangeGesture));
        }
        throw null;
    }

    private final void y(long j10, Q.F f10, Function1 function1) {
        function1.invoke(new C2524Q(W0.n(j10), W0.i(j10)));
        if (f10 != null) {
            f10.v(true);
        }
    }

    private final void z(C1774y c1774y, DeleteGesture deleteGesture, Q.F f10) {
        if (f10 != null) {
            f10.X(j0.v(c1774y, s1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), R0.f18757a.h()));
        }
    }

    public final boolean D(C1774y c1774y, PreviewableHandwritingGesture previewableHandwritingGesture, final Q.F f10, CancellationSignal cancellationSignal) {
        T0 t0F;
        S0 s0L;
        C2197e c2197eW = c1774y.w();
        if (c2197eW == null) {
            return false;
        }
        K.Z zJ = c1774y.j();
        if (!AbstractC5504s.c(c2197eW, (zJ == null || (t0F = zJ.f()) == null || (s0L = t0F.l()) == null) ? null : s0L.j())) {
            return false;
        }
        if (e0.a(previewableHandwritingGesture)) {
            H(c1774y, f0.a(previewableHandwritingGesture), f10);
        } else if (B.a(previewableHandwritingGesture)) {
            z(c1774y, C.a(previewableHandwritingGesture), f10);
        } else if (D.a(previewableHandwritingGesture)) {
            J(c1774y, E.a(previewableHandwritingGesture), f10);
        } else {
            if (!F.a(previewableHandwritingGesture)) {
                return false;
            }
            B(c1774y, G.a(previewableHandwritingGesture), f10);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: N.g0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                i0.G(f10);
            }
        });
        return true;
    }

    public final boolean E(final x0 x0Var, PreviewableHandwritingGesture previewableHandwritingGesture, w0 w0Var, CancellationSignal cancellationSignal) {
        if (e0.a(previewableHandwritingGesture)) {
            I(x0Var, f0.a(previewableHandwritingGesture), w0Var);
        } else if (B.a(previewableHandwritingGesture)) {
            A(x0Var, C.a(previewableHandwritingGesture), w0Var);
        } else if (D.a(previewableHandwritingGesture)) {
            K(x0Var, E.a(previewableHandwritingGesture), w0Var);
        } else {
            if (!F.a(previewableHandwritingGesture)) {
                return false;
            }
            C(x0Var, G.a(previewableHandwritingGesture), w0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener(x0Var) { // from class: N.h0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                i0.F(null);
            }
        });
        return true;
    }

    public final int l(C1774y c1774y, HandwritingGesture handwritingGesture, Q.F f10, A1 a12, Function1 function1) {
        T0 t0F;
        S0 s0L;
        C2197e c2197eW = c1774y.w();
        if (c2197eW == null) {
            return 3;
        }
        K.Z zJ = c1774y.j();
        if (!AbstractC5504s.c(c2197eW, (zJ == null || (t0F = zJ.f()) == null || (s0L = t0F.l()) == null) ? null : s0L.j())) {
            return 3;
        }
        if (e0.a(handwritingGesture)) {
            return u(c1774y, f0.a(handwritingGesture), f10, function1);
        }
        if (B.a(handwritingGesture)) {
            return f(c1774y, C.a(handwritingGesture), c2197eW, function1);
        }
        if (D.a(handwritingGesture)) {
            return w(c1774y, E.a(handwritingGesture), f10, function1);
        }
        if (F.a(handwritingGesture)) {
            return h(c1774y, G.a(handwritingGesture), c2197eW, function1);
        }
        if (O.a(handwritingGesture)) {
            return q(c1774y, P.a(handwritingGesture), c2197eW, a12, function1);
        }
        if (J.a(handwritingGesture)) {
            return n(c1774y, K.a(handwritingGesture), a12, function1);
        }
        if (M.a(handwritingGesture)) {
            return s(c1774y, N.a(handwritingGesture), c2197eW, a12, function1);
        }
        return 2;
    }

    public final int m(x0 x0Var, HandwritingGesture handwritingGesture, w0 w0Var, A1 a12) {
        if (e0.a(handwritingGesture)) {
            return v(x0Var, f0.a(handwritingGesture), w0Var);
        }
        if (B.a(handwritingGesture)) {
            return g(x0Var, C.a(handwritingGesture), w0Var);
        }
        if (D.a(handwritingGesture)) {
            return x(x0Var, E.a(handwritingGesture), w0Var);
        }
        if (F.a(handwritingGesture)) {
            return i(x0Var, G.a(handwritingGesture), w0Var);
        }
        if (O.a(handwritingGesture)) {
            return r(x0Var, P.a(handwritingGesture), w0Var, a12);
        }
        if (J.a(handwritingGesture)) {
            return o(x0Var, K.a(handwritingGesture), w0Var, a12);
        }
        if (M.a(handwritingGesture)) {
            return t(x0Var, N.a(handwritingGesture), w0Var, a12);
        }
        return 2;
    }
}
