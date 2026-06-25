package L6;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11313a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11314b = new C0179b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f11315c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
    }

    /* JADX INFO: renamed from: L6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0179b implements a {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a(String str);

        void b();

        boolean c();
    }

    private b() {
    }

    public static final void a(String name) {
        AbstractC5504s.h(name, "name");
        f11313a.c().a(name);
    }

    public static final void b() {
        f11313a.c().b();
    }

    private final c c() {
        L6.a aVar;
        c cVar = f11315c;
        if (cVar != null) {
            return cVar;
        }
        synchronized (b.class) {
            aVar = new L6.a();
            f11315c = aVar;
        }
        return aVar;
    }

    public static final boolean d() {
        return f11313a.c().c();
    }
}
