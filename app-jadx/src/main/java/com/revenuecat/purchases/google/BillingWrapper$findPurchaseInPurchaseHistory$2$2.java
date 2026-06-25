package com.revenuecat.purchases.google;

import Td.L;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class BillingWrapper$findPurchaseInPurchaseHistory$2$2 extends AbstractC5502p implements Function1 {
    BillingWrapper$findPurchaseInPurchaseHistory$2$2(Object obj) {
        super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Function1) obj);
        return L.f17438a;
    }

    public final void invoke(Function1 p02) {
        AbstractC5504s.h(p02, "p0");
        ((BillingWrapper) this.receiver).withConnectedClient(p02);
    }
}
