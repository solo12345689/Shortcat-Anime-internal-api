package t0;

import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final F f60202A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final AbstractC6580c f60203B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final AbstractC6580c[] f60204C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f60205a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f60206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f60207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float[] f60208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final G f60209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final G f60210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final G f60211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final G f60212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final F f60213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final F f60214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final F f60215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final F f60216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final F f60217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final F f60218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final F f60219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final F f60220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final F f60221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final F f60222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final F f60223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final F f60224t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final F f60225u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final F f60226v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final AbstractC6580c f60227w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final AbstractC6580c f60228x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final F f60229y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final F f60230z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f60206b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f60207c = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        f60208d = fArr3;
        G g10 = new G(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f60209e = g10;
        G g11 = new G(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f60210f = g11;
        G g12 = new G(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f60211g = g12;
        G g13 = new G(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f60212h = g13;
        o oVar = o.f60242a;
        F f10 = new F("sRGB IEC61966-2.1", fArr, oVar.e(), g10, 0);
        f60213i = f10;
        F f11 = new F("sRGB IEC61966-2.1 (Linear)", fArr, oVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f60214j = f11;
        F f12 = new F("scRGB-nl IEC 61966-2-2:2003", fArr, oVar.e(), null, new n() { // from class: t0.e
            @Override // t0.n
            public final double a(double d10) {
                return k.k(d10);
            }
        }, new n() { // from class: t0.f
            @Override // t0.n
            public final double a(double d10) {
                return k.l(d10);
            }
        }, -0.799f, 2.399f, g10, 2);
        f60215k = f12;
        F f13 = new F("scRGB IEC 61966-2-2:2003", fArr, oVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f60216l = f13;
        F f14 = new F("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, oVar.e(), new G(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f60217m = f14;
        F f15 = new F("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, oVar.e(), new G(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f60218n = f15;
        F f16 = new F("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new I(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f60219o = f16;
        F f17 = new F("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, oVar.e(), g10, 7);
        f60220p = f17;
        F f18 = new F("NTSC (1953)", fArr2, oVar.a(), new G(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f60221q = f18;
        F f19 = new F("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, oVar.e(), new G(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f60222r = f19;
        F f20 = new F("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, oVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f60223s = f20;
        F f21 = new F("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, oVar.b(), new G(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f60224t = f21;
        F f22 = new F("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, oVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f60225u = f22;
        F f23 = new F("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, oVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f60226v = f23;
        J j10 = new J("Generic XYZ", 14);
        f60227w = j10;
        p pVar = new p("Generic L*a*b*", 15);
        f60228x = pVar;
        F f24 = new F("None", fArr, oVar.e(), g11, 16);
        f60229y = f24;
        F f25 = new F("Hybrid Log Gamma encoding", fArr3, oVar.e(), null, new n() { // from class: t0.g
            @Override // t0.n
            public final double a(double d10) {
                return k.g(d10);
            }
        }, new n() { // from class: t0.h
            @Override // t0.n
            public final double a(double d10) {
                return k.h(d10);
            }
        }, 0.0f, 1.0f, g12, 17);
        f60230z = f25;
        F f26 = new F("Perceptual Quantizer encoding", fArr3, oVar.e(), null, new n() { // from class: t0.i
            @Override // t0.n
            public final double a(double d10) {
                return k.i(d10);
            }
        }, new n() { // from class: t0.j
            @Override // t0.n
            public final double a(double d10) {
                return k.j(d10);
            }
        }, 0.0f, 1.0f, g13, 18);
        f60202A = f26;
        q qVar = new q("Oklab", 19);
        f60203B = qVar;
        f60204C = new AbstractC6580c[]{f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, j10, pVar, f24, f25, f26, qVar};
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(double d10) {
        return f60205a.K(f60211g, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double h(double d10) {
        return f60205a.J(f60211g, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(double d10) {
        return f60205a.M(f60212h, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(double d10) {
        return f60205a.L(f60212h, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double k(double d10) {
        return AbstractC6581d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double l(double d10) {
        return AbstractC6581d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final F A() {
        return f60214j;
    }

    public final F B() {
        return f60221q;
    }

    public final float[] C() {
        return f60207c;
    }

    public final AbstractC6580c D() {
        return f60203B;
    }

    public final F E() {
        return f60224t;
    }

    public final F F() {
        return f60222r;
    }

    public final F G() {
        return f60213i;
    }

    public final float[] H() {
        return f60206b;
    }

    public final F I() {
        return f60229y;
    }

    public final double J(G g10, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double dA = g10.a();
        double dB = g10.b();
        double dC = g10.c();
        double d13 = g10.d();
        double dE = g10.e();
        double d14 = dA * d12;
        return (g10.f() + 1.0d) * d11 * (d14 <= 1.0d ? Math.pow(d14, dB) : Math.exp((d12 - dE) * dC) + d13);
    }

    public final double K(G g10, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double dA = 1.0d / g10.a();
        double dB = 1.0d / g10.b();
        double dC = 1.0d / g10.c();
        double d12 = g10.d();
        double dE = g10.e();
        double dF = (d10 * d11) / (g10.f() + 1.0d);
        return d11 * (dF <= 1.0d ? dA * Math.pow(dF, dB) : (dC * Math.log(dF - d12)) + dE);
    }

    public final double L(G g10, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        return d11 * Math.pow(AbstractC5874j.c(g10.a() + (g10.b() * Math.pow(d12, g10.c())), 0.0d) / (g10.d() + (g10.e() * Math.pow(d12, g10.c()))), g10.f());
    }

    public final double M(G g10, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -g10.a();
        double d14 = g10.d();
        double dF = 1.0d / g10.f();
        return d11 * Math.pow(Math.max(d13 + (d14 * Math.pow(d12, dF)), 0.0d) / (g10.b() + ((-g10.e()) * Math.pow(d12, dF))), 1.0d / g10.c());
    }

    public final F m() {
        return f60225u;
    }

    public final F n() {
        return f60226v;
    }

    public final F o() {
        return f60223s;
    }

    public final F p() {
        return f60218n;
    }

    public final F q() {
        return f60230z;
    }

    public final F r() {
        return f60202A;
    }

    public final F s() {
        return f60217m;
    }

    public final AbstractC6580c t() {
        return f60228x;
    }

    public final AbstractC6580c u() {
        return f60227w;
    }

    public final AbstractC6580c[] v() {
        return f60204C;
    }

    public final F w() {
        return f60219o;
    }

    public final F x() {
        return f60220p;
    }

    public final F y() {
        return f60215k;
    }

    public final F z() {
        return f60216l;
    }
}
