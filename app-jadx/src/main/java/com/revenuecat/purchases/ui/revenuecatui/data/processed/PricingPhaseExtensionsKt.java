package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import ie.InterfaceC5082a;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import ke.AbstractC5466a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001aG\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00132\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0017\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u0018\u001a1\u0010\u001a\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u001a1\u0010\u001b\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\u0018\u001a1\u0010\u001c\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u0018\u001aM\u0010!\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\u0013H\u0000¢\u0006\u0004\b!\u0010\"\u001a)\u0010#\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b#\u0010$\u001a)\u0010%\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b%\u0010$\u001a1\u0010(\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r0\u0013H\u0000¢\u0006\u0004\b(\u0010)\u001a)\u0010*\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0004\b*\u0010$\u001a%\u0010-\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.\u001a\u001b\u00100\u001a\u00020/*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b0\u00101\"\u001a\u00104\u001a\u0004\u0018\u00010\r*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\"\u001a\u00106\u001a\u0004\u0018\u00010\r*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00103\"\u001a\u00108\u001a\u0004\u0018\u00010\r*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00103\"\u001a\u0010:\u001a\u0004\u0018\u00010\r*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u00103¨\u0006;"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/models/PricingPhase;", "primaryDiscountPhase", "(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/models/PricingPhase;", "secondaryDiscountPhase", "discountPhase", "Ljava/util/Locale;", "locale", "", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "localizedVariableKeys", "Lkotlin/Function0;", "productFallback", "resolveOfferPrice", "(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Map;Lie/a;)Ljava/lang/String;", "Lkotlin/Function1;", "discountValue", "resolveOfferPeriod", "(Lcom/revenuecat/purchases/models/PricingPhase;Lkotlin/jvm/functions/Function1;Lie/a;)Ljava/lang/String;", "productOfferPrice", "(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "productOfferPricePerDay", "productOfferPricePerWeek", "productOfferPricePerMonth", "productOfferPricePerYear", "Lcom/revenuecat/purchases/models/Period$Unit;", "unit", "Lcom/revenuecat/purchases/models/Price;", "calculatePrice", "productOfferPricePerPeriod", "(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Map;Lcom/revenuecat/purchases/models/Period$Unit;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "productOfferPeriod", "(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Map;)Ljava/lang/String;", "productOfferPeriodAbbreviated", "Lcom/revenuecat/purchases/models/Period;", "calculateValue", "productOfferPeriodInPeriodUnit", "(Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/models/Period$Unit;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "productOfferPeriodWithUnit", "Ljava/util/Date;", "date", "productOfferEndDate", "(Lcom/revenuecat/purchases/models/PricingPhase;Ljava/util/Locale;Ljava/util/Date;)Ljava/lang/String;", "", "canDisplay", "(Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/models/Period$Unit;)Z", "getProductOfferPeriodInDays", "(Lcom/revenuecat/purchases/models/PricingPhase;)Ljava/lang/String;", "productOfferPeriodInDays", "getProductOfferPeriodInWeeks", "productOfferPeriodInWeeks", "getProductOfferPeriodInMonths", "productOfferPeriodInMonths", "getProductOfferPeriodInYears", "productOfferPeriodInYears", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PricingPhaseExtensionsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.PricingPhaseExtensionsKt$productOfferPricePerDay$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/models/Price;", "Lcom/revenuecat/purchases/models/PricingPhase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Locale $locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Locale locale) {
            super(1);
            this.$locale = locale;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Price invoke(PricingPhase productOfferPricePerPeriod) {
            AbstractC5504s.h(productOfferPricePerPeriod, "$this$productOfferPricePerPeriod");
            return productOfferPricePerPeriod.pricePerDay(this.$locale);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.PricingPhaseExtensionsKt$productOfferPricePerMonth$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/models/Price;", "Lcom/revenuecat/purchases/models/PricingPhase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44291 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Locale $locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44291(Locale locale) {
            super(1);
            this.$locale = locale;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Price invoke(PricingPhase productOfferPricePerPeriod) {
            AbstractC5504s.h(productOfferPricePerPeriod, "$this$productOfferPricePerPeriod");
            return productOfferPricePerPeriod.pricePerMonth(this.$locale);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.PricingPhaseExtensionsKt$productOfferPricePerWeek$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/models/Price;", "Lcom/revenuecat/purchases/models/PricingPhase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44301 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Locale $locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44301(Locale locale) {
            super(1);
            this.$locale = locale;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Price invoke(PricingPhase productOfferPricePerPeriod) {
            AbstractC5504s.h(productOfferPricePerPeriod, "$this$productOfferPricePerPeriod");
            return productOfferPricePerPeriod.pricePerWeek(this.$locale);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.PricingPhaseExtensionsKt$productOfferPricePerYear$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/models/Price;", "Lcom/revenuecat/purchases/models/PricingPhase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44311 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Locale $locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44311(Locale locale) {
            super(1);
            this.$locale = locale;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Price invoke(PricingPhase productOfferPricePerPeriod) {
            AbstractC5504s.h(productOfferPricePerPeriod, "$this$productOfferPricePerPeriod");
            return productOfferPricePerPeriod.pricePerYear(this.$locale);
        }
    }

    public static final boolean canDisplay(PricingPhase pricingPhase, Period.Unit unit) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(unit, "unit");
        return unit.ordinal() <= pricingPhase.getBillingPeriod().getUnit().ordinal();
    }

    public static final String getProductOfferPeriodInDays(PricingPhase pricingPhase) {
        AbstractC5504s.h(pricingPhase, "<this>");
        return productOfferPeriodInPeriodUnit(pricingPhase, Period.Unit.DAY, PricingPhaseExtensionsKt$productOfferPeriodInDays$1.INSTANCE);
    }

    public static final String getProductOfferPeriodInMonths(PricingPhase pricingPhase) {
        AbstractC5504s.h(pricingPhase, "<this>");
        return productOfferPeriodInPeriodUnit(pricingPhase, Period.Unit.MONTH, PricingPhaseExtensionsKt$productOfferPeriodInMonths$1.INSTANCE);
    }

    public static final String getProductOfferPeriodInWeeks(PricingPhase pricingPhase) {
        AbstractC5504s.h(pricingPhase, "<this>");
        return productOfferPeriodInPeriodUnit(pricingPhase, Period.Unit.WEEK, PricingPhaseExtensionsKt$productOfferPeriodInWeeks$1.INSTANCE);
    }

    public static final String getProductOfferPeriodInYears(PricingPhase pricingPhase) {
        AbstractC5504s.h(pricingPhase, "<this>");
        return productOfferPeriodInPeriodUnit(pricingPhase, Period.Unit.YEAR, PricingPhaseExtensionsKt$productOfferPeriodInYears$1.INSTANCE);
    }

    public static final PricingPhase primaryDiscountPhase(SubscriptionOption subscriptionOption, Package r22) {
        StoreProduct product;
        if (subscriptionOption == null) {
            subscriptionOption = (r22 == null || (product = r22.getProduct()) == null) ? null : product.getDefaultOption();
        }
        if (subscriptionOption == null) {
            return null;
        }
        PricingPhase freePhase = subscriptionOption.getFreePhase();
        return freePhase == null ? subscriptionOption.getIntroPhase() : freePhase;
    }

    public static final String productOfferEndDate(PricingPhase pricingPhase, Locale locale, Date date) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(date, "date");
        Calendar calendar = Calendar.getInstance(locale);
        calendar.setTime(date);
        calendar.add(6, AbstractC5466a.c(pricingPhase.getBillingPeriod().getValueInDays()));
        return DateFormat.getDateInstance(1, locale).format(calendar.getTime());
    }

    public static final String productOfferPeriod(PricingPhase pricingPhase, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        VariableLocalizationKey periodUnitLocalizationKey = PeriodExtensionsKt.getPeriodUnitLocalizationKey(pricingPhase.getBillingPeriod());
        if (periodUnitLocalizationKey != null) {
            return PackagePeriodExtensionsKt.getStringOrLogError(localizedVariableKeys, periodUnitLocalizationKey);
        }
        return null;
    }

    public static final String productOfferPeriodAbbreviated(PricingPhase pricingPhase, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        VariableLocalizationKey periodUnitAbbreviatedLocalizationKey = PeriodExtensionsKt.getPeriodUnitAbbreviatedLocalizationKey(pricingPhase.getBillingPeriod());
        if (periodUnitAbbreviatedLocalizationKey != null) {
            return PackagePeriodExtensionsKt.getStringOrLogError(localizedVariableKeys, periodUnitAbbreviatedLocalizationKey);
        }
        return null;
    }

    public static final String productOfferPeriodInPeriodUnit(PricingPhase pricingPhase, Period.Unit unit, Function1 calculateValue) {
        Period billingPeriod;
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(unit, "unit");
        AbstractC5504s.h(calculateValue, "calculateValue");
        if (!canDisplay(pricingPhase, unit)) {
            pricingPhase = null;
        }
        if (pricingPhase == null || (billingPeriod = pricingPhase.getBillingPeriod()) == null) {
            return null;
        }
        return (String) calculateValue.invoke(billingPeriod);
    }

    public static final String productOfferPeriodWithUnit(PricingPhase pricingPhase, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        String stringOrLogError = PackagePeriodExtensionsKt.getStringOrLogError(localizedVariableKeys, PeriodExtensionsKt.getPeriodValueWithUnitLocalizationKey(pricingPhase.getBillingPeriod()));
        if (stringOrLogError == null) {
            return null;
        }
        String str = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(pricingPhase.getBillingPeriod().getValue())}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    public static final String productOfferPrice(PricingPhase pricingPhase, Locale locale, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        return pricingPhase.getPrice().getAmountMicros() == 0 ? PackagePeriodExtensionsKt.getStringOrLogError(localizedVariableKeys, VariableLocalizationKey.FREE_PRICE) : VariableDataProviderKt.getFormatted(pricingPhase.getPrice(), locale);
    }

    public static final String productOfferPricePerDay(PricingPhase pricingPhase, Locale locale, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        return productOfferPricePerPeriod(pricingPhase, locale, localizedVariableKeys, Period.Unit.DAY, new AnonymousClass1(locale));
    }

    public static final String productOfferPricePerMonth(PricingPhase pricingPhase, Locale locale, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        return productOfferPricePerPeriod(pricingPhase, locale, localizedVariableKeys, Period.Unit.MONTH, new C44291(locale));
    }

    public static final String productOfferPricePerPeriod(PricingPhase pricingPhase, Locale locale, Map<VariableLocalizationKey, String> localizedVariableKeys, Period.Unit unit, Function1 calculatePrice) {
        Price price;
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        AbstractC5504s.h(unit, "unit");
        AbstractC5504s.h(calculatePrice, "calculatePrice");
        if (!canDisplay(pricingPhase, unit)) {
            pricingPhase = null;
        }
        if (pricingPhase == null || (price = (Price) calculatePrice.invoke(pricingPhase)) == null) {
            return null;
        }
        return price.getAmountMicros() == 0 ? PackagePeriodExtensionsKt.getStringOrLogError(localizedVariableKeys, VariableLocalizationKey.FREE_PRICE) : VariableDataProviderKt.getFormatted(price, locale);
    }

    public static final String productOfferPricePerWeek(PricingPhase pricingPhase, Locale locale, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        return productOfferPricePerPeriod(pricingPhase, locale, localizedVariableKeys, Period.Unit.WEEK, new C44301(locale));
    }

    public static final String productOfferPricePerYear(PricingPhase pricingPhase, Locale locale, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        AbstractC5504s.h(pricingPhase, "<this>");
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        return productOfferPricePerPeriod(pricingPhase, locale, localizedVariableKeys, Period.Unit.YEAR, new C44311(locale));
    }

    public static final String resolveOfferPeriod(PricingPhase pricingPhase, Function1 discountValue, InterfaceC5082a productFallback) {
        String str;
        AbstractC5504s.h(discountValue, "discountValue");
        AbstractC5504s.h(productFallback, "productFallback");
        return (pricingPhase == null || (str = (String) discountValue.invoke(pricingPhase)) == null) ? (String) productFallback.invoke() : str;
    }

    public static final String resolveOfferPrice(PricingPhase pricingPhase, Locale locale, Map<VariableLocalizationKey, String> localizedVariableKeys, InterfaceC5082a productFallback) {
        String strProductOfferPrice;
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        AbstractC5504s.h(productFallback, "productFallback");
        return (pricingPhase == null || (strProductOfferPrice = productOfferPrice(pricingPhase, locale, localizedVariableKeys)) == null) ? (String) productFallback.invoke() : strProductOfferPrice;
    }

    public static final PricingPhase secondaryDiscountPhase(SubscriptionOption subscriptionOption, Package r22) {
        StoreProduct product;
        if (subscriptionOption == null) {
            subscriptionOption = (r22 == null || (product = r22.getProduct()) == null) ? null : product.getDefaultOption();
        }
        if (subscriptionOption == null || subscriptionOption.getFreePhase() == null) {
            return null;
        }
        return subscriptionOption.getIntroPhase();
    }
}
