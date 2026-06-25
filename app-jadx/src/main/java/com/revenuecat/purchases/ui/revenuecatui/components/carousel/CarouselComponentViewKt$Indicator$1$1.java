package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Y.h2;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import x.AbstractC7007e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CarouselComponentViewKt$Indicator$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ long $strokeColor;
    final /* synthetic */ h2 $strokeWidth$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselComponentViewKt$Indicator$1$1(long j10, h2 h2Var) {
        super(1);
        this.$strokeColor = j10;
        this.$strokeWidth$delegate = h2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final e invoke(e conditional) {
        AbstractC5504s.h(conditional, "$this$conditional");
        return AbstractC7007e.f(conditional, CarouselComponentViewKt.Indicator$lambda$28(this.$strokeWidth$delegate), this.$strokeColor, ShapeKt.toShape(Shape.Pill.INSTANCE));
    }
}
