package com.revenuecat.purchases.ui.revenuecatui.composables;

import U0.Y0;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import Y0.AbstractC2485u;
import Y0.L;
import Yh.j;
import androidx.compose.ui.e;
import g1.C4830j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class MarkdownKt$MDHeading$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ boolean $applyFontSizeToParagraph;
    final /* synthetic */ long $color;
    final /* synthetic */ AbstractC2485u $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ j $heading;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ C4830j $textAlign;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDHeading$2(j jVar, long j10, Y0 y02, long j11, L l10, AbstractC2485u abstractC2485u, C4830j c4830j, boolean z10, boolean z11, boolean z12, e eVar, int i10, int i11, int i12) {
        super(2);
        this.$heading = jVar;
        this.$color = j10;
        this.$style = y02;
        this.$fontSize = j11;
        this.$fontWeight = l10;
        this.$fontFamily = abstractC2485u;
        this.$textAlign = c4830j;
        this.$allowLinks = z10;
        this.$textFillMaxWidth = z11;
        this.$applyFontSizeToParagraph = z12;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$changed1 = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return Td.L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        MarkdownKt.m590MDHeadingJFVkrdg(this.$heading, this.$color, this.$style, this.$fontSize, this.$fontWeight, this.$fontFamily, this.$textAlign, this.$allowLinks, this.$textFillMaxWidth, this.$applyFontSizeToParagraph, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), AbstractC2409g1.a(this.$$changed1), this.$$default);
    }
}
