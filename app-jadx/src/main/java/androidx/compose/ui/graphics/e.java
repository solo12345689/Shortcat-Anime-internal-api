package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26765b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26766c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f26767d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f26768e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26769a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f26766c;
        }

        public final int b() {
            return e.f26768e;
        }

        public final int c() {
            return e.f26767d;
        }

        private a() {
        }
    }

    private /* synthetic */ e(int i10) {
        this.f26769a = i10;
    }

    public static final /* synthetic */ e d(int i10) {
        return new e(i10);
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f26769a, obj);
    }

    public int hashCode() {
        return h(this.f26769a);
    }

    public final /* synthetic */ int j() {
        return this.f26769a;
    }

    public String toString() {
        return i(this.f26769a);
    }

    public static int e(int i10) {
        return i10;
    }
}
