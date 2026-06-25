package com.revenuecat.purchases;

import Td.L;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/CustomerInfo;", LogEvent.LEVEL_INFO, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ CustomerInfo $info;
        final /* synthetic */ StoreTransaction $storeTransaction;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PurchasesOrchestrator purchasesOrchestrator, CustomerInfo customerInfo, StoreTransaction storeTransaction) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$info = customerInfo;
            this.$storeTransaction = storeTransaction;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m154invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m154invoke() {
            this.this$0.blockstoreHelper.storeUserIdIfNeeded(this.$info);
            PurchaseCallback purchaseCallback = this.this$0.getPurchaseCallback(this.$storeTransaction.getProductIds().get(0));
            if (purchaseCallback != null) {
                this.this$0.dispatch(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1$1(purchaseCallback, this.$storeTransaction, this.$info));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
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
        this.this$0.backupManager.dataChanged();
        this.this$0.blockstoreHelper.aliasCurrentAndStoredUserIdsIfNeeded(new AnonymousClass1(this.this$0, info, storeTransaction));
    }
}
