package com.revenuecat.purchases.ui.revenuecatui;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialogKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import pe.InterfaceC6018h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class InternalPaywallKt$InternalPaywall$7$errorDialog$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ PurchasesError $it;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalPaywallKt$InternalPaywall$7$errorDialog$1(PaywallViewModel paywallViewModel, PurchasesError purchasesError) {
        super(2);
        this.$viewModel = paywallViewModel;
        this.$it = purchasesError;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        if ((i10 & 3) == 2 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-2015353972, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:144)");
        }
        PaywallViewModel paywallViewModel = this.$viewModel;
        interfaceC2425m.V(1191363525);
        boolean zU = interfaceC2425m.U(paywallViewModel);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new InternalPaywallKt$InternalPaywall$7$errorDialog$1$1$1(paywallViewModel);
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        ErrorDialogKt.ErrorDialog((InterfaceC5082a) ((InterfaceC6018h) objD), this.$it.getMessage(), interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
