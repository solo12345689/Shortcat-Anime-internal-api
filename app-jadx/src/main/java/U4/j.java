package U4;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f19225a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f19226b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f19227c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f19228d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f19229e = new e();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends j {
        a() {
        }

        @Override // U4.j
        public boolean a() {
            return true;
        }

        @Override // U4.j
        public boolean b() {
            return true;
        }

        @Override // U4.j
        public boolean c(S4.a aVar) {
            return aVar == S4.a.REMOTE;
        }

        @Override // U4.j
        public boolean d(boolean z10, S4.a aVar, S4.c cVar) {
            return (aVar == S4.a.RESOURCE_DISK_CACHE || aVar == S4.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends j {
        b() {
        }

        @Override // U4.j
        public boolean a() {
            return false;
        }

        @Override // U4.j
        public boolean b() {
            return false;
        }

        @Override // U4.j
        public boolean c(S4.a aVar) {
            return false;
        }

        @Override // U4.j
        public boolean d(boolean z10, S4.a aVar, S4.c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends j {
        c() {
        }

        @Override // U4.j
        public boolean a() {
            return true;
        }

        @Override // U4.j
        public boolean b() {
            return false;
        }

        @Override // U4.j
        public boolean c(S4.a aVar) {
            return (aVar == S4.a.DATA_DISK_CACHE || aVar == S4.a.MEMORY_CACHE) ? false : true;
        }

        @Override // U4.j
        public boolean d(boolean z10, S4.a aVar, S4.c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends j {
        d() {
        }

        @Override // U4.j
        public boolean a() {
            return false;
        }

        @Override // U4.j
        public boolean b() {
            return true;
        }

        @Override // U4.j
        public boolean c(S4.a aVar) {
            return false;
        }

        @Override // U4.j
        public boolean d(boolean z10, S4.a aVar, S4.c cVar) {
            return (aVar == S4.a.RESOURCE_DISK_CACHE || aVar == S4.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e extends j {
        e() {
        }

        @Override // U4.j
        public boolean a() {
            return true;
        }

        @Override // U4.j
        public boolean b() {
            return true;
        }

        @Override // U4.j
        public boolean c(S4.a aVar) {
            return aVar == S4.a.REMOTE;
        }

        @Override // U4.j
        public boolean d(boolean z10, S4.a aVar, S4.c cVar) {
            return ((z10 && aVar == S4.a.DATA_DISK_CACHE) || aVar == S4.a.LOCAL) && cVar == S4.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(S4.a aVar);

    public abstract boolean d(boolean z10, S4.a aVar, S4.c cVar);
}
