package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Td.L;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l1.AbstractC5527i;
import l1.C5523e;
import l1.C5524f;
import l1.InterfaceC5517E;
import l1.InterfaceC5537s;
import l1.InterfaceC5540v;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll1/e;", "LTd/L;", "invoke", "(Ll1/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class TimelineComponentViewKt$TimelineComponentView$2$4$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ AbstractC5527i.b $currentPreviousItem;
    final /* synthetic */ AbstractC5527i.c $iconEndBarrier;
    final /* synthetic */ C5524f $iconRef;
    final /* synthetic */ TimelineComponentState $timelineState;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimelineComponent.IconAlignment.values().length];
            try {
                iArr[TimelineComponent.IconAlignment.Title.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineComponent.IconAlignment.TitleAndDescription.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimelineComponentViewKt$TimelineComponentView$2$4$1(TimelineComponentState timelineComponentState, C5524f c5524f, AbstractC5527i.b bVar, AbstractC5527i.c cVar) {
        super(1);
        this.$timelineState = timelineComponentState;
        this.$iconRef = c5524f;
        this.$currentPreviousItem = bVar;
        this.$iconEndBarrier = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C5523e) obj);
        return L.f17438a;
    }

    public final void invoke(C5523e constrainAs) {
        AbstractC5504s.h(constrainAs, "$this$constrainAs");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.$timelineState.getIconAlignment().ordinal()];
        if (i10 == 1) {
            C5523e.b(constrainAs, this.$iconRef, 0.0f, 2, null);
        } else if (i10 == 2) {
            InterfaceC5540v interfaceC5540vH = constrainAs.h();
            AbstractC5527i.b bVarE = this.$currentPreviousItem;
            if (bVarE == null) {
                bVarE = constrainAs.f().e();
            }
            InterfaceC5540v.a(interfaceC5540vH, bVarE, 0.0f, 0.0f, 6, null);
        }
        InterfaceC5517E.a(constrainAs.g(), this.$iconEndBarrier, 0.0f, 0.0f, 6, null);
        InterfaceC5517E.a(constrainAs.e(), constrainAs.f().c(), 0.0f, 0.0f, 6, null);
        InterfaceC5537s.b bVar = InterfaceC5537s.f52510a;
        constrainAs.m(bVar.b());
        constrainAs.k(bVar.b());
        constrainAs.l(0.0f);
    }
}
