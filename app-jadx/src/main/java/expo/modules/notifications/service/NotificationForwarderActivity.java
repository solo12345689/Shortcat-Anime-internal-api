package expo.modules.notifications.service;

import Yc.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/notifications/service/NotificationForwarderActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LTd/L;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationForwarderActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context applicationContext = getApplicationContext();
            AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
            Intent intentA = companion.a(applicationContext, getIntent());
            Intent intent = getIntent();
            AbstractC5504s.g(intent, "getIntent(...)");
            c.f22903b.g(this, companion.l(intent));
            sendBroadcast(intentA);
        } catch (IllegalArgumentException e10) {
            Log.e("expo-notifications", "Failed to handle notification response: could not recover notification data from intent extras. This may happen on some Android versions. Opening app to foreground.", e10);
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
