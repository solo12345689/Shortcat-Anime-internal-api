package pa;

import pa.C5950a;

/* JADX INFO: renamed from: pa.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5953d {

    /* JADX INFO: renamed from: pa.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public abstract AbstractC5953d a();

        public abstract a b(AbstractC5955f abstractC5955f);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* JADX INFO: renamed from: pa.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new C5950a.b();
    }

    public abstract AbstractC5955f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
