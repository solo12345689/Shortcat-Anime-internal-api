package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class TabsComponentState$visible$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TabsComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsComponentState$visible$2(TabsComponentState tabsComponentState) {
        super(0);
        this.this$0 = tabsComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final Boolean invoke() {
        PartialTabsComponent partial;
        Boolean visible;
        PresentedTabsPartial presentedPartial = this.this$0.getPresentedPartial();
        return Boolean.valueOf((presentedPartial == null || (partial = presentedPartial.getPartial()) == null || (visible = partial.getVisible()) == null) ? this.this$0.style.getVisible() : visible.booleanValue());
    }
}
