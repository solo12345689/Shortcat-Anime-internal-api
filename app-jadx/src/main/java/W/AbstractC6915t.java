package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6915t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f62668a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f62669b = b(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f62670c = b(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f62671d = b(0);

    /* JADX INFO: renamed from: w.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AbstractC6915t.f62671d;
        }

        private a() {
        }
    }

    public static final boolean c(int i10, int i11) {
        return i10 == i11;
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "ArcMode(value=" + i10 + ')';
    }

    public static int b(int i10) {
        return i10;
    }
}
