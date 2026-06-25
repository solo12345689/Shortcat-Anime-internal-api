package N4;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12675a;

        /* synthetic */ a(H h10) {
        }

        public n a() {
            if (this.f12675a != null) {
                return new n(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f12675a = str;
            return this;
        }
    }

    /* synthetic */ n(a aVar, H h10) {
    }

    public static a a() {
        return new a(null);
    }
}
