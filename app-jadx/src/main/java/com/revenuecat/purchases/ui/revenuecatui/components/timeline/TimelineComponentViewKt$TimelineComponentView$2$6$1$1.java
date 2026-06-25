package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Td.L;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l1.C5523e;
import l1.C5524f;
import l1.InterfaceC5517E;
import l1.InterfaceC5537s;
import l1.InterfaceC5540v;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll1/e;", "LTd/L;", "invoke", "(Ll1/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class TimelineComponentViewKt$TimelineComponentView$2$6$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ C5524f $currentIconRef;
    final /* synthetic */ boolean $isLastItem;
    final /* synthetic */ TimelineComponentState.ItemState $item;
    final /* synthetic */ C5524f $nextIconRef;
    final /* synthetic */ float $nextItemIconHalfSize;
    final /* synthetic */ Pair<C5015h, C5015h> $offsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimelineComponentViewKt$TimelineComponentView$2$6$1$1(Pair<C5015h, C5015h> pair, TimelineComponentState.ItemState itemState, C5524f c5524f, boolean z10, C5524f c5524f2, float f10) {
        super(1);
        this.$offsets = pair;
        this.$item = itemState;
        this.$currentIconRef = c5524f;
        this.$isLastItem = z10;
        this.$nextIconRef = c5524f2;
        this.$nextItemIconHalfSize = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C5523e) obj);
        return L.f17438a;
    }

    public final void invoke(C5523e constrainAs) {
        AbstractC5504s.h(constrainAs, "$this$constrainAs");
        InterfaceC5517E.a(constrainAs.g(), constrainAs.f().d(), ((C5015h) this.$offsets.c()).t(), 0.0f, 4, null);
        InterfaceC5537s.b bVar = InterfaceC5537s.f52510a;
        constrainAs.m(bVar.d(C5015h.n(this.$item.getConnector() != null ? r1.getWidth() : 0)));
        InterfaceC5540v.a(constrainAs.h(), this.$currentIconRef.e(), 0.0f, 0.0f, 6, null);
        if (this.$isLastItem) {
            InterfaceC5540v.a(constrainAs.c(), constrainAs.f().b(), ((C5015h) this.$offsets.d()).t(), 0.0f, 4, null);
        } else {
            InterfaceC5540v interfaceC5540vC = constrainAs.c();
            C5524f c5524f = this.$nextIconRef;
            AbstractC5504s.e(c5524f);
            InterfaceC5540v.a(interfaceC5540vC, c5524f.b(), C5015h.n(this.$nextItemIconHalfSize + ((C5015h) this.$offsets.d()).t()), 0.0f, 4, null);
        }
        constrainAs.k(bVar.a());
    }
}
