package oh;

/* JADX INFO: renamed from: oh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5901a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f55632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f55633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f55634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f55635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f55636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f55637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5901a f55612i = new C5901a("SNOVA_24_5_4_SSK", 24, 5, 4, true, false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C5901a f55613j = new C5901a("SNOVA_24_5_4_ESK", 24, 5, 4, false, false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5901a f55614k = new C5901a("SNOVA_24_5_4_SHAKE_SSK", 24, 5, 4, true, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5901a f55615l = new C5901a("SNOVA_24_5_4_SHAKE_ESK", 24, 5, 4, false, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5901a f55616m = new C5901a("SNOVA_24_5_5_SSK", 24, 5, 5, true, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5901a f55617n = new C5901a("SNOVA_24_5_5_ESK", 24, 5, 5, false, false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5901a f55618o = new C5901a("SNOVA_24_5_5_SHAKE_SSK", 24, 5, 5, true, true);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5901a f55619p = new C5901a("SNOVA_24_5_5_SHAKE_ESK", 24, 5, 5, false, true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5901a f55620q = new C5901a("SNOVA_25_8_3_SSK", 25, 8, 3, true, false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C5901a f55621r = new C5901a("SNOVA_25_8_3_ESK", 25, 8, 3, false, false);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C5901a f55622s = new C5901a("SNOVA_25_8_3_SHAKE_SSK", 25, 8, 3, true, true);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C5901a f55623t = new C5901a("SNOVA_25_8_3_SHAKE_ESK", 25, 8, 3, false, true);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C5901a f55624u = new C5901a("SNOVA_29_6_5_SSK", 29, 6, 5, true, false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C5901a f55625v = new C5901a("SNOVA_29_6_5_ESK", 29, 6, 5, false, false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C5901a f55626w = new C5901a("SNOVA_29_6_5_SHAKE_SSK", 29, 6, 5, true, true);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C5901a f55627x = new C5901a("SNOVA_29_6_5_SHAKE_ESK", 29, 6, 5, false, true);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C5901a f55628y = new C5901a("SNOVA_37_8_4_SSK", 37, 8, 4, true, false);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C5901a f55629z = new C5901a("SNOVA_37_8_4_ESK", 37, 8, 4, false, false);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C5901a f55586A = new C5901a("SNOVA_37_8_4_SHAKE_SSK", 37, 8, 4, true, true);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C5901a f55587B = new C5901a("SNOVA_37_8_4_SHAKE_ESK", 37, 8, 4, false, true);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C5901a f55588C = new C5901a("SNOVA_37_17_2_SSK", 37, 17, 2, true, false);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C5901a f55589D = new C5901a("SNOVA_37_17_2_ESK", 37, 17, 2, false, false);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C5901a f55590E = new C5901a("SNOVA_37_17_2_SHAKE_SSK", 37, 17, 2, true, true);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C5901a f55591F = new C5901a("SNOVA_37_17_2_SHAKE_ESK", 37, 17, 2, false, true);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C5901a f55592G = new C5901a("SNOVA_49_11_3_SSK", 49, 11, 3, true, false);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C5901a f55593H = new C5901a("SNOVA_49_11_3_ESK", 49, 11, 3, false, false);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C5901a f55594I = new C5901a("SNOVA_49_11_3_SHAKE_SSK", 49, 11, 3, true, true);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final C5901a f55595J = new C5901a("SNOVA_49_11_3_SHAKE_ESK", 49, 11, 3, false, true);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C5901a f55596K = new C5901a("SNOVA_56_25_2_SSK", 56, 25, 2, true, false);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final C5901a f55597L = new C5901a("SNOVA_56_25_2_ESK", 56, 25, 2, false, false);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C5901a f55598M = new C5901a("SNOVA_56_25_2_SHAKE_SSK", 56, 25, 2, true, true);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C5901a f55599N = new C5901a("SNOVA_56_25_2_SHAKE_ESK", 56, 25, 2, false, true);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C5901a f55600O = new C5901a("SNOVA_60_10_4_SSK", 60, 10, 4, true, false);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final C5901a f55601P = new C5901a("SNOVA_60_10_4_ESK", 60, 10, 4, false, false);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final C5901a f55602Q = new C5901a("SNOVA_60_10_4_SHAKE_SSK", 60, 10, 4, true, true);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final C5901a f55603R = new C5901a("SNOVA_60_10_4_SHAKE_ESK", 60, 10, 4, false, true);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final C5901a f55604S = new C5901a("SNOVA_66_15_3_SSK", 66, 15, 3, true, false);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final C5901a f55605T = new C5901a("SNOVA_66_15_3_ESK", 66, 15, 3, false, false);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final C5901a f55606U = new C5901a("SNOVA_66_15_3_SHAKE_SSK", 66, 15, 3, true, true);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final C5901a f55607V = new C5901a("SNOVA_66_15_3_SHAKE_ESK", 66, 15, 3, false, true);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final C5901a f55608W = new C5901a("SNOVA_75_33_2_SSK", 75, 33, 2, true, false);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final C5901a f55609X = new C5901a("SNOVA_75_33_2_ESK", 75, 33, 2, false, false);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final C5901a f55610Y = new C5901a("SNOVA_75_33_2_SHAKE_SSK", 75, 33, 2, true, true);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final C5901a f55611Z = new C5901a("SNOVA_75_33_2_SHAKE_ESK", 75, 33, 2, false, true);

    private C5901a(String str, int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f55630a = str;
        this.f55631b = i10;
        this.f55632c = i11;
        this.f55633d = i12;
        int i13 = i12 * i12;
        this.f55634e = i13;
        this.f55635f = i13 + i12;
        this.f55636g = z10;
        this.f55637h = z11;
    }

    public String a() {
        return this.f55630a;
    }
}
