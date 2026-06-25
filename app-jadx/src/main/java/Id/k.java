package Id;

import android.util.Rational;
import androidx.media3.exoplayer.ExoPlayer;
import expo.modules.video.VideoView;
import expo.modules.video.player.VideoPlayer;
import kotlin.jvm.internal.AbstractC5504s;
import q2.l0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {
    public static final Rational a(VideoView videoView) {
        ExoPlayer player;
        AbstractC5504s.h(videoView, "<this>");
        VideoPlayer videoPlayer = videoView.getVideoPlayer();
        if (videoPlayer == null || (player = videoPlayer.getPlayer()) == null) {
            return null;
        }
        l0 l0VarW0 = player.w0();
        AbstractC5504s.g(l0VarW0, "getVideoSize(...)");
        return Md.l.h(l0VarW0, videoView.getWidth(), videoView.getHeight(), videoView.getContentFit());
    }
}
