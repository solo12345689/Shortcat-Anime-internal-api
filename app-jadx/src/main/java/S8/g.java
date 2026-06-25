package s8;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new C6440b(a.FATAL_ERROR, -1L);
    }

    public static g d() {
        return new C6440b(a.INVALID_PAYLOAD, -1L);
    }

    public static g e(long j10) {
        return new C6440b(a.OK, j10);
    }

    public static g f() {
        return new C6440b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
