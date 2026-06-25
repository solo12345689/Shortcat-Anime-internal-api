package com.revenuecat.purchases.common.offerings;

import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "inAppProducts", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfferingsFactory$getStoreProductsById$1$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Function1 $onCompleted;
    final /* synthetic */ Map<String, List<StoreProduct>> $productsById;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfferingsFactory$getStoreProductsById$1$1$1(OfferingsFactory offeringsFactory, Map<String, List<StoreProduct>> map, Function1 function1) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productsById = map;
        this.$onCompleted = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Map map, List list, Function1 function1) {
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = (StoreProduct) it.next();
            arrayList.add(z.a(storeProduct.getPurchasingData().getProductId(), AbstractC2279u.e(storeProduct)));
        }
        S.s(map, arrayList);
        function1.invoke(map);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return L.f17438a;
    }

    public final void invoke(final List<? extends StoreProduct> inAppProducts) {
        AbstractC5504s.h(inAppProducts, "inAppProducts");
        Dispatcher dispatcher = this.this$0.dispatcher;
        final Map<String, List<StoreProduct>> map = this.$productsById;
        final Function1 function1 = this.$onCompleted;
        Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.b
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsFactory$getStoreProductsById$1$1$1.invoke$lambda$1(map, inAppProducts, function1);
            }
        }, null, 2, null);
    }
}
