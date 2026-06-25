package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SdkClickHandler implements ISdkClickHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final String SCHEDULED_EXECUTOR_SOURCE = "SdkClickHandler";
    private static final String SOURCE_INSTALL_REFERRER = "install_referrer";
    private static final String SOURCE_REFTAG = "reftag";
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    private BackoffStrategy backoffStrategy;
    private long lastPackageRetryInMilli = 0;
    private ILogger logger;
    private List<ActivityPackage> packageQueue;
    private boolean paused;
    private ThreadScheduler scheduler;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f34087a;

        public a(ActivityPackage activityPackage) {
            this.f34087a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SdkClickHandler.this.packageQueue.add(this.f34087a);
            SdkClickHandler.this.logger.debug("Added sdk_click %d", Integer.valueOf(SdkClickHandler.this.packageQueue.size()));
            SdkClickHandler.this.logger.verbose("%s", this.f34087a.getExtendedString());
            SdkClickHandler.this.sendNextSdkClick();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IActivityHandler iActivityHandler = (IActivityHandler) SdkClickHandler.this.activityHandlerWeakRef.get();
            SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
            try {
                JSONArray rawReferrerArray = defaultInstance.getRawReferrerArray();
                boolean z10 = false;
                for (int i10 = 0; i10 < rawReferrerArray.length(); i10++) {
                    JSONArray jSONArray = rawReferrerArray.getJSONArray(i10);
                    if (jSONArray.optInt(2, -1) == 0) {
                        String strOptString = jSONArray.optString(0, null);
                        z10 = true;
                        long jOptLong = jSONArray.optLong(1, -1L);
                        jSONArray.put(2, 1);
                        SdkClickHandler.this.sendSdkClick(PackageFactory.buildReftagSdkClickPackage(strOptString, jOptLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager(), iActivityHandler.getInternalState()));
                    }
                }
                if (z10) {
                    defaultInstance.saveRawReferrerArray(rawReferrerArray);
                }
            } catch (JSONException e10) {
                SdkClickHandler.this.logger.error("Send saved raw referrers error (%s)", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f34091b;

        public c(String str, String str2) {
            this.f34090a = str;
            this.f34091b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IActivityHandler iActivityHandler = (IActivityHandler) SdkClickHandler.this.activityHandlerWeakRef.get();
            if (iActivityHandler == null) {
                return;
            }
            SdkClickHandler.this.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage(this.f34090a, this.f34091b, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SdkClickHandler.this.sendNextSdkClickI();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f34094a;

        public e(ActivityPackage activityPackage) {
            this.f34094a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SdkClickHandler.this.sendSdkClickI(this.f34094a);
            SdkClickHandler.this.sendNextSdkClick();
        }
    }

    public SdkClickHandler(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z10, iActivityPackageSender);
        this.logger = AdjustFactory.getLogger();
        this.backoffStrategy = AdjustFactory.getSdkClickBackoffStrategy();
        this.scheduler = new SingleThreadCachedScheduler(SCHEDULED_EXECUTOR_SOURCE);
    }

    private Map<String, String> generateSendingParametersI() {
        HashMap map = new HashMap();
        int size = this.packageQueue.size() - 1;
        if (size > 0) {
            PackageBuilder.addLong(map, "queue_size", size);
        }
        return map;
    }

    private void logErrorMessageI(ActivityPackage activityPackage, String str, Throwable th2) {
        this.logger.error(Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th2)), new Object[0]);
    }

    private void retrySendingI(ActivityPackage activityPackage, Long l10) {
        if (l10 == null || l10.longValue() <= 0) {
            this.logger.error("Retrying sdk_click package for the %d time", Integer.valueOf(activityPackage.increaseRetries()));
        } else {
            this.lastPackageRetryInMilli = l10.longValue();
        }
        sendSdkClick(activityPackage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClick() {
        this.scheduler.submit(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClickI() {
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() == null || iActivityHandler.getActivityState().isGdprForgotten || this.paused || this.packageQueue.isEmpty()) {
            return;
        }
        ActivityPackage activityPackageRemove = this.packageQueue.remove(0);
        int retries = activityPackageRemove.getRetries();
        e eVar = new e(activityPackageRemove);
        long jWaitTime = waitTime(retries);
        if (jWaitTime > 0) {
            this.scheduler.schedule(eVar, jWaitTime);
        } else {
            eVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSdkClickI(ActivityPackage activityPackage) {
        long clickTimeInSeconds;
        String str;
        IActivityHandler iActivityHandler;
        boolean z10;
        boolean z11;
        long j10;
        long installBeginTimeInSeconds;
        long clickTimeServerInSeconds;
        Boolean bool;
        Boolean bool2;
        String str2;
        String str3;
        Boolean bool3;
        long j11;
        String str4;
        IActivityHandler iActivityHandler2 = this.activityHandlerWeakRef.get();
        String str5 = activityPackage.getParameters().get("source");
        boolean z12 = str5 != null && str5.equals("reftag");
        String str6 = activityPackage.getParameters().get("raw_referrer");
        if (z12 && SharedPreferencesManager.getDefaultInstance(iActivityHandler2.getContext()).getRawReferrer(str6, activityPackage.getClickTimeInMilliseconds()) == null) {
            return;
        }
        boolean z13 = str5 != null && str5.equals("install_referrer");
        if (z13) {
            clickTimeInSeconds = activityPackage.getClickTimeInSeconds();
            installBeginTimeInSeconds = activityPackage.getInstallBeginTimeInSeconds();
            str = activityPackage.getParameters().get(Constants.REFERRER);
            clickTimeServerInSeconds = activityPackage.getClickTimeServerInSeconds();
            long installBeginTimeServerInSeconds = activityPackage.getInstallBeginTimeServerInSeconds();
            String installVersion = activityPackage.getInstallVersion();
            Boolean googlePlayInstant = activityPackage.getGooglePlayInstant();
            Boolean isClick = activityPackage.getIsClick();
            z10 = z12;
            j10 = installBeginTimeServerInSeconds;
            z11 = z13;
            str2 = installVersion;
            iActivityHandler = iActivityHandler2;
            bool = googlePlayInstant;
            str3 = activityPackage.getParameters().get("referrer_api");
            bool2 = isClick;
        } else {
            clickTimeInSeconds = -1;
            str = null;
            iActivityHandler = iActivityHandler2;
            z10 = z12;
            z11 = z13;
            j10 = -1;
            installBeginTimeInSeconds = -1;
            clickTimeServerInSeconds = -1;
            bool = null;
            bool2 = null;
            str2 = null;
            str3 = null;
        }
        Boolean bool4 = bool2;
        boolean z14 = str5 != null && str5.equals(Constants.PREINSTALL);
        boolean z15 = str5 != null && str5.equals(Constants.LICENSE_VERIFICATION);
        ResponseData responseDataSendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, generateSendingParametersI());
        if (responseDataSendActivityPackageSync instanceof SdkClickResponseData) {
            SdkClickResponseData sdkClickResponseData = (SdkClickResponseData) responseDataSendActivityPackageSync;
            if (sdkClickResponseData.willRetry) {
                retrySendingI(activityPackage, sdkClickResponseData.retryIn);
                return;
            }
            Boolean bool5 = bool;
            this.lastPackageRetryInMilli = 0L;
            if (iActivityHandler == null) {
                return;
            }
            if (sdkClickResponseData.trackingState == TrackingState.OPTED_OUT) {
                iActivityHandler.gotOptOutResponse();
                return;
            }
            if (z10) {
                bool3 = bool5;
                j11 = j10;
                SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).removeRawReferrer(str6, activityPackage.getClickTimeInMilliseconds());
            } else {
                bool3 = bool5;
                j11 = j10;
            }
            if (z11) {
                sdkClickResponseData.clickTime = clickTimeInSeconds;
                sdkClickResponseData.installBegin = installBeginTimeInSeconds;
                sdkClickResponseData.installReferrer = str;
                sdkClickResponseData.clickTimeServer = clickTimeServerInSeconds;
                sdkClickResponseData.installBeginServer = j11;
                sdkClickResponseData.installVersion = str2;
                sdkClickResponseData.googlePlayInstant = bool3;
                sdkClickResponseData.isClick = bool4;
                sdkClickResponseData.referrerApi = str3;
                sdkClickResponseData.isInstallReferrer = true;
            }
            if (z14 && (str4 = activityPackage.getParameters().get("found_location")) != null && !str4.isEmpty()) {
                SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
                if (Constants.SYSTEM_INSTALLER_REFERRER.equalsIgnoreCase(str4)) {
                    defaultInstance.removePreinstallReferrer();
                } else {
                    defaultInstance.setPreinstallPayloadReadStatus(PreinstallUtil.markAsRead(str4, defaultInstance.getPreinstallPayloadReadStatus()));
                }
            }
            if (z15) {
                SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).setLicenseVerificationTracked();
            }
            iActivityHandler.finishedTrackingActivity(sdkClickResponseData);
        }
    }

    private long waitTime(int i10) {
        long j10 = this.lastPackageRetryInMilli;
        if (j10 > 0) {
            return j10;
        }
        if (i10 <= 0) {
            return 0L;
        }
        long waitingTime = Util.getWaitingTime(i10, this.backoffStrategy);
        this.logger.verbose("Waiting for %s seconds before retrying sdk_click for the %d time", Util.SecondsDisplayFormat.format(waitingTime / MILLISECONDS_TO_SECONDS_DIVISOR), Integer.valueOf(i10));
        return waitingTime;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void init(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        this.paused = !z10;
        this.packageQueue = new ArrayList();
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void resumeSending() {
        this.paused = false;
        sendNextSdkClick();
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendPreinstallPayload(String str, String str2) {
        this.scheduler.submit(new c(str, str2));
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendReftagReferrers() {
        this.scheduler.submit(new b());
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendSdkClick(ActivityPackage activityPackage) {
        this.scheduler.submit(new a(activityPackage));
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void teardown() {
        this.logger.verbose("SdkClickHandler teardown", new Object[0]);
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.logger = null;
        this.packageQueue = null;
        this.backoffStrategy = null;
        this.scheduler = null;
    }
}
