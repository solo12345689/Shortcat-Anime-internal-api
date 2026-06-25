package dg;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dg.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4623d {

    /* JADX INFO: renamed from: n */
    public static final b f45360n = new b(null);

    /* JADX INFO: renamed from: o */
    public static final C4623d f45361o = new a().d().a();

    /* JADX INFO: renamed from: p */
    public static final C4623d f45362p = new a().f().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a */
    private final boolean f45363a;

    /* JADX INFO: renamed from: b */
    private final boolean f45364b;

    /* JADX INFO: renamed from: c */
    private final int f45365c;

    /* JADX INFO: renamed from: d */
    private final int f45366d;

    /* JADX INFO: renamed from: e */
    private final boolean f45367e;

    /* JADX INFO: renamed from: f */
    private final boolean f45368f;

    /* JADX INFO: renamed from: g */
    private final boolean f45369g;

    /* JADX INFO: renamed from: h */
    private final int f45370h;

    /* JADX INFO: renamed from: i */
    private final int f45371i;

    /* JADX INFO: renamed from: j */
    private final boolean f45372j;

    /* JADX INFO: renamed from: k */
    private final boolean f45373k;

    /* JADX INFO: renamed from: l */
    private final boolean f45374l;

    /* JADX INFO: renamed from: m */
    private String f45375m;

    /* JADX INFO: renamed from: dg.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private boolean f45376a;

        /* JADX INFO: renamed from: b */
        private boolean f45377b;

        /* JADX INFO: renamed from: c */
        private int f45378c = -1;

        /* JADX INFO: renamed from: d */
        private int f45379d = -1;

        /* JADX INFO: renamed from: e */
        private int f45380e = -1;

        /* JADX INFO: renamed from: f */
        private boolean f45381f;

        /* JADX INFO: renamed from: g */
        private boolean f45382g;

        /* JADX INFO: renamed from: h */
        private boolean f45383h;

        private final int b(long j10) {
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final C4623d a() {
            return new C4623d(this.f45376a, this.f45377b, this.f45378c, -1, false, false, false, this.f45379d, this.f45380e, this.f45381f, this.f45382g, this.f45383h, null, null);
        }

        public final a c(int i10, TimeUnit timeUnit) {
            AbstractC5504s.h(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f45379d = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final a d() {
            this.f45376a = true;
            return this;
        }

        public final a e() {
            this.f45377b = true;
            return this;
        }

        public final a f() {
            this.f45381f = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: dg.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (Df.r.V(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x00e6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final dg.C4623d b(dg.t r33) {
            /*
                Method dump skipped, instruction units count: 426
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dg.C4623d.b.b(dg.t):dg.d");
        }

        private b() {
        }
    }

    public /* synthetic */ C4623d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public final boolean a() {
        return this.f45367e;
    }

    public final boolean b() {
        return this.f45368f;
    }

    public final int c() {
        return this.f45365c;
    }

    public final int d() {
        return this.f45370h;
    }

    public final int e() {
        return this.f45371i;
    }

    public final boolean f() {
        return this.f45369g;
    }

    public final boolean g() {
        return this.f45363a;
    }

    public final boolean h() {
        return this.f45364b;
    }

    public final boolean i() {
        return this.f45372j;
    }

    public String toString() {
        String str = this.f45375m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f45363a) {
            sb2.append("no-cache, ");
        }
        if (this.f45364b) {
            sb2.append("no-store, ");
        }
        if (this.f45365c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f45365c);
            sb2.append(", ");
        }
        if (this.f45366d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f45366d);
            sb2.append(", ");
        }
        if (this.f45367e) {
            sb2.append("private, ");
        }
        if (this.f45368f) {
            sb2.append("public, ");
        }
        if (this.f45369g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f45370h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f45370h);
            sb2.append(", ");
        }
        if (this.f45371i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f45371i);
            sb2.append(", ");
        }
        if (this.f45372j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f45373k) {
            sb2.append("no-transform, ");
        }
        if (this.f45374l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        this.f45375m = string;
        return string;
    }

    private C4623d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f45363a = z10;
        this.f45364b = z11;
        this.f45365c = i10;
        this.f45366d = i11;
        this.f45367e = z12;
        this.f45368f = z13;
        this.f45369g = z14;
        this.f45370h = i12;
        this.f45371i = i13;
        this.f45372j = z15;
        this.f45373k = z16;
        this.f45374l = z17;
        this.f45375m = str;
    }
}
