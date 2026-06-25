package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class W3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f41007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41008b;

    W3(C3937x4 c3937x4, Bundle bundle) {
        this.f41007a = bundle;
        Objects.requireNonNull(c3937x4);
        this.f41008b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3937x4 c3937x4 = this.f41008b;
        c3937x4.h();
        c3937x4.j();
        Bundle bundle = this.f41007a;
        AbstractC2115p.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC2115p.f(string);
        AbstractC2115p.f(string2);
        AbstractC2115p.l(bundle.get("value"));
        if (!c3937x4.f40611a.g()) {
            c3937x4.f40611a.a().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        v6 v6Var = new v6(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            X2 x22 = c3937x4.f40611a;
            G gR = x22.C().R(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c3937x4.f40611a.J().d0(new C3826i(bundle.getString("app_id"), string2, v6Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), x22.C().R(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), gR, bundle.getLong("time_to_live"), x22.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
