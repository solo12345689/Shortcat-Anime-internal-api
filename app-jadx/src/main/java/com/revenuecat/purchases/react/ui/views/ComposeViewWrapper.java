package com.revenuecat.purchases.react.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\rJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\tJ!\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;", "Landroid/view/View;", "T", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "LTd/L;", "init", "createWrappedView", "(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "wrappedView", "Landroid/view/View;", "getWrappedView", "()Landroid/view/View;", "setWrappedView", "(Landroid/view/View;)V", "isAttached", "Z", "()Z", "setAttached", "(Z)V", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ComposeViewWrapper<T extends View> extends FrameLayout {
    private boolean isAttached;
    private T wrappedView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5504s.h(context, "context");
        init(context, attributeSet);
    }

    private final void init(Context context, AttributeSet attrs) {
        T t10 = (T) createWrappedView(context, attrs);
        t10.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.wrappedView = t10;
        addView(t10);
    }

    protected abstract T createWrappedView(Context context, AttributeSet attrs);

    protected final T getWrappedView() {
        return this.wrappedView;
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    protected final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttached = true;
        post(new Runnable() { // from class: com.revenuecat.purchases.react.ui.views.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f44174a.requestLayout();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttached = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        T t10;
        super.onLayout(changed, left, top, right, bottom);
        if (!this.isAttached || (t10 = this.wrappedView) == null) {
            return;
        }
        t10.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.isAttached) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
        }
    }

    protected final void setAttached(boolean z10) {
        this.isAttached = z10;
    }

    protected final void setWrappedView(T t10) {
        this.wrappedView = t10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewWrapper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5504s.h(context, "context");
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewWrapper(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        init(context, null);
    }
}
