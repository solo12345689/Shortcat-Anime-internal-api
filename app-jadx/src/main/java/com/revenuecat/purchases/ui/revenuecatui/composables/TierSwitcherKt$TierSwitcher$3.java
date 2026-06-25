package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class TierSwitcherKt$TierSwitcher$3 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $backgroundSelectedColor;
    final /* synthetic */ long $foregroundColor;
    final /* synthetic */ long $foregroundSelectedColor;
    final /* synthetic */ Function1 $onTierSelected;
    final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
    final /* synthetic */ List<TemplateConfiguration.TierInfo> $tiers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TierSwitcherKt$TierSwitcher$3(List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, Function1 function1, long j10, long j11, long j12, long j13, int i10) {
        super(2);
        this.$tiers = list;
        this.$selectedTier = tierInfo;
        this.$onTierSelected = function1;
        this.$backgroundColor = j10;
        this.$backgroundSelectedColor = j11;
        this.$foregroundColor = j12;
        this.$foregroundSelectedColor = j13;
        this.$$changed = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        TierSwitcherKt.m634TierSwitcherUFBoNtE(this.$tiers, this.$selectedTier, this.$onTierSelected, this.$backgroundColor, this.$backgroundSelectedColor, this.$foregroundColor, this.$foregroundSelectedColor, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
    }
}
