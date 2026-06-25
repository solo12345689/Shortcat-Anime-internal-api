package app.notifee.core;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.q;
import app.notifee.core.event.ForegroundServiceEvent;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationModel;
import cg.f;
import cg.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ForegroundService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f32968a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f32969b = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Exception exc, Void r22) {
        stopForeground(true);
        f32968a = null;
        f32969b = -1;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        int foregroundServiceType;
        if (intent == null || "app.notifee.core.ForegroundService.STOP".equals(intent.getAction())) {
            stopSelf();
            f32968a = null;
            f32969b = -1;
            return 0;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return 2;
        }
        int i12 = extras.getInt("hashCode");
        Notification notification = (Notification) extras.getParcelable("notification");
        Bundle bundle = extras.getBundle("notificationBundle");
        if (!(bundle != null) || !(notification != null)) {
            return 2;
        }
        NotificationModel notificationModel = new NotificationModel(bundle);
        String str = f32968a;
        if (str == null) {
            f32968a = notificationModel.c();
            if (Build.VERSION.SDK_INT >= 29) {
                int foregroundServiceType2 = notificationModel.a().getForegroundServiceType();
                startForeground(i12, notification, foregroundServiceType2);
                f32969b = foregroundServiceType2;
            } else {
                startForeground(i12, notification);
            }
            g.a(new ForegroundServiceEvent(notificationModel, new MethodCallResult() { // from class: r4.e
                @Override // app.notifee.core.interfaces.MethodCallResult
                public final void onComplete(Exception exc, Object obj) {
                    this.f58568a.b(exc, (Void) obj);
                }
            }));
            return 2;
        }
        if (!str.equals(notificationModel.c())) {
            g.a(new NotificationEvent(8, notificationModel));
            return 2;
        }
        if (Build.VERSION.SDK_INT < 29 || (foregroundServiceType = notificationModel.a().getForegroundServiceType()) == f32969b) {
            q.i(f.f33622a).p(i12, notification);
            return 2;
        }
        startForeground(i12, notification, foregroundServiceType);
        f32969b = foregroundServiceType;
        return 2;
    }
}
