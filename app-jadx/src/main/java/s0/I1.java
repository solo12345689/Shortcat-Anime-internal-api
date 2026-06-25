package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58895a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f58896b = e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58897c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f58898d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f58899e = e(3);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return I1.f58896b;
        }

        public final int b() {
            return I1.f58899e;
        }

        public final int c() {
            return I1.f58898d;
        }

        public final int d() {
            return I1.f58897c;
        }

        private a() {
        }
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f58896b) ? "Clamp" : f(i10, f58897c) ? "Repeated" : f(i10, f58898d) ? "Mirror" : f(i10, f58899e) ? "Decal" : "Unknown";
    }

    public static int e(int i10) {
        return i10;
    }
}
