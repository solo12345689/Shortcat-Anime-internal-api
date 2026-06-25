package b2;

import b2.AbstractC2976h;

/* JADX INFO: renamed from: b2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2982n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f33078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f33079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f33081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f33082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f33083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f33084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f33085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f33086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC2976h.p f33087j;

    public C2982n() {
        this.f33078a = Math.sqrt(1500.0d);
        this.f33079b = 0.5d;
        this.f33080c = false;
        this.f33086i = Double.MAX_VALUE;
        this.f33087j = new AbstractC2976h.p();
    }

    private void d() {
        if (this.f33080c) {
            return;
        }
        if (this.f33086i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f33079b;
        if (d10 > 1.0d) {
            double d11 = this.f33078a;
            this.f33083f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f33079b;
            double d13 = this.f33078a;
            this.f33084g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f33085h = this.f33078a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f33080c = true;
    }

    public float a() {
        return (float) this.f33079b;
    }

    public float b() {
        return (float) this.f33086i;
    }

    public float c() {
        double d10 = this.f33078a;
        return (float) (d10 * d10);
    }

    public boolean e(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f33082e && ((double) Math.abs(f10 - b())) < this.f33081d;
    }

    public C2982n f(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f33079b = f10;
        this.f33080c = false;
        return this;
    }

    public C2982n g(float f10) {
        this.f33086i = f10;
        return this;
    }

    public C2982n h(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f33078a = Math.sqrt(f10);
        this.f33080c = false;
        return this;
    }

    void i(double d10) {
        double dAbs = Math.abs(d10);
        this.f33081d = dAbs;
        this.f33082e = dAbs * 62.5d;
    }

    AbstractC2976h.p j(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        d();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f33086i;
        double d14 = this.f33079b;
        if (d14 > 1.0d) {
            double d15 = this.f33084g;
            double d16 = this.f33083f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f33083f * d12) * d18);
            double d19 = this.f33084g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f33083f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f33078a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f33078a) * d12);
            double d24 = this.f33078a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f33085h;
            double d26 = this.f33078a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f33085h * d12) * d13) + (Math.sin(this.f33085h * d12) * d27));
            double d28 = this.f33078a;
            double d29 = this.f33079b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f33085h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f33085h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        AbstractC2976h.p pVar = this.f33087j;
        pVar.f33069a = (float) (dPow + this.f33086i);
        pVar.f33070b = (float) dCos;
        return pVar;
    }

    public C2982n(float f10) {
        this.f33078a = Math.sqrt(1500.0d);
        this.f33079b = 0.5d;
        this.f33080c = false;
        this.f33086i = Double.MAX_VALUE;
        this.f33087j = new AbstractC2976h.p();
        this.f33086i = f10;
    }
}
