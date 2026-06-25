package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.InterfaceC3759z0;
import com.google.android.gms.internal.play_billing.R2;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class P implements InterfaceC3759z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ K1.a f35294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f35295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ T f35296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f35297d;

    P(T t10, int i10, K1.a aVar, Runnable runnable) {
        this.f35297d = i10;
        this.f35294a = aVar;
        this.f35295b = runnable;
        Objects.requireNonNull(t10);
        this.f35296c = t10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3759z0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        T t10 = this.f35296c;
        if (!T.Y0(iIntValue)) {
            this.f35295b.run();
        } else {
            this.f35294a.accept(t10.Z0(this.f35297d, num.intValue()));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3759z0
    public final void zza(Throwable th2) {
        if (th2 instanceof TimeoutException) {
            this.f35296c.b1(R2.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, W.f35327F);
            com.google.android.gms.internal.play_billing.V.n("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            this.f35296c.b1(R2.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, W.f35327F);
            com.google.android.gms.internal.play_billing.V.n("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.f35295b.run();
    }
}
