package com.revenuecat.purchases.react.ui;

import Td.InterfaceC2154e;
import android.app.Activity;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC2842v;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.hybridcommon.ui.PaywallHelpersKt;
import com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper;
import com.revenuecat.purchases.hybridcommon.ui.PaywallResultListener;
import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;
import com.revenuecat.purchases.hybridcommon.ui.PresentPaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JS\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0017JO\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/react/ui/RNPaywallsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "requiredEntitlementIdentifier", "offeringIdentifier", "Lcom/facebook/react/bridge/ReadableMap;", "presentedOfferingContext", "", "displayCloseButton", "fontFamilyName", "customVariables", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTd/L;", "presentPaywall", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "getName", "()Ljava/lang/String;", "fontFamily", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "presentPaywallIfNeeded", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;ZLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "requestId", "shouldProceed", "resumePurchasePackageInitiated", "(Ljava/lang/String;Z)V", "result", com.amazon.a.a.o.b.f34648f, "resolvePurchaseLogicResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(Ljava/lang/Integer;)V", "Landroidx/fragment/app/v;", "getCurrentFragmentActivity", "()Landroidx/fragment/app/v;", "currentFragmentActivity", "Companion", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNPaywallsModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNPaywalls";

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNPaywallsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
    }

    private final AbstractActivityC2842v getCurrentFragmentActivity() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity instanceof AbstractActivityC2842v) {
            return (AbstractActivityC2842v) currentActivity;
        }
        Log.e(NAME, "RevenueCat paywalls require applications to use a FragmentActivity");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentPaywall$lambda$5(AbstractActivityC2842v abstractActivityC2842v, PaywallSource paywallSource, String str, Boolean bool, PaywallFontFamily paywallFontFamily, Map map, final Promise promise) {
        PaywallHelpersKt.presentPaywallFromFragment(abstractActivityC2842v, new PresentPaywallOptions(new PaywallResultListener() { // from class: com.revenuecat.purchases.react.ui.RNPaywallsModule$presentPaywall$1$1
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallResultListener
            @InterfaceC2154e
            public void onPaywallResult(PaywallResult paywallResult) {
                PaywallResultListener.DefaultImpls.onPaywallResult(this, paywallResult);
            }

            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallResultListener
            public void onPaywallResult(String paywallResult) {
                AbstractC5504s.h(paywallResult, "paywallResult");
                promise.resolve(paywallResult);
            }
        }, paywallSource, str, bool, paywallFontFamily, map, null, null, JfifUtil.MARKER_SOFn, null));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void presentPaywall(String offeringIdentifier, ReadableMap presentedOfferingContext, Boolean displayCloseButton, String fontFamily, ReadableMap customVariables, Promise promise) {
        AbstractC5504s.h(promise, "promise");
        presentPaywall(null, offeringIdentifier, presentedOfferingContext, displayCloseButton, fontFamily, customVariables, promise);
    }

    @ReactMethod
    public final void presentPaywallIfNeeded(String requiredEntitlementIdentifier, String offeringIdentifier, ReadableMap presentedOfferingContext, boolean displayCloseButton, String fontFamily, ReadableMap customVariables, Promise promise) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        AbstractC5504s.h(promise, "promise");
        presentPaywall(requiredEntitlementIdentifier, offeringIdentifier, presentedOfferingContext, Boolean.valueOf(displayCloseButton), fontFamily, customVariables, promise);
    }

    @ReactMethod
    public final void resolvePurchaseLogicResult(String requestId, String result, String errorMessage) {
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(result, "result");
        HybridPurchaseLogicBridge.INSTANCE.resolveResult(requestId, result, errorMessage);
    }

    @ReactMethod
    public final void resumePurchasePackageInitiated(String requestId, boolean shouldProceed) {
        AbstractC5504s.h(requestId, "requestId");
        PaywallListenerWrapper.INSTANCE.resumePurchasePackageInitiated(requestId, shouldProceed);
    }

    private final void presentPaywall(final String requiredEntitlementIdentifier, String offeringIdentifier, ReadableMap presentedOfferingContext, final Boolean displayCloseButton, String fontFamilyName, ReadableMap customVariables, final Promise promise) {
        final PaywallFontFamily paywallFontFamily;
        PaywallSource offeringIdentifierWithPresentedOfferingContext;
        final AbstractActivityC2842v currentFragmentActivity = getCurrentFragmentActivity();
        if (currentFragmentActivity == null) {
            return;
        }
        LinkedHashMap linkedHashMap = null;
        if (fontFamilyName != null) {
            FontAssetManager fontAssetManager = FontAssetManager.INSTANCE;
            AssetManager assets = currentFragmentActivity.getResources().getAssets();
            AbstractC5504s.g(assets, "getAssets(...)");
            paywallFontFamily = fontAssetManager.getPaywallFontFamily(fontFamilyName, assets);
        } else {
            paywallFontFamily = null;
        }
        if (offeringIdentifier != null) {
            offeringIdentifierWithPresentedOfferingContext = new PaywallSource.OfferingIdentifierWithPresentedOfferingContext(offeringIdentifier, RNPurchasesConverters.INSTANCE.presentedOfferingContext(offeringIdentifier, presentedOfferingContext != null ? presentedOfferingContext.toHashMap() : null));
        } else {
            offeringIdentifierWithPresentedOfferingContext = PaywallSource.DefaultOffering.INSTANCE;
        }
        final PaywallSource paywallSource = offeringIdentifierWithPresentedOfferingContext;
        if (customVariables != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = customVariables.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                int i10 = WhenMappings.$EnumSwitchMapping$0[customVariables.getType(strNextKey).ordinal()];
                if (i10 == 1) {
                    String string = customVariables.getString(strNextKey);
                    if (string != null) {
                        linkedHashMap2.put(strNextKey, string);
                    }
                } else if (i10 == 2) {
                    linkedHashMap2.put(strNextKey, Double.valueOf(customVariables.getDouble(strNextKey)));
                } else if (i10 == 3) {
                    linkedHashMap2.put(strNextKey, Boolean.valueOf(customVariables.getBoolean(strNextKey)));
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                linkedHashMap = linkedHashMap2;
            }
        }
        final LinkedHashMap linkedHashMap3 = linkedHashMap;
        currentFragmentActivity.runOnUiThread(new Runnable() { // from class: com.revenuecat.purchases.react.ui.i
            @Override // java.lang.Runnable
            public final void run() {
                RNPaywallsModule.presentPaywall$lambda$5(currentFragmentActivity, paywallSource, requiredEntitlementIdentifier, displayCloseButton, paywallFontFamily, linkedHashMap3, promise);
            }
        });
    }

    @ReactMethod
    public final void addListener(String eventName) {
    }

    @ReactMethod
    public final void removeListeners(Integer count) {
    }
}
