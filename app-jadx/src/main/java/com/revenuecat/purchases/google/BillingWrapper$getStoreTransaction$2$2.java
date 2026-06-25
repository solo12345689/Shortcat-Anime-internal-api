package com.revenuecat.purchases.google;

import Td.L;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ProductType;", "type", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ProductType;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$getStoreTransaction$2$2 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Function1 $completion;
    final /* synthetic */ Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BillingWrapper$getStoreTransaction$2$2(Function1 function1, Purchase purchase) {
        super(1);
        this.$completion = function1;
        this.$purchase = purchase;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProductType) obj);
        return L.f17438a;
    }

    public final void invoke(ProductType type) {
        AbstractC5504s.h(type, "type");
        this.$completion.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(this.$purchase, type, null, null, null, null, 30, null));
    }
}
