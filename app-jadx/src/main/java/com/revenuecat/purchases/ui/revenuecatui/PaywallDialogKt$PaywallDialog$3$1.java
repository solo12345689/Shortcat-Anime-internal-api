package com.revenuecat.purchases.ui.revenuecatui;

import Gf.O;
import Td.L;
import Td.v;
import Y.C0;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$3$1", f = "PaywallDialog.kt", l = {83}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class PaywallDialogKt$PaywallDialog$3$1 extends l implements Function2 {
    final /* synthetic */ C0 $currentDialogOffering$delegate;
    final /* synthetic */ InterfaceC5082a $dismissDialog;
    final /* synthetic */ C0 $pendingExitOffering$delegate;
    final /* synthetic */ Function1 $shouldDisplayBlock;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallDialogKt$PaywallDialog$3$1(Function1 function1, InterfaceC5082a interfaceC5082a, C0 c02, C0 c03, e eVar) {
        super(2, eVar);
        this.$shouldDisplayBlock = function1;
        this.$dismissDialog = interfaceC5082a;
        this.$currentDialogOffering$delegate = c02;
        this.$pendingExitOffering$delegate = c03;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new PaywallDialogKt$PaywallDialog$3$1(this.$shouldDisplayBlock, this.$dismissDialog, this.$currentDialogOffering$delegate, this.$pendingExitOffering$delegate, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((PaywallDialogKt$PaywallDialog$3$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            if (PaywallDialogKt.PaywallDialog$lambda$5(this.$currentDialogOffering$delegate) == null && PaywallDialogKt.PaywallDialog$lambda$8(this.$pendingExitOffering$delegate) != null) {
                Function1 function1 = this.$shouldDisplayBlock;
                if (function1 != null) {
                    this.label = 1;
                    obj = HelperFunctionsKt.shouldDisplayPaywall(function1, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    this.$currentDialogOffering$delegate.setValue(PaywallDialogKt.PaywallDialog$lambda$8(this.$pendingExitOffering$delegate));
                    this.$pendingExitOffering$delegate.setValue(null);
                }
            }
            return L.f17438a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        if (((Boolean) obj).booleanValue()) {
            this.$currentDialogOffering$delegate.setValue(PaywallDialogKt.PaywallDialog$lambda$8(this.$pendingExitOffering$delegate));
        } else {
            this.$dismissDialog.invoke();
        }
        this.$pendingExitOffering$delegate.setValue(null);
        return L.f17438a;
    }
}
