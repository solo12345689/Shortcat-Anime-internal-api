package i1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5015h implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48547b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f48548c = n(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f48549d = n(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f48550e = n(Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f48551a;

    /* JADX INFO: renamed from: i1.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return C5015h.f48548c;
        }

        public final float b() {
            return C5015h.f48549d;
        }

        public final float c() {
            return C5015h.f48550e;
        }

        private a() {
        }
    }

    private /* synthetic */ C5015h(float f10) {
        this.f48551a = f10;
    }

    public static final /* synthetic */ C5015h h(float f10) {
        return new C5015h(f10);
    }

    public static int m(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static boolean p(float f10, Object obj) {
        return (obj instanceof C5015h) && Float.compare(f10, ((C5015h) obj).t()) == 0;
    }

    public static final boolean q(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int r(float f10) {
        return Float.hashCode(f10);
    }

    public static String s(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return k(((C5015h) obj).t());
    }

    public boolean equals(Object obj) {
        return p(this.f48551a, obj);
    }

    public int hashCode() {
        return r(this.f48551a);
    }

    public int k(float f10) {
        return m(this.f48551a, f10);
    }

    public final /* synthetic */ float t() {
        return this.f48551a;
    }

    public String toString() {
        return s(this.f48551a);
    }

    public static float n(float f10) {
        return f10;
    }
}
