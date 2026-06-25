package l0;

import i1.C5021n;
import i1.C5025r;
import i1.EnumC5027t;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f52321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f52322c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f52323a;

        public a(float f10) {
            this.f52323a = f10;
        }

        @Override // l0.e.b
        public int a(int i10, int i11, EnumC5027t enumC5027t) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.f52323a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f52323a, ((a) obj).f52323a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f52323a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f52323a + ')';
        }
    }

    public f(float f10, float f11) {
        this.f52321b = f10;
        this.f52322c = f11;
    }

    @Override // l0.e
    public long a(long j10, long j11, EnumC5027t enumC5027t) {
        long jC = C5025r.c((((long) (((int) (j11 >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L));
        float f10 = 1;
        return C5021n.f((((long) Math.round((((int) (jC >> 32)) / 2.0f) * (this.f52321b + f10))) << 32) | (((long) Math.round((((int) (jC & 4294967295L)) / 2.0f) * (f10 + this.f52322c))) & 4294967295L));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f52321b, fVar.f52321b) == 0 && Float.compare(this.f52322c, fVar.f52322c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f52321b) * 31) + Float.hashCode(this.f52322c);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f52321b + ", verticalBias=" + this.f52322c + ')';
    }
}
