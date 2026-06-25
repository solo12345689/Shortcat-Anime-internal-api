package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.Package;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class DefaultProductCellKt$DefaultProductCell$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $accentColor;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ e $modifier;
    final /* synthetic */ InterfaceC5082a $onSelect;
    final /* synthetic */ Package $pkg;
    final /* synthetic */ long $selectedFontColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultProductCellKt$DefaultProductCell$2(Package r12, long j10, long j11, boolean z10, InterfaceC5082a interfaceC5082a, e eVar, int i10, int i11) {
        super(2);
        this.$pkg = r12;
        this.$accentColor = j10;
        this.$selectedFontColor = j11;
        this.$isSelected = z10;
        this.$onSelect = interfaceC5082a;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        DefaultProductCellKt.m805DefaultProductCellqi6gXK8(this.$pkg, this.$accentColor, this.$selectedFontColor, this.$isSelected, this.$onSelect, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
    }
}
