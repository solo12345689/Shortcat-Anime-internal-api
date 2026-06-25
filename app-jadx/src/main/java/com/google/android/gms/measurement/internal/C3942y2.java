package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3942y2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q6 f41786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41788c;

    C3942y2(q6 q6Var) {
        AbstractC2115p.l(q6Var);
        this.f41786a = q6Var;
    }

    public final void a() {
        q6 q6Var = this.f41786a;
        q6Var.O0();
        q6Var.b().h();
        if (this.f41787b) {
            return;
        }
        q6Var.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f41788c = q6Var.E0().m();
        q6Var.a().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f41788c));
        this.f41787b = true;
    }

    public final void b() {
        q6 q6Var = this.f41786a;
        q6Var.O0();
        q6Var.b().h();
        q6Var.b().h();
        if (this.f41787b) {
            q6Var.a().w().a("Unregistering connectivity change receiver");
            this.f41787b = false;
            this.f41788c = false;
            try {
                q6Var.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f41786a.a().o().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    final /* synthetic */ q6 c() {
        return this.f41786a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q6 q6Var = this.f41786a;
        q6Var.O0();
        String action = intent.getAction();
        q6Var.a().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            q6Var.a().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM = q6Var.E0().m();
        if (this.f41788c != zM) {
            this.f41788c = zM;
            q6Var.b().t(new RunnableC3935x2(this, zM));
        }
    }
}
