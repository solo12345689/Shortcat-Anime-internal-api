package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls0/E1;", "invoke", "()Ls0/E1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class TabsComponentState$shape$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TabsComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsComponentState$shape$2(TabsComponentState tabsComponentState) {
        super(0);
        this.this$0 = tabsComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final E1 invoke() {
        Shape shape;
        PartialTabsComponent partial;
        PresentedTabsPartial presentedPartial = this.this$0.getPresentedPartial();
        if (presentedPartial == null || (partial = presentedPartial.getPartial()) == null || (shape = partial.getShape()) == null) {
            shape = this.this$0.style.getShape();
        }
        return ShapeKt.toShape(shape);
    }
}
