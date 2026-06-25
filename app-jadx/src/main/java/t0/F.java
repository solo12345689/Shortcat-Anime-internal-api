package t0;

import Ud.AbstractC2273n;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import s0.AbstractC6387s0;
import t0.F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC6580c {

    /* JADX INFO: renamed from: t */
    public static final a f60160t = new a(null);

    /* JADX INFO: renamed from: u */
    private static final n f60161u = new n() { // from class: t0.u
        @Override // t0.n
        public final double a(double d10) {
            return F.p(d10);
        }
    };

    /* JADX INFO: renamed from: e */
    private final I f60162e;

    /* JADX INFO: renamed from: f */
    private final float f60163f;

    /* JADX INFO: renamed from: g */
    private final float f60164g;

    /* JADX INFO: renamed from: h */
    private final G f60165h;

    /* JADX INFO: renamed from: i */
    private final float[] f60166i;

    /* JADX INFO: renamed from: j */
    private final float[] f60167j;

    /* JADX INFO: renamed from: k */
    private final float[] f60168k;

    /* JADX INFO: renamed from: l */
    private final n f60169l;

    /* JADX INFO: renamed from: m */
    private final Function1 f60170m;

    /* JADX INFO: renamed from: n */
    private final n f60171n;

    /* JADX INFO: renamed from: o */
    private final n f60172o;

    /* JADX INFO: renamed from: p */
    private final Function1 f60173p;

    /* JADX INFO: renamed from: q */
    private final n f60174q;

    /* JADX INFO: renamed from: r */
    private final boolean f60175r;

    /* JADX INFO: renamed from: s */
    private final boolean f60176s;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final double A(G g10, double d10) {
            return AbstractC6581d.o(d10, g10.a(), g10.b(), g10.c(), g10.d(), g10.g());
        }

        public static final double B(G g10, double d10) {
            return AbstractC6581d.p(d10, g10.a(), g10.b(), g10.c(), g10.d(), g10.e(), g10.f(), g10.g());
        }

        public final boolean C(float[] fArr, I i10, n nVar, n nVar2, float f10, float f11, int i11) {
            if (i11 == 0) {
                return true;
            }
            k kVar = k.f60205a;
            if (!AbstractC6581d.g(fArr, kVar.H()) || !AbstractC6581d.f(i10, o.f60242a.e()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            F fG = kVar.G();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!p(d10, nVar, fG.B()) || !p(d10, nVar2, fG.x())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean D(float[] fArr, float f10, float f11) {
            float fO = o(fArr);
            k kVar = k.f60205a;
            if (fO / o(kVar.C()) <= 0.9f || !r(fArr, kVar.H())) {
                return f10 < 0.0f && f11 > 1.0f;
            }
            return true;
        }

        public final float[] E(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                AbstractC2273n.o(fArr, fArr2, 0, 0, 6, 6, null);
                return fArr2;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = f10 + f11 + fArr[2];
            fArr2[0] = f10 / f12;
            fArr2[1] = f11 / f12;
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = f13 + f14 + fArr[5];
            fArr2[2] = f13 / f15;
            fArr2[3] = f14 / f15;
            float f16 = fArr[6];
            float f17 = fArr[7];
            float f18 = f16 + f17 + fArr[8];
            fArr2[4] = f16 / f18;
            fArr2[5] = f17 / f18;
            return fArr2;
        }

        private final float o(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean p(double d10, n nVar, n nVar2) {
            return Math.abs(nVar.a(d10) - nVar2.a(d10)) <= 0.001d;
        }

        public final float[] q(float[] fArr, I i10) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float fA = i10.a();
            float fB = i10.b();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - fA) / fB;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (fA / fB) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean r(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[2];
            float f15 = fArr2[2];
            float f16 = fArr[3];
            float f17 = fArr2[3];
            float f18 = fArr[4];
            float f19 = fArr2[4];
            float f20 = fArr[5];
            float f21 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, f14 - f15, f16 - f17, f18 - f19, f20 - f21};
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            if (((f13 - f21) * f22) - ((f11 - f19) * f23) >= 0.0f && ((f11 - f15) * f23) - ((f13 - f17) * f22) >= 0.0f) {
                float f24 = fArr3[2];
                float f25 = fArr3[3];
                if (((f17 - f13) * f24) - ((f15 - f11) * f25) >= 0.0f && ((f15 - f19) * f25) - ((f17 - f21) * f24) >= 0.0f) {
                    float f26 = fArr3[4];
                    float f27 = fArr3[5];
                    if (((f21 - f17) * f26) - ((f19 - f15) * f27) >= 0.0f && ((f19 - f11) * f27) - ((f21 - f13) * f26) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final n s(final G g10) {
            return g10.h() ? new n() { // from class: t0.x
                @Override // t0.n
                public final double a(double d10) {
                    return F.a.t(g10, d10);
                }
            } : g10.i() ? new n() { // from class: t0.y
                @Override // t0.n
                public final double a(double d10) {
                    return F.a.u(g10, d10);
                }
            } : (g10.e() == 0.0d && g10.f() == 0.0d) ? new n() { // from class: t0.z
                @Override // t0.n
                public final double a(double d10) {
                    return F.a.v(g10, d10);
                }
            } : new n() { // from class: t0.A
                @Override // t0.n
                public final double a(double d10) {
                    return F.a.w(g10, d10);
                }
            };
        }

        public static final double t(G g10, double d10) {
            return k.f60205a.J(g10, d10);
        }

        public static final double u(G g10, double d10) {
            return k.f60205a.L(g10, d10);
        }

        public static final double v(G g10, double d10) {
            return AbstractC6581d.q(d10, g10.a(), g10.b(), g10.c(), g10.d(), g10.g());
        }

        public static final double w(G g10, double d10) {
            return AbstractC6581d.r(d10, g10.a(), g10.b(), g10.c(), g10.d(), g10.e(), g10.f(), g10.g());
        }

        public final n x(final G g10) {
            return g10.h() ? new n() { // from class: t0.B
                @Override // t0.n
                public final double a(double d10) {
                    return F.a.y(g10, d10);
                }
            } : g10.i() ? new n() { // from class: t0.C
                @Override // t0.n
                public final double a(double d10) {
                    return F.a.z(g10, d10);
                }
            } : (g10.e() == 0.0d && g10.f() == 0.0d) ? new n() { // from class: t0.D
                @Override // t0.n
                public final double a(double d10) {
                    return F.a.A(g10, d10);
                }
            } : new n() { // from class: t0.E
                @Override // t0.n
                public final double a(double d10) {
                    return F.a.B(g10, d10);
                }
            };
        }

        public static final double y(G g10, double d10) {
            return k.f60205a.K(g10, d10);
        }

        public static final double z(G g10, double d10) {
            return k.f60205a.M(g10, d10);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(F.this.x().a(AbstractC5874j.k(d10, F.this.f60163f, F.this.f60164g)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {
        c() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(AbstractC5874j.k(F.this.B().a(d10), F.this.f60163f, F.this.f60164g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    public F(String str, float[] fArr, I i10, float[] fArr2, n nVar, n nVar2, float f10, float f11, G g10, int i11) {
        super(str, AbstractC6579b.f60193a.b(), i11, null);
        this.f60162e = i10;
        this.f60163f = f10;
        this.f60164g = f11;
        this.f60165h = g10;
        this.f60169l = nVar;
        this.f60170m = new c();
        this.f60171n = new n() { // from class: t0.s
            @Override // t0.n
            public final double a(double d10) {
                return F.G(this.f60264a, d10);
            }
        };
        this.f60172o = nVar2;
        this.f60173p = new b();
        this.f60174q = new n() { // from class: t0.t
            @Override // t0.n
            public final double a(double d10) {
                return F.u(this.f60265a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        a aVar = f60160t;
        float[] fArrE = aVar.E(fArr);
        this.f60166i = fArrE;
        if (fArr2 == null) {
            this.f60167j = aVar.q(fArrE, i10);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f60167j = fArr2;
        }
        this.f60168k = AbstractC6581d.k(this.f60167j);
        this.f60175r = aVar.D(fArrE, f10, f11);
        this.f60176s = aVar.C(fArrE, i10, nVar, nVar2, f10, f11, i11);
    }

    public static final double G(F f10, double d10) {
        return AbstractC5874j.k(f10.f60169l.a(d10), f10.f60163f, f10.f60164g);
    }

    public static final double q(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    public static final double r(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    public static final double u(F f10, double d10) {
        return f10.f60172o.a(AbstractC5874j.k(d10, f10.f60163f, f10.f60164g));
    }

    public final n A() {
        return this.f60171n;
    }

    public final n B() {
        return this.f60169l;
    }

    public final float[] C() {
        return this.f60166i;
    }

    public final G D() {
        return this.f60165h;
    }

    public final float[] E() {
        return this.f60167j;
    }

    public final I F() {
        return this.f60162e;
    }

    @Override // t0.AbstractC6580c
    public float c(int i10) {
        return this.f60164g;
    }

    @Override // t0.AbstractC6580c
    public float d(int i10) {
        return this.f60163f;
    }

    @Override // t0.AbstractC6580c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        F f10 = (F) obj;
        if (Float.compare(f10.f60163f, this.f60163f) != 0 || Float.compare(f10.f60164g, this.f60164g) != 0 || !AbstractC5504s.c(this.f60162e, f10.f60162e) || !Arrays.equals(this.f60166i, f10.f60166i)) {
            return false;
        }
        G g10 = this.f60165h;
        if (g10 != null) {
            return AbstractC5504s.c(g10, f10.f60165h);
        }
        if (f10.f60165h == null) {
            return true;
        }
        if (AbstractC5504s.c(this.f60169l, f10.f60169l)) {
            return AbstractC5504s.c(this.f60172o, f10.f60172o);
        }
        return false;
    }

    @Override // t0.AbstractC6580c
    public boolean g() {
        return this.f60176s;
    }

    @Override // t0.AbstractC6580c
    public long h(float f10, float f11, float f12) {
        float fA = (float) this.f60174q.a(f10);
        float fA2 = (float) this.f60174q.a(f11);
        float fA3 = (float) this.f60174q.a(f12);
        float[] fArr = this.f60167j;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((fArr[0] * fA) + (fArr[3] * fA2)) + (fArr[6] * fA3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3))) & 4294967295L);
    }

    @Override // t0.AbstractC6580c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f60162e.hashCode()) * 31) + Arrays.hashCode(this.f60166i)) * 31;
        float f10 = this.f60163f;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f60164g;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        G g10 = this.f60165h;
        int iHashCode2 = iFloatToIntBits2 + (g10 != null ? g10.hashCode() : 0);
        return this.f60165h == null ? (((iHashCode2 * 31) + this.f60169l.hashCode()) * 31) + this.f60172o.hashCode() : iHashCode2;
    }

    @Override // t0.AbstractC6580c
    public float i(float f10, float f11, float f12) {
        float fA = (float) this.f60174q.a(f10);
        float fA2 = (float) this.f60174q.a(f11);
        float fA3 = (float) this.f60174q.a(f12);
        float[] fArr = this.f60167j;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // t0.AbstractC6580c
    public long j(float f10, float f11, float f12, float f13, AbstractC6580c abstractC6580c) {
        float[] fArr = this.f60168k;
        return AbstractC6387s0.a((float) this.f60171n.a((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12)), (float) this.f60171n.a((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12)), (float) this.f60171n.a((fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12)), f13, abstractC6580c);
    }

    public final Function1 v() {
        return this.f60173p;
    }

    public final n w() {
        return this.f60174q;
    }

    public final n x() {
        return this.f60172o;
    }

    public final float[] y() {
        return this.f60168k;
    }

    public final Function1 z() {
        return this.f60170m;
    }

    public static final double p(double d10) {
        return d10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(String str, float[] fArr, I i10, G g10, int i11) {
        a aVar = f60160t;
        this(str, fArr, i10, null, aVar.x(g10), aVar.s(g10), 0.0f, 1.0f, g10, i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(String str, float[] fArr, I i10, final double d10, float f10, float f11, int i11) {
        n nVar;
        n nVar2;
        if (d10 == 1.0d) {
            nVar = f60161u;
        } else {
            nVar = new n() { // from class: t0.v
                @Override // t0.n
                public final double a(double d11) {
                    return F.q(d10, d11);
                }
            };
        }
        n nVar3 = nVar;
        if (d10 == 1.0d) {
            nVar2 = f60161u;
        } else {
            nVar2 = new n() { // from class: t0.w
                @Override // t0.n
                public final double a(double d11) {
                    return F.r(d10, d11);
                }
            };
        }
        this(str, fArr, i10, null, nVar3, nVar2, f10, f11, new G(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i11);
    }

    public F(F f10, float[] fArr, I i10) {
        this(f10.f(), f10.f60166i, i10, fArr, f10.f60169l, f10.f60172o, f10.f60163f, f10.f60164g, f10.f60165h, -1);
    }
}
