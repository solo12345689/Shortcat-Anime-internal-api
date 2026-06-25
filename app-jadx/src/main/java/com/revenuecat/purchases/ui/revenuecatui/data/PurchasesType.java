package com.revenuecat.purchases.ui.revenuecatui.data;

import Zd.e;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0011\u0010\tJ$\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u0019\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007H¦@¢\u0006\u0004\b!\u0010\tJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H¦@¢\u0006\u0004\b%\u0010\u0017R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u0004\u0018\u00010-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010+¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "", "Lcom/revenuecat/purchases/PurchaseParams$Builder;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseResult;", "awaitPurchase", "(Lcom/revenuecat/purchases/PurchaseParams$Builder;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestore", "(LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/Offerings;", "awaitOfferings", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "awaitCustomerInfo", "(Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "awaitCustomerCenterConfigData", "", "productId", "basePlan", "Lcom/revenuecat/purchases/models/StoreProduct;", "awaitGetProduct", "(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "awaitGetVirtualCurrencies", "LTd/L;", "invalidateVirtualCurrenciesCache", "()V", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "awaitSyncPurchases", "email", b.f34645c, "Lcom/revenuecat/purchases/CreateSupportTicketResult;", "awaitCreateSupportTicket", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "getStorefrontCountryCode", "()Ljava/lang/String;", "storefrontCountryCode", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "getCustomerCenterListener", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "customerCenterListener", "getPreferredUILocaleOverride", "preferredUILocaleOverride", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PurchasesType {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitCustomerInfo$default(PurchasesType purchasesType, CacheFetchPolicy cacheFetchPolicy, e eVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitCustomerInfo");
            }
            if ((i10 & 1) != 0) {
                cacheFetchPolicy = CacheFetchPolicy.INSTANCE.m113default();
            }
            return purchasesType.awaitCustomerInfo(cacheFetchPolicy, eVar);
        }
    }

    Object awaitCreateSupportTicket(String str, String str2, e eVar);

    Object awaitCustomerCenterConfigData(e eVar);

    Object awaitCustomerInfo(CacheFetchPolicy cacheFetchPolicy, e eVar);

    Object awaitGetProduct(String str, String str2, e eVar);

    Object awaitGetVirtualCurrencies(e eVar);

    Object awaitOfferings(e eVar);

    Object awaitPurchase(PurchaseParams.Builder builder, e eVar);

    Object awaitRestore(e eVar);

    Object awaitSyncPurchases(e eVar);

    CustomerCenterListener getCustomerCenterListener();

    String getPreferredUILocaleOverride();

    PurchasesAreCompletedBy getPurchasesAreCompletedBy();

    String getStorefrontCountryCode();

    void invalidateVirtualCurrenciesCache();

    void track(FeatureEvent event);
}
