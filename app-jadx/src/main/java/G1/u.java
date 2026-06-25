package g1;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f47314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u f47315e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f47317b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a() {
            return u.f47314d;
        }

        private a() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f47313c = new a(defaultConstructorMarker);
        b.a aVar = b.f47318b;
        f47314d = new u(aVar.a(), false, defaultConstructorMarker);
        f47315e = new u(aVar.b(), true, defaultConstructorMarker);
    }

    public /* synthetic */ u(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final int b() {
        return this.f47316a;
    }

    public final boolean c() {
        return this.f47317b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return b.g(this.f47316a, uVar.f47316a) && this.f47317b == uVar.f47317b;
    }

    public int hashCode() {
        return (b.h(this.f47316a) * 31) + Boolean.hashCode(this.f47317b);
    }

    public String toString() {
        return AbstractC5504s.c(this, f47314d) ? "TextMotion.Static" : AbstractC5504s.c(this, f47315e) ? "TextMotion.Animated" : "Invalid";
    }

    private u(int i10, boolean z10) {
        this.f47316a = i10;
        this.f47317b = z10;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47318b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f47319c = e(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f47320d = e(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f47321e = e(3);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47322a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f47320d;
            }

            public final int b() {
                return b.f47319c;
            }

            public final int c() {
                return b.f47321e;
            }

            private a() {
            }
        }

        private /* synthetic */ b(int i10) {
            this.f47322a = i10;
        }

        public static final /* synthetic */ b d(int i10) {
            return new b(i10);
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).j();
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return Integer.hashCode(i10);
        }

        public static String i(int i10) {
            return g(i10, f47319c) ? "Linearity.Linear" : g(i10, f47320d) ? "Linearity.FontHinting" : g(i10, f47321e) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f47322a, obj);
        }

        public int hashCode() {
            return h(this.f47322a);
        }

        public final /* synthetic */ int j() {
            return this.f47322a;
        }

        public String toString() {
            return i(this.f47322a);
        }

        private static int e(int i10) {
            return i10;
        }
    }
}
