package p5;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f55809a;

        b() {
            super();
        }

        @Override // p5.c
        public void b(boolean z10) {
            this.f55809a = z10;
        }

        @Override // p5.c
        public void c() {
            if (this.f55809a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }
}
