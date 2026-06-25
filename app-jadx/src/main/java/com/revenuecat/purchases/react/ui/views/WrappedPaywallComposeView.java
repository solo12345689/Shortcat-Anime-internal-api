package com.revenuecat.purchases.react.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.views.PaywallView;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\r2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#0\"¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallComposeView;", "Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;", "Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "createWrappedView", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallView;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "LTd/L;", "setPaywallListener", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)V", "Lkotlin/Function0;", "dismissHandler", "setDismissHandler", "(Lie/a;)V", "", "offeringId", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "setOfferingId", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "setFontProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)V", "", "shouldDisplayDismissButton", "setDisplayDismissButton", "(Z)V", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "setCustomVariables", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogic;", "purchaseLogic", "setPurchaseLogic", "(Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogic;)V", "requestLayout", "()V", "Ljava/lang/Runnable;", "measureAndLayout", "Ljava/lang/Runnable;", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WrappedPaywallComposeView extends ComposeViewWrapper<PaywallView> {
    private final Runnable measureAndLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedPaywallComposeView(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.measureAndLayout = new Runnable() { // from class: com.revenuecat.purchases.react.ui.views.c
            @Override // java.lang.Runnable
            public final void run() {
                WrappedPaywallComposeView.measureAndLayout$lambda$0(this.f44176a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void measureAndLayout$lambda$0(WrappedPaywallComposeView wrappedPaywallComposeView) {
        if (wrappedPaywallComposeView.isAttachedToWindow()) {
            wrappedPaywallComposeView.measure(View.MeasureSpec.makeMeasureSpec(wrappedPaywallComposeView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(wrappedPaywallComposeView.getHeight(), 1073741824));
            wrappedPaywallComposeView.layout(wrappedPaywallComposeView.getLeft(), wrappedPaywallComposeView.getTop(), wrappedPaywallComposeView.getRight(), wrappedPaywallComposeView.getBottom());
        }
    }

    public static /* synthetic */ void setOfferingId$default(WrappedPaywallComposeView wrappedPaywallComposeView, String str, PresentedOfferingContext presentedOfferingContext, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            presentedOfferingContext = null;
        }
        wrappedPaywallComposeView.setOfferingId(str, presentedOfferingContext);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }

    public final void setCustomVariables(Map<String, ? extends CustomVariableValue> customVariables) {
        AbstractC5504s.h(customVariables, "customVariables");
        PaywallView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setCustomVariables(customVariables);
        }
    }

    public final void setDismissHandler(InterfaceC5082a dismissHandler) {
        PaywallView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setDismissHandler(dismissHandler);
        }
    }

    public final void setDisplayDismissButton(boolean shouldDisplayDismissButton) {
        PaywallView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setDisplayDismissButton(shouldDisplayDismissButton);
        }
    }

    public final void setFontProvider(FontProvider fontProvider) {
        PaywallView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setFontProvider(fontProvider);
        }
    }

    public final void setOfferingId(String offeringId, PresentedOfferingContext presentedOfferingContext) {
        PaywallView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setOfferingId(offeringId, presentedOfferingContext);
        }
    }

    public final void setPaywallListener(PaywallListener listener) {
        PaywallView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setPaywallListener(listener);
        }
    }

    public final void setPurchaseLogic(PurchaseLogic purchaseLogic) {
        PaywallView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setPurchaseLogic(purchaseLogic);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.revenuecat.purchases.react.ui.views.ComposeViewWrapper
    public PaywallView createWrappedView(Context context, AttributeSet attrs) {
        AbstractC5504s.h(context, "context");
        return new PaywallView(context, attrs);
    }
}
