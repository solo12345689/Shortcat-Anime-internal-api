package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C3498j7;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class G6 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2 f40785a;

    public G6(X2 x22) {
        this.f40785a = x22;
    }

    final /* synthetic */ void a() {
        this.f40785a.N().o(((Long) AbstractC3789d2.f41147D.b(null)).longValue());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f40785a.a().r().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f40785a.a().r().a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                X2 x22 = this.f40785a;
                x22.a().w().a("[sgtm] App Receiver notified batches are available");
                x22.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.D6
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f40710a.a();
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final X2 x23 = this.f40785a;
            C3498j7.a();
            if (x23.w().H(null, AbstractC3789d2.f41176R0)) {
                x23.a().w().a("App receiver notified triggers are available");
                x23.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.E6
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        X2 x24 = x23;
                        if (!x24.C().G()) {
                            x24.a().r().a("registerTrigger called but app not eligible");
                            return;
                        }
                        x24.B().t0();
                        final C3937x4 c3937x4B = x24.B();
                        Objects.requireNonNull(c3937x4B);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.F6
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                c3937x4B.u0();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        this.f40785a.a().r().a("App receiver called with unknown action");
    }
}
