package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class TierSwitcherKt$SelectedTierView$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $backgroundSelectedColor;
    final /* synthetic */ long $foregroundSelectedColor;
    final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TierSwitcherKt$SelectedTierView$2(TemplateConfiguration.TierInfo tierInfo, long j10, long j11, int i10) {
        super(2);
        this.$selectedTier = tierInfo;
        this.$backgroundSelectedColor = j10;
        this.$foregroundSelectedColor = j11;
        this.$$changed = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        TierSwitcherKt.m633SelectedTierView1wkBAMs(this.$selectedTier, this.$backgroundSelectedColor, this.$foregroundSelectedColor, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
    }
}
