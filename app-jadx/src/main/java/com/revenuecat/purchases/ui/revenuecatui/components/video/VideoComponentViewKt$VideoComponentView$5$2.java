package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.C5487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class VideoComponentViewKt$VideoComponentView$5$2 extends C5487a implements Function2 {
    public static final VideoComponentViewKt$VideoComponentView$5$2 INSTANCE = new VideoComponentViewKt$VideoComponentView$5$2();

    VideoComponentViewKt$VideoComponentView$5$2() {
        super(2, OverlayKt.class, "overlay", "overlay(Landroidx/compose/ui/Modifier;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e p02, ColorStyle p12) {
        AbstractC5504s.h(p02, "p0");
        AbstractC5504s.h(p12, "p1");
        return OverlayKt.overlay$default(p02, p12, null, 2, null);
    }
}
