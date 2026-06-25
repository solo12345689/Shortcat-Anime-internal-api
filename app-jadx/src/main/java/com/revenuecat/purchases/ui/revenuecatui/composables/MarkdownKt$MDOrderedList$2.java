package com.revenuecat.purchases.ui.revenuecatui.composables;

import U0.Y0;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import Y0.AbstractC2485u;
import Y0.L;
import Yh.u;
import g1.C4830j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class MarkdownKt$MDOrderedList$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ AbstractC2485u $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ u $orderedList;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ C4830j $textAlign;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDOrderedList$2(u uVar, long j10, Y0 y02, long j11, L l10, AbstractC2485u abstractC2485u, C4830j c4830j, boolean z10, boolean z11, int i10) {
        super(2);
        this.$orderedList = uVar;
        this.$color = j10;
        this.$style = y02;
        this.$fontSize = j11;
        this.$fontWeight = l10;
        this.$fontFamily = abstractC2485u;
        this.$textAlign = c4830j;
        this.$allowLinks = z10;
        this.$textFillMaxWidth = z11;
        this.$$changed = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return Td.L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        MarkdownKt.m592MDOrderedListlzeOXFE(this.$orderedList, this.$color, this.$style, this.$fontSize, this.$fontWeight, this.$fontFamily, this.$textAlign, this.$allowLinks, this.$textFillMaxWidth, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
    }
}
