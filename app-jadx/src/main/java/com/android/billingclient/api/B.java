package com.android.billingclient.api;

import N4.InterfaceC1964d;
import com.google.android.gms.internal.play_billing.O3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class B implements InterfaceC1964d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ O3 f35260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3157b f35261b;

    B(C3157b c3157b, O3 o32) {
        this.f35260a = o32;
        Objects.requireNonNull(c3157b);
        this.f35261b = c3157b;
    }

    @Override // N4.InterfaceC1964d
    public final void onBillingServiceDisconnected() {
        com.google.android.gms.internal.play_billing.V.l("BillingClient", "Reconnection attempt failed.");
        try {
            this.f35260a.b(W.f35337j);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception setting completer.", th2);
        }
        C3157b c3157b = this.f35261b;
        if (c3157b.f35371G != null) {
            c3157b.Y(new Runnable() { // from class: com.android.billingclient.api.z
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f35558a.f35261b.f35371G.onBillingServiceDisconnected();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception calling onBillingServiceDisconnected.", th3);
                    }
                }
            });
        }
    }

    @Override // N4.InterfaceC1964d
    public final void onBillingSetupFinished(final C3160e c3160e) {
        com.google.android.gms.internal.play_billing.V.l("BillingClient", "Reconnection finished with result: " + c3160e.c());
        try {
            this.f35260a.b(c3160e);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception setting completer.", th2);
        }
        C3157b c3157b = this.f35261b;
        if (c3157b.f35371G != null) {
            c3157b.Y(new Runnable() { // from class: com.android.billingclient.api.A
                @Override // java.lang.Runnable
                public final void run() {
                    B b10 = this.f35258a;
                    try {
                        b10.f35261b.f35371G.onBillingSetupFinished(c3160e);
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception calling onBillingSetupFinished.", th3);
                    }
                }
            });
        }
    }
}
