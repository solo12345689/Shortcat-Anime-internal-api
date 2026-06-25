package E0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4085a;

    private /* synthetic */ P(int i10) {
        this.f4085a = i10;
    }

    public static final /* synthetic */ P a(int i10) {
        return new P(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof P) && i10 == ((P) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f4085a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f4085a;
    }

    public int hashCode() {
        return d(this.f4085a);
    }

    public String toString() {
        return e(this.f4085a);
    }

    public static int b(int i10) {
        return i10;
    }
}
