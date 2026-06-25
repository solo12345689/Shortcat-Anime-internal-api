package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class M5 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ N5 f40865a;

    M5(N5 n52) {
        Objects.requireNonNull(n52);
        this.f40865a = n52;
    }

    final void a() {
        N5 n52 = this.f40865a;
        n52.h();
        X2 x22 = n52.f40611a;
        if (x22.x().A(x22.e().a())) {
            x22.x().f40724m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                x22.a().w().a("Detected application was in foreground");
                c(x22.e().a(), false);
            }
        }
    }

    final void b(long j10, boolean z10) {
        N5 n52 = this.f40865a;
        n52.h();
        n52.q();
        X2 x22 = n52.f40611a;
        if (x22.x().A(j10)) {
            x22.x().f40724m.b(true);
            n52.f40611a.L().p();
        }
        x22.x().f40728q.b(j10);
        if (x22.x().f40724m.a()) {
            c(j10, z10);
        }
    }

    final void c(long j10, boolean z10) {
        N5 n52 = this.f40865a;
        n52.h();
        if (n52.f40611a.g()) {
            X2 x22 = n52.f40611a;
            x22.x().f40728q.b(j10);
            x22.a().w().b("Session started, time", Long.valueOf(x22.e().c()));
            long j11 = j10 / 1000;
            X2 x23 = n52.f40611a;
            x23.B().B("auto", "_sid", Long.valueOf(j11), j10);
            x22.x().f40729r.b(j11);
            x22.x().f40724m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            x23.B().u("auto", "_s", j10, bundle);
            String strA = x22.x().f40734w.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            x23.B().u("auto", "_ssr", j10, bundle2);
        }
    }
}
