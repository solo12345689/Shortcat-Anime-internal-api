package r8;

import ga.InterfaceC4870a;
import ga.InterfaceC4871b;
import ia.C5046a;
import u8.C6743a;

/* JADX INFO: renamed from: r8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6275a implements InterfaceC4870a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC4870a f58635a = new C6275a();

    /* JADX INFO: renamed from: r8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0886a implements fa.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0886a f58636a = new C0886a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fa.c f58637b = fa.c.a("window").b(C5046a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final fa.c f58638c = fa.c.a("logSourceMetrics").b(C5046a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final fa.c f58639d = fa.c.a("globalMetrics").b(C5046a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final fa.c f58640e = fa.c.a("appNamespace").b(C5046a.b().c(4).a()).a();

        private C0886a() {
        }

        @Override // fa.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6743a c6743a, fa.e eVar) {
            eVar.b(f58637b, c6743a.d());
            eVar.b(f58638c, c6743a.c());
            eVar.b(f58639d, c6743a.b());
            eVar.b(f58640e, c6743a.a());
        }
    }

    /* JADX INFO: renamed from: r8.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements fa.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f58641a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fa.c f58642b = fa.c.a("storageMetrics").b(C5046a.b().c(1).a()).a();

        private b() {
        }

        @Override // fa.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u8.b bVar, fa.e eVar) {
            eVar.b(f58642b, bVar.a());
        }
    }

    /* JADX INFO: renamed from: r8.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements fa.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f58643a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fa.c f58644b = fa.c.a("eventsDroppedCount").b(C5046a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final fa.c f58645c = fa.c.a("reason").b(C5046a.b().c(3).a()).a();

        private c() {
        }

        @Override // fa.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u8.c cVar, fa.e eVar) {
            eVar.d(f58644b, cVar.a());
            eVar.b(f58645c, cVar.b());
        }
    }

    /* JADX INFO: renamed from: r8.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements fa.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f58646a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fa.c f58647b = fa.c.a("logSource").b(C5046a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final fa.c f58648c = fa.c.a("logEventDropped").b(C5046a.b().c(2).a()).a();

        private d() {
        }

        @Override // fa.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u8.d dVar, fa.e eVar) {
            eVar.b(f58647b, dVar.b());
            eVar.b(f58648c, dVar.a());
        }
    }

    /* JADX INFO: renamed from: r8.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e implements fa.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f58649a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fa.c f58650b = fa.c.d("clientMetrics");

        private e() {
        }

        @Override // fa.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (fa.e) obj2);
        }

        public void b(AbstractC6286l abstractC6286l, fa.e eVar) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: r8.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f implements fa.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f58651a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fa.c f58652b = fa.c.a("currentCacheSizeBytes").b(C5046a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final fa.c f58653c = fa.c.a("maxCacheSizeBytes").b(C5046a.b().c(2).a()).a();

        private f() {
        }

        @Override // fa.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u8.e eVar, fa.e eVar2) {
            eVar2.d(f58652b, eVar.a());
            eVar2.d(f58653c, eVar.b());
        }
    }

    /* JADX INFO: renamed from: r8.a$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g implements fa.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f58654a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fa.c f58655b = fa.c.a("startMs").b(C5046a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final fa.c f58656c = fa.c.a("endMs").b(C5046a.b().c(2).a()).a();

        private g() {
        }

        @Override // fa.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u8.f fVar, fa.e eVar) {
            eVar.d(f58655b, fVar.b());
            eVar.d(f58656c, fVar.a());
        }
    }

    private C6275a() {
    }

    @Override // ga.InterfaceC4870a
    public void a(InterfaceC4871b interfaceC4871b) {
        interfaceC4871b.a(AbstractC6286l.class, e.f58649a);
        interfaceC4871b.a(C6743a.class, C0886a.f58636a);
        interfaceC4871b.a(u8.f.class, g.f58654a);
        interfaceC4871b.a(u8.d.class, d.f58646a);
        interfaceC4871b.a(u8.c.class, c.f58643a);
        interfaceC4871b.a(u8.b.class, b.f58641a);
        interfaceC4871b.a(u8.e.class, f.f58651a);
    }
}
