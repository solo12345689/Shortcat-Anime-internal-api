package androidx.work.impl;

import android.content.ContentValues;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.work.impl.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2952b implements N3.a {
    @Override // N3.a
    public void a(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        db2.T("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db2.n1("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
