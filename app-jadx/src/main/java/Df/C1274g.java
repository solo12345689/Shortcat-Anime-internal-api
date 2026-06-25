package Df;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Df.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1274g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f3740d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C1274g f3741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1274g f3742f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f3744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f3745c;

    /* JADX INFO: renamed from: Df.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C0044a f3746j = new C0044a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a f3747k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f3750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f3751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f3752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f3753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f3754g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f3755h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f3756i;

        /* JADX INFO: renamed from: Df.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0044a {
            public /* synthetic */ C0044a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f3747k;
            }

            private C0044a() {
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            AbstractC5504s.h(groupSeparator, "groupSeparator");
            AbstractC5504s.h(byteSeparator, "byteSeparator");
            AbstractC5504s.h(bytePrefix, "bytePrefix");
            AbstractC5504s.h(byteSuffix, "byteSuffix");
            this.f3748a = i10;
            this.f3749b = i11;
            this.f3750c = groupSeparator;
            this.f3751d = byteSeparator;
            this.f3752e = bytePrefix;
            this.f3753f = byteSuffix;
            this.f3754g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f3755h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f3756i = AbstractC1275h.b(groupSeparator) || AbstractC1275h.b(byteSeparator) || AbstractC1275h.b(bytePrefix) || AbstractC1275h.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            AbstractC5504s.h(sb2, "sb");
            AbstractC5504s.h(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f3748a);
            sb2.append(com.amazon.a.a.o.b.f.f34694a);
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f3749b);
            sb2.append(com.amazon.a.a.o.b.f.f34694a);
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f3750c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f3751d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f3752e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f3753f);
            sb2.append("\"");
            return sb2;
        }

        public final String c() {
            return this.f3752e;
        }

        public final String d() {
            return this.f3751d;
        }

        public final String e() {
            return this.f3753f;
        }

        public final int f() {
            return this.f3749b;
        }

        public final int g() {
            return this.f3748a;
        }

        public final String h() {
            return this.f3750c;
        }

        public final boolean i() {
            return this.f3756i;
        }

        public final boolean j() {
            return this.f3754g;
        }

        public final boolean k() {
            return this.f3755h;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: Df.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1274g a() {
            return C1274g.f3741e;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: Df.g$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f3757h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f3758i = new c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f3761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f3762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f3763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f3764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f3765g;

        /* JADX INFO: renamed from: Df.g$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f3758i;
            }

            private a() {
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            AbstractC5504s.h(prefix, "prefix");
            AbstractC5504s.h(suffix, "suffix");
            this.f3759a = prefix;
            this.f3760b = suffix;
            this.f3761c = z10;
            this.f3762d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f3763e = z11;
            this.f3764f = z11 && i10 == 1;
            this.f3765g = AbstractC1275h.b(prefix) || AbstractC1275h.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            AbstractC5504s.h(sb2, "sb");
            AbstractC5504s.h(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f3759a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f3760b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f3761c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f3762d);
            return sb2;
        }

        public final boolean c() {
            return this.f3765g;
        }

        public final String d() {
            return this.f3759a;
        }

        public final String e() {
            return this.f3760b;
        }

        public final boolean f() {
            return this.f3763e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C0044a c0044a = a.f3746j;
        a aVarA = c0044a.a();
        c.a aVar = c.f3757h;
        f3741e = new C1274g(false, aVarA, aVar.a());
        f3742f = new C1274g(true, c0044a.a(), aVar.a());
    }

    public C1274g(boolean z10, a bytes, c number) {
        AbstractC5504s.h(bytes, "bytes");
        AbstractC5504s.h(number, "number");
        this.f3743a = z10;
        this.f3744b = bytes;
        this.f3745c = number;
    }

    public final a b() {
        return this.f3744b;
    }

    public final c c() {
        return this.f3745c;
    }

    public final boolean d() {
        return this.f3743a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f3743a);
        sb2.append(com.amazon.a.a.o.b.f.f34694a);
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f3744b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f3745c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
