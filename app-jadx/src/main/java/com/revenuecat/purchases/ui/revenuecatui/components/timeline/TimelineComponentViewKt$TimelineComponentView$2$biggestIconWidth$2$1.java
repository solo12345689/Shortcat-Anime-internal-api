package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.SizeConstraintExtensionsKt;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li1/h;", "invoke-lTKBWiU", "()Li1/h;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class TimelineComponentViewKt$TimelineComponentView$2$biggestIconWidth$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TimelineComponentState $timelineState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimelineComponentViewKt$TimelineComponentView$2$biggestIconWidth$2$1(TimelineComponentState timelineComponentState) {
        super(0);
        this.$timelineState = timelineComponentState;
    }

    @Override // ie.InterfaceC5082a
    /* JADX INFO: renamed from: invoke-lTKBWiU, reason: not valid java name and merged with bridge method [inline-methods] */
    public final C5015h invoke() {
        Iterator it = this.$timelineState.getItems().iterator();
        if (!it.hasNext()) {
            return null;
        }
        C5015h c5015hDpOrNull = SizeConstraintExtensionsKt.dpOrNull(((TimelineComponentState.ItemState) it.next()).getIcon().getSize().getWidth());
        C5015h c5015hH = C5015h.h(c5015hDpOrNull != null ? c5015hDpOrNull.t() : C5015h.n(0));
        while (it.hasNext()) {
            C5015h c5015hDpOrNull2 = SizeConstraintExtensionsKt.dpOrNull(((TimelineComponentState.ItemState) it.next()).getIcon().getSize().getWidth());
            C5015h c5015hH2 = C5015h.h(c5015hDpOrNull2 != null ? c5015hDpOrNull2.t() : C5015h.n(0));
            if (c5015hH.compareTo(c5015hH2) < 0) {
                c5015hH = c5015hH2;
            }
        }
        return c5015hH;
    }
}
