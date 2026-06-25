package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import C.InterfaceC1138i;
import G.C;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)LTd/L;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CarouselComponentViewKt$CarouselComponentView$6$pageControl$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ CarouselComponentState $carouselState;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ C $pagerState;
    final /* synthetic */ InterfaceC1138i $this_Column;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselComponentViewKt$CarouselComponentView$6$pageControl$1(CarouselComponentState carouselComponentState, InterfaceC1138i interfaceC1138i, int i10, C c10) {
        super(2);
        this.$carouselState = carouselComponentState;
        this.$this_Column = interfaceC1138i;
        this.$pageCount = i10;
        this.$pagerState = c10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
    }

    public final L invoke(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425m2;
        L l10;
        interfaceC2425m.V(1379076393);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1379076393, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView.<anonymous>.<anonymous> (CarouselComponentView.kt:118)");
        }
        CarouselComponentStyle.PageControlStyles pageControl = this.$carouselState.getPageControl();
        if (pageControl == null) {
            l10 = null;
            interfaceC2425m2 = interfaceC2425m;
        } else {
            interfaceC2425m2 = interfaceC2425m;
            CarouselComponentViewKt.PagerIndicator(this.$this_Column, pageControl, this.$pageCount, this.$pagerState, null, interfaceC2425m2, 0, 8);
            l10 = L.f17438a;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m2.O();
        return l10;
    }
}
