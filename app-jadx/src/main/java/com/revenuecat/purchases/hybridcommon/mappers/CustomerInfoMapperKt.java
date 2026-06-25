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
import android.net.Uri;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.SubscriptionInfo;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Date;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u0007*\u00020\u00002 \u0010\b\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "", "", "", "map", "(Lcom/revenuecat/purchases/CustomerInfo;)Ljava/util/Map;", "Lkotlin/Function1;", "LTd/L;", "callback", "mapAsync", "(Lcom/revenuecat/purchases/CustomerInfo;Lkotlin/jvm/functions/Function1;)V", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfoMapperKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt$mapAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt$mapAsync$1", f = "CustomerInfoMapper.kt", l = {38}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ CustomerInfo $this_mapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, CustomerInfo customerInfo, e eVar) {
            super(2, eVar);
            this.$callback = function1;
            this.$this_mapAsync = customerInfo;
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
                CustomerInfoMapperKt$mapAsync$1$map$1 customerInfoMapperKt$mapAsync$1$map$1 = new CustomerInfoMapperKt$mapAsync$1$map$1(this.$this_mapAsync, null);
                this.label = 1;
                obj = AbstractC1613i.g(mapperDispatcher, customerInfoMapperKt$mapAsync$1$map$1, this);
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

    public static final Map<String, Object> map(CustomerInfo customerInfo) {
        AbstractC5504s.h(customerInfo, "<this>");
        Pair pairA = z.a(CustomerInfoResponseJsonKeys.ENTITLEMENTS, EntitlementInfosMapperKt.map(customerInfo.getEntitlements()));
        Pair pairA2 = z.a("activeSubscriptions", AbstractC2279u.b1(customerInfo.getActiveSubscriptions()));
        Pair pairA3 = z.a("allPurchasedProductIdentifiers", AbstractC2279u.b1(customerInfo.getAllPurchasedProductIds()));
        Date latestExpirationDate = customerInfo.getLatestExpirationDate();
        Pair pairA4 = z.a("latestExpirationDate", latestExpirationDate != null ? MappersHelpersKt.toIso8601(latestExpirationDate) : null);
        Date latestExpirationDate2 = customerInfo.getLatestExpirationDate();
        Pair pairA5 = z.a("latestExpirationDateMillis", latestExpirationDate2 != null ? Long.valueOf(MappersHelpersKt.toMillis(latestExpirationDate2)) : null);
        Pair pairA6 = z.a("firstSeen", MappersHelpersKt.toIso8601(customerInfo.getFirstSeen()));
        Pair pairA7 = z.a("firstSeenMillis", Long.valueOf(MappersHelpersKt.toMillis(customerInfo.getFirstSeen())));
        Pair pairA8 = z.a("originalAppUserId", customerInfo.getOriginalAppUserId());
        Pair pairA9 = z.a("requestDate", MappersHelpersKt.toIso8601(customerInfo.getRequestDate()));
        Pair pairA10 = z.a("requestDateMillis", Long.valueOf(MappersHelpersKt.toMillis(customerInfo.getRequestDate())));
        Map<String, Date> allExpirationDatesByProduct = customerInfo.getAllExpirationDatesByProduct();
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(allExpirationDatesByProduct.size()));
        Iterator<T> it = allExpirationDatesByProduct.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Date date = (Date) entry.getValue();
            linkedHashMap.put(key, date != null ? MappersHelpersKt.toIso8601(date) : null);
        }
        Pair pairA11 = z.a("allExpirationDates", linkedHashMap);
        Map<String, Date> allExpirationDatesByProduct2 = customerInfo.getAllExpirationDatesByProduct();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(S.e(allExpirationDatesByProduct2.size()));
        Iterator<T> it2 = allExpirationDatesByProduct2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Object key2 = entry2.getKey();
            Date date2 = (Date) entry2.getValue();
            linkedHashMap2.put(key2, date2 != null ? Long.valueOf(MappersHelpersKt.toMillis(date2)) : null);
        }
        Pair pairA12 = z.a("allExpirationDatesMillis", linkedHashMap2);
        Map<String, Date> allPurchaseDatesByProduct = customerInfo.getAllPurchaseDatesByProduct();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(S.e(allPurchaseDatesByProduct.size()));
        Iterator it3 = allPurchaseDatesByProduct.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            Iterator it4 = it3;
            Object key3 = entry3.getKey();
            Date date3 = (Date) entry3.getValue();
            linkedHashMap3.put(key3, date3 != null ? MappersHelpersKt.toIso8601(date3) : null);
            it3 = it4;
        }
        Pair pairA13 = z.a("allPurchaseDates", linkedHashMap3);
        Map<String, Date> allPurchaseDatesByProduct2 = customerInfo.getAllPurchaseDatesByProduct();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(S.e(allPurchaseDatesByProduct2.size()));
        Iterator it5 = allPurchaseDatesByProduct2.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it5.next();
            Iterator it6 = it5;
            Object key4 = entry4.getKey();
            Date date4 = (Date) entry4.getValue();
            linkedHashMap4.put(key4, date4 != null ? Long.valueOf(MappersHelpersKt.toMillis(date4)) : null);
            it5 = it6;
        }
        Pair pairA14 = z.a("allPurchaseDatesMillis", linkedHashMap4);
        Pair pairA15 = z.a("originalApplicationVersion", null);
        Uri managementURL = customerInfo.getManagementURL();
        Pair pairA16 = z.a("managementURL", managementURL != null ? managementURL.toString() : null);
        Date originalPurchaseDate = customerInfo.getOriginalPurchaseDate();
        Pair pairA17 = z.a("originalPurchaseDate", originalPurchaseDate != null ? MappersHelpersKt.toIso8601(originalPurchaseDate) : null);
        Date originalPurchaseDate2 = customerInfo.getOriginalPurchaseDate();
        Pair pairA18 = z.a("originalPurchaseDateMillis", originalPurchaseDate2 != null ? Long.valueOf(MappersHelpersKt.toMillis(originalPurchaseDate2)) : null);
        List<Transaction> nonSubscriptionTransactions = customerInfo.getNonSubscriptionTransactions();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(nonSubscriptionTransactions, 10));
        Iterator<T> it7 = nonSubscriptionTransactions.iterator();
        while (it7.hasNext()) {
            arrayList.add(TransactionMapperKt.map((Transaction) it7.next()));
        }
        Pair pairA19 = z.a("nonSubscriptionTransactions", arrayList);
        Map<String, SubscriptionInfo> subscriptionsByProductIdentifier = customerInfo.getSubscriptionsByProductIdentifier();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(S.e(subscriptionsByProductIdentifier.size()));
        for (Iterator it8 = subscriptionsByProductIdentifier.entrySet().iterator(); it8.hasNext(); it8 = it8) {
            Map.Entry entry5 = (Map.Entry) it8.next();
            linkedHashMap5.put(entry5.getKey(), SubscriptionInfoMapperKt.map((SubscriptionInfo) entry5.getValue()));
        }
        return S.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, z.a("subscriptionsByProductIdentifier", linkedHashMap5));
    }

    public static final void mapAsync(CustomerInfo customerInfo, Function1 callback) {
        AbstractC5504s.h(customerInfo, "<this>");
        AbstractC5504s.h(callback, "callback");
        AbstractC1617k.d(MappersHelpersKt.getMainScope(), null, null, new AnonymousClass1(callback, customerInfo, null), 3, null);
    }
}
