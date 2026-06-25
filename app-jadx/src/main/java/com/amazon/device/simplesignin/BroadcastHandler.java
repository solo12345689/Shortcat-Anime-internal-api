package com.amazon.device.simplesignin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.device.simplesignin.a.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class BroadcastHandler extends BroadcastReceiver {
    private static final String TAG = "BroadcastHandler";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            c.a().a(context, intent);
        } catch (Exception e10) {
            Log.e(TAG, "Error in BroadcastReceiver onReceive: " + e10);
        }
    }
}
