package y5;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f64828a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f64829b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f64830c = new d();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f64831a;

        a(Object obj) {
            this.f64831a = obj;
        }

        @Override // y5.n
        public Object get() {
            return this.f64831a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements n {
        b() {
        }

        @Override // y5.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements n {
        c() {
        }

        @Override // y5.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements n {
        d() {
        }

        @Override // y5.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return "";
        }
    }

    public static n a(Object obj) {
        return new a(obj);
    }
}
