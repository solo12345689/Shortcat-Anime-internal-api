package com.revenuecat.purchases.ui.revenuecatui.data;

import Df.r;
import Td.z;
import Zd.e;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;)V", "Lcom/revenuecat/purchases/SubscriptionInfo;", "activePlayStoreSubscription", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "productChangeConfig", "Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeInfo;", "calculateProductChange", "(Lcom/revenuecat/purchases/SubscriptionInfo;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;", "calculateProductChangeInfo", "(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProductChangeCalculator {
    private static final int MONTHS_IN_HALF_YEAR = 6;
    private static final int MONTHS_IN_QUARTER = 3;
    private static final int MONTHS_IN_YEAR = 12;
    private static final long SANDBOX_HALF_YEAR_MINUTES = 15;
    private static final long SANDBOX_MONTHLY_MINUTES = 5;
    private static final long SANDBOX_QUARTER_MINUTES = 10;
    private static final long SANDBOX_YEARLY_MINUTES = 30;
    private final PurchasesType purchases;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ#\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0014J\u001d\u0010\u0015\u001a\u0004\u0018\u00010\b*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011*\u00020\u0016H\u0000¢\u0006\u0002\b\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/ProductChangeCalculator$Companion;", "", "()V", "MONTHS_IN_HALF_YEAR", "", "MONTHS_IN_QUARTER", "MONTHS_IN_YEAR", "SANDBOX_HALF_YEAR_MINUTES", "", "SANDBOX_MONTHLY_MINUTES", "SANDBOX_QUARTER_MINUTES", "SANDBOX_YEARLY_MINUTES", "getSandboxRenewalMinutes", "period", "Lcom/revenuecat/purchases/models/Period;", "getSandboxRenewalMinutes$revenuecatui_defaultsBc8Release", "parseProductIdentifier", "Lkotlin/Pair;", "", "productIdentifier", "parseProductIdentifier$revenuecatui_defaultsBc8Release", "getNormalizedPrice", "Lcom/revenuecat/purchases/models/StoreProduct;", "isSandbox", "", "getNormalizedPrice$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/models/StoreProduct;Z)Ljava/lang/Long;", "subscriptionIdentifiers", "subscriptionIdentifiers$revenuecatui_defaultsBc8Release", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Long getNormalizedPrice$revenuecatui_defaultsBc8Release(StoreProduct storeProduct, boolean z10) {
            AbstractC5504s.h(storeProduct, "<this>");
            Period period = storeProduct.getPeriod();
            if (period == null) {
                return null;
            }
            long amountMicros = storeProduct.getPrice().getAmountMicros();
            if (z10) {
                return Long.valueOf(amountMicros / getSandboxRenewalMinutes$revenuecatui_defaultsBc8Release(period));
            }
            Price pricePricePerMonth$default = StoreProduct.pricePerMonth$default(storeProduct, null, 1, null);
            if (pricePricePerMonth$default != null) {
                return Long.valueOf(pricePricePerMonth$default.getAmountMicros());
            }
            return null;
        }

        public final long getSandboxRenewalMinutes$revenuecatui_defaultsBc8Release(Period period) {
            AbstractC5504s.h(period, "period");
            double valueInMonths = period.getValueInMonths();
            if (valueInMonths >= 12.0d) {
                return ProductChangeCalculator.SANDBOX_YEARLY_MINUTES;
            }
            if (valueInMonths >= 6.0d) {
                return ProductChangeCalculator.SANDBOX_HALF_YEAR_MINUTES;
            }
            if (valueInMonths >= 3.0d) {
                return 10L;
            }
            return ProductChangeCalculator.SANDBOX_MONTHLY_MINUTES;
        }

        public final Pair<String, String> parseProductIdentifier$revenuecatui_defaultsBc8Release(String productIdentifier) {
            AbstractC5504s.h(productIdentifier, "productIdentifier");
            String strE1 = r.e1(productIdentifier, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, 2, null);
            String strU0 = r.U0(productIdentifier, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "");
            return z.a(strE1, strU0.length() > 0 ? strU0 : null);
        }

        public final Pair<String, String> subscriptionIdentifiers$revenuecatui_defaultsBc8Release(StoreProduct storeProduct) {
            AbstractC5504s.h(storeProduct, "<this>");
            if (!(storeProduct instanceof GoogleStoreProduct)) {
                return parseProductIdentifier$revenuecatui_defaultsBc8Release(storeProduct.getId());
            }
            GoogleStoreProduct googleStoreProduct = (GoogleStoreProduct) storeProduct;
            return z.a(googleStoreProduct.getProductId(), googleStoreProduct.getBasePlanId());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator$calculateProductChange$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator", f = "ProductChangeCalculator.kt", l = {72}, m = "calculateProductChange")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductChangeCalculator.this.calculateProductChange(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator$calculateProductChangeInfo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator", f = "ProductChangeCalculator.kt", l = {40, 45}, m = "calculateProductChangeInfo")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44281 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C44281(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductChangeCalculator.this.calculateProductChangeInfo(null, null, this);
        }
    }

    public ProductChangeCalculator(PurchasesType purchases) {
        AbstractC5504s.h(purchases, "purchases");
        this.purchases = purchases;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object calculateProductChange(com.revenuecat.purchases.SubscriptionInfo r12, com.revenuecat.purchases.Package r13, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig r14, Zd.e r15) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator.calculateProductChange(com.revenuecat.purchases.SubscriptionInfo, com.revenuecat.purchases.Package, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig, Zd.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object calculateProductChangeInfo(com.revenuecat.purchases.Package r9, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig r10, Zd.e r11) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator.calculateProductChangeInfo(com.revenuecat.purchases.Package, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig, Zd.e):java.lang.Object");
    }
}
