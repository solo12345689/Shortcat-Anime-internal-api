package com.revenuecat.purchases;

import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001aC\u0010\t\u001a\u00020\b2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001a\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010\u001e\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aO\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010$\u001aY\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010'\u001a;\u0010(\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b(\u0010\u001b\u001a;\u0010)\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b)\u0010\u001b\"&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\",\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "LTd/L;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "", "onError", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchaseCompletedCallback", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "onReceived", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getStoreProductsCallback", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "receiveOfferingsCallback", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "receiveCustomerInfoCallback", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/Purchases;", "getOfferingsWith", "(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "purchaseWith", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "", "productIds", "onGetStoreProducts", "getProductsWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "restorePurchasesWith", "getStorefrontCountryCodeWith", "ON_ERROR_STUB", "Lkotlin/jvm/functions/Function1;", "getON_ERROR_STUB", "()Lkotlin/jvm/functions/Function1;", "ON_PURCHASE_ERROR_STUB", "Lkotlin/jvm/functions/Function2;", "getON_PURCHASE_ERROR_STUB", "()Lkotlin/jvm/functions/Function2;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListenerConversionsCommonKt {
    private static final Function1 ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final Function2 ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ListenerConversionsCommonKt$getStoreProductsCallback$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/revenuecat/purchases/ListenerConversionsCommonKt$getStoreProductsCallback$1", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "LTd/L;", "onReceived", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements GetStoreProductsCallback {
        final /* synthetic */ Function1 $onError;

        AnonymousClass1(Function1 function1) {
            function1 = function1;
        }

        @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
        public void onError(PurchasesError purchasesError) {
            AbstractC5504s.h(purchasesError, "error");
            function1.invoke(purchasesError);
        }

        @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
        public void onReceived(List<? extends StoreProduct> storeProducts) {
            AbstractC5504s.h(storeProducts, "storeProducts");
            function1.invoke(storeProducts);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ListenerConversionsCommonKt$getStorefrontCountryCodeWith$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/revenuecat/purchases/ListenerConversionsCommonKt$getStorefrontCountryCodeWith$1", "Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;", "", "storefrontCountryCode", "LTd/L;", "onReceived", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40241 implements GetStorefrontCallback {
        final /* synthetic */ Function1 $onError;

        C40241(Function1 function1) {
            function1 = function1;
        }

        @Override // com.revenuecat.purchases.interfaces.GetStorefrontCallback
        public void onError(PurchasesError purchasesError) {
            AbstractC5504s.h(purchasesError, "error");
            function1.invoke(purchasesError);
        }

        @Override // com.revenuecat.purchases.interfaces.GetStorefrontCallback
        public void onReceived(String storefrontCountryCode) {
            AbstractC5504s.h(storefrontCountryCode, "storefrontCountryCode");
            function1.invoke(storefrontCountryCode);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ListenerConversionsCommonKt$purchaseCompletedCallback$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/revenuecat/purchases/ListenerConversionsCommonKt$purchaseCompletedCallback$1", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "onCompleted", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "", "userCancelled", "onError", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40251 implements PurchaseCallback {
        final /* synthetic */ Function2 $onError;

        C40251(Function2 function2) {
            function2 = function2;
        }

        @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
        public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            AbstractC5504s.h(storeTransaction, "storeTransaction");
            AbstractC5504s.h(customerInfo, "customerInfo");
            function2.invoke(storeTransaction, customerInfo);
        }

        @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
        public void onError(PurchasesError purchasesError, boolean userCancelled) {
            AbstractC5504s.h(purchasesError, "error");
            function2.invoke(purchasesError, Boolean.valueOf(userCancelled));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ListenerConversionsCommonKt$receiveCustomerInfoCallback$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/revenuecat/purchases/ListenerConversionsCommonKt$receiveCustomerInfoCallback$1", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "onReceived", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40261 implements ReceiveCustomerInfoCallback {
        final /* synthetic */ Function1 $onError;

        C40261(Function1 function1) {
            function1 = function1;
        }

        @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
        public void onError(PurchasesError purchasesError) {
            AbstractC5504s.h(purchasesError, "error");
            Function1 function1 = function1;
            if (function1 != null) {
            }
        }

        @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
        public void onReceived(CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            Function1 function1 = function1;
            if (function1 != null) {
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ListenerConversionsCommonKt$receiveOfferingsCallback$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/revenuecat/purchases/ListenerConversionsCommonKt$receiveOfferingsCallback$1", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "Lcom/revenuecat/purchases/Offerings;", "offerings", "LTd/L;", "onReceived", "(Lcom/revenuecat/purchases/Offerings;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C40271 implements ReceiveOfferingsCallback {
        final /* synthetic */ Function1 $onError;

        C40271(Function1 function1) {
            function1 = function1;
        }

        @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
        public void onError(PurchasesError purchasesError) {
            AbstractC5504s.h(purchasesError, "error");
            function1.invoke(purchasesError);
        }

        @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
        public void onReceived(Offerings offerings) {
            AbstractC5504s.h(offerings, "offerings");
            function1.invoke(offerings);
        }
    }

    public static final Function1 getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final Function2 getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, Function1 onError, Function1 onSuccess) {
        AbstractC5504s.h(purchases, "<this>");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(onSuccess, "onSuccess");
        purchases.getOfferings(receiveOfferingsCallback(onSuccess, onError));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, function1, function12);
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, Function1 onError, Function1 onGetStoreProducts) {
        AbstractC5504s.h(purchases, "<this>");
        AbstractC5504s.h(productIds, "productIds");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, function1, function12);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(Function1 onReceived, Function1 onError) {
        AbstractC5504s.h(onReceived, "onReceived");
        AbstractC5504s.h(onError, "onError");
        return new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.getStoreProductsCallback.1
            final /* synthetic */ Function1 $onError;

            AnonymousClass1(Function1 onError2) {
                function1 = onError2;
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC5504s.h(purchasesError, "error");
                function1.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                AbstractC5504s.h(storeProducts, "storeProducts");
                function1.invoke(storeProducts);
            }
        };
    }

    public static final void getStorefrontCountryCodeWith(Purchases purchases, Function1 onError, Function1 onSuccess) {
        AbstractC5504s.h(purchases, "<this>");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(onSuccess, "onSuccess");
        purchases.getStorefrontCountryCode(new GetStorefrontCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.getStorefrontCountryCodeWith.1
            final /* synthetic */ Function1 $onError;

            C40241(Function1 onError2) {
                function1 = onError2;
            }

            @Override // com.revenuecat.purchases.interfaces.GetStorefrontCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC5504s.h(purchasesError, "error");
                function1.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStorefrontCallback
            public void onReceived(String storefrontCountryCode) {
                AbstractC5504s.h(storefrontCountryCode, "storefrontCountryCode");
                function1.invoke(storefrontCountryCode);
            }
        });
    }

    public static /* synthetic */ void getStorefrontCountryCodeWith$default(Purchases purchases, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = ON_ERROR_STUB;
        }
        getStorefrontCountryCodeWith(purchases, function1, function12);
    }

    public static final PurchaseCallback purchaseCompletedCallback(Function2 onSuccess, Function2 onError) {
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        return new PurchaseCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.purchaseCompletedCallback.1
            final /* synthetic */ Function2 $onError;

            C40251(Function2 onError2) {
                function2 = onError2;
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                AbstractC5504s.h(storeTransaction, "storeTransaction");
                AbstractC5504s.h(customerInfo, "customerInfo");
                function2.invoke(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError purchasesError, boolean userCancelled) {
                AbstractC5504s.h(purchasesError, "error");
                function2.invoke(purchasesError, Boolean.valueOf(userCancelled));
            }
        };
    }

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, Function2 onError, Function2 onSuccess) {
        AbstractC5504s.h(purchases, "<this>");
        AbstractC5504s.h(purchaseParams, "purchaseParams");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(onSuccess, "onSuccess");
        purchases.purchase(purchaseParams, purchaseCompletedCallback(onSuccess, onError));
    }

    public static /* synthetic */ void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, Function2 function2, Function2 function22, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, function2, function22);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        return new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveCustomerInfoCallback.1
            final /* synthetic */ Function1 $onError;

            C40261(Function1 onError2) {
                function1 = onError2;
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC5504s.h(purchasesError, "error");
                Function1 function1 = function1;
                if (function1 != null) {
                }
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                Function1 function1 = function1;
                if (function1 != null) {
                }
            }
        };
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        return new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveOfferingsCallback.1
            final /* synthetic */ Function1 $onError;

            C40271(Function1 onError2) {
                function1 = onError2;
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC5504s.h(purchasesError, "error");
                function1.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                AbstractC5504s.h(offerings, "offerings");
                function1.invoke(offerings);
            }
        };
    }

    public static final void restorePurchasesWith(Purchases purchases, Function1 onError, Function1 onSuccess) {
        AbstractC5504s.h(purchases, "<this>");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(onSuccess, "onSuccess");
        purchases.restorePurchases(receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, function1, function12);
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, ProductType productType, Function1 onError, Function1 onGetStoreProducts) {
        AbstractC5504s.h(purchases, "<this>");
        AbstractC5504s.h(productIds, "productIds");
        AbstractC5504s.h(onError, "onError");
        AbstractC5504s.h(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, productType, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, ProductType productType, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, function1, function12);
    }
}
