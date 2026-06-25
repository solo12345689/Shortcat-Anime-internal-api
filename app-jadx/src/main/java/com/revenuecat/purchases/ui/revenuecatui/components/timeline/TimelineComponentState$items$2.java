package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/TimelineComponentState$ItemState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class TimelineComponentState$items$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TimelineComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimelineComponentState$items$2(TimelineComponentState timelineComponentState) {
        super(0);
        this.this$0 = timelineComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final List<TimelineComponentState.ItemState> invoke() {
        List items = this.this$0.style.getItems();
        TimelineComponentState timelineComponentState = this.this$0;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new TimelineComponentState.ItemState(timelineComponentState.getWindowSize(), (TimelineComponentStyle.ItemStyle) it.next(), timelineComponentState.selectedPackageInfoProvider, timelineComponentState.selectedTabIndexProvider, timelineComponentState.selectedOfferEligibilityProvider, timelineComponentState.customVariablesProvider));
        }
        return arrayList;
    }
}
