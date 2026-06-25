package com.revenuecat.purchases.google;

import Ud.AbstractC2279u;
import com.android.billingclient.api.C3163h;
import com.revenuecat.purchases.models.GoogleInstallmentsInfo;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/android/billingclient/api/h$e;", "", "productId", "Lcom/android/billingclient/api/h;", "productDetails", "Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toSubscriptionOption", "(Lcom/android/billingclient/api/h$e;Ljava/lang/String;Lcom/android/billingclient/api/h;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "getSubscriptionBillingPeriod", "(Lcom/android/billingclient/api/h$e;)Ljava/lang/String;", "subscriptionBillingPeriod", "", "isBasePlan", "(Lcom/android/billingclient/api/h$e;)Z", "Lcom/android/billingclient/api/h$a;", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "(Lcom/android/billingclient/api/h$a;)Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionOptionConversionsKt {
    private static final GoogleInstallmentsInfo getInstallmentsInfo(C3163h.a aVar) {
        return new GoogleInstallmentsInfo(aVar.a(), aVar.b());
    }

    public static final String getSubscriptionBillingPeriod(C3163h.e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        List listA = eVar.f().a();
        AbstractC5504s.g(listA, "this.pricingPhases.pricingPhaseList");
        C3163h.c cVar = (C3163h.c) AbstractC2279u.A0(listA);
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public static final boolean isBasePlan(C3163h.e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        return eVar.f().a().size() == 1;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(C3163h.e eVar, String productId, C3163h productDetails) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(productDetails, "productDetails");
        List<C3163h.c> listA = eVar.f().a();
        AbstractC5504s.g(listA, "pricingPhases.pricingPhaseList");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listA, 10));
        for (C3163h.c it : listA) {
            AbstractC5504s.g(it, "it");
            arrayList.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(it));
        }
        String basePlanId = eVar.a();
        AbstractC5504s.g(basePlanId, "basePlanId");
        String strC = eVar.c();
        List offerTags = eVar.d();
        AbstractC5504s.g(offerTags, "offerTags");
        String offerToken = eVar.e();
        AbstractC5504s.g(offerToken, "offerToken");
        C3163h.a aVarB = eVar.b();
        return new GoogleSubscriptionOption(productId, basePlanId, strC, arrayList, offerTags, productDetails, offerToken, null, aVarB != null ? getInstallmentsInfo(aVarB) : null);
    }
}
