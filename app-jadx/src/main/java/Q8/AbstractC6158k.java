package q8;

import q8.C6152e;

/* JADX INFO: renamed from: q8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6158k {

    /* JADX INFO: renamed from: q8.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public abstract AbstractC6158k a();

        public abstract a b(AbstractC6148a abstractC6148a);

        public abstract a c(b bVar);
    }

    /* JADX INFO: renamed from: q8.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f57793a;

        b(int i10) {
            this.f57793a = i10;
        }
    }

    public static a a() {
        return new C6152e.b();
    }

    public abstract AbstractC6148a b();

    public abstract b c();
}
