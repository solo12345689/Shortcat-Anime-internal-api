package Kd;

import Gf.AbstractC1617k;
import Gf.O;
import Hd.b;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import androidx.media3.exoplayer.ExoPlayer;
import expo.modules.video.VideoView;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.ContentFit;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import q2.C6071C;
import q2.InterfaceC6084P;
import q2.d0;
import q2.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements InterfaceC6084P.d, Hd.b {

    /* JADX INFO: renamed from: a */
    private final Md.e f10988a;

    /* JADX INFO: renamed from: b */
    private InterfaceC5082a f10989b;

    /* JADX INFO: renamed from: c */
    private final WeakReference f10990c;

    /* JADX INFO: renamed from: d */
    private boolean f10991d;

    /* JADX INFO: renamed from: e */
    private boolean f10992e;

    /* JADX INFO: renamed from: f */
    private boolean f10993f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f10994a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ VideoPlayer f10995b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ b f10996c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(VideoPlayer videoPlayer, b bVar, Zd.e eVar) {
            super(2, eVar);
            this.f10995b = videoPlayer;
            this.f10996c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f10995b, this.f10996c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f10994a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f10995b.getPlayer().a0(this.f10996c);
            return L.f17438a;
        }
    }

    public b(Ub.d appContext, VideoPlayer videoPlayer, Md.e currentViewReference, InterfaceC5082a interfaceC5082a) {
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(videoPlayer, "videoPlayer");
        AbstractC5504s.h(currentViewReference, "currentViewReference");
        this.f10988a = currentViewReference;
        this.f10989b = interfaceC5082a;
        this.f10990c = new WeakReference(videoPlayer);
        videoPlayer.a2(this);
        AbstractC1617k.d(appContext.x(), null, null, new a(videoPlayer, this, null), 3, null);
    }

    private final boolean K() {
        ExoPlayer player;
        VideoView videoView;
        VideoPlayer videoPlayer = (VideoPlayer) this.f10990c.get();
        if (videoPlayer == null || (player = videoPlayer.getPlayer()) == null || (videoView = (VideoView) this.f10988a.a()) == null) {
            return false;
        }
        int iB = player.f().b();
        int iA = player.f().a();
        int i10 = player.w0().f56923a;
        int i11 = player.w0().f56924b;
        float f10 = player.w0().f56926d;
        if (iB != 0 && iA != 0) {
            return ((double) Math.abs(((((float) i10) / ((float) i11)) * f10) - (iB / iA))) < 0.05d || (videoView.getPlayerView().getResizeMode() == ContentFit.FILL.toResizeMode()) || (i10 == 0 || i11 == 0);
        }
        return false;
    }

    private final void O() {
        InterfaceC5082a interfaceC5082a;
        if ((!this.f10992e || !this.f10993f) && (interfaceC5082a = this.f10989b) != null) {
            interfaceC5082a.invoke();
        }
        this.f10991d = false;
        this.f10992e = true;
        this.f10993f = true;
    }

    @Override // q2.InterfaceC6084P.d
    public void E(C6071C c6071c, int i10) {
        this.f10992e = false;
        super.E(c6071c, i10);
    }

    public final boolean G() {
        return this.f10992e;
    }

    @Override // q2.InterfaceC6084P.d
    public void T() {
        if (K()) {
            O();
        } else {
            this.f10991d = true;
        }
    }

    @Override // q2.InterfaceC6084P.d
    public void W(int i10, int i11) {
        if (K() && this.f10991d) {
            O();
        }
    }

    public final void a() {
        ExoPlayer player;
        VideoPlayer videoPlayer = (VideoPlayer) this.f10990c.get();
        if (videoPlayer != null) {
            videoPlayer.V2(this);
        }
        VideoPlayer videoPlayer2 = (VideoPlayer) this.f10990c.get();
        if (videoPlayer2 != null && (player = videoPlayer2.getPlayer()) != null) {
            player.H(this);
        }
        this.f10989b = null;
    }

    @Override // Hd.b
    public void onAudioMixingModeChanged(VideoPlayer videoPlayer, AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2) {
        b.a.a(this, videoPlayer, audioMixingMode, audioMixingMode2);
    }

    @Override // Hd.b
    public void onIsPlayingChanged(VideoPlayer videoPlayer, boolean z10, Boolean bool) {
        b.a.b(this, videoPlayer, z10, bool);
    }

    @Override // Hd.b
    public void onMutedChanged(VideoPlayer videoPlayer, boolean z10, Boolean bool) {
        b.a.c(this, videoPlayer, z10, bool);
    }

    @Override // Hd.b
    public void onPlaybackRateChanged(VideoPlayer videoPlayer, float f10, Float f11) {
        b.a.d(this, videoPlayer, f10, f11);
    }

    @Override // Hd.b
    public void onPlayedToEnd(VideoPlayer videoPlayer) {
        b.a.e(this, videoPlayer);
    }

    @Override // Hd.b
    public void onRenderedFirstFrame(VideoPlayer videoPlayer) {
        b.a.f(this, videoPlayer);
    }

    @Override // Hd.b
    public void onSourceChanged(VideoPlayer videoPlayer, VideoSource videoSource, VideoSource videoSource2) {
        b.a.g(this, videoPlayer, videoSource, videoSource2);
    }

    @Override // Hd.b
    public void onStatusChanged(VideoPlayer videoPlayer, PlayerStatus playerStatus, PlayerStatus playerStatus2, PlaybackError playbackError) {
        b.a.h(this, videoPlayer, playerStatus, playerStatus2, playbackError);
    }

    @Override // Hd.b
    public void onTargetViewChanged(VideoPlayer player, VideoView videoView, VideoView videoView2) {
        AbstractC5504s.h(player, "player");
        this.f10993f = false;
    }

    @Override // Hd.b
    public void onTimeUpdate(VideoPlayer videoPlayer, TimeUpdate timeUpdate) {
        b.a.j(this, videoPlayer, timeUpdate);
    }

    @Override // Hd.b
    public void onTrackSelectionParametersChanged(VideoPlayer videoPlayer, d0 d0Var) {
        b.a.k(this, videoPlayer, d0Var);
    }

    @Override // Hd.b
    public void onTracksChanged(VideoPlayer videoPlayer, h0 h0Var) {
        b.a.l(this, videoPlayer, h0Var);
    }

    @Override // Hd.b
    public void onVideoSourceLoaded(VideoPlayer videoPlayer, VideoSource videoSource, Double d10, List list, List list2, List list3) {
        b.a.m(this, videoPlayer, videoSource, d10, list, list2, list3);
    }

    @Override // Hd.b
    public void onVideoTrackChanged(VideoPlayer videoPlayer, VideoTrack videoTrack, VideoTrack videoTrack2) {
        b.a.n(this, videoPlayer, videoTrack, videoTrack2);
    }

    @Override // Hd.b
    public void onVolumeChanged(VideoPlayer videoPlayer, float f10, Float f11) {
        b.a.o(this, videoPlayer, f10, f11);
    }
}
