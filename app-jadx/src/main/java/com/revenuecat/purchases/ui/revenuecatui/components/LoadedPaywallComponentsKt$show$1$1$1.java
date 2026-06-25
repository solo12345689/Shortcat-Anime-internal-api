package com.revenuecat.purchases.ui.revenuecatui.components;

import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$show$1$1$1", f = "LoadedPaywallComponents.kt", l = {147}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "action", "LTd/L;", "<anonymous>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;)V"}, k = 3, mv = {1, 8, 0})
final class LoadedPaywallComponentsKt$show$1$1$1 extends l implements Function2 {
    final /* synthetic */ Function2 $onClick;
    final /* synthetic */ SimpleSheetState $this_show;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadedPaywallComponentsKt$show$1$1$1(SimpleSheetState simpleSheetState, Function2 function2, e eVar) {
        super(2, eVar);
        this.$this_show = simpleSheetState;
        this.$onClick = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        LoadedPaywallComponentsKt$show$1$1$1 loadedPaywallComponentsKt$show$1$1$1 = new LoadedPaywallComponentsKt$show$1$1$1(this.$this_show, this.$onClick, eVar);
        loadedPaywallComponentsKt$show$1$1$1.L$0 = obj;
        return loadedPaywallComponentsKt$show$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaywallAction paywallAction, e eVar) {
        return ((LoadedPaywallComponentsKt$show$1$1$1) create(paywallAction, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            PaywallAction paywallAction = (PaywallAction) this.L$0;
            if (paywallAction instanceof PaywallAction.External.NavigateBack) {
                this.$this_show.hide();
            } else {
                Function2 function2 = this.$onClick;
                this.label = 1;
                if (function2.invoke(paywallAction, this) == objF) {
                    return objF;
                }
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
