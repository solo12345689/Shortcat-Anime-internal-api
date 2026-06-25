package com.revenuecat.purchases;

import Td.L;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import ie.InterfaceC5082a;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$getProductsOfTypes$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ GetStoreProductsCallback $callback;
    final /* synthetic */ List<StoreProduct> $collectedStoreProducts;
    final /* synthetic */ Date $nonNullStartTime;
    final /* synthetic */ Set<String> $productIds;
    final /* synthetic */ Set<ProductType> $typesRemaining;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getProductsOfTypes$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ GetStoreProductsCallback $callback;
        final /* synthetic */ List<StoreProduct> $collectedStoreProducts;
        final /* synthetic */ Date $nonNullStartTime;
        final /* synthetic */ Set<String> $productIds;
        final /* synthetic */ List<StoreProduct> $storeProducts;
        final /* synthetic */ Set<ProductType> $typesRemaining;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PurchasesOrchestrator purchasesOrchestrator, Set<String> set, Set<ProductType> set2, List<? extends StoreProduct> list, List<? extends StoreProduct> list2, Date date, GetStoreProductsCallback getStoreProductsCallback) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$productIds = set;
            this.$typesRemaining = set2;
            this.$collectedStoreProducts = list;
            this.$storeProducts = list2;
            this.$nonNullStartTime = date;
            this.$callback = getStoreProductsCallback;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m152invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m152invoke() {
            this.this$0.getProductsOfTypes(this.$productIds, this.$typesRemaining, AbstractC2279u.I0(this.$collectedStoreProducts, this.$storeProducts), this.$nonNullStartTime, this.$callback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PurchasesOrchestrator$getProductsOfTypes$1$1(PurchasesOrchestrator purchasesOrchestrator, Set<String> set, Set<ProductType> set2, List<? extends StoreProduct> list, Date date, GetStoreProductsCallback getStoreProductsCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$productIds = set;
        this.$typesRemaining = set2;
        this.$collectedStoreProducts = list;
        this.$nonNullStartTime = date;
        this.$callback = getStoreProductsCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return L.f17438a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        AbstractC5504s.h(storeProducts, "storeProducts");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        purchasesOrchestrator.dispatch(new AnonymousClass1(purchasesOrchestrator, this.$productIds, this.$typesRemaining, this.$collectedStoreProducts, storeProducts, this.$nonNullStartTime, this.$callback));
    }
}
