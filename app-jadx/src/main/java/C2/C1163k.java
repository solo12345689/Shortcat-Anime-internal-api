package C2;

/* JADX INFO: renamed from: C2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1163k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1163k f2758d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2761c;

    /* JADX INFO: renamed from: C2.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2764c;

        public C1163k d() {
            if (this.f2762a || !(this.f2763b || this.f2764c)) {
                return new C1163k(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f2762a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f2763b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f2764c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1163k.class == obj.getClass()) {
            C1163k c1163k = (C1163k) obj;
            if (this.f2759a == c1163k.f2759a && this.f2760b == c1163k.f2760b && this.f2761c == c1163k.f2761c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2759a ? 1 : 0) << 2) + ((this.f2760b ? 1 : 0) << 1) + (this.f2761c ? 1 : 0);
    }

    private C1163k(b bVar) {
        this.f2759a = bVar.f2762a;
        this.f2760b = bVar.f2763b;
        this.f2761c = bVar.f2764c;
    }
}
