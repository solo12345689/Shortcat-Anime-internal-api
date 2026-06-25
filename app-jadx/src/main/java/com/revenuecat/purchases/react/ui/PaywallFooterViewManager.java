package com.revenuecat.purchases.react.ui;

import android.content.Context;
import android.view.View;
import androidx.core.view.AbstractC2759g0;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C3284b0;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.react.ui.PaywallFooterViewManager;
import com.revenuecat.purchases.react.ui.events.OnMeasureEvent;
import com.revenuecat.purchases.react.ui.views.WrappedPaywallFooterComposeView;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.fonts.CustomFontProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001e\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;", "Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;", "Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "themedReactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;", "view", "offeringId", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "LTd/L;", "setOfferingId", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;", "customFontProvider", "setFontFamily", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;)V", "", "display", "setDisplayDismissButton", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Z)V", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "setCustomVariables", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Ljava/util/Map;)V", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "bridge", "setPurchaseLogic", "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaywallFooterViewManager extends BasePaywallViewManager<WrappedPaywallFooterComposeView> {

    /* JADX INFO: renamed from: com.revenuecat.purchases.react.ui.PaywallFooterViewManager$createViewInstance$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1", "Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;", "LTd/L;", "requestLayout", "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Ljava/lang/Runnable;", "measureAndLayout", "Ljava/lang/Runnable;", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends WrappedPaywallFooterComposeView {
        private final Runnable measureAndLayout;
        final /* synthetic */ PaywallFooterViewManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C3284b0 c3284b0, PaywallFooterViewManager paywallFooterViewManager) {
            super(c3284b0);
            this.this$0 = paywallFooterViewManager;
            this.measureAndLayout = new Runnable() { // from class: com.revenuecat.purchases.react.ui.g
                @Override // java.lang.Runnable
                public final void run() {
                    PaywallFooterViewManager.AnonymousClass1.measureAndLayout$lambda$0(this.f44163a);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void measureAndLayout$lambda$0(AnonymousClass1 anonymousClass1) {
            if (anonymousClass1.isAttachedToWindow()) {
                anonymousClass1.measure(View.MeasureSpec.makeMeasureSpec(anonymousClass1.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(anonymousClass1.getHeight(), 1073741824));
                anonymousClass1.layout(anonymousClass1.getLeft(), anonymousClass1.getTop(), anonymousClass1.getRight(), anonymousClass1.getBottom());
            }
        }

        @Override // com.revenuecat.purchases.react.ui.views.ComposeViewWrapper, android.widget.FrameLayout, android.view.View
        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            ReactApplicationContext reactApplicationContextB;
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (getIsAttached()) {
                int iE = 0;
                int iE2 = 0;
                for (View view : AbstractC2759g0.a(this)) {
                    view.measure(widthMeasureSpec, 0);
                    iE = AbstractC5874j.e(iE, view.getMeasuredWidth());
                    iE2 = AbstractC5874j.e(iE2, view.getMeasuredHeight());
                }
                int iE3 = AbstractC5874j.e(iE, getSuggestedMinimumWidth());
                int iE4 = AbstractC5874j.e(iE2, getSuggestedMinimumHeight());
                setMeasuredDimension(iE3, iE4);
                OnMeasureEvent onMeasureEvent = new OnMeasureEvent(ViewExtensionsKt.getSurfaceId(this), getId(), (int) (iE4 / getContext().getResources().getDisplayMetrics().density));
                Context context = getContext();
                C3284b0 c3284b0 = context instanceof C3284b0 ? (C3284b0) context : null;
                if (c3284b0 == null || (reactApplicationContextB = c3284b0.b()) == null) {
                    return;
                }
                this.this$0.emitEvent(reactApplicationContextB, getId(), onMeasureEvent);
            }
        }

        @Override // android.view.View, android.view.ViewParent
        public void requestLayout() {
            super.requestLayout();
            post(this.measureAndLayout);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCPaywallFooterView";
    }

    public void setCustomVariables(WrappedPaywallFooterComposeView view, Map<String, ? extends CustomVariableValue> customVariables) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(customVariables, "customVariables");
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public void setDisplayDismissButton(WrappedPaywallFooterComposeView view, boolean display) {
        AbstractC5504s.h(view, "view");
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public void setPurchaseLogic(WrappedPaywallFooterComposeView view, HybridPurchaseLogicBridge bridge) {
        AbstractC5504s.h(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public WrappedPaywallFooterComposeView createViewInstance(C3284b0 themedReactContext) {
        AbstractC5504s.h(themedReactContext, "themedReactContext");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(themedReactContext, this);
        anonymousClass1.setPaywallListener(createPaywallListenerWrapper$react_native_purchases_ui_release(themedReactContext, anonymousClass1));
        anonymousClass1.setDismissHandler(getDismissHandler$react_native_purchases_ui_release(themedReactContext, anonymousClass1));
        return anonymousClass1;
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public /* bridge */ /* synthetic */ void setCustomVariables(View view, Map map) {
        setCustomVariables((WrappedPaywallFooterComposeView) view, (Map<String, ? extends CustomVariableValue>) map);
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public void setFontFamily(WrappedPaywallFooterComposeView view, CustomFontProvider customFontProvider) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(customFontProvider, "customFontProvider");
        view.setFontProvider(customFontProvider);
    }

    @Override // com.revenuecat.purchases.react.ui.BasePaywallViewManager
    public void setOfferingId(WrappedPaywallFooterComposeView view, String offeringId, PresentedOfferingContext presentedOfferingContext) {
        AbstractC5504s.h(view, "view");
        view.setOfferingId(offeringId, presentedOfferingContext);
    }
}
