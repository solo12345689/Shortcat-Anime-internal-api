package com.revenuecat.purchases.ui.revenuecatui.views;

import Td.L;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.PaywallFooterKt;
import com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OriginalTemplatePaywallFooterView$init$2$Content$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ C0 $paywallOptions$delegate;
    final /* synthetic */ OriginalTemplatePaywallFooterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OriginalTemplatePaywallFooterView$init$2$Content$1(OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView, C0 c02) {
        super(2);
        this.this$0 = originalTemplatePaywallFooterView;
        this.$paywallOptions$delegate = c02;
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
            AbstractC2454w.U(-1757622246, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView.init.<no name provided>.Content.<anonymous> (OriginalTemplatePaywallFooterView.kt:197)");
        }
        PaywallFooterKt.OriginalTemplatePaywallFooter(OriginalTemplatePaywallFooterView.AnonymousClass2.Content$lambda$1(this.$paywallOptions$delegate), this.this$0.initialCondensed, null, interfaceC2425m, 0, 4);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
