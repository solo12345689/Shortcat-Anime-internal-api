package androidx.work.impl;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.work.impl.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2960j extends N3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2960j f32879c = new C2960j();

    private C2960j() {
        super(3, 4);
    }

    @Override // N3.b
    public void a(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        db2.T("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
