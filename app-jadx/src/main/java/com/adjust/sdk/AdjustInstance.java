package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustInstance {
    private IActivityHandler activityHandler;
    private String basePath;
    private OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    private String gdprPath;
    private String purchaseVerificationPath;
    private String pushToken;
    private String subscriptionPath;
    private Boolean startEnabled = null;
    private boolean startOffline = false;
    private PreLaunchActions preLaunchActions = new PreLaunchActions();
    private final ArrayList<OnAdidReadListener> cachedAdidReadCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedAdidReadTimeoutCallbacks = new ArrayList<>();
    private final ArrayList<OnAttributionReadListener> cachedAttributionReadCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedAttributionReadTimeoutCallbacks = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class PreLaunchActions {
        public List<IRunActivityHandler> preLaunchActionsArray = new ArrayList();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a extends AsyncTaskExecutor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnSdkVersionReadListener f33989a;

        public a(OnSdkVersionReadListener onSdkVersionReadListener) {
            this.f33989a = onSdkVersionReadListener;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final Object doInBackground(Object[] objArr) {
            return Util.getSdkVersion();
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(Object obj) {
            this.f33989a.onSdkVersionRead((String) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class b implements InstallReferrerReadListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnGooglePlayInstallReferrerReadListener f33990a;

        public b(OnGooglePlayInstallReferrerReadListener onGooglePlayInstallReferrerReadListener) {
            this.f33990a = onGooglePlayInstallReferrerReadListener;
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onFail(String str) {
            this.f33990a.onFail(str);
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
            this.f33990a.onInstallReferrerRead(new GooglePlayInstallReferrerDetails(referrerDetails));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class c extends AsyncTaskExecutor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f33991a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OnLastDeeplinkReadListener f33992b;

        public c(Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
            this.f33991a = context;
            this.f33992b = onLastDeeplinkReadListener;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final Object doInBackground(Object[] objArr) {
            try {
                return Uri.parse(AdjustInstance.this.getCachedDeeplink(this.f33991a));
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(Object obj) {
            this.f33992b.onLastDeeplinkRead((Uri) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class d extends AsyncTaskExecutor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnIsEnabledListener f33994a;

        public d(OnIsEnabledListener onIsEnabledListener) {
            this.f33994a = onIsEnabledListener;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final Object doInBackground(Object[] objArr) {
            return Boolean.valueOf(Util.isEnabledFromActivityStateFile(((Context[]) objArr)[0]));
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(Object obj) {
            this.f33994a.onIsEnabledRead(((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class e implements IRunActivityHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f33995a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33996b;

        public e(String str, String str2) {
            this.f33995a = str;
            this.f33996b = str2;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.addGlobalCallbackParameterI(this.f33995a, this.f33996b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class f implements IRunActivityHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f33997a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33998b;

        public f(String str, String str2) {
            this.f33997a = str;
            this.f33998b = str2;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.addGlobalPartnerParameterI(this.f33997a, this.f33998b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class g implements IRunActivityHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f33999a;

        public g(String str) {
            this.f33999a = str;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.removeGlobalCallbackParameterI(this.f33999a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class h implements IRunActivityHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f34000a;

        public h(String str) {
            this.f34000a = str;
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.removeGlobalPartnerParameterI(this.f34000a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class i implements IRunActivityHandler {
        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.removeGlobalCallbackParametersI();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class j implements IRunActivityHandler {
        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.removeGlobalPartnerParametersI();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f34001a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OnAdidReadListener f34002b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f34003c;

        public k(Context context, OnAdidReadListener onAdidReadListener, long j10) {
            this.f34001a = context;
            this.f34002b = onAdidReadListener;
            this.f34003c = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(this.f34001a);
            if (adidFromActivityStateFile != null) {
                new Handler(this.f34001a.getMainLooper()).post(new g0(this, adidFromActivityStateFile));
            } else {
                ActivityHandler.queueGetAdidWithTimeout(this.f34003c, this.f34002b, AdjustInstance.this.cachedAdidReadTimeoutCallbacks, this.f34001a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f34005a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OnAttributionReadListener f34006b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f34007c;

        public l(Context context, OnAttributionReadListener onAttributionReadListener, long j10) {
            this.f34005a = context;
            this.f34006b = onAttributionReadListener;
            this.f34007c = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(this.f34005a);
            if (attributionFromAttributionFile != null) {
                new Handler(this.f34005a.getMainLooper()).post(new h0(this, attributionFromAttributionFile));
            } else {
                ActivityHandler.queueGetAttributionWithTimeout(this.f34007c, this.f34006b, AdjustInstance.this.cachedAttributionReadTimeoutCallbacks, this.f34005a);
            }
        }
    }

    private void cacheDeeplink(Uri uri, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).cacheDeeplink(uri);
    }

    private boolean checkActivityHandler(String str) {
        return checkActivityHandler(str, false);
    }

    public String getCachedDeeplink(Context context) {
        return SharedPreferencesManager.getDefaultInstance(context).getCachedDeeplink();
    }

    private boolean isInstanceEnabled() {
        Boolean bool = this.startEnabled;
        return bool == null || bool.booleanValue();
    }

    private void saveDeeplink(AdjustDeeplink adjustDeeplink, long j10, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).saveDeeplink(adjustDeeplink, j10);
    }

    private void saveGdprForgetMe(Context context) {
        SharedPreferencesManager.getDefaultInstance(context).setGdprForgetMe();
    }

    private void savePreinstallReferrer(String str, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).savePreinstallReferrer(str);
    }

    private void savePushToken(String str, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).savePushToken(str);
    }

    private void saveRawReferrer(String str, long j10, Context context) {
        SharedPreferencesManager.getDefaultInstance(context).saveRawReferrer(str, j10);
    }

    private void setSendingReferrersAsNotSent(final Context context) {
        new SingleThreadCachedScheduler("AdjustInstance").submit(new Runnable() { // from class: com.adjust.sdk.e0
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferencesManager.getDefaultInstance(context).setSendingReferrersAsNotSent();
            }
        });
    }

    public void addGlobalCallbackParameter(String str, String str2) {
        if (checkActivityHandler("adding global callback parameter", true)) {
            this.activityHandler.addGlobalCallbackParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new e(str, str2));
        }
    }

    public void addGlobalPartnerParameter(String str, String str2) {
        if (checkActivityHandler("adding global partner parameter", true)) {
            this.activityHandler.addGlobalPartnerParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new f(str, str2));
        }
    }

    public void disable() {
        this.startEnabled = Boolean.FALSE;
        if (checkActivityHandler(false, "enabled mode", "disabled mode")) {
            this.activityHandler.setEnabled(false);
        }
    }

    public void disableCoppaComplianceInDelay() {
        if (checkActivityHandler("disableCoppaComplianceInDelay")) {
            this.activityHandler.setCoppaComplianceInDelay(false);
        }
    }

    public void disablePlayStoreKidsComplianceInDelay() {
        if (checkActivityHandler("disablePlayStoreKidsComplianceInDelay")) {
            this.activityHandler.setPlayStoreKidsComplianceInDelay(false);
        }
    }

    public void enable() {
        this.startEnabled = Boolean.TRUE;
        if (checkActivityHandler(true, "enabled mode", "disabled mode")) {
            this.activityHandler.setEnabled(true);
        }
    }

    public void enableCoppaComplianceInDelay() {
        if (checkActivityHandler("enableCoppaComplianceInDelay")) {
            this.activityHandler.setCoppaComplianceInDelay(true);
        }
    }

    public void enablePlayStoreKidsComplianceInDelay() {
        if (checkActivityHandler("enablePlayStoreKidsComplianceInDelay")) {
            this.activityHandler.setPlayStoreKidsComplianceInDelay(true);
        }
    }

    public void endFirstSessionDelay() {
        if (checkActivityHandler("endFirstSessionDelay")) {
            this.activityHandler.endFirstSessionDelay();
        }
    }

    public void gdprForgetMe(Context context) {
        saveGdprForgetMe(context);
        if (checkActivityHandler("gdpr", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.gdprForgetMe();
        }
    }

    public void getAdid(OnAdidReadListener onAdidReadListener) {
        if (checkActivityHandler("getAdid")) {
            this.activityHandler.getAdid(onAdidReadListener);
        } else {
            this.cachedAdidReadCallbacks.add(onAdidReadListener);
        }
    }

    public void getAdidWithTimeout(Context context, long j10, OnAdidReadListener onAdidReadListener) {
        if (checkActivityHandler("getAdidWithTimeout")) {
            this.activityHandler.getAdidWithTimeout(j10, onAdidReadListener);
        } else {
            new SingleThreadCachedScheduler("getAdidWithTimeout").submit(new k(context, onAdidReadListener, j10));
        }
    }

    public void getAmazonAdId(Context context, OnAmazonAdIdReadListener onAmazonAdIdReadListener) {
        DeviceInfo.getFireAdvertisingIdBypassConditions(context.getContentResolver(), onAmazonAdIdReadListener);
    }

    public void getAttribution(OnAttributionReadListener onAttributionReadListener) {
        if (checkActivityHandler("getAttribution")) {
            this.activityHandler.getAttribution(onAttributionReadListener);
        } else {
            this.cachedAttributionReadCallbacks.add(onAttributionReadListener);
        }
    }

    public void getAttributionWithTimeout(Context context, long j10, OnAttributionReadListener onAttributionReadListener) {
        if (checkActivityHandler("getAttributionWithTimeout")) {
            this.activityHandler.getAttributionWithTimeout(j10, onAttributionReadListener);
        } else {
            new SingleThreadCachedScheduler("getAttributionWithTimeout").submit(new l(context, onAttributionReadListener, j10));
        }
    }

    public void getGooglePlayInstallReferrer(Context context, OnGooglePlayInstallReferrerReadListener onGooglePlayInstallReferrerReadListener) {
        new InstallReferrer(context, new b(onGooglePlayInstallReferrerReadListener)).startConnection();
    }

    public void getLastDeeplink(Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        new c(context, onLastDeeplinkReadListener).execute(new Void[0]);
    }

    public void getSdkVersion(OnSdkVersionReadListener onSdkVersionReadListener) {
        new a(onSdkVersionReadListener).execute(new Void[0]);
    }

    public void initSdk(AdjustConfig adjustConfig) {
        if (!AdjustSigner.isPresent()) {
            AdjustFactory.getLogger().error("Missing signature library, SDK can't be initialised", new Object[0]);
            return;
        }
        if (adjustConfig == null) {
            AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
            return;
        }
        if (!adjustConfig.isValid()) {
            AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
            return;
        }
        if (this.activityHandler != null) {
            AdjustFactory.getLogger().error("Adjust already initialized", new Object[0]);
            return;
        }
        adjustConfig.preLaunchActions = this.preLaunchActions;
        adjustConfig.pushToken = this.pushToken;
        adjustConfig.startEnabled = this.startEnabled;
        adjustConfig.startOffline = this.startOffline;
        adjustConfig.basePath = this.basePath;
        adjustConfig.gdprPath = this.gdprPath;
        adjustConfig.subscriptionPath = this.subscriptionPath;
        adjustConfig.purchaseVerificationPath = this.purchaseVerificationPath;
        adjustConfig.cachedDeeplinkResolutionCallback = this.cachedDeeplinkResolutionCallback;
        adjustConfig.cachedAdidReadCallbacks = this.cachedAdidReadCallbacks;
        adjustConfig.cachedAdidReadTimeoutCallbacks = this.cachedAdidReadTimeoutCallbacks;
        adjustConfig.cachedAttributionReadCallbacks = this.cachedAttributionReadCallbacks;
        adjustConfig.cachedAttributionReadTimeoutCallbacks = this.cachedAttributionReadTimeoutCallbacks;
        this.activityHandler = AdjustFactory.getActivityHandler(adjustConfig);
        setSendingReferrersAsNotSent(adjustConfig.context);
    }

    public void isEnabled(Context context, OnIsEnabledListener onIsEnabledListener) {
        if (checkActivityHandler("isEnabled")) {
            this.activityHandler.isEnabled(onIsEnabledListener);
        } else {
            new d(onIsEnabledListener).execute(context);
        }
    }

    public void onPause() {
        if (checkActivityHandler("onPause")) {
            this.activityHandler.onPause();
        }
    }

    public void onResume() {
        if (checkActivityHandler("onResume")) {
            this.activityHandler.onResume();
        }
    }

    public void processAndResolveDeeplink(AdjustDeeplink adjustDeeplink, Context context, OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        if (adjustDeeplink == null || !adjustDeeplink.isValid()) {
            AdjustFactory.getLogger().warn("Skipping deeplink processing (null or empty)", new Object[0]);
            return;
        }
        if (onDeeplinkResolvedListener == null) {
            processDeeplink(adjustDeeplink, context);
            return;
        }
        cacheDeeplink(adjustDeeplink.url, context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (checkActivityHandler("processAndResolveDeeplink", true)) {
            this.activityHandler.processAndResolveDeeplink(adjustDeeplink, jCurrentTimeMillis, onDeeplinkResolvedListener);
        } else {
            saveDeeplink(adjustDeeplink, jCurrentTimeMillis, context);
            this.cachedDeeplinkResolutionCallback = onDeeplinkResolvedListener;
        }
    }

    public void processDeeplink(AdjustDeeplink adjustDeeplink, Context context) {
        if (adjustDeeplink == null || !adjustDeeplink.isValid()) {
            AdjustFactory.getLogger().warn("Skipping deeplink processing (null or empty)", new Object[0]);
            return;
        }
        cacheDeeplink(adjustDeeplink.url, context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (checkActivityHandler("processDeeplink", true)) {
            this.activityHandler.processDeeplink(adjustDeeplink, jCurrentTimeMillis);
        } else {
            saveDeeplink(adjustDeeplink, jCurrentTimeMillis, context);
        }
    }

    public void removeGlobalCallbackParameter(String str) {
        if (checkActivityHandler("removing global callback parameter", true)) {
            this.activityHandler.removeGlobalCallbackParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new g(str));
        }
    }

    public void removeGlobalCallbackParameters() {
        if (checkActivityHandler("resetting global callback parameters", true)) {
            this.activityHandler.removeGlobalCallbackParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new i());
        }
    }

    public void removeGlobalPartnerParameter(String str) {
        if (checkActivityHandler("removing global partner parameter", true)) {
            this.activityHandler.removeGlobalPartnerParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new h(str));
        }
    }

    public void removeGlobalPartnerParameters() {
        if (checkActivityHandler("resetting global partner parameters", true)) {
            this.activityHandler.removeGlobalPartnerParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new j());
        }
    }

    public void sendPreinstallReferrer(String str, Context context) {
        if (str == null || str.length() == 0) {
            AdjustFactory.getLogger().warn("Skipping SYSTEM_INSTALLER_REFERRER preinstall referrer processing (null or empty)", new Object[0]);
            return;
        }
        savePreinstallReferrer(str, context);
        if (checkActivityHandler("preinstall referrer", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.sendPreinstallReferrer();
        }
    }

    public void sendReferrer(String str, Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str == null || str.length() == 0) {
            AdjustFactory.getLogger().warn("Skipping INSTALL_REFERRER intent referrer processing (null or empty)", new Object[0]);
            return;
        }
        saveRawReferrer(str, jCurrentTimeMillis, context);
        if (checkActivityHandler(Constants.REFERRER, true) && this.activityHandler.isEnabled()) {
            this.activityHandler.sendReftagReferrer();
        }
    }

    public void setExternalDeviceIdInDelay(String str) {
        if (checkActivityHandler("setExternalDeviceIdInDelay")) {
            this.activityHandler.setExternalDeviceIdInDelay(str);
        }
    }

    public void setPushToken(String str, Context context) {
        savePushToken(str, context);
        if (checkActivityHandler("push token", true) && this.activityHandler.isEnabled()) {
            this.activityHandler.setPushToken(str, true);
        }
    }

    public void setTestOptions(AdjustTestOptions adjustTestOptions) {
        String str = adjustTestOptions.basePath;
        if (str != null) {
            this.basePath = str;
        }
        String str2 = adjustTestOptions.gdprPath;
        if (str2 != null) {
            this.gdprPath = str2;
        }
        String str3 = adjustTestOptions.subscriptionPath;
        if (str3 != null) {
            this.subscriptionPath = str3;
        }
        String str4 = adjustTestOptions.purchaseVerificationPath;
        if (str4 != null) {
            this.purchaseVerificationPath = str4;
        }
        String str5 = adjustTestOptions.baseUrl;
        if (str5 != null) {
            AdjustFactory.setBaseUrl(str5);
        }
        String str6 = adjustTestOptions.gdprUrl;
        if (str6 != null) {
            AdjustFactory.setGdprUrl(str6);
        }
        String str7 = adjustTestOptions.subscriptionUrl;
        if (str7 != null) {
            AdjustFactory.setSubscriptionUrl(str7);
        }
        String str8 = adjustTestOptions.purchaseVerificationUrl;
        if (str8 != null) {
            AdjustFactory.setPurchaseVerificationUrl(str8);
        }
        Long l10 = adjustTestOptions.timerIntervalInMilliseconds;
        if (l10 != null) {
            AdjustFactory.setTimerInterval(l10.longValue());
        }
        if (adjustTestOptions.timerStartInMilliseconds != null) {
            AdjustFactory.setTimerStart(adjustTestOptions.timerIntervalInMilliseconds.longValue());
        }
        Long l11 = adjustTestOptions.sessionIntervalInMilliseconds;
        if (l11 != null) {
            AdjustFactory.setSessionInterval(l11.longValue());
        }
        Long l12 = adjustTestOptions.subsessionIntervalInMilliseconds;
        if (l12 != null) {
            AdjustFactory.setSubsessionInterval(l12.longValue());
        }
        Boolean bool = adjustTestOptions.tryInstallReferrer;
        if (bool != null) {
            AdjustFactory.setTryInstallReferrer(bool.booleanValue());
        }
        if (adjustTestOptions.noBackoffWait != null) {
            BackoffStrategy backoffStrategy = BackoffStrategy.NO_WAIT;
            AdjustFactory.setPackageHandlerBackoffStrategy(backoffStrategy);
            AdjustFactory.setSdkClickBackoffStrategy(backoffStrategy);
        }
        Boolean bool2 = adjustTestOptions.ignoreSystemLifecycleBootstrap;
        if (bool2 != null) {
            AdjustFactory.setIgnoreSystemLifecycleBootstrap(bool2.booleanValue());
        }
        Boolean bool3 = adjustTestOptions.allowUrlStrategyFallback;
        if (bool3 != null) {
            AdjustFactory.setAllowUrlStrategyFallback(bool3.booleanValue());
        }
    }

    public void switchBackToOnlineMode() {
        if (checkActivityHandler(false, "offline mode", "online mode")) {
            this.activityHandler.setOfflineMode(false);
        } else {
            this.startOffline = false;
        }
    }

    public void switchToOfflineMode() {
        if (checkActivityHandler(true, "offline mode", "online mode")) {
            this.activityHandler.setOfflineMode(true);
        } else {
            this.startOffline = true;
        }
    }

    public void teardown() {
        if (checkActivityHandler("teardown")) {
            this.activityHandler.teardown();
            this.activityHandler = null;
        }
    }

    public void trackAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityHandler("trackAdRevenue")) {
            this.activityHandler.trackAdRevenue(adjustAdRevenue);
        }
    }

    public void trackEvent(AdjustEvent adjustEvent) {
        if (checkActivityHandler("trackEvent")) {
            this.activityHandler.trackEvent(adjustEvent);
        }
    }

    public void trackMeasurementConsent(final boolean z10) {
        if (checkActivityHandler("measurement consent", true)) {
            this.activityHandler.trackMeasurementConsent(z10);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() { // from class: com.adjust.sdk.f0
                @Override // com.adjust.sdk.IRunActivityHandler
                public final void run(ActivityHandler activityHandler) {
                    activityHandler.tryTrackMeasurementConsentI(z10);
                }
            });
        }
    }

    public void trackPlayStoreSubscription(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (checkActivityHandler("trackPlayStoreSubscription")) {
            this.activityHandler.trackPlayStoreSubscription(adjustPlayStoreSubscription);
        }
    }

    public void trackThirdPartySharing(final AdjustThirdPartySharing adjustThirdPartySharing) {
        if (checkActivityHandler("third party sharing", true)) {
            this.activityHandler.trackThirdPartySharing(adjustThirdPartySharing);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() { // from class: com.adjust.sdk.d0
                @Override // com.adjust.sdk.IRunActivityHandler
                public final void run(ActivityHandler activityHandler) {
                    activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                }
            });
        }
    }

    public void verifyAndTrackPlayStorePurchase(AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (checkActivityHandler("verifyAndTrack")) {
            this.activityHandler.verifyAndTrackPlayStorePurchase(adjustEvent, onPurchaseVerificationFinishedListener);
        } else if (onPurchaseVerificationFinishedListener != null) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 100, "SDK needs to be initialized before making purchase verification request"));
        }
    }

    public void verifyPlayStorePurchase(AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (checkActivityHandler("verifyPurchase")) {
            this.activityHandler.verifyPlayStorePurchase(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        } else {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 100, "SDK needs to be initialized before making purchase verification request"));
        }
    }

    private boolean checkActivityHandler(boolean z10, String str, String str2) {
        return z10 ? checkActivityHandler(str, true) : checkActivityHandler(str2, true);
    }

    private boolean checkActivityHandler(String str, boolean z10) {
        if (this.activityHandler != null) {
            return true;
        }
        if (str == null) {
            AdjustFactory.getLogger().error("Adjust not initialized correctly", new Object[0]);
            return false;
        }
        if (z10) {
            AdjustFactory.getLogger().warn("Adjust not initialized, but %s saved for launch", str);
        } else {
            AdjustFactory.getLogger().warn("Adjust not initialized, can't perform %s", str);
        }
        return false;
    }
}
