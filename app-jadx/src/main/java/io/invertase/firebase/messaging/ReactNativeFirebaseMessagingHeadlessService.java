package io.invertase.firebase.messaging;

import android.content.Intent;
import com.facebook.react.AbstractServiceC3242g;
import com.google.firebase.messaging.W;
import j7.C5337a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class ReactNativeFirebaseMessagingHeadlessService extends AbstractServiceC3242g {
    @Override // com.facebook.react.AbstractServiceC3242g
    protected C5337a l(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        return new C5337a("ReactNativeFirebaseMessagingHeadlessTask", u.i((W) intent.getParcelableExtra("message")), Pd.i.g().e("messaging_android_headless_task_timeout", 60000L), true);
    }
}
