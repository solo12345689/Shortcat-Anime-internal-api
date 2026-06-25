package com.revenuecat.purchases.ui.revenuecatui.data;

import Zd.e;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CoroutinesExtensionsCommonKt;
import com.revenuecat.purchases.CoroutinesExtensionsKt;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\rJ$\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b%\u0010\rJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b)\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00100¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesImpl;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "Lcom/revenuecat/purchases/Purchases;", "purchases", "<init>", "(Lcom/revenuecat/purchases/Purchases;)V", "Lcom/revenuecat/purchases/PurchaseParams$Builder;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseResult;", "awaitPurchase", "(Lcom/revenuecat/purchases/PurchaseParams$Builder;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestore", "(LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/Offerings;", "awaitOfferings", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "awaitCustomerInfo", "(Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "awaitCustomerCenterConfigData", "", "productId", "basePlan", "Lcom/revenuecat/purchases/models/StoreProduct;", "awaitGetProduct", "(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "awaitGetVirtualCurrencies", "LTd/L;", "invalidateVirtualCurrenciesCache", "()V", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "awaitSyncPurchases", "email", b.f34645c, "Lcom/revenuecat/purchases/CreateSupportTicketResult;", "awaitCreateSupportTicket", "Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "getStorefrontCountryCode", "()Ljava/lang/String;", "storefrontCountryCode", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "getCustomerCenterListener", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "customerCenterListener", "getPreferredUILocaleOverride", "preferredUILocaleOverride", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesImpl implements PurchasesType {
    public static final int $stable = 8;
    private final Purchases purchases;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl$awaitGetProduct$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl", f = "PurchasesType.kt", l = {91}, m = "awaitGetProduct")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PurchasesImpl.this.awaitGetProduct(null, null, this);
        }
    }

    public PurchasesImpl() {
        this(null, 1, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitCreateSupportTicket(String str, String str2, e eVar) {
        return CoroutinesExtensionsKt.awaitCreateSupportTicket(this.purchases, str, str2, eVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitCustomerCenterConfigData(e eVar) {
        return CoroutinesExtensionsKt.awaitCustomerCenterConfigData(this.purchases, eVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitCustomerInfo(CacheFetchPolicy cacheFetchPolicy, e eVar) {
        return CoroutinesExtensionsKt.awaitCustomerInfo(this.purchases, cacheFetchPolicy, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0014  */
    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitGetProduct(java.lang.String r8, java.lang.String r9, Zd.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r10
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl$awaitGetProduct$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl$awaitGetProduct$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl$awaitGetProduct$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = ae.AbstractC2605b.f()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r8 = r4.L$0
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            Td.v.b(r10)
            goto L50
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            Td.v.b(r10)
            com.revenuecat.purchases.Purchases r1 = r7.purchases
            java.util.List r8 = Ud.AbstractC2279u.e(r8)
            r4.L$0 = r9
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r8
            java.lang.Object r10 = com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitGetProducts$default(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L50
            return r0
        L50:
            java.util.List r10 = (java.util.List) r10
            if (r9 != 0) goto L5b
            java.lang.Object r8 = Ud.AbstractC2279u.o0(r10)
            com.revenuecat.purchases.models.StoreProduct r8 = (com.revenuecat.purchases.models.StoreProduct) r8
            return r8
        L5b:
            java.util.Iterator r8 = r10.iterator()
        L5f:
            boolean r10 = r8.hasNext()
            r0 = 0
            if (r10 == 0) goto L7e
            java.lang.Object r10 = r8.next()
            r1 = r10
            com.revenuecat.purchases.models.StoreProduct r1 = (com.revenuecat.purchases.models.StoreProduct) r1
            com.revenuecat.purchases.models.GoogleStoreProduct r1 = com.revenuecat.purchases.models.GoogleStoreProductKt.getGoogleProduct(r1)
            if (r1 == 0) goto L77
            java.lang.String r0 = r1.getBasePlanId()
        L77:
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r9)
            if (r0 == 0) goto L5f
            r0 = r10
        L7e:
            com.revenuecat.purchases.models.StoreProduct r0 = (com.revenuecat.purchases.models.StoreProduct) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl.awaitGetProduct(java.lang.String, java.lang.String, Zd.e):java.lang.Object");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitGetVirtualCurrencies(e eVar) {
        return CoroutinesExtensionsKt.awaitGetVirtualCurrencies(this.purchases, eVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitOfferings(e eVar) {
        return CoroutinesExtensionsCommonKt.awaitOfferings(this.purchases, eVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitPurchase(PurchaseParams.Builder builder, e eVar) {
        return CoroutinesExtensionsCommonKt.awaitPurchase(this.purchases, builder.build(), eVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitRestore(e eVar) {
        return CoroutinesExtensionsCommonKt.awaitRestore(this.purchases, eVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitSyncPurchases(e eVar) {
        return CoroutinesExtensionsKt.awaitSyncPurchases(this.purchases, eVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public CustomerCenterListener getCustomerCenterListener() {
        return this.purchases.getCustomerCenterListener();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public String getPreferredUILocaleOverride() {
        return this.purchases.getPreferredUILocaleOverride();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchases.getPurchasesAreCompletedBy();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public String getStorefrontCountryCode() {
        return this.purchases.getStorefrontCountryCode();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public void invalidateVirtualCurrenciesCache() {
        this.purchases.invalidateVirtualCurrenciesCache();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public void track(FeatureEvent event) {
        AbstractC5504s.h(event, "event");
        this.purchases.track(event);
    }

    public PurchasesImpl(Purchases purchases) {
        AbstractC5504s.h(purchases, "purchases");
        this.purchases = purchases;
    }

    public /* synthetic */ PurchasesImpl(Purchases purchases, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Purchases.INSTANCE.getSharedInstance() : purchases);
    }
}
