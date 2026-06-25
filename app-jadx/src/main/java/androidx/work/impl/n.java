package androidx.work.impl;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends N3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f32883c = new n();

    private n() {
        super(8, 9);
    }

    @Override // N3.b
    public void a(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        db2.T("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
