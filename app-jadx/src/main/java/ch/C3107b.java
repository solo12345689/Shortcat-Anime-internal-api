package ch;

/* JADX INFO: renamed from: ch.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C3107b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int[] f33653C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f33655E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private C3106a f33656F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33668l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f33673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f33674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f33675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33676t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f33677u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f33678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f33680x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33669m = 40;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f33670n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte f33671o = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f33681y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f33682z = 4;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f33651A = 16;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f33652B = 2;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f33654D = 64;

    public C3107b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int[] iArr) {
        this.f33657a = i10;
        this.f33660d = i13;
        this.f33661e = i15;
        this.f33662f = i16;
        this.f33663g = i17;
        this.f33664h = i18;
        this.f33658b = i11;
        this.f33659c = i12;
        int i21 = i11 * i12;
        this.f33673q = i21;
        this.f33653C = iArr;
        this.f33665i = i14;
        this.f33666j = i19;
        this.f33667k = i20;
        this.f33668l = (int) Math.ceil(i12 / 128);
        this.f33672p = g.b(i10);
        this.f33675s = i13;
        this.f33674r = g.a(i10);
        this.f33676t = g.b(i13);
        this.f33677u = g.b(i11);
        this.f33678v = g.a(i21);
        this.f33679w = g.b(i21);
        this.f33680x = g.b(i11);
        long j10 = (1 << ((int) (((long) i10) % 64))) - 1;
        this.f33655E = j10;
        this.f33656F = new C3106a(this.f33674r, i10, j10);
    }
}
