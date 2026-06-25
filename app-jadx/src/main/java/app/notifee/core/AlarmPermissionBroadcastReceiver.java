package app.notifee.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import r4.g0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AlarmPermissionBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED")) {
            Log.i("AlarmPermissionReceiver", "Received alarm permission state changed event");
            new g0().i();
        }
    }
}
