package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class VerticalStackKt$VerticalStack$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1 $content;
    final /* synthetic */ Dimension.Vertical $dimension;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Size $size;
    final /* synthetic */ float $spacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerticalStackKt$VerticalStack$2(Size size, Dimension.Vertical vertical, float f10, e eVar, Function1 function1, int i10, int i11) {
        super(2);
        this.$size = size;
        this.$dimension = vertical;
        this.$spacing = f10;
        this.$modifier = eVar;
        this.$content = function1;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        VerticalStackKt.m508VerticalStackTN_CM5M(this.$size, this.$dimension, this.$spacing, this.$modifier, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
    }
}
