package Y0;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22594b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22595c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22596d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22597a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return H.f22596d;
        }

        public final int b() {
            return H.f22595c;
        }

        private a() {
        }
    }

    private /* synthetic */ H(int i10) {
        this.f22597a = i10;
    }

    public static final /* synthetic */ H c(int i10) {
        return new H(i10);
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof H) && i10 == ((H) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f22595c) ? ReactProgressBarViewManager.DEFAULT_STYLE : f(i10, f22596d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f22597a, obj);
    }

    public int hashCode() {
        return g(this.f22597a);
    }

    public final /* synthetic */ int i() {
        return this.f22597a;
    }

    public String toString() {
        return h(this.f22597a);
    }

    public static int d(int i10) {
        return i10;
    }
}
