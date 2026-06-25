package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;", "it", "invoke", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ E1 $backgroundShape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$1(E1 e12) {
        super(2);
        this.$backgroundShape = e12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final e invoke(e applyIfNotNull, BackgroundStyle it) {
        AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
        AbstractC5504s.h(it, "it");
        return BackgroundKt.background(applyIfNotNull, it, this.$backgroundShape);
    }
}
