package Kd;

import Hd.b;
import P9.AbstractC2011u;
import P9.AbstractC2012v;
import P9.X;
import Td.z;
import Ud.AbstractC2279u;
import androidx.media3.exoplayer.ExoPlayer;
import expo.modules.video.VideoView;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import q2.AbstractC6079K;
import q2.C6109x;
import q2.a0;
import q2.b0;
import q2.d0;
import q2.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements Hd.b {

    /* JADX INFO: renamed from: a */
    private final WeakReference f11009a;

    /* JADX INFO: renamed from: b */
    private final Map f11010b;

    /* JADX INFO: renamed from: c */
    private C6109x f11011c;

    /* JADX INFO: renamed from: d */
    private b0 f11012d;

    /* JADX INFO: renamed from: e */
    private final ArrayList f11013e;

    public l(VideoPlayer owner) {
        AbstractC5504s.h(owner, "owner");
        this.f11009a = new WeakReference(owner);
        this.f11010b = new LinkedHashMap();
        this.f11013e = new ArrayList();
        owner.a2(this);
    }

    private final void a(AudioTrack audioTrack) {
        ExoPlayer player;
        Pair pair;
        VideoPlayer videoPlayerE = e();
        if (videoPlayerE == null || (player = videoPlayerE.getPlayer()) == null) {
            return;
        }
        d0 d0VarJ0 = player.j0();
        AbstractC5504s.g(d0VarJ0, "getTrackSelectionParameters(...)");
        if (this.f11012d != null) {
            d0VarJ0 = d0VarJ0.I().I(1).G();
            AbstractC5504s.g(d0VarJ0, "build(...)");
        }
        Object obj = null;
        if (audioTrack == null) {
            player.P(d0VarJ0);
            f(false);
            this.f11012d = null;
            return;
        }
        Iterator it = this.f11010b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC5504s.c(((C6109x) next).f57008a, audioTrack.getId())) {
                obj = next;
                break;
            }
        }
        C6109x c6109x = (C6109x) obj;
        if (c6109x == null || (pair = (Pair) this.f11010b.get(c6109x)) == null) {
            return;
        }
        b0 b0Var = new b0((a0) pair.c(), ((Number) pair.d()).intValue());
        d0 d0VarG = d0VarJ0.I().F(b0Var).G();
        AbstractC5504s.g(d0VarG, "build(...)");
        player.P(d0VarG);
        f(true);
        this.f11012d = b0Var;
    }

    private final C6109x b() {
        C6109x c6109xC;
        AbstractC2012v abstractC2012v;
        ExoPlayer player;
        VideoPlayer videoPlayerE = e();
        C6109x c6109x = null;
        Object obj = null;
        c6109x = null;
        d0 d0VarJ0 = (videoPlayerE == null || (player = videoPlayerE.getPlayer()) == null) ? null : player.j0();
        AbstractC2011u abstractC2011u = d0VarJ0 != null ? d0VarJ0.f56822p : null;
        if (d0VarJ0 == null || (abstractC2012v = d0VarJ0.f56805D) == null) {
            c6109xC = null;
        } else {
            Iterator it = abstractC2012v.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                a0 a0Var = (a0) entry.getKey();
                b0 b0Var = (b0) entry.getValue();
                if (a0Var.f56704c == 1) {
                    AbstractC2011u trackIndices = b0Var.f56744b;
                    AbstractC5504s.g(trackIndices, "trackIndices");
                    Integer num = (Integer) AbstractC2279u.o0(trackIndices);
                    if (num != null) {
                        c6109xC = a0Var.c(num.intValue());
                    }
                }
            }
            c6109xC = null;
        }
        if (abstractC2011u != null) {
            X it2 = abstractC2011u.iterator();
            AbstractC5504s.g(it2, "iterator(...)");
            if (it2.hasNext()) {
                String str = (String) it2.next();
                Iterator it3 = this.f11010b.keySet().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (AbstractC5504s.c(((C6109x) next).f57011d, str)) {
                        obj = next;
                        break;
                    }
                }
                c6109x = (C6109x) obj;
            }
        }
        return c6109xC == null ? c6109x : c6109xC;
    }

    private final VideoPlayer e() {
        return (VideoPlayer) this.f11009a.get();
    }

    public final ArrayList c() {
        return this.f11013e;
    }

    public final AudioTrack d() {
        return AudioTrack.INSTANCE.a(this.f11011c);
    }

    public final void f(boolean z10) {
        ExoPlayer player;
        d0 d0VarJ0;
        ExoPlayer player2;
        VideoPlayer videoPlayerE = e();
        if (videoPlayerE == null || (player = videoPlayerE.getPlayer()) == null || (d0VarJ0 = player.j0()) == null) {
            return;
        }
        d0 d0VarG = d0VarJ0.I().V(1, !z10).G();
        AbstractC5504s.g(d0VarG, "build(...)");
        if (!z10) {
            d0VarG = d0VarG.I().I(1).G();
            AbstractC5504s.g(d0VarG, "build(...)");
        }
        VideoPlayer videoPlayerE2 = e();
        if (videoPlayerE2 == null || (player2 = videoPlayerE2.getPlayer()) == null) {
            return;
        }
        player2.P(d0VarG);
    }

    public final void g(AudioTrack audioTrack) {
        a(audioTrack);
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
    public void onTargetViewChanged(VideoPlayer videoPlayer, VideoView videoView, VideoView videoView2) {
        b.a.i(this, videoPlayer, videoView, videoView2);
    }

    @Override // Hd.b
    public void onTimeUpdate(VideoPlayer videoPlayer, TimeUpdate timeUpdate) {
        b.a.j(this, videoPlayer, timeUpdate);
    }

    @Override // Hd.b
    public void onTrackSelectionParametersChanged(VideoPlayer player, d0 trackSelectionParameters) {
        AbstractC5504s.h(player, "player");
        AbstractC5504s.h(trackSelectionParameters, "trackSelectionParameters");
        this.f11011c = b();
        b.a.k(this, player, trackSelectionParameters);
    }

    @Override // Hd.b
    public void onTracksChanged(VideoPlayer player, h0 tracks) {
        AbstractC5504s.h(player, "player");
        AbstractC5504s.h(tracks, "tracks");
        this.f11010b.clear();
        this.f11013e.clear();
        X it = tracks.b().iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            h0.a aVar = (h0.a) it.next();
            int i10 = aVar.f56884a;
            for (int i11 = 0; i11 < i10; i11++) {
                C6109x c6109xD = aVar.d(i11);
                AbstractC5504s.g(c6109xD, "getTrackFormat(...)");
                if (AbstractC6079K.o(c6109xD.f57022o)) {
                    this.f11010b.put(c6109xD, z.a(aVar.c(), Integer.valueOf(i11)));
                    AudioTrack audioTrackA = AudioTrack.INSTANCE.a(c6109xD);
                    if (audioTrackA != null) {
                        this.f11013e.add(audioTrackA);
                    }
                }
            }
        }
        this.f11011c = b();
        b.a.l(this, player, tracks);
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
