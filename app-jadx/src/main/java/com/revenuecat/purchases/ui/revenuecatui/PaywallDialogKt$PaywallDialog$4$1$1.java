package com.revenuecat.purchases.ui.revenuecatui;

import Td.L;
import Y.C0;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "exitOffering", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PaywallDialogKt$PaywallDialog$4$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ C0 $currentDialogOffering$delegate;
    final /* synthetic */ InterfaceC5082a $dismissDialog;
    final /* synthetic */ C0 $pendingExitOffering$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallDialogKt$PaywallDialog$4$1$1(InterfaceC5082a interfaceC5082a, C0 c02, C0 c03) {
        super(1);
        this.$dismissDialog = interfaceC5082a;
        this.$pendingExitOffering$delegate = c02;
        this.$currentDialogOffering$delegate = c03;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((OfferingSelection) obj);
        return L.f17438a;
    }

    public final void invoke(OfferingSelection offeringSelection) {
        if (offeringSelection == null) {
            this.$dismissDialog.invoke();
        } else {
            this.$pendingExitOffering$delegate.setValue(offeringSelection);
            this.$currentDialogOffering$delegate.setValue(null);
        }
    }
}
