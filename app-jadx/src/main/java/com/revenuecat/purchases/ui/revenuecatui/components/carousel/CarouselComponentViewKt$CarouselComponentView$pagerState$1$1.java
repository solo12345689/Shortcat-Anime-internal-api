package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class CarouselComponentViewKt$CarouselComponentView$pagerState$1$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ CarouselComponentState $carouselState;
    final /* synthetic */ int $pageCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselComponentViewKt$CarouselComponentView$pagerState$1$1(CarouselComponentState carouselComponentState, int i10) {
        super(0);
        this.$carouselState = carouselComponentState;
        this.$pageCount = i10;
    }

    @Override // ie.InterfaceC5082a
    public final Integer invoke() {
        return Integer.valueOf(this.$carouselState.getLoop() ? Integer.MAX_VALUE : this.$pageCount);
    }
}
