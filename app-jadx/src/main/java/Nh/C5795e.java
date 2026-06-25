package nh;

/* JADX INFO: renamed from: nh.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5795e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5793c f54166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5795e f54142d = new C5795e("sha2-128f", new a(16, 16, 22, 6, 33, 66), 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C5795e f54143e = new C5795e("sha2-128s", new a(16, 16, 7, 12, 14, 63), 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C5795e f54144f = new C5795e("sha2-192f", new a(24, 16, 22, 8, 33, 66), 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C5795e f54145g = new C5795e("sha2-192s", new a(24, 16, 7, 14, 17, 63), 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5795e f54146h = new C5795e("sha2-256f", new a(32, 16, 17, 9, 35, 68), 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5795e f54147i = new C5795e("sha2-256s", new a(32, 16, 8, 14, 22, 64), 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C5795e f54148j = new C5795e("shake-128f", new b(16, 16, 22, 6, 33, 66), 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5795e f54149k = new C5795e("shake-128s", new b(16, 16, 7, 12, 14, 63), 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5795e f54150l = new C5795e("shake-192f", new b(24, 16, 22, 8, 33, 66), 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5795e f54151m = new C5795e("shake-192s", new b(24, 16, 7, 14, 17, 63), 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5795e f54152n = new C5795e("shake-256f", new b(32, 16, 17, 9, 35, 68), 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5795e f54153o = new C5795e("shake-256s", new b(32, 16, 8, 14, 22, 64), 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5795e f54154p = new C5795e("sha2-128f-with-sha256", new a(16, 16, 22, 6, 33, 66), 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5795e f54155q = new C5795e("sha2-128s-with-sha256", new a(16, 16, 7, 12, 14, 63), 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C5795e f54156r = new C5795e("sha2-192f-with-sha512", new a(24, 16, 22, 8, 33, 66), 2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C5795e f54157s = new C5795e("sha2-192s-with-sha512", new a(24, 16, 7, 14, 17, 63), 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C5795e f54158t = new C5795e("sha2-256f-with-sha512", new a(32, 16, 17, 9, 35, 68), 2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C5795e f54159u = new C5795e("sha2-256s-with-sha512", new a(32, 16, 8, 14, 22, 64), 2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C5795e f54160v = new C5795e("shake-128f-with-shake128", new b(16, 16, 22, 6, 33, 66), 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C5795e f54161w = new C5795e("shake-128s-with-shake128", new b(16, 16, 7, 12, 14, 63), 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C5795e f54162x = new C5795e("shake-192f-with-shake256", new b(24, 16, 22, 8, 33, 66), 4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C5795e f54163y = new C5795e("shake-192s-with-shake256", new b(24, 16, 7, 14, 17, 63), 4);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C5795e f54164z = new C5795e("shake-256f-with-shake256", new b(32, 16, 17, 9, 35, 68), 4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C5795e f54141A = new C5795e("shake-256s-with-shake256", new b(32, 16, 8, 14, 22, 64), 4);

    /* JADX INFO: renamed from: nh.e$a */
    private static class a implements InterfaceC5793c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f54171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f54172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f54173f;

        public a(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f54168a = i10;
            this.f54169b = i11;
            this.f54170c = i12;
            this.f54171d = i13;
            this.f54172e = i14;
            this.f54173f = i15;
        }

        @Override // nh.InterfaceC5793c
        public int a() {
            return this.f54168a;
        }
    }

    /* JADX INFO: renamed from: nh.e$b */
    private static class b implements InterfaceC5793c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f54177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f54178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f54179f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f54174a = i10;
            this.f54175b = i11;
            this.f54176c = i12;
            this.f54177d = i13;
            this.f54178e = i14;
            this.f54179f = i15;
        }

        @Override // nh.InterfaceC5793c
        public int a() {
            return this.f54174a;
        }
    }

    private C5795e(String str, InterfaceC5793c interfaceC5793c, int i10) {
        this.f54165a = str;
        this.f54166b = interfaceC5793c;
        this.f54167c = i10;
    }

    public int a() {
        return this.f54166b.a();
    }
}
