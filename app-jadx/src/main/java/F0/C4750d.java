package f0;

/* JADX INFO: renamed from: f0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4750d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4750d f46799a = new C4750d();

    private C4750d() {
    }

    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }
    }

    public static final void b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }
    }

    public static final void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
        }
        if (i10 <= i11) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
    }
}
