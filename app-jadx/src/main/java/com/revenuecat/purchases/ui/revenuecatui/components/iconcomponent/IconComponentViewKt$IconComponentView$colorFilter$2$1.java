package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import androidx.compose.ui.graphics.d;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/d;", "invoke", "()Landroidx/compose/ui/graphics/d;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class IconComponentViewKt$IconComponentView$colorFilter$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ ColorStyle $tintColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconComponentViewKt$IconComponentView$colorFilter$2$1(ColorStyle colorStyle) {
        super(0);
        this.$tintColor = colorStyle;
    }

    @Override // ie.InterfaceC5082a
    public final d invoke() {
        ColorStyle colorStyle = this.$tintColor;
        ColorStyle.Solid solid = colorStyle instanceof ColorStyle.Solid ? (ColorStyle.Solid) colorStyle : null;
        if (solid != null) {
            return d.a.b(d.f26763b, solid.m476unboximpl(), 0, 2, null);
        }
        return null;
    }
}
