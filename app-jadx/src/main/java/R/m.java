package r;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class m {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        static KeyguardManager a(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        static boolean b(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    static KeyguardManager a(Context context) {
        return a.a(context);
    }

    static boolean b(Context context) {
        KeyguardManager keyguardManagerA = a(context);
        if (keyguardManagerA == null) {
            return false;
        }
        return a.b(keyguardManagerA);
    }
}
