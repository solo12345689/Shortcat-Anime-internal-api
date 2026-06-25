package com.revenuecat.purchases.hybridcommon.mappers;

import Gf.AbstractC1613i;
import Gf.AbstractC1617k;
import Gf.K;
import Gf.O;
import Td.L;
import Td.v;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.hybridcommon.CommonKt;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u0007*\u00020\u00002 \u0010\b\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u000eH\u0002¢\u0006\u0004\b\u0004\u0010\u000f\u001a3\u0010\t\u001a\u00020\u0007*\u00020\u000e2 \u0010\b\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\u0010\u001a\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0011¢\u0006\u0004\b\u0004\u0010\u0012\u001a\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u000b¢\u0006\u0004\b\u0004\u0010\u0013\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0014¢\u0006\u0004\b\u0004\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "", "", "", "map", "(Lcom/revenuecat/purchases/Offerings;)Ljava/util/Map;", "Lkotlin/Function1;", "LTd/L;", "callback", "mapAsync", "(Lcom/revenuecat/purchases/Offerings;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "createPresentedOfferingContextFromMap", "(Ljava/util/Map;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "Lcom/revenuecat/purchases/Offering;", "(Lcom/revenuecat/purchases/Offering;)Ljava/util/Map;", "(Lcom/revenuecat/purchases/Offering;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/Package;", "(Lcom/revenuecat/purchases/Package;)Ljava/util/Map;", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Ljava/util/Map;", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "(Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)Ljava/util/Map;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OfferingsMapperKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt$mapAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt$mapAsync$1", f = "OfferingsMapper.kt", l = {21}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ Offerings $this_mapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, Offerings offerings, e eVar) {
            super(2, eVar);
            this.$callback = function1;
            this.$this_mapAsync = offerings;
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
                OfferingsMapperKt$mapAsync$1$map$1 offeringsMapperKt$mapAsync$1$map$1 = new OfferingsMapperKt$mapAsync$1$map$1(this.$this_mapAsync, null);
                this.label = 1;
                obj = AbstractC1613i.g(mapperDispatcher, offeringsMapperKt$mapAsync$1$map$1, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            this.$callback.invoke((Map) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt$mapAsync$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt$mapAsync$2", f = "OfferingsMapper.kt", l = {50}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ Offering $this_mapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function1 function1, Offering offering, e eVar) {
            super(2, eVar);
            this.$callback = function1;
            this.$this_mapAsync = offering;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new AnonymousClass2(this.$callback, this.$this_mapAsync, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass2) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                K mapperDispatcher = MappersHelpersKt.getMapperDispatcher();
                OfferingsMapperKt$mapAsync$2$map$1 offeringsMapperKt$mapAsync$2$map$1 = new OfferingsMapperKt$mapAsync$2$map$1(this.$this_mapAsync, null);
                this.label = 1;
                obj = AbstractC1613i.g(mapperDispatcher, offeringsMapperKt$mapAsync$2$map$1, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            this.$callback.invoke((Map) obj);
            return L.f17438a;
        }
    }

    public static final PresentedOfferingContext createPresentedOfferingContextFromMap(Map<String, ? extends Object> map) {
        if (map != null) {
            return CommonKt.toPresentedOfferingContext(map);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Object> map(Offerings offerings) {
        Map<String, Offering> all = offerings.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(all.size()));
        Iterator<T> it = all.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), map((Offering) entry.getValue()));
        }
        Pair pairA = z.a("all", linkedHashMap);
        Offering current = offerings.getCurrent();
        return S.l(pairA, z.a("current", current != null ? map(current) : null));
    }

    public static final void mapAsync(Offerings offerings, Function1 callback) {
        AbstractC5504s.h(offerings, "<this>");
        AbstractC5504s.h(callback, "callback");
        AbstractC1617k.d(MappersHelpersKt.getMainScope(), null, null, new AnonymousClass1(callback, offerings, null), 3, null);
    }

    public static final void mapAsync(Offering offering, Function1 callback) {
        AbstractC5504s.h(offering, "<this>");
        AbstractC5504s.h(callback, "callback");
        AbstractC1617k.d(MappersHelpersKt.getMainScope(), null, null, new AnonymousClass2(callback, offering, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Object> map(Offering offering) {
        Pair pairA = z.a("identifier", offering.getIdentifier());
        Pair pairA2 = z.a("serverDescription", offering.getServerDescription());
        Pair pairA3 = z.a("metadata", offering.getMetadata());
        List<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(availablePackages, 10));
        Iterator<T> it = availablePackages.iterator();
        while (it.hasNext()) {
            arrayList.add(map((Package) it.next()));
        }
        Pair pairA4 = z.a("availablePackages", arrayList);
        Package lifetime = offering.getLifetime();
        Pair pairA5 = z.a("lifetime", lifetime != null ? map(lifetime) : null);
        Package annual = offering.getAnnual();
        Pair pairA6 = z.a("annual", annual != null ? map(annual) : null);
        Package sixMonth = offering.getSixMonth();
        Pair pairA7 = z.a("sixMonth", sixMonth != null ? map(sixMonth) : null);
        Package threeMonth = offering.getThreeMonth();
        Pair pairA8 = z.a("threeMonth", threeMonth != null ? map(threeMonth) : null);
        Package twoMonth = offering.getTwoMonth();
        Pair pairA9 = z.a("twoMonth", twoMonth != null ? map(twoMonth) : null);
        Package monthly = offering.getMonthly();
        Pair pairA10 = z.a("monthly", monthly != null ? map(monthly) : null);
        Package weekly = offering.getWeekly();
        Pair pairA11 = z.a("weekly", weekly != null ? map(weekly) : null);
        URL webCheckoutURL = offering.getWebCheckoutURL();
        return S.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, z.a("webCheckoutUrl", webCheckoutURL != null ? webCheckoutURL.toString() : null));
    }

    public static final Map<String, Object> map(Package r82) {
        AbstractC5504s.h(r82, "<this>");
        Pair pairA = z.a("identifier", r82.getIdentifier());
        Pair pairA2 = z.a("packageType", r82.getPackageType().name());
        Pair pairA3 = z.a("product", StoreProductMapperKt.map(r82.getProduct()));
        Pair pairA4 = z.a("offeringIdentifier", r82.getPresentedOfferingContext().getOfferingIdentifier());
        Pair pairA5 = z.a("presentedOfferingContext", map(r82.getPresentedOfferingContext()));
        URL webCheckoutURL = r82.getWebCheckoutURL();
        return S.l(pairA, pairA2, pairA3, pairA4, pairA5, z.a("webCheckoutUrl", webCheckoutURL != null ? webCheckoutURL.toString() : null));
    }

    public static final Map<String, Object> map(PresentedOfferingContext presentedOfferingContext) {
        AbstractC5504s.h(presentedOfferingContext, "<this>");
        Pair pairA = z.a("offeringIdentifier", presentedOfferingContext.getOfferingIdentifier());
        Pair pairA2 = z.a("placementIdentifier", presentedOfferingContext.getPlacementIdentifier());
        PresentedOfferingContext.TargetingContext targetingContext = presentedOfferingContext.getTargetingContext();
        return S.l(pairA, pairA2, z.a("targetingContext", targetingContext != null ? map(targetingContext) : null));
    }

    public static final Map<String, Object> map(PresentedOfferingContext.TargetingContext targetingContext) {
        AbstractC5504s.h(targetingContext, "<this>");
        return S.l(z.a("revision", Integer.valueOf(targetingContext.getRevision())), z.a("ruleId", targetingContext.getRuleId()));
    }
}
