package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Td.L;
import Y.h2;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import l1.AbstractC5527i;
import l1.C5523e;
import l1.C5524f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll1/e;", "LTd/L;", "invoke", "(Ll1/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class TimelineComponentViewKt$TimelineComponentView$2$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ h2 $biggestIconWidth$delegate;
    final /* synthetic */ AbstractC5527i.b $currentPreviousItem;
    final /* synthetic */ C5524f $descriptionRef;
    final /* synthetic */ TimelineComponentState $timelineState;
    final /* synthetic */ C5524f $titleRef;

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
    TimelineComponentViewKt$TimelineComponentView$2$2$1(TimelineComponentState timelineComponentState, AbstractC5527i.b bVar, C5524f c5524f, C5524f c5524f2, h2 h2Var) {
        super(1);
        this.$timelineState = timelineComponentState;
        this.$currentPreviousItem = bVar;
        this.$titleRef = c5524f;
        this.$descriptionRef = c5524f2;
        this.$biggestIconWidth$delegate = h2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C5523e) obj);
        return L.f17438a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(l1.C5523e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "$this$constrainAs"
            kotlin.jvm.internal.AbstractC5504s.h(r15, r0)
            com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState r0 = r14.$timelineState
            com.revenuecat.purchases.paywalls.components.TimelineComponent$IconAlignment r0 = r0.getIconAlignment()
            int[] r1 = com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView$2$2$1.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 2
            if (r0 == r1) goto L1a
            goto L7b
        L1a:
            l1.v r2 = r15.h()
            l1.f r0 = r14.$titleRef
            l1.i$b r3 = r0.e()
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            l1.InterfaceC5540v.a(r2, r3, r4, r5, r6, r7)
            l1.v r8 = r15.c()
            l1.f r0 = r14.$descriptionRef
            l1.i$b r9 = r0.b()
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            l1.InterfaceC5540v.a(r8, r9, r10, r11, r12, r13)
            l1.E r0 = r15.g()
            l1.f r1 = r15.f()
            l1.i$c r1 = r1.d()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            l1.InterfaceC5517E.a(r0, r1, r2, r3, r4, r5)
            goto L7b
        L50:
            l1.v r6 = r15.h()
            l1.i$b r0 = r14.$currentPreviousItem
            if (r0 != 0) goto L60
            l1.f r0 = r15.f()
            l1.i$b r0 = r0.e()
        L60:
            r7 = r0
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            l1.InterfaceC5540v.a(r6, r7, r8, r9, r10, r11)
            l1.E r0 = r15.g()
            l1.f r1 = r15.f()
            l1.i$c r1 = r1.d()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            l1.InterfaceC5517E.a(r0, r1, r2, r3, r4, r5)
        L7b:
            Y.h2 r0 = r14.$biggestIconWidth$delegate
            i1.h r0 = com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt.access$TimelineComponentView$lambda$13$lambda$1(r0)
            if (r0 == 0) goto L8f
            float r0 = r0.t()
            l1.s$b r1 = l1.InterfaceC5537s.f52510a
            l1.s r0 = r1.d(r0)
            if (r0 != 0) goto L95
        L8f:
            l1.s$b r0 = l1.InterfaceC5537s.f52510a
            l1.s r0 = r0.c()
        L95:
            r15.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt$TimelineComponentView$2$2$1.invoke(l1.e):void");
    }
}
