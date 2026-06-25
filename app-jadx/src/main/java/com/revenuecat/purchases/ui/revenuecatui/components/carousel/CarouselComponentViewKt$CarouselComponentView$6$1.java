package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import G.v;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LG/v;", "", "page", "LTd/L;", "invoke", "(LG/v;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CarouselComponentViewKt$CarouselComponentView$6$1 extends AbstractC5506u implements p {
    final /* synthetic */ CarouselComponentState $carouselState;
    final /* synthetic */ Function2 $clickHandler;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselComponentViewKt$CarouselComponentView$6$1(CarouselComponentState carouselComponentState, int i10, PaywallState.Loaded.Components components, Function2 function2) {
        super(4);
        this.$carouselState = carouselComponentState;
        this.$pageCount = i10;
        this.$state = components;
        this.$clickHandler = function2;
    }

    @Override // ie.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((v) obj, ((Number) obj2).intValue(), (InterfaceC2425m) obj3, ((Number) obj4).intValue());
        return L.f17438a;
    }

    public final void invoke(v HorizontalPager, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        AbstractC5504s.h(HorizontalPager, "$this$HorizontalPager");
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(755613877, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView.<anonymous>.<anonymous> (CarouselComponentView.kt:139)");
        }
        StackComponentViewKt.StackComponentView((StackComponentStyle) this.$carouselState.getPages().get(i10 % this.$pageCount), this.$state, this.$clickHandler, null, 0.0f, interfaceC2425m, 0, 24);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
