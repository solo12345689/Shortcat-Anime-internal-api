package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Td.N;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ImageComponentState$imageAspectRatio$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageComponentState$imageAspectRatio$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final Float invoke() {
        return Float.valueOf(((float) N.c(this.this$0.getImageUrls().getWidth())) / ((float) N.c(this.this$0.getImageUrls().getHeight())));
    }
}
