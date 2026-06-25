package com.revenuecat.purchases.react.ui;

import Td.L;
import U6.c;
import android.util.Log;
import android.view.View;
import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper;
import com.revenuecat.purchases.react.ui.customercenter.events.CustomerCenterEventName;
import com.revenuecat.purchases.react.ui.views.WrappedCustomerCenterView;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ1\u0010 \u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;", "<init>", "()V", "LU6/c$a;", "", "", "Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;", "event", "putEvent", "(LU6/c$a;Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;)LU6/c$a;", "Lcom/facebook/react/bridge/ReactContext;", "context", "view", "LTd/L;", "emitDismissEvent", "(Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;)V", "Lcom/facebook/react/uimanager/b0;", "themedReactContext", "Lcom/revenuecat/purchases/hybridcommon/ui/CustomerCenterListenerWrapper;", "createCustomerCenterListener", "(Lcom/facebook/react/uimanager/b0;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;)Lcom/revenuecat/purchases/hybridcommon/ui/CustomerCenterListenerWrapper;", "action", "url", "emitManagementOptionSelectedEvent", "(Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Ljava/lang/String;Ljava/lang/String;)V", "actionId", "purchaseIdentifier", "emitCustomActionSelectedEvent", "Lcom/facebook/react/bridge/WritableMap;", "params", "emitEvent", "(Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;Lcom/facebook/react/bridge/WritableMap;)V", "getName", "()Ljava/lang/String;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;", "onDropViewInstance", "(Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;)V", "Companion", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomerCenterViewManager extends SimpleViewManager<WrappedCustomerCenterView> {
    public static final String REACT_CLASS = "CustomerCenterView";

    private final CustomerCenterListenerWrapper createCustomerCenterListener(final C3284b0 themedReactContext, final WrappedCustomerCenterView view) {
        return new CustomerCenterListenerWrapper() { // from class: com.revenuecat.purchases.react.ui.CustomerCenterViewManager.createCustomerCenterListener.1
            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onCustomActionSelectedWrapper(String actionId, String purchaseIdentifier) {
                AbstractC5504s.h(actionId, "actionId");
                CustomerCenterViewManager.this.emitCustomActionSelectedEvent(themedReactContext, view, actionId, purchaseIdentifier);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onFeedbackSurveyCompletedWrapper(String feedbackSurveyOptionId) {
                AbstractC5504s.h(feedbackSurveyOptionId, "feedbackSurveyOptionId");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("feedbackSurveyOptionId", feedbackSurveyOptionId);
                CustomerCenterViewManager.this.emitEvent(themedReactContext, view, CustomerCenterEventName.ON_FEEDBACK_SURVEY_COMPLETED, writableNativeMap);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onManagementOptionSelectedWrapper(String action, String customAction, String purchaseIdentifier) {
                AbstractC5504s.h(action, "action");
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onPromotionalOfferSucceededWrapper(Map<String, ? extends Object> customerInfo, Map<String, ? extends Object> transaction, String offerId) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                AbstractC5504s.h(transaction, "transaction");
                AbstractC5504s.h(offerId, "offerId");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap("customerInfo", RNPurchasesConverters.convertMapToWriteableMap(customerInfo));
                writableNativeMap.putMap("transaction", RNPurchasesConverters.convertMapToWriteableMap(transaction));
                writableNativeMap.putString("offerId", offerId);
                CustomerCenterViewManager.this.emitEvent(themedReactContext, view, CustomerCenterEventName.ON_PROMOTIONAL_OFFER_SUCCEEDED, writableNativeMap);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onRestoreCompletedWrapper(Map<String, ? extends Object> customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap("customerInfo", RNPurchasesConverters.convertMapToWriteableMap(customerInfo));
                CustomerCenterViewManager.this.emitEvent(themedReactContext, view, CustomerCenterEventName.ON_RESTORE_COMPLETED, writableNativeMap);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onRestoreFailedWrapper(Map<String, ? extends Object> error) {
                AbstractC5504s.h(error, "error");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap(LogEvent.LEVEL_ERROR, RNPurchasesConverters.convertMapToWriteableMap(error));
                CustomerCenterViewManager.this.emitEvent(themedReactContext, view, CustomerCenterEventName.ON_RESTORE_FAILED, writableNativeMap);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onRestoreStartedWrapper() {
                CustomerCenterViewManager.this.emitEvent(themedReactContext, view, CustomerCenterEventName.ON_RESTORE_STARTED, Arguments.createMap());
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onShowingManageSubscriptionsWrapper() {
                CustomerCenterViewManager.this.emitEvent(themedReactContext, view, CustomerCenterEventName.ON_SHOWING_MANAGE_SUBSCRIPTIONS, Arguments.createMap());
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onManagementOptionSelectedWrapper(String action, String url) {
                AbstractC5504s.h(action, "action");
                CustomerCenterViewManager.this.emitManagementOptionSelectedEvent(themedReactContext, view, action, url);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L createViewInstance$lambda$0(CustomerCenterViewManager customerCenterViewManager, C3284b0 c3284b0, WrappedCustomerCenterView wrappedCustomerCenterView) {
        customerCenterViewManager.emitDismissEvent(c3284b0, wrappedCustomerCenterView);
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitCustomActionSelectedEvent(ReactContext context, WrappedCustomerCenterView view, String actionId, String purchaseIdentifier) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("actionId", actionId);
        if (purchaseIdentifier != null) {
            writableNativeMap.putString("purchaseIdentifier", purchaseIdentifier);
        } else {
            writableNativeMap.putNull("purchaseIdentifier");
        }
        emitEvent(context, view, CustomerCenterEventName.ON_CUSTOM_ACTION_SELECTED, writableNativeMap);
    }

    private final void emitDismissEvent(ReactContext context, WrappedCustomerCenterView view) {
        Log.d(REACT_CLASS, "CustomerCenter dismiss event triggered");
        emitEvent(context, view, CustomerCenterEventName.ON_DISMISS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitEvent(ReactContext context, WrappedCustomerCenterView view, CustomerCenterEventName event, WritableMap params) {
        ((RCTEventEmitter) context.getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), event.getEventName(), params);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitManagementOptionSelectedEvent(ReactContext context, WrappedCustomerCenterView view, String action, String url) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("option", action);
        if (url != null) {
            writableNativeMap.putString("url", url);
        } else {
            writableNativeMap.putNull("url");
        }
        emitEvent(context, view, CustomerCenterEventName.ON_MANAGEMENT_OPTION_SELECTED, writableNativeMap);
    }

    private final c.a putEvent(c.a aVar, CustomerCenterEventName customerCenterEventName) {
        return aVar.b(customerCenterEventName.getEventName(), U6.c.c("registrationName", customerCenterEventName.getEventName()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(U6.c.a(), CustomerCenterEventName.ON_DISMISS), CustomerCenterEventName.ON_CUSTOM_ACTION_SELECTED), CustomerCenterEventName.ON_RESTORE_STARTED), CustomerCenterEventName.ON_RESTORE_COMPLETED), CustomerCenterEventName.ON_RESTORE_FAILED), CustomerCenterEventName.ON_SHOWING_MANAGE_SUBSCRIPTIONS), CustomerCenterEventName.ON_FEEDBACK_SURVEY_COMPLETED), CustomerCenterEventName.ON_MANAGEMENT_OPTION_SELECTED), CustomerCenterEventName.ON_REFUND_REQUEST_STARTED), CustomerCenterEventName.ON_REFUND_REQUEST_COMPLETED), CustomerCenterEventName.ON_PROMOTIONAL_OFFER_SUCCEEDED).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public WrappedCustomerCenterView createViewInstance(final C3284b0 themedReactContext) {
        AbstractC5504s.h(themedReactContext, "themedReactContext");
        final WrappedCustomerCenterView wrappedCustomerCenterView = new WrappedCustomerCenterView(themedReactContext);
        wrappedCustomerCenterView.setId(View.generateViewId());
        wrappedCustomerCenterView.setDismissHandler(new InterfaceC5082a() { // from class: com.revenuecat.purchases.react.ui.d
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return CustomerCenterViewManager.createViewInstance$lambda$0(this.f44159a, themedReactContext, wrappedCustomerCenterView);
            }
        });
        wrappedCustomerCenterView.setCustomerCenterListener(createCustomerCenterListener(themedReactContext, wrappedCustomerCenterView));
        return wrappedCustomerCenterView;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(WrappedCustomerCenterView view) {
        AbstractC5504s.h(view, "view");
        super.onDropViewInstance(view);
        view.setCustomerCenterListener(null);
    }
}
