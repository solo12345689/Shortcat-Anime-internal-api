package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.R2;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.android.billingclient.api.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC3178x implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ N4.l f35554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f35555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3157b f35556c;

    CallableC3178x(C3157b c3157b, N4.l lVar, String str, boolean z10) {
        this.f35554a = lVar;
        this.f35555b = str;
        Objects.requireNonNull(c3157b);
        this.f35556c = c3157b;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C3157b c3157b = this.f35556c;
        if (!c3157b.P(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS)) {
            R2 r22 = R2.SERVICE_CONNECTION_NOT_READY;
            C3160e c3160e = W.f35337j;
            c3157b.t0(r22, 9, c3160e);
            this.f35554a.a(c3160e, com.google.android.gms.internal.play_billing.N.t());
            return null;
        }
        String str = this.f35555b;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Please provide a valid product type.");
            R2 r23 = R2.EMPTY_PRODUCT_TYPE;
            C3160e c3160e2 = W.f35332e;
            c3157b.t0(r23, 9, c3160e2);
            this.f35554a.a(c3160e2, com.google.android.gms.internal.play_billing.N.t());
            return null;
        }
        N4.F fR0 = c3157b.r0(str, false, 9);
        if (fR0.b() != null) {
            this.f35554a.a(fR0.a(), fR0.b());
            return null;
        }
        this.f35554a.a(fR0.a(), com.google.android.gms.internal.play_billing.N.t());
        return null;
    }
}
