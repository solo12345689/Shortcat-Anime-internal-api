package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final W f29250c = new W();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f29251d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f29253b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f29252a = new C();

    private W() {
    }

    public static W a() {
        return f29250c;
    }

    public a0 b(Class cls, a0 a0Var) {
        AbstractC2816u.b(cls, "messageType");
        AbstractC2816u.b(a0Var, com.amazon.device.simplesignin.a.a.a.f35159E);
        return (a0) this.f29253b.putIfAbsent(cls, a0Var);
    }

    public a0 c(Class cls) {
        a0 a0VarB;
        AbstractC2816u.b(cls, "messageType");
        a0 a0VarA = (a0) this.f29253b.get(cls);
        return (a0VarA != null || (a0VarB = b(cls, (a0VarA = this.f29252a.a(cls)))) == null) ? a0VarA : a0VarB;
    }

    public a0 d(Object obj) {
        return c(obj.getClass());
    }
}
