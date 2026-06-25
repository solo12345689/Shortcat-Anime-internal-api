package com.adjust.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.adjust.sdk.SystemLifecycle;
import com.adjust.sdk.network.ActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityHandler implements IActivityHandler, SystemLifecycle.SystemLifecycleCallback {
    private static final String ACTIVITY_STATE_NAME = "Activity state";
    private static final String ATTRIBUTION_NAME = "Attribution";
    private static long BACKGROUND_TIMER_INTERVAL = 0;
    private static final String BACKGROUND_TIMER_NAME = "Background timer";
    private static final String DELAY_START_TIMER_NAME = "Delay Start timer";
    private static final String EVENT_METADATA_NAME = "Event metadata";
    private static long FOREGROUND_TIMER_INTERVAL = 0;
    private static final String FOREGROUND_TIMER_NAME = "Foreground timer";
    private static long FOREGROUND_TIMER_START = 0;
    private static final String GLOBAL_CALLBACK_PARAMETERS_NAME = "Global Callback parameters";
    private static final String GLOBAL_PARAMETERS_NAME = "Global parameters";
    private static final String GLOBAL_PARTNER_PARAMETERS_NAME = "Global Partner parameters";
    private static long SESSION_INTERVAL = 0;
    private static long SUBSESSION_INTERVAL = 0;
    private static final String TIME_TRAVEL = "Time travel!";
    private ActivityState activityState;
    private AdjustConfig adjustConfig;
    private AdjustAttribution attribution;
    private IAttributionHandler attributionHandler;
    private TimerOnce backgroundTimer;
    private String basePath;
    private List<AdjustThirdPartySharing> cachedAdjustThirdPartySharingArray;
    private OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    private Boolean cachedLastMeasurementConsentTrack;
    private DeviceInfo deviceInfo;
    ThreadExecutor executor;
    private k0 firstSessionDelayManager;
    private TimerCycle foregroundTimer;
    private String gdprPath;
    private GlobalParameters globalParameters;
    private InstallReferrer installReferrer;
    private InternalState internalState;
    private ILogger logger;
    private IPackageHandler packageHandler;
    private IPurchaseVerificationHandler purchaseVerificationHandler;
    private ISdkClickHandler sdkClickHandler;
    private String subscriptionPath;
    private SystemLifecycle systemLifecycle;
    private final ArrayList<OnAdidReadListener> cachedAdidReadCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedAdidReadTimeoutCallbacks = new ArrayList<>();
    private final ArrayList<OnAttributionReadListener> cachedAttributionReadCallbacks = new ArrayList<>();
    private final ArrayList<AdjustTimeoutCallback> cachedAttributionReadTimeoutCallbacks = new ArrayList<>();
    private EventMetadata eventMetadata = new EventMetadata();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class A implements Runnable {
        public A() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails huaweiAppGalleryReferrer = Reflection.getHuaweiAppGalleryReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (huaweiAppGalleryReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(huaweiAppGalleryReferrer, Constants.REFERRER_API_HUAWEI_APP_GALLERY);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class B implements Runnable {
        public B() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails samsungReferrer = Reflection.getSamsungReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (samsungReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(samsungReferrer, Constants.REFERRER_API_SAMSUNG);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class C implements Runnable {
        public C() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails xiaomiReferrer = Reflection.getXiaomiReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (xiaomiReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(xiaomiReferrer, Constants.REFERRER_API_XIAOMI);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class D implements Runnable {
        public D() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails vivoReferrer = Reflection.getVivoReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (vivoReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(vivoReferrer, Constants.REFERRER_API_VIVO);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class E implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EventResponseData f33910a;

        public E(EventResponseData eventResponseData) {
            this.f33910a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener.onEventTrackingSucceeded(this.f33910a.getSuccessResponseData());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class F implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EventResponseData f33912a;

        public F(EventResponseData eventResponseData) {
            this.f33912a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onEventTrackingFailedListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onEventTrackingFailedListener.onEventTrackingFailed(this.f33912a.getFailureResponseData());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class G implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f33914a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdjustAttribution f33915b;

        public G(ArrayList arrayList, AdjustAttribution adjustAttribution) {
            this.f33914a = arrayList;
            this.f33915b = adjustAttribution;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f33914a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                OnAttributionReadListener onAttributionReadListener = (OnAttributionReadListener) obj;
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(this.f33915b);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class H implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnDeeplinkResolvedListener f33916a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SdkClickResponseData f33917b;

        public H(OnDeeplinkResolvedListener onDeeplinkResolvedListener, SdkClickResponseData sdkClickResponseData) {
            this.f33916a = onDeeplinkResolvedListener;
            this.f33917b = sdkClickResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33916a.onDeeplinkResolved(this.f33917b.resolvedDeeplink);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class I implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SessionResponseData f33918a;

        public I(SessionResponseData sessionResponseData) {
            this.f33918a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener.onSessionTrackingSucceeded(this.f33918a.getSuccessResponseData());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class InternalState {
        boolean enabled;
        boolean firstLaunch;
        Boolean foregroundOrElseBackground;
        boolean offline;
        boolean preinstallHasBeenRead;
        boolean sessionResponseProcessed;

        public InternalState() {
        }

        public boolean hasPreinstallBeenRead() {
            return this.preinstallHasBeenRead;
        }

        public boolean hasSessionResponseNotBeenProcessed() {
            return !this.sessionResponseProcessed;
        }

        public boolean isDisabled() {
            return !this.enabled;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public boolean isFirstLaunch() {
            return this.firstLaunch;
        }

        public boolean isInBackground() {
            Boolean bool = this.foregroundOrElseBackground;
            return (bool == null || bool.booleanValue()) ? false : true;
        }

        public boolean isInForeground() {
            Boolean bool = this.foregroundOrElseBackground;
            return bool != null && bool.booleanValue();
        }

        public boolean isOffline() {
            return this.offline;
        }

        public boolean isOnline() {
            return !this.offline;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class J implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SessionResponseData f33920a;

        public J(SessionResponseData sessionResponseData) {
            this.f33920a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener.onSessionTrackingFailed(this.f33920a.getFailureResponseData());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class K implements Runnable {
        public K() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null || ActivityHandler.this.adjustConfig.onAttributionChangedListener == null) {
                return;
            }
            ActivityHandler.this.adjustConfig.onAttributionChangedListener.onAttributionChanged(ActivityHandler.this.attribution);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class L implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PurchaseVerificationResponseData f33923a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdjustPurchaseVerificationResult f33924b;

        public L(PurchaseVerificationResponseData purchaseVerificationResponseData, AdjustPurchaseVerificationResult adjustPurchaseVerificationResult) {
            this.f33923a = purchaseVerificationResponseData;
            this.f33924b = adjustPurchaseVerificationResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33923a.activityPackage.getPurchaseVerificationCallback().onVerificationFinished(this.f33924b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class M implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AdjustRemoteTrigger f33925a;

        public M(AdjustRemoteTrigger adjustRemoteTrigger) {
            this.f33925a = adjustRemoteTrigger;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig.onRemoteTriggerListener != null) {
                ActivityHandler.this.adjustConfig.onRemoteTriggerListener.onRemoteTrigger(this.f33925a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class N implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Uri f33927a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Intent f33928b;

        public N(Intent intent, Uri uri) {
            this.f33927a = uri;
            this.f33928b = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActivityHandler.this.adjustConfig == null) {
                return;
            }
            if (ActivityHandler.this.adjustConfig.onDeferredDeeplinkResponseListener != null ? ActivityHandler.this.adjustConfig.onDeferredDeeplinkResponseListener.launchReceivedDeeplink(this.f33927a) : true) {
                ActivityHandler.this.launchDeeplinkMain(this.f33928b, this.f33927a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class O implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnDeeplinkResolvedListener f33930a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33931b;

        public O(OnDeeplinkResolvedListener onDeeplinkResolvedListener, String str) {
            this.f33930a = onDeeplinkResolvedListener;
            this.f33931b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33930a.onDeeplinkResolved(this.f33931b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class P implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f33932a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdjustAttribution f33933b;

        public P(ArrayList arrayList, AdjustAttribution adjustAttribution) {
            this.f33932a = arrayList;
            this.f33933b = adjustAttribution;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f33932a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj;
                if (adjustTimeoutCallback != null) {
                    TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                    if (timeoutTimer != null) {
                        timeoutTimer.cancel();
                    }
                    OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback.getOnAttributionReadListener();
                    if (onAttributionReadListener != null) {
                        onAttributionReadListener.onAttributionRead(this.f33933b);
                    }
                    adjustTimeoutCallback.setOnAttributionReadListener(null);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class Q implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f33934a;

        public Q(boolean z10) {
            this.f33934a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.setAskingAttributionI(this.f33934a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class R implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReferrerDetails f33936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33937b;

        public R(ReferrerDetails referrerDetails, String str) {
            this.f33936a = referrerDetails;
            this.f33937b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendInstallReferrerI(this.f33936a, this.f33937b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class S implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LicenseData f33939a;

        public S(LicenseData licenseData) {
            this.f33939a = licenseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.sendLicenseVerificationDataI(this.f33939a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class T implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EventResponseData f33941a;

        public T(EventResponseData eventResponseData) {
            this.f33941a = eventResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchEventResponseTasksI(this.f33941a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class U implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SdkClickResponseData f33943a;

        public U(SdkClickResponseData sdkClickResponseData) {
            this.f33943a = sdkClickResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchSdkClickResponseTasksI(this.f33943a);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3109a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SessionResponseData f33945a;

        public RunnableC3109a(SessionResponseData sessionResponseData) {
            this.f33945a = sessionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchSessionResponseTasksI(this.f33945a);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3110b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AttributionResponseData f33947a;

        public RunnableC3110b(AttributionResponseData attributionResponseData) {
            this.f33947a = attributionResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchAttributionResponseTasksI(this.f33947a);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3111c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PurchaseVerificationResponseData f33949a;

        public RunnableC3111c(PurchaseVerificationResponseData purchaseVerificationResponseData) {
            this.f33949a = purchaseVerificationResponseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.launchPurchaseVerificationResponseTasksI(this.f33949a);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3112d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ResponseData f33951a;

        public RunnableC3112d(ResponseData responseData) {
            this.f33951a = responseData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.processRemoteTriggersI(this.f33951a);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3113e implements Runnable {
        public RunnableC3113e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.gotOptOutResponseI();
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3114f implements Runnable {
        public RunnableC3114f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.foregroundTimerFiredI();
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3115g implements Runnable {
        public RunnableC3115g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.backgroundTimerFiredI();
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3116h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnAdidReadListener f33956a;

        public RunnableC3116h(OnAdidReadListener onAdidReadListener) {
            this.f33956a = onAdidReadListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33956a.onAdidRead(ActivityHandler.this.activityState.adid);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3117i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnAdidReadListener f33958a;

        public RunnableC3117i(OnAdidReadListener onAdidReadListener) {
            this.f33958a = onAdidReadListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33958a.onAdidRead(ActivityHandler.this.activityState.adid);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3118j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnAttributionReadListener f33960a;

        public RunnableC3118j(OnAttributionReadListener onAttributionReadListener) {
            this.f33960a = onAttributionReadListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33960a.onAttributionRead(ActivityHandler.this.attribution);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3119k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f33962a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33963b;

        public RunnableC3119k(ArrayList arrayList, String str) {
            this.f33962a = arrayList;
            this.f33963b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f33962a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                OnAdidReadListener onAdidReadListener = (OnAdidReadListener) obj;
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(this.f33963b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3120l implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnAttributionReadListener f33964a;

        public RunnableC3120l(OnAttributionReadListener onAttributionReadListener) {
            this.f33964a = onAttributionReadListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33964a.onAttributionRead(ActivityHandler.this.attribution);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3121m implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AdjustTimeoutCallback f33966a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f33967b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f33968c;

        public RunnableC3121m(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context) {
            this.f33966a = adjustTimeoutCallback;
            this.f33967b = arrayList;
            this.f33968c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f33966a.getOnAdidReadListener() != null) {
                synchronized (this.f33967b) {
                    this.f33967b.remove(this.f33966a);
                }
                new Handler(this.f33968c.getMainLooper()).post(new b0(this));
            }
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3122n implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AdjustTimeoutCallback f33969a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f33970b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f33971c;

        public RunnableC3122n(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context) {
            this.f33969a = adjustTimeoutCallback;
            this.f33970b = arrayList;
            this.f33971c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f33969a.getOnAttributionReadListener() != null) {
                synchronized (this.f33970b) {
                    this.f33970b.remove(this.f33969a);
                }
                new Handler(this.f33971c.getMainLooper()).post(new c0(this));
            }
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class C3123o implements IRunActivityHandler {
        public C3123o() {
        }

        @Override // com.adjust.sdk.IRunActivityHandler
        public final void run(ActivityHandler activityHandler) {
            activityHandler.setEnabledI(ActivityHandler.this.adjustConfig.startEnabled.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$p */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3124p implements Runnable {
        public RunnableC3124p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.foregroundTimerFired();
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$q */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3125q implements Runnable {
        public RunnableC3125q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityHandler.this.backgroundTimerFired();
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$r */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class C3126r implements InstallReferrerReadListener {
        public C3126r() {
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onFail(String str) {
            ActivityHandler.this.logger.debug(str, new Object[0]);
        }

        @Override // com.adjust.sdk.InstallReferrerReadListener
        public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
            ActivityHandler.this.sendInstallReferrer(referrerDetails, str);
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$s */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3127s implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f33976a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdjustAttribution f33977b;

        public RunnableC3127s(ArrayList arrayList, AdjustAttribution adjustAttribution) {
            this.f33976a = arrayList;
            this.f33977b = adjustAttribution;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f33976a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                OnAttributionReadListener onAttributionReadListener = (OnAttributionReadListener) obj;
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(this.f33977b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$t */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3128t implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f33978a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdjustAttribution f33979b;

        public RunnableC3128t(ArrayList arrayList, AdjustAttribution adjustAttribution) {
            this.f33978a = arrayList;
            this.f33979b = adjustAttribution;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f33978a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj;
                if (adjustTimeoutCallback != null) {
                    TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                    if (timeoutTimer != null) {
                        timeoutTimer.cancel();
                    }
                    OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback.getOnAttributionReadListener();
                    if (onAttributionReadListener != null) {
                        onAttributionReadListener.onAttributionRead(this.f33979b);
                    }
                    adjustTimeoutCallback.setOnAttributionReadListener(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityHandler$u */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class RunnableC3129u implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f33980a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33981b;

        public RunnableC3129u(ArrayList arrayList, String str) {
            this.f33980a = arrayList;
            this.f33981b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f33980a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                OnAdidReadListener onAdidReadListener = (OnAdidReadListener) obj;
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(this.f33981b);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class v implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f33982a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33983b;

        public v(ArrayList arrayList, String str) {
            this.f33982a = arrayList;
            this.f33983b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f33982a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj;
                if (adjustTimeoutCallback != null) {
                    TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                    if (timeoutTimer != null) {
                        timeoutTimer.cancel();
                    }
                    OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                    if (onAdidReadListener != null) {
                        onAdidReadListener.onAdidRead(this.f33983b);
                    }
                    adjustTimeoutCallback.setOnAdidReadListener(null);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class w implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f33984a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f33985b;

        public w(ArrayList arrayList, String str) {
            this.f33984a = arrayList;
            this.f33985b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f33984a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj;
                if (adjustTimeoutCallback != null) {
                    TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                    if (timeoutTimer != null) {
                        timeoutTimer.cancel();
                    }
                    OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                    if (onAdidReadListener != null) {
                        onAdidReadListener.onAdidRead(this.f33985b);
                    }
                    adjustTimeoutCallback.setOnAdidReadListener(null);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails metaReferrer = Reflection.getMetaReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.adjustConfig.fbAppId, ActivityHandler.this.logger);
            if (metaReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(metaReferrer, Constants.REFERRER_API_META);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LicenseData licenseRequiredData;
            if (SharedPreferencesManager.getDefaultInstance(ActivityHandler.this.getContext()).getLicenseVerificationTracked() || (licenseRequiredData = Reflection.getLicenseRequiredData(ActivityHandler.this.getContext(), ActivityHandler.this.logger, ActivityHandler.this.deviceInfo.appInstallTime)) == null) {
                return;
            }
            ActivityHandler.this.sendLicenseVerificationData(licenseRequiredData);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReferrerDetails huaweiAdsReferrer = Reflection.getHuaweiAdsReferrer(ActivityHandler.this.getContext(), ActivityHandler.this.logger);
            if (huaweiAdsReferrer != null) {
                ActivityHandler.this.sendInstallReferrer(huaweiAdsReferrer, Constants.REFERRER_API_HUAWEI_ADS);
            }
        }
    }

    private ActivityHandler(final AdjustConfig adjustConfig) {
        init(adjustConfig);
        ILogger logger = AdjustFactory.getLogger();
        this.logger = logger;
        logger.lockLogLevel();
        this.executor = new SingleThreadCachedScheduler("ActivityHandler");
        InternalState internalState = new InternalState();
        this.internalState = internalState;
        Boolean bool = adjustConfig.startEnabled;
        internalState.enabled = bool != null ? bool.booleanValue() : true;
        InternalState internalState2 = this.internalState;
        internalState2.offline = adjustConfig.startOffline;
        internalState2.sessionResponseProcessed = false;
        internalState2.preinstallHasBeenRead = false;
        this.cachedAdjustThirdPartySharingArray = null;
        this.cachedLastMeasurementConsentTrack = null;
        this.firstSessionDelayManager = new k0(this);
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.a0
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler.g(this.f34120a, adjustConfig);
            }
        });
    }

    public static /* synthetic */ void M(ActivityHandler activityHandler, boolean z10, String str) {
        if (!z10) {
            SharedPreferencesManager.getDefaultInstance(activityHandler.getContext()).savePushToken(str);
        }
        if (activityHandler.activityState == null) {
            return;
        }
        activityHandler.setPushTokenI(str);
    }

    public static void R(ActivityHandler activityHandler, boolean z10) {
        k0 k0Var = activityHandler.firstSessionDelayManager;
        if (k0Var.f34148c != 3) {
            return;
        }
        k0Var.f34146a.getAdjustConfig().playStoreKidsComplianceEnabled = z10;
    }

    public void backgroundTimerFiredI() {
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
    }

    private void bootstrapLifecycleI() {
        SystemLifecycle singletonInstance = SystemLifecycle.getSingletonInstance();
        this.systemLifecycle = singletonInstance;
        Iterator<String> it = singletonInstance.logMessageList.iterator();
        while (it.hasNext()) {
            this.logger.debug("Lifecycle: %s", it.next());
        }
        this.systemLifecycle.overwriteCallback(this);
        if (AdjustFactory.isSystemLifecycleBootstrapIgnored()) {
            return;
        }
        this.internalState.foregroundOrElseBackground = this.systemLifecycle.foregroundOrElseBackgroundCached();
        if (this.internalState.isInForeground()) {
            onResumeI();
        }
    }

    private boolean canTrackMeasurementConsentI() {
        return checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten;
    }

    private boolean canTrackThirdPartySharingI() {
        if (!checkActivityStateI(this.activityState) || !isEnabledI() || this.activityState.isGdprForgotten) {
            return false;
        }
        if (!this.adjustConfig.coppaComplianceEnabled) {
            return true;
        }
        this.logger.warn("Calling third party sharing API not allowed when COPPA enabled", new Object[0]);
        return false;
    }

    private boolean checkActivityStateI(ActivityState activityState) {
        if (activityState != null) {
            return true;
        }
        this.logger.error("Sdk did not yet start", new Object[0]);
        return false;
    }

    private boolean checkAdjustAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        if (adjustAdRevenue == null) {
            this.logger.error("Ad revenue object missing", new Object[0]);
            return false;
        }
        if (adjustAdRevenue.isValid()) {
            return true;
        }
        this.logger.error("Ad revenue object not initialized correctly", new Object[0]);
        return false;
    }

    private void checkAfterNewStartI() {
        checkAfterNewStartI(SharedPreferencesManager.getDefaultInstance(getContext()));
    }

    private void checkAttributionStateI() {
        if (checkActivityStateI(this.activityState)) {
            if (this.internalState.isFirstLaunch() && this.internalState.hasSessionResponseNotBeenProcessed()) {
                return;
            }
            if (this.attribution == null || this.activityState.askingAttribution) {
                this.attributionHandler.getAttribution();
            }
        }
    }

    private boolean checkEventI(AdjustEvent adjustEvent) {
        if (adjustEvent == null) {
            this.logger.error("Event missing", new Object[0]);
            return false;
        }
        if (adjustEvent.isValid()) {
            return true;
        }
        this.logger.error("Event not initialized correctly", new Object[0]);
        return false;
    }

    private void checkForInstallReferrerInfo(SdkClickResponseData sdkClickResponseData) {
        if (sdkClickResponseData.isInstallReferrer) {
            String str = sdkClickResponseData.referrerApi;
            if (str != null && str.equalsIgnoreCase(Constants.REFERRER_API_HUAWEI_ADS)) {
                ActivityState activityState = this.activityState;
                activityState.clickTimeHuawei = sdkClickResponseData.clickTime;
                activityState.installBeginHuawei = sdkClickResponseData.installBegin;
                activityState.installReferrerHuawei = sdkClickResponseData.installReferrer;
                writeActivityStateI();
                return;
            }
            String str2 = sdkClickResponseData.referrerApi;
            if (str2 != null && str2.equalsIgnoreCase(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
                ActivityState activityState2 = this.activityState;
                activityState2.clickTimeHuawei = sdkClickResponseData.clickTime;
                activityState2.installBeginHuawei = sdkClickResponseData.installBegin;
                activityState2.installReferrerHuaweiAppGallery = sdkClickResponseData.installReferrer;
                writeActivityStateI();
                return;
            }
            String str3 = sdkClickResponseData.referrerApi;
            if (str3 != null && str3.equalsIgnoreCase(Constants.REFERRER_API_META)) {
                ActivityState activityState3 = this.activityState;
                activityState3.clickTimeMeta = sdkClickResponseData.clickTime;
                activityState3.installReferrerMeta = sdkClickResponseData.installReferrer;
                activityState3.isClickMeta = sdkClickResponseData.isClick;
                writeActivityStateI();
                return;
            }
            String str4 = sdkClickResponseData.referrerApi;
            if (str4 != null && str4.equalsIgnoreCase(Constants.REFERRER_API_SAMSUNG)) {
                ActivityState activityState4 = this.activityState;
                activityState4.clickTimeSamsung = sdkClickResponseData.clickTime;
                activityState4.installBeginSamsung = sdkClickResponseData.installBegin;
                activityState4.installReferrerSamsung = sdkClickResponseData.installReferrer;
                writeActivityStateI();
                return;
            }
            String str5 = sdkClickResponseData.referrerApi;
            if (str5 != null && str5.equalsIgnoreCase(Constants.REFERRER_API_XIAOMI)) {
                ActivityState activityState5 = this.activityState;
                activityState5.clickTimeXiaomi = sdkClickResponseData.clickTime;
                activityState5.installBeginXiaomi = sdkClickResponseData.installBegin;
                activityState5.installReferrerXiaomi = sdkClickResponseData.installReferrer;
                activityState5.clickTimeServerXiaomi = sdkClickResponseData.clickTimeServer;
                activityState5.installBeginServerXiaomi = sdkClickResponseData.installBeginServer;
                activityState5.installVersionXiaomi = sdkClickResponseData.installVersion;
                writeActivityStateI();
                return;
            }
            String str6 = sdkClickResponseData.referrerApi;
            if (str6 != null && str6.equalsIgnoreCase(Constants.REFERRER_API_VIVO)) {
                ActivityState activityState6 = this.activityState;
                activityState6.clickTimeVivo = sdkClickResponseData.clickTime;
                activityState6.installBeginVivo = sdkClickResponseData.installBegin;
                activityState6.installReferrerVivo = sdkClickResponseData.installReferrer;
                activityState6.installVersionVivo = sdkClickResponseData.installVersion;
                writeActivityStateI();
                return;
            }
            ActivityState activityState7 = this.activityState;
            activityState7.clickTime = sdkClickResponseData.clickTime;
            activityState7.installBegin = sdkClickResponseData.installBegin;
            activityState7.installReferrer = sdkClickResponseData.installReferrer;
            activityState7.clickTimeServer = sdkClickResponseData.clickTimeServer;
            activityState7.installBeginServer = sdkClickResponseData.installBeginServer;
            activityState7.installVersion = sdkClickResponseData.installVersion;
            activityState7.googlePlayInstant = sdkClickResponseData.googlePlayInstant;
            writeActivityStateI();
        }
    }

    private void checkForPreinstallI() {
        ActivityState activityState = this.activityState;
        if (activityState == null || !activityState.enabled || activityState.isGdprForgotten) {
            return;
        }
        sendPreinstallReferrerI();
        if (this.adjustConfig.isPreinstallTrackingEnabled && !this.internalState.hasPreinstallBeenRead()) {
            String str = this.deviceInfo.packageName;
            if (str == null || str.isEmpty()) {
                this.logger.debug("Can't read preinstall payload, invalid package name", new Object[0]);
                return;
            }
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
            long preinstallPayloadReadStatus = defaultInstance.getPreinstallPayloadReadStatus();
            if (PreinstallUtil.hasAllLocationsBeenRead(preinstallPayloadReadStatus)) {
                this.internalState.preinstallHasBeenRead = true;
                return;
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus)) {
                String payloadFromSystemProperty = PreinstallUtil.getPayloadFromSystemProperty(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemProperty == null || payloadFromSystemProperty.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemProperty, Constants.SYSTEM_PROPERTIES);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyReflection = PreinstallUtil.getPayloadFromSystemPropertyReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyReflection == null || payloadFromSystemPropertyReflection.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyReflection, Constants.SYSTEM_PROPERTIES_REFLECTION);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyFilePath = PreinstallUtil.getPayloadFromSystemPropertyFilePath(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePath == null || payloadFromSystemPropertyFilePath.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePath, Constants.SYSTEM_PROPERTIES_PATH);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus)) {
                String payloadFromSystemPropertyFilePathReflection = PreinstallUtil.getPayloadFromSystemPropertyFilePathReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePathReflection == null || payloadFromSystemPropertyFilePathReflection.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePathReflection, Constants.SYSTEM_PROPERTIES_PATH_REFLECTION);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus)) {
                String payloadFromContentProviderDefault = PreinstallUtil.getPayloadFromContentProviderDefault(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadFromContentProviderDefault == null || payloadFromContentProviderDefault.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromContentProviderDefault, Constants.CONTENT_PROVIDER);
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus)) {
                List<String> payloadsFromContentProviderIntentAction = PreinstallUtil.getPayloadsFromContentProviderIntentAction(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderIntentAction == null || payloadsFromContentProviderIntentAction.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus);
                } else {
                    Iterator<String> it = payloadsFromContentProviderIntentAction.iterator();
                    while (it.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it.next(), Constants.CONTENT_PROVIDER_INTENT_ACTION);
                    }
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus)) {
                List<String> payloadsFromContentProviderNoPermission = PreinstallUtil.getPayloadsFromContentProviderNoPermission(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderNoPermission == null || payloadsFromContentProviderNoPermission.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus);
                } else {
                    Iterator<String> it2 = payloadsFromContentProviderNoPermission.iterator();
                    while (it2.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it2.next(), Constants.CONTENT_PROVIDER_NO_PERMISSION);
                    }
                }
            }
            if (PreinstallUtil.hasNotBeenRead(Constants.FILE_SYSTEM, preinstallPayloadReadStatus)) {
                String payloadFromFileSystem = PreinstallUtil.getPayloadFromFileSystem(this.deviceInfo.packageName, this.adjustConfig.preinstallFilePath, this.logger);
                if (payloadFromFileSystem == null || payloadFromFileSystem.isEmpty()) {
                    preinstallPayloadReadStatus = PreinstallUtil.markAsRead(Constants.FILE_SYSTEM, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromFileSystem, Constants.FILE_SYSTEM);
                }
            }
            defaultInstance.setPreinstallPayloadReadStatus(preinstallPayloadReadStatus);
            this.internalState.preinstallHasBeenRead = true;
        }
    }

    private Intent createDeeplinkIntentI(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        intent.setPackage(this.adjustConfig.context.getPackageName());
        return intent;
    }

    public static boolean deleteActivityState(Context context) {
        return context.deleteFile(Constants.ACTIVITY_STATE_FILENAME);
    }

    public static boolean deleteAttribution(Context context) {
        return context.deleteFile(Constants.ATTRIBUTION_FILENAME);
    }

    public static boolean deleteEventMetadata(Context context) {
        return context.deleteFile(Constants.EVENT_METADATA_FILENAME);
    }

    public static boolean deleteGlobalCallbackParameters(Context context) {
        return context.deleteFile(Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME);
    }

    public static boolean deleteGlobalPartnerParameters(Context context) {
        return context.deleteFile(Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME);
    }

    public static void deleteState(Context context) {
        deleteActivityState(context);
        deleteAttribution(context);
        deleteGlobalCallbackParameters(context);
        deleteGlobalPartnerParameters(context);
        deleteEventMetadata(context);
        SharedPreferencesManager.getDefaultInstance(context).clear();
    }

    private void disableThirdPartySharingForCoppaEnabledI() {
        if (shouldDisableThirdPartySharingWhenCoppaEnabled()) {
            this.activityState.isThirdPartySharingDisabledForCoppa = true;
            writeActivityStateI();
            this.packageHandler.addPackage(new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis()).buildThirdPartySharingPackage(new AdjustThirdPartySharing(Boolean.FALSE)));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void endI() {
        if (!toSendI()) {
            pauseSendingI();
        }
        if (updateActivityStateI(System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    public static /* synthetic */ void f(final ActivityHandler activityHandler, final OnIsEnabledListener onIsEnabledListener) {
        activityHandler.getClass();
        new Handler(activityHandler.adjustConfig.context.getMainLooper()).post(new Runnable() { // from class: com.adjust.sdk.j
            @Override // java.lang.Runnable
            public final void run() {
                onIsEnabledListener.onIsEnabledRead(this.f34144a.isEnabledI());
            }
        });
    }

    public void foregroundTimerFiredI() {
        if (!isEnabledI()) {
            stopForegroundTimerI();
            return;
        }
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
        if (updateActivityStateI(System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    public static void g(ActivityHandler activityHandler, AdjustConfig adjustConfig) {
        activityHandler.getClass();
        activityHandler.readAttributionI(adjustConfig.context);
        activityHandler.readActivityStateI(adjustConfig.context);
        activityHandler.readEventMetadataI(adjustConfig.context);
        k0 k0Var = activityHandler.firstSessionDelayManager;
        if (k0Var.f34146a.getActivityState() == null && k0Var.f34146a.getAdjustConfig().isFirstSessionDelayEnabled) {
            k0Var.f34148c = 3;
            return;
        }
        k0Var.f34148c = 2;
        k0Var.f34146a.initI();
        ArrayList arrayList = k0Var.f34147b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public void gdprForgetMeI() {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten) {
                return;
            }
            activityState.isGdprForgotten = true;
            writeActivityStateI();
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildGdprPackage());
            SharedPreferencesManager.getDefaultInstance(getContext()).removeGdprForgetMe();
            this.packageHandler.sendFirstPackage();
        }
    }

    public static ActivityHandler getInstance(AdjustConfig adjustConfig) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (adjustConfig == null) {
            AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
            return null;
        }
        if (!adjustConfig.isValid()) {
            AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        }
        if (adjustConfig.processName != null) {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) adjustConfig.context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (!next.processName.equalsIgnoreCase(adjustConfig.processName)) {
                            AdjustFactory.getLogger().info("Skipping initialization in background process (%s)", next.processName);
                            return null;
                        }
                    }
                }
            } else {
                return null;
            }
        }
        return new ActivityHandler(adjustConfig);
    }

    public void gotOptOutResponseI() {
        this.activityState.isGdprForgotten = true;
        writeActivityStateI();
        this.packageHandler.flush();
        setEnabledI(false);
    }

    private void handleAdidCallbackI() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.cachedAdidReadCallbacks) {
            this.cachedAdidReadCallbacks.addAll(this.adjustConfig.cachedAdidReadCallbacks);
            this.adjustConfig.cachedAdidReadCallbacks.clear();
        }
        synchronized (this.cachedAdidReadTimeoutCallbacks) {
            this.cachedAdidReadTimeoutCallbacks.addAll(this.adjustConfig.cachedAdidReadTimeoutCallbacks);
            this.adjustConfig.cachedAdidReadTimeoutCallbacks.clear();
        }
        ActivityState activityState = this.activityState;
        if (activityState == null || activityState.adid == null) {
            return;
        }
        synchronized (this.cachedAdidReadCallbacks) {
            try {
                arrayList = null;
                if (this.cachedAdidReadCallbacks.isEmpty()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(this.cachedAdidReadCallbacks);
                    this.cachedAdidReadCallbacks.clear();
                }
            } finally {
            }
        }
        if (arrayList2 != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new RunnableC3129u(arrayList2, this.activityState.adid));
        }
        synchronized (this.cachedAdidReadTimeoutCallbacks) {
            try {
                if (!this.cachedAdidReadTimeoutCallbacks.isEmpty()) {
                    arrayList = new ArrayList(this.cachedAdidReadTimeoutCallbacks);
                    this.cachedAdidReadTimeoutCallbacks.clear();
                }
            } finally {
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new w(arrayList, this.activityState.adid));
        }
    }

    private void handleAttributionCallbackI() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.cachedAttributionReadCallbacks) {
            this.cachedAttributionReadCallbacks.addAll(this.adjustConfig.cachedAttributionReadCallbacks);
            this.adjustConfig.cachedAttributionReadCallbacks.clear();
        }
        synchronized (this.cachedAttributionReadTimeoutCallbacks) {
            this.cachedAttributionReadTimeoutCallbacks.addAll(this.adjustConfig.cachedAttributionReadTimeoutCallbacks);
            this.adjustConfig.cachedAttributionReadTimeoutCallbacks.clear();
        }
        if (this.attribution == null) {
            return;
        }
        synchronized (this.cachedAttributionReadCallbacks) {
            try {
                arrayList = null;
                if (this.cachedAttributionReadCallbacks.isEmpty()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(this.cachedAttributionReadCallbacks);
                    this.cachedAttributionReadCallbacks.clear();
                }
            } finally {
            }
        }
        if (arrayList2 != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new RunnableC3127s(arrayList2, this.attribution));
        }
        synchronized (this.cachedAttributionReadTimeoutCallbacks) {
            try {
                if (!this.cachedAttributionReadTimeoutCallbacks.isEmpty()) {
                    arrayList = new ArrayList(this.cachedAttributionReadTimeoutCallbacks);
                    this.cachedAttributionReadTimeoutCallbacks.clear();
                }
            } finally {
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new RunnableC3128t(arrayList, this.attribution));
        }
    }

    private boolean hasChangedStateI(boolean z10, boolean z11, String str, String str2) {
        if (z10 != z11) {
            return true;
        }
        if (z10) {
            this.logger.debug(str, new Object[0]);
        } else {
            this.logger.debug(str2, new Object[0]);
        }
        return false;
    }

    private boolean isEnabledI() {
        ActivityState activityState = this.activityState;
        return activityState != null ? activityState.enabled : this.internalState.isEnabled();
    }

    private boolean isValidReferrerDetails(ReferrerDetails referrerDetails) {
        String str;
        return (referrerDetails == null || (str = referrerDetails.installReferrer) == null || str.length() == 0) ? false : true;
    }

    public static /* synthetic */ void k(ActivityHandler activityHandler, boolean z10) {
        Boolean bool = activityHandler.internalState.foregroundOrElseBackground;
        if (bool == null || bool.booleanValue() != z10) {
            activityHandler.internalState.foregroundOrElseBackground = Boolean.valueOf(z10);
            if (z10) {
                activityHandler.onResumeI();
            } else {
                activityHandler.onPauseI();
            }
        }
    }

    private void launchAttributionListenerI(Handler handler) {
        if (this.adjustConfig.onAttributionChangedListener == null) {
            return;
        }
        handler.post(new K());
    }

    public void launchAttributionResponseTasksI(AttributionResponseData attributionResponseData) {
        processRemoteTriggersI(attributionResponseData);
        updateAdidI(attributionResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(attributionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        prepareDeeplinkI(attributionResponseData.deeplink, handler);
    }

    public void launchDeeplinkMain(Intent intent, Uri uri) {
        if (this.adjustConfig.context.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
            this.logger.error("Unable to open deferred deeplink (%s)", uri);
        } else {
            this.logger.info("Open deferred deeplink (%s)", uri);
            this.adjustConfig.context.startActivity(intent);
        }
    }

    public void launchEventResponseTasksI(EventResponseData eventResponseData) {
        updateAdidI(eventResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        boolean z10 = eventResponseData.success;
        if (z10 && this.adjustConfig.onEventTrackingSucceededListener != null) {
            this.logger.debug("Launching success event tracking listener", new Object[0]);
            handler.post(new E(eventResponseData));
        } else {
            if (z10 || this.adjustConfig.onEventTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed event tracking listener", new Object[0]);
            handler.post(new F(eventResponseData));
        }
    }

    public void launchPurchaseVerificationResponseTasksI(PurchaseVerificationResponseData purchaseVerificationResponseData) {
        AdjustEvent adjustEvent;
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        JSONObject jSONObject = purchaseVerificationResponseData.jsonResponse;
        handler.post(new L(purchaseVerificationResponseData, jSONObject == null ? new AdjustPurchaseVerificationResult("not_verified", 101, purchaseVerificationResponseData.message) : new AdjustPurchaseVerificationResult(UtilNetworking.extractJsonString(jSONObject, "verification_status"), UtilNetworking.extractJsonInt(jSONObject, "code"), UtilNetworking.extractJsonString(jSONObject, "message"))));
        ActivityPackage activityPackage = purchaseVerificationResponseData.activityPackage;
        if (activityPackage == null || (adjustEvent = activityPackage.event) == null) {
            return;
        }
        trackEventI(adjustEvent);
    }

    public void launchSdkClickResponseTasksI(SdkClickResponseData sdkClickResponseData) {
        updateAdidI(sdkClickResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sdkClickResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (TextUtils.isEmpty(sdkClickResponseData.resolvedDeeplink)) {
            return;
        }
        OnDeeplinkResolvedListener onDeeplinkResolvedListener = this.cachedDeeplinkResolutionCallback;
        this.cachedDeeplinkResolutionCallback = null;
        if (onDeeplinkResolvedListener != null) {
            handler.post(new H(onDeeplinkResolvedListener, sdkClickResponseData));
        }
    }

    private void launchSessionResponseListenerI(SessionResponseData sessionResponseData, Handler handler) {
        boolean z10 = sessionResponseData.success;
        if (z10 && this.adjustConfig.onSessionTrackingSucceededListener != null) {
            this.logger.debug("Launching success session tracking listener", new Object[0]);
            handler.post(new I(sessionResponseData));
        } else {
            if (z10 || this.adjustConfig.onSessionTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed session tracking listener", new Object[0]);
            handler.post(new J(sessionResponseData));
        }
    }

    public void launchSessionResponseTasksI(SessionResponseData sessionResponseData) {
        this.logger.debug("Launching SessionResponse tasks", new Object[0]);
        updateAdidI(sessionResponseData.adid);
        Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sessionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (this.attribution == null && !this.activityState.askingAttribution) {
            this.attributionHandler.getAttribution();
        }
        if (sessionResponseData.success) {
            SharedPreferencesManager.getDefaultInstance(getContext()).setInstallTracked();
        }
        launchSessionResponseListenerI(sessionResponseData, handler);
        prepareDeeplinkI(sessionResponseData.deeplink, handler);
        this.internalState.sessionResponseProcessed = true;
    }

    public static void n(ActivityHandler activityHandler, boolean z10) {
        k0 k0Var = activityHandler.firstSessionDelayManager;
        if (k0Var.f34148c != 3) {
            return;
        }
        k0Var.f34146a.getAdjustConfig().coppaComplianceEnabled = z10;
    }

    public static void o(ActivityHandler activityHandler, String str) {
        k0 k0Var = activityHandler.firstSessionDelayManager;
        if (k0Var.f34148c != 3) {
            return;
        }
        k0Var.f34146a.getAdjustConfig().externalDeviceId = str;
    }

    private void pauseSendingI() {
        this.attributionHandler.pauseSending();
        this.packageHandler.pauseSending();
        if (toSendI(true)) {
            this.sdkClickHandler.resumeSending();
            this.purchaseVerificationHandler.resumeSending();
        } else {
            this.sdkClickHandler.pauseSending();
            this.purchaseVerificationHandler.pauseSending();
        }
    }

    private boolean pausedI() {
        return pausedI(false);
    }

    private void preLaunchActionsI(List<IRunActivityHandler> list) {
        if (list == null) {
            return;
        }
        Iterator<IRunActivityHandler> it = list.iterator();
        while (it.hasNext()) {
            it.next().run(this);
        }
    }

    private void prepareDeeplinkI(Uri uri, Handler handler) {
        if (uri == null) {
            return;
        }
        this.logger.info("Deferred deeplink received (%s)", uri);
        handler.post(new N(createDeeplinkIntentI(uri), uri));
    }

    private void processCachedDeeplinkI() {
        if (checkActivityStateI(this.activityState)) {
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
            String deeplinkUrl = defaultInstance.getDeeplinkUrl();
            String deeplinkReferrer = defaultInstance.getDeeplinkReferrer();
            long deeplinkClickTime = defaultInstance.getDeeplinkClickTime();
            if (deeplinkUrl == null || deeplinkClickTime == -1) {
                return;
            }
            AdjustDeeplink adjustDeeplink = new AdjustDeeplink(Uri.parse(deeplinkUrl));
            if (deeplinkReferrer != null) {
                adjustDeeplink.setReferrer(Uri.parse(deeplinkReferrer));
            }
            processDeeplink(adjustDeeplink, deeplinkClickTime);
            defaultInstance.removeDeeplink();
        }
    }

    private void processCoppaComplianceI() {
        if (this.adjustConfig.coppaComplianceEnabled) {
            disableThirdPartySharingForCoppaEnabledI();
        } else {
            resetThirdPartySharingCoppaActivityStateI();
        }
    }

    public void processDeeplinkI(AdjustDeeplink adjustDeeplink, long j10) {
        if (isEnabledI() && adjustDeeplink != null) {
            if (Util.isUrlFilteredOut(adjustDeeplink.getUrl())) {
                if (adjustDeeplink.getUrl() != null) {
                    this.logger.debug("Deeplink (" + adjustDeeplink.getUrl().toString() + ") processing skipped", new Object[0]);
                    return;
                }
                return;
            }
            if (Util.isUrlWithTrackerQueryParam(adjustDeeplink.getUrl())) {
                String string = adjustDeeplink.getUrl().toString();
                Handler handler = new Handler(this.adjustConfig.context.getMainLooper());
                OnDeeplinkResolvedListener onDeeplinkResolvedListener = this.cachedDeeplinkResolutionCallback;
                this.cachedDeeplinkResolutionCallback = null;
                if (onDeeplinkResolvedListener != null) {
                    handler.post(new O(onDeeplinkResolvedListener, string));
                }
            }
            ActivityPackage activityPackageBuildDeeplinkSdkClickPackage = PackageFactory.buildDeeplinkSdkClickPackage(adjustDeeplink.getUrl(), adjustDeeplink.getReferrer(), j10, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.firstSessionDelayManager, this.internalState);
            if (activityPackageBuildDeeplinkSdkClickPackage == null) {
                return;
            }
            this.sdkClickHandler.sendSdkClick(activityPackageBuildDeeplinkSdkClickPackage);
        }
    }

    private void processPreLaunchArraysI() {
        if (this.cachedAdjustThirdPartySharingArray != null && canTrackThirdPartySharingI()) {
            Iterator<AdjustThirdPartySharing> it = this.cachedAdjustThirdPartySharingArray.iterator();
            while (it.hasNext()) {
                trackThirdPartySharingI(it.next());
            }
        }
        this.cachedAdjustThirdPartySharingArray = null;
        if (this.cachedLastMeasurementConsentTrack != null && canTrackMeasurementConsentI()) {
            trackMeasurementConsentI(this.cachedLastMeasurementConsentTrack.booleanValue());
        }
        this.cachedLastMeasurementConsentTrack = null;
    }

    public void processRemoteTriggersI(ResponseData responseData) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = responseData.jsonResponse;
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("remote_triggers")) == null || jSONArrayOptJSONArray.length() == 0 || this.adjustConfig.onRemoteTriggerListener == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                this.logger.warn("Invalid remote trigger item, skipping", new Object[0]);
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("label");
                if (strOptString.isEmpty()) {
                    this.logger.warn("Remote trigger missing or invalid label, skipping", new Object[0]);
                } else {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("payload");
                    if (jSONObjectOptJSONObject2 == null) {
                        this.logger.warn("Remote trigger missing or invalid payload, skipping", new Object[0]);
                    } else {
                        new Handler(this.adjustConfig.context.getMainLooper()).post(new M(new AdjustRemoteTrigger(strOptString, jSONObjectOptJSONObject2)));
                    }
                }
            }
        }
    }

    private void processSessionI() {
        if (this.activityState.isGdprForgotten) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ActivityState activityState = this.activityState;
        long j10 = jCurrentTimeMillis - activityState.lastActivity;
        if (j10 < 0) {
            this.logger.error(TIME_TRAVEL, new Object[0]);
            this.activityState.lastActivity = jCurrentTimeMillis;
            writeActivityStateI();
            return;
        }
        if (j10 > SESSION_INTERVAL) {
            trackNewSessionI(jCurrentTimeMillis);
            checkAfterNewStartI();
            return;
        }
        if (j10 <= SUBSESSION_INTERVAL) {
            this.logger.verbose("Time span since last activity too short for a new subsession", new Object[0]);
            return;
        }
        int i10 = activityState.subsessionCount + 1;
        activityState.subsessionCount = i10;
        activityState.sessionLength += j10;
        activityState.lastActivity = jCurrentTimeMillis;
        this.logger.verbose("Started subsession %d of session %d", Integer.valueOf(i10), Integer.valueOf(this.activityState.sessionCount));
        writeActivityStateI();
        checkForPreinstallI();
        this.installReferrer.startConnection();
        readInstallReferrerMeta();
        readInstallReferrerHuaweiAds();
        readInstallReferrerHuaweiAppGallery();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
        readLicenseVerificationData();
    }

    public static void queueGetAdidWithTimeout(long j10, OnAdidReadListener onAdidReadListener, ArrayList<AdjustTimeoutCallback> arrayList, Context context) {
        AdjustTimeoutCallback adjustTimeoutCallback = new AdjustTimeoutCallback(onAdidReadListener);
        synchronized (arrayList) {
            arrayList.add(adjustTimeoutCallback);
        }
        TimerOnce timerOnce = new TimerOnce(new RunnableC3121m(adjustTimeoutCallback, arrayList, context), Constants.ADID_TIMEOUT_TIMER_NAME);
        adjustTimeoutCallback.setTimer(timerOnce);
        timerOnce.startIn(j10);
    }

    public static void queueGetAttributionWithTimeout(long j10, OnAttributionReadListener onAttributionReadListener, ArrayList<AdjustTimeoutCallback> arrayList, Context context) {
        AdjustTimeoutCallback adjustTimeoutCallback = new AdjustTimeoutCallback(onAttributionReadListener);
        synchronized (arrayList) {
            arrayList.add(adjustTimeoutCallback);
        }
        TimerOnce timerOnce = new TimerOnce(new RunnableC3122n(adjustTimeoutCallback, arrayList, context), Constants.ATTRIBUTION_TIMEOUT_TIMER_NAME);
        adjustTimeoutCallback.setTimer(timerOnce);
        timerOnce.startIn(j10);
    }

    private void readActivityStateI(Context context) {
        try {
            this.activityState = (ActivityState) Util.readObject(context, Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME, ActivityState.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", ACTIVITY_STATE_NAME, e10.getMessage());
            this.activityState = null;
        }
    }

    private void readAttributionI(Context context) {
        try {
            this.attribution = (AdjustAttribution) Util.readObject(context, Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME, AdjustAttribution.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", ATTRIBUTION_NAME, e10.getMessage());
            this.attribution = null;
        }
    }

    private void readConfigFile(Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open("adjust_config.properties");
            Properties properties = new Properties();
            properties.load(inputStreamOpen);
            this.logger.verbose("adjust_config.properties file read and loaded", new Object[0]);
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                this.adjustConfig.defaultTracker = property;
            }
        } catch (Exception e10) {
            this.logger.debug("%s file not found in this app", e10.getMessage());
        }
    }

    private void readEventMetadataI(Context context) {
        try {
            this.eventMetadata = (EventMetadata) Util.readObject(context, Constants.EVENT_METADATA_FILENAME, EVENT_METADATA_NAME, EventMetadata.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", EVENT_METADATA_NAME, e10.getMessage());
        }
        if (this.eventMetadata == null) {
            this.eventMetadata = new EventMetadata();
        }
    }

    private void readGlobalCallbackParametersI(Context context) {
        try {
            this.globalParameters.callbackParameters = (Map) Util.readObject(context, Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME, GLOBAL_CALLBACK_PARAMETERS_NAME, Map.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", GLOBAL_CALLBACK_PARAMETERS_NAME, e10.getMessage());
            this.globalParameters.callbackParameters = null;
        }
    }

    private void readGlobalPartnerParametersI(Context context) {
        try {
            this.globalParameters.partnerParameters = (Map) Util.readObject(context, Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME, GLOBAL_PARTNER_PARAMETERS_NAME, Map.class);
        } catch (Exception e10) {
            this.logger.error("Failed to read %s file (%s)", GLOBAL_PARTNER_PARAMETERS_NAME, e10.getMessage());
            this.globalParameters.partnerParameters = null;
        }
    }

    private void readInstallReferrerHuaweiAds() {
        this.executor.submit(new z());
    }

    private void readInstallReferrerHuaweiAppGallery() {
        this.executor.submit(new A());
    }

    private void readInstallReferrerMeta() {
        this.executor.submit(new x());
    }

    private void readInstallReferrerSamsung() {
        this.executor.submit(new B());
    }

    private void readInstallReferrerVivo() {
        this.executor.submit(new D());
    }

    private void readInstallReferrerXiaomi() {
        this.executor.submit(new C());
    }

    private void readLicenseVerificationData() {
        this.executor.submit(new y());
    }

    private void resetThirdPartySharingCoppaActivityStateI() {
        ActivityState activityState = this.activityState;
        if (activityState != null && activityState.isThirdPartySharingDisabledForCoppa) {
            activityState.isThirdPartySharingDisabledForCoppa = false;
            writeActivityStateI();
        }
    }

    private void resumeSendingI() {
        this.attributionHandler.resumeSending();
        this.packageHandler.resumeSending();
        this.sdkClickHandler.resumeSending();
        this.purchaseVerificationHandler.resumeSending();
    }

    public void sendInstallReferrerI(ReferrerDetails referrerDetails, String str) {
        if (isEnabledI() && isValidReferrerDetails(referrerDetails) && !Util.isEqualReferrerDetails(referrerDetails, str, this.activityState)) {
            this.sdkClickHandler.sendSdkClick(PackageFactory.buildInstallReferrerSdkClickPackage(referrerDetails, str, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.firstSessionDelayManager, this.internalState));
        }
    }

    public void sendLicenseVerificationDataI(LicenseData licenseData) {
        if (isEnabledI() && licenseData != null && licenseData.isValid()) {
            this.sdkClickHandler.sendSdkClick(PackageFactory.buildLicenseVerificationSdkClickPackage(licenseData, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.firstSessionDelayManager, this.internalState));
        }
    }

    public void sendPreinstallReferrerI() {
        String preinstallReferrer;
        if (!isEnabledI() || this.activityState == null || (preinstallReferrer = SharedPreferencesManager.getDefaultInstance(getContext()).getPreinstallReferrer()) == null || preinstallReferrer.isEmpty()) {
            return;
        }
        this.sdkClickHandler.sendPreinstallPayload(preinstallReferrer, Constants.SYSTEM_INSTALLER_REFERRER);
    }

    public void sendReftagReferrerI() {
        if (isEnabledI() && this.activityState != null) {
            this.sdkClickHandler.sendReftagReferrers();
        }
    }

    public void setAskingAttributionI(boolean z10) {
        this.activityState.askingAttribution = z10;
        writeActivityStateI();
    }

    public void setEnabledI(boolean z10) {
        ActivityState activityState;
        if (hasChangedStateI(isEnabledI(), z10, "Adjust already enabled", "Adjust already disabled")) {
            if (z10 && (activityState = this.activityState) != null && activityState.isGdprForgotten) {
                this.logger.error("Re-enabling SDK not possible for forgotten user", new Object[0]);
                return;
            }
            this.internalState.enabled = z10;
            ActivityState activityState2 = this.activityState;
            if (activityState2 == null) {
                updateStatusI(!z10, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
                return;
            }
            activityState2.enabled = z10;
            writeActivityStateI();
            if (z10) {
                SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
                if (defaultInstance.getGdprForgetMe()) {
                    gdprForgetMeI();
                } else {
                    processCoppaComplianceI();
                    processPreLaunchArraysI();
                }
                if (!defaultInstance.getInstallTracked()) {
                    this.logger.debug("Detected that install was not tracked at enable time", new Object[0]);
                    trackNewSessionI(System.currentTimeMillis());
                }
                checkAfterNewStartI(defaultInstance);
            }
            updateStatusI(!z10, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
        }
    }

    public void setOfflineModeI(boolean z10) {
        if (hasChangedStateI(this.internalState.isOffline(), z10, "Adjust already in offline mode", "Adjust already in online mode")) {
            this.internalState.offline = z10;
            if (this.activityState == null) {
                updateStatusI(z10, "Handlers will start paused due to SDK being offline", "Handlers will still start as paused", "Handlers will start as active due to SDK being online");
            } else {
                updateStatusI(z10, "Pausing handlers to put SDK offline mode", "Handlers remain paused", "Resuming handlers to put SDK in online mode");
            }
        }
    }

    private void setPushTokenI(String str) {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten || str == null || str.equals(activityState.pushToken)) {
                return;
            }
            this.activityState.pushToken = str;
            writeActivityStateI();
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildInfoPackage(Constants.PUSH));
            SharedPreferencesManager.getDefaultInstance(getContext()).removePushToken();
            this.packageHandler.sendFirstPackage();
        }
    }

    private boolean shouldDisableThirdPartySharingWhenCoppaEnabled() {
        if (this.activityState == null || !isEnabledI()) {
            return false;
        }
        if (this.activityState.isGdprForgotten) {
            return false;
        }
        return !r0.isThirdPartySharingDisabledForCoppa;
    }

    private boolean shouldProcessEventI(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.activityState.eventDeduplicationIdExists(str)) {
                this.logger.info("Skipping duplicate event with deduplication ID '%s'", str);
                return false;
            }
            this.activityState.addDeduplicationId(str);
            this.logger.verbose("Added deduplication ID '%s'", str);
        }
        return true;
    }

    private void startBackgroundTimerI() {
        if (this.backgroundTimer != null && toSendI() && this.backgroundTimer.getFireIn() <= 0) {
            this.backgroundTimer.startIn(BACKGROUND_TIMER_INTERVAL);
        }
    }

    private void startFirstSessionI() {
        ActivityState activityState = new ActivityState();
        this.activityState = activityState;
        activityState.setEventDeduplicationIdsMaxSize(this.adjustConfig.getEventDeduplicationIdsMaxSize());
        updateHandlersStatusAndSendI();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(getContext());
        this.activityState.pushToken = defaultInstance.getPushToken();
        if (this.internalState.isEnabled()) {
            if (defaultInstance.getGdprForgetMe()) {
                gdprForgetMeI();
            } else {
                processCoppaComplianceI();
                processPreLaunchArraysI();
                this.activityState.sessionCount = 1;
                transferSessionPackageI(jCurrentTimeMillis);
                checkAfterNewStartI(defaultInstance);
            }
        }
        this.activityState.resetSessionAttributes(jCurrentTimeMillis);
        this.activityState.enabled = this.internalState.isEnabled();
        writeActivityStateI();
        defaultInstance.removePushToken();
        defaultInstance.removeGdprForgetMe();
        processCachedDeeplinkI();
    }

    private void startForegroundTimerI() {
        if (isEnabledI()) {
            this.foregroundTimer.start();
        }
    }

    private void startI() {
        if (this.activityState == null) {
            AdjustSigner.onResume(this.adjustConfig.logger);
            startFirstSessionI();
            return;
        }
        processPreLaunchArraysI();
        if (this.activityState.enabled) {
            AdjustSigner.onResume(this.adjustConfig.logger);
            updateHandlersStatusAndSendI();
            processCoppaComplianceI();
            processSessionI();
            checkAttributionStateI();
            processCachedDeeplinkI();
        }
    }

    private void stopBackgroundTimerI() {
        TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce == null) {
            return;
        }
        timerOnce.cancel();
    }

    private void stopForegroundTimerI() {
        this.foregroundTimer.suspend();
    }

    private void teardownActivityStateS() {
        synchronized (ActivityState.class) {
            try {
                if (this.activityState == null) {
                    return;
                }
                this.activityState = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void teardownAllGlobalParametersS() {
        synchronized (GlobalParameters.class) {
            try {
                if (this.globalParameters == null) {
                    return;
                }
                this.globalParameters = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void teardownAttributionS() {
        synchronized (AdjustAttribution.class) {
            try {
                if (this.attribution == null) {
                    return;
                }
                this.attribution = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void teardownEventMetadataS() {
        synchronized (EventMetadata.class) {
            try {
                if (this.eventMetadata == null) {
                    return;
                }
                this.eventMetadata = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean toSendI() {
        return toSendI(false);
    }

    public void trackAdRevenueI(AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkAdjustAdRevenue(adjustAdRevenue) && !this.activityState.isGdprForgotten) {
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildAdRevenuePackage(adjustAdRevenue));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void trackEventI(AdjustEvent adjustEvent) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkEventI(adjustEvent) && !this.activityState.isGdprForgotten && shouldProcessEventI(adjustEvent.deduplicationId)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iIncrementSequenceForEvent = this.eventMetadata.incrementSequenceForEvent(adjustEvent.eventToken);
            this.activityState.eventCount++;
            updateActivityStateI(jCurrentTimeMillis);
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, jCurrentTimeMillis);
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildEventPackage(adjustEvent, iIncrementSequenceForEvent));
            this.packageHandler.sendFirstPackage();
            if (this.adjustConfig.isSendingInBackgroundEnabled && this.internalState.isInBackground()) {
                startBackgroundTimerI();
            }
            writeActivityStateI();
            writeEventMetadataI();
        }
    }

    private void trackMeasurementConsentI(boolean z10) {
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildMeasurementConsentPackage(z10));
        this.packageHandler.sendFirstPackage();
    }

    private void trackNewSessionI(long j10) {
        ActivityState activityState = this.activityState;
        long j11 = j10 - activityState.lastActivity;
        activityState.sessionCount++;
        activityState.lastInterval = j11;
        transferSessionPackageI(j10);
        this.activityState.resetSessionAttributes(j10);
        writeActivityStateI();
    }

    public void trackPlayStoreSubscriptionI(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten) {
            PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildSubscriptionPackage(adjustPlayStoreSubscription));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void trackThirdPartySharingI(AdjustThirdPartySharing adjustThirdPartySharing) {
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildThirdPartySharingPackage(adjustThirdPartySharing));
        this.packageHandler.sendFirstPackage();
    }

    private void transferSessionPackageI(long j10) {
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, j10);
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildSessionPackage());
        this.packageHandler.sendFirstPackage();
    }

    private boolean updateActivityStateI(long j10) {
        if (!checkActivityStateI(this.activityState)) {
            return false;
        }
        ActivityState activityState = this.activityState;
        long j11 = j10 - activityState.lastActivity;
        if (j11 > SESSION_INTERVAL) {
            return false;
        }
        activityState.lastActivity = j10;
        if (j11 < 0) {
            this.logger.error(TIME_TRAVEL, new Object[0]);
            return true;
        }
        activityState.sessionLength += j11;
        activityState.timeSpent += j11;
        return true;
    }

    private void updateAdidI(String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (str == null) {
            return;
        }
        if (!str.equals(this.activityState.adid)) {
            this.activityState.adid = str;
            writeActivityStateI();
        }
        synchronized (this.cachedAdidReadCallbacks) {
            try {
                arrayList = null;
                if (this.cachedAdidReadCallbacks.isEmpty()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(this.cachedAdidReadCallbacks);
                    this.cachedAdidReadCallbacks.clear();
                }
            } finally {
            }
        }
        if (arrayList2 != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new RunnableC3119k(arrayList2, str));
        }
        synchronized (this.cachedAdidReadTimeoutCallbacks) {
            try {
                if (!this.cachedAdidReadTimeoutCallbacks.isEmpty()) {
                    arrayList = new ArrayList(this.cachedAdidReadTimeoutCallbacks);
                    this.cachedAdidReadTimeoutCallbacks.clear();
                }
            } finally {
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new v(arrayList, str));
        }
    }

    private void updateHandlersStatusAndSendI() {
        if (!toSendI()) {
            pauseSendingI();
        } else {
            resumeSendingI();
            this.packageHandler.sendFirstPackage();
        }
    }

    private void updateStatusI(boolean z10, String str, String str2, String str3) {
        if (z10) {
            this.logger.info(str, new Object[0]);
        } else if (!pausedI(false)) {
            this.logger.info(str3, new Object[0]);
        } else if (pausedI(true)) {
            this.logger.info(str2, new Object[0]);
        } else {
            this.logger.info(str2 + ", except the Sdk Click Handler", new Object[0]);
        }
        updateHandlersStatusAndSendI();
    }

    public static /* synthetic */ void v(ActivityHandler activityHandler, AdjustEvent adjustEvent) {
        if (activityHandler.activityState == null) {
            activityHandler.logger.warn("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new Object[0]);
            activityHandler.startI();
        }
        activityHandler.trackEventI(adjustEvent);
    }

    public void verifyAndTrackPlayStorePurchaseI(AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            this.logger.warn("Purchase verification aborted because verification callback is null", new Object[0]);
            return;
        }
        if (this.adjustConfig.isDataResidency) {
            this.logger.warn("Purchase verification not available for data residency users right now", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 109, "Purchase verification not available for data residency users right now"));
            return;
        }
        if (!checkActivityStateI(this.activityState)) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 102, "Purchase verification aborted because SDK is still not initialized"));
            this.logger.warn("Purchase verification aborted because SDK is still not initialized", new Object[0]);
            return;
        }
        if (!isEnabledI()) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 103, "Purchase verification aborted because SDK is disabled"));
            this.logger.warn("Purchase verification aborted because SDK is disabled", new Object[0]);
            return;
        }
        if (this.activityState.isGdprForgotten) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 104, "Purchase verification aborted because user is GDPR forgotten"));
            this.logger.warn("Purchase verification aborted because user is GDPR forgotten", new Object[0]);
            return;
        }
        if (adjustEvent == null) {
            this.logger.warn("Purchase verification aborted because event instance is null", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 106, "Purchase verification aborted because event instance is null"));
            return;
        }
        ActivityPackage activityPackageBuildVerificationPackage = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis()).buildVerificationPackage(adjustEvent, onPurchaseVerificationFinishedListener);
        if (activityPackageBuildVerificationPackage == null) {
            this.logger.warn("Purchase verification aborted because verification package is null", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 107, "Purchase verification aborted because verification package is null"));
        } else {
            activityPackageBuildVerificationPackage.event = adjustEvent;
            this.purchaseVerificationHandler.sendPurchaseVerificationPackage(activityPackageBuildVerificationPackage);
        }
    }

    public void verifyPlayStorePurchaseI(AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            this.logger.warn("Purchase verification aborted because verification callback is null", new Object[0]);
            return;
        }
        if (this.adjustConfig.isDataResidency) {
            this.logger.warn("Purchase verification not available for data residency users right now", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 109, "Purchase verification not available for data residency users right now"));
            return;
        }
        if (!checkActivityStateI(this.activityState)) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 102, "Purchase verification aborted because SDK is still not initialized"));
            this.logger.warn("Purchase verification aborted because SDK is still not initialized", new Object[0]);
            return;
        }
        if (!isEnabledI()) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 103, "Purchase verification aborted because SDK is disabled"));
            this.logger.warn("Purchase verification aborted because SDK is disabled", new Object[0]);
            return;
        }
        if (this.activityState.isGdprForgotten) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 104, "Purchase verification aborted because user is GDPR forgotten"));
            this.logger.warn("Purchase verification aborted because user is GDPR forgotten", new Object[0]);
            return;
        }
        if (adjustPlayStorePurchase == null) {
            this.logger.warn("Purchase verification aborted because purchase instance is null", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 105, "Purchase verification aborted because purchase instance is null"));
            return;
        }
        PackageBuilder packageBuilder = new PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        ActivityPackage activityPackageBuildVerificationPackage = packageBuilder.buildVerificationPackage(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        if (activityPackageBuildVerificationPackage != null) {
            this.purchaseVerificationHandler.sendPurchaseVerificationPackage(activityPackageBuildVerificationPackage);
        } else {
            this.logger.warn("Purchase verification aborted because verification package is null", new Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new AdjustPurchaseVerificationResult("not_verified", 106, "Purchase verification aborted because verification package is null"));
        }
    }

    private void writeActivityStateI() {
        synchronized (ActivityState.class) {
            try {
                ActivityState activityState = this.activityState;
                if (activityState == null) {
                    return;
                }
                Util.writeObject(activityState, this.adjustConfig.context, Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void writeAttributionI() {
        synchronized (AdjustAttribution.class) {
            try {
                AdjustAttribution adjustAttribution = this.attribution;
                if (adjustAttribution == null) {
                    return;
                }
                Util.writeObject(adjustAttribution, this.adjustConfig.context, Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void writeEventMetadataI() {
        synchronized (EventMetadata.class) {
            try {
                EventMetadata eventMetadata = this.eventMetadata;
                if (eventMetadata == null) {
                    return;
                }
                Util.writeObject(eventMetadata, this.adjustConfig.context, Constants.EVENT_METADATA_FILENAME, EVENT_METADATA_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void writeGlobalCallbackParametersI() {
        synchronized (GlobalParameters.class) {
            try {
                GlobalParameters globalParameters = this.globalParameters;
                if (globalParameters == null) {
                    return;
                }
                Util.writeObject(globalParameters.callbackParameters, this.adjustConfig.context, Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME, GLOBAL_CALLBACK_PARAMETERS_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void writeGlobalPartnerParametersI() {
        synchronized (GlobalParameters.class) {
            try {
                GlobalParameters globalParameters = this.globalParameters;
                if (globalParameters == null) {
                    return;
                }
                Util.writeObject(globalParameters.partnerParameters, this.adjustConfig.context, Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME, GLOBAL_PARTNER_PARAMETERS_NAME);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void y(ActivityHandler activityHandler) {
        k0 k0Var = activityHandler.firstSessionDelayManager;
        if (k0Var.f34148c != 3) {
            return;
        }
        k0Var.f34148c = 4;
        k0Var.f34146a.initI();
        ArrayList arrayList = k0Var.f34147b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addGlobalCallbackParameter(final String str, final String str2) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f34110a.firstSessionDelayManager.b("add global callback parameter", new IRunActivityHandler() { // from class: com.adjust.sdk.A
                    @Override // com.adjust.sdk.IRunActivityHandler
                    public final void run(ActivityHandler activityHandler) {
                        activityHandler.addGlobalCallbackParameterI(str, str);
                    }
                });
            }
        });
    }

    public void addGlobalCallbackParameterI(String str, String str2) {
        if (Util.isValidParameter(str, SubscriberAttributeKt.JSON_NAME_KEY, "Global Callback") && Util.isValidParameter(str2, "value", "Global Callback")) {
            GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters.callbackParameters == null) {
                globalParameters.callbackParameters = new LinkedHashMap();
            }
            String str3 = this.globalParameters.callbackParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.globalParameters.callbackParameters.put(str, str2);
            writeGlobalCallbackParametersI();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addGlobalPartnerParameter(final String str, final String str2) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.D
            @Override // java.lang.Runnable
            public final void run() {
                this.f34025a.firstSessionDelayManager.b("add global partner parameter", new IRunActivityHandler() { // from class: com.adjust.sdk.s
                    @Override // com.adjust.sdk.IRunActivityHandler
                    public final void run(ActivityHandler activityHandler) {
                        activityHandler.addGlobalPartnerParameterI(str, str);
                    }
                });
            }
        });
    }

    public void addGlobalPartnerParameterI(String str, String str2) {
        if (Util.isValidParameter(str, SubscriberAttributeKt.JSON_NAME_KEY, "Global Partner") && Util.isValidParameter(str2, "value", "Global Partner")) {
            GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters.partnerParameters == null) {
                globalParameters.partnerParameters = new LinkedHashMap();
            }
            String str3 = this.globalParameters.partnerParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.globalParameters.partnerParameters.put(str, str2);
            writeGlobalPartnerParametersI();
        }
    }

    public void backgroundTimerFired() {
        this.executor.submit(new RunnableC3115g());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void endFirstSessionDelay() {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.n
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler.y(this.f34155a);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void finishedTrackingActivity(ResponseData responseData) {
        processRemoteTriggers(responseData);
        if (responseData instanceof SessionResponseData) {
            this.logger.debug("Finished tracking session", new Object[0]);
            this.attributionHandler.checkSessionResponse((SessionResponseData) responseData);
            return;
        }
        if (responseData instanceof SdkClickResponseData) {
            SdkClickResponseData sdkClickResponseData = (SdkClickResponseData) responseData;
            checkForInstallReferrerInfo(sdkClickResponseData);
            this.attributionHandler.checkSdkClickResponse(sdkClickResponseData);
        } else if (responseData instanceof EventResponseData) {
            launchEventResponseTasks((EventResponseData) responseData);
        } else if (responseData instanceof PurchaseVerificationResponseData) {
            launchPurchaseVerificationResponseTasks((PurchaseVerificationResponseData) responseData);
        }
    }

    public void foregroundTimerFired() {
        this.executor.submit(new RunnableC3114f());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gdprForgetMe() {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.L
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34052a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34048a.gdprForgetMeI();
                    }
                }, "GDPR forget device");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public ActivityState getActivityState() {
        return this.activityState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAdid(OnAdidReadListener onAdidReadListener) {
        ActivityState activityState = this.activityState;
        if (activityState != null && activityState.adid != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new RunnableC3116h(onAdidReadListener));
            return;
        }
        if (activityState == null) {
            this.logger.warn("SDK needs to be initialized before getting adid", new Object[0]);
        }
        synchronized (this.cachedAdidReadCallbacks) {
            this.cachedAdidReadCallbacks.add(onAdidReadListener);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAdidWithTimeout(long j10, OnAdidReadListener onAdidReadListener) {
        ActivityState activityState = this.activityState;
        if (activityState != null && activityState.adid != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new RunnableC3117i(onAdidReadListener));
            return;
        }
        if (activityState == null) {
            this.logger.warn("SDK needs to be initialized before getting adid", new Object[0]);
        }
        queueGetAdidWithTimeout(j10, onAdidReadListener, this.cachedAdidReadTimeoutCallbacks, getContext());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public AdjustConfig getAdjustConfig() {
        return this.adjustConfig;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAttribution(OnAttributionReadListener onAttributionReadListener) {
        if (this.attribution != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new RunnableC3118j(onAttributionReadListener));
            return;
        }
        synchronized (this.cachedAttributionReadCallbacks) {
            this.cachedAttributionReadCallbacks.add(onAttributionReadListener);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAttributionWithTimeout(long j10, OnAttributionReadListener onAttributionReadListener) {
        if (this.attribution != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new RunnableC3120l(onAttributionReadListener));
        } else {
            queueGetAttributionWithTimeout(j10, onAttributionReadListener, this.cachedAttributionReadTimeoutCallbacks, getContext());
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public Context getContext() {
        return this.adjustConfig.context;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public k0 getFirstSessionDelayManager() {
        return this.firstSessionDelayManager;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public GlobalParameters getGlobalParameters() {
        return this.globalParameters;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public InternalState getInternalState() {
        return this.internalState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gotOptOutResponse() {
        this.executor.submit(new RunnableC3113e());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void init(AdjustConfig adjustConfig) {
        this.adjustConfig = adjustConfig;
    }

    public void initI() {
        String pushToken;
        SESSION_INTERVAL = AdjustFactory.getSessionInterval();
        SUBSESSION_INTERVAL = AdjustFactory.getSubsessionInterval();
        FOREGROUND_TIMER_INTERVAL = AdjustFactory.getTimerInterval();
        FOREGROUND_TIMER_START = AdjustFactory.getTimerStart();
        BACKGROUND_TIMER_INTERVAL = AdjustFactory.getTimerInterval();
        this.globalParameters = new GlobalParameters();
        readGlobalCallbackParametersI(this.adjustConfig.context);
        readGlobalPartnerParametersI(this.adjustConfig.context);
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.setEventDeduplicationIdsMaxSize(this.adjustConfig.getEventDeduplicationIdsMaxSize());
        }
        AdjustConfig adjustConfig = this.adjustConfig;
        if (adjustConfig.startEnabled != null) {
            adjustConfig.preLaunchActions.preLaunchActionsArray.add(new C3123o());
        }
        ActivityState activityState2 = this.activityState;
        if (activityState2 != null) {
            InternalState internalState = this.internalState;
            internalState.enabled = activityState2.enabled;
            internalState.firstLaunch = false;
        } else {
            this.internalState.firstLaunch = true;
        }
        readConfigFile(this.adjustConfig.context);
        DeviceInfo deviceInfo = new DeviceInfo(this.adjustConfig);
        this.deviceInfo = deviceInfo;
        deviceInfo.reloadPlayIds(this.adjustConfig);
        if (this.deviceInfo.playAdId == null) {
            if (Util.canReadPlayIds(this.adjustConfig)) {
                this.logger.warn("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
            } else {
                this.logger.info("Cannot read Google Play Services Advertising ID with COPPA or play store kids app enabled", new Object[0]);
            }
            if (this.deviceInfo.androidId == null) {
                if (Util.canReadNonPlayIds(this.adjustConfig)) {
                    this.logger.error("Unable to get any Device IDs. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
                } else {
                    this.logger.info("Cannot read non Play IDs with COPPA or play store kids app enabled", new Object[0]);
                }
            }
        } else {
            this.logger.info("Google Play Services Advertising ID read correctly at start time", new Object[0]);
        }
        String str = this.adjustConfig.defaultTracker;
        if (str != null) {
            this.logger.info("Default tracker: '%s'", str);
        }
        String str2 = this.adjustConfig.pushToken;
        if (str2 != null) {
            this.logger.info("Push token: '%s'", str2);
            if (this.activityState != null) {
                setPushToken(this.adjustConfig.pushToken, false);
            } else {
                SharedPreferencesManager.getDefaultInstance(getContext()).savePushToken(this.adjustConfig.pushToken);
            }
        } else if (this.activityState != null && (pushToken = SharedPreferencesManager.getDefaultInstance(getContext()).getPushToken()) != null) {
            setPushToken(pushToken, true);
        }
        if (this.cachedDeeplinkResolutionCallback == null) {
            this.cachedDeeplinkResolutionCallback = this.adjustConfig.cachedDeeplinkResolutionCallback;
        }
        handleAdidCallbackI();
        handleAttributionCallbackI();
        if (this.activityState != null && SharedPreferencesManager.getDefaultInstance(getContext()).getGdprForgetMe()) {
            gdprForgetMe();
        }
        this.foregroundTimer = new TimerCycle(new RunnableC3124p(), FOREGROUND_TIMER_START, FOREGROUND_TIMER_INTERVAL, FOREGROUND_TIMER_NAME);
        if (this.adjustConfig.isSendingInBackgroundEnabled) {
            this.logger.info("Send in background configured", new Object[0]);
            this.backgroundTimer = new TimerOnce(new RunnableC3125q(), BACKGROUND_TIMER_NAME);
        }
        AdjustConfig adjustConfig2 = this.adjustConfig;
        this.packageHandler = AdjustFactory.getPackageHandler(this, this.adjustConfig.context, toSendI(false), new ActivityPackageSender(adjustConfig2.urlStrategyDomains, adjustConfig2.useSubdomains, adjustConfig2.basePath, adjustConfig2.gdprPath, adjustConfig2.subscriptionPath, adjustConfig2.purchaseVerificationPath, this.deviceInfo.clientSdk, 60000, adjustConfig2.context));
        AdjustConfig adjustConfig3 = this.adjustConfig;
        this.attributionHandler = AdjustFactory.getAttributionHandler(this, toSendI(false), new ActivityPackageSender(adjustConfig3.urlStrategyDomains, adjustConfig3.useSubdomains, adjustConfig3.basePath, adjustConfig3.gdprPath, adjustConfig3.subscriptionPath, adjustConfig3.purchaseVerificationPath, this.deviceInfo.clientSdk, 60000, adjustConfig3.context));
        AdjustConfig adjustConfig4 = this.adjustConfig;
        this.sdkClickHandler = AdjustFactory.getSdkClickHandler(this, toSendI(true), new ActivityPackageSender(adjustConfig4.urlStrategyDomains, adjustConfig4.useSubdomains, adjustConfig4.basePath, adjustConfig4.gdprPath, adjustConfig4.subscriptionPath, adjustConfig4.purchaseVerificationPath, this.deviceInfo.clientSdk, 60000, adjustConfig4.context));
        AdjustConfig adjustConfig5 = this.adjustConfig;
        this.purchaseVerificationHandler = AdjustFactory.getPurchaseVerificationHandler(this, toSendI(true), new ActivityPackageSender(adjustConfig5.urlStrategyDomains, adjustConfig5.useSubdomains, adjustConfig5.basePath, adjustConfig5.gdprPath, adjustConfig5.subscriptionPath, adjustConfig5.purchaseVerificationPath, this.deviceInfo.clientSdk, Constants.CONNECTION_TIMEOUT_VERIFY, adjustConfig5.context));
        this.installReferrer = new InstallReferrer(this.adjustConfig.context, new C3126r());
        preLaunchActionsI(this.adjustConfig.preLaunchActions.preLaunchActionsArray);
        sendReftagReferrerI();
        bootstrapLifecycleI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean isEnabled() {
        return isEnabledI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchAttributionResponseTasks(AttributionResponseData attributionResponseData) {
        this.executor.submit(new RunnableC3110b(attributionResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchEventResponseTasks(EventResponseData eventResponseData) {
        this.executor.submit(new T(eventResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchPurchaseVerificationResponseTasks(PurchaseVerificationResponseData purchaseVerificationResponseData) {
        this.executor.submit(new RunnableC3111c(purchaseVerificationResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSdkClickResponseTasks(SdkClickResponseData sdkClickResponseData) {
        this.executor.submit(new U(sdkClickResponseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSessionResponseTasks(SessionResponseData sessionResponseData) {
        this.executor.submit(new RunnableC3109a(sessionResponseData));
    }

    @Override // com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback
    public void onActivityLifecycle(final boolean z10) {
        try {
            this.executor.submit(new Runnable() { // from class: com.adjust.sdk.N
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityHandler activityHandler = this.f34056a;
                    activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityHandler.k(activityHandler, z);
                        }
                    }, "activity state");
                }
            });
        } catch (Exception unused) {
            ILogger iLogger = this.logger;
            if (iLogger != null) {
                iLogger.error("Exception while executing onActivityLifecycle task", new Object[0]);
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onPause() {
        onActivityLifecycle(false);
    }

    public void onPauseI() {
        stopForegroundTimerI();
        startBackgroundTimerI();
        this.logger.verbose("Subsession end", new Object[0]);
        endI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onResume() {
        onActivityLifecycle(true);
    }

    public void onResumeI() {
        stopBackgroundTimerI();
        startForegroundTimerI();
        this.logger.verbose("Subsession start", new Object[0]);
        startI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processAndResolveDeeplink(final AdjustDeeplink adjustDeeplink, final long j10, OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        this.cachedDeeplinkResolutionCallback = onDeeplinkResolvedListener;
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.Y
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34113a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34053a.processDeeplinkI(adjustDeeplink, j);
                    }
                }, "process and resolve deep link");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processDeeplink(final AdjustDeeplink adjustDeeplink, final long j10) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.y
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34199a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34049a.processDeeplinkI(adjustDeeplink, j);
                    }
                }, "process deep link");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processRemoteTriggers(ResponseData responseData) {
        this.executor.submit(new RunnableC3112d(responseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalCallbackParameter(final String str) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f34107a.firstSessionDelayManager.b("remove global callback parameter", new IRunActivityHandler() { // from class: com.adjust.sdk.P
                    @Override // com.adjust.sdk.IRunActivityHandler
                    public final void run(ActivityHandler activityHandler) {
                        activityHandler.removeGlobalCallbackParameterI(str);
                    }
                });
            }
        });
    }

    public void removeGlobalCallbackParameterI(String str) {
        if (Util.isValidParameter(str, SubscriberAttributeKt.JSON_NAME_KEY, "Session Callback")) {
            Map<String, String> map = this.globalParameters.callbackParameters;
            if (map == null) {
                this.logger.warn("Session Callback parameters are not set", new Object[0]);
            } else if (map.remove(str) == null) {
                this.logger.warn("Key %s does not exist", str);
            } else {
                this.logger.debug("Key %s will be removed", str);
                writeGlobalCallbackParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalCallbackParameters() {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.G
            @Override // java.lang.Runnable
            public final void run() {
                this.f34033a.firstSessionDelayManager.b("remove global callback parameters", new IRunActivityHandler() { // from class: com.adjust.sdk.c
                    @Override // com.adjust.sdk.IRunActivityHandler
                    public final void run(ActivityHandler activityHandler) {
                        activityHandler.removeGlobalCallbackParametersI();
                    }
                });
            }
        });
    }

    public void removeGlobalCallbackParametersI() {
        if (this.globalParameters.callbackParameters == null) {
            this.logger.warn("Session Callback parameters are not set", new Object[0]);
        }
        this.globalParameters.callbackParameters = null;
        writeGlobalCallbackParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalPartnerParameter(final String str) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.S
            @Override // java.lang.Runnable
            public final void run() {
                this.f34085a.firstSessionDelayManager.b("remove global partner parameter", new IRunActivityHandler() { // from class: com.adjust.sdk.g
                    @Override // com.adjust.sdk.IRunActivityHandler
                    public final void run(ActivityHandler activityHandler) {
                        activityHandler.removeGlobalPartnerParameterI(str);
                    }
                });
            }
        });
    }

    public void removeGlobalPartnerParameterI(String str) {
        if (Util.isValidParameter(str, SubscriberAttributeKt.JSON_NAME_KEY, "Session Partner")) {
            Map<String, String> map = this.globalParameters.partnerParameters;
            if (map == null) {
                this.logger.warn("Session Partner parameters are not set", new Object[0]);
            } else if (map.remove(str) == null) {
                this.logger.warn("Key %s does not exist", str);
            } else {
                this.logger.debug("Key %s will be removed", str);
                writeGlobalPartnerParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalPartnerParameters() {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f34149a.firstSessionDelayManager.b("remove global partner parameters", new IRunActivityHandler() { // from class: com.adjust.sdk.k
                    @Override // com.adjust.sdk.IRunActivityHandler
                    public final void run(ActivityHandler activityHandler) {
                        activityHandler.removeGlobalPartnerParametersI();
                    }
                });
            }
        });
    }

    public void removeGlobalPartnerParametersI() {
        if (this.globalParameters.partnerParameters == null) {
            this.logger.warn("Session Partner parameters are not set", new Object[0]);
        }
        this.globalParameters.partnerParameters = null;
        writeGlobalPartnerParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendInstallReferrer(ReferrerDetails referrerDetails, String str) {
        this.executor.submit(new R(referrerDetails, str));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendLicenseVerificationData(LicenseData licenseData) {
        this.executor.submit(new S(licenseData));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendPreinstallReferrer() {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.a
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34119a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        activityHandler.sendPreinstallReferrerI();
                    }
                }, "send preinstall referrer");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendReftagReferrer() {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.x
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34198a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34109a.sendReftagReferrerI();
                    }
                }, "send referrer");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setAskingAttribution(boolean z10) {
        this.executor.submit(new Q(z10));
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setCoppaComplianceInDelay(final boolean z10) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.m
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler.n(this.f34150a, z10);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setEnabled(final boolean z10) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.w
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34196a;
                boolean z11 = z10;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34028a.setEnabledI(z11);
                    }
                }, z11 ? "enable" : "disable");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setExternalDeviceIdInDelay(final String str) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.h
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler.o(this.f34138a, str);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setOfflineMode(final boolean z10) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.t
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34192a;
                boolean z11 = z10;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34162a.setOfflineModeI(z11);
                    }
                }, z11 ? "put SDK in offline mode" : "put SDK back to online mode");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setPlayStoreKidsComplianceInDelay(final boolean z10) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.B
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler.R(this.f34022a, z10);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setPushToken(final String str, final boolean z10) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.F
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34030a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityHandler.M(activityHandler, z, str);
                    }
                }, "set push token");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void teardown() {
        TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        TimerCycle timerCycle = this.foregroundTimer;
        if (timerCycle != null) {
            timerCycle.teardown();
        }
        ThreadExecutor threadExecutor = this.executor;
        if (threadExecutor != null) {
            threadExecutor.teardown();
        }
        IPackageHandler iPackageHandler = this.packageHandler;
        if (iPackageHandler != null) {
            iPackageHandler.teardown();
        }
        IAttributionHandler iAttributionHandler = this.attributionHandler;
        if (iAttributionHandler != null) {
            iAttributionHandler.teardown();
        }
        ISdkClickHandler iSdkClickHandler = this.sdkClickHandler;
        if (iSdkClickHandler != null) {
            iSdkClickHandler.teardown();
        }
        IPurchaseVerificationHandler iPurchaseVerificationHandler = this.purchaseVerificationHandler;
        if (iPurchaseVerificationHandler != null) {
            iPurchaseVerificationHandler.teardown();
        }
        GlobalParameters globalParameters = this.globalParameters;
        if (globalParameters != null) {
            Map<String, String> map = globalParameters.callbackParameters;
            if (map != null) {
                map.clear();
            }
            Map<String, String> map2 = this.globalParameters.partnerParameters;
            if (map2 != null) {
                map2.clear();
            }
        }
        teardownActivityStateS();
        teardownAttributionS();
        teardownAllGlobalParametersS();
        teardownEventMetadataS();
        this.packageHandler = null;
        this.logger = null;
        this.foregroundTimer = null;
        this.executor = null;
        this.backgroundTimer = null;
        this.internalState = null;
        this.deviceInfo = null;
        this.adjustConfig = null;
        this.attributionHandler = null;
        this.sdkClickHandler = null;
        this.purchaseVerificationHandler = null;
        this.globalParameters = null;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackAdRevenue(final AdjustAdRevenue adjustAdRevenue) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.e
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34129a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.U
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34099a.trackAdRevenueI(adjustAdRevenue);
                    }
                }, "track ad revenue");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackEvent(final AdjustEvent adjustEvent) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.I
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34041a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityHandler.v(activityHandler, adjustEvent);
                    }
                }, "track event");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackMeasurementConsent(final boolean z10) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f34126a.firstSessionDelayManager.b("track measurement consent", new IRunActivityHandler() { // from class: com.adjust.sdk.C
                    @Override // com.adjust.sdk.IRunActivityHandler
                    public final void run(ActivityHandler activityHandler) {
                        activityHandler.tryTrackMeasurementConsentI(z);
                    }
                });
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackPlayStoreSubscription(final AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.o
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34160a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34142a.trackPlayStoreSubscriptionI(adjustPlayStoreSubscription);
                    }
                }, "track play store subscription");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackThirdPartySharing(final AdjustThirdPartySharing adjustThirdPartySharing) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f34202a.firstSessionDelayManager.b("track third party sharing", new IRunActivityHandler() { // from class: com.adjust.sdk.v
                    @Override // com.adjust.sdk.IRunActivityHandler
                    public final void run(ActivityHandler activityHandler) {
                        activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                    }
                });
            }
        });
    }

    public void tryTrackMeasurementConsentI(boolean z10) {
        if (canTrackMeasurementConsentI()) {
            trackMeasurementConsentI(z10);
        } else {
            this.cachedLastMeasurementConsentTrack = Boolean.valueOf(z10);
        }
    }

    public void tryTrackThirdPartySharingI(AdjustThirdPartySharing adjustThirdPartySharing) {
        if (canTrackThirdPartySharingI()) {
            trackThirdPartySharingI(adjustThirdPartySharing);
            return;
        }
        if (this.cachedAdjustThirdPartySharingArray == null) {
            this.cachedAdjustThirdPartySharingArray = new ArrayList();
        }
        this.cachedAdjustThirdPartySharingArray.add(adjustThirdPartySharing);
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean updateAttributionI(AdjustAttribution adjustAttribution) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (adjustAttribution == null || this.activityState.askingAttribution) {
            return false;
        }
        synchronized (this.cachedAttributionReadCallbacks) {
            try {
                arrayList = null;
                if (this.cachedAttributionReadCallbacks.isEmpty()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(this.cachedAttributionReadCallbacks);
                    this.cachedAttributionReadCallbacks.clear();
                }
            } finally {
            }
        }
        if (arrayList2 != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new G(arrayList2, adjustAttribution));
        }
        synchronized (this.cachedAttributionReadTimeoutCallbacks) {
            try {
                if (!this.cachedAttributionReadTimeoutCallbacks.isEmpty()) {
                    arrayList = new ArrayList(this.cachedAttributionReadTimeoutCallbacks);
                    this.cachedAttributionReadTimeoutCallbacks.clear();
                }
            } finally {
            }
        }
        if (arrayList != null) {
            new Handler(this.adjustConfig.context.getMainLooper()).post(new P(arrayList, adjustAttribution));
        }
        if (adjustAttribution.equals(this.attribution)) {
            return false;
        }
        this.attribution = adjustAttribution;
        writeAttributionI();
        return true;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void verifyAndTrackPlayStorePurchase(final AdjustEvent adjustEvent, final OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.O
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34058a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34038a.verifyAndTrackPlayStorePurchaseI(adjustEvent, onPurchaseVerificationFinishedListener);
                    }
                }, "verify and track play store purchase");
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void verifyPlayStorePurchase(final AdjustPlayStorePurchase adjustPlayStorePurchase, final OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.T
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34096a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        activityHandler.verifyPlayStorePurchaseI(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
                    }
                }, "verify play store purchase");
            }
        });
    }

    private void checkAfterNewStartI(SharedPreferencesManager sharedPreferencesManager) {
        String pushToken = sharedPreferencesManager.getPushToken();
        if (pushToken != null && !pushToken.equals(this.activityState.pushToken)) {
            setPushToken(pushToken, true);
        }
        if (sharedPreferencesManager.getRawReferrerArray() != null) {
            sendReftagReferrer();
        }
        checkForPreinstallI();
        this.installReferrer.startConnection();
        readInstallReferrerMeta();
        readInstallReferrerHuaweiAds();
        readInstallReferrerHuaweiAppGallery();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
        readLicenseVerificationData();
    }

    private boolean pausedI(boolean z10) {
        return z10 ? this.internalState.isOffline() || !isEnabledI() : this.internalState.isOffline() || !isEnabledI();
    }

    private boolean toSendI(boolean z10) {
        if (pausedI(z10)) {
            return false;
        }
        if (this.adjustConfig.isSendingInBackgroundEnabled) {
            return true;
        }
        return this.internalState.isInForeground();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void isEnabled(final OnIsEnabledListener onIsEnabledListener) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.q
            @Override // java.lang.Runnable
            public final void run() {
                ActivityHandler activityHandler = this.f34164a;
                activityHandler.firstSessionDelayManager.a(new Runnable() { // from class: com.adjust.sdk.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityHandler.f(this.f34082a, onIsEnabledListener);
                    }
                }, "is SDK enabled");
            }
        });
    }
}
