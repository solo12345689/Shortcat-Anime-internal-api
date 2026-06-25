package S2;

import android.util.Range;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f15866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f15867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f15868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Range f15869d;

    public w(float f10) {
        AbstractC6614a.a(f10 > 0.0f);
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        this.f15869d = range;
        this.f15868c = ((Double) range.getUpper()).doubleValue();
        this.f15866a = -9223372036854775807L;
        this.f15867b = -9223372036854775807L;
    }

    private double a(long j10, long j11) {
        long j12 = this.f15866a;
        if (j12 != -9223372036854775807L) {
            if (this.f15867b != -9223372036854775807L && j10 != j12) {
                return (j11 - r4) / (j10 - j12);
            }
        }
        return ((Double) this.f15869d.getUpper()).doubleValue();
    }

    private void f(double d10) {
        this.f15868c = (this.f15868c * 0.800000011920929d) + (d10 * 0.20000000298023224d);
    }

    public void b(long j10, long j11) {
        AbstractC6614a.a(j10 != -9223372036854775807L);
        AbstractC6614a.a(j11 != -9223372036854775807L);
        f(((Double) this.f15869d.clamp(Double.valueOf(a(j10, j11)))).doubleValue());
        this.f15866a = j10;
        this.f15867b = j11;
    }

    public long c(long j10) {
        if (this.f15866a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f15867b + ((j10 - r0) * this.f15868c));
    }

    public void d() {
        this.f15868c = ((Double) this.f15869d.getUpper()).doubleValue();
        this.f15866a = -9223372036854775807L;
        this.f15867b = -9223372036854775807L;
    }

    public void e(float f10) {
        AbstractC6614a.a(f10 > 0.0f);
        this.f15869d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        d();
    }
}
