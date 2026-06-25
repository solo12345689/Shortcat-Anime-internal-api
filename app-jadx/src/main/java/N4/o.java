package N4;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12676a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12677a;

        /* synthetic */ a(I i10) {
        }

        public o a() {
            if (this.f12677a != null) {
                return new o(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f12677a = str;
            return this;
        }
    }

    /* synthetic */ o(a aVar, I i10) {
        this.f12676a = aVar.f12677a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f12676a;
    }
}
