package com.revenuecat.purchases.amazon.listener;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\rH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/amazon/device/iap/PurchasingListener;", "Lcom/amazon/device/iap/model/ProductDataResponse;", "response", "LTd/L;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Lkotlin/Function1;", "Lcom/amazon/device/iap/model/UserData;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getUserData", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface UserDataResponseListener extends PurchasingListener {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onProductDataResponse(UserDataResponseListener userDataResponseListener, ProductDataResponse response) {
            AbstractC5504s.h(response, "response");
            UserDataResponseListener.super.onProductDataResponse(response);
        }

        @Deprecated
        public static void onPurchaseResponse(UserDataResponseListener userDataResponseListener, PurchaseResponse response) {
            AbstractC5504s.h(response, "response");
            UserDataResponseListener.super.onPurchaseResponse(response);
        }

        @Deprecated
        public static void onPurchaseUpdatesResponse(UserDataResponseListener userDataResponseListener, PurchaseUpdatesResponse response) {
            AbstractC5504s.h(response, "response");
            UserDataResponseListener.super.onPurchaseUpdatesResponse(response);
        }
    }

    void getUserData(Function1 onSuccess, Function1 onError);

    default void onProductDataResponse(ProductDataResponse response) {
        AbstractC5504s.h(response, "response");
    }

    default void onPurchaseResponse(PurchaseResponse response) {
        AbstractC5504s.h(response, "response");
    }

    default void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response) {
        AbstractC5504s.h(response, "response");
    }
}
