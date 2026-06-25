package ye;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f65138a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f65139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f65140c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f65141c = new a();

        private a() {
            super("inherited", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f65142c = new b();

        private b() {
            super("internal", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f65143c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f65144c = new d();

        private d() {
            super("local", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f65145c = new e();

        private e() {
            super("private", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f65146c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // ye.x0
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f65147c = new g();

        private g() {
            super("protected", true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f65148c = new h();

        private h() {
            super("public", true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f65149c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = Ud.S.c();
        mapC.put(f.f65146c, 0);
        mapC.put(e.f65145c, 0);
        mapC.put(b.f65142c, 1);
        mapC.put(g.f65147c, 1);
        h hVar = h.f65148c;
        mapC.put(hVar, 2);
        f65139b = Ud.S.b(mapC);
        f65140c = hVar;
    }

    private w0() {
    }

    public final Integer a(x0 first, x0 second) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        if (first == second) {
            return 0;
        }
        Map map = f65139b;
        Integer num = (Integer) map.get(first);
        Integer num2 = (Integer) map.get(second);
        if (num == null || num2 == null || AbstractC5504s.c(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(x0 visibility) {
        AbstractC5504s.h(visibility, "visibility");
        return visibility == e.f65145c || visibility == f.f65146c;
    }
}
