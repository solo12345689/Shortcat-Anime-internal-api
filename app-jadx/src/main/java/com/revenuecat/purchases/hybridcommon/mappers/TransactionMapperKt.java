package com.revenuecat.purchases.hybridcommon.mappers;

import Td.z;
import Ud.S;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.models.Transaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/models/Transaction;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransactionMapperKt {
    public static final Map<String, Object> map(Transaction transaction) {
        AbstractC5504s.h(transaction, "<this>");
        return S.l(z.a("transactionIdentifier", transaction.getTransactionIdentifier()), z.a("revenueCatId", transaction.getTransactionIdentifier()), z.a("productIdentifier", transaction.getProductIdentifier()), z.a("productId", transaction.getProductIdentifier()), z.a("purchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(transaction.getPurchaseDate()))), z.a(b.f34624Q, MappersHelpersKt.toIso8601(transaction.getPurchaseDate())));
    }
}
