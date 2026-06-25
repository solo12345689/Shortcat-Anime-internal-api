package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/PurchaseResult;", "", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "getStoreTransaction", "()Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseResult {
    private final CustomerInfo customerInfo;
    private final StoreTransaction storeTransaction;

    public PurchaseResult(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        AbstractC5504s.h(storeTransaction, "storeTransaction");
        AbstractC5504s.h(customerInfo, "customerInfo");
        this.storeTransaction = storeTransaction;
        this.customerInfo = customerInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseResult)) {
            return false;
        }
        PurchaseResult purchaseResult = (PurchaseResult) obj;
        return AbstractC5504s.c(this.storeTransaction, purchaseResult.storeTransaction) && AbstractC5504s.c(this.customerInfo, purchaseResult.customerInfo);
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public int hashCode() {
        return (this.storeTransaction.hashCode() * 31) + this.customerInfo.hashCode();
    }

    public String toString() {
        return "PurchaseResult(storeTransaction=" + this.storeTransaction + ", customerInfo=" + this.customerInfo + ')';
    }
}
