package me;

import kotlin.jvm.internal.AbstractC5504s;
import oe.C5873i;

/* JADX INFO: renamed from: me.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5667d {
    public static final String a(Object from, Object until) {
        AbstractC5504s.h(from, "from");
        AbstractC5504s.h(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(long j10, long j11) {
        if (j11 <= j10) {
            throw new IllegalArgumentException(a(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int c(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final long d(AbstractC5666c abstractC5666c, C5873i range) {
        AbstractC5504s.h(abstractC5666c, "<this>");
        AbstractC5504s.h(range, "range");
        if (!range.isEmpty()) {
            return range.i() < Long.MAX_VALUE ? abstractC5666c.f(range.f(), range.i() + 1) : range.f() > Long.MIN_VALUE ? abstractC5666c.f(range.f() - 1, range.i()) + 1 : abstractC5666c.e();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int e(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
