package com.revenuecat.purchases.google;

import Td.L;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesList", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$findPurchaseInPurchaseHistory$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Function1 $onCompletion;
    final /* synthetic */ Function1 $onError;
    final /* synthetic */ String $productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BillingWrapper$findPurchaseInPurchaseHistory$2$1(Function1 function1, String str, Function1 function12) {
        super(1);
        this.$onCompletion = function1;
        this.$productId = str;
        this.$onError = function12;
    }

    public final void invoke(List<StoreTransaction> purchasesList) {
        Object next;
        AbstractC5504s.h(purchasesList, "purchasesList");
        String str = this.$productId;
        Iterator<T> it = purchasesList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((StoreTransaction) next).getProductIds().contains(str)) {
                    break;
                }
            }
        }
        StoreTransaction storeTransaction = (StoreTransaction) next;
        if (storeTransaction != null) {
            this.$onCompletion.invoke(storeTransaction);
            return;
        }
        String str2 = String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1));
        AbstractC5504s.g(str2, "format(...)");
        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, str2));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<StoreTransaction>) obj);
        return L.f17438a;
    }
}
