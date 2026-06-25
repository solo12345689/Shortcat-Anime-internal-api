package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import Y.AbstractC2409g1;
import Y.C0;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class PurchaseButtonKt$PurchaseButton$4 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ TemplateConfiguration.PackageConfiguration $packages;
    final /* synthetic */ C0 $selectedPackage;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$4(TemplateConfiguration.Colors colors, TemplateConfiguration.PackageConfiguration packageConfiguration, C0 c02, PaywallViewModel paywallViewModel, float f10, e eVar, int i10, int i11) {
        super(2);
        this.$colors = colors;
        this.$packages = packageConfiguration;
        this.$selectedPackage = c02;
        this.$viewModel = paywallViewModel;
        this.$horizontalPadding = f10;
        this.$childModifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        PurchaseButtonKt.m615PurchaseButtonWHejsw(this.$colors, this.$packages, this.$selectedPackage, this.$viewModel, this.$horizontalPadding, this.$childModifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
    }
}
