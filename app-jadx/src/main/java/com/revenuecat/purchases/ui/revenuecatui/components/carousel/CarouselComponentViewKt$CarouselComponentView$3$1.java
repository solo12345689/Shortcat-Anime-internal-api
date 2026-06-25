package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;", "it", "invoke", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CarouselComponentViewKt$CarouselComponentView$3$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ CarouselComponentState $carouselState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselComponentViewKt$CarouselComponentView$3$1(CarouselComponentState carouselComponentState) {
        super(2);
        this.$carouselState = carouselComponentState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final e invoke(e applyIfNotNull, ShadowStyle it) {
        AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
        AbstractC5504s.h(it, "it");
        return ShadowKt.shadow(applyIfNotNull, it, this.$carouselState.getShape());
    }
}
