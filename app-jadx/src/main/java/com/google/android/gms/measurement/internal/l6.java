package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class l6 implements y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ q6 f41418a;

    l6(q6 q6Var) {
        Objects.requireNonNull(q6Var);
        this.f41418a = q6Var;
    }

    @Override // com.google.android.gms.measurement.internal.y6
    public final void d(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f41418a.b().t(new k6(this, str, str2, bundle));
            return;
        }
        q6 q6Var = this.f41418a;
        if (q6Var.x0() != null) {
            q6Var.x0().a().o().b("AppId not known when logging event", str2);
        }
    }
}
