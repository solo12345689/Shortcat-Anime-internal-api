package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3580t0 extends O implements InterfaceC3598v0 {
    C3580t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeLong(j10);
        H3(23, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        Q.c(parcelG3, bundle);
        H3(9, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeLong(j10);
        H3(24, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void generateEventId(InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        Q.d(parcelG3, interfaceC3623y0);
        H3(22, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void getAppInstanceId(InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        Q.d(parcelG3, interfaceC3623y0);
        H3(20, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void getCachedAppInstanceId(InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        Q.d(parcelG3, interfaceC3623y0);
        H3(19, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        Q.d(parcelG3, interfaceC3623y0);
        H3(10, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void getCurrentScreenClass(InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        Q.d(parcelG3, interfaceC3623y0);
        H3(17, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void getCurrentScreenName(InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        Q.d(parcelG3, interfaceC3623y0);
        H3(16, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void getGmpAppId(InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        Q.d(parcelG3, interfaceC3623y0);
        H3(21, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void getMaxUserProperties(String str, InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        Q.d(parcelG3, interfaceC3623y0);
        H3(6, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void getSessionId(InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        Q.d(parcelG3, interfaceC3623y0);
        H3(46, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC3623y0 interfaceC3623y0) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        int i10 = Q.f39546b;
        parcelG3.writeInt(z10 ? 1 : 0);
        Q.d(parcelG3, interfaceC3623y0);
        H3(5, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void initialize(Y8.a aVar, H0 h02, long j10) {
        Parcel parcelG3 = G3();
        Q.d(parcelG3, aVar);
        Q.c(parcelG3, h02);
        parcelG3.writeLong(j10);
        H3(1, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        Q.c(parcelG3, bundle);
        parcelG3.writeInt(z10 ? 1 : 0);
        parcelG3.writeInt(z11 ? 1 : 0);
        parcelG3.writeLong(j10);
        H3(2, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void logHealthData(int i10, String str, Y8.a aVar, Y8.a aVar2, Y8.a aVar3) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(5);
        parcelG3.writeString(str);
        Q.d(parcelG3, aVar);
        Q.d(parcelG3, aVar2);
        Q.d(parcelG3, aVar3);
        H3(33, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void onActivityCreatedByScionActivityInfo(J0 j02, Bundle bundle, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, j02);
        Q.c(parcelG3, bundle);
        parcelG3.writeLong(j10);
        H3(53, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void onActivityDestroyedByScionActivityInfo(J0 j02, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, j02);
        parcelG3.writeLong(j10);
        H3(54, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void onActivityPausedByScionActivityInfo(J0 j02, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, j02);
        parcelG3.writeLong(j10);
        H3(55, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void onActivityResumedByScionActivityInfo(J0 j02, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, j02);
        parcelG3.writeLong(j10);
        H3(56, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void onActivitySaveInstanceStateByScionActivityInfo(J0 j02, InterfaceC3623y0 interfaceC3623y0, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, j02);
        Q.d(parcelG3, interfaceC3623y0);
        parcelG3.writeLong(j10);
        H3(57, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void onActivityStartedByScionActivityInfo(J0 j02, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, j02);
        parcelG3.writeLong(j10);
        H3(51, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void onActivityStoppedByScionActivityInfo(J0 j02, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, j02);
        parcelG3.writeLong(j10);
        H3(52, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void resetAnalyticsData(long j10) {
        Parcel parcelG3 = G3();
        parcelG3.writeLong(j10);
        H3(12, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void retrieveAndUploadBatches(B0 b02) {
        Parcel parcelG3 = G3();
        Q.d(parcelG3, b02);
        H3(58, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, bundle);
        parcelG3.writeLong(j10);
        H3(8, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, bundle);
        parcelG3.writeLong(j10);
        H3(45, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void setCurrentScreenByScionActivityInfo(J0 j02, String str, String str2, long j10) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, j02);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        parcelG3.writeLong(j10);
        H3(50, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelG3 = G3();
        int i10 = Q.f39546b;
        parcelG3.writeInt(z10 ? 1 : 0);
        H3(39, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, bundle);
        H3(42, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel parcelG3 = G3();
        int i10 = Q.f39546b;
        parcelG3.writeInt(z10 ? 1 : 0);
        parcelG3.writeLong(j10);
        H3(11, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void setSessionTimeoutDuration(long j10) {
        Parcel parcelG3 = G3();
        parcelG3.writeLong(j10);
        H3(14, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void setUserId(String str, long j10) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeLong(j10);
        H3(7, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public final void setUserProperty(String str, String str2, Y8.a aVar, boolean z10, long j10) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        Q.d(parcelG3, aVar);
        parcelG3.writeInt(z10 ? 1 : 0);
        parcelG3.writeLong(j10);
        H3(4, parcelG3);
    }
}
