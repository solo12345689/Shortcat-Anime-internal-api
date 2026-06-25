package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.InterfaceC1132c;
import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class CloseButtonKt$CloseButton$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $actionInProgress;
    final /* synthetic */ C6385r0 $color;
    final /* synthetic */ InterfaceC5082a $onClick;
    final /* synthetic */ boolean $shouldDisplayDismissButton;
    final /* synthetic */ InterfaceC1132c $this_CloseButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseButtonKt$CloseButton$2(InterfaceC1132c interfaceC1132c, boolean z10, C6385r0 c6385r0, boolean z11, InterfaceC5082a interfaceC5082a, int i10) {
        super(2);
        this.$this_CloseButton = interfaceC1132c;
        this.$shouldDisplayDismissButton = z10;
        this.$color = c6385r0;
        this.$actionInProgress = z11;
        this.$onClick = interfaceC5082a;
        this.$$changed = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        CloseButtonKt.m566CloseButtondrOMvmE(this.$this_CloseButton, this.$shouldDisplayDismissButton, this.$color, this.$actionInProgress, this.$onClick, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
    }
}
