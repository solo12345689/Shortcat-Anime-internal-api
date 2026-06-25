package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.C3760z1;
import com.google.android.gms.internal.play_billing.J2;
import com.google.android.gms.internal.play_billing.R2;
import com.google.android.gms.internal.play_billing.Y2;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class d0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e0 f35430c;

    d0(e0 e0Var, boolean z10) {
        Objects.requireNonNull(e0Var);
        this.f35430c = e0Var;
        this.f35429b = z10;
    }

    private final void d(Bundle bundle, C3160e c3160e, int i10, Y2 y22, long j10, boolean z10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f35430c.f35439c.c(J2.C(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), C3760z1.a()), j10, z10);
            } else {
                this.f35430c.f35439c.c(U.b(R2.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, c3160e, null, y22), j10, z10);
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.V.m("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f35428a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f35429b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f35428a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        d0 d0Var;
        try {
            try {
                if (this.f35428a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    d0Var = this;
                    context.registerReceiver(d0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f35429b ? 4 : 2);
                } else {
                    d0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                d0Var.f35428a = true;
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    public final synchronized void c(Context context) {
        if (!this.f35428a) {
            com.google.android.gms.internal.play_billing.V.m("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f35428a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.d0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
