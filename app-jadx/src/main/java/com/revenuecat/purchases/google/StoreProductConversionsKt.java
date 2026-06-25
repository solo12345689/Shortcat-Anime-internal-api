package com.revenuecat.purchases.google;

import Td.L;
import Ud.AbstractC2279u;
import Ud.S;
import com.android.billingclient.api.C3163h;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/android/billingclient/api/h;", "Lcom/revenuecat/purchases/models/StoreProduct;", "toInAppStoreProduct", "(Lcom/android/billingclient/api/h;)Lcom/revenuecat/purchases/models/StoreProduct;", "", "Lcom/android/billingclient/api/h$e;", "offerDetails", "Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toStoreProduct", "(Lcom/android/billingclient/api/h;Ljava/util/List;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/Price;", "createOneTimeProductPrice", "(Lcom/android/billingclient/api/h;)Lcom/revenuecat/purchases/models/Price;", "toStoreProducts", "(Ljava/util/List;)Ljava/util/List;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(C3163h c3163h) {
        C3163h.b bVarC;
        if (ProductTypeConversionsKt.toRevenueCatProductType(c3163h.f()) != ProductType.INAPP || (bVarC = c3163h.c()) == null) {
            return null;
        }
        String strA = bVarC.a();
        AbstractC5504s.g(strA, "it.formattedPrice");
        long jC = bVarC.c();
        String strD = bVarC.d();
        AbstractC5504s.g(strD, "it.priceCurrencyCode");
        return new Price(strA, jC, strD);
    }

    public static final StoreProduct toInAppStoreProduct(C3163h c3163h) {
        AbstractC5504s.h(c3163h, "<this>");
        return toStoreProduct(c3163h, AbstractC2279u.m());
    }

    public static final GoogleStoreProduct toStoreProduct(C3163h c3163h, List<C3163h.e> offerDetails) {
        SubscriptionOptions subscriptionOptions;
        PricingPhase fullPricePhase;
        AbstractC5504s.h(c3163h, "<this>");
        AbstractC5504s.h(offerDetails, "offerDetails");
        if (ProductTypeConversionsKt.toRevenueCatProductType(c3163h.f()) == ProductType.SUBS) {
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(offerDetails, 10));
            for (C3163h.e eVar : offerDetails) {
                String productId = c3163h.e();
                AbstractC5504s.g(productId, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(eVar, productId, c3163h));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        SubscriptionOption basePlan = subscriptionOptions != null ? subscriptionOptions.getBasePlan() : null;
        Price price = (basePlan == null || (fullPricePhase = basePlan.getFullPricePhase()) == null) ? null : fullPricePhase.getPrice();
        Price priceCreateOneTimeProductPrice = createOneTimeProductPrice(c3163h);
        if (priceCreateOneTimeProductPrice != null) {
            price = priceCreateOneTimeProductPrice;
        } else if (price == null) {
            return null;
        }
        SubscriptionOption subscriptionOption = basePlan;
        Price price2 = price;
        String productId2 = c3163h.e();
        AbstractC5504s.g(productId2, "productId");
        String str = subscriptionOption != null ? subscriptionOption.get$id() : null;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(c3163h.f());
        String name = c3163h.b();
        AbstractC5504s.g(name, "name");
        String str2 = str;
        String title = c3163h.h();
        AbstractC5504s.g(title, "title");
        String description = c3163h.a();
        AbstractC5504s.g(description, "description");
        return new GoogleStoreProduct(productId2, str2, revenueCatProductType, price2, name, title, description, subscriptionOption != null ? subscriptionOption.getBillingPeriod() : null, subscriptionOptions, subscriptionOptions != null ? subscriptionOptions.getDefaultOffer() : null, c3163h, (PresentedOfferingContext) null);
    }

    public static final List<StoreProduct> toStoreProducts(List<C3163h> list) {
        List listM;
        Map mapI;
        LogHandler currentLogHandler;
        String str;
        String str2;
        AbstractC5504s.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (C3163h c3163h : list) {
            List subscriptionOfferDetails = c3163h.g();
            if (subscriptionOfferDetails != null) {
                AbstractC5504s.g(subscriptionOfferDetails, "subscriptionOfferDetails");
                listM = new ArrayList();
                for (Object obj : subscriptionOfferDetails) {
                    C3163h.e it = (C3163h.e) obj;
                    AbstractC5504s.g(it, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(it)) {
                        listM.add(obj);
                    }
                }
            } else {
                listM = AbstractC2279u.m();
            }
            List subscriptionOfferDetails2 = c3163h.g();
            if (subscriptionOfferDetails2 != null) {
                AbstractC5504s.g(subscriptionOfferDetails2, "subscriptionOfferDetails");
                mapI = new LinkedHashMap();
                for (Object obj2 : subscriptionOfferDetails2) {
                    String strA = ((C3163h.e) obj2).a();
                    Object arrayList2 = mapI.get(strA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        mapI.put(strA, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
            } else {
                mapI = S.i();
            }
            if (listM.isEmpty()) {
                listM = null;
            }
            if (listM != null) {
                Iterator it2 = listM.iterator();
                while (it2.hasNext()) {
                    List listM2 = (List) mapI.get(((C3163h.e) it2.next()).a());
                    if (listM2 == null) {
                        listM2 = AbstractC2279u.m();
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(c3163h, listM2);
                    if (storeProduct != null) {
                        arrayList.add(storeProduct);
                    } else {
                        LogIntent logIntent = LogIntent.RC_ERROR;
                        StoreProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1 storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1 = new StoreProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1(logIntent, c3163h);
                        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                            case 1:
                                LogLevel logLevel = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    str = "[Purchases] - " + logLevel.name();
                                    str2 = (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                }
                                break;
                            case 2:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                            case 3:
                                LogLevel logLevel2 = LogLevel.WARN;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 4:
                                LogLevel logLevel3 = LogLevel.INFO;
                                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 5:
                                LogLevel logLevel4 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                    str = "[Purchases] - " + logLevel4.name();
                                    str2 = (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                }
                                break;
                            case 6:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                            case 7:
                                LogLevel logLevel5 = LogLevel.INFO;
                                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 8:
                                LogLevel logLevel6 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                    str = "[Purchases] - " + logLevel6.name();
                                    str2 = (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                }
                                break;
                            case 9:
                                LogLevel logLevel7 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                    str = "[Purchases] - " + logLevel7.name();
                                    str2 = (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                }
                                break;
                            case 10:
                                LogLevel logLevel8 = LogLevel.WARN;
                                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 11:
                                LogLevel logLevel9 = LogLevel.WARN;
                                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                            case 13:
                                LogLevel logLevel10 = LogLevel.WARN;
                                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 14:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                        }
                        L l10 = L.f17438a;
                    }
                }
                L l11 = L.f17438a;
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(c3163h);
                if (inAppStoreProduct != null) {
                    arrayList.add(inAppStoreProduct);
                } else {
                    LogIntent logIntent2 = LogIntent.RC_ERROR;
                    StoreProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1 storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1 = new StoreProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1(logIntent2, c3163h);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                    }
                    L l12 = L.f17438a;
                }
            }
        }
        return arrayList;
    }
}
