package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.I;
import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class Template7Kt$DiscountBanner$text$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ I $this_DiscountBanner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template7Kt$DiscountBanner$text$1(I i10, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i11) {
        super(2);
        this.$this_DiscountBanner = i10;
        this.$state = legacy;
        this.$packageInfo = packageInfo;
        this.$colors = colors;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        Template7Kt.DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
    }
}
