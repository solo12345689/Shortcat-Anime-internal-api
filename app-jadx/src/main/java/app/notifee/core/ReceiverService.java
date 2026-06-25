package app.notifee.core;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.q;
import androidx.core.app.w;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.model.NotificationAndroidModel;
import app.notifee.core.model.NotificationAndroidPressActionModel;
import app.notifee.core.model.NotificationModel;
import cg.f;
import cg.g;
import cg.i;
import cg.k;
import cg.l;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ReceiverService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f32989a = new AtomicInteger(0);

    public static PendingIntent a(String str, String[] strArr, Bundle... bundleArr) {
        Context context = f.f33622a;
        Intent intent = new Intent(context, (Class<?>) ReceiverService.class);
        intent.setAction(str);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str2 = strArr[i10];
            if (i10 <= bundleArr.length - 1) {
                intent.putExtra(str2, bundleArr[i10]);
            } else {
                intent.putExtra(str2, (String) null);
            }
        }
        return PendingIntent.getService(context, f32989a.getAndIncrement(), intent, 167772160);
    }

    public final void b(i iVar, String str, String str2, int i10) {
        Class clsA = k.a(str);
        if (clsA == null) {
            Logger.e("ReceiverService", "Failed to get launch activity");
            return;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) clsA);
        if (i10 != -1) {
            intent.addFlags(i10);
        }
        if (str2 != null) {
            intent.putExtra("mainComponent", str2);
        }
        try {
            PendingIntent.getActivity(getApplicationContext(), iVar.f33627a.b().intValue(), intent, 167772160).send();
            g.b(iVar);
            if (str2 != null) {
                g.b(new l(str2));
            }
        } catch (Exception e10) {
            Logger.e("ReceiverService", "Failed to send PendingIntent from launchPendingIntentActivity for notification " + iVar.f33627a.c(), e10);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        CharSequence charSequence;
        NotificationAndroidPressActionModel notificationAndroidPressActionModelFromBundle;
        String action = intent.getAction();
        if (action == null) {
            return 2;
        }
        switch (action) {
            case "app.notifee.core.ReceiverService.ACTION_PRESS_INTENT":
                Bundle bundleExtra = intent.getBundleExtra("notification");
                Bundle bundleExtra2 = intent.getBundleExtra("pressAction");
                if (bundleExtra != null && bundleExtra2 != null) {
                    NotificationModel notificationModel = new NotificationModel(bundleExtra);
                    NotificationAndroidModel notificationAndroidModelA = notificationModel.a();
                    NotificationAndroidPressActionModel notificationAndroidPressActionModelFromBundle2 = NotificationAndroidPressActionModel.fromBundle(bundleExtra2);
                    Bundle bundle = new Bundle();
                    bundle.putBundle("pressAction", notificationAndroidPressActionModelFromBundle2.toBundle());
                    Bundle bundleO = w.o(intent);
                    if (bundleO != null && (charSequence = bundleO.getCharSequence("app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY")) != null) {
                        bundle.putString("input", charSequence.toString());
                    }
                    g.a(new NotificationEvent(2, notificationModel, bundle));
                    if (notificationModel.a().getAutoCancel().booleanValue()) {
                        q.i(getApplicationContext()).c(notificationAndroidModelA.getTag(), notificationModel.c().hashCode());
                    }
                    String launchActivity = notificationAndroidPressActionModelFromBundle2.getLaunchActivity();
                    String mainComponent = notificationAndroidPressActionModelFromBundle2.getMainComponent();
                    if (launchActivity != null || mainComponent != null) {
                        b(new i(notificationModel, bundle), launchActivity, mainComponent, notificationAndroidPressActionModelFromBundle2.getLaunchActivityFlags());
                        int i12 = f.f33622a.getApplicationInfo().targetSdkVersion;
                        if (Build.VERSION.SDK_INT < 31) {
                            f.f33622a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                        }
                    }
                }
                return 2;
            case "app.notifee.core.ReceiverService.DELETE_INTENT":
                Bundle bundleExtra3 = intent.getBundleExtra("notification");
                if (bundleExtra3 != null) {
                    g.a(new NotificationEvent(0, new NotificationModel(bundleExtra3)));
                }
                return 2;
            case "app.notifee.core.ReceiverService.PRESS_INTENT":
                Bundle bundleExtra4 = intent.getBundleExtra("notification");
                if (bundleExtra4 != null) {
                    NotificationModel notificationModel2 = new NotificationModel(bundleExtra4);
                    Bundle bundleExtra5 = intent.getBundleExtra("pressAction");
                    Bundle bundle2 = new Bundle();
                    if (bundleExtra5 != null) {
                        notificationAndroidPressActionModelFromBundle = NotificationAndroidPressActionModel.fromBundle(bundleExtra5);
                        bundle2.putBundle("pressAction", notificationAndroidPressActionModelFromBundle.toBundle());
                    } else {
                        notificationAndroidPressActionModelFromBundle = null;
                    }
                    g.a(new NotificationEvent(1, notificationModel2, bundle2));
                    if (notificationAndroidPressActionModelFromBundle != null) {
                        String launchActivity2 = notificationAndroidPressActionModelFromBundle.getLaunchActivity();
                        String mainComponent2 = notificationAndroidPressActionModelFromBundle.getMainComponent();
                        if (launchActivity2 != null || mainComponent2 != null) {
                            b(new i(notificationModel2, bundle2), launchActivity2, mainComponent2, notificationAndroidPressActionModelFromBundle.getLaunchActivityFlags());
                        }
                    }
                }
                return 2;
            default:
                return 2;
        }
    }
}
