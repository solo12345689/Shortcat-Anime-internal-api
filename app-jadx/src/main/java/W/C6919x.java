package w;

import s0.AbstractC6337a0;

/* JADX INFO: renamed from: w.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6919x implements InterfaceC6875D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f62730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f62731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f62732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f62733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f62734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f62735f;

    public C6919x(float f10, float f11, float f12, float f13) {
        this.f62730a = f10;
        this.f62731b = f11;
        this.f62732c = f12;
        this.f62733d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            AbstractC6889a0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + com.amazon.a.a.o.c.a.b.f34706a);
        }
        long jB = AbstractC6337a0.b(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.f62734e = Float.intBitsToFloat((int) (jB >> 32));
        this.f62735f = Float.intBitsToFloat((int) (jB & 4294967295L));
    }

    private final void b(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f62730a + ", " + this.f62731b + ", " + this.f62732c + ", " + this.f62733d + ") has no solution at " + f10);
    }

    @Override // w.InterfaceC6875D
    public float a(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            float fE = AbstractC6337a0.e(0.0f - f10, this.f62730a - f10, this.f62732c - f10, 1.0f - f10);
            if (Float.isNaN(fE)) {
                b(f10);
            }
            f10 = AbstractC6337a0.c(this.f62731b, this.f62733d, fE);
            float f11 = this.f62734e;
            float f12 = this.f62735f;
            if (f10 < f11) {
                f10 = f11;
            }
            if (f10 > f12) {
                return f12;
            }
        }
        return f10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6919x)) {
            return false;
        }
        C6919x c6919x = (C6919x) obj;
        return this.f62730a == c6919x.f62730a && this.f62731b == c6919x.f62731b && this.f62732c == c6919x.f62732c && this.f62733d == c6919x.f62733d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f62730a) * 31) + Float.hashCode(this.f62731b)) * 31) + Float.hashCode(this.f62732c)) * 31) + Float.hashCode(this.f62733d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f62730a + ", b=" + this.f62731b + ", c=" + this.f62732c + ", d=" + this.f62733d + ')';
    }
}
