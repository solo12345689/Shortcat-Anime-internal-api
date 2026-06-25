package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Y.h2;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;", "it", "invoke", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class ImageComponentViewKt$ImageComponentView$3$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ h2 $composeShape$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageComponentViewKt$ImageComponentView$3$1(h2 h2Var) {
        super(2);
        this.$composeShape$delegate = h2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final e invoke(e applyIfNotNull, BorderStyle it) {
        AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
        AbstractC5504s.h(it, "it");
        return p.i(BorderKt.border(applyIfNotNull, it, ImageComponentViewKt.ImageComponentView$lambda$3(this.$composeShape$delegate)), it.m457getWidthD9Ej5fM());
    }
}
