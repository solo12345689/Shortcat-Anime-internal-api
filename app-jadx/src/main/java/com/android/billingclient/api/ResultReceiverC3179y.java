package com.android.billingclient.api;

import N4.InterfaceC1969i;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.Objects;

/* JADX INFO: renamed from: com.android.billingclient.api.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class ResultReceiverC3179y extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1969i f35557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultReceiverC3179y(C3157b c3157b, Handler handler, InterfaceC1969i interfaceC1969i) {
        super(handler);
        this.f35557a = interfaceC1969i;
        Objects.requireNonNull(c3157b);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f35557a.a(com.google.android.gms.internal.play_billing.V.h(bundle, "BillingClient"));
    }
}
