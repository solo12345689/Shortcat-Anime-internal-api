package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4821a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0757a f47219b = new C0757a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f47220c = c(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f47221d = c(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f47222e = c(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f47223a;

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0757a {
        public /* synthetic */ C0757a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return C4821a.f47222e;
        }

        private C0757a() {
        }
    }

    private /* synthetic */ C4821a(float f10) {
        this.f47223a = f10;
    }

    public static final /* synthetic */ C4821a b(float f10) {
        return new C4821a(f10);
    }

    public static boolean d(float f10, Object obj) {
        return (obj instanceof C4821a) && Float.compare(f10, ((C4821a) obj).h()) == 0;
    }

    public static final boolean e(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int f(float f10) {
        return Float.hashCode(f10);
    }

    public static String g(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f47223a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f47223a;
    }

    public int hashCode() {
        return f(this.f47223a);
    }

    public String toString() {
        return g(this.f47223a);
    }

    public static float c(float f10) {
        return f10;
    }
}
