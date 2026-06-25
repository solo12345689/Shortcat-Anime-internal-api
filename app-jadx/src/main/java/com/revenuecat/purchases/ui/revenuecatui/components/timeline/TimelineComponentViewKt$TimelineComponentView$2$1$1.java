package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Td.L;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l1.AbstractC5527i;
import l1.C5523e;
import l1.InterfaceC5540v;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll1/e;", "LTd/L;", "invoke", "(Ll1/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class TimelineComponentViewKt$TimelineComponentView$2$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ AbstractC5527i.b $bottomContentBarrier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimelineComponentViewKt$TimelineComponentView$2$1$1(AbstractC5527i.b bVar) {
        super(1);
        this.$bottomContentBarrier = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C5523e) obj);
        return L.f17438a;
    }

    public final void invoke(C5523e constrainAs) {
        AbstractC5504s.h(constrainAs, "$this$constrainAs");
        InterfaceC5540v.a(constrainAs.h(), this.$bottomContentBarrier, 0.0f, 0.0f, 6, null);
    }
}
