package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import com.revenuecat.purchases.models.Period;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/revenuecat/purchases/models/Period;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PricingPhaseExtensionsKt$productOfferPeriodInMonths$1 extends AbstractC5506u implements Function1 {
    public static final PricingPhaseExtensionsKt$productOfferPeriodInMonths$1 INSTANCE = new PricingPhaseExtensionsKt$productOfferPeriodInMonths$1();

    PricingPhaseExtensionsKt$productOfferPeriodInMonths$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Period productOfferPeriodInPeriodUnit) {
        AbstractC5504s.h(productOfferPeriodInPeriodUnit, "$this$productOfferPeriodInPeriodUnit");
        return PeriodExtensionsKt.getRoundedValueInMonths(productOfferPeriodInPeriodUnit);
    }
}
