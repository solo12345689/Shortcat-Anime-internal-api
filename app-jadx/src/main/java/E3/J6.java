package E3;

import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class J6 {
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i10, PendingIntent pendingIntent) {
        mediaStyle.setRemotePlaybackInfo(charSequence, i10, pendingIntent);
        return mediaStyle;
    }
}
