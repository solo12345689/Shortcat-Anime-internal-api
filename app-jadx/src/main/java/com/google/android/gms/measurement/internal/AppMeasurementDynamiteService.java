package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractBinderC3589u0;
import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import j9.InterfaceC5343A;
import java.util.Map;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC3589u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    X2 f40623a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f40624b = new C6551a();

    private final void G3() {
        if (this.f40623a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void H3(InterfaceC3623y0 interfaceC3623y0, String str) {
        G3();
        this.f40623a.C().a0(interfaceC3623y0, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void beginAdUnitExposure(String str, long j10) {
        G3();
        this.f40623a.M().i(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        G3();
        this.f40623a.B().O(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void clearMeasurementEnabled(long j10) {
        G3();
        this.f40623a.B().n0(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void endAdUnitExposure(String str, long j10) {
        G3();
        this.f40623a.M().j(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void generateEventId(InterfaceC3623y0 interfaceC3623y0) {
        G3();
        long jP0 = this.f40623a.C().p0();
        G3();
        this.f40623a.C().b0(interfaceC3623y0, jP0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getAppInstanceId(InterfaceC3623y0 interfaceC3623y0) {
        G3();
        this.f40623a.b().t(new U2(this, interfaceC3623y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getCachedAppInstanceId(InterfaceC3623y0 interfaceC3623y0) {
        G3();
        H3(interfaceC3623y0, this.f40623a.B().D());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getConditionalUserProperties(String str, String str2, InterfaceC3623y0 interfaceC3623y0) {
        G3();
        this.f40623a.b().t(new K4(this, interfaceC3623y0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getCurrentScreenClass(InterfaceC3623y0 interfaceC3623y0) {
        G3();
        H3(interfaceC3623y0, this.f40623a.B().R());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getCurrentScreenName(InterfaceC3623y0 interfaceC3623y0) {
        G3();
        H3(interfaceC3623y0, this.f40623a.B().Q());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getGmpAppId(InterfaceC3623y0 interfaceC3623y0) {
        G3();
        H3(interfaceC3623y0, this.f40623a.B().S());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getMaxUserProperties(String str, InterfaceC3623y0 interfaceC3623y0) {
        G3();
        this.f40623a.B().L(str);
        G3();
        this.f40623a.C().c0(interfaceC3623y0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getSessionId(InterfaceC3623y0 interfaceC3623y0) {
        G3();
        C3937x4 c3937x4B = this.f40623a.B();
        c3937x4B.f40611a.b().t(new RunnableC3767a4(c3937x4B, interfaceC3623y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getTestFlag(InterfaceC3623y0 interfaceC3623y0, int i10) {
        G3();
        if (i10 == 0) {
            this.f40623a.C().a0(interfaceC3623y0, this.f40623a.B().j0());
            return;
        }
        if (i10 == 1) {
            this.f40623a.C().b0(interfaceC3623y0, this.f40623a.B().k0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f40623a.C().c0(interfaceC3623y0, this.f40623a.B().l0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f40623a.C().e0(interfaceC3623y0, this.f40623a.B().i0().booleanValue());
                return;
            }
        }
        z6 z6VarC = this.f40623a.C();
        double dDoubleValue = this.f40623a.B().m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            interfaceC3623y0.f(bundle);
        } catch (RemoteException e10) {
            z6VarC.f40611a.a().r().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void getUserProperties(String str, String str2, boolean z10, InterfaceC3623y0 interfaceC3623y0) {
        G3();
        this.f40623a.b().t(new O3(this, interfaceC3623y0, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void initForTests(Map map) {
        G3();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void initialize(Y8.a aVar, com.google.android.gms.internal.measurement.H0 h02, long j10) {
        X2 x22 = this.f40623a;
        if (x22 == null) {
            this.f40623a = X2.O((Context) AbstractC2115p.l((Context) Y8.b.h(aVar)), h02, Long.valueOf(j10));
        } else {
            x22.a().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void isDataCollectionEnabled(InterfaceC3623y0 interfaceC3623y0) {
        G3();
        this.f40623a.b().t(new RunnableC3848k5(this, interfaceC3623y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        G3();
        this.f40623a.B().q(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC3623y0 interfaceC3623y0, long j10) {
        G3();
        AbstractC2115p.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f40623a.b().t(new RunnableC3922v3(this, interfaceC3623y0, new G(str2, new E(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void logHealthData(int i10, String str, Y8.a aVar, Y8.a aVar2, Y8.a aVar3) {
        G3();
        this.f40623a.a().y(i10, true, false, str, aVar == null ? null : Y8.b.h(aVar), aVar2 == null ? null : Y8.b.h(aVar2), aVar3 != null ? Y8.b.h(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityCreated(Y8.a aVar, Bundle bundle, long j10) {
        G3();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.c((Activity) AbstractC2115p.l((Activity) Y8.b.h(aVar))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle, long j10) {
        G3();
        C3854l4 c3854l4 = this.f40623a.B().f41749c;
        if (c3854l4 != null) {
            this.f40623a.B().h0();
            c3854l4.e(j02, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityDestroyed(Y8.a aVar, long j10) {
        G3();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.c((Activity) AbstractC2115p.l((Activity) Y8.b.h(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        G3();
        C3854l4 c3854l4 = this.f40623a.B().f41749c;
        if (c3854l4 != null) {
            this.f40623a.B().h0();
            c3854l4.b(j02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityPaused(Y8.a aVar, long j10) {
        G3();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.c((Activity) AbstractC2115p.l((Activity) Y8.b.h(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        G3();
        C3854l4 c3854l4 = this.f40623a.B().f41749c;
        if (c3854l4 != null) {
            this.f40623a.B().h0();
            c3854l4.a(j02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityResumed(Y8.a aVar, long j10) {
        G3();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.c((Activity) AbstractC2115p.l((Activity) Y8.b.h(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        G3();
        C3854l4 c3854l4 = this.f40623a.B().f41749c;
        if (c3854l4 != null) {
            this.f40623a.B().h0();
            c3854l4.d(j02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivitySaveInstanceState(Y8.a aVar, InterfaceC3623y0 interfaceC3623y0, long j10) {
        G3();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.J0.c((Activity) AbstractC2115p.l((Activity) Y8.b.h(aVar))), interfaceC3623y0, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, InterfaceC3623y0 interfaceC3623y0, long j10) {
        G3();
        C3854l4 c3854l4 = this.f40623a.B().f41749c;
        Bundle bundle = new Bundle();
        if (c3854l4 != null) {
            this.f40623a.B().h0();
            c3854l4.c(j02, bundle);
        }
        try {
            interfaceC3623y0.f(bundle);
        } catch (RemoteException e10) {
            this.f40623a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityStarted(Y8.a aVar, long j10) {
        G3();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.c((Activity) AbstractC2115p.l((Activity) Y8.b.h(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        G3();
        if (this.f40623a.B().f41749c != null) {
            this.f40623a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityStopped(Y8.a aVar, long j10) {
        G3();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.J0.c((Activity) AbstractC2115p.l((Activity) Y8.b.h(aVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, long j10) {
        G3();
        if (this.f40623a.B().f41749c != null) {
            this.f40623a.B().h0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void performAction(Bundle bundle, InterfaceC3623y0 interfaceC3623y0, long j10) {
        G3();
        interfaceC3623y0.f(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.E0 e02) {
        InterfaceC5343A a62;
        G3();
        Map map = this.f40624b;
        synchronized (map) {
            try {
                a62 = (InterfaceC5343A) map.get(Integer.valueOf(e02.n()));
                if (a62 == null) {
                    a62 = new A6(this, e02);
                    map.put(Integer.valueOf(e02.n()), a62);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f40623a.B().J(a62);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void resetAnalyticsData(long j10) {
        G3();
        this.f40623a.B().G(j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.B0 b02) {
        G3();
        this.f40623a.B().r0(new Runnable() { // from class: com.google.android.gms.measurement.internal.K5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    b02.m();
                } catch (RemoteException e10) {
                    ((X2) AbstractC2115p.l(this.f40836a.f40623a)).a().r().b("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        G3();
        if (bundle == null) {
            this.f40623a.a().o().a("Conditional user property must not be null");
        } else {
            this.f40623a.B().N(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setConsentThirdParty(Bundle bundle, long j10) {
        G3();
        this.f40623a.B().o0(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setCurrentScreen(Y8.a aVar, String str, String str2, long j10) {
        G3();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.J0.c((Activity) AbstractC2115p.l((Activity) Y8.b.h(aVar))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.J0 j02, String str, String str2, long j10) {
        G3();
        this.f40623a.I().t(j02, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setDataCollectionEnabled(boolean z10) {
        G3();
        C3937x4 c3937x4B = this.f40623a.B();
        c3937x4B.j();
        c3937x4B.f40611a.b().t(new M3(c3937x4B, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setDefaultEventParameters(Bundle bundle) {
        G3();
        final C3937x4 c3937x4B = this.f40623a.B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        c3937x4B.f40611a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.t4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c3937x4B.U(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setEventInterceptor(com.google.android.gms.internal.measurement.E0 e02) {
        G3();
        C3841j6 c3841j6 = new C3841j6(this, e02);
        if (this.f40623a.b().p()) {
            this.f40623a.B().I(c3841j6);
        } else {
            this.f40623a.b().t(new RunnableC3868n4(this, c3841j6));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.G0 g02) {
        G3();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setMeasurementEnabled(boolean z10, long j10) {
        G3();
        this.f40623a.B().n0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setMinimumSessionDuration(long j10) {
        G3();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setSessionTimeoutDuration(long j10) {
        G3();
        C3937x4 c3937x4B = this.f40623a.B();
        c3937x4B.f40611a.b().t(new P3(c3937x4B, j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setSgtmDebugInfo(Intent intent) {
        G3();
        C3937x4 c3937x4B = this.f40623a.B();
        Uri data = intent.getData();
        if (data == null) {
            c3937x4B.f40611a.a().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            X2 x22 = c3937x4B.f40611a;
            x22.a().u().a("[sgtm] Preview Mode was not enabled.");
            x22.w().Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            X2 x23 = c3937x4B.f40611a;
            x23.a().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            x23.w().Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setUserId(final String str, long j10) {
        G3();
        final C3937x4 c3937x4B = this.f40623a.B();
        if (str != null && TextUtils.isEmpty(str)) {
            c3937x4B.f40611a.a().r().a("User ID must be non-empty or null");
        } else {
            c3937x4B.f40611a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.u4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    X2 x22 = c3937x4B.f40611a;
                    if (x22.L().x(str)) {
                        x22.L().p();
                    }
                }
            });
            c3937x4B.z(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setUserProperty(String str, String str2, Y8.a aVar, boolean z10, long j10) {
        G3();
        this.f40623a.B().z(str, str2, Y8.b.h(aVar), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.E0 e02) {
        InterfaceC5343A a62;
        G3();
        Map map = this.f40624b;
        synchronized (map) {
            a62 = (InterfaceC5343A) map.remove(Integer.valueOf(e02.n()));
        }
        if (a62 == null) {
            a62 = new A6(this, e02);
        }
        this.f40623a.B().K(a62);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3598v0
    public void setConsent(Bundle bundle, long j10) {
    }
}
