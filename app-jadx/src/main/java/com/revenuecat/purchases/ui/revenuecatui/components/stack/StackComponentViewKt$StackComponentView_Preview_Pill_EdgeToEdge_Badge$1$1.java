package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Pill_EdgeToEdge_Badge$1$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "it", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
final class StackComponentViewKt$StackComponentView_Preview_Pill_EdgeToEdge_Badge$1$1 extends l implements Function2 {
    int label;

    StackComponentViewKt$StackComponentView_Preview_Pill_EdgeToEdge_Badge$1$1(e eVar) {
        super(2, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new StackComponentViewKt$StackComponentView_Preview_Pill_EdgeToEdge_Badge$1$1(eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaywallAction paywallAction, e eVar) {
        return ((StackComponentViewKt$StackComponentView_Preview_Pill_EdgeToEdge_Badge$1$1) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2605b.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        return L.f17438a;
    }
}
