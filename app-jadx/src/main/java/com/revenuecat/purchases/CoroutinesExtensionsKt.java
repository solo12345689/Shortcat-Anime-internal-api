package com.revenuecat.purchases;

import Td.u;
import Td.v;
import ae.AbstractC2605b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\r\u0010\f\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\f\u001a(\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0015\u0010\f\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0087@¢\u0006\u0004\b\u0017\u0010\f\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0019\u0010\f\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0087@¢\u0006\u0004\b\u001b\u0010\f\u001a$\u0010\u001f\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0087@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitCustomerInfo", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;", "", "appUserID", "Lcom/revenuecat/purchases/data/LogInResult;", "awaitLogIn", "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "awaitLogOut", "(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;", "awaitSyncPurchases", "Lcom/revenuecat/purchases/Offerings;", "awaitSyncAttributesAndOfferingsIfNeeded", "", "data", "awaitSetAppstackAttributionParams", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/Map;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "getAmazonLWAConsentStatus", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "awaitCustomerCenterConfigData", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "awaitGetVirtualCurrencies", "Ljava/util/Locale;", "awaitStorefrontLocale", "email", com.amazon.a.a.o.b.f34645c, "Lcom/revenuecat/purchases/CreateSupportTicketResult;", "awaitCreateSupportTicket", "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutinesExtensionsKt {
    public static final /* synthetic */ Object awaitCreateSupportTicket(Purchases purchases, String str, String str2, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        purchases.createSupportTicket(str, str2, new CoroutinesExtensionsKt$awaitCreateSupportTicket$2$1(kVar), new CoroutinesExtensionsKt$awaitCreateSupportTicket$2$2(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitCustomerCenterConfigData(Purchases purchases, Zd.e eVar) throws Throwable {
        final Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        purchases.getCustomerCenterConfigData$purchases_defaultsBc8Release(new GetCustomerCenterConfigCallback() { // from class: com.revenuecat.purchases.CoroutinesExtensionsKt$awaitCustomerCenterConfigData$2$1
            @Override // com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback
            public void onError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                Zd.e eVar2 = kVar;
                u.a aVar = u.f17466b;
                eVar2.resumeWith(u.b(v.a(new PurchasesException(error))));
            }

            @Override // com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback
            public void onSuccess(CustomerCenterConfigData customerCenterConfig) {
                AbstractC5504s.h(customerCenterConfig, "customerCenterConfig");
                kVar.resumeWith(u.b(customerCenterConfig));
            }
        });
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitCustomerInfo(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsKt.getCustomerInfoWith(purchases, cacheFetchPolicy, new CoroutinesExtensionsKt$awaitCustomerInfo$2$2(kVar), new CoroutinesExtensionsKt$awaitCustomerInfo$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitCustomerInfo$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cacheFetchPolicy = CacheFetchPolicy.INSTANCE.m113default();
        }
        return awaitCustomerInfo(purchases, cacheFetchPolicy, eVar);
    }

    public static final /* synthetic */ Object awaitGetVirtualCurrencies(Purchases purchases, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsKt.getVirtualCurrenciesWith(purchases, new CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$1(kVar), new CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$2(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitLogIn(Purchases purchases, String str, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsKt.logInWith(purchases, str, new CoroutinesExtensionsKt$awaitLogIn$2$1(kVar), new CoroutinesExtensionsKt$awaitLogIn$2$2(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitLogOut(Purchases purchases, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsKt.logOutWith(purchases, new CoroutinesExtensionsKt$awaitLogOut$2$1(kVar), new CoroutinesExtensionsKt$awaitLogOut$2$2(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitSetAppstackAttributionParams(Purchases purchases, Map map, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        purchases.setAppstackAttributionParams(map, ListenerConversionsKt.syncAttributesAndOfferingsListener(new CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$1(kVar), new CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$2(kVar)));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final Object awaitStorefrontLocale(Purchases purchases, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsKt.getStorefrontLocaleWith(purchases, new CoroutinesExtensionsKt$awaitStorefrontLocale$2$2(kVar), new CoroutinesExtensionsKt$awaitStorefrontLocale$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitSyncAttributesAndOfferingsIfNeeded(Purchases purchases, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(purchases, new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$2(kVar), new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitSyncPurchases(Purchases purchases, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsKt.syncPurchasesWith(purchases, new CoroutinesExtensionsKt$awaitSyncPurchases$2$2(kVar), new CoroutinesExtensionsKt$awaitSyncPurchases$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object getAmazonLWAConsentStatus(Purchases purchases, Zd.e eVar) throws Throwable {
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(purchases, new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$2(kVar), new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$1(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }
}
