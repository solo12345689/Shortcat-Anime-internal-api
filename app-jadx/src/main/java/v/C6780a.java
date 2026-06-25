package v;

import oe.AbstractC5874j;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6780a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6780a f61572a = new C6780a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f61573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f61574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f61575d;

    /* JADX INFO: renamed from: v.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0922a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f61576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f61577b;

        public C0922a(float f10, float f11) {
            this.f61576a = f10;
            this.f61577b = f11;
        }

        public final float a() {
            return this.f61576a;
        }

        public final float b() {
            return this.f61577b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0922a)) {
                return false;
            }
            C0922a c0922a = (C0922a) obj;
            return Float.compare(this.f61576a, c0922a.f61576a) == 0 && Float.compare(this.f61577b, c0922a.f61577b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f61576a) * 31) + Float.hashCode(this.f61577b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f61576a + ", velocityCoefficient=" + this.f61577b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f61573b = fArr;
        float[] fArr2 = new float[101];
        f61574c = fArr2;
        y.b(fArr, fArr2, 100);
        f61575d = 8;
    }

    private C6780a() {
    }

    public final double a(float f10, float f11) {
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) f11));
    }

    public final C0922a b(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fL = AbstractC5874j.l(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fL);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f61573b;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            float f18 = ((fL - f14) * f17) + f16;
            f11 = f17;
            f12 = f18;
        }
        return new C0922a(f12, f11);
    }
}
