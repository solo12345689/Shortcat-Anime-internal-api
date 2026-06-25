package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.I;
import Td.L;
import U.j0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData;
import g1.C4830j;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PromotionalOfferScreenKt$PromotionalOfferScreen$1$2 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ PromotionalOfferData $promotionalOfferData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromotionalOfferScreenKt$PromotionalOfferScreen$1$2(PromotionalOfferData promotionalOfferData) {
        super(3);
        this.$promotionalOfferData = promotionalOfferData;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(I Button, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(Button, "$this$Button");
        if ((i10 & 17) == 16 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(71715577, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreen.<anonymous>.<anonymous> (PromotionalOfferScreen.kt:85)");
        }
        j0.b(this.$promotionalOfferData.getLocalizedPricingPhasesDescription(), null, 0L, 0L, null, null, null, 0L, null, C4830j.h(C4830j.f47278b.a()), 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 130558);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
