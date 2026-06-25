package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Td.N;
import Td.r;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class VideoComponentState$marginAdjustedAspectRatio$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoComponentState$marginAdjustedAspectRatio$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final AspectRatio invoke() {
        Size sizePlusMargin = this.this$0.getSizePlusMargin();
        SizeConstraint height = sizePlusMargin.getHeight();
        if (!(height instanceof SizeConstraint.Fixed)) {
            if (height instanceof SizeConstraint.Fit ? true : height instanceof SizeConstraint.Fill) {
                return null;
            }
            throw new r();
        }
        SizeConstraint width = sizePlusMargin.getWidth();
        if (width instanceof SizeConstraint.Fit ? true : width instanceof SizeConstraint.Fill) {
            return null;
        }
        if (width instanceof SizeConstraint.Fixed) {
            return new AspectRatio(((float) N.c(((SizeConstraint.Fixed) width).getValue())) / ((float) N.c(((SizeConstraint.Fixed) height).getValue())), true);
        }
        throw new r();
    }
}
