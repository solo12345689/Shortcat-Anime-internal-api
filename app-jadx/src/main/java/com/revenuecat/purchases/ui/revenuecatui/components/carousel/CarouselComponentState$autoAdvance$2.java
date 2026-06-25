package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.PartialCarouselComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CarouselComponentState$autoAdvance$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ CarouselComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselComponentState$autoAdvance$2(CarouselComponentState carouselComponentState) {
        super(0);
        this.this$0 = carouselComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final CarouselComponent.AutoAdvancePages invoke() {
        PartialCarouselComponent partial;
        CarouselComponent.AutoAdvancePages autoAdvance;
        PresentedCarouselPartial presentedPartial = this.this$0.getPresentedPartial();
        return (presentedPartial == null || (partial = presentedPartial.getPartial()) == null || (autoAdvance = partial.getAutoAdvance()) == null) ? this.this$0.style.getAutoAdvance() : autoAdvance;
    }
}
