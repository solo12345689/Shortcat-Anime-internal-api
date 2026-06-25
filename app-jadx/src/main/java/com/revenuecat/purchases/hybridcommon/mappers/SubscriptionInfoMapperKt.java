package com.revenuecat.purchases.hybridcommon.mappers;

import Td.z;
import Ud.S;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.SubscriptionInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/SubscriptionInfo;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionInfoMapperKt {
    public static final Map<String, Object> map(SubscriptionInfo subscriptionInfo) {
        AbstractC5504s.h(subscriptionInfo, "<this>");
        Pair pairA = z.a("productIdentifier", subscriptionInfo.getProductIdentifier());
        Pair pairA2 = z.a(b.f34624Q, MappersHelpersKt.toIso8601(subscriptionInfo.getPurchaseDate()));
        Date originalPurchaseDate = subscriptionInfo.getOriginalPurchaseDate();
        Pair pairA3 = z.a("originalPurchaseDate", originalPurchaseDate != null ? MappersHelpersKt.toIso8601(originalPurchaseDate) : null);
        Date expiresDate = subscriptionInfo.getExpiresDate();
        Pair pairA4 = z.a("expiresDate", expiresDate != null ? MappersHelpersKt.toIso8601(expiresDate) : null);
        Pair pairA5 = z.a(ProductResponseJsonKeys.STORE, subscriptionInfo.getStore().name());
        Date unsubscribeDetectedAt = subscriptionInfo.getUnsubscribeDetectedAt();
        Pair pairA6 = z.a("unsubscribeDetectedAt", unsubscribeDetectedAt != null ? MappersHelpersKt.toIso8601(unsubscribeDetectedAt) : null);
        Pair pairA7 = z.a("isSandbox", Boolean.valueOf(subscriptionInfo.getIsSandbox()));
        Date billingIssuesDetectedAt = subscriptionInfo.getBillingIssuesDetectedAt();
        Pair pairA8 = z.a("billingIssuesDetectedAt", billingIssuesDetectedAt != null ? MappersHelpersKt.toIso8601(billingIssuesDetectedAt) : null);
        Date gracePeriodExpiresDate = subscriptionInfo.getGracePeriodExpiresDate();
        Pair pairA9 = z.a("gracePeriodExpiresDate", gracePeriodExpiresDate != null ? MappersHelpersKt.toIso8601(gracePeriodExpiresDate) : null);
        Pair pairA10 = z.a("ownershipType", subscriptionInfo.getOwnershipType().name());
        Pair pairA11 = z.a("periodType", subscriptionInfo.getPeriodType().name());
        Date refundedAt = subscriptionInfo.getRefundedAt();
        return S.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, z.a("refundedAt", refundedAt != null ? MappersHelpersKt.toIso8601(refundedAt) : null), z.a("storeTransactionId", subscriptionInfo.getStoreTransactionId()), z.a("isActive", Boolean.valueOf(subscriptionInfo.getIsActive())), z.a("willRenew", Boolean.valueOf(subscriptionInfo.getWillRenew())));
    }
}
