package xa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class X extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f64116a;

    public X(InterfaceC7070D interfaceC7070D) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f64116a = null;
    }

    public r a() {
        return new r(getMessage());
    }
}
