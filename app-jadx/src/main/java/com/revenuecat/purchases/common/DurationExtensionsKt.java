package com.revenuecat.purchases.common;

import Ef.a;
import Ef.c;
import Ef.d;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"LEf/a$a;", "Ljava/util/Date;", "startTime", "endTime", "LEf/a;", "between", "(LEf/a$a;Ljava/util/Date;Ljava/util/Date;)J", "duration1", "duration2", "min-QTBD994", "(JJ)J", "min", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DurationExtensionsKt {
    public static final long between(a.C0060a c0060a, Date startTime, Date endTime) {
        AbstractC5504s.h(c0060a, "<this>");
        AbstractC5504s.h(startTime, "startTime");
        AbstractC5504s.h(endTime, "endTime");
        return c.t(endTime.getTime() - startTime.getTime(), d.f5970d);
    }

    /* JADX INFO: renamed from: min-QTBD994, reason: not valid java name */
    public static final long m225minQTBD994(long j10, long j11) {
        return Ef.a.n(j10, j11) < 0 ? j10 : j11;
    }
}
