package m0;

/* JADX INFO: renamed from: m0.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5611i implements I {

    /* JADX INFO: renamed from: b */
    private final int f52946b;

    private /* synthetic */ C5611i(int i10) {
        this.f52946b = i10;
    }

    public static final /* synthetic */ C5611i a(int i10) {
        return new C5611i(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof C5611i) && i10 == ((C5611i) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "AndroidContentDataType(androidAutofillType=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f52946b, obj);
    }

    public final /* synthetic */ int f() {
        return this.f52946b;
    }

    public int hashCode() {
        return d(this.f52946b);
    }

    public String toString() {
        return e(this.f52946b);
    }

    public static int b(int i10) {
        return i10;
    }
}
