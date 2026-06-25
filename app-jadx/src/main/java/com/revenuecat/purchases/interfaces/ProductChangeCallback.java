package com.revenuecat.purchases.interfaces;

import Td.InterfaceC2154e;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "LTd/L;", "onCompleted", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public interface ProductChangeCallback extends PurchaseErrorCallback {
    void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo);
}
