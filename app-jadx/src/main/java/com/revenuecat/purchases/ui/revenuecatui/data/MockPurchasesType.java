package com.revenuecat.purchases.ui.revenuecatui.data;

import Td.s;
import Zd.e;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CreateSupportTicketResult;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u0012J$\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b!\u0010\u0012J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b)\u0010\u0012J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b-\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b4\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/MockPurchasesType;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "", "preferredUILocaleOverride", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "storefrontCountryCode", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "customerCenterListener", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V", "Lcom/revenuecat/purchases/PurchaseParams$Builder;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseResult;", "awaitPurchase", "(Lcom/revenuecat/purchases/PurchaseParams$Builder;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestore", "(LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/Offerings;", "awaitOfferings", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "awaitCustomerInfo", "(Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "awaitCustomerCenterConfigData", "productId", "basePlan", "Lcom/revenuecat/purchases/models/StoreProduct;", "awaitGetProduct", "(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "awaitGetVirtualCurrencies", "LTd/L;", "invalidateVirtualCurrenciesCache", "()V", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "awaitSyncPurchases", "email", b.f34645c, "Lcom/revenuecat/purchases/CreateSupportTicketResult;", "awaitCreateSupportTicket", "Ljava/lang/String;", "getPreferredUILocaleOverride", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getStorefrontCountryCode", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "getCustomerCenterListener", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MockPurchasesType implements PurchasesType {
    public static final int $stable = 8;
    private final CustomerCenterListener customerCenterListener;
    private final String preferredUILocaleOverride;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final String storefrontCountryCode;

    public MockPurchasesType() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitCreateSupportTicket(String str, String str2, e eVar) {
        return new CreateSupportTicketResult(true);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitCustomerCenterConfigData(e eVar) {
        throw new s("Mock implementation for previews only");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitCustomerInfo(CacheFetchPolicy cacheFetchPolicy, e eVar) {
        throw new s("Mock implementation for previews only");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitGetProduct(String str, String str2, e eVar) {
        throw new s("Mock implementation for previews only");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitGetVirtualCurrencies(e eVar) {
        throw new s("Mock implementation for previews only");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitOfferings(e eVar) {
        throw new s("Mock implementation for previews only");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitPurchase(PurchaseParams.Builder builder, e eVar) {
        throw new s("Mock implementation for previews only");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitRestore(e eVar) {
        throw new s("Mock implementation for previews only");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitSyncPurchases(e eVar) {
        throw new s("Mock implementation for previews only");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public CustomerCenterListener getCustomerCenterListener() {
        return this.customerCenterListener;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public String getPreferredUILocaleOverride() {
        return this.preferredUILocaleOverride;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public String getStorefrontCountryCode() {
        return this.storefrontCountryCode;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public void track(FeatureEvent event) {
        AbstractC5504s.h(event, "event");
    }

    public MockPurchasesType(String str, PurchasesAreCompletedBy purchasesAreCompletedBy, String str2, CustomerCenterListener customerCenterListener) {
        AbstractC5504s.h(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        this.preferredUILocaleOverride = str;
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        this.storefrontCountryCode = str2;
        this.customerCenterListener = customerCenterListener;
    }

    public /* synthetic */ MockPurchasesType(String str, PurchasesAreCompletedBy purchasesAreCompletedBy, String str2, CustomerCenterListener customerCenterListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? PurchasesAreCompletedBy.REVENUECAT : purchasesAreCompletedBy, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : customerCenterListener);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public void invalidateVirtualCurrenciesCache() {
    }
}
