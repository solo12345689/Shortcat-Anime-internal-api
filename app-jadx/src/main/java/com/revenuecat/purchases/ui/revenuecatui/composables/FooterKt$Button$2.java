package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.I;
import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class FooterKt$Button$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC5082a $action;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ long $color;
    final /* synthetic */ int[] $texts;
    final /* synthetic */ I $this_Button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Button$2(I i10, long j10, e eVar, int[] iArr, InterfaceC5082a interfaceC5082a, int i11) {
        super(2);
        this.$this_Button = i10;
        this.$color = j10;
        this.$childModifier = eVar;
        this.$texts = iArr;
        this.$action = interfaceC5082a;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        I i11 = this.$this_Button;
        long j10 = this.$color;
        e eVar = this.$childModifier;
        int[] iArr = this.$texts;
        FooterKt.m576ButtonsW7UJKQ(i11, j10, eVar, Arrays.copyOf(iArr, iArr.length), this.$action, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
    }
}
