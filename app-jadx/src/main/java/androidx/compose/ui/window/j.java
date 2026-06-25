package androidx.compose.ui.window;

import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.AbstractC2460y;
import Y.B1;
import Y.C0;
import Y.InterfaceC2425m;
import Y.b2;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractC2680a;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2777p0;
import androidx.core.view.I;
import androidx.core.view.L0;
import java.util.List;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class j extends AbstractC2680a implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Window f27833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f27834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27838f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends C2777p0.b {
        a() {
            super(1);
        }

        @Override // androidx.core.view.C2777p0.b
        public L0 onProgress(L0 l02, List list) {
            j jVar = j.this;
            if (!jVar.f27836d) {
                View childAt = jVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, jVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, jVar.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return l02.o(iMax, iMax2, iMax3, iMax4);
                }
            }
            return l02;
        }

        @Override // androidx.core.view.C2777p0.b
        public C2777p0.a onStart(C2777p0 c2777p0, C2777p0.a aVar) {
            j jVar = j.this;
            if (!jVar.f27836d) {
                View childAt = jVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, jVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, jVar.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return aVar.c(A1.b.c(iMax, iMax2, iMax3, iMax4));
                }
            }
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27841b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(2);
            this.f27841b = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            j.this.Content(interfaceC2425m, AbstractC2409g1.a(this.f27841b | 1));
        }
    }

    public j(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.f27833a = window;
        this.f27834b = b2.e(h.f27827a.a(), null, 2, null);
        AbstractC2747a0.w0(this, this);
        AbstractC2747a0.C0(this, new a());
    }

    private final Function2 getContent() {
        return (Function2) this.f27834b.getValue();
    }

    private final void setContent(Function2 function2) {
        this.f27834b.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    public void Content(InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1735448596);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (interfaceC2425mG.p((i11 & 3) != 2, i11 & 1)) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1735448596, i11, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:432)");
            }
            getContent().invoke(interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        } else {
            interfaceC2425mG.K();
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(i10));
        }
    }

    @Override // androidx.core.view.I
    public L0 d(View view, L0 l02) {
        if (!this.f27836d) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return l02.o(iMax, iMax2, iMax3, iMax4);
            }
        }
        return l02;
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f27838f;
    }

    public Window h() {
        return this.f27833a;
    }

    public final boolean i(MotionEvent motionEvent) {
        View childAt;
        int iD;
        float x10 = motionEvent.getX();
        if (!Float.isInfinite(x10) && !Float.isNaN(x10)) {
            float y10 = motionEvent.getY();
            if (Float.isInfinite(y10) || Float.isNaN(y10) || (childAt = getChildAt(0)) == null) {
                return false;
            }
            int left = getLeft() + childAt.getLeft();
            int width = childAt.getWidth() + left;
            int top = getTop() + childAt.getTop();
            int height = childAt.getHeight() + top;
            int iD2 = AbstractC5466a.d(motionEvent.getX());
            if (left <= iD2 && iD2 <= width && top <= (iD = AbstractC5466a.d(motionEvent.getY())) && iD <= height) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i14 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i15 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    public void internalOnMeasure$ui_release(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui_release(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int i12 = (mode != Integer.MIN_VALUE || this.f27835c || this.f27836d || h().getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i13 = size - paddingLeft;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = i12 - paddingTop;
        int i15 = i14 >= 0 ? i14 : 0;
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        }
        childAt.measure(i10, i11);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingTop));
        if (this.f27836d || childAt.getMeasuredHeight() + paddingTop <= size2 || h().getAttributes().height != -2) {
            return;
        }
        h().addFlags(Integer.MIN_VALUE);
        if (this.f27835c) {
            return;
        }
        h().setLayout(-1, -1);
    }

    public final void j(AbstractC2460y abstractC2460y, Function2 function2) {
        setParentCompositionContext(abstractC2460y);
        setContent(function2);
        this.f27838f = true;
        createComposition();
    }

    public final void k(boolean z10, boolean z11) {
        boolean z12 = (this.f27837e && z10 == this.f27835c && z11 == this.f27836d) ? false : true;
        this.f27835c = z10;
        this.f27836d = z11;
        if (z12) {
            WindowManager.LayoutParams attributes = h().getAttributes();
            int i10 = z10 ? -2 : -1;
            if (i10 == attributes.width && this.f27837e) {
                return;
            }
            h().setLayout(i10, -2);
            this.f27837e = true;
        }
    }
}
