package T6;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f17291u = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f17294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f17295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f17296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f17297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f17299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f17300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double f17301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private double f17302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private double f17303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f17304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f17307t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f17308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f17309b;

        public b(double d10, double d11) {
            this.f17308a = d10;
            this.f17309b = d11;
        }

        public final double a() {
            return this.f17308a;
        }

        public final double b() {
            return this.f17309b;
        }

        public final void c(double d10) {
            this.f17308a = d10;
        }

        public final void d(double d10) {
            this.f17309b = d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f17308a, bVar.f17308a) == 0 && Double.compare(this.f17309b, bVar.f17309b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f17308a) * 31) + Double.hashCode(this.f17309b);
        }

        public String toString() {
            return "PhysicsState(position=" + this.f17308a + ", velocity=" + this.f17309b + ")";
        }

        public /* synthetic */ b(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
        }
    }

    public w(ReadableMap config) {
        AbstractC5504s.h(config, "config");
        b bVar = new b(0.0d, 0.0d, 3, null);
        this.f17299l = bVar;
        bVar.d(config.getDouble("initialVelocity"));
        a(config);
    }

    private final void c(double d10) {
        double dSin;
        double dSin2;
        if (e()) {
            return;
        }
        this.f17304q += d10 <= 0.064d ? d10 : 0.064d;
        double d11 = this.f17295h;
        double d12 = this.f17296i;
        double d13 = this.f17294g;
        double d14 = -this.f17297j;
        double dSqrt = d11 / (((double) 2) * Math.sqrt(d13 * d12));
        double dSqrt2 = Math.sqrt(d13 / d12);
        double dSqrt3 = Math.sqrt(1.0d - (dSqrt * dSqrt)) * dSqrt2;
        double d15 = this.f17301n - this.f17300m;
        double d16 = this.f17304q;
        if (dSqrt < 1.0d) {
            double dExp = Math.exp((-dSqrt) * dSqrt2 * d16);
            double d17 = dSqrt2 * dSqrt;
            double d18 = d14 + (d17 * d15);
            double d19 = d16 * dSqrt3;
            dSin2 = this.f17301n - ((((d18 / dSqrt3) * Math.sin(d19)) + (Math.cos(d19) * d15)) * dExp);
            dSin = ((d17 * dExp) * (((Math.sin(d19) * d18) / dSqrt3) + (Math.cos(d19) * d15))) - (dExp * ((Math.cos(d19) * d18) - ((dSqrt3 * d15) * Math.sin(d19))));
        } else {
            double dExp2 = Math.exp((-dSqrt2) * d16);
            double d20 = this.f17301n - (((((dSqrt2 * d15) + d14) * d16) + d15) * dExp2);
            dSin = dExp2 * ((d14 * ((d16 * dSqrt2) - ((double) 1))) + (d16 * d15 * dSqrt2 * dSqrt2));
            dSin2 = d20;
        }
        this.f17299l.c(dSin2);
        this.f17299l.d(dSin);
        if (e() || (this.f17298k && f())) {
            if (this.f17294g > 0.0d) {
                double d21 = this.f17301n;
                this.f17300m = d21;
                this.f17299l.c(d21);
            } else {
                double dA = this.f17299l.a();
                this.f17301n = dA;
                this.f17300m = dA;
            }
            this.f17299l.d(0.0d);
        }
    }

    private final double d(b bVar) {
        return Math.abs(this.f17301n - bVar.a());
    }

    private final boolean e() {
        if (Math.abs(this.f17299l.b()) <= this.f17302o) {
            return d(this.f17299l) <= this.f17303p || this.f17294g == 0.0d;
        }
        return false;
    }

    private final boolean f() {
        if (this.f17294g <= 0.0d) {
            return false;
        }
        if (this.f17300m >= this.f17301n || this.f17299l.a() <= this.f17301n) {
            return this.f17300m > this.f17301n && this.f17299l.a() < this.f17301n;
        }
        return true;
    }

    @Override // T6.e
    public void a(ReadableMap config) {
        AbstractC5504s.h(config, "config");
        this.f17294g = config.getDouble("stiffness");
        this.f17295h = config.getDouble("damping");
        this.f17296i = config.getDouble("mass");
        this.f17297j = this.f17299l.b();
        this.f17301n = config.getDouble("toValue");
        this.f17302o = config.getDouble("restSpeedThreshold");
        this.f17303p = config.getDouble("restDisplacementThreshold");
        this.f17298k = config.getBoolean("overshootClamping");
        int i10 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.f17305r = i10;
        this.f17204a = i10 == 0;
        this.f17306s = 0;
        this.f17304q = 0.0d;
        this.f17293f = false;
    }

    @Override // T6.e
    public void b(long j10) {
        B b10 = this.f17205b;
        if (b10 == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = j10 / ((long) 1000000);
        if (!this.f17293f) {
            if (this.f17306s == 0) {
                this.f17307t = b10.f17194f;
                this.f17306s = 1;
            }
            this.f17299l.c(b10.f17194f);
            this.f17300m = this.f17299l.a();
            this.f17292e = j11;
            this.f17304q = 0.0d;
            this.f17293f = true;
        }
        c((j11 - this.f17292e) / 1000.0d);
        this.f17292e = j11;
        b10.f17194f = this.f17299l.a();
        if (e()) {
            int i10 = this.f17305r;
            if (i10 != -1 && this.f17306s >= i10) {
                this.f17204a = true;
                return;
            }
            this.f17293f = false;
            b10.f17194f = this.f17307t;
            this.f17306s++;
        }
    }
}
