package l0;

import i1.C5021n;
import i1.EnumC5027t;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f52324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f52325c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f52326a;

        public a(float f10) {
            this.f52326a = f10;
        }

        @Override // l0.e.b
        public int a(int i10, int i11, EnumC5027t enumC5027t) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + (enumC5027t == EnumC5027t.f48573a ? this.f52326a : (-1) * this.f52326a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f52326a, ((a) obj).f52326a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f52326a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f52326a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements e.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f52327a;

        public b(float f10) {
            this.f52327a = f10;
        }

        @Override // l0.e.c
        public int a(int i10, int i11) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.f52327a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f52327a, ((b) obj).f52327a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f52327a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f52327a + ')';
        }
    }

    public g(float f10, float f11) {
        this.f52324b = f10;
        this.f52325c = f11;
    }

    @Override // l0.e
    public long a(long j10, long j11, EnumC5027t enumC5027t) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        float f12 = 1;
        return C5021n.f((((long) Math.round(f10 * ((enumC5027t == EnumC5027t.f48573a ? this.f52324b : (-1) * this.f52324b) + f12))) << 32) | (((long) Math.round(f11 * (f12 + this.f52325c))) & 4294967295L));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f52324b, gVar.f52324b) == 0 && Float.compare(this.f52325c, gVar.f52325c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f52324b) * 31) + Float.hashCode(this.f52325c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f52324b + ", verticalBias=" + this.f52325c + ')';
    }
}
