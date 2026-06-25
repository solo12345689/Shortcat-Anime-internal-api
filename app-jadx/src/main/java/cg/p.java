package cg;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.model.NotificationAndroidPressActionModel;
import app.notifee.core.model.NotificationModel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p {
    public static void a(Context context, Intent intent) {
        NotificationAndroidPressActionModel notificationAndroidPressActionModelFromBundle;
        CharSequence charSequence;
        if (intent.hasExtra("notification")) {
            if (f.f33622a == null) {
                f.a(context.getApplicationContext());
            }
            int intExtra = intent.getIntExtra("notifee_event_type", 0);
            if (intExtra == 0) {
                return;
            }
            if (intExtra == 1) {
                Bundle bundleExtra = intent.getBundleExtra("notification");
                if (bundleExtra == null) {
                    return;
                }
                NotificationModel notificationModel = new NotificationModel(bundleExtra);
                Bundle bundleExtra2 = intent.getBundleExtra("pressAction");
                Bundle bundle = new Bundle();
                if (bundleExtra2 != null) {
                    notificationAndroidPressActionModelFromBundle = NotificationAndroidPressActionModel.fromBundle(bundleExtra2);
                    bundle.putBundle("pressAction", notificationAndroidPressActionModelFromBundle.toBundle());
                } else {
                    notificationAndroidPressActionModelFromBundle = null;
                }
                g.a(new NotificationEvent(1, notificationModel, bundle));
                if (notificationAndroidPressActionModelFromBundle == null) {
                    return;
                }
                String mainComponent = notificationAndroidPressActionModelFromBundle.getMainComponent();
                g.b(new i(notificationModel, bundle));
                if (mainComponent != null) {
                    g.b(new l(mainComponent));
                    return;
                }
                return;
            }
            if (intExtra != 2) {
                return;
            }
            Bundle bundleExtra3 = intent.getBundleExtra("notification");
            Bundle bundleExtra4 = intent.getBundleExtra("pressAction");
            if (bundleExtra3 == null || bundleExtra4 == null) {
                return;
            }
            NotificationModel notificationModel2 = new NotificationModel(bundleExtra3);
            NotificationAndroidPressActionModel notificationAndroidPressActionModelFromBundle2 = NotificationAndroidPressActionModel.fromBundle(bundleExtra4);
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("pressAction", notificationAndroidPressActionModelFromBundle2.toBundle());
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent != null && (charSequence = resultsFromIntent.getCharSequence("app.notifee.core.ReceiverService.REMOTE_INPUT_RECEIVER_KEY")) != null) {
                bundle2.putString("input", charSequence.toString());
            }
            if (notificationModel2.a().getAutoCancel().booleanValue()) {
                androidx.core.app.q.i(context).b(intent.getIntExtra("notification_id", 0));
            }
            g.b(new i(notificationModel2, bundle2));
            g.a(new NotificationEvent(2, notificationModel2, bundle2));
        }
    }
}
