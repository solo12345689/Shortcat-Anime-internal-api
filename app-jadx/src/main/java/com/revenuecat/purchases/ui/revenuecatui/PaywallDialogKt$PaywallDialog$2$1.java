package com.revenuecat.purchases.ui.revenuecatui;

import Gf.O;
import Td.L;
import Td.v;
import Y.C0;
import Zd.e;
import ae.AbstractC2605b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$2$1", f = "PaywallDialog.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class PaywallDialogKt$PaywallDialog$2$1 extends l implements Function2 {
    final /* synthetic */ C0 $currentDialogOffering$delegate;
    final /* synthetic */ PaywallDialogOptions $paywallDialogOptions;
    final /* synthetic */ C0 $shouldDisplayDialog$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallDialogKt$PaywallDialog$2$1(PaywallDialogOptions paywallDialogOptions, C0 c02, C0 c03, e eVar) {
        super(2, eVar);
        this.$paywallDialogOptions = paywallDialogOptions;
        this.$shouldDisplayDialog$delegate = c02;
        this.$currentDialogOffering$delegate = c03;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new PaywallDialogKt$PaywallDialog$2$1(this.$paywallDialogOptions, this.$shouldDisplayDialog$delegate, this.$currentDialogOffering$delegate, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((PaywallDialogKt$PaywallDialog$2$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2605b.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        if (PaywallDialogKt.PaywallDialog$lambda$1(this.$shouldDisplayDialog$delegate) && PaywallDialogKt.PaywallDialog$lambda$5(this.$currentDialogOffering$delegate) == null) {
            this.$currentDialogOffering$delegate.setValue(this.$paywallDialogOptions.getOfferingSelection$revenuecatui_defaultsBc8Release());
        }
        return L.f17438a;
    }
}
