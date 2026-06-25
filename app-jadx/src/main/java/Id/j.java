package Id;

import Fd.C1579s;
import Fd.C1582v;
import Fd.InterfaceC1581u;
import Gf.AbstractC1617k;
import Gf.O;
import Md.n;
import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import expo.modules.video.VideoView;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import ub.C6752d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements InterfaceC1581u, Hd.a, Hd.c {

    /* JADX INFO: renamed from: a */
    private final WeakReference f9051a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f9052b;

    /* JADX INFO: renamed from: c */
    private boolean f9053c;

    /* JADX INFO: renamed from: d */
    private boolean f9054d;

    /* JADX INFO: renamed from: e */
    private WeakReference f9055e;

    /* JADX INFO: renamed from: f */
    private C1582v f9056f;

    /* JADX INFO: renamed from: g */
    private final List f9057g;

    /* JADX INFO: renamed from: h */
    private final Map f9058h;

    /* JADX INFO: renamed from: i */
    private boolean f9059i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(Float.valueOf(n.b((VideoView) obj)), Float.valueOf(n.b((VideoView) obj2)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f9060a;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return j.this.new b(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
            ExoPlayer player;
            AbstractC2605b.f();
            if (this.f9060a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            List<VideoView> listO = j.this.o();
            j jVar = j.this;
            for (VideoView videoView : listO) {
                if (jVar.x(videoView)) {
                    VideoPlayer videoPlayer = videoView.getVideoPlayer();
                    if (videoPlayer != null && (player = videoPlayer.getPlayer()) != null) {
                        player.pause();
                    }
                    videoView.setWasAutoPaused(true);
                }
                videoView.getPlayerView().setUseController(false);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f9062a;

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return j.this.new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
            AbstractC2605b.f();
            if (this.f9062a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            for (VideoView videoView : j.this.o()) {
                videoView.getPlayerView().setUseController(videoView.getUseNativeControls());
            }
            return L.f17438a;
        }
    }

    public j(Ub.d appContext) {
        AbstractC5504s.h(appContext, "appContext");
        this.f9051a = new WeakReference(appContext);
        this.f9052b = new WeakReference(appContext.a());
        this.f9055e = new WeakReference(null);
        this.f9057g = new ArrayList();
        this.f9058h = new LinkedHashMap();
        m.f9065a.o(this);
    }

    private final void i() {
        Object obj = this.f9052b.get();
        AbstractActivityC2842v abstractActivityC2842v = obj instanceof AbstractActivityC2842v ? (AbstractActivityC2842v) obj : null;
        if (abstractActivityC2842v != null) {
            C1582v c1582v = new C1582v(this);
            this.f9056f = c1582v;
            abstractActivityC2842v.C().s().e(c1582v, c1582v.w()).i();
        }
    }

    private final void j(VideoView videoView) throws C1579s {
        Activity activity = (Activity) this.f9052b.get();
        if (activity != null) {
            Md.l.f(activity, Md.l.i(videoView.getPlayerView()));
            Md.l.c(activity, this.f9053c, videoView.getPipParams().c());
        }
    }

    private final void k() {
        if (this.f9054d) {
            return;
        }
        this.f9055e = new WeakReference(n(o()));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m() throws Fd.C1579s {
        /*
            r5 = this;
            java.util.List r0 = r5.o()
            expo.modules.video.VideoView r0 = r5.n(r0)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r5.f9055e = r1
            java.util.List r1 = r5.o()
            if (r1 == 0) goto L1c
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1c
            goto L37
        L1c:
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            expo.modules.video.VideoView r2 = (expo.modules.video.VideoView) r2
            Ld.a r2 = r2.getPipParams()
            boolean r2 = r2.e()
            if (r2 == 0) goto L20
            goto L6a
        L37:
            java.util.List r1 = r5.o()
            if (r1 == 0) goto L44
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L44
            goto L6a
        L44:
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r1.next()
            expo.modules.video.VideoView r2 = (expo.modules.video.VideoView) r2
            Ld.a r3 = r2.getPipParams()
            boolean r3 = r3.d()
            if (r3 == 0) goto L48
            Ld.a r2 = r2.getPipParams()
            boolean r2 = r2.f()
            if (r2 == 0) goto L48
            r1 = 1
            goto L6b
        L6a:
            r1 = 0
        L6b:
            r5.f9053c = r1
            if (r1 != 0) goto L80
            java.lang.ref.WeakReference r1 = r5.f9052b
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L80
            boolean r2 = r5.f9053c
            r3 = 4
            r4 = 0
            Md.l.d(r1, r2, r4, r3, r4)
        L80:
            if (r0 == 0) goto L85
            r5.j(r0)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Id.j.m():void");
    }

    private final VideoView n(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((VideoView) obj).getPipParams().d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (n.a((VideoView) obj2)) {
                arrayList2.add(obj2);
            }
        }
        List listK0 = AbstractC2279u.K0(AbstractC2279u.R0(arrayList2, new a()));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            VideoView videoView = (VideoView) obj3;
            VideoPlayer videoPlayer = videoView.getVideoPlayer();
            if ((videoPlayer != null && videoPlayer.z2()) || videoView.getWasAutoPaused()) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : listK0) {
            VideoPlayer videoPlayer2 = ((VideoView) obj4).getVideoPlayer();
            if (videoPlayer2 != null && videoPlayer2.z2()) {
                arrayList4.add(obj4);
            }
        }
        return (VideoView) AbstractC2279u.o0(AbstractC2279u.z(AbstractC2279u.p(arrayList4, arrayList3, listK0, arrayList)));
    }

    public final List o() {
        List list = this.f9057g;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoView videoView = (VideoView) ((WeakReference) it.next()).get();
            if (videoView != null) {
                arrayList.add(videoView);
            }
        }
        return arrayList;
    }

    private final void p(VideoView videoView) {
        Activity activity = (Activity) this.f9052b.get();
        if (activity == null) {
            return;
        }
        PlayerView playerView = videoView.getPlayerView();
        View decorView = activity.getWindow().getDecorView();
        AbstractC5504s.g(decorView, "getDecorView(...)");
        ViewGroup viewGroup = (ViewGroup) decorView.findViewById(R.id.content);
        ViewParent parent = playerView.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(playerView);
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!AbstractC5504s.c(childAt, playerView)) {
                this.f9058h.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getVisibility()));
                viewGroup.getChildAt(i10).setVisibility(8);
            }
        }
        viewGroup.addView(playerView, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void q(VideoView videoView) {
        Activity activity = (Activity) this.f9052b.get();
        if (activity == null) {
            return;
        }
        PlayerView playerView = videoView != null ? videoView.getPlayerView() : null;
        View decorView = activity.getWindow().getDecorView();
        AbstractC5504s.g(decorView, "getDecorView(...)");
        ViewGroup viewGroup = (ViewGroup) decorView.findViewById(R.id.content);
        viewGroup.removeView(playerView);
        if (videoView != null) {
            videoView.addView(playerView);
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Integer num = (Integer) this.f9058h.get(Integer.valueOf(childAt.getId()));
            if (num != null) {
                childAt.setVisibility(num.intValue());
            }
        }
        this.f9058h.clear();
    }

    private final void r() {
        Ub.d dVar;
        C6752d c6752dU;
        List listO = o();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((VideoView) obj).getAutoEnterPiP()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1 || (dVar = (Ub.d) this.f9051a.get()) == null || (c6752dU = dVar.u()) == null) {
            return;
        }
        C6752d.i(c6752dU, "expo-video: Detected multiple `VideoViews` with `startsPictureInPictureAutomatically` set to `true`while entering picture in picture. To ensure no visual issues when auto-entering PiP, make sure that there is only one active `VideoView` with that property.", null, 2, null);
    }

    public static final boolean s(VideoView videoView, WeakReference it) {
        AbstractC5504s.h(it, "it");
        return !AbstractC5504s.c(it.get(), videoView);
    }

    private final boolean t(Ld.a aVar, Ld.a aVar2) {
        return (aVar.d() == aVar2.d() && aVar.f() == aVar2.f() && aVar.e() == aVar2.e()) ? false : true;
    }

    private final boolean u(Ld.a aVar, Ld.a aVar2) {
        return (AbstractC5504s.c(aVar.g(), aVar2.g()) && AbstractC5504s.c(aVar.c(), aVar2.c())) ? false : true;
    }

    private final void w() {
        C1582v c1582v;
        C1582v c1582v2 = this.f9056f;
        if (c1582v2 != null) {
            c1582v2.x();
        }
        Object obj = this.f9052b.get();
        AbstractActivityC2842v abstractActivityC2842v = obj instanceof AbstractActivityC2842v ? (AbstractActivityC2842v) obj : null;
        if (abstractActivityC2842v == null || (c1582v = this.f9056f) == null) {
            return;
        }
        abstractActivityC2842v.C().s().n(c1582v).i();
    }

    public final boolean x(VideoView videoView) {
        if (videoView.getIsInFullscreen()) {
            return false;
        }
        List listO = o();
        if (listO == null || !listO.isEmpty()) {
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                if (((VideoView) it.next()).getIsInFullscreen()) {
                    return true;
                }
            }
        }
        VideoView videoView2 = (VideoView) this.f9055e.get();
        Ld.a pipParams = videoView.getPipParams();
        boolean z10 = pipParams.d() || pipParams.h();
        boolean zC = AbstractC5504s.c(videoView, videoView2);
        if (videoView2 != null) {
            return z10 && !zC;
        }
        return !(videoView.getVideoPlayer() != null ? r6.getStaysActiveInBackground() : false);
    }

    @Override // Hd.c
    public void a(VideoView videoView, Ld.a oldPiPParams, Ld.a newPiPParams) throws C1579s {
        AbstractC5504s.h(videoView, "videoView");
        AbstractC5504s.h(oldPiPParams, "oldPiPParams");
        AbstractC5504s.h(newPiPParams, "newPiPParams");
        boolean zU = u(oldPiPParams, newPiPParams);
        if (t(oldPiPParams, newPiPParams)) {
            m();
        } else if (AbstractC5504s.c(videoView, this.f9055e.get()) && zU) {
            j(videoView);
        }
    }

    @Override // Hd.a
    public void b(VideoView videoView, Collection allVideoViews) {
        AbstractC5504s.h(videoView, "videoView");
        AbstractC5504s.h(allVideoViews, "allVideoViews");
        this.f9057g.add(new WeakReference(videoView));
        if (this.f9057g.size() == 1) {
            i();
        }
        videoView.addVideoViewListener(this);
        k();
    }

    @Override // Hd.a
    public void c(final VideoView videoView, Collection allVideoViews) throws C1579s {
        AbstractC5504s.h(videoView, "videoView");
        AbstractC5504s.h(allVideoViews, "allVideoViews");
        AbstractC2279u.Q(this.f9057g, new Function1() { // from class: Id.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(j.s(videoView, (WeakReference) obj));
            }
        });
        if (this.f9057g.isEmpty()) {
            w();
        }
        videoView.removeVideoViewListener(this);
        m();
    }

    @Override // Fd.InterfaceC1581u
    public void d() {
        r();
        VideoView videoView = (VideoView) this.f9055e.get();
        if (videoView != null) {
            p(videoView);
        }
        Iterator it = o().iterator();
        while (it.hasNext()) {
            ((VideoView) it.next()).onStartPictureInPicture(videoView);
        }
        this.f9054d = true;
    }

    @Override // Fd.InterfaceC1581u
    public void e() {
        if (this.f9054d) {
            VideoView videoView = (VideoView) this.f9055e.get();
            if (videoView != null) {
                q(videoView);
            }
            Iterator it = o().iterator();
            while (it.hasNext()) {
                ((VideoView) it.next()).onStopPictureInPicture((VideoView) this.f9055e.get());
            }
            this.f9054d = false;
        }
    }

    public final void l(VideoView videoView) throws C1579s {
        AbstractC5504s.h(videoView, "videoView");
        Activity activity = (Activity) this.f9052b.get();
        if (activity == null) {
            return;
        }
        this.f9055e = new WeakReference(videoView);
        j(videoView);
        if (Build.VERSION.SDK_INT >= 26) {
            activity.enterPictureInPictureMode(f.a().build());
        } else {
            activity.enterPictureInPictureMode();
        }
    }

    @Override // Hd.a
    public void onAppBackgrounded() throws C1579s {
        Object next;
        O oX;
        Iterator it = o().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((VideoView) next).getPipParams().h()) {
                    break;
                }
            }
        }
        VideoView videoViewN = (VideoView) next;
        if (videoViewN == null) {
            videoViewN = n(o());
        }
        this.f9055e = new WeakReference(videoViewN);
        if (videoViewN != null) {
            j(videoViewN);
        }
        Ub.d dVar = (Ub.d) this.f9051a.get();
        if (dVar == null || (oX = dVar.x()) == null) {
            return;
        }
        AbstractC1617k.d(oX, null, null, new b(null), 3, null);
    }

    @Override // Hd.a
    public void onAppForegrounded() {
        O oX;
        Ub.d dVar = (Ub.d) this.f9051a.get();
        if (dVar == null || (oX = dVar.x()) == null) {
            return;
        }
        AbstractC1617k.d(oX, null, null, new c(null), 3, null);
    }

    public final void v() {
        if (this.f9054d) {
            q(null);
        }
        this.f9057g.clear();
        w();
        this.f9059i = true;
    }
}
