package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Y.C0;
import Y.X;
import Y.Y;
import com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LY/Y;", "LY/X;", "invoke", "(LY/Y;)LY/X;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class VideoViewKt$Video$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ String $key;
    final /* synthetic */ Map<String, VideoPlaybackState> $savedState;
    final /* synthetic */ C0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoViewKt$Video$2$1(C0 c02, Map<String, VideoPlaybackState> map, String str) {
        super(1);
        this.$videoView = c02;
        this.$savedState = map;
        this.$key = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final X invoke(Y DisposableEffect) {
        AbstractC5504s.h(DisposableEffect, "$this$DisposableEffect");
        final C0 c02 = this.$videoView;
        final Map<String, VideoPlaybackState> map = this.$savedState;
        final String str = this.$key;
        return new X() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt$Video$2$1$invoke$$inlined$onDispose$1
            @Override // Y.X
            public void dispose() {
                TextureVideoView textureVideoView = (TextureVideoView) c02.getValue();
                if (textureVideoView != null) {
                    TextureVideoView.PlaybackState playbackState = textureVideoView.getPlaybackState();
                    map.put(str, new VideoPlaybackState(playbackState.getPositionMs(), playbackState.getPlayWhenReady()));
                }
            }
        };
    }
}
