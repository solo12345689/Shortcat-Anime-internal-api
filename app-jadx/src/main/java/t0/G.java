package t0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f60179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f60180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f60181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f60182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f60183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f60184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f60185g;

    public G(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f60179a = d10;
        this.f60180b = d11;
        this.f60181c = d12;
        this.f60182d = d13;
        this.f60183e = d14;
        this.f60184f = d15;
        this.f60185g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (H.b(d10)) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.f60180b;
    }

    public final double b() {
        return this.f60181c;
    }

    public final double c() {
        return this.f60182d;
    }

    public final double d() {
        return this.f60183e;
    }

    public final double e() {
        return this.f60184f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return Double.compare(this.f60179a, g10.f60179a) == 0 && Double.compare(this.f60180b, g10.f60180b) == 0 && Double.compare(this.f60181c, g10.f60181c) == 0 && Double.compare(this.f60182d, g10.f60182d) == 0 && Double.compare(this.f60183e, g10.f60183e) == 0 && Double.compare(this.f60184f, g10.f60184f) == 0 && Double.compare(this.f60185g, g10.f60185g) == 0;
    }

    public final double f() {
        return this.f60185g;
    }

    public final double g() {
        return this.f60179a;
    }

    public final boolean h() {
        return this.f60179a == -3.0d;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f60179a) * 31) + Double.hashCode(this.f60180b)) * 31) + Double.hashCode(this.f60181c)) * 31) + Double.hashCode(this.f60182d)) * 31) + Double.hashCode(this.f60183e)) * 31) + Double.hashCode(this.f60184f)) * 31) + Double.hashCode(this.f60185g);
    }

    public final boolean i() {
        return this.f60179a == -2.0d;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f60179a + ", a=" + this.f60180b + ", b=" + this.f60181c + ", c=" + this.f60182d + ", d=" + this.f60183e + ", e=" + this.f60184f + ", f=" + this.f60185g + ')';
    }

    public /* synthetic */ G(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
