package oe;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5504s;
import me.AbstractC5666c;
import me.AbstractC5667d;
import oe.C5868d;
import oe.C5871g;

/* JADX INFO: renamed from: oe.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5876l extends AbstractC5875k {
    public static double c(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static float d(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int e(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long f(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double g(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static float h(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int i(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long j(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double k(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + com.amazon.a.a.o.c.a.b.f34706a);
    }

    public static float l(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + com.amazon.a.a.o.c.a.b.f34706a);
    }

    public static int m(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + com.amazon.a.a.o.c.a.b.f34706a);
    }

    public static int n(int i10, InterfaceC5867c range) {
        AbstractC5504s.h(range, "range");
        if (range instanceof InterfaceC5866b) {
            return ((Number) r(Integer.valueOf(i10), (InterfaceC5866b) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i10 < ((Number) range.b()).intValue() ? ((Number) range.b()).intValue() : i10 > ((Number) range.e()).intValue() ? ((Number) range.e()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + com.amazon.a.a.o.c.a.b.f34706a);
    }

    public static long o(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + com.amazon.a.a.o.c.a.b.f34706a);
    }

    public static long p(long j10, InterfaceC5867c range) {
        AbstractC5504s.h(range, "range");
        if (range instanceof InterfaceC5866b) {
            return ((Number) r(Long.valueOf(j10), (InterfaceC5866b) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j10 < ((Number) range.b()).longValue() ? ((Number) range.b()).longValue() : j10 > ((Number) range.e()).longValue() ? ((Number) range.e()).longValue() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + com.amazon.a.a.o.c.a.b.f34706a);
    }

    public static Comparable q(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        AbstractC5504s.h(comparable, "<this>");
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + com.amazon.a.a.o.c.a.b.f34706a);
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static final Comparable r(Comparable comparable, InterfaceC5866b range) {
        AbstractC5504s.h(comparable, "<this>");
        AbstractC5504s.h(range, "range");
        if (!range.isEmpty()) {
            return (!range.d(comparable, range.b()) || range.d(range.b(), comparable)) ? (!range.d(range.e(), comparable) || range.d(comparable, range.e())) ? comparable : range.e() : range.b();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + com.amazon.a.a.o.c.a.b.f34706a);
    }

    public static C5868d s(int i10, int i11) {
        return C5868d.f55395d.a(i10, i11, -1);
    }

    public static long t(C5873i c5873i, AbstractC5666c random) {
        AbstractC5504s.h(c5873i, "<this>");
        AbstractC5504s.h(random, "random");
        try {
            return AbstractC5667d.d(random, c5873i);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static C5868d u(C5868d c5868d) {
        AbstractC5504s.h(c5868d, "<this>");
        return C5868d.f55395d.a(c5868d.i(), c5868d.f(), -c5868d.l());
    }

    public static C5868d v(C5868d c5868d, int i10) {
        AbstractC5504s.h(c5868d, "<this>");
        AbstractC5875k.a(i10 > 0, Integer.valueOf(i10));
        C5868d.a aVar = C5868d.f55395d;
        int iF = c5868d.f();
        int i11 = c5868d.i();
        if (c5868d.l() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iF, i11, i10);
    }

    public static C5871g w(C5871g c5871g, long j10) {
        AbstractC5504s.h(c5871g, "<this>");
        AbstractC5875k.a(j10 > 0, Long.valueOf(j10));
        C5871g.a aVar = C5871g.f55405d;
        long jF = c5871g.f();
        long jI = c5871g.i();
        if (c5871g.l() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jF, jI, j10);
    }

    public static C5870f x(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? C5870f.f55403e.a() : new C5870f(i10, i11 - 1);
    }

    public static C5873i y(long j10, long j11) {
        return j11 <= Long.MIN_VALUE ? C5873i.f55413e.a() : new C5873i(j10, j11 - 1);
    }
}
