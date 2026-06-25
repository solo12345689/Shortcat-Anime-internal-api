package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6225g;
import r0.C6230l;
import u0.InterfaceC6711f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/f;", "LTd/L;", "invoke", "(Lu0/f;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class MarkdownKt$MDBlockQuote$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ long $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDBlockQuote$1$1(long j10) {
        super(1);
        this.$color = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC6711f) obj);
        return L.f17438a;
    }

    public final void invoke(InterfaceC6711f drawBehind) {
        AbstractC5504s.h(drawBehind, "$this$drawBehind");
        float f10 = 12;
        InterfaceC6711f.r1(drawBehind, this.$color, AbstractC6225g.a(C5015h.n(f10), 0.0f), AbstractC6225g.a(C5015h.n(f10), C6230l.g(drawBehind.f())), 2.0f, 0, null, 0.0f, null, 0, 496, null);
    }
}
