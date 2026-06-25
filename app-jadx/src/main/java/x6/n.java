package x6;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface n extends x, B5.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f63974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5.a f63975b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f63978e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f63980g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f63976c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f63977d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f63979f = 0;

        private a(Object obj, C5.a aVar, b bVar, int i10) {
            this.f63974a = y5.k.g(obj);
            this.f63975b = (C5.a) y5.k.g(C5.a.j(aVar));
            this.f63978e = bVar;
            this.f63980g = i10;
        }

        public static a a(Object obj, C5.a aVar, int i10, b bVar) {
            return new a(obj, aVar, bVar, i10);
        }

        public static a b(Object obj, C5.a aVar, b bVar) {
            return a(obj, aVar, -1, bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(Object obj, boolean z10);
    }

    C5.a d(Object obj, C5.a aVar, b bVar);

    C5.a e(Object obj);
}
