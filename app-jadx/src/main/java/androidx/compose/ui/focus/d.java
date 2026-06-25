package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26651b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26652c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f26653d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f26654e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f26655f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f26656g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f26657h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f26658i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f26659j = j(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26660a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f26657h;
        }

        public final int b() {
            return d.f26658i;
        }

        public final int c() {
            return d.f26659j;
        }

        public final int d() {
            return d.f26654e;
        }

        public final int e() {
            return d.f26652c;
        }

        public final int f() {
            return d.f26653d;
        }

        public final int g() {
            return d.f26655f;
        }

        public final int h() {
            return d.f26656g;
        }

        private a() {
        }
    }

    private /* synthetic */ d(int i10) {
        this.f26660a = i10;
    }

    public static final /* synthetic */ d i(int i10) {
        return new d(i10);
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return l(i10, f26652c) ? "Next" : l(i10, f26653d) ? "Previous" : l(i10, f26654e) ? "Left" : l(i10, f26655f) ? "Right" : l(i10, f26656g) ? "Up" : l(i10, f26657h) ? "Down" : l(i10, f26658i) ? "Enter" : l(i10, f26659j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f26660a, obj);
    }

    public int hashCode() {
        return m(this.f26660a);
    }

    public final /* synthetic */ int o() {
        return this.f26660a;
    }

    public String toString() {
        return n(this.f26660a);
    }

    public static int j(int i10) {
        return i10;
    }
}
