package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class TabsComponentState$size$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TabsComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsComponentState$size$2(TabsComponentState tabsComponentState) {
        super(0);
        this.this$0 = tabsComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final Size invoke() {
        PartialTabsComponent partial;
        Size size;
        PresentedTabsPartial presentedPartial = this.this$0.getPresentedPartial();
        return (presentedPartial == null || (partial = presentedPartial.getPartial()) == null || (size = partial.getSize()) == null) ? this.this$0.style.getSize() : size;
    }
}
