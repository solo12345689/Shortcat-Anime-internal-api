package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Td.L;
import Y.h2;
import androidx.compose.ui.graphics.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/g;", "LTd/L;", "invoke", "(Landroidx/compose/ui/graphics/g;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class InternalCustomerCenterKt$CustomerCenterLoaded$2$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ h2 $contentAlpha$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalCustomerCenterKt$CustomerCenterLoaded$2$1$1(h2 h2Var) {
        super(1);
        this.$contentAlpha$delegate = h2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((g) obj);
        return L.f17438a;
    }

    public final void invoke(g graphicsLayer) {
        AbstractC5504s.h(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.e(InternalCustomerCenterKt.CustomerCenterLoaded$lambda$16(this.$contentAlpha$delegate));
    }
}
