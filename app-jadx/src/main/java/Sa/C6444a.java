package sa;

import ia.InterfaceC5048c;

/* JADX INFO: renamed from: sa.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6444a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final C6444a f59294p = new C0898a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f59295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f59298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f59299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f59300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f59301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f59302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f59303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f59304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f59305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f59306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f59307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f59308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f59309o;

    /* JADX INFO: renamed from: sa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0898a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f59310a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f59311b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f59312c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f59313d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f59314e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f59315f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f59316g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f59317h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f59318i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f59319j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f59320k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f59321l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f59322m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f59323n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f59324o = "";

        C0898a() {
        }

        public C6444a a() {
            return new C6444a(this.f59310a, this.f59311b, this.f59312c, this.f59313d, this.f59314e, this.f59315f, this.f59316g, this.f59317h, this.f59318i, this.f59319j, this.f59320k, this.f59321l, this.f59322m, this.f59323n, this.f59324o);
        }

        public C0898a b(String str) {
            this.f59322m = str;
            return this;
        }

        public C0898a c(String str) {
            this.f59316g = str;
            return this;
        }

        public C0898a d(String str) {
            this.f59324o = str;
            return this;
        }

        public C0898a e(b bVar) {
            this.f59321l = bVar;
            return this;
        }

        public C0898a f(String str) {
            this.f59312c = str;
            return this;
        }

        public C0898a g(String str) {
            this.f59311b = str;
            return this;
        }

        public C0898a h(c cVar) {
            this.f59313d = cVar;
            return this;
        }

        public C0898a i(String str) {
            this.f59315f = str;
            return this;
        }

        public C0898a j(int i10) {
            this.f59317h = i10;
            return this;
        }

        public C0898a k(long j10) {
            this.f59310a = j10;
            return this;
        }

        public C0898a l(d dVar) {
            this.f59314e = dVar;
            return this;
        }

        public C0898a m(String str) {
            this.f59319j = str;
            return this;
        }

        public C0898a n(int i10) {
            this.f59318i = i10;
            return this;
        }
    }

    /* JADX INFO: renamed from: sa.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b implements InterfaceC5048c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f59329a;

        b(int i10) {
            this.f59329a = i10;
        }

        @Override // ia.InterfaceC5048c
        public int d() {
            return this.f59329a;
        }
    }

    /* JADX INFO: renamed from: sa.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c implements InterfaceC5048c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f59335a;

        c(int i10) {
            this.f59335a = i10;
        }

        @Override // ia.InterfaceC5048c
        public int d() {
            return this.f59335a;
        }
    }

    /* JADX INFO: renamed from: sa.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum d implements InterfaceC5048c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f59341a;

        d(int i10) {
            this.f59341a = i10;
        }

        @Override // ia.InterfaceC5048c
        public int d() {
            return this.f59341a;
        }
    }

    C6444a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f59295a = j10;
        this.f59296b = str;
        this.f59297c = str2;
        this.f59298d = cVar;
        this.f59299e = dVar;
        this.f59300f = str3;
        this.f59301g = str4;
        this.f59302h = i10;
        this.f59303i = i11;
        this.f59304j = str5;
        this.f59305k = j11;
        this.f59306l = bVar;
        this.f59307m = str6;
        this.f59308n = j12;
        this.f59309o = str7;
    }

    public static C0898a p() {
        return new C0898a();
    }

    public String a() {
        return this.f59307m;
    }

    public long b() {
        return this.f59305k;
    }

    public long c() {
        return this.f59308n;
    }

    public String d() {
        return this.f59301g;
    }

    public String e() {
        return this.f59309o;
    }

    public b f() {
        return this.f59306l;
    }

    public String g() {
        return this.f59297c;
    }

    public String h() {
        return this.f59296b;
    }

    public c i() {
        return this.f59298d;
    }

    public String j() {
        return this.f59300f;
    }

    public int k() {
        return this.f59302h;
    }

    public long l() {
        return this.f59295a;
    }

    public d m() {
        return this.f59299e;
    }

    public String n() {
        return this.f59304j;
    }

    public int o() {
        return this.f59303i;
    }
}
