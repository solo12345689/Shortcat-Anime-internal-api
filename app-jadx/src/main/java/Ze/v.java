package Ze;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class v extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23382a;

    public v(p pVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f23382a = null;
    }

    public k a() {
        return new k(getMessage());
    }
}
