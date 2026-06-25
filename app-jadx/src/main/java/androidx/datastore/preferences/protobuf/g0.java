package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class g0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29321a;

    public g0(K k10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f29321a = null;
    }

    public C2817v a() {
        return new C2817v(getMessage());
    }
}
