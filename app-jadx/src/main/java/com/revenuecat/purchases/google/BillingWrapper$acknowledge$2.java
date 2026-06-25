package com.revenuecat.purchases.google;

import Td.L;
import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "<anonymous parameter 0>", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$acknowledge$2 extends AbstractC5506u implements Function1 {
    public static final BillingWrapper$acknowledge$2 INSTANCE = new BillingWrapper$acknowledge$2();

    BillingWrapper$acknowledge$2() {
        super(1);
    }

    public final void invoke(PurchasesError purchasesError) {
        AbstractC5504s.h(purchasesError, "<anonymous parameter 0>");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return L.f17438a;
    }
}
