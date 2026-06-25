package S3;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f15912a = new e();

    private e() {
    }

    public static final void a(Cursor cursor, Bundle extras) {
        AbstractC5504s.h(cursor, "cursor");
        AbstractC5504s.h(extras, "extras");
        cursor.setExtras(extras);
    }
}
