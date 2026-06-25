package com.revenuecat.purchases.ui.revenuecatui.components.image;

import com.revenuecat.purchases.paywalls.components.PartialImageComponent;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls0/E1;", "invoke", "()Ls0/E1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ImageComponentState$shape$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageComponentState$shape$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final E1 invoke() {
        PartialImageComponent partial;
        MaskShape maskShape;
        E1 shape;
        PresentedImagePartial presentedPartial = this.this$0.getPresentedPartial();
        return (presentedPartial == null || (partial = presentedPartial.getPartial()) == null || (maskShape = partial.getMaskShape()) == null || (shape = ShapeKt.toShape(maskShape)) == null) ? this.this$0.style.getShape() : shape;
    }
}
