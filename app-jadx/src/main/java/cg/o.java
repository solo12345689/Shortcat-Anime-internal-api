package cg;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import app.notifee.core.Logger;
import app.notifee.core.NotificationReceiverActivity;
import app.notifee.core.model.NotificationAndroidPressActionModel;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class o {
    public static PendingIntent a(int i10, Bundle bundle, int i11, String[] strArr, Bundle... bundleArr) {
        Intent[] intentArr;
        NotificationAndroidPressActionModel notificationAndroidPressActionModelFromBundle;
        Context context = f.f33622a;
        Intent intent = null;
        if (bundle != null && (notificationAndroidPressActionModelFromBundle = NotificationAndroidPressActionModel.fromBundle(bundle)) != null && (notificationAndroidPressActionModelFromBundle.getLaunchActivity() != null || notificationAndroidPressActionModelFromBundle.getMainComponent() != null)) {
            try {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                String launchActivity = notificationAndroidPressActionModelFromBundle != null ? notificationAndroidPressActionModelFromBundle.getLaunchActivity() : null;
                Boolean boolValueOf = Boolean.valueOf(launchIntentForPackage == null);
                if (launchIntentForPackage != null) {
                    boolValueOf = Boolean.valueOf((launchActivity == "default" || launchIntentForPackage.getComponent().getClassName() == launchActivity) ? false : true);
                }
                if (launchActivity != null && boolValueOf.booleanValue()) {
                    Intent intent2 = new Intent(context, (Class<?>) k.a(launchActivity));
                    intent2.setPackage(null);
                    intent2.setFlags(270532608);
                    launchIntentForPackage = intent2;
                }
                if (notificationAndroidPressActionModelFromBundle.getLaunchActivityFlags() != -1) {
                    launchIntentForPackage.setFlags(notificationAndroidPressActionModelFromBundle.getLaunchActivityFlags());
                }
                if (notificationAndroidPressActionModelFromBundle.getMainComponent() != null) {
                    launchIntentForPackage.putExtra("mainComponent", notificationAndroidPressActionModelFromBundle.getMainComponent());
                    g.b(new l(notificationAndroidPressActionModelFromBundle.getMainComponent()));
                }
                intent = launchIntentForPackage;
            } catch (Exception e10) {
                Logger.e("NotificationPendingIntent", "Failed to create LaunchActivityIntent for notification " + i10, e10);
            }
        }
        Intent intent3 = new Intent(context, (Class<?>) NotificationReceiverActivity.class);
        b(intent, i11, i10, strArr, bundleArr);
        b(intent3, i11, i10, strArr, bundleArr);
        int iHashCode = UUID.randomUUID().hashCode();
        if (intent != null) {
            intent3.setFlags(603979776);
            intentArr = new Intent[]{intent, intent3};
        } else {
            intent3.setFlags(403177472);
            intentArr = new Intent[]{intent3};
        }
        return PendingIntent.getActivities(context, iHashCode, intentArr, 167772160);
    }

    public static void b(Intent intent, int i10, int i11, String[] strArr, Bundle... bundleArr) {
        if (intent == null) {
            return;
        }
        intent.putExtra("notifee_event_type", i10);
        intent.putExtra("notification_id", i11);
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String str = strArr[i12];
            if (i12 <= bundleArr.length - 1) {
                intent.putExtra(str, bundleArr[i12]);
            } else {
                intent.putExtra(str, (String) null);
            }
        }
    }
}
