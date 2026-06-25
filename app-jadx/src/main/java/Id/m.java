package Id;

import Fd.E;
import Fd.b0;
import Md.p;
import Md.q;
import Td.L;
import Ud.AbstractC2279u;
import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import expo.modules.video.FullscreenPlayerActivity;
import expo.modules.video.VideoView;
import expo.modules.video.playbackService.ExpoVideoPlaybackService;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: c */
    public static j f9067c;

    /* JADX INFO: renamed from: h */
    private static e f9072h;

    /* JADX INFO: renamed from: i */
    public static E f9073i;

    /* JADX INFO: renamed from: a */
    public static final m f9065a = new m();

    /* JADX INFO: renamed from: b */
    private static WeakReference f9066b = new WeakReference(null);

    /* JADX INFO: renamed from: d */
    private static Map f9068d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    private static Map f9069e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    private static Map f9070f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    private static p f9071g = q.a();

    /* JADX INFO: renamed from: j */
    private static List f9074j = new ArrayList();

    private m() {
    }

    private final void b() {
        Iterator it = f9068d.values().iterator();
        while (it.hasNext()) {
            ((VideoView) it.next()).setKeepScreenOn(!f9071g.isEmpty());
        }
    }

    private final void f(VideoView videoView) {
        ExoPlayer player;
        VideoPlayer videoPlayer = videoView.getVideoPlayer();
        if (videoPlayer == null || (player = videoPlayer.getPlayer()) == null || !player.isPlaying()) {
            return;
        }
        player.pause();
        videoView.setWasAutoPaused(true);
    }

    private final boolean v(VideoView videoView) {
        VideoPlayer videoPlayer = videoView.getVideoPlayer();
        return (videoPlayer == null || videoPlayer.getStaysActiveInBackground() || videoView.getPipParams().d() || videoView.getPipParams().h() || videoView.getIsInFullscreen()) ? false : true;
    }

    public static final boolean y(Hd.a aVar, WeakReference it) {
        AbstractC5504s.h(it, "it");
        return !AbstractC5504s.c(it.get(), aVar);
    }

    public final void A(VideoView videoView) {
        AbstractC5504s.h(videoView, "videoView");
        f9068d.remove(videoView.getVideoViewId());
        Iterator it = f9074j.iterator();
        while (it.hasNext()) {
            Hd.a aVar = (Hd.a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.c(videoView, f9068d.values());
            }
        }
    }

    public final E c() {
        E e10 = f9073i;
        if (e10 != null) {
            return e10;
        }
        AbstractC5504s.u("cache");
        return null;
    }

    public final j d() {
        j jVar = f9067c;
        if (jVar != null) {
            return jVar;
        }
        AbstractC5504s.u("pictureInPicture");
        return null;
    }

    public final VideoView e(String id2) throws b0 {
        AbstractC5504s.h(id2, "id");
        VideoView videoView = (VideoView) f9068d.get(id2);
        if (videoView != null) {
            return videoView;
        }
        throw new b0(id2);
    }

    public final boolean g() {
        return !f9070f.isEmpty();
    }

    public final void h() {
        for (VideoView videoView : f9068d.values()) {
            if (v(videoView)) {
                f(videoView);
            } else {
                videoView.setWasAutoPaused(false);
            }
        }
        Iterator it = f9074j.iterator();
        while (it.hasNext()) {
            Hd.a aVar = (Hd.a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.onAppBackgrounded();
            }
        }
    }

    public final void i() {
        Iterator it = f9074j.iterator();
        while (it.hasNext()) {
            Hd.a aVar = (Hd.a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.onAppForegrounded();
            }
        }
    }

    public final void j(Ub.d appContext) {
        AbstractC5504s.h(appContext, "appContext");
        synchronized (this) {
            try {
                Context contextB = appContext.B();
                if (contextB == null) {
                    throw new cc.i();
                }
                m mVar = f9065a;
                mVar.u(new j(appContext));
                if (f9072h == null) {
                    f9072h = new e(appContext);
                }
                if (f9073i == null) {
                    mVar.t(new E(contextB));
                } else {
                    Ub.d dVar = (Ub.d) f9066b.get();
                    if (!AbstractC5504s.c(dVar != null ? dVar.B() : null, appContext.B())) {
                        mVar.c().n();
                        mVar.t(new E(contextB));
                    }
                }
                f9066b = new WeakReference(appContext);
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(Ub.d appContext) {
        AbstractC5504s.h(appContext, "appContext");
        d().v();
        f9074j.clear();
    }

    public final void l(VideoPlayer videoPlayer, VideoView videoView) {
        Jd.c cVarB;
        ExpoVideoPlaybackService expoVideoPlaybackServiceA;
        AbstractC5504s.h(videoPlayer, "videoPlayer");
        AbstractC5504s.h(videoView, "videoView");
        List list = (List) f9070f.get(videoPlayer);
        if (list == null || !list.contains(videoView)) {
            List list2 = (List) f9070f.get(videoPlayer);
            if (list2 != null) {
                list2.add(videoView);
            } else {
                f9070f.put(videoPlayer, AbstractC2279u.g(videoView));
            }
            List list3 = (List) f9070f.get(videoPlayer);
            if (list3 == null || list3.size() != 1 || (cVarB = videoPlayer.getServiceConnection().b()) == null || (expoVideoPlaybackServiceA = cVarB.a()) == null) {
                return;
            }
            expoVideoPlaybackServiceA.J(videoPlayer);
        }
    }

    public final void m(VideoPlayer videoPlayer, VideoView videoView) {
        Jd.c cVarB;
        ExpoVideoPlaybackService expoVideoPlaybackServiceA;
        List list;
        AbstractC5504s.h(videoPlayer, "videoPlayer");
        AbstractC5504s.h(videoView, "videoView");
        List list2 = (List) f9070f.get(videoPlayer);
        if (list2 != null) {
            list2.remove(videoView);
        }
        if ((f9070f.get(videoPlayer) != null && ((list = (List) f9070f.get(videoPlayer)) == null || list.size() != 0)) || (cVarB = videoPlayer.getServiceConnection().b()) == null || (expoVideoPlaybackServiceA = cVarB.a()) == null) {
            return;
        }
        expoVideoPlaybackServiceA.N(videoPlayer.getPlayer());
    }

    public final void n(String id2, FullscreenPlayerActivity fullscreenActivity) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(fullscreenActivity, "fullscreenActivity");
        f9069e.put(id2, new WeakReference(fullscreenActivity));
    }

    public final void o(Hd.a listener) {
        AbstractC5504s.h(listener, "listener");
        f9074j.add(new WeakReference(listener));
    }

    public final void p(VideoPlayer videoPlayer) {
        AbstractC5504s.h(videoPlayer, "videoPlayer");
        Map map = f9070f;
        Collection arrayList = (List) map.get(videoPlayer);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        map.put(videoPlayer, arrayList);
        e eVar = f9072h;
        if (eVar == null) {
            AbstractC5504s.u("audioFocusManager");
            eVar = null;
        }
        eVar.p(videoPlayer);
    }

    public final void q(VideoView videoView) {
        AbstractC5504s.h(videoView, "videoView");
        f9068d.put(videoView.getVideoViewId(), videoView);
        Iterator it = f9074j.iterator();
        while (it.hasNext()) {
            Hd.a aVar = (Hd.a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.b(videoView, f9068d.values());
            }
        }
    }

    public final void r(VideoPlayer player) {
        AbstractC5504s.h(player, "player");
        f9071g.remove(player);
        b();
    }

    public final void s(VideoPlayer player) {
        AbstractC5504s.h(player, "player");
        f9071g.add(player);
        b();
    }

    public final void t(E e10) {
        AbstractC5504s.h(e10, "<set-?>");
        f9073i = e10;
    }

    public final void u(j jVar) {
        AbstractC5504s.h(jVar, "<set-?>");
        f9067c = jVar;
    }

    public final void w(String id2) {
        AbstractC5504s.h(id2, "id");
        f9069e.remove(id2);
    }

    public final void x(final Hd.a listener) {
        AbstractC5504s.h(listener, "listener");
        AbstractC2279u.Q(f9074j, new Function1() { // from class: Id.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.y(listener, (WeakReference) obj));
            }
        });
    }

    public final void z(VideoPlayer videoPlayer) {
        AbstractC5504s.h(videoPlayer, "videoPlayer");
        f9070f.remove(videoPlayer);
        e eVar = f9072h;
        if (eVar == null) {
            AbstractC5504s.u("audioFocusManager");
            eVar = null;
        }
        eVar.s(videoPlayer);
    }
}
