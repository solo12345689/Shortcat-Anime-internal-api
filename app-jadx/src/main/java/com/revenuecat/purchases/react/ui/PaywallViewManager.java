package com.revenuecat.purchases.react.ui;

import android.view.View;
import com.facebook.react.uimanager.C3284b0;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.react.ui.views.WrappedPaywallComposeView;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.fonts.CustomFontProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/react/ui/PaywallViewManager;", "Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;", "Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallComposeView;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "themedReactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallComposeView;", "Lcom/revenuecat/purchases/react/ui/PaywallViewShadowNode;", "createShadowNodeInstance", "()Lcom/revenuecat/purchases/react/ui/PaywallViewShadowNode;", "view", "offeringId", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "LTd/L;", "setOfferingId", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallComposeView;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;", "customFontProvider", "setFontFamily", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallComposeView;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;)V", "", "display", "setDisplayDismissButton", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallComposeView;Z)V", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "setCustomVariables", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallComposeView;Ljava/util/Map;)V", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "bridge", "setPurchaseLogic", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallComposeView;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V", "Companion", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaywallViewManager extends BasePaywallViewManager<WrappedPaywallComposeView> {
    public static final String REACT_CLASS = "Paywall";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public /* bridge */ /* synthetic */ void setCustomVariables(View view, Map map) {
        setCustomVariables((WrappedPaywallComposeView) view, (Map<String, ? extends CustomVariableValue>) map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public WrappedPaywallComposeView createViewInstance(C3284b0 themedReactContext) {
        AbstractC5504s.h(themedReactContext, "themedReactContext");
        WrappedPaywallComposeView wrappedPaywallComposeView = new WrappedPaywallComposeView(themedReactContext);
        wrappedPaywallComposeView.setPaywallListener(createPaywallListenerWrapper$react_native_purchases_ui_release(themedReactContext, wrappedPaywallComposeView));
        wrappedPaywallComposeView.setDismissHandler(getDismissHandler$react_native_purchases_ui_release(themedReactContext, wrappedPaywallComposeView));
        return wrappedPaywallComposeView;
    }

    public void setCustomVariables(WrappedPaywallComposeView view, Map<String, ? extends CustomVariableValue> customVariables) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(customVariables, "customVariables");
        view.setCustomVariables(customVariables);
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public void setDisplayDismissButton(WrappedPaywallComposeView view, boolean display) {
        AbstractC5504s.h(view, "view");
        view.setDisplayDismissButton(display);
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public void setFontFamily(WrappedPaywallComposeView view, CustomFontProvider customFontProvider) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(customFontProvider, "customFontProvider");
        view.setFontProvider(customFontProvider);
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public void setOfferingId(WrappedPaywallComposeView view, String offeringId, PresentedOfferingContext presentedOfferingContext) {
        AbstractC5504s.h(view, "view");
        view.setOfferingId(offeringId, presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public void setPurchaseLogic(WrappedPaywallComposeView view, HybridPurchaseLogicBridge bridge) {
        AbstractC5504s.h(view, "view");
        view.setPurchaseLogic(bridge);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public PaywallViewShadowNode createShadowNodeInstance() {
        return new PaywallViewShadowNode();
    }
}
