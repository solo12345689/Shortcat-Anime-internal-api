package androidx.compose.ui.viewinterop;

import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1798l;
import K0.AbstractC1800m;
import K0.p0;
import Td.L;
import a0.C2507c;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.q;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import q0.InterfaceC6057c;
import q0.InterfaceC6064j;
import q0.InterfaceC6065k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g extends e.c implements InterfaceC6065k, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f27744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f27745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f27746c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f27747d = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        public final void a(InterfaceC6057c interfaceC6057c) {
            View viewG = f.g(g.this);
            if (viewG.isFocused() || viewG.hasFocus()) {
                return;
            }
            if (androidx.compose.ui.focus.f.b(viewG, androidx.compose.ui.focus.f.c(interfaceC6057c.b()), f.f(AbstractC1796k.o(g.this).getFocusOwner(), AbstractC1798l.a(g.this), viewG))) {
                return;
            }
            interfaceC6057c.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6057c) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        public final void a(InterfaceC6057c interfaceC6057c) {
            View viewFindNextFocusFromRect;
            View viewG = f.g(g.this);
            if (l0.h.f52331d) {
                if (viewG.hasFocus() || viewG.isFocused()) {
                    viewG.clearFocus();
                    return;
                }
                return;
            }
            if (viewG.hasFocus()) {
                InterfaceC6064j focusOwner = AbstractC1796k.o(g.this).getFocusOwner();
                View viewA = AbstractC1798l.a(g.this);
                if (!(viewG instanceof ViewGroup)) {
                    if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                    return;
                }
                Rect rectF = f.f(focusOwner, viewA, viewG);
                Integer numC = androidx.compose.ui.focus.f.c(interfaceC6057c.b());
                int iIntValue = numC != null ? numC.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                g gVar = g.this;
                if (gVar.F1() != null) {
                    AbstractC5504s.f(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewA, gVar.F1(), iIntValue);
                } else {
                    AbstractC5504s.f(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectF, iIntValue);
                }
                if (viewFindNextFocusFromRect == null || !f.d(viewG, viewFindNextFocusFromRect)) {
                    if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else {
                    viewFindNextFocusFromRect.requestFocus(iIntValue, rectF);
                    interfaceC6057c.a();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6057c) obj);
            return L.f17438a;
        }
    }

    private final FocusTargetNode E1() {
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!getNode().isAttached()) {
            H0.a.b("visitLocalDescendants called on an unattached node");
        }
        e.c node = getNode();
        if ((node.getAggregateChildKindSet$ui_release() & iA) != 0) {
            boolean z10 = false;
            for (e.c child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & iA) != 0) {
                    e.c cVarH = child$ui_release;
                    C2507c c2507c = null;
                    while (cVarH != null) {
                        if (cVarH instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarH;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
                            int i10 = 0;
                            for (e.c cVarF1 = ((AbstractC1800m) cVarH).F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
                                if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarH = cVarF1;
                                    } else {
                                        if (c2507c == null) {
                                            c2507c = new C2507c(new e.c[16], 0);
                                        }
                                        if (cVarH != null) {
                                            c2507c.c(cVarH);
                                            cVarH = null;
                                        }
                                        c2507c.c(cVarF1);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarH = AbstractC1796k.h(c2507c);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    public final View F1() {
        return this.f27744a;
    }

    @Override // q0.InterfaceC6065k
    public void P0(androidx.compose.ui.focus.i iVar) {
        iVar.g(false);
        iVar.h(this.f27746c);
        iVar.n(this.f27747d);
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = AbstractC1798l.a(this).getViewTreeObserver();
        this.f27745b = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        ViewTreeObserver viewTreeObserver = this.f27745b;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f27745b = null;
        AbstractC1798l.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f27744a = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC1796k.n(this).z0() == null) {
            return;
        }
        View viewG = f.g(this);
        InterfaceC6064j focusOwner = AbstractC1796k.o(this).getFocusOwner();
        p0 p0VarO = AbstractC1796k.o(this);
        boolean z10 = (view == null || AbstractC5504s.c(view, p0VarO) || !f.d(viewG, view)) ? false : true;
        boolean z11 = (view2 == null || AbstractC5504s.c(view2, p0VarO) || !f.d(viewG, view2)) ? false : true;
        if (z10 && z11) {
            this.f27744a = view2;
            return;
        }
        if (z11) {
            this.f27744a = view2;
            FocusTargetNode focusTargetNodeE1 = E1();
            if (focusTargetNodeE1.L1().b()) {
                return;
            }
            q.i(focusTargetNodeE1);
            return;
        }
        if (!z10) {
            this.f27744a = null;
            return;
        }
        this.f27744a = null;
        if (E1().L1().a()) {
            focusOwner.p(false, true, false, androidx.compose.ui.focus.d.f26651b.c());
        }
    }
}
