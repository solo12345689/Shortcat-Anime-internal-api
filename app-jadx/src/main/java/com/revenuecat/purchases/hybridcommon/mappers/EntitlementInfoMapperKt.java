package com.revenuecat.purchases.hybridcommon.mappers;

import Td.z;
import Ud.S;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/EntitlementInfo;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EntitlementInfoMapperKt {
    public static final Map<String, Object> map(EntitlementInfo entitlementInfo) {
        AbstractC5504s.h(entitlementInfo, "<this>");
        Pair pairA = z.a("identifier", entitlementInfo.getIdentifier());
        Pair pairA2 = z.a("isActive", Boolean.valueOf(entitlementInfo.getIsActive()));
        Pair pairA3 = z.a("willRenew", Boolean.valueOf(entitlementInfo.getWillRenew()));
        Pair pairA4 = z.a("periodType", entitlementInfo.getPeriodType().name());
        Pair pairA5 = z.a("latestPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getLatestPurchaseDate())));
        Pair pairA6 = z.a("latestPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getLatestPurchaseDate()));
        Pair pairA7 = z.a("originalPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getOriginalPurchaseDate())));
        Pair pairA8 = z.a("originalPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getOriginalPurchaseDate()));
        Date expirationDate = entitlementInfo.getExpirationDate();
        Pair pairA9 = z.a("expirationDateMillis", expirationDate != null ? Long.valueOf(MappersHelpersKt.toMillis(expirationDate)) : null);
        Date expirationDate2 = entitlementInfo.getExpirationDate();
        Pair pairA10 = z.a("expirationDate", expirationDate2 != null ? MappersHelpersKt.toIso8601(expirationDate2) : null);
        Pair pairA11 = z.a(ProductResponseJsonKeys.STORE, entitlementInfo.getStore().name());
        Pair pairA12 = z.a("productIdentifier", entitlementInfo.getProductIdentifier());
        Pair pairA13 = z.a("productPlanIdentifier", entitlementInfo.getProductPlanIdentifier());
        Pair pairA14 = z.a("isSandbox", Boolean.valueOf(entitlementInfo.getIsSandbox()));
        Date unsubscribeDetectedAt = entitlementInfo.getUnsubscribeDetectedAt();
        Pair pairA15 = z.a("unsubscribeDetectedAt", unsubscribeDetectedAt != null ? MappersHelpersKt.toIso8601(unsubscribeDetectedAt) : null);
        Date unsubscribeDetectedAt2 = entitlementInfo.getUnsubscribeDetectedAt();
        Pair pairA16 = z.a("unsubscribeDetectedAtMillis", unsubscribeDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(unsubscribeDetectedAt2)) : null);
        Date billingIssueDetectedAt = entitlementInfo.getBillingIssueDetectedAt();
        Pair pairA17 = z.a("billingIssueDetectedAt", billingIssueDetectedAt != null ? MappersHelpersKt.toIso8601(billingIssueDetectedAt) : null);
        Date billingIssueDetectedAt2 = entitlementInfo.getBillingIssueDetectedAt();
        return S.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, z.a("billingIssueDetectedAtMillis", billingIssueDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(billingIssueDetectedAt2)) : null), z.a("ownershipType", entitlementInfo.getOwnershipType().name()), z.a("verification", entitlementInfo.getVerification().name()));
    }
}
