package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class G2 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final String f40770a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ H2 f40771b;

    G2(H2 h22, String str) {
        Objects.requireNonNull(h22);
        this.f40771b = h22;
        this.f40770a = str;
    }

    final /* synthetic */ String a() {
        return this.f40770a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f40771b.f40788a.a().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.U uE = com.google.android.gms.internal.measurement.T.e(iBinder);
            if (uE == null) {
                this.f40771b.f40788a.a().r().a("Install Referrer Service implementation was not found");
                return;
            }
            X2 x22 = this.f40771b.f40788a;
            x22.a().w().a("Install Referrer Service connected");
            x22.b().t(new F2(this, uE, this));
        } catch (RuntimeException e10) {
            this.f40771b.f40788a.a().r().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f40771b.f40788a.a().w().a("Install Referrer Service disconnected");
    }
}
