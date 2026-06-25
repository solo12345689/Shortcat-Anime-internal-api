package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3555q1 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Bundle f39939e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ Activity f39940f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ C3624y1 f39941g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3555q1(C3624y1 c3624y1, Bundle bundle, Activity activity) {
        super(c3624y1.f40109a, true);
        this.f39939e = bundle;
        this.f39940f = activity;
        Objects.requireNonNull(c3624y1);
        this.f39941g = c3624y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    final void a() {
        Bundle bundle;
        Bundle bundle2 = this.f39939e;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        InterfaceC3598v0 interfaceC3598v0 = (InterfaceC3598v0) AbstractC2115p.l(this.f39941g.f40109a.n());
        Activity activity = this.f39940f;
        interfaceC3598v0.onActivityCreatedByScionActivityInfo(J0.c(activity), bundle, this.f39922b);
    }
}
