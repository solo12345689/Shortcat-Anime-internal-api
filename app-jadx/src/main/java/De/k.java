package De;

import Qe.k;
import Td.L;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C5683n;
import ye.H;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3706c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5683n f3707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final De.a f3708b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            AbstractC5504s.h(classLoader, "classLoader");
            g gVar = new g(classLoader);
            k.a aVar = Qe.k.f14878b;
            ClassLoader classLoader2 = L.class.getClassLoader();
            AbstractC5504s.g(classLoader2, "getClassLoader(...)");
            k.a.C0252a c0252aA = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f3705b, l.f3709a);
            return new k(c0252aA.a().a(), new De.a(c0252aA.b(), gVar), null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(C5683n c5683n, De.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5683n, aVar);
    }

    public final C5683n a() {
        return this.f3707a;
    }

    public final H b() {
        return this.f3707a.q();
    }

    public final De.a c() {
        return this.f3708b;
    }

    private k(C5683n c5683n, De.a aVar) {
        this.f3707a = c5683n;
        this.f3708b = aVar;
    }
}
