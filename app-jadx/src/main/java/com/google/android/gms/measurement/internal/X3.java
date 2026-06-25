package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class X3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f41045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41046b;

    X3(C3937x4 c3937x4, Bundle bundle) {
        this.f41045a = bundle;
        Objects.requireNonNull(c3937x4);
        this.f41046b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3937x4 c3937x4 = this.f41046b;
        c3937x4.h();
        c3937x4.j();
        Bundle bundle = this.f41045a;
        AbstractC2115p.l(bundle);
        String strF = AbstractC2115p.f(bundle.getString("name"));
        if (!c3937x4.f40611a.g()) {
            c3937x4.f40611a.a().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c3937x4.f40611a.J().d0(new C3826i(bundle.getString("app_id"), "", new v6(strF, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean(AppStateModule.APP_STATE_ACTIVE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c3937x4.f40611a.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
