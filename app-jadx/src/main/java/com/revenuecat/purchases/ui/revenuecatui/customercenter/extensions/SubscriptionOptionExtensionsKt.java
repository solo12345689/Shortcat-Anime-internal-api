package com.revenuecat.purchases.ui.revenuecatui.customercenter.extensions;

import Df.InterfaceC1279l;
import Df.p;
import Df.r;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.OfferPaymentMode;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PeriodExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PriceExtensionsKt;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\f\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, d2 = {"replaceVariables", "", "template", "replacements", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "getLocalizedDescription", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "localization", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "locale", "Ljava/util/Locale;", "getThreePhaseDescription", "getTwoPhaseDescription", "localizedTotalDuration", "Lcom/revenuecat/purchases/models/PricingPhase;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class SubscriptionOptionExtensionsKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfferPaymentMode.values().length];
            try {
                iArr[OfferPaymentMode.FREE_TRIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfferPaymentMode.SINGLE_PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfferPaymentMode.DISCOUNTED_RECURRING_PAYMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.extensions.SubscriptionOptionExtensionsKt$replaceVariables$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDf/l;", "matchResult", "", "invoke", "(LDf/l;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Map<CustomerCenterConfigData.Localization.VariableName, String> $replacements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Map<CustomerCenterConfigData.Localization.VariableName, String> map) {
            super(1);
            this.$replacements = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(InterfaceC1279l matchResult) {
            Object next;
            String str;
            AbstractC5504s.h(matchResult, "matchResult");
            String string = r.k1((String) matchResult.b().get(1)).toString();
            Iterator<T> it = this.$replacements.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC5504s.c(((CustomerCenterConfigData.Localization.VariableName) ((Map.Entry) next).getKey()).getIdentifier(), string)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            return (entry == null || (str = (String) entry.getValue()) == null) ? matchResult.getValue() : str;
        }
    }

    public static final /* synthetic */ String getLocalizedDescription(SubscriptionOption subscriptionOption, CustomerCenterConfigData.Localization localization, Locale locale) {
        AbstractC5504s.h(subscriptionOption, "<this>");
        AbstractC5504s.h(localization, "localization");
        AbstractC5504s.h(locale, "locale");
        int size = subscriptionOption.getPricingPhases().size();
        return size != 2 ? size != 3 ? ((PricingPhase) AbstractC2279u.m0(subscriptionOption.getPricingPhases())).getPrice().getFormatted() : getThreePhaseDescription(subscriptionOption, localization, locale) : getTwoPhaseDescription(subscriptionOption, localization, locale);
    }

    private static final String getThreePhaseDescription(SubscriptionOption subscriptionOption, CustomerCenterConfigData.Localization localization, Locale locale) {
        PricingPhase pricingPhase = (PricingPhase) AbstractC2279u.m0(subscriptionOption.getPricingPhases());
        PricingPhase pricingPhase2 = subscriptionOption.getPricingPhases().get(1);
        PricingPhase pricingPhase3 = (PricingPhase) AbstractC2279u.y0(subscriptionOption.getPricingPhases());
        String strLocalizedPerPeriod = PriceExtensionsKt.localizedPerPeriod(pricingPhase3.getPrice(), pricingPhase3.getBillingPeriod(), locale, false);
        if (pricingPhase.getOfferPaymentMode() != OfferPaymentMode.FREE_TRIAL) {
            return getTwoPhaseDescription(subscriptionOption, localization, locale);
        }
        String strLocalizedTotalDuration = localizedTotalDuration(pricingPhase, locale);
        String strLocalizedTotalDuration2 = localizedTotalDuration(pricingPhase2, locale);
        Integer billingCycleCount = pricingPhase2.getBillingCycleCount();
        Map mapL = S.l(z.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_DURATION, strLocalizedTotalDuration), z.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_DURATION_2, strLocalizedTotalDuration2), z.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_PRICE_2, pricingPhase2.getPrice().getFormatted()), z.a(CustomerCenterConfigData.Localization.VariableName.DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD, PriceExtensionsKt.localizedPerPeriod(pricingPhase2.getPrice(), pricingPhase2.getBillingPeriod(), locale, false)), z.a(CustomerCenterConfigData.Localization.VariableName.PRICE, strLocalizedPerPeriod), z.a(CustomerCenterConfigData.Localization.VariableName.DISCOUNTED_RECURRING_PAYMENT_CYCLES, String.valueOf(billingCycleCount != null ? billingCycleCount.intValue() : 1)));
        OfferPaymentMode offerPaymentMode = pricingPhase2.getOfferPaymentMode();
        int i10 = offerPaymentMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[offerPaymentMode.ordinal()];
        return i10 != 2 ? i10 != 3 ? strLocalizedPerPeriod : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE), mapL) : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE), mapL);
    }

    private static final String getTwoPhaseDescription(SubscriptionOption subscriptionOption, CustomerCenterConfigData.Localization localization, Locale locale) {
        PricingPhase pricingPhase = (PricingPhase) AbstractC2279u.m0(subscriptionOption.getPricingPhases());
        String strLocalizedTotalDuration = localizedTotalDuration(pricingPhase, locale);
        PricingPhase pricingPhase2 = (PricingPhase) AbstractC2279u.y0(subscriptionOption.getPricingPhases());
        String strLocalizedPerPeriod = PriceExtensionsKt.localizedPerPeriod(pricingPhase2.getPrice(), pricingPhase2.getBillingPeriod(), locale, false);
        Integer billingCycleCount = pricingPhase.getBillingCycleCount();
        Map mapL = S.l(z.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_DURATION, strLocalizedTotalDuration), z.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_PRICE, pricingPhase.getPrice().getFormatted()), z.a(CustomerCenterConfigData.Localization.VariableName.PRICE, strLocalizedPerPeriod), z.a(CustomerCenterConfigData.Localization.VariableName.DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD, PriceExtensionsKt.localizedPerPeriod(pricingPhase.getPrice(), pricingPhase.getBillingPeriod(), locale, false)), z.a(CustomerCenterConfigData.Localization.VariableName.DISCOUNTED_RECURRING_PAYMENT_CYCLES, String.valueOf(billingCycleCount != null ? billingCycleCount.intValue() : 1)));
        OfferPaymentMode offerPaymentMode = pricingPhase.getOfferPaymentMode();
        int i10 = offerPaymentMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[offerPaymentMode.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? strLocalizedPerPeriod : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE), mapL) : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SINGLE_PAYMENT_THEN_PRICE), mapL) : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.FREE_TRIAL_THEN_PRICE), mapL);
    }

    private static final String localizedTotalDuration(PricingPhase pricingPhase, Locale locale) {
        Integer billingCycleCount = pricingPhase.getBillingCycleCount();
        String str = MeasureFormat.getInstance(locale, MeasureFormat.FormatWidth.WIDE).format(new Measure(Integer.valueOf((billingCycleCount != null ? billingCycleCount.intValue() : 1) * pricingPhase.getBillingPeriod().getValue()), PeriodExtensionsKt.getMeasureUnit(pricingPhase.getBillingPeriod().getUnit())));
        AbstractC5504s.g(str, "getInstance(locale, Meas….unit.measureUnit),\n    )");
        return str;
    }

    private static final String replaceVariables(String str, Map<CustomerCenterConfigData.Localization.VariableName, String> map) {
        return new p("\\{\\{\\s*([^}]+)\\s*\\}\\}").j(str, new AnonymousClass1(map));
    }
}
