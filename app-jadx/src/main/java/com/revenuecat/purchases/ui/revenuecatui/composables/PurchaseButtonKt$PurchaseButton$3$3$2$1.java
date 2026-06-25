package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import U.D;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.h2;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import g1.C4830j;
import i1.C5015h;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5906a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchaseButtonKt$PurchaseButton$3$3$2$1 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ h2 $labelOpacity$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$3$3$2$1(TemplateConfiguration.Colors colors, h2 h2Var) {
        super(3);
        this.$colors = colors;
        this.$labelOpacity$delegate = h2Var;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((TemplateConfiguration.PackageInfo) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(TemplateConfiguration.PackageInfo it, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(it, "it");
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425m.U(it) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 19) == 18 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(98081200, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PurchaseButton.kt:140)");
        }
        ProcessedLocalizedConfiguration localization = it.getLocalization();
        IntroEligibilityStateViewKt.m585IntroEligibilityStateViewQETHhvg(localization.getCallToAction(), localization.getCallToActionWithIntroOffer(), localization.getCallToActionWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility(it), this.$colors.m783getCallToActionForeground0d7_KjU(), D.f17597a.c(interfaceC2425m, D.f17598b).o(), Y0.L.f22613b.h(), C4830j.h(C4830j.f47278b.a()), false, AbstractC5906a.a(p.k(e.f26613a, 0.0f, C5015h.n(C5015h.n(UIConstant.INSTANCE.m389getDefaultVerticalSpacingD9Ej5fM() * 2) / 3), 1, null), PurchaseButtonKt.PurchaseButton_WH_ejsw$lambda$6$lambda$0(this.$labelOpacity$delegate)), interfaceC2425m, 102236160, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
