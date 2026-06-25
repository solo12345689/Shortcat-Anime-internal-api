package com.revenuecat.purchases.hybridcommon.mappers;

import Gf.AbstractC1613i;
import Gf.AbstractC1617k;
import Gf.K;
import Gf.O;
import Td.L;
import Td.r;
import Td.v;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import Zd.e;
import ae.AbstractC2605b;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.AmazonStoreProduct;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.models.InstallmentsInfo;
import com.revenuecat.purchases.models.OfferPaymentMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\u001a\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007\u001a?\u0010\u000b\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00000\u00062&\u0010\n\u001a\"\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\u0000H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0012\u0010\u0005\u001a!\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a)\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020!H\u0002¢\u0006\u0004\b\u0004\u0010\"\"\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010'\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(\"\u0015\u0010,\u001a\u00020)*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0015\u0010.\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b-\u0010\u0011\"\u0015\u00100\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b/\u0010\u0011\"\u0017\u00103\u001a\u0004\u0018\u00010\u0013*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0017\u00106\u001a\u0004\u0018\u00010#*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b4\u00105\"\u001a\u00109\u001a\u0004\u0018\u00010\u001b*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0017\u0010;\u001a\u0004\u0018\u00010\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0011\"\u0017\u0010=\u001a\u0004\u0018\u00010\u0013*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b<\u00102\"\u0015\u0010?\u001a\u00020)*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b>\u0010+\"\u0015\u0010B\u001a\u00020#*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/revenuecat/purchases/models/StoreProduct;", "", "", "", "map", "(Lcom/revenuecat/purchases/models/StoreProduct;)Ljava/util/Map;", "", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "LTd/L;", "callback", "mapAsync", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/hybridcommon/mappers/MappedProductCategory;", "mapProductCategory", "(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/hybridcommon/mappers/MappedProductCategory;", "mapProductType", "(Lcom/revenuecat/purchases/models/StoreProduct;)Ljava/lang/String;", "mapIntroPrice", "Lcom/revenuecat/purchases/models/Period;", "mapPeriodForStoreProduct", "(Lcom/revenuecat/purchases/models/Period;)Ljava/util/Map;", "mapPeriod", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "storeProduct", "mapSubscriptionOption", "(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/models/StoreProduct;)Ljava/util/Map;", "Lcom/revenuecat/purchases/models/PricingPhase;", "mapPricingPhase", "(Lcom/revenuecat/purchases/models/PricingPhase;)Ljava/util/Map;", "Lcom/revenuecat/purchases/models/Price;", "mapPrice", "(Lcom/revenuecat/purchases/models/Price;)Ljava/util/Map;", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "(Lcom/revenuecat/purchases/models/InstallmentsInfo;)Ljava/util/Map;", "", "DAYS_PER_WEEK", "I", "", "MICROS_CONVERSION_METRIC", "D", "", "getPriceAmountMicros", "(Lcom/revenuecat/purchases/models/StoreProduct;)J", "priceAmountMicros", "getPriceString", "priceString", "getPriceCurrencyCode", "priceCurrencyCode", "getGoogleFreeTrialPeriod", "(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/Period;", "googleFreeTrialPeriod", "getGoogleFreeTrialCycles", "(Lcom/revenuecat/purchases/models/StoreProduct;)Ljava/lang/Integer;", "googleFreeTrialCycles", "getGoogleIntroductoryPhase", "(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/PricingPhase;", "googleIntroductoryPhase", "getGoogleIntroductoryPrice", "googleIntroductoryPrice", "getGoogleIntroductoryPricePeriod", "googleIntroductoryPricePeriod", "getGoogleIntroductoryPriceAmountMicros", "googleIntroductoryPriceAmountMicros", "getGoogleIntroductoryPriceCycles", "(Lcom/revenuecat/purchases/models/StoreProduct;)I", "googleIntroductoryPriceCycles", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StoreProductMapperKt {
    private static final int DAYS_PER_WEEK = 7;
    private static final double MICROS_CONVERSION_METRIC = 1000000.0d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Period.Unit.values().length];
            try {
                iArr2[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt$mapAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt$mapAsync$1", f = "StoreProductMapper.kt", l = {72}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ List<StoreProduct> $this_mapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1 function1, List<? extends StoreProduct> list, e eVar) {
            super(2, eVar);
            this.$callback = function1;
            this.$this_mapAsync = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new AnonymousClass1(this.$callback, this.$this_mapAsync, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass1) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                K mapperDispatcher = MappersHelpersKt.getMapperDispatcher();
                StoreProductMapperKt$mapAsync$1$map$1 storeProductMapperKt$mapAsync$1$map$1 = new StoreProductMapperKt$mapAsync$1$map$1(this.$this_mapAsync, null);
                this.label = 1;
                obj = AbstractC1613i.g(mapperDispatcher, storeProductMapperKt$mapAsync$1$map$1, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            this.$callback.invoke((List) obj);
            return L.f17438a;
        }
    }

    public static final Integer getGoogleFreeTrialCycles(StoreProduct storeProduct) {
        PricingPhase freePhase;
        AbstractC5504s.h(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingCycleCount();
    }

    public static final Period getGoogleFreeTrialPeriod(StoreProduct storeProduct) {
        PricingPhase freePhase;
        AbstractC5504s.h(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingPeriod();
    }

    private static final PricingPhase getGoogleIntroductoryPhase(StoreProduct storeProduct) {
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    public static final String getGoogleIntroductoryPrice(StoreProduct storeProduct) {
        Price price;
        AbstractC5504s.h(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return null;
        }
        return price.getFormatted();
    }

    public static final long getGoogleIntroductoryPriceAmountMicros(StoreProduct storeProduct) {
        Price price;
        AbstractC5504s.h(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return 0L;
        }
        return price.getAmountMicros();
    }

    public static final int getGoogleIntroductoryPriceCycles(StoreProduct storeProduct) {
        Integer billingCycleCount;
        AbstractC5504s.h(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (billingCycleCount = googleIntroductoryPhase.getBillingCycleCount()) == null) {
            return 0;
        }
        return billingCycleCount.intValue();
    }

    public static final Period getGoogleIntroductoryPricePeriod(StoreProduct storeProduct) {
        AbstractC5504s.h(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase != null) {
            return googleIntroductoryPhase.getBillingPeriod();
        }
        return null;
    }

    public static final long getPriceAmountMicros(StoreProduct storeProduct) {
        AbstractC5504s.h(storeProduct, "<this>");
        return storeProduct.getPrice().getAmountMicros();
    }

    public static final String getPriceCurrencyCode(StoreProduct storeProduct) {
        AbstractC5504s.h(storeProduct, "<this>");
        return storeProduct.getPrice().getCurrencyCode();
    }

    public static final String getPriceString(StoreProduct storeProduct) {
        AbstractC5504s.h(storeProduct, "<this>");
        return storeProduct.getPrice().getFormatted();
    }

    public static final Map<String, Object> map(StoreProduct storeProduct) {
        Pair pair;
        ArrayList arrayList;
        AbstractC5504s.h(storeProduct, "<this>");
        Pair pairA = z.a("identifier", storeProduct.getId());
        Pair pairA2 = z.a(b.f34645c, storeProduct.getDescription());
        Pair pairA3 = z.a(b.f34626S, storeProduct.getTitle());
        Pair pairA4 = z.a(b.f34666x, Double.valueOf(getPriceAmountMicros(storeProduct) / 1000000.0d));
        Pair pairA5 = z.a("priceString", getPriceString(storeProduct));
        Pair pairA6 = z.a("currencyCode", getPriceCurrencyCode(storeProduct));
        Pair pairA7 = z.a("introPrice", mapIntroPrice(storeProduct));
        Pair pairA8 = z.a("discounts", null);
        Pair pairA9 = z.a("pricePerWeek", StoreProduct.pricePerWeek$default(storeProduct, null, 1, null) != null ? Double.valueOf(r13.getAmountMicros() / 1000000.0d) : null);
        Pair pairA10 = z.a("pricePerMonth", StoreProduct.pricePerMonth$default(storeProduct, null, 1, null) != null ? Double.valueOf(r14.getAmountMicros() / 1000000.0d) : null);
        Pair pairA11 = z.a("pricePerYear", StoreProduct.pricePerYear$default(storeProduct, null, 1, null) != null ? Double.valueOf(r15.getAmountMicros() / 1000000.0d) : null);
        Price pricePricePerWeek$default = StoreProduct.pricePerWeek$default(storeProduct, null, 1, null);
        Pair pairA12 = z.a("pricePerWeekString", pricePricePerWeek$default != null ? pricePricePerWeek$default.getFormatted() : null);
        Price pricePricePerMonth$default = StoreProduct.pricePerMonth$default(storeProduct, null, 1, null);
        Pair pairA13 = z.a("pricePerMonthString", pricePricePerMonth$default != null ? pricePricePerMonth$default.getFormatted() : null);
        Price pricePricePerYear$default = StoreProduct.pricePerYear$default(storeProduct, null, 1, null);
        Pair pairA14 = z.a("pricePerYearString", pricePricePerYear$default != null ? pricePricePerYear$default.getFormatted() : null);
        Pair pairA15 = z.a("productCategory", mapProductCategory(storeProduct).getValue());
        Pair pairA16 = z.a("productType", mapProductType(storeProduct));
        Period period = storeProduct.getPeriod();
        Pair pairA17 = z.a(b.f34657o, period != null ? period.getIso8601() : null);
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        Pair pairA18 = z.a("defaultOption", defaultOption != null ? mapSubscriptionOption(defaultOption, storeProduct) : null);
        SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
        if (subscriptionOptions != null) {
            pair = pairA5;
            arrayList = new ArrayList(AbstractC2279u.x(subscriptionOptions, 10));
            Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
            while (it.hasNext()) {
                arrayList.add(mapSubscriptionOption(it.next(), storeProduct));
            }
        } else {
            pair = pairA5;
            arrayList = null;
        }
        Pair pairA19 = z.a("subscriptionOptions", arrayList);
        PresentedOfferingContext presentedOfferingContext = storeProduct.getPresentedOfferingContext();
        Pair pairA20 = z.a("presentedOfferingIdentifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = storeProduct.getPresentedOfferingContext();
        return S.l(pairA, pairA2, pairA3, pairA4, pair, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, pairA20, z.a("presentedOfferingContext", presentedOfferingContext2 != null ? OfferingsMapperKt.map(presentedOfferingContext2) : null));
    }

    public static final void mapAsync(List<? extends StoreProduct> list, Function1 callback) {
        AbstractC5504s.h(list, "<this>");
        AbstractC5504s.h(callback, "callback");
        AbstractC1617k.d(MappersHelpersKt.getMainScope(), null, null, new AnonymousClass1(callback, list, null), 3, null);
    }

    public static final Map<String, Object> mapIntroPrice(StoreProduct storeProduct) {
        Period googleIntroductoryPricePeriod;
        Map<String, Object> mapMapPeriodForStoreProduct;
        Map<String, Object> mapMapPeriodForStoreProduct2;
        Map<String, Object> mapMapPeriodForStoreProduct3;
        AbstractC5504s.h(storeProduct, "<this>");
        if (storeProduct instanceof AmazonStoreProduct) {
            AmazonStoreProduct amazonStoreProduct = (AmazonStoreProduct) storeProduct;
            Period freeTrialPeriod = amazonStoreProduct.getFreeTrialPeriod();
            if (freeTrialPeriod == null || (mapMapPeriodForStoreProduct3 = mapPeriodForStoreProduct(freeTrialPeriod)) == null) {
                return null;
            }
            Pair pairA = z.a(b.f34666x, 0);
            Pair pairA2 = z.a("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0L));
            Period freeTrialPeriod2 = amazonStoreProduct.getFreeTrialPeriod();
            return S.p(S.l(pairA, pairA2, z.a("period", freeTrialPeriod2 != null ? freeTrialPeriod2.getIso8601() : null), z.a("cycles", 1)), mapMapPeriodForStoreProduct3);
        }
        if (getGoogleFreeTrialPeriod(storeProduct) == null) {
            if (getGoogleIntroductoryPrice(storeProduct) == null || (googleIntroductoryPricePeriod = getGoogleIntroductoryPricePeriod(storeProduct)) == null || (mapMapPeriodForStoreProduct = mapPeriodForStoreProduct(googleIntroductoryPricePeriod)) == null) {
                return null;
            }
            Pair pairA3 = z.a(b.f34666x, Double.valueOf(getGoogleIntroductoryPriceAmountMicros(storeProduct) / 1000000.0d));
            Pair pairA4 = z.a("priceString", getGoogleIntroductoryPrice(storeProduct));
            Period googleIntroductoryPricePeriod2 = getGoogleIntroductoryPricePeriod(storeProduct);
            return S.p(S.l(pairA3, pairA4, z.a("period", googleIntroductoryPricePeriod2 != null ? googleIntroductoryPricePeriod2.getIso8601() : null), z.a("cycles", Integer.valueOf(getGoogleIntroductoryPriceCycles(storeProduct)))), mapMapPeriodForStoreProduct);
        }
        Period googleFreeTrialPeriod = getGoogleFreeTrialPeriod(storeProduct);
        if (googleFreeTrialPeriod == null || (mapMapPeriodForStoreProduct2 = mapPeriodForStoreProduct(googleFreeTrialPeriod)) == null) {
            return null;
        }
        Pair pairA5 = z.a(b.f34666x, 0);
        Pair pairA6 = z.a("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0L));
        Period googleFreeTrialPeriod2 = getGoogleFreeTrialPeriod(storeProduct);
        Pair pairA7 = z.a("period", googleFreeTrialPeriod2 != null ? googleFreeTrialPeriod2.getIso8601() : null);
        Integer googleFreeTrialCycles = getGoogleFreeTrialCycles(storeProduct);
        return S.p(S.l(pairA5, pairA6, pairA7, z.a("cycles", Integer.valueOf(googleFreeTrialCycles != null ? googleFreeTrialCycles.intValue() : 1))), mapMapPeriodForStoreProduct2);
    }

    private static final Map<String, Object> mapPeriod(Period period) {
        Map mapL;
        int i10 = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i10 == 1) {
            mapL = S.l(z.a("unit", "DAY"), z.a("value", Integer.valueOf(period.getValue())));
        } else if (i10 == 2) {
            mapL = S.l(z.a("unit", "DAY"), z.a("value", Integer.valueOf(period.getValue() * 7)));
        } else if (i10 == 3) {
            mapL = S.l(z.a("unit", "MONTH"), z.a("value", Integer.valueOf(period.getValue())));
        } else if (i10 == 4) {
            mapL = S.l(z.a("unit", "YEAR"), z.a("value", Integer.valueOf(period.getValue())));
        } else {
            if (i10 != 5) {
                throw new r();
            }
            mapL = S.l(z.a("unit", "DAY"), z.a("value", 0));
        }
        return S.p(mapL, S.f(z.a("iso8601", period.getIso8601())));
    }

    private static final Map<String, Object> mapPeriodForStoreProduct(Period period) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i10 == 1) {
            return S.l(z.a("periodUnit", "DAY"), z.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i10 == 2) {
            return S.l(z.a("periodUnit", "DAY"), z.a("periodNumberOfUnits", Integer.valueOf(period.getValue() * 7)));
        }
        if (i10 == 3) {
            return S.l(z.a("periodUnit", "MONTH"), z.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i10 == 4) {
            return S.l(z.a("periodUnit", "YEAR"), z.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i10 == 5) {
            return S.l(z.a("periodUnit", "DAY"), z.a("periodNumberOfUnits", 0));
        }
        throw new r();
    }

    private static final Map<String, Object> mapPrice(Price price) {
        return S.l(z.a("formatted", price.getFormatted()), z.a("amountMicros", Long.valueOf(price.getAmountMicros())), z.a("currencyCode", price.getCurrencyCode()));
    }

    private static final Map<String, Object> mapPricingPhase(PricingPhase pricingPhase) {
        Period billingPeriod = pricingPhase.getBillingPeriod();
        Pair pairA = z.a("billingPeriod", billingPeriod != null ? mapPeriod(billingPeriod) : null);
        Pair pairA2 = z.a("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier());
        Pair pairA3 = z.a("billingCycleCount", pricingPhase.getBillingCycleCount());
        Pair pairA4 = z.a(b.f34666x, mapPrice(pricingPhase.getPrice()));
        OfferPaymentMode offerPaymentMode = pricingPhase.getOfferPaymentMode();
        return S.l(pairA, pairA2, pairA3, pairA4, z.a("offerPaymentMode", offerPaymentMode != null ? offerPaymentMode.toString() : null));
    }

    public static final MappedProductCategory mapProductCategory(StoreProduct storeProduct) {
        AbstractC5504s.h(storeProduct, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i10 == 1) {
            return MappedProductCategory.NON_SUBSCRIPTION;
        }
        if (i10 == 2) {
            return MappedProductCategory.SUBSCRIPTION;
        }
        if (i10 == 3) {
            return MappedProductCategory.UNKNOWN;
        }
        throw new r();
    }

    public static final String mapProductType(StoreProduct storeProduct) {
        AbstractC5504s.h(storeProduct, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i10 == 1) {
            return "CONSUMABLE";
        }
        if (i10 == 2) {
            SubscriptionOption defaultOption = storeProduct.getDefaultOption();
            return (defaultOption == null || !defaultOption.isPrepaid()) ? "AUTO_RENEWABLE_SUBSCRIPTION" : "PREPAID_SUBSCRIPTION";
        }
        if (i10 == 3) {
            return "UNKNOWN";
        }
        throw new r();
    }

    private static final Map<String, Object> mapSubscriptionOption(SubscriptionOption subscriptionOption, StoreProduct storeProduct) {
        Pair pairA = z.a(DiagnosticsEntry.ID_KEY, subscriptionOption.get$id());
        Pair pairA2 = z.a("storeProductId", storeProduct.getId());
        Pair pairA3 = z.a("productId", storeProduct.getPurchasingData().getProductId());
        List<PricingPhase> pricingPhases = subscriptionOption.getPricingPhases();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(pricingPhases, 10));
        Iterator<T> it = pricingPhases.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPricingPhase((PricingPhase) it.next()));
        }
        Pair pairA4 = z.a("pricingPhases", arrayList);
        Pair pairA5 = z.a("tags", subscriptionOption.getTags());
        Pair pairA6 = z.a("isBasePlan", Boolean.valueOf(subscriptionOption.isBasePlan()));
        Period billingPeriod = subscriptionOption.getBillingPeriod();
        Pair pairA7 = z.a("billingPeriod", billingPeriod != null ? mapPeriod(billingPeriod) : null);
        Pair pairA8 = z.a("isPrepaid", Boolean.valueOf(subscriptionOption.isPrepaid()));
        PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
        Pair pairA9 = z.a("fullPricePhase", fullPricePhase != null ? mapPricingPhase(fullPricePhase) : null);
        PricingPhase freePhase = subscriptionOption.getFreePhase();
        Pair pairA10 = z.a("freePhase", freePhase != null ? mapPricingPhase(freePhase) : null);
        PricingPhase introPhase = subscriptionOption.getIntroPhase();
        Pair pairA11 = z.a("introPhase", introPhase != null ? mapPricingPhase(introPhase) : null);
        PresentedOfferingContext presentedOfferingContext = subscriptionOption.get$presentedOfferingContext();
        Pair pairA12 = z.a("presentedOfferingIdentifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = subscriptionOption.get$presentedOfferingContext();
        Pair pairA13 = z.a("presentedOfferingContext", presentedOfferingContext2 != null ? OfferingsMapperKt.map(presentedOfferingContext2) : null);
        InstallmentsInfo installmentsInfo = subscriptionOption.get$installmentsInfo();
        return S.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, z.a("installmentsInfo", installmentsInfo != null ? map(installmentsInfo) : null));
    }

    private static final Map<String, Object> map(InstallmentsInfo installmentsInfo) {
        return S.l(z.a("commitmentPaymentsCount", Integer.valueOf(installmentsInfo.getCommitmentPaymentsCount())), z.a("renewalCommitmentPaymentsCount", Integer.valueOf(installmentsInfo.getRenewalCommitmentPaymentsCount())));
    }

    public static final List<Map<String, Object>> map(List<? extends StoreProduct> list) {
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(map((StoreProduct) it.next()));
        }
        return arrayList;
    }
}
