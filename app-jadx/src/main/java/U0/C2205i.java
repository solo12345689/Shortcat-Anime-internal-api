package U0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: U0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2205i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f18836b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f18837c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f18838d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f18839e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18840a;

    /* JADX INFO: renamed from: U0.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C2205i.f18839e;
        }

        public final int b() {
            return C2205i.f18837c;
        }

        public final int c() {
            return C2205i.f18838d;
        }

        private a() {
        }
    }

    private /* synthetic */ C2205i(int i10) {
        this.f18840a = i10;
    }

    public static final /* synthetic */ C2205i d(int i10) {
        return new C2205i(i10);
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof C2205i) && i10 == ((C2205i) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        if (i10 == f18837c) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == f18838d) {
            return "EmojiSupportMatch.None";
        }
        if (i10 == f18839e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f18840a, obj);
    }

    public int hashCode() {
        return h(this.f18840a);
    }

    public final /* synthetic */ int j() {
        return this.f18840a;
    }

    public String toString() {
        return i(this.f18840a);
    }

    private static int e(int i10) {
        return i10;
    }
}
