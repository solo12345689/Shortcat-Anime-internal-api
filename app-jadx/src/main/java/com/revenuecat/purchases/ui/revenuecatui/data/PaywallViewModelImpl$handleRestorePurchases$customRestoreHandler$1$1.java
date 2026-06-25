package com.revenuecat.purchases.ui.revenuecatui.data;

import Zd.e;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class PaywallViewModelImpl$handleRestorePurchases$customRestoreHandler$1$1 extends AbstractC5502p implements Function2 {
    PaywallViewModelImpl$handleRestorePurchases$customRestoreHandler$1$1(Object obj) {
        super(2, obj, PaywallPurchaseLogic.class, "performRestore", "performRestore(Lcom/revenuecat/purchases/CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CustomerInfo customerInfo, e eVar) {
        return ((PaywallPurchaseLogic) this.receiver).performRestore(customerInfo, eVar);
    }
}
