package com.revenuecat.purchases.ui.revenuecatui.components.image;

import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatioKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;", "it", "invoke", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class ImageComponentViewKt$ImageComponentView$4$1 extends AbstractC5506u implements Function2 {
    public static final ImageComponentViewKt$ImageComponentView$4$1 INSTANCE = new ImageComponentViewKt$ImageComponentView$4$1();

    ImageComponentViewKt$ImageComponentView$4$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final e invoke(e applyIfNotNull, AspectRatio it) {
        AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
        AbstractC5504s.h(it, "it");
        return AspectRatioKt.aspectRatio(applyIfNotNull, it);
    }
}
