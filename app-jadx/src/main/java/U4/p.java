package U4;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class p implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f19300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f19301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S4.f f19302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19304g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        void d(S4.f fVar, p pVar);
    }

    p(v vVar, boolean z10, boolean z11, S4.f fVar, a aVar) {
        this.f19300c = (v) o5.k.e(vVar);
        this.f19298a = z10;
        this.f19299b = z11;
        this.f19302e = fVar;
        this.f19301d = (a) o5.k.e(aVar);
    }

    @Override // U4.v
    public Class a() {
        return this.f19300c.a();
    }

    synchronized void b() {
        if (this.f19304g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f19303f++;
    }

    v c() {
        return this.f19300c;
    }

    boolean d() {
        return this.f19298a;
    }

    void e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f19303f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f19303f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f19301d.d(this.f19302e, this);
        }
    }

    @Override // U4.v
    public Object get() {
        return this.f19300c.get();
    }

    @Override // U4.v
    public int getSize() {
        return this.f19300c.getSize();
    }

    @Override // U4.v
    public synchronized void recycle() {
        if (this.f19303f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f19304g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f19304g = true;
        if (this.f19299b) {
            this.f19300c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f19298a + ", listener=" + this.f19301d + ", key=" + this.f19302e + ", acquired=" + this.f19303f + ", isRecycled=" + this.f19304g + ", resource=" + this.f19300c + '}';
    }
}
