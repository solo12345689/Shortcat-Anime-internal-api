package app.notifee.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import cg.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NotificationReceiverActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a(this, getIntent());
        finish();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        p.a(this, intent);
        finish();
    }
}
