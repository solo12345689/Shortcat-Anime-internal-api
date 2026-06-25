package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Td.L;
import Y.C0;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;", "view", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class VideoViewKt$Video$3$3$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ InterfaceC5082a $onReady;
    final /* synthetic */ C0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoViewKt$Video$3$3$1(C0 c02, InterfaceC5082a interfaceC5082a) {
        super(1);
        this.$videoView = c02;
        this.$onReady = interfaceC5082a;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextureVideoView) obj);
        return L.f17438a;
    }

    public final void invoke(TextureVideoView view) {
        AbstractC5504s.h(view, "view");
        this.$videoView.setValue(view);
        view.setOnReadyCallback(this.$onReady);
    }
}
