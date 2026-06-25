package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.AbstractBinderC3698m;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class S implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ T f35314a;

    /* synthetic */ S(T t10, N4.w wVar) {
        Objects.requireNonNull(t10);
        this.f35314a = t10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.V.l("BillingClientTesting", "Billing Override Service connected.");
        T t10 = this.f35314a;
        t10.f35317M = AbstractBinderC3698m.e(iBinder);
        t10.f35316L = 2;
        t10.c1(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.V.m("BillingClientTesting", "Billing Override Service disconnected.");
        T t10 = this.f35314a;
        t10.f35317M = null;
        t10.f35316L = 0;
    }
}
