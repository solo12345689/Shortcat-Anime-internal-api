package com.revenuecat.purchases.hybridcommon;

import Td.L;
import Td.z;
import Ud.S;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "map", "LTd/L;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CommonKt$getPurchaseCompletedFunction$1$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ StoreTransaction $transaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$getPurchaseCompletedFunction$1$1$1(OnResult onResult, StoreTransaction storeTransaction) {
        super(1);
        this.$onResult = onResult;
        this.$transaction = storeTransaction;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, ? extends Object>) obj);
        return L.f17438a;
    }

    public final void invoke(Map<String, ? extends Object> map) {
        AbstractC5504s.h(map, "map");
        this.$onResult.onReceived(S.l(z.a("productIdentifier", this.$transaction.getProductIds().get(0)), z.a("customerInfo", map), z.a("transaction", StoreTransactionMapperKt.map(this.$transaction))));
    }
}
