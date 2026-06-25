package com.amazon.device.iap;

import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface PurchasingListener {
    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseResponse(PurchaseResponse purchaseResponse);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);

    void onUserDataResponse(UserDataResponse userDataResponse);
}
