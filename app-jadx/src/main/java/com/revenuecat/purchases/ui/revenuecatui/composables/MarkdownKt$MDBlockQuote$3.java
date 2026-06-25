package com.revenuecat.purchases.ui.revenuecatui.composables;

import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import Y0.L;
import Yh.C2492b;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class MarkdownKt$MDBlockQuote$3 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ L $baseFontWeight;
    final /* synthetic */ C2492b $blockQuote;
    final /* synthetic */ long $color;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDBlockQuote$3(C2492b c2492b, long j10, boolean z10, L l10, e eVar, int i10, int i11) {
        super(2);
        this.$blockQuote = c2492b;
        this.$color = j10;
        this.$allowLinks = z10;
        this.$baseFontWeight = l10;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return Td.L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        MarkdownKt.m587MDBlockQuote8V94_ZQ(this.$blockQuote, this.$color, this.$allowLinks, this.$baseFontWeight, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
    }
}
