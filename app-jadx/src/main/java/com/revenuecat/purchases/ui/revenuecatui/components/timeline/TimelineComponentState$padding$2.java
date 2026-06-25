package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import C.A;
import com.revenuecat.purchases.paywalls.components.PartialTimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelinePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LC/A;", "invoke", "()LC/A;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class TimelineComponentState$padding$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TimelineComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimelineComponentState$padding$2(TimelineComponentState timelineComponentState) {
        super(0);
        this.this$0 = timelineComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final A invoke() {
        PartialTimelineComponent partial;
        Padding padding;
        A paddingValues;
        PresentedTimelinePartial presentedPartial = this.this$0.getPresentedPartial();
        return (presentedPartial == null || (partial = presentedPartial.getPartial()) == null || (padding = partial.getPadding()) == null || (paddingValues = PaddingKt.toPaddingValues(padding)) == null) ? this.this$0.style.getPadding() : paddingValues;
    }
}
