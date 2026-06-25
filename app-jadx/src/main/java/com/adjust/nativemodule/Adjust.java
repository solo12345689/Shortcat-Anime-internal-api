package com.adjust.nativemodule;

import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.AdjustAdRevenue;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustDeeplink;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.AdjustLinkResolution;
import com.adjust.sdk.AdjustPlayStorePurchase;
import com.adjust.sdk.AdjustPlayStoreSubscription;
import com.adjust.sdk.AdjustPurchaseVerificationResult;
import com.adjust.sdk.AdjustRemoteTrigger;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.AdjustStoreInfo;
import com.adjust.sdk.AdjustTestOptions;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.Constants;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAmazonAdIdReadListener;
import com.adjust.sdk.OnAttributionChangedListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnDeeplinkResolvedListener;
import com.adjust.sdk.OnDeferredDeeplinkResponseListener;
import com.adjust.sdk.OnEventTrackingFailedListener;
import com.adjust.sdk.OnEventTrackingSucceededListener;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.adjust.sdk.OnIsEnabledListener;
import com.adjust.sdk.OnLastDeeplinkReadListener;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import com.adjust.sdk.OnRemoteTriggerListener;
import com.adjust.sdk.OnSdkVersionReadListener;
import com.adjust.sdk.OnSessionTrackingFailedListener;
import com.adjust.sdk.OnSessionTrackingSucceededListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Adjust extends ReactContextBaseJavaModule implements OnAttributionChangedListener, OnEventTrackingSucceededListener, OnEventTrackingFailedListener, OnSessionTrackingSucceededListener, OnSessionTrackingFailedListener, OnDeferredDeeplinkResponseListener, OnRemoteTriggerListener {
    private static String TAG = "AdjustBridge";
    private boolean isAttributionCallbackImplemented;
    private boolean isDeferredDeeplinkCallbackImplemented;
    private boolean isDeferredDeeplinkOpeningEnabled;
    private boolean isEventTrackingFailedCallbackImplemented;
    private boolean isEventTrackingSucceededCallbackImplemented;
    private boolean isRemoteTriggerCallbackImplemented;
    private boolean isSessionTrackingFailedCallbackImplemented;
    private boolean isSessionTrackingSucceededCallbackImplemented;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements OnPurchaseVerificationFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33876a;

        a(Callback callback) {
            this.f33876a = callback;
        }

        @Override // com.adjust.sdk.OnPurchaseVerificationFinishedListener
        public void onVerificationFinished(AdjustPurchaseVerificationResult adjustPurchaseVerificationResult) {
            if (this.f33876a != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                if (adjustPurchaseVerificationResult == null) {
                    this.f33876a.invoke(writableMapCreateMap);
                    return;
                }
                writableMapCreateMap.putString("verificationStatus", adjustPurchaseVerificationResult.getVerificationStatus() != null ? adjustPurchaseVerificationResult.getVerificationStatus() : "");
                writableMapCreateMap.putString("code", String.valueOf(adjustPurchaseVerificationResult.getCode()));
                writableMapCreateMap.putString("message", adjustPurchaseVerificationResult.getMessage() != null ? adjustPurchaseVerificationResult.getMessage() : "");
                this.f33876a.invoke(writableMapCreateMap);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements OnPurchaseVerificationFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33878a;

        b(Callback callback) {
            this.f33878a = callback;
        }

        @Override // com.adjust.sdk.OnPurchaseVerificationFinishedListener
        public void onVerificationFinished(AdjustPurchaseVerificationResult adjustPurchaseVerificationResult) {
            if (this.f33878a != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                if (adjustPurchaseVerificationResult == null) {
                    this.f33878a.invoke(writableMapCreateMap);
                    return;
                }
                writableMapCreateMap.putString("verificationStatus", adjustPurchaseVerificationResult.getVerificationStatus() != null ? adjustPurchaseVerificationResult.getVerificationStatus() : "");
                writableMapCreateMap.putString("code", String.valueOf(adjustPurchaseVerificationResult.getCode()));
                writableMapCreateMap.putString("message", adjustPurchaseVerificationResult.getMessage() != null ? adjustPurchaseVerificationResult.getMessage() : "");
                this.f33878a.invoke(writableMapCreateMap);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements OnGoogleAdIdReadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33880a;

        c(Callback callback) {
            this.f33880a = callback;
        }

        @Override // com.adjust.sdk.OnGoogleAdIdReadListener
        public void onGoogleAdIdRead(String str) {
            Callback callback = this.f33880a;
            if (callback != null) {
                callback.invoke(str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements OnAmazonAdIdReadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33882a;

        d(Callback callback) {
            this.f33882a = callback;
        }

        @Override // com.adjust.sdk.OnAmazonAdIdReadListener
        public void onAmazonAdIdRead(String str) {
            Callback callback = this.f33882a;
            if (callback != null) {
                callback.invoke(str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements OnDeeplinkResolvedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33884a;

        e(Callback callback) {
            this.f33884a = callback;
        }

        @Override // com.adjust.sdk.OnDeeplinkResolvedListener
        public void onDeeplinkResolved(String str) {
            Callback callback = this.f33884a;
            if (callback != null) {
                callback.invoke(str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements AdjustLinkResolution.AdjustLinkResolutionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33886a;

        f(Callback callback) {
            this.f33886a = callback;
        }

        @Override // com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback
        public void resolvedLinkCallback(Uri uri) {
            if (this.f33886a != null) {
                this.f33886a.invoke(uri != null ? uri.toString() : null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g implements OnIsEnabledListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33888a;

        g(Callback callback) {
            this.f33888a = callback;
        }

        @Override // com.adjust.sdk.OnIsEnabledListener
        public void onIsEnabledRead(boolean z10) {
            Callback callback = this.f33888a;
            if (callback != null) {
                callback.invoke(Boolean.valueOf(z10));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h implements OnAttributionReadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33890a;

        h(Callback callback) {
            this.f33890a = callback;
        }

        @Override // com.adjust.sdk.OnAttributionReadListener
        public void onAttributionRead(AdjustAttribution adjustAttribution) {
            Callback callback = this.f33890a;
            if (callback != null) {
                callback.invoke(com.adjust.nativemodule.a.a(adjustAttribution));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i implements OnAttributionReadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33892a;

        i(Callback callback) {
            this.f33892a = callback;
        }

        @Override // com.adjust.sdk.OnAttributionReadListener
        public void onAttributionRead(AdjustAttribution adjustAttribution) {
            Callback callback = this.f33892a;
            if (callback != null) {
                if (adjustAttribution == null) {
                    callback.invoke(null);
                } else {
                    callback.invoke(com.adjust.nativemodule.a.a(adjustAttribution));
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j implements OnAdidReadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33894a;

        j(Callback callback) {
            this.f33894a = callback;
        }

        @Override // com.adjust.sdk.OnAdidReadListener
        public void onAdidRead(String str) {
            Callback callback = this.f33894a;
            if (callback != null) {
                if (str == null) {
                    str = null;
                }
                callback.invoke(str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class k implements OnAdidReadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33896a;

        k(Callback callback) {
            this.f33896a = callback;
        }

        @Override // com.adjust.sdk.OnAdidReadListener
        public void onAdidRead(String str) {
            Callback callback = this.f33896a;
            if (callback != null) {
                if (str == null) {
                    str = null;
                }
                callback.invoke(str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class l implements OnLastDeeplinkReadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33898a;

        l(Callback callback) {
            this.f33898a = callback;
        }

        @Override // com.adjust.sdk.OnLastDeeplinkReadListener
        public void onLastDeeplinkRead(Uri uri) {
            if (this.f33898a != null) {
                this.f33898a.invoke(uri != null ? uri.toString() : null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class m implements OnSdkVersionReadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f33900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33901b;

        m(Callback callback, String str) {
            this.f33900a = callback;
            this.f33901b = str;
        }

        @Override // com.adjust.sdk.OnSdkVersionReadListener
        public void onSdkVersionRead(String str) {
            Callback callback = this.f33900a;
            if (callback != null) {
                if (str == null) {
                    callback.invoke(null);
                    return;
                }
                callback.invoke(this.f33901b + "@" + str);
            }
        }
    }

    public Adjust(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.isDeferredDeeplinkOpeningEnabled = true;
    }

    private boolean checkKey(ReadableMap readableMap, String str) {
        return readableMap.hasKey(str) && !readableMap.isNull(str);
    }

    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addGlobalCallbackParameter(String str, String str2) {
        com.adjust.sdk.Adjust.addGlobalCallbackParameter(str, str2);
    }

    @ReactMethod
    public void addGlobalPartnerParameter(String str, String str2) {
        com.adjust.sdk.Adjust.addGlobalPartnerParameter(str, str2);
    }

    @ReactMethod
    public void disable() {
        com.adjust.sdk.Adjust.disable();
    }

    @ReactMethod
    public void disableCoppaComplianceInDelay() {
        com.adjust.sdk.Adjust.disableCoppaComplianceInDelay();
    }

    @ReactMethod
    public void disablePlayStoreKidsComplianceInDelay() {
        com.adjust.sdk.Adjust.disablePlayStoreKidsComplianceInDelay();
    }

    @ReactMethod
    public void enable() {
        com.adjust.sdk.Adjust.enable();
    }

    @ReactMethod
    public void enableCoppaComplianceInDelay() {
        com.adjust.sdk.Adjust.enableCoppaComplianceInDelay();
    }

    @ReactMethod
    public void enablePlayStoreKidsComplianceInDelay() {
        com.adjust.sdk.Adjust.enablePlayStoreKidsComplianceInDelay();
    }

    @ReactMethod
    public void endFirstSessionDelay() {
        com.adjust.sdk.Adjust.endFirstSessionDelay();
    }

    @ReactMethod
    public void gdprForgetMe() {
        com.adjust.sdk.Adjust.gdprForgetMe(getReactApplicationContext());
    }

    @ReactMethod
    public void getAdid(Callback callback) {
        com.adjust.sdk.Adjust.getAdid(new j(callback));
    }

    @ReactMethod
    public void getAdidWithTimeout(ReadableMap readableMap, Callback callback) {
        if (readableMap == null || !checkKey(readableMap, "timeoutInMilliseconds")) {
            if (callback != null) {
                callback.invoke(null);
            }
        } else {
            try {
                com.adjust.sdk.Adjust.getAdidWithTimeout(getReactApplicationContext(), (long) readableMap.getDouble("timeoutInMilliseconds"), new k(callback));
            } catch (Exception unused) {
                if (callback != null) {
                    callback.invoke(null);
                }
            }
        }
    }

    @ReactMethod
    public void getAmazonAdId(Callback callback) {
        com.adjust.sdk.Adjust.getAmazonAdId(getReactApplicationContext(), new d(callback));
    }

    @ReactMethod
    public void getAttribution(Callback callback) {
        com.adjust.sdk.Adjust.getAttribution(new h(callback));
    }

    @ReactMethod
    public void getAttributionWithTimeout(ReadableMap readableMap, Callback callback) {
        if (readableMap == null || !checkKey(readableMap, "timeoutInMilliseconds")) {
            if (callback != null) {
                callback.invoke(null);
            }
        } else {
            try {
                com.adjust.sdk.Adjust.getAttributionWithTimeout(getReactApplicationContext(), (long) readableMap.getDouble("timeoutInMilliseconds"), new i(callback));
            } catch (Exception unused) {
                if (callback != null) {
                    callback.invoke(null);
                }
            }
        }
    }

    @ReactMethod
    public void getGoogleAdId(Callback callback) {
        com.adjust.sdk.Adjust.getGoogleAdId(getReactApplicationContext(), new c(callback));
    }

    @ReactMethod
    public void getLastDeeplink(Callback callback) {
        com.adjust.sdk.Adjust.getLastDeeplink(getReactApplicationContext(), new l(callback));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return Constants.LOGTAG;
    }

    @ReactMethod
    public void getSdkVersion(String str, Callback callback) {
        com.adjust.sdk.Adjust.getSdkVersion(new m(callback, str));
    }

    @ReactMethod
    public void initSdk(ReadableMap readableMap) {
        List listI;
        if (readableMap == null) {
            return;
        }
        AdjustConfig adjustConfig = new AdjustConfig(getReactApplicationContext(), checkKey(readableMap, "appToken") ? readableMap.getString("appToken") : null, checkKey(readableMap, "environment") ? readableMap.getString("environment") : null, checkKey(readableMap, "logLevel") && readableMap.getString("logLevel").equals("SUPPRESS"));
        if (checkKey(readableMap, "logLevel")) {
            String string = readableMap.getString("logLevel");
            if (string.equals("VERBOSE")) {
                adjustConfig.setLogLevel(LogLevel.VERBOSE);
            } else if (string.equals("DEBUG")) {
                adjustConfig.setLogLevel(LogLevel.DEBUG);
            } else if (string.equals("INFO")) {
                adjustConfig.setLogLevel(LogLevel.INFO);
            } else if (string.equals("WARN")) {
                adjustConfig.setLogLevel(LogLevel.WARN);
            } else if (string.equals(HybridPurchaseLogicBridge.RESULT_ERROR)) {
                adjustConfig.setLogLevel(LogLevel.ERROR);
            } else if (string.equals("ASSERT")) {
                adjustConfig.setLogLevel(LogLevel.ASSERT);
            } else if (string.equals("SUPPRESS")) {
                adjustConfig.setLogLevel(LogLevel.SUPPRESS);
            } else {
                adjustConfig.setLogLevel(LogLevel.INFO);
            }
        }
        if (checkKey(readableMap, "sdkPrefix")) {
            adjustConfig.setSdkPrefix(readableMap.getString("sdkPrefix"));
        }
        if (checkKey(readableMap, "processName")) {
            adjustConfig.setProcessName(readableMap.getString("processName"));
        }
        if (checkKey(readableMap, "defaultTracker")) {
            adjustConfig.setDefaultTracker(readableMap.getString("defaultTracker"));
        }
        if (checkKey(readableMap, "externalDeviceId")) {
            adjustConfig.setExternalDeviceId(readableMap.getString("externalDeviceId"));
        }
        if (checkKey(readableMap, "urlStrategyDomains") && checkKey(readableMap, "useSubdomains") && checkKey(readableMap, "isDataResidency") && (listI = com.adjust.nativemodule.a.i(readableMap.getArray("urlStrategyDomains"))) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < listI.size(); i10++) {
                arrayList.add(listI.get(i10).toString());
            }
            adjustConfig.setUrlStrategy(arrayList, readableMap.getBoolean("useSubdomains"), readableMap.getBoolean("isDataResidency"));
        }
        if (checkKey(readableMap, "preinstallFilePath")) {
            adjustConfig.setPreinstallFilePath(readableMap.getString("preinstallFilePath"));
        }
        if (checkKey(readableMap, "fbAppId")) {
            adjustConfig.setFbAppId(readableMap.getString("fbAppId"));
        }
        if (checkKey(readableMap, "isSendingInBackgroundEnabled") && readableMap.getBoolean("isSendingInBackgroundEnabled")) {
            adjustConfig.enableSendingInBackground();
        }
        if (checkKey(readableMap, "isPreinstallTrackingEnabled") && readableMap.getBoolean("isPreinstallTrackingEnabled")) {
            adjustConfig.enablePreinstallTracking();
        }
        if (checkKey(readableMap, "isCostDataInAttributionEnabled") && readableMap.getBoolean("isCostDataInAttributionEnabled")) {
            adjustConfig.enableCostDataInAttribution();
        }
        if (checkKey(readableMap, "isPlayStoreKidsComplianceEnabled") && readableMap.getBoolean("isPlayStoreKidsComplianceEnabled")) {
            adjustConfig.enablePlayStoreKidsCompliance();
        }
        if (checkKey(readableMap, "isDeferredDeeplinkOpeningEnabled")) {
            this.isDeferredDeeplinkOpeningEnabled = readableMap.getBoolean("isDeferredDeeplinkOpeningEnabled");
        }
        if (checkKey(readableMap, "isCoppaComplianceEnabled") && readableMap.getBoolean("isCoppaComplianceEnabled")) {
            adjustConfig.enableCoppaCompliance();
        }
        if (checkKey(readableMap, "isDeviceIdsReadingOnceEnabled") && readableMap.getBoolean("isDeviceIdsReadingOnceEnabled")) {
            adjustConfig.enableDeviceIdsReadingOnce();
        }
        if (checkKey(readableMap, "isFirstSessionDelayEnabled") && readableMap.getBoolean("isFirstSessionDelayEnabled")) {
            adjustConfig.enableFirstSessionDelay();
        }
        if (checkKey(readableMap, "isAppSetIdReadingEnabled") && !readableMap.getBoolean("isAppSetIdReadingEnabled")) {
            adjustConfig.disableAppSetIdReading();
        }
        if (checkKey(readableMap, "storeInfo")) {
            try {
                JSONObject jSONObject = new JSONObject(readableMap.getMap("storeInfo").toString());
                String strOptString = jSONObject.optString("storeName", null);
                if (com.adjust.nativemodule.a.e(strOptString)) {
                    AdjustStoreInfo adjustStoreInfo = new AdjustStoreInfo(strOptString);
                    String strOptString2 = jSONObject.optString("storeAppId", null);
                    if (com.adjust.nativemodule.a.e(strOptString2)) {
                        adjustStoreInfo.setStoreAppId(strOptString2);
                    }
                    adjustConfig.setStoreInfo(adjustStoreInfo);
                }
            } catch (JSONException unused) {
            }
        }
        if (checkKey(readableMap, "eventDeduplicationIdsMaxSize")) {
            adjustConfig.setEventDeduplicationIdsMaxSize(Integer.valueOf(readableMap.getInt("eventDeduplicationIdsMaxSize")));
        }
        if (this.isAttributionCallbackImplemented) {
            adjustConfig.setOnAttributionChangedListener(this);
        }
        if (this.isEventTrackingSucceededCallbackImplemented) {
            adjustConfig.setOnEventTrackingSucceededListener(this);
        }
        if (this.isEventTrackingFailedCallbackImplemented) {
            adjustConfig.setOnEventTrackingFailedListener(this);
        }
        if (this.isSessionTrackingSucceededCallbackImplemented) {
            adjustConfig.setOnSessionTrackingSucceededListener(this);
        }
        if (this.isSessionTrackingFailedCallbackImplemented) {
            adjustConfig.setOnSessionTrackingFailedListener(this);
        }
        if (this.isDeferredDeeplinkCallbackImplemented) {
            adjustConfig.setOnDeferredDeeplinkResponseListener(this);
        }
        if (this.isRemoteTriggerCallbackImplemented) {
            adjustConfig.setOnRemoteTriggerListener(this);
        }
        com.adjust.sdk.Adjust.initSdk(adjustConfig);
    }

    @ReactMethod
    public void isEnabled(Callback callback) {
        com.adjust.sdk.Adjust.isEnabled(getReactApplicationContext(), new g(callback));
    }

    @Override // com.adjust.sdk.OnDeferredDeeplinkResponseListener
    public boolean launchReceivedDeeplink(Uri uri) {
        sendEvent(getReactApplicationContext(), "adjust_deferredDeeplinkReceived", com.adjust.nativemodule.a.b(uri));
        return this.isDeferredDeeplinkOpeningEnabled;
    }

    @Override // com.adjust.sdk.OnAttributionChangedListener
    public void onAttributionChanged(AdjustAttribution adjustAttribution) {
        sendEvent(getReactApplicationContext(), "adjust_attributionChanged", com.adjust.nativemodule.a.a(adjustAttribution));
    }

    @Override // com.adjust.sdk.OnEventTrackingFailedListener
    public void onEventTrackingFailed(AdjustEventFailure adjustEventFailure) {
        sendEvent(getReactApplicationContext(), "adjust_eventTrackingFailed", com.adjust.nativemodule.a.c(adjustEventFailure));
    }

    @Override // com.adjust.sdk.OnEventTrackingSucceededListener
    public void onEventTrackingSucceeded(AdjustEventSuccess adjustEventSuccess) {
        sendEvent(getReactApplicationContext(), "adjust_eventTrackingSucceeded", com.adjust.nativemodule.a.d(adjustEventSuccess));
    }

    @ReactMethod
    public void onPause() {
        com.adjust.sdk.Adjust.onPause();
    }

    @Override // com.adjust.sdk.OnRemoteTriggerListener
    public void onRemoteTrigger(AdjustRemoteTrigger adjustRemoteTrigger) {
        sendEvent(getReactApplicationContext(), "adjust_remoteTriggerReceived", com.adjust.nativemodule.a.f(adjustRemoteTrigger));
    }

    @ReactMethod
    public void onResume() {
        com.adjust.sdk.Adjust.onResume();
    }

    @Override // com.adjust.sdk.OnSessionTrackingFailedListener
    public void onSessionTrackingFailed(AdjustSessionFailure adjustSessionFailure) {
        sendEvent(getReactApplicationContext(), "adjust_sessionTrackingFailed", com.adjust.nativemodule.a.g(adjustSessionFailure));
    }

    @Override // com.adjust.sdk.OnSessionTrackingSucceededListener
    public void onSessionTrackingSucceeded(AdjustSessionSuccess adjustSessionSuccess) {
        sendEvent(getReactApplicationContext(), "adjust_sessionTrackingSucceeded", com.adjust.nativemodule.a.h(adjustSessionSuccess));
    }

    @ReactMethod
    public void processAndResolveDeeplink(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            if (callback != null) {
                callback.invoke(null);
            }
        } else if (!checkKey(readableMap, Constants.DEEPLINK)) {
            if (callback != null) {
                callback.invoke(null);
            }
        } else {
            AdjustDeeplink adjustDeeplink = new AdjustDeeplink(Uri.parse(readableMap.getString(Constants.DEEPLINK)));
            if (checkKey(readableMap, Constants.REFERRER)) {
                adjustDeeplink.setReferrer(Uri.parse(readableMap.getString(Constants.REFERRER)));
            }
            com.adjust.sdk.Adjust.processAndResolveDeeplink(adjustDeeplink, getReactApplicationContext(), new e(callback));
        }
    }

    @ReactMethod
    public void processDeeplink(ReadableMap readableMap) {
        if (readableMap != null && checkKey(readableMap, Constants.DEEPLINK)) {
            AdjustDeeplink adjustDeeplink = new AdjustDeeplink(Uri.parse(readableMap.getString(Constants.DEEPLINK)));
            if (checkKey(readableMap, Constants.REFERRER)) {
                adjustDeeplink.setReferrer(Uri.parse(readableMap.getString(Constants.REFERRER)));
            }
            com.adjust.sdk.Adjust.processDeeplink(adjustDeeplink, getReactApplicationContext());
        }
    }

    @ReactMethod
    public void removeGlobalCallbackParameter(String str) {
        com.adjust.sdk.Adjust.removeGlobalCallbackParameter(str);
    }

    @ReactMethod
    public void removeGlobalCallbackParameters() {
        com.adjust.sdk.Adjust.removeGlobalCallbackParameters();
    }

    @ReactMethod
    public void removeGlobalPartnerParameter(String str) {
        com.adjust.sdk.Adjust.removeGlobalPartnerParameter(str);
    }

    @ReactMethod
    public void removeGlobalPartnerParameters() {
        com.adjust.sdk.Adjust.removeGlobalPartnerParameters();
    }

    @ReactMethod
    public void resolveLinkWithUrl(String str, ReadableArray readableArray, Callback callback) {
        String[] strArr = null;
        if (str == null) {
            if (callback != null) {
                callback.invoke(null);
                return;
            }
            return;
        }
        if (readableArray != null && readableArray.size() > 0) {
            int size = readableArray.size();
            String[] strArr2 = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                strArr2[i10] = readableArray.getString(i10);
            }
            strArr = strArr2;
        }
        AdjustLinkResolution.resolveLink(str, strArr, new f(callback));
    }

    @ReactMethod
    public void setAttributionCallbackImplemented() {
        this.isAttributionCallbackImplemented = true;
    }

    @ReactMethod
    public void setDeferredDeeplinkCallbackImplemented() {
        this.isDeferredDeeplinkCallbackImplemented = true;
    }

    @ReactMethod
    public void setEventTrackingFailedCallbackImplemented() {
        this.isEventTrackingFailedCallbackImplemented = true;
    }

    @ReactMethod
    public void setEventTrackingSucceededCallbackImplemented() {
        this.isEventTrackingSucceededCallbackImplemented = true;
    }

    @ReactMethod
    public void setExternalDeviceIdInDelay(String str) {
        com.adjust.sdk.Adjust.setExternalDeviceIdInDelay(str);
    }

    @ReactMethod
    public void setPushToken(String str) {
        com.adjust.sdk.Adjust.setPushToken(str, getReactApplicationContext());
    }

    @ReactMethod
    public void setRemoteTriggerCallbackImplemented() {
        this.isRemoteTriggerCallbackImplemented = true;
    }

    @ReactMethod
    public void setSessionTrackingFailedCallbackImplemented() {
        this.isSessionTrackingFailedCallbackImplemented = true;
    }

    @ReactMethod
    public void setSessionTrackingSucceededCallbackImplemented() {
        this.isSessionTrackingSucceededCallbackImplemented = true;
    }

    @ReactMethod
    public void setTestOptions(ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        AdjustTestOptions adjustTestOptions = new AdjustTestOptions();
        if (checkKey(readableMap, "baseUrl")) {
            adjustTestOptions.baseUrl = readableMap.getString("baseUrl");
        }
        if (checkKey(readableMap, "gdprUrl")) {
            adjustTestOptions.gdprUrl = readableMap.getString("gdprUrl");
        }
        if (checkKey(readableMap, "subscriptionUrl")) {
            adjustTestOptions.subscriptionUrl = readableMap.getString("subscriptionUrl");
        }
        if (checkKey(readableMap, "purchaseVerificationUrl")) {
            adjustTestOptions.purchaseVerificationUrl = readableMap.getString("purchaseVerificationUrl");
        }
        if (checkKey(readableMap, "basePath")) {
            adjustTestOptions.basePath = readableMap.getString("basePath");
        }
        if (checkKey(readableMap, "gdprPath")) {
            adjustTestOptions.gdprPath = readableMap.getString("gdprPath");
        }
        if (checkKey(readableMap, "subscriptionPath")) {
            adjustTestOptions.subscriptionPath = readableMap.getString("subscriptionPath");
        }
        if (checkKey(readableMap, "purchaseVerificationPath")) {
            adjustTestOptions.purchaseVerificationPath = readableMap.getString("purchaseVerificationPath");
        }
        if (checkKey(readableMap, "timerIntervalInMilliseconds")) {
            try {
                adjustTestOptions.timerIntervalInMilliseconds = Long.valueOf(Long.parseLong(readableMap.getString("timerIntervalInMilliseconds")));
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
                Log.d(TAG, "Can't format number");
            }
        }
        if (checkKey(readableMap, "timerStartInMilliseconds")) {
            try {
                adjustTestOptions.timerStartInMilliseconds = Long.valueOf(Long.parseLong(readableMap.getString("timerStartInMilliseconds")));
            } catch (NumberFormatException e11) {
                e11.printStackTrace();
                Log.d(TAG, "Can't format number");
            }
        }
        if (checkKey(readableMap, "sessionIntervalInMilliseconds")) {
            try {
                adjustTestOptions.sessionIntervalInMilliseconds = Long.valueOf(Long.parseLong(readableMap.getString("sessionIntervalInMilliseconds")));
            } catch (NumberFormatException e12) {
                e12.printStackTrace();
                Log.d(TAG, "Can't format number");
            }
        }
        if (checkKey(readableMap, "subsessionIntervalInMilliseconds")) {
            try {
                adjustTestOptions.subsessionIntervalInMilliseconds = Long.valueOf(Long.parseLong(readableMap.getString("subsessionIntervalInMilliseconds")));
            } catch (NumberFormatException e13) {
                e13.printStackTrace();
                Log.d(TAG, "Can't format number");
            }
        }
        if (checkKey(readableMap, "noBackoffWait")) {
            adjustTestOptions.noBackoffWait = Boolean.valueOf(readableMap.getBoolean("noBackoffWait"));
        }
        if (checkKey(readableMap, "teardown")) {
            adjustTestOptions.teardown = Boolean.valueOf(readableMap.getBoolean("teardown"));
        }
        if (checkKey(readableMap, "deleteState") && readableMap.getBoolean("deleteState")) {
            adjustTestOptions.context = getReactApplicationContext();
        }
        if (checkKey(readableMap, "ignoreSystemLifecycleBootstrap")) {
            adjustTestOptions.ignoreSystemLifecycleBootstrap = Boolean.valueOf(readableMap.getBoolean("ignoreSystemLifecycleBootstrap"));
        }
        com.adjust.sdk.Adjust.setTestOptions(adjustTestOptions);
    }

    @ReactMethod
    public void switchBackToOnlineMode() {
        com.adjust.sdk.Adjust.switchBackToOnlineMode();
    }

    @ReactMethod
    public void switchToOfflineMode() {
        com.adjust.sdk.Adjust.switchToOfflineMode();
    }

    @ReactMethod
    public void teardown() {
        this.isAttributionCallbackImplemented = false;
        this.isEventTrackingSucceededCallbackImplemented = false;
        this.isEventTrackingFailedCallbackImplemented = false;
        this.isSessionTrackingSucceededCallbackImplemented = false;
        this.isSessionTrackingFailedCallbackImplemented = false;
        this.isDeferredDeeplinkCallbackImplemented = false;
        this.isRemoteTriggerCallbackImplemented = false;
    }

    @ReactMethod
    public void trackAdRevenue(ReadableMap readableMap) {
        List listI;
        List listI2;
        String string;
        String string2;
        String string3;
        if (readableMap == null) {
            return;
        }
        AdjustAdRevenue adjustAdRevenue = new AdjustAdRevenue(checkKey(readableMap, "source") ? readableMap.getString("source") : null);
        if (checkKey(readableMap, "revenue") || checkKey(readableMap, com.amazon.a.a.o.b.f34634a)) {
            adjustAdRevenue.setRevenue(Double.valueOf(readableMap.getDouble("revenue")), readableMap.getString(com.amazon.a.a.o.b.f34634a));
        }
        if (checkKey(readableMap, "adImpressionsCount")) {
            adjustAdRevenue.setAdImpressionsCount(Integer.valueOf(readableMap.getInt("adImpressionsCount")));
        }
        if (checkKey(readableMap, "adRevenueNetwork") && (string3 = readableMap.getString("adRevenueNetwork")) != null) {
            adjustAdRevenue.setAdRevenueNetwork(string3);
        }
        if (checkKey(readableMap, "adRevenueUnit") && (string2 = readableMap.getString("adRevenueUnit")) != null) {
            adjustAdRevenue.setAdRevenueUnit(string2);
        }
        if (checkKey(readableMap, "adRevenuePlacement") && (string = readableMap.getString("adRevenuePlacement")) != null) {
            adjustAdRevenue.setAdRevenuePlacement(string);
        }
        if (checkKey(readableMap, "callbackParameters") && (listI2 = com.adjust.nativemodule.a.i(readableMap.getArray("callbackParameters"))) != null) {
            for (int i10 = 0; i10 < listI2.size(); i10 += 2) {
                adjustAdRevenue.addCallbackParameter(listI2.get(i10).toString(), listI2.get(i10 + 1).toString());
            }
        }
        if (checkKey(readableMap, "partnerParameters") && (listI = com.adjust.nativemodule.a.i(readableMap.getArray("partnerParameters"))) != null) {
            for (int i11 = 0; i11 < listI.size(); i11 += 2) {
                adjustAdRevenue.addPartnerParameter(listI.get(i11).toString(), listI.get(i11 + 1).toString());
            }
        }
        com.adjust.sdk.Adjust.trackAdRevenue(adjustAdRevenue);
    }

    @ReactMethod
    public void trackEvent(ReadableMap readableMap) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        List listI;
        List listI2;
        if (readableMap == null) {
            return;
        }
        AdjustEvent adjustEvent = new AdjustEvent(checkKey(readableMap, "eventToken") ? readableMap.getString("eventToken") : null);
        if (checkKey(readableMap, "revenue") || checkKey(readableMap, com.amazon.a.a.o.b.f34634a)) {
            adjustEvent.setRevenue(readableMap.getDouble("revenue"), readableMap.getString(com.amazon.a.a.o.b.f34634a));
        }
        if (checkKey(readableMap, "callbackParameters") && (listI2 = com.adjust.nativemodule.a.i(readableMap.getArray("callbackParameters"))) != null) {
            for (int i10 = 0; i10 < listI2.size(); i10 += 2) {
                adjustEvent.addCallbackParameter(listI2.get(i10).toString(), listI2.get(i10 + 1).toString());
            }
        }
        if (checkKey(readableMap, "partnerParameters") && (listI = com.adjust.nativemodule.a.i(readableMap.getArray("partnerParameters"))) != null) {
            for (int i11 = 0; i11 < listI.size(); i11 += 2) {
                adjustEvent.addPartnerParameter(listI.get(i11).toString(), listI.get(i11 + 1).toString());
            }
        }
        if (checkKey(readableMap, "transactionId") && (string5 = readableMap.getString("transactionId")) != null) {
            adjustEvent.setOrderId(string5);
        }
        if (checkKey(readableMap, "callbackId") && (string4 = readableMap.getString("callbackId")) != null) {
            adjustEvent.setCallbackId(string4);
        }
        if (checkKey(readableMap, "productId") && (string3 = readableMap.getString("productId")) != null) {
            adjustEvent.setProductId(string3);
        }
        if (checkKey(readableMap, "purchaseToken") && (string2 = readableMap.getString("purchaseToken")) != null) {
            adjustEvent.setPurchaseToken(string2);
        }
        if (checkKey(readableMap, "deduplicationId") && (string = readableMap.getString("deduplicationId")) != null) {
            adjustEvent.setDeduplicationId(string);
        }
        com.adjust.sdk.Adjust.trackEvent(adjustEvent);
    }

    @ReactMethod
    public void trackMeasurementConsent(boolean z10) {
        com.adjust.sdk.Adjust.trackMeasurementConsent(z10);
    }

    @ReactMethod
    public void trackPlayStoreSubscription(ReadableMap readableMap) {
        List listI;
        List listI2;
        if (readableMap == null) {
            return;
        }
        AdjustPlayStoreSubscription adjustPlayStoreSubscription = new AdjustPlayStoreSubscription(checkKey(readableMap, com.amazon.a.a.o.b.f34666x) ? readableMap.getInt(com.amazon.a.a.o.b.f34666x) : -1, checkKey(readableMap, com.amazon.a.a.o.b.f34634a) ? readableMap.getString(com.amazon.a.a.o.b.f34634a) : null, checkKey(readableMap, "sku") ? readableMap.getString("sku") : null, checkKey(readableMap, "orderId") ? readableMap.getString("orderId") : null, checkKey(readableMap, "signature") ? readableMap.getString("signature") : null, checkKey(readableMap, "purchaseToken") ? readableMap.getString("purchaseToken") : null);
        if (checkKey(readableMap, "purchaseTime")) {
            adjustPlayStoreSubscription.setPurchaseTime(readableMap.getInt("purchaseTime"));
        }
        if (checkKey(readableMap, "callbackParameters") && (listI2 = com.adjust.nativemodule.a.i(readableMap.getArray("callbackParameters"))) != null) {
            for (int i10 = 0; i10 < listI2.size(); i10 += 2) {
                adjustPlayStoreSubscription.addCallbackParameter(listI2.get(i10).toString(), listI2.get(i10 + 1).toString());
            }
        }
        if (checkKey(readableMap, "partnerParameters") && (listI = com.adjust.nativemodule.a.i(readableMap.getArray("partnerParameters"))) != null) {
            for (int i11 = 0; i11 < listI.size(); i11 += 2) {
                adjustPlayStoreSubscription.addPartnerParameter(listI.get(i11).toString(), listI.get(i11 + 1).toString());
            }
        }
        com.adjust.sdk.Adjust.trackPlayStoreSubscription(adjustPlayStoreSubscription);
    }

    @ReactMethod
    public void trackThirdPartySharing(ReadableMap readableMap) {
        List listI;
        List listI2;
        if (readableMap == null) {
            return;
        }
        AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing(checkKey(readableMap, "isEnabled") ? Boolean.valueOf(readableMap.getBoolean("isEnabled")) : null);
        if (checkKey(readableMap, "granularOptions") && (listI2 = com.adjust.nativemodule.a.i(readableMap.getArray("granularOptions"))) != null) {
            for (int i10 = 0; i10 < listI2.size(); i10 += 3) {
                adjustThirdPartySharing.addGranularOption(listI2.get(i10).toString(), listI2.get(i10 + 1).toString(), listI2.get(i10 + 2).toString());
            }
        }
        if (checkKey(readableMap, "partnerSharingSettings") && (listI = com.adjust.nativemodule.a.i(readableMap.getArray("partnerSharingSettings"))) != null) {
            for (int i11 = 0; i11 < listI.size(); i11 += 3) {
                adjustThirdPartySharing.addPartnerSharingSetting(listI.get(i11).toString(), listI.get(i11 + 1).toString(), Boolean.parseBoolean(listI.get(i11 + 2).toString()));
            }
        }
        com.adjust.sdk.Adjust.trackThirdPartySharing(adjustThirdPartySharing);
    }

    @ReactMethod
    public void verifyAndTrackPlayStorePurchase(ReadableMap readableMap, Callback callback) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        List listI;
        List listI2;
        if (readableMap == null) {
            if (callback != null) {
                callback.invoke(Arguments.createMap());
                return;
            }
            return;
        }
        AdjustEvent adjustEvent = new AdjustEvent(checkKey(readableMap, "eventToken") ? readableMap.getString("eventToken") : null);
        if (checkKey(readableMap, "revenue") || checkKey(readableMap, com.amazon.a.a.o.b.f34634a)) {
            adjustEvent.setRevenue(readableMap.getDouble("revenue"), readableMap.getString(com.amazon.a.a.o.b.f34634a));
        }
        if (checkKey(readableMap, "callbackParameters") && (listI2 = com.adjust.nativemodule.a.i(readableMap.getArray("callbackParameters"))) != null) {
            for (int i10 = 0; i10 < listI2.size(); i10 += 2) {
                adjustEvent.addCallbackParameter(listI2.get(i10).toString(), listI2.get(i10 + 1).toString());
            }
        }
        if (checkKey(readableMap, "partnerParameters") && (listI = com.adjust.nativemodule.a.i(readableMap.getArray("partnerParameters"))) != null) {
            for (int i11 = 0; i11 < listI.size(); i11 += 2) {
                adjustEvent.addPartnerParameter(listI.get(i11).toString(), listI.get(i11 + 1).toString());
            }
        }
        if (checkKey(readableMap, "transactionId") && (string5 = readableMap.getString("transactionId")) != null) {
            adjustEvent.setOrderId(string5);
        }
        if (checkKey(readableMap, "callbackId") && (string4 = readableMap.getString("callbackId")) != null) {
            adjustEvent.setCallbackId(string4);
        }
        if (checkKey(readableMap, "productId") && (string3 = readableMap.getString("productId")) != null) {
            adjustEvent.setProductId(string3);
        }
        if (checkKey(readableMap, "purchaseToken") && (string2 = readableMap.getString("purchaseToken")) != null) {
            adjustEvent.setPurchaseToken(string2);
        }
        if (checkKey(readableMap, "deduplicationId") && (string = readableMap.getString("deduplicationId")) != null) {
            adjustEvent.setDeduplicationId(string);
        }
        com.adjust.sdk.Adjust.verifyAndTrackPlayStorePurchase(adjustEvent, new b(callback));
    }

    @ReactMethod
    public void verifyPlayStorePurchase(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            com.adjust.sdk.Adjust.verifyPlayStorePurchase(new AdjustPlayStorePurchase(checkKey(readableMap, "productId") ? readableMap.getString("productId") : null, checkKey(readableMap, "purchaseToken") ? readableMap.getString("purchaseToken") : null), new a(callback));
        } else if (callback != null) {
            callback.invoke(Arguments.createMap());
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(double d10) {
    }
}
