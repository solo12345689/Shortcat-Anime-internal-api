package com.revenuecat.purchases.ui.revenuecatui.components;

import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1", f = "LoadedPaywallComponents.kt", l = {78}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "action", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
final class LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1 extends l implements Function2 {
    final /* synthetic */ Function2 $clickHandler;
    final /* synthetic */ PaywallState.Loaded.Components $state;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1(PaywallState.Loaded.Components components, Function2 function2, e eVar) {
        super(2, eVar);
        this.$state = components;
        this.$clickHandler = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1 loadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1 = new LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1(this.$state, this.$clickHandler, eVar);
        loadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1.L$0 = obj;
        return loadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaywallAction paywallAction, e eVar) {
        return ((LoadedPaywallComponentsKt$LoadedPaywallComponents$onClick$1$1) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            PaywallAction paywallAction = (PaywallAction) this.L$0;
            PaywallState.Loaded.Components components = this.$state;
            Function2 function2 = this.$clickHandler;
            this.label = 1;
            if (LoadedPaywallComponentsKt.handleClick(paywallAction, components, function2, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
        }
        return L.f17438a;
    }
}
