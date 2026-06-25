package androidx.compose.ui.platform;

import Y.AbstractC2454w;
import Y.AbstractC2460y;
import Y.C2433o1;
import Y.InterfaceC2425m;
import Y.InterfaceC2457x;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2680a extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<AbstractC2460y> cachedViewTreeCompositionContext;
    private InterfaceC2457x composition;
    private boolean creatingComposition;
    private InterfaceC5082a disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private AbstractC2460y parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0472a extends AbstractC5506u implements Function2 {
        C0472a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if (!interfaceC2425m.p((i10 & 3) != 2, i10 & 1)) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:249)");
            }
            AbstractC2680a.this.Content(interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    public /* synthetic */ AbstractC2680a(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final AbstractC2460y a(AbstractC2460y abstractC2460y) {
        AbstractC2460y abstractC2460y2 = e(abstractC2460y) ? abstractC2460y : null;
        if (abstractC2460y2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(abstractC2460y2);
        }
        return abstractC2460y;
    }

    private final void b() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void c() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = O1.c(this, f(), g0.i.b(-656146368, true, new C0472a()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private final boolean e(AbstractC2460y abstractC2460y) {
        return !(abstractC2460y instanceof C2433o1) || ((C2433o1.d) ((C2433o1) abstractC2460y).n0().getValue()).compareTo(C2433o1.d.f22432b) > 0;
    }

    private final AbstractC2460y f() {
        AbstractC2460y abstractC2460y;
        AbstractC2460y abstractC2460yA = this.parentContext;
        if (abstractC2460yA == null) {
            AbstractC2460y abstractC2460yD = K1.d(this);
            AbstractC2460y abstractC2460y2 = null;
            abstractC2460yA = abstractC2460yD != null ? a(abstractC2460yD) : null;
            if (abstractC2460yA == null) {
                WeakReference<AbstractC2460y> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (abstractC2460y = weakReference.get()) != null && e(abstractC2460y)) {
                    abstractC2460y2 = abstractC2460y;
                }
                return abstractC2460y2 == null ? a(K1.h(this)) : abstractC2460y2;
            }
        }
        return abstractC2460yA;
    }

    private final void setParentContext(AbstractC2460y abstractC2460y) {
        if (this.parentContext != abstractC2460y) {
            this.parentContext = abstractC2460y;
            if (abstractC2460y != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            InterfaceC2457x interfaceC2457x = this.composition;
            if (interfaceC2457x != null) {
                interfaceC2457x.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(InterfaceC2425m interfaceC2425m, int i10);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        c();
    }

    public final void disposeComposition() {
        InterfaceC2457x interfaceC2457x = this.composition;
        if (interfaceC2457x != null) {
            interfaceC2457x.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        internalOnLayout$ui_release(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        c();
        internalOnMeasure$ui_release(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(AbstractC2460y abstractC2460y) {
        setParentContext(abstractC2460y);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((K0.p0) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(y1 y1Var) {
        InterfaceC5082a interfaceC5082a = this.disposeViewCompositionStrategy;
        if (interfaceC5082a != null) {
            interfaceC5082a.invoke();
        }
        this.disposeViewCompositionStrategy = y1Var.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC2680a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = y1.f27631a.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
