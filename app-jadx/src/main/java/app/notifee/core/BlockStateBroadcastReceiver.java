package app.notifee.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.concurrent.futures.c;
import androidx.work.b;
import androidx.work.c;
import app.notifee.core.BlockStateBroadcastReceiver;
import app.notifee.core.event.BlockStateEvent;
import app.notifee.core.interfaces.MethodCallResult;
import cg.f;
import cg.q;
import i4.d;
import i4.k;
import i4.t;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class BlockStateBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void b(c.a aVar, q.a aVar2, Exception exc, Bundle bundle) {
        if (exc == null) {
            aVar2.a(bundle);
        } else {
            Logger.e("BlockState", "Failed getting channel or channel group bundle, received error: ", exc);
            aVar.b(c.a.c());
        }
    }

    public static /* synthetic */ void c(c.a aVar, Exception exc, Void r32) {
        if (exc != null) {
            Logger.e("BlockState", "background work failed with error: ", exc);
            aVar.b(c.a.a());
        } else {
            Logger.v("BlockState", "background work completed successfully");
            aVar.b(c.a.c());
        }
    }

    public static void d(b bVar, final c.a aVar) {
        Logger.v("BlockState", "starting background work");
        final boolean zI = bVar.i("blocked", false);
        final int iK = bVar.k("type", 4);
        final q.a aVar2 = new q.a() { // from class: r4.a
            @Override // cg.q.a
            public final void a(Object obj) {
                Bundle bundle = (Bundle) obj;
                cg.g.a(new BlockStateEvent(iK, bundle, zI, new MethodCallResult() { // from class: r4.c
                    @Override // app.notifee.core.interfaces.MethodCallResult
                    public final void onComplete(Exception exc, Object obj2) {
                        BlockStateBroadcastReceiver.c(aVar, exc, (Void) obj2);
                    }
                }));
            }
        };
        if (iK == 4) {
            aVar2.a(null);
            return;
        }
        MethodCallResult<Bundle> methodCallResult = new MethodCallResult() { // from class: r4.b
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                BlockStateBroadcastReceiver.b(aVar, aVar2, exc, (Bundle) obj);
            }
        };
        String strM = bVar.m("channelOrGroupId");
        if (iK == 5) {
            Notifee.getInstance().getChannel(strM, methodCallResult);
        } else if (iK == 6) {
            Notifee.getInstance().getChannelGroup(strM, methodCallResult);
        } else {
            Logger.e("BlockState", "unknown block state work type");
            aVar.b(c.a.c());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        b.a aVar;
        if (Build.VERSION.SDK_INT >= 28 && (action = intent.getAction()) != null) {
            if (f.f33622a == null) {
                f.a(context.getApplicationContext());
            }
            aVar = new b.a();
            aVar.g("workType", "app.notifee.core.BlockStateBroadcastReceiver.WORKER");
            switch (action) {
                case "android.app.action.APP_BLOCK_STATE_CHANGED":
                    aVar.f("type", 4);
                    break;
                case "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED":
                    aVar.f("type", 6);
                    String stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
                    aVar.g("channelOrGroupId", stringExtra);
                    action = action + "." + stringExtra;
                    break;
                case "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED":
                    aVar.f("type", 5);
                    String stringExtra2 = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
                    aVar.g("channelOrGroupId", stringExtra2);
                    action = action + "." + stringExtra2;
                    break;
                default:
                    Logger.d("BlockState", "unknown intent action received, ignoring.");
                    return;
            }
            aVar.e("blocked", intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false));
            try {
                t.h(f.f33622a).f(action, d.REPLACE, (k) ((k.a) ((k.a) new k.a(Worker.class).j(1L, TimeUnit.SECONDS)).k(aVar.a())).b());
            } catch (IllegalStateException e10) {
                Logger.e("BlockState", "Error while calling WorkManager.getInstance", (Exception) e10);
                if (f.f33622a == null) {
                    Logger.e("BlockState", "Application Context is null");
                }
            }
            Logger.v("BlockState", "scheduled new background work with id " + action);
        }
    }
}
