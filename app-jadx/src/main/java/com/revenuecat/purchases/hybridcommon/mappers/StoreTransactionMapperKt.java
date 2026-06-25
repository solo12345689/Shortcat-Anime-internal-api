package com.revenuecat.purchases.hybridcommon.mappers;

import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0002¨\u0006\u0006"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactionIdentifierValue", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StoreTransactionMapperKt {
    public static final Map<String, Object> map(StoreTransaction storeTransaction) {
        AbstractC5504s.h(storeTransaction, "<this>");
        return S.l(z.a("transactionIdentifier", transactionIdentifierValue(storeTransaction)), z.a("productIdentifier", AbstractC2279u.m0(storeTransaction.getProductIds())), z.a("purchaseDateMillis", Long.valueOf(storeTransaction.getPurchaseTime())), z.a(b.f34624Q, MappersHelpersKt.toIso8601(new Date(storeTransaction.getPurchaseTime()))), z.a("purchaseToken", storeTransaction.getPurchaseToken()));
    }

    private static final String transactionIdentifierValue(StoreTransaction storeTransaction) {
        String orderId = storeTransaction.getOrderId();
        if (orderId != null) {
            return orderId;
        }
        if (storeTransaction.getPurchaseType() == PurchaseType.AMAZON_PURCHASE) {
            return storeTransaction.getPurchaseToken();
        }
        return null;
    }
}
