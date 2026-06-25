package id;

import java.math.BigDecimal;
import java.util.Objects;

/* JADX INFO: renamed from: id.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5071c implements InterfaceC5077i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BigDecimal f48861c = new BigDecimal(1000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5079k f48863b;

    private C5071c(long j10, C5079k c5079k) {
        if (j10 < -999999999999999L || j10 > 999999999999999L) {
            throw new IllegalArgumentException("value must be in the range from -999999999999999 to 999999999999999");
        }
        this.f48862a = j10;
        Objects.requireNonNull(c5079k, "params must not be null");
        this.f48863b = c5079k;
    }

    public static C5071c e(long j10) {
        return new C5071c(j10, C5079k.f48870b);
    }

    public static C5071c f(BigDecimal bigDecimal) {
        Objects.requireNonNull(bigDecimal, "value must not be null");
        return e(bigDecimal.multiply(f48861c).longValue());
    }

    @Override // id.InterfaceC5080l
    public C5079k a() {
        return this.f48863b;
    }

    @Override // id.q
    public StringBuilder c(StringBuilder sb2) {
        long j10 = this.f48862a;
        String str = j10 < 0 ? "-" : "";
        long jAbs = Math.abs(j10);
        long j11 = jAbs / 1000;
        long j12 = jAbs % 1000;
        if (j12 % 10 == 0) {
            j12 /= 10;
        }
        if (j12 % 10 == 0) {
            j12 /= 10;
        }
        sb2.append(str);
        sb2.append(Long.toString(j11));
        sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
        sb2.append(Long.toString(j12));
        this.f48863b.o(sb2);
        return sb2;
    }

    @Override // K1.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BigDecimal get() {
        return BigDecimal.valueOf(this.f48862a, 3);
    }

    @Override // id.InterfaceC5075g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C5071c b(C5079k c5079k) {
        Objects.requireNonNull(c5079k, "params must not be null");
        return c5079k.isEmpty() ? this : new C5071c(this.f48862a, c5079k);
    }
}
