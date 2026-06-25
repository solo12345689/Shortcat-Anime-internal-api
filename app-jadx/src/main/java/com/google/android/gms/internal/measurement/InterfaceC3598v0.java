package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3598v0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(InterfaceC3623y0 interfaceC3623y0);

    void getAppInstanceId(InterfaceC3623y0 interfaceC3623y0);

    void getCachedAppInstanceId(InterfaceC3623y0 interfaceC3623y0);

    void getConditionalUserProperties(String str, String str2, InterfaceC3623y0 interfaceC3623y0);

    void getCurrentScreenClass(InterfaceC3623y0 interfaceC3623y0);

    void getCurrentScreenName(InterfaceC3623y0 interfaceC3623y0);

    void getGmpAppId(InterfaceC3623y0 interfaceC3623y0);

    void getMaxUserProperties(String str, InterfaceC3623y0 interfaceC3623y0);

    void getSessionId(InterfaceC3623y0 interfaceC3623y0);

    void getTestFlag(InterfaceC3623y0 interfaceC3623y0, int i10);

    void getUserProperties(String str, String str2, boolean z10, InterfaceC3623y0 interfaceC3623y0);

    void initForTests(Map map);

    void initialize(Y8.a aVar, H0 h02, long j10);

    void isDataCollectionEnabled(InterfaceC3623y0 interfaceC3623y0);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC3623y0 interfaceC3623y0, long j10);

    void logHealthData(int i10, String str, Y8.a aVar, Y8.a aVar2, Y8.a aVar3);

    void onActivityCreated(Y8.a aVar, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(J0 j02, Bundle bundle, long j10);

    void onActivityDestroyed(Y8.a aVar, long j10);

    void onActivityDestroyedByScionActivityInfo(J0 j02, long j10);

    void onActivityPaused(Y8.a aVar, long j10);

    void onActivityPausedByScionActivityInfo(J0 j02, long j10);

    void onActivityResumed(Y8.a aVar, long j10);

    void onActivityResumedByScionActivityInfo(J0 j02, long j10);

    void onActivitySaveInstanceState(Y8.a aVar, InterfaceC3623y0 interfaceC3623y0, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(J0 j02, InterfaceC3623y0 interfaceC3623y0, long j10);

    void onActivityStarted(Y8.a aVar, long j10);

    void onActivityStartedByScionActivityInfo(J0 j02, long j10);

    void onActivityStopped(Y8.a aVar, long j10);

    void onActivityStoppedByScionActivityInfo(J0 j02, long j10);

    void performAction(Bundle bundle, InterfaceC3623y0 interfaceC3623y0, long j10);

    void registerOnMeasurementEventListener(E0 e02);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(B0 b02);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(Y8.a aVar, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(J0 j02, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(E0 e02);

    void setInstanceIdProvider(G0 g02);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, Y8.a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(E0 e02);
}
