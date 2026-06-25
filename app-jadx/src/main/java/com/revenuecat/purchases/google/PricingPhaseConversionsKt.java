package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3163h;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/android/billingclient/api/h$c;", "Lcom/revenuecat/purchases/models/PricingPhase;", "toRevenueCatPricingPhase", "(Lcom/android/billingclient/api/h$c;)Lcom/revenuecat/purchases/models/PricingPhase;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(C3163h.c cVar) {
        AbstractC5504s.h(cVar, "<this>");
        Period.Companion companion = Period.INSTANCE;
        String billingPeriod = cVar.b();
        AbstractC5504s.g(billingPeriod, "billingPeriod");
        Period periodCreate = companion.create(billingPeriod);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(cVar.f()));
        Integer numValueOf = Integer.valueOf(cVar.a());
        String formattedPrice = cVar.c();
        AbstractC5504s.g(formattedPrice, "formattedPrice");
        long jD = cVar.d();
        String priceCurrencyCode = cVar.e();
        AbstractC5504s.g(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhase(periodCreate, recurrenceMode, numValueOf, new Price(formattedPrice, jD, priceCurrencyCode));
    }
}
