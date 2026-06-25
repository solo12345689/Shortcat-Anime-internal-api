package b5;

/* JADX INFO: renamed from: b5.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3012n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3012n f33174a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3012n f33175b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC3012n f33176c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC3012n f33177d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC3012n f33178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC3012n f33179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC3012n f33180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S4.g f33181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f33182i;

    /* JADX INFO: renamed from: b5.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AbstractC3012n {
        a() {
        }

        @Override // b5.AbstractC3012n
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // b5.AbstractC3012n
        public float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* JADX INFO: renamed from: b5.n$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends AbstractC3012n {
        b() {
        }

        @Override // b5.AbstractC3012n
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // b5.AbstractC3012n
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: renamed from: b5.n$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends AbstractC3012n {
        c() {
        }

        @Override // b5.AbstractC3012n
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : AbstractC3012n.f33176c.a(i10, i11, i12, i13);
        }

        @Override // b5.AbstractC3012n
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, AbstractC3012n.f33176c.b(i10, i11, i12, i13));
        }
    }

    /* JADX INFO: renamed from: b5.n$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends AbstractC3012n {
        d() {
        }

        @Override // b5.AbstractC3012n
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // b5.AbstractC3012n
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* JADX INFO: renamed from: b5.n$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e extends AbstractC3012n {
        e() {
        }

        @Override // b5.AbstractC3012n
        public g a(int i10, int i11, int i12, int i13) {
            return AbstractC3012n.f33182i ? g.QUALITY : g.MEMORY;
        }

        @Override // b5.AbstractC3012n
        public float b(int i10, int i11, int i12, int i13) {
            if (AbstractC3012n.f33182i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* JADX INFO: renamed from: b5.n$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class f extends AbstractC3012n {
        f() {
        }

        @Override // b5.AbstractC3012n
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // b5.AbstractC3012n
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: b5.n$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f33178e = dVar;
        f33179f = new f();
        f33180g = dVar;
        f33181h = S4.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f33182i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
