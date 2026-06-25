package sb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface i {
    default boolean onBackPressed() {
        return false;
    }

    default boolean onNewIntent(Intent intent) {
        return false;
    }

    default void b(Activity activity) {
    }

    default void c(Activity activity) {
    }

    default void d(Activity activity) {
    }

    default void e(Activity activity) {
    }

    default void onUserLeaveHint(Activity activity) {
    }

    default void a(Activity activity, Bundle bundle) {
    }
}
