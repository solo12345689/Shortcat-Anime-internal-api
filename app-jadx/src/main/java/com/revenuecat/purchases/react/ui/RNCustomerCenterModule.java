package com.revenuecat.purchases.react.ui;

import Td.L;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.ShowCustomerCenter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/app/Activity;", "activity", "LTd/L;", "presentCustomerCenterFromActivity", "(Landroid/app/Activity;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "createCustomerCenterListener", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "sendEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "presentCustomerCenter", "(Lcom/facebook/react/bridge/Promise;)V", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(Ljava/lang/Integer;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "customerCenterPromise", "Lcom/facebook/react/bridge/Promise;", "Lcom/facebook/react/bridge/ActivityEventListener;", "activityEventListener", "Lcom/facebook/react/bridge/ActivityEventListener;", "Companion", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNCustomerCenterModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNCustomerCenter";
    private static final int REQUEST_CODE_CUSTOMER_CENTER = 1001;
    private final ActivityEventListener activityEventListener;
    private Promise customerCenterPromise;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNCustomerCenterModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.reactContext = reactContext;
        BaseActivityEventListener baseActivityEventListener = new BaseActivityEventListener() { // from class: com.revenuecat.purchases.react.ui.RNCustomerCenterModule$activityEventListener$1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent intent) {
                AbstractC5504s.h(activity, "activity");
                if (requestCode == 1001) {
                    if (resultCode == -1) {
                        Promise promise = this.this$0.customerCenterPromise;
                        if (promise != null) {
                            promise.resolve(null);
                        }
                    } else {
                        Promise promise2 = this.this$0.customerCenterPromise;
                        if (promise2 != null) {
                            promise2.reject("CUSTOMER_CENTER_ERROR", "Customer Center closed with result code: " + resultCode, (Throwable) null);
                        }
                    }
                    this.this$0.customerCenterPromise = null;
                }
            }
        };
        this.activityEventListener = baseActivityEventListener;
        reactContext.addActivityEventListener(baseActivityEventListener);
    }

    private final CustomerCenterListener createCustomerCenterListener() {
        return new CustomerCenterListenerWrapper() { // from class: com.revenuecat.purchases.react.ui.RNCustomerCenterModule.createCustomerCenterListener.1
            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onCustomActionSelectedWrapper(String actionId, String purchaseIdentifier) {
                AbstractC5504s.h(actionId, "actionId");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("actionId", actionId);
                writableNativeMap.putString("purchaseIdentifier", purchaseIdentifier);
                RNCustomerCenterModule.this.sendEvent("onCustomActionSelected", writableNativeMap);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onFeedbackSurveyCompletedWrapper(String feedbackSurveyOptionId) {
                AbstractC5504s.h(feedbackSurveyOptionId, "feedbackSurveyOptionId");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("feedbackSurveyOptionId", feedbackSurveyOptionId);
                RNCustomerCenterModule.this.sendEvent("onFeedbackSurveyCompleted", writableNativeMap);
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
                RNCustomerCenterModule.this.sendEvent("onPromotionalOfferSucceeded", writableNativeMap);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onRestoreCompletedWrapper(Map<String, ? extends Object> customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap("customerInfo", RNPurchasesConverters.convertMapToWriteableMap(customerInfo));
                RNCustomerCenterModule.this.sendEvent("onRestoreCompleted", writableNativeMap);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onRestoreFailedWrapper(Map<String, ? extends Object> error) {
                AbstractC5504s.h(error, "error");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap(LogEvent.LEVEL_ERROR, RNPurchasesConverters.convertMapToWriteableMap(error));
                RNCustomerCenterModule.this.sendEvent("onRestoreFailed", writableNativeMap);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onRestoreStartedWrapper() {
                RNCustomerCenterModule.this.sendEvent("onRestoreStarted", null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onShowingManageSubscriptionsWrapper() {
                RNCustomerCenterModule.this.sendEvent("onShowingManageSubscriptions", null);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper
            public void onManagementOptionSelectedWrapper(String action, String url) {
                AbstractC5504s.h(action, "action");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("option", action);
                writableNativeMap.putString("url", url);
                RNCustomerCenterModule.this.sendEvent("onManagementOptionSelected", writableNativeMap);
            }
        };
    }

    private final void presentCustomerCenterFromActivity(Activity activity) {
        Purchases.INSTANCE.getSharedInstance().setCustomerCenterListener(createCustomerCenterListener());
        activity.startActivityForResult(new ShowCustomerCenter().createIntent((Context) activity, L.f17438a), 1001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(final String eventName, final WritableMap params) {
        this.reactContext.runOnUiQueueThread(new Runnable() { // from class: com.revenuecat.purchases.react.ui.h
            @Override // java.lang.Runnable
            public final void run() {
                RNCustomerCenterModule.sendEvent$lambda$2(this.f44164a, eventName, params);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendEvent$lambda$2(RNCustomerCenterModule rNCustomerCenterModule, String str, WritableMap writableMap) {
        try {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) rNCustomerCenterModule.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        } catch (Exception e10) {
            Log.e(NAME, "Error sending event " + str, e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void presentCustomerCenter(Promise promise) {
        AbstractC5504s.h(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("CUSTOMER_CENTER_MISSING_ACTIVITY", "Could not present Customer Center. There's no activity", (Throwable) null);
        } else {
            this.customerCenterPromise = promise;
            presentCustomerCenterFromActivity(currentActivity);
        }
    }

    @ReactMethod
    public final void addListener(String eventName) {
    }

    @ReactMethod
    public final void removeListeners(Integer count) {
    }
}
