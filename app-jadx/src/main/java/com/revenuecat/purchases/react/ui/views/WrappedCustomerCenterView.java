package com.revenuecat.purchases.react.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;", "Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;", "Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "createWrappedView", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/revenuecat/purchases/ui/revenuecatui/views/CustomerCenterView;", "Lkotlin/Function0;", "LTd/L;", "dismissHandler", "setDismissHandler", "(Lie/a;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "listener", "setCustomerCenterListener", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V", "requestLayout", "()V", "Ljava/lang/Runnable;", "measureAndLayout", "Ljava/lang/Runnable;", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WrappedCustomerCenterView extends ComposeViewWrapper<CustomerCenterView> {
    private final Runnable measureAndLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedCustomerCenterView(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.measureAndLayout = new Runnable() { // from class: com.revenuecat.purchases.react.ui.views.b
            @Override // java.lang.Runnable
            public final void run() {
                WrappedCustomerCenterView.measureAndLayout$lambda$0(this.f44175a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void measureAndLayout$lambda$0(WrappedCustomerCenterView wrappedCustomerCenterView) {
        if (wrappedCustomerCenterView.isAttachedToWindow()) {
            wrappedCustomerCenterView.measure(View.MeasureSpec.makeMeasureSpec(wrappedCustomerCenterView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(wrappedCustomerCenterView.getHeight(), 1073741824));
            wrappedCustomerCenterView.layout(wrappedCustomerCenterView.getLeft(), wrappedCustomerCenterView.getTop(), wrappedCustomerCenterView.getRight(), wrappedCustomerCenterView.getBottom());
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }

    public final void setCustomerCenterListener(CustomerCenterListener listener) {
        CustomerCenterView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setCustomerCenterListener(listener);
        }
    }

    public final void setDismissHandler(InterfaceC5082a dismissHandler) {
        CustomerCenterView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setDismissHandler(dismissHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.revenuecat.purchases.react.ui.views.ComposeViewWrapper
    public CustomerCenterView createWrappedView(Context context, AttributeSet attrs) {
        AbstractC5504s.h(context, "context");
        return new CustomerCenterView(context, attrs);
    }
}
