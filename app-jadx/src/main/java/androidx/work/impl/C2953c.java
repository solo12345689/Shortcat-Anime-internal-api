package androidx.work.impl;

import M3.q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.work.impl.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2953c extends q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2953c f32844a = new C2953c();

    private C2953c() {
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // M3.q.b
    public void c(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        super.c(db2);
        db2.M();
        try {
            db2.T(e());
            db2.l0();
        } finally {
            db2.v0();
        }
    }

    public final long d() {
        return System.currentTimeMillis() - z.f32965a;
    }
}
