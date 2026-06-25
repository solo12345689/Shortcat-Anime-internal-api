package pa;

import pa.C5951b;

/* JADX INFO: renamed from: pa.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5955f {

    /* JADX INFO: renamed from: pa.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public abstract AbstractC5955f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j10);
    }

    /* JADX INFO: renamed from: pa.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C5951b.C0859b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
