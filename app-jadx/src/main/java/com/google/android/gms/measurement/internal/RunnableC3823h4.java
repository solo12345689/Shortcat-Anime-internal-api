package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3823h4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3939y f41342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41343b;

    RunnableC3823h4(C3937x4 c3937x4, C3939y c3939y) {
        this.f41342a = c3939y;
        Objects.requireNonNull(c3937x4);
        this.f41343b = c3937x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3937x4 c3937x4 = this.f41343b;
        X2 x22 = c3937x4.f40611a;
        E2 e2X = x22.x();
        X2 x23 = e2X.f40611a;
        e2X.h();
        C3939y c3939yU = e2X.u();
        C3939y c3939y = this.f41342a;
        if (!E3.u(c3939y.b(), c3939yU.b())) {
            x22.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c3939y.b()));
            return;
        }
        SharedPreferences.Editor editorEdit = e2X.p().edit();
        editorEdit.putString("dma_consent_settings", c3939y.e());
        editorEdit.apply();
        x22.a().w().b("Setting DMA consent(FE)", c3939y);
        X2 x24 = c3937x4.f40611a;
        if (x24.J().D()) {
            x24.J().a0();
        } else {
            x24.J().Y(false);
        }
    }
}
