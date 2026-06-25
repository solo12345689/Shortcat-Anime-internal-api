package com.revenuecat.purchases;

import Td.L;
import Td.u;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Zd.e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2(Zd.e eVar) {
        super(1);
        this.$continuation = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return L.f17438a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        AbstractC5504s.h(storeProducts, "storeProducts");
        this.$continuation.resumeWith(u.b(u.a(u.b(storeProducts))));
    }
}
