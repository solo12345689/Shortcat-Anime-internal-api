package androidx.work.impl;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.work.impl.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2961k extends N3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2961k f32880c = new C2961k();

    private C2961k() {
        super(4, 5);
    }

    @Override // N3.b
    public void a(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        db2.T("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db2.T("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
