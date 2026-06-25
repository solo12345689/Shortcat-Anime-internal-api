package Hd;

import expo.modules.video.VideoView;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import q2.d0;
import q2.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static void a(b bVar, VideoPlayer player, AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2) {
            AbstractC5504s.h(player, "player");
            AbstractC5504s.h(audioMixingMode, "audioMixingMode");
        }

        public static void b(b bVar, VideoPlayer player, boolean z10, Boolean bool) {
            AbstractC5504s.h(player, "player");
        }

        public static void c(b bVar, VideoPlayer player, boolean z10, Boolean bool) {
            AbstractC5504s.h(player, "player");
        }

        public static void d(b bVar, VideoPlayer player, float f10, Float f11) {
            AbstractC5504s.h(player, "player");
        }

        public static void e(b bVar, VideoPlayer player) {
            AbstractC5504s.h(player, "player");
        }

        public static void f(b bVar, VideoPlayer player) {
            AbstractC5504s.h(player, "player");
        }

        public static void g(b bVar, VideoPlayer player, VideoSource videoSource, VideoSource videoSource2) {
            AbstractC5504s.h(player, "player");
        }

        public static void h(b bVar, VideoPlayer player, PlayerStatus status, PlayerStatus playerStatus, PlaybackError playbackError) {
            AbstractC5504s.h(player, "player");
            AbstractC5504s.h(status, "status");
        }

        public static void i(b bVar, VideoPlayer player, VideoView videoView, VideoView videoView2) {
            AbstractC5504s.h(player, "player");
        }

        public static void j(b bVar, VideoPlayer player, TimeUpdate timeUpdate) {
            AbstractC5504s.h(player, "player");
            AbstractC5504s.h(timeUpdate, "timeUpdate");
        }

        public static void k(b bVar, VideoPlayer player, d0 trackSelectionParameters) {
            AbstractC5504s.h(player, "player");
            AbstractC5504s.h(trackSelectionParameters, "trackSelectionParameters");
        }

        public static void l(b bVar, VideoPlayer player, h0 tracks) {
            AbstractC5504s.h(player, "player");
            AbstractC5504s.h(tracks, "tracks");
        }

        public static void m(b bVar, VideoPlayer player, VideoSource videoSource, Double d10, List availableVideoTracks, List availableSubtitleTracks, List availableAudioTracks) {
            AbstractC5504s.h(player, "player");
            AbstractC5504s.h(availableVideoTracks, "availableVideoTracks");
            AbstractC5504s.h(availableSubtitleTracks, "availableSubtitleTracks");
            AbstractC5504s.h(availableAudioTracks, "availableAudioTracks");
        }

        public static void n(b bVar, VideoPlayer player, VideoTrack videoTrack, VideoTrack videoTrack2) {
            AbstractC5504s.h(player, "player");
        }

        public static void o(b bVar, VideoPlayer player, float f10, Float f11) {
            AbstractC5504s.h(player, "player");
        }
    }

    void onAudioMixingModeChanged(VideoPlayer videoPlayer, AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2);

    void onIsPlayingChanged(VideoPlayer videoPlayer, boolean z10, Boolean bool);

    void onMutedChanged(VideoPlayer videoPlayer, boolean z10, Boolean bool);

    void onPlaybackRateChanged(VideoPlayer videoPlayer, float f10, Float f11);

    void onPlayedToEnd(VideoPlayer videoPlayer);

    void onRenderedFirstFrame(VideoPlayer videoPlayer);

    void onSourceChanged(VideoPlayer videoPlayer, VideoSource videoSource, VideoSource videoSource2);

    void onStatusChanged(VideoPlayer videoPlayer, PlayerStatus playerStatus, PlayerStatus playerStatus2, PlaybackError playbackError);

    void onTargetViewChanged(VideoPlayer videoPlayer, VideoView videoView, VideoView videoView2);

    void onTimeUpdate(VideoPlayer videoPlayer, TimeUpdate timeUpdate);

    void onTrackSelectionParametersChanged(VideoPlayer videoPlayer, d0 d0Var);

    void onTracksChanged(VideoPlayer videoPlayer, h0 h0Var);

    void onVideoSourceLoaded(VideoPlayer videoPlayer, VideoSource videoSource, Double d10, List list, List list2, List list3);

    void onVideoTrackChanged(VideoPlayer videoPlayer, VideoTrack videoTrack, VideoTrack videoTrack2);

    void onVolumeChanged(VideoPlayer videoPlayer, float f10, Float f11);
}
