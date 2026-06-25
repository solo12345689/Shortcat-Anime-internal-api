package xa;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class N {

    /* JADX INFO: renamed from: c */
    private static final N f64102c = new N();

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap f64104b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private final T f64103a = new C7095v();

    private N() {
    }

    public static N a() {
        return f64102c;
    }

    public S b(Class cls, S s10) {
        AbstractC7091q.b(cls, "messageType");
        AbstractC7091q.b(s10, com.amazon.device.simplesignin.a.a.a.f35159E);
        return (S) this.f64104b.putIfAbsent(cls, s10);
    }

    public S c(Class cls) {
        S sB;
        AbstractC7091q.b(cls, "messageType");
        S sA = (S) this.f64104b.get(cls);
        return (sA != null || (sB = b(cls, (sA = this.f64103a.a(cls)))) == null) ? sA : sB;
    }

    public S d(Object obj) {
        return c(obj.getClass());
    }
}
