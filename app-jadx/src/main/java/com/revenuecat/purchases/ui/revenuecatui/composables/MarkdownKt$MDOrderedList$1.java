package com.revenuecat.purchases.ui.revenuecatui.composables;

import U0.C2197e;
import U0.Y0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y0.L;
import Yh.s;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYh/s;", "it", "LTd/L;", "invoke", "(LYh/s;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class MarkdownKt$MDOrderedList$1 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ char $delimiter;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ kotlin.jvm.internal.L $number;
    final /* synthetic */ Y0 $resolvedTextStyle;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDOrderedList$1(Y0 y02, boolean z10, kotlin.jvm.internal.L l10, char c10, long j10, boolean z11, L l11) {
        super(3);
        this.$resolvedTextStyle = y02;
        this.$textFillMaxWidth = z10;
        this.$number = l10;
        this.$delimiter = c10;
        this.$color = j10;
        this.$allowLinks = z11;
        this.$fontWeight = l11;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((s) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return Td.L.f17438a;
    }

    public final void invoke(s it, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(it, "it");
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1609568168, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDOrderedList.<anonymous> (Markdown.kt:330)");
        }
        Y0 y02 = this.$resolvedTextStyle;
        kotlin.jvm.internal.L l10 = this.$number;
        char c10 = this.$delimiter;
        long j10 = this.$color;
        boolean z10 = this.$allowLinks;
        L l11 = this.$fontWeight;
        C2197e.b bVar = new C2197e.b(0, 1, null);
        bVar.k(y02.O());
        StringBuilder sb2 = new StringBuilder();
        int i11 = l10.f52257a;
        l10.f52257a = i11 + 1;
        sb2.append(i11);
        sb2.append(c10);
        sb2.append(' ');
        bVar.g(sb2.toString());
        MarkdownKt.m604appendMarkdownChildrenXOJAsU(bVar, it, j10, z10, l11);
        bVar.h();
        MarkdownKt.MarkdownText(bVar.l(), this.$resolvedTextStyle, this.$textFillMaxWidth, null, interfaceC2425m, 0, 8);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
