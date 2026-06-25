package S3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f15913a = new f();

    private f() {
    }

    public static final List a(Cursor cursor) {
        AbstractC5504s.h(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        AbstractC5504s.e(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver cr, List uris) {
        AbstractC5504s.h(cursor, "cursor");
        AbstractC5504s.h(cr, "cr");
        AbstractC5504s.h(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
