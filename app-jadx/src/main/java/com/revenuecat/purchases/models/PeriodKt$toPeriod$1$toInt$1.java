package com.revenuecat.purchases.models;

import Df.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<no name provided>", "", "part", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PeriodKt$toPeriod$1$toInt$1 extends AbstractC5506u implements Function1 {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(String part) {
        AbstractC5504s.h(part, "part");
        Integer numR = r.r(r.o1(part, 1));
        return Integer.valueOf(numR != null ? numR.intValue() : 0);
    }
}
