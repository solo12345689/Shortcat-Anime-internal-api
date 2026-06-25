package Yc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements sb.i {
    private final boolean f(Bundle bundle) {
        return bundle.containsKey("google.message_id");
    }

    @Override // sb.i
    public void a(Activity activity, Bundle bundle) {
        Bundle extras;
        AbstractC5504s.h(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        if (extras.containsKey("notificationResponse") || extras.containsKey("textInputNotificationResponse")) {
            Log.d("ReactNativeJS", "[native] ExpoNotificationLifecycleListener contains an unmarshalled notification response. Skipping.");
        } else if (f(extras)) {
            Kc.a.a("ExpoNotificationLifeCycleListener.onCreate:", extras);
            Dc.b.f3684a.c(extras);
        }
    }

    @Override // sb.i
    public boolean onNewIntent(Intent intent) {
        AbstractC5504s.h(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("notificationResponse") || extras.containsKey("textInputNotificationResponse")) {
                intent.removeExtra("notificationResponse");
                intent.removeExtra("textInputNotificationResponse");
            } else {
                if (!f(extras)) {
                    return false;
                }
                Kc.a.a("ExpoNotificationLifeCycleListener.onNewIntent:", extras);
                Dc.b.f3684a.c(extras);
            }
        }
        return false;
    }
}
