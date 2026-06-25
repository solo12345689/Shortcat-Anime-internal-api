package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47323a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f47324b = f(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f47325c = f(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f47326d = f(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47327e = f(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f47328f = f(5);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return v.f47324b;
        }

        public final int b() {
            return v.f47325c;
        }

        public final int c() {
            return v.f47328f;
        }

        public final int d() {
            return v.f47327e;
        }

        public final int e() {
            return v.f47326d;
        }

        private a() {
        }
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return g(i10, f47324b) ? "Clip" : g(i10, f47325c) ? "Ellipsis" : g(i10, f47328f) ? "MiddleEllipsis" : g(i10, f47326d) ? "Visible" : g(i10, f47327e) ? "StartEllipsis" : "Invalid";
    }

    public static int f(int i10) {
        return i10;
    }
}
