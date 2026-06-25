package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Y.h2;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import i1.AbstractC5016i;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li1/h;", "invoke-D9Ej5fM", "()F", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CarouselComponentViewKt$Indicator$targetWidth$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ CarouselComponentStyle.PageControlStyles $pageControl;
    final /* synthetic */ h2 $progress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselComponentViewKt$Indicator$targetWidth$2$1(CarouselComponentStyle.PageControlStyles pageControlStyles, h2 h2Var) {
        super(0);
        this.$pageControl = pageControlStyles;
        this.$progress$delegate = h2Var;
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        return C5015h.h(m410invokeD9Ej5fM());
    }

    /* JADX INFO: renamed from: invoke-D9Ej5fM, reason: not valid java name */
    public final float m410invokeD9Ej5fM() {
        return AbstractC5016i.c(this.$pageControl.getDefault().m522getWidthD9Ej5fM(), this.$pageControl.getActive().m522getWidthD9Ej5fM(), CarouselComponentViewKt.Indicator$lambda$19(this.$progress$delegate));
    }
}
