package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class SimpleBottomSheetScaffoldKt$Scrim$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2 $content;
    final /* synthetic */ e $modifier;
    final /* synthetic */ InterfaceC5082a $onClick;
    final /* synthetic */ float $radius;
    final /* synthetic */ boolean $show;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleBottomSheetScaffoldKt$Scrim$2(boolean z10, float f10, InterfaceC5082a interfaceC5082a, e eVar, Function2 function2, int i10, int i11) {
        super(2);
        this.$show = z10;
        this.$radius = f10;
        this.$onClick = interfaceC5082a;
        this.$modifier = eVar;
        this.$content = function2;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        SimpleBottomSheetScaffoldKt.m620ScrimEUb7tLY(this.$show, this.$radius, this.$onClick, this.$modifier, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
    }
}
