package com.revenuecat.purchases.ui.revenuecatui;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class InternalPaywallKt$LoadedPaywall$3$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalPaywallKt$LoadedPaywall$3$1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel) {
        super(2);
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
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
            AbstractC2454w.U(1771404190, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadedPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:204)");
        }
        InternalPaywallKt.TemplatePaywall(this.$state, this.$viewModel, interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
