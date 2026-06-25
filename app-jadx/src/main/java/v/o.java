package v;

import i1.InterfaceC5011d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f61678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5011d f61679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f61680c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f61681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f61682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f61683c;

        public a(float f10, float f11, long j10) {
            this.f61681a = f10;
            this.f61682b = f11;
            this.f61683c = j10;
        }

        public final float a(long j10) {
            long j11 = this.f61683c;
            return this.f61682b * Math.signum(this.f61681a) * C6780a.f61572a.b(j11 > 0 ? j10 / j11 : 1.0f).a();
        }

        public final float b(long j10) {
            long j11 = this.f61683c;
            return (((C6780a.f61572a.b(j11 > 0 ? j10 / j11 : 1.0f).b() * Math.signum(this.f61681a)) * this.f61682b) / this.f61683c) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f61681a, aVar.f61681a) == 0 && Float.compare(this.f61682b, aVar.f61682b) == 0 && this.f61683c == aVar.f61683c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f61681a) * 31) + Float.hashCode(this.f61682b)) * 31) + Long.hashCode(this.f61683c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f61681a + ", distance=" + this.f61682b + ", duration=" + this.f61683c + ')';
        }
    }

    public o(float f10, InterfaceC5011d interfaceC5011d) {
        this.f61678a = f10;
        this.f61679b = interfaceC5011d;
        this.f61680c = a(interfaceC5011d);
    }

    private final float a(InterfaceC5011d interfaceC5011d) {
        return p.c(0.84f, interfaceC5011d.getDensity());
    }

    private final double e(float f10) {
        return C6780a.f61572a.a(f10, this.f61678a * this.f61680c);
    }

    public final float b(float f10) {
        return (float) (((double) (this.f61678a * this.f61680c)) * Math.exp((((double) p.f61684a) / (((double) p.f61684a) - 1.0d)) * e(f10)));
    }

    public final long c(float f10) {
        return (long) (Math.exp(e(f10) / (((double) p.f61684a) - 1.0d)) * 1000.0d);
    }

    public final a d(float f10) {
        double dE = e(f10);
        double d10 = ((double) p.f61684a) - 1.0d;
        return new a(f10, (float) (((double) (this.f61678a * this.f61680c)) * Math.exp((((double) p.f61684a) / d10) * dE)), (long) (Math.exp(dE / d10) * 1000.0d));
    }
}
