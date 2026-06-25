package io.invertase.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.AbstractServiceC3242g;
import com.google.firebase.messaging.W;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class ReactNativeFirebaseMessagingReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    static HashMap f48955a = new HashMap();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("RNFirebaseMsgReceiver", "broadcast received for message");
        if (io.invertase.firebase.app.a.a() == null) {
            io.invertase.firebase.app.a.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.e("RNFirebaseMsgReceiver", "broadcast intent received with no extras");
            return;
        }
        W w10 = new W(intent.getExtras());
        Pd.g gVarI = Pd.g.i();
        if (w10.r() != null) {
            f48955a.put(w10.f(), w10);
            w.a().b().c(w10);
        }
        if (Pd.m.c(context)) {
            gVarI.o(u.h(w10, Boolean.FALSE));
            return;
        }
        try {
            Intent intent2 = new Intent(context, (Class<?>) ReactNativeFirebaseMessagingHeadlessService.class);
            intent2.putExtra("message", w10);
            if (context.startService(intent2) != null) {
                AbstractServiceC3242g.g(context);
            }
        } catch (IllegalStateException e10) {
            Log.e("RNFirebaseMsgReceiver", "Background messages only work if the message priority is set to 'high'", e10);
        }
    }
}
