package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Y.C0;
import android.content.Context;
import android.net.Uri;
import com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;", "ctx", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class VideoViewKt$Video$3$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ boolean $autoPlay;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $loop;
    final /* synthetic */ boolean $muteAudio;
    final /* synthetic */ InterfaceC5082a $onReady;
    final /* synthetic */ Map<String, VideoPlaybackState> $savedState;
    final /* synthetic */ TextureVideoView.ScaleType $scaleType;
    final /* synthetic */ boolean $showControls;
    final /* synthetic */ String $videoUri;
    final /* synthetic */ C0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoViewKt$Video$3$1$1(Map<String, VideoPlaybackState> map, String str, boolean z10, String str2, boolean z11, boolean z12, C0 c02, TextureVideoView.ScaleType scaleType, boolean z13, InterfaceC5082a interfaceC5082a) {
        super(1);
        this.$savedState = map;
        this.$key = str;
        this.$autoPlay = z10;
        this.$videoUri = str2;
        this.$showControls = z11;
        this.$muteAudio = z12;
        this.$videoView = c02;
        this.$scaleType = scaleType;
        this.$loop = z13;
        this.$onReady = interfaceC5082a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TextureVideoView invoke(Context ctx) {
        AbstractC5504s.h(ctx, "ctx");
        VideoPlaybackState videoPlaybackState = this.$savedState.get(this.$key);
        if (videoPlaybackState == null) {
            videoPlaybackState = new VideoPlaybackState(0, this.$autoPlay);
        }
        int iMax = Math.max(videoPlaybackState.getPositionMs(), videoPlaybackState.getPositionMs());
        boolean playWhenReady = iMax > 0 ? videoPlaybackState.getPlayWhenReady() : this.$autoPlay;
        Uri uri = Uri.parse(this.$videoUri);
        TextureVideoView textureVideoView = new TextureVideoView(ctx, null, this.$showControls, this.$muteAudio, 2, null);
        C0 c02 = this.$videoView;
        TextureVideoView.ScaleType scaleType = this.$scaleType;
        boolean z10 = this.$loop;
        InterfaceC5082a interfaceC5082a = this.$onReady;
        c02.setValue(textureVideoView);
        textureVideoView.setScaleType(scaleType);
        textureVideoView.setLooping(z10);
        textureVideoView.setAutoStart(playWhenReady);
        textureVideoView.setOnReadyCallback(interfaceC5082a);
        textureVideoView.setVideoURI(uri);
        if (iMax > 0) {
            textureVideoView.setPlaybackState(new TextureVideoView.PlaybackState(iMax, playWhenReady));
        }
        return textureVideoView;
    }
}
