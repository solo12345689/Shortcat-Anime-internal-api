package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Gf.O;
import Td.L;
import Td.v;
import Y.C0;
import ae.AbstractC2605b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt$Video$1$1", f = "VideoView.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class VideoViewKt$Video$1$1 extends l implements Function2 {
    final /* synthetic */ boolean $autoPlay;
    final /* synthetic */ C0 $videoView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoViewKt$Video$1$1(C0 c02, boolean z10, Zd.e eVar) {
        super(2, eVar);
        this.$videoView = c02;
        this.$autoPlay = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Zd.e create(Object obj, Zd.e eVar) {
        return new VideoViewKt$Video$1$1(this.$videoView, this.$autoPlay, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, Zd.e eVar) {
        return ((VideoViewKt$Video$1$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2605b.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        TextureVideoView textureVideoView = (TextureVideoView) this.$videoView.getValue();
        if (textureVideoView != null) {
            textureVideoView.setAutoStart(this.$autoPlay);
            textureVideoView.startIfNeeded();
        }
        return L.f17438a;
    }
}
