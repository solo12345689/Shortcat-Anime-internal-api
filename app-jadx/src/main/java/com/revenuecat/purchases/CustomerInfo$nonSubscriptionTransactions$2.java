package com.revenuecat.purchases;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.Transaction;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/revenuecat/purchases/models/Transaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CustomerInfo$nonSubscriptionTransactions$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfo$nonSubscriptionTransactions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // ie.InterfaceC5082a
    public final List<Transaction> invoke() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.this$0.subscriberJSONObject.getJSONObject(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC5504s.g(itKeys, "nonSubscriptions.keys()");
        while (itKeys.hasNext()) {
            String productId = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(productId);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject transactionJSONObject = jSONArray.getJSONObject(i10);
                AbstractC5504s.g(productId, "productId");
                AbstractC5504s.g(transactionJSONObject, "transactionJSONObject");
                arrayList.add(new Transaction(productId, transactionJSONObject, null, 4, null));
            }
        }
        return AbstractC2279u.R0(arrayList, new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$nonSubscriptionTransactions$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return Xd.a.d(((Transaction) t10).getPurchaseDate(), ((Transaction) t11).getPurchaseDate());
            }
        });
    }
}
