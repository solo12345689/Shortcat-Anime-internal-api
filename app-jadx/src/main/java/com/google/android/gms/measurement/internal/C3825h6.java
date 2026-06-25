package com.google.android.gms.measurement.internal;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3825h6 extends AbstractC3932x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ q6 f41350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3825h6(q6 q6Var, C3 c32) {
        super(c32);
        Objects.requireNonNull(q6Var);
        this.f41350e = q6Var;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3932x
    public final void a() {
        q6 q6Var = this.f41350e;
        q6Var.b().h();
        String str = (String) q6Var.y0().pollFirst();
        if (str != null) {
            q6Var.z0(q6Var.e().c());
            q6Var.a().w().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            q6.W(q6Var.d(), intent);
        }
        q6Var.v0();
    }
}
