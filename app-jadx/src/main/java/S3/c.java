package S3;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f15910a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        AbstractC5504s.h(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        AbstractC5504s.g(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        AbstractC5504s.h(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
