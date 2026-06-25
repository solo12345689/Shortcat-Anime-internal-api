package androidx.work.impl;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.work.impl.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2957g extends N3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2957g f32876c = new C2957g();

    private C2957g() {
        super(12, 13);
    }

    @Override // N3.b
    public void a(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        db2.T("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.T("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
