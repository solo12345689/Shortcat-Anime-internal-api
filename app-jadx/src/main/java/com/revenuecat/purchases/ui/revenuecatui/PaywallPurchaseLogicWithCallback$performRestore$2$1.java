package com.revenuecat.purchases.ui.revenuecatui;

import Td.L;
import Td.u;
import Zd.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;", "result", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/PurchaseLogicResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PaywallPurchaseLogicWithCallback$performRestore$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallPurchaseLogicWithCallback$performRestore$2$1(e eVar) {
        super(1);
        this.$continuation = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchaseLogicResult) obj);
        return L.f17438a;
    }

    public final void invoke(PurchaseLogicResult result) {
        AbstractC5504s.h(result, "result");
        this.$continuation.resumeWith(u.b(result));
    }
}
