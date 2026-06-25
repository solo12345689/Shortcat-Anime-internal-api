package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Td.N;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class VideoComponentState$imageAspectRatio$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoComponentState$imageAspectRatio$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final Float invoke() {
        ImageUrls fallbackUrls = this.this$0.getFallbackUrls();
        if (fallbackUrls == null) {
            return null;
        }
        return Float.valueOf(((float) N.c(fallbackUrls.getWidth())) / ((float) N.c(fallbackUrls.getHeight())));
    }
}
