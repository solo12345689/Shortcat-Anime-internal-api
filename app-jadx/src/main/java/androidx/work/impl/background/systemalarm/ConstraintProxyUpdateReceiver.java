package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.E;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import i4.i;
import o4.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    static final String f32781a = i.i("ConstrntProxyUpdtRecvr");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Intent f32782a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f32783b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ BroadcastReceiver.PendingResult f32784c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f32782a = intent;
            this.f32783b = context;
            this.f32784c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f32782a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f32782a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f32782a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f32782a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                i.e().a(ConstraintProxyUpdateReceiver.f32781a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                p.a(this.f32783b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                p.a(this.f32783b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                p.a(this.f32783b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                p.a(this.f32783b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f32784c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            E.q(context).w().c(new a(intent, context, goAsync()));
            return;
        }
        i.e().a(f32781a, "Ignoring unknown action " + action);
    }
}
