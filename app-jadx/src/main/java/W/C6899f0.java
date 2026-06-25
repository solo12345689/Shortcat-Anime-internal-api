package w;

/* JADX INFO: renamed from: w.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6899f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f62510a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f62513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f62514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f62515f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f62511b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f62516g = 1.0f;

    public C6899f0(float f10) {
        this.f62510a = f10;
    }

    private final void c() {
        if (this.f62512c) {
            return;
        }
        if (this.f62510a == AbstractC6901g0.b()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f10 = this.f62516g;
        double d10 = ((double) f10) * ((double) f10);
        if (f10 > 1.0f) {
            double d11 = this.f62511b;
            double d12 = d10 - ((double) 1);
            this.f62513d = (((double) (-f10)) * d11) + (d11 * Math.sqrt(d12));
            double d13 = -this.f62516g;
            double d14 = this.f62511b;
            this.f62514e = (d13 * d14) - (d14 * Math.sqrt(d12));
        } else if (f10 >= 0.0f && f10 < 1.0f) {
            this.f62515f = this.f62511b * Math.sqrt(((double) 1) - d10);
        }
        this.f62512c = true;
    }

    public final float a() {
        return this.f62516g;
    }

    public final float b() {
        double d10 = this.f62511b;
        return (float) (d10 * d10);
    }

    public final void d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f62516g = f10;
        this.f62512c = false;
    }

    public final void e(float f10) {
        this.f62510a = f10;
    }

    public final void f(float f10) {
        if (b() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f62511b = Math.sqrt(f10);
        this.f62512c = false;
    }

    public final long g(float f10, float f11, long j10) {
        double dCos;
        double dExp;
        c();
        float f12 = f10 - this.f62510a;
        double d10 = j10 / 1000.0d;
        float f13 = this.f62516g;
        if (f13 > 1.0f) {
            double d11 = f12;
            double d12 = this.f62514e;
            double d13 = f11;
            double d14 = this.f62513d;
            double d15 = d11 - (((d12 * d11) - d13) / (d12 - d14));
            double d16 = ((d11 * d12) - d13) / (d12 - d14);
            dExp = (Math.exp(d12 * d10) * d15) + (Math.exp(this.f62513d * d10) * d16);
            double d17 = this.f62514e;
            double dExp2 = d15 * d17 * Math.exp(d17 * d10);
            double d18 = this.f62513d;
            dCos = dExp2 + (d16 * d18 * Math.exp(d18 * d10));
        } else if (f13 == 1.0f) {
            double d19 = this.f62511b;
            double d20 = f12;
            double d21 = ((double) f11) + (d19 * d20);
            double d22 = d20 + (d21 * d10);
            double dExp3 = Math.exp((-d19) * d10) * d22;
            double dExp4 = d22 * Math.exp((-this.f62511b) * d10);
            double d23 = this.f62511b;
            dCos = (dExp4 * (-d23)) + (d21 * Math.exp((-d23) * d10));
            dExp = dExp3;
        } else {
            double d24 = ((double) 1) / this.f62515f;
            double d25 = this.f62511b;
            double d26 = f12;
            double d27 = d24 * ((((double) f13) * d25 * d26) + ((double) f11));
            double dExp5 = Math.exp(((double) (-f13)) * d25 * d10) * ((Math.cos(this.f62515f * d10) * d26) + (Math.sin(this.f62515f * d10) * d27));
            double d28 = this.f62511b;
            float f14 = this.f62516g;
            double d29 = (-d28) * dExp5 * ((double) f14);
            double dExp6 = Math.exp(((double) (-f14)) * d28 * d10);
            double d30 = this.f62515f;
            double dSin = (-d30) * d26 * Math.sin(d30 * d10);
            double d31 = this.f62515f;
            dCos = d29 + (dExp6 * (dSin + (d27 * d31 * Math.cos(d31 * d10))));
            dExp = dExp5;
        }
        return AbstractC6901g0.a((float) (dExp + ((double) this.f62510a)), (float) dCos);
    }
}
