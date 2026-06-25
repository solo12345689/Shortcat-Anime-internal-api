package C;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2072a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f2073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f2074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f2075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f2076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f2077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f2078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f2079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f2080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f2081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f2082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f2083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f2084m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return V.f2073b;
        }

        public final int b() {
            return V.f2075d;
        }

        public final int c() {
            return V.f2074c;
        }

        public final int d() {
            return V.f2076e;
        }

        public final int e() {
            return V.f2080i;
        }

        public final int f() {
            return V.f2083l;
        }

        public final int g() {
            return V.f2079h;
        }

        private a() {
        }
    }

    static {
        int iH = h(8);
        f2073b = iH;
        int iH2 = h(4);
        f2074c = iH2;
        int iH3 = h(2);
        f2075d = iH3;
        int iH4 = h(1);
        f2076e = iH4;
        f2077f = l(iH, iH4);
        f2078g = l(iH2, iH3);
        int iH5 = h(16);
        f2079h = iH5;
        int iH6 = h(32);
        f2080i = iH6;
        int iL = l(iH, iH3);
        f2081j = iL;
        int iL2 = l(iH2, iH4);
        f2082k = iL2;
        f2083l = l(iL, iL2);
        f2084m = l(iH5, iH6);
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean j(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static final int l(int i10, int i11) {
        return h(i10 | i11);
    }

    public static String m(int i10) {
        return "WindowInsetsSides(" + n(i10) + ')';
    }

    private static final String n(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = f2077f;
        if ((i10 & i11) == i11) {
            o(sb2, "Start");
        }
        int i12 = f2081j;
        if ((i10 & i12) == i12) {
            o(sb2, "Left");
        }
        int i13 = f2079h;
        if ((i10 & i13) == i13) {
            o(sb2, "Top");
        }
        int i14 = f2078g;
        if ((i10 & i14) == i14) {
            o(sb2, "End");
        }
        int i15 = f2082k;
        if ((i10 & i15) == i15) {
            o(sb2, "Right");
        }
        int i16 = f2080i;
        if ((i10 & i16) == i16) {
            o(sb2, "Bottom");
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final void o(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    private static int h(int i10) {
        return i10;
    }
}
