package Id;

import Fd.C1563b;
import Gf.AbstractC1617k;
import Gf.O;
import Hd.b;
import Td.AbstractC2163n;
import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import expo.modules.video.VideoView;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import q2.d0;
import q2.h0;
import r2.AbstractC6235a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements AudioManager.OnAudioFocusChangeListener, Hd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ub.d f9029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f9030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f9031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioFocusRequest f9032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioMixingMode f9033e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9034a;

        static {
            int[] iArr = new int[AudioMixingMode.values().length];
            try {
                iArr[AudioMixingMode.DUCK_OTHERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioMixingMode.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioMixingMode.DO_NOT_MIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9034a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f9036b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(VideoPlayer videoPlayer, Zd.e eVar) {
            super(2, eVar);
            this.f9036b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new b(this.f9036b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f9035a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer videoPlayer = this.f9036b;
            videoPlayer.t3(videoPlayer.K2() / 2.0f);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9037a;

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return e.this.new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f9037a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            List list = e.this.f9031c;
            e eVar = e.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eVar.n((WeakReference) it.next());
            }
            e.this.f9032d = null;
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9039a;

        d(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return e.this.new d(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f9039a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            List list = e.this.f9031c;
            e eVar = e.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eVar.n((WeakReference) it.next());
            }
            e.this.f9032d = null;
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Id.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0122e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9041a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AudioMixingMode f9043c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0122e(AudioMixingMode audioMixingMode, Zd.e eVar) {
            super(2, eVar);
            this.f9043c = audioMixingMode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return e.this.new C0122e(this.f9043c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((C0122e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f9041a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            List<WeakReference> list = e.this.f9031c;
            AudioMixingMode audioMixingMode = this.f9043c;
            e eVar = e.this;
            for (WeakReference weakReference : list) {
                if (audioMixingMode == AudioMixingMode.DO_NOT_MIX) {
                    eVar.n(weakReference);
                } else {
                    eVar.j(weakReference);
                }
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9044a;

        f(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return e.this.new f(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f9044a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            List list = e.this.f9031c;
            e eVar = e.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eVar.r((WeakReference) it.next());
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f9047b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(VideoPlayer videoPlayer, Zd.e eVar) {
            super(2, eVar);
            this.f9047b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new g(this.f9047b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((g) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f9046a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f9047b.getPlayer().pause();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f9049b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(VideoPlayer videoPlayer, Zd.e eVar) {
            super(2, eVar);
            this.f9049b = videoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new h(this.f9049b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((h) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f9048a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            VideoPlayer videoPlayer = this.f9049b;
            videoPlayer.t3(videoPlayer.getUserVolume());
            return L.f17438a;
        }
    }

    public e(Ub.d appContext) {
        AbstractC5504s.h(appContext, "appContext");
        this.f9029a = appContext;
        this.f9030b = AbstractC2163n.b(new InterfaceC5082a() { // from class: Id.d
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return e.i(this.f9028a);
            }
        });
        this.f9031c = new ArrayList();
        this.f9033e = AudioMixingMode.MIX_WITH_OTHERS;
    }

    private final void c() {
        AudioFocusRequest audioFocusRequest = this.f9032d;
        if (audioFocusRequest != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                m().abandonAudioFocusRequest(audioFocusRequest);
            } else {
                m().abandonAudioFocus(this);
            }
        }
        this.f9032d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioManager i(e eVar) throws C1563b {
        Context contextB = eVar.f9029a.B();
        Object systemService = contextB != null ? contextB.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager;
        }
        throw new C1563b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(WeakReference weakReference) {
        VideoPlayer videoPlayer = (VideoPlayer) weakReference.get();
        if (videoPlayer != null) {
            AbstractC1617k.d(this.f9029a.x(), null, null, new b(videoPlayer, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8 */
    private final AudioMixingMode k() {
        List listB1 = AbstractC2279u.b1(this.f9031c);
        ArrayList arrayList = new ArrayList();
        Iterator it = listB1.iterator();
        while (true) {
            AudioMixingMode audioMixingMode = null;
            if (!it.hasNext()) {
                break;
            }
            VideoPlayer videoPlayer = (VideoPlayer) ((WeakReference) it.next()).get();
            if (videoPlayer != null) {
                if (!videoPlayer.z2()) {
                    videoPlayer = null;
                }
                if (videoPlayer != null) {
                    audioMixingMode = videoPlayer.getAudioMixingMode();
                }
            }
            if (audioMixingMode != null) {
                arrayList.add(audioMixingMode);
            }
        }
        if (arrayList.isEmpty()) {
            return AudioMixingMode.MIX_WITH_OTHERS;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            AudioMixingMode audioMixingMode2 = (AudioMixingMode) it2.next();
            next = (AudioMixingMode) next;
            if (audioMixingMode2.getPriority() <= next.getPriority()) {
                audioMixingMode2 = null;
            }
            if (audioMixingMode2 != null) {
                next = audioMixingMode2;
            }
        }
        return (AudioMixingMode) next;
    }

    private final boolean l() {
        List listB1 = AbstractC2279u.b1(this.f9031c);
        if (listB1 != null && listB1.isEmpty()) {
            return false;
        }
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            if (o((WeakReference) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final AudioManager m() {
        return (AudioManager) this.f9030b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(WeakReference weakReference) {
        VideoPlayer videoPlayer = (VideoPlayer) weakReference.get();
        if (videoPlayer == null || videoPlayer.w2()) {
            return;
        }
        AbstractC1617k.d(this.f9029a.x(), null, null, new g(videoPlayer, null), 3, null);
    }

    private final boolean o(WeakReference weakReference) {
        VideoPlayer videoPlayer;
        return (weakReference == null || (videoPlayer = (VideoPlayer) weakReference.get()) == null || ((videoPlayer.w2() || !videoPlayer.z2() || videoPlayer.K2() <= 0.0f) && videoPlayer.getAudioMixingMode() != AudioMixingMode.DO_NOT_MIX)) ? false : true;
    }

    private final void q() {
        AudioMixingMode audioMixingModeK = k();
        if (audioMixingModeK == AudioMixingMode.MIX_WITH_OTHERS || !l()) {
            c();
            this.f9033e = audioMixingModeK;
            return;
        }
        int i10 = a.f9034a[audioMixingModeK.ordinal()] != 1 ? 1 : 3;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.f9032d;
            if (audioFocusRequest != null && audioFocusRequest.getFocusGain() == i10) {
                return;
            }
            AudioFocusRequest.Builder builderA = AbstractC6235a.a(i10);
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setUsage(1);
            builder.setContentType(3);
            builderA.setOnAudioFocusChangeListener(this);
            AudioFocusRequest audioFocusRequestBuild = builderA.setAudioAttributes(builder.build()).build();
            this.f9032d = audioFocusRequestBuild;
            m().requestAudioFocus(audioFocusRequestBuild);
        } else {
            m().requestAudioFocus(this, 3, i10);
        }
        this.f9033e = audioMixingModeK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(WeakReference weakReference) {
        VideoPlayer videoPlayer = (VideoPlayer) weakReference.get();
        if (videoPlayer == null || videoPlayer.w2()) {
            return;
        }
        AbstractC1617k.d(this.f9029a.x(), null, null, new h(videoPlayer, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(VideoPlayer videoPlayer, WeakReference it) {
        AbstractC5504s.h(it, "it");
        return AbstractC5504s.c(it.get(), videoPlayer);
    }

    private final void u() {
        if (l() || k() != this.f9033e) {
            q();
        } else {
            c();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        if (i10 == -3) {
            AbstractC1617k.d(this.f9029a.x(), null, null, new C0122e(k(), null), 3, null);
            return;
        }
        if (i10 == -2) {
            if (k() == AudioMixingMode.MIX_WITH_OTHERS) {
                return;
            }
            AbstractC1617k.d(this.f9029a.x(), null, null, new d(null), 3, null);
        } else if (i10 == -1) {
            AbstractC1617k.d(this.f9029a.x(), null, null, new c(null), 3, null);
        } else {
            if (i10 != 1) {
                return;
            }
            AbstractC1617k.d(this.f9029a.x(), null, null, new f(null), 3, null);
        }
    }

    @Override // Hd.b
    public void onAudioMixingModeChanged(VideoPlayer player, AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2) {
        AbstractC5504s.h(player, "player");
        AbstractC5504s.h(audioMixingMode, "audioMixingMode");
        q();
        b.a.a(this, player, audioMixingMode, audioMixingMode2);
    }

    @Override // Hd.b
    public void onIsPlayingChanged(VideoPlayer player, boolean z10, Boolean bool) {
        AbstractC5504s.h(player, "player");
        if (!z10 && !l()) {
            c();
        } else if (z10 && l()) {
            q();
        }
    }

    @Override // Hd.b
    public void onMutedChanged(VideoPlayer player, boolean z10, Boolean bool) {
        AbstractC5504s.h(player, "player");
        u();
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
    public void onVolumeChanged(VideoPlayer player, float f10, Float f11) {
        AbstractC5504s.h(player, "player");
        u();
    }

    public final void p(VideoPlayer player) {
        Object next;
        AbstractC5504s.h(player, "player");
        Iterator it = this.f9031c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC5504s.c(((WeakReference) next).get(), player)) {
                    break;
                }
            }
        }
        if (((WeakReference) next) == null) {
            this.f9031c.add(new WeakReference(player));
        }
        player.a2(this);
        u();
    }

    public final void s(final VideoPlayer player) {
        AbstractC5504s.h(player, "player");
        player.V2(this);
        AbstractC2279u.K(this.f9031c, new Function1() { // from class: Id.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e.t(player, (WeakReference) obj));
            }
        });
        u();
    }
}
