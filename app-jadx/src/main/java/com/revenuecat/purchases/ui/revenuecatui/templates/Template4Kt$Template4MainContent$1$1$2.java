package com.revenuecat.purchases.ui.revenuecatui.templates;

import Td.L;
import U.D;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import g1.C4830j;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class Template4Kt$Template4MainContent$1$1$2 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ TemplateConfiguration.Colors $colors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template4Kt$Template4MainContent$1$1$2(TemplateConfiguration.Colors colors) {
        super(3);
        this.$colors = colors;
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
            AbstractC2454w.U(-1316875667, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4MainContent.<anonymous>.<anonymous>.<anonymous> (Template4.kt:190)");
        }
        IntroEligibilityStateViewKt.m585IntroEligibilityStateViewQETHhvg(it.getLocalization().getOfferDetails(), it.getLocalization().getOfferDetailsWithIntroOffer(), it.getLocalization().getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility(it), this.$colors.m786getText10d7_KjU(), D.f17597a.c(interfaceC2425m, D.f17598b).c(), null, C4830j.h(C4830j.f47278b.a()), false, s.h(e.f26613a, 0.0f, 1, null), interfaceC2425m, 805306368, 320);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
