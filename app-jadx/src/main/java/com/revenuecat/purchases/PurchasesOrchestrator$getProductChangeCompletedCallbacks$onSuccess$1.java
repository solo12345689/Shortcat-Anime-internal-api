package com.revenuecat.purchases;

import Td.L;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/CustomerInfo;", LogEvent.LEVEL_INFO, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ ProductChangeCallback $productChangeListener;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1(ProductChangeCallback productChangeCallback, PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.$productChangeListener = productChangeCallback;
        this.this$0 = purchasesOrchestrator;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return L.f17438a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo info) {
        AbstractC5504s.h(storeTransaction, "storeTransaction");
        AbstractC5504s.h(info, "info");
        ProductChangeCallback productChangeCallback = this.$productChangeListener;
        if (productChangeCallback != null) {
            this.this$0.dispatch(new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1$1$1(productChangeCallback, storeTransaction, info));
        }
    }
}
