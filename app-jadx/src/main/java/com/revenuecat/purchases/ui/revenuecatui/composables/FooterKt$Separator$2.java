package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.I;
import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class FooterKt$Separator$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ I $this_Separator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Separator$2(I i10, long j10, int i11) {
        super(2);
        this.$this_Separator = i10;
        this.$color = j10;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        FooterKt.m577SeparatorRPmYEkk(this.$this_Separator, this.$color, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
    }
}
