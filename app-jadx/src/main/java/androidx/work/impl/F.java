package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends N3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f32717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Context context) {
        super(9, 10);
        AbstractC5504s.h(context, "context");
        this.f32717c = context;
    }

    @Override // N3.b
    public void a(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        db2.T("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        o4.q.c(this.f32717c, db2);
        o4.l.c(this.f32717c, db2);
    }
}
