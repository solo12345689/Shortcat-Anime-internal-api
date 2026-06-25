package K0;

import Y0.AbstractC2485u;
import Y0.InterfaceC2484t;
import a1.C2529W;
import android.view.View;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.A1;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.InterfaceC2704i;
import androidx.compose.ui.platform.InterfaceC2724o1;
import androidx.compose.ui.platform.InterfaceC2731s0;
import androidx.compose.ui.platform.InterfaceC2733t0;
import androidx.compose.ui.platform.s1;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;
import m0.InterfaceC5613k;
import q0.InterfaceC6064j;
import s0.Z0;
import v0.C6811c;
import z0.InterfaceC7269a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface p0 extends E0.S {

    /* JADX INFO: renamed from: N */
    public static final a f10797N = a.f10798a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f10798a = new a();

        /* JADX INFO: renamed from: b */
        private static boolean f10799b;

        private a() {
        }

        public final boolean a() {
            return f10799b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void l();
    }

    static /* synthetic */ void I(p0 p0Var, J j10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        p0Var.A(j10, z10, z11, z12);
    }

    static /* synthetic */ o0 h(p0 p0Var, Function2 function2, InterfaceC5082a interfaceC5082a, C6811c c6811c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i10 & 4) != 0) {
            c6811c = null;
        }
        return p0Var.p(function2, interfaceC5082a, c6811c);
    }

    static /* synthetic */ void j(p0 p0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        p0Var.c(z10);
    }

    static /* synthetic */ void n(p0 p0Var, J j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        p0Var.J(j10, z10);
    }

    static /* synthetic */ void v(p0 p0Var, J j10, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        p0Var.y(j10, z10, z11);
    }

    void A(J j10, boolean z10, boolean z11, boolean z12);

    void C(float f10);

    void D(J j10);

    void F(InterfaceC5082a interfaceC5082a);

    void G();

    void H();

    void J(J j10, boolean z10);

    void K(J j10);

    void c(boolean z10);

    void e(J j10);

    long f(long j10);

    InterfaceC2704i getAccessibilityManager();

    InterfaceC5613k getAutofill();

    m0.G getAutofillManager();

    m0.H getAutofillTree();

    InterfaceC2731s0 getClipboard();

    InterfaceC2733t0 getClipboardManager();

    Zd.i getCoroutineContext();

    InterfaceC5011d getDensity();

    o0.c getDragAndDropManager();

    InterfaceC6064j getFocusOwner();

    AbstractC2485u.b getFontFamilyResolver();

    InterfaceC2484t.a getFontLoader();

    Z0 getGraphicsContext();

    InterfaceC7269a getHapticFeedBack();

    A0.b getInputModeManager();

    EnumC5027t getLayoutDirection();

    J0.f getModifierLocalManager();

    n0 getOutOfFrameExecutor();

    s.a getPlacementScope();

    E0.z getPointerIconService();

    S0.b getRectManager();

    J getRoot();

    R0.v getSemanticsOwner();

    L getSharedDrawScope();

    boolean getShowLayoutBounds();

    r0 getSnapshotObserver();

    InterfaceC2724o1 getSoftwareKeyboardController();

    C2529W getTextInputService();

    s1 getTextToolbar();

    A1 getViewConfiguration();

    F1 getWindowInfo();

    void i(View view);

    void k(J j10, int i10);

    void l(J j10, int i10);

    o0 p(Function2 function2, InterfaceC5082a interfaceC5082a, C6811c c6811c);

    void r(J j10);

    void s(J j10, long j11);

    void setShowLayoutBounds(boolean z10);

    void t(J j10);

    long u(long j10);

    Object x(Function2 function2, Zd.e eVar);

    void y(J j10, boolean z10, boolean z11);

    void z(J j10);
}
