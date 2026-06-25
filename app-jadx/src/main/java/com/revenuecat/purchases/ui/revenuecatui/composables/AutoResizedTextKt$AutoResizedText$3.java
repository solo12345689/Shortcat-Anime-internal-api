package com.revenuecat.purchases.ui.revenuecatui.composables;

import U0.Y0;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import Y0.L;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class AutoResizedTextKt$AutoResizedText$3 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ String $text;
    final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoResizedTextKt$AutoResizedText$3(String str, e eVar, long j10, Y0 y02, L l10, int i10, int i11, int i12) {
        super(2);
        this.$text = str;
        this.$modifier = eVar;
        this.$color = j10;
        this.$style = y02;
        this.$fontWeight = l10;
        this.$textAlign = i10;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return Td.L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        AutoResizedTextKt.m564AutoResizedTextW72HBGU(this.$text, this.$modifier, this.$color, this.$style, this.$fontWeight, this.$textAlign, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
    }
}
