package com.revenuecat.purchases.google;

import Td.L;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class BillingWrapper$findPurchaseInPurchaseHistory$2$3 extends AbstractC5502p implements Function2 {
    BillingWrapper$findPurchaseInPurchaseHistory$2$3(Object obj) {
        super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Long) obj, (Function1) obj2);
        return L.f17438a;
    }

    public final void invoke(Long l10, Function1 p12) {
        AbstractC5504s.h(p12, "p1");
        ((BillingWrapper) this.receiver).executeRequestOnUIThread(l10, p12);
    }
}
