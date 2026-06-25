package com.revenuecat.purchases.ui.revenuecatui.extensions;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0001*\u00020\u000fH\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0018\u0010\b\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"introOfferEligibility", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "Lcom/revenuecat/purchases/Package;", "getIntroOfferEligibility", "(Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "isMonthly", "", "(Lcom/revenuecat/purchases/Package;)Z", "isSubscription", "offerEligibility", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "getOfferEligibility", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "calculateOfferEligibility", "resolvedOffer", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "rcPackage", "promoOfferEligibility", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PackageExtensionsKt {
    public static final OfferEligibility calculateOfferEligibility(ResolvedOffer resolvedOffer, Package rcPackage) {
        AbstractC5504s.h(rcPackage, "rcPackage");
        if (resolvedOffer != null && resolvedOffer.isPromoOffer()) {
            OfferEligibility offerEligibilityPromoOfferEligibility = promoOfferEligibility(resolvedOffer);
            if (!AbstractC5504s.c(offerEligibilityPromoOfferEligibility, OfferEligibility.PromoOfferIneligible.INSTANCE)) {
                return offerEligibilityPromoOfferEligibility;
            }
        }
        return getIntroOfferEligibility(rcPackage);
    }

    public static final OfferEligibility getIntroOfferEligibility(Package r12) {
        List<PricingPhase> pricingPhases;
        AbstractC5504s.h(r12, "<this>");
        SubscriptionOption defaultOption = r12.getProduct().getDefaultOption();
        int size = ((defaultOption == null || (pricingPhases = defaultOption.getPricingPhases()) == null) ? 0 : pricingPhases.size()) - 1;
        return size != 1 ? size != 2 ? OfferEligibility.Ineligible.INSTANCE : OfferEligibility.IntroOfferMultiple.INSTANCE : OfferEligibility.IntroOfferSingle.INSTANCE;
    }

    public static final OfferEligibility getOfferEligibility(TemplateConfiguration.PackageInfo packageInfo) {
        AbstractC5504s.h(packageInfo, "<this>");
        return getIntroOfferEligibility(packageInfo.getRcPackage());
    }

    public static final boolean isMonthly(Package r32) {
        AbstractC5504s.h(r32, "<this>");
        Period period = r32.getProduct().getPeriod();
        return period != null && period.getUnit() == Period.Unit.MONTH && period.getValue() == 1;
    }

    public static final boolean isSubscription(Package r12) {
        AbstractC5504s.h(r12, "<this>");
        return r12.getProduct().getType() == ProductType.SUBS;
    }

    private static final OfferEligibility promoOfferEligibility(ResolvedOffer resolvedOffer) {
        List<PricingPhase> pricingPhases;
        SubscriptionOption subscriptionOption = resolvedOffer.getSubscriptionOption();
        int size = ((subscriptionOption == null || (pricingPhases = subscriptionOption.getPricingPhases()) == null) ? 0 : pricingPhases.size()) - 1;
        return size != 1 ? size != 2 ? OfferEligibility.PromoOfferIneligible.INSTANCE : OfferEligibility.PromoOfferMultiple.INSTANCE : OfferEligibility.PromoOfferSingle.INSTANCE;
    }
}
