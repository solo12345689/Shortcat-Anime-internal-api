package expo.modules.video.playbackService;

import E3.C1323b;
import E3.C1375h3;
import E3.K6;
import E3.P6;
import E3.T6;
import E3.W4;
import Fd.AbstractC1585y;
import Fd.G;
import Gf.AbstractC1617k;
import Gf.O;
import P9.AbstractC2011u;
import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.m;
import androidx.media3.exoplayer.ExoPlayer;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C6071C;
import q2.C6077I;
import q2.InterfaceC6084P;
import r4.AbstractC6254i;
import r4.AbstractC6264t;
import ub.C6752d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0003J\u0013\u0010\u0015\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u0013J\u0019\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u000eJ\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\u0003R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010HR$\u0010P\u001a\u00020.2\u0006\u0010K\u001a\u00020.8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;", "LE3/W4;", "<init>", "()V", "LE3/h3;", "session", "LTd/L;", "L", "(LE3/h3;)V", "F", "()LE3/h3;", "", "startInForegroundRequired", "E", "(LE3/h3;Z)V", "D", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "I", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "H", "O", "(LE3/h3;)Z", "showNotification", "M", "(ZLandroidx/media3/exoplayer/ExoPlayer;)V", "Lexpo/modules/video/player/VideoPlayer;", "videoPlayer", "J", "(Lexpo/modules/video/player/VideoPlayer;)V", "N", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "q", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "LE3/h3$g;", "controllerInfo", "p", "(LE3/h3$g;)LE3/h3;", "onDestroy", "Ljava/lang/ref/WeakReference;", "LUb/d;", "h", "Ljava/lang/ref/WeakReference;", "weakContext", "", "i", "Ljava/util/Map;", "mediaSessions", "LJd/c;", "j", "LJd/c;", "binder", "k", "LE3/h3;", "mostRecentInteractionSession", "l", "Z", "isForeground", "LE3/T6;", "m", "LE3/T6;", "commandSeekForward", "n", "commandSeekBackward", "LE3/b;", "o", "LE3/b;", "seekForwardButton", "seekBackwardButton", "value", "G", "()LUb/d;", "K", "(LUb/d;)V", "appContext", "a", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoVideoPlaybackService extends W4 {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private WeakReference weakContext;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map mediaSessions = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Jd.c binder = new Jd.c(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private C1375h3 mostRecentInteractionSession;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isForeground;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final T6 commandSeekForward;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final T6 commandSeekBackward;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C1323b seekForwardButton;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C1323b seekBackwardButton;

    /* JADX INFO: renamed from: expo.modules.video.playbackService.ExpoVideoPlaybackService$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Ub.d appContext, Context context, Jd.d serviceConnection) {
            AbstractC5504s.h(appContext, "appContext");
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(serviceConnection, "serviceConnection");
            Context contextB = appContext.B();
            if (contextB == null) {
                return false;
            }
            Intent intent = new Intent(context, (Class<?>) ExpoVideoPlaybackService.class);
            intent.setAction("androidx.media3.session.MediaSessionService");
            contextB.startService(intent);
            return contextB.bindService(intent, serviceConnection, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46622a;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return ExpoVideoPlaybackService.this.new b(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46622a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            ExpoVideoPlaybackService.this.stopForeground(1);
            ExpoVideoPlaybackService.this.isForeground = false;
            ExpoVideoPlaybackService.this.H();
            List listB1 = AbstractC2279u.b1(ExpoVideoPlaybackService.this.mediaSessions.values());
            ExpoVideoPlaybackService.this.mediaSessions.clear();
            Iterator it = listB1.iterator();
            while (it.hasNext()) {
                ((C1375h3) it.next()).q();
            }
            Object systemService = ExpoVideoPlaybackService.this.getSystemService("notification");
            AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.deleteNotificationChannel("PlaybackService");
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f46625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ExpoVideoPlaybackService f46626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1375h3 f46627d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, ExpoVideoPlaybackService expoVideoPlaybackService, C1375h3 c1375h3, Zd.e eVar) {
            super(2, eVar);
            this.f46625b = z10;
            this.f46626c = expoVideoPlaybackService;
            this.f46627d = c1375h3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new c(this.f46625b, this.f46626c, this.f46627d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46624a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            if (this.f46625b && this.f46626c.O(this.f46627d)) {
                this.f46626c.L(this.f46627d);
            } else {
                ExpoVideoPlaybackService expoVideoPlaybackService = this.f46626c;
                expoVideoPlaybackService.L(expoVideoPlaybackService.F());
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoPlayer f46629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ExpoVideoPlaybackService f46630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(VideoPlayer videoPlayer, ExpoVideoPlaybackService expoVideoPlaybackService, Zd.e eVar) {
            super(2, eVar);
            this.f46629b = videoPlayer;
            this.f46630c = expoVideoPlaybackService;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new d(this.f46629b, this.f46630c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46628a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            ExoPlayer player = this.f46629b.getPlayer();
            if (this.f46630c.mediaSessions.get(player) != null) {
                return L.f17438a;
            }
            C1375h3 c1375h3D = new C1375h3.b(this.f46630c, player).g("ExpoVideoPlaybackService_" + player.hashCode()).e(new Jd.e()).f(AbstractC2011u.D(this.f46630c.seekBackwardButton, this.f46630c.seekForwardButton)).d();
            AbstractC5504s.g(c1375h3D, "build(...)");
            this.f46629b.getMediaSession().q();
            this.f46629b.g3(c1375h3D);
            this.f46630c.mediaSessions.put(player, c1375h3D);
            this.f46630c.f(c1375h3D);
            this.f46630c.M(this.f46629b.getShowNowPlayingNotification(), player);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46631a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f46633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f46634d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ExoPlayer exoPlayer, boolean z10, Zd.e eVar) {
            super(2, eVar);
            this.f46633c = exoPlayer;
            this.f46634d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return ExpoVideoPlaybackService.this.new e(this.f46633c, this.f46634d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Bundle bundle;
            C1375h3 c1375h3;
            Bundle bundleL;
            AbstractC2605b.f();
            if (this.f46631a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            if (Build.VERSION.SDK_INT < 26 || (c1375h3 = (C1375h3) ExpoVideoPlaybackService.this.mediaSessions.get(this.f46633c)) == null || (bundleL = c1375h3.l()) == null || (bundle = bundleL.deepCopy()) == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("showNotification", this.f46634d);
            C1375h3 c1375h32 = (C1375h3) ExpoVideoPlaybackService.this.mediaSessions.get(this.f46633c);
            if (c1375h32 != null) {
                ExpoVideoPlaybackService expoVideoPlaybackService = ExpoVideoPlaybackService.this;
                boolean z10 = this.f46634d;
                ExoPlayer exoPlayer = this.f46633c;
                c1375h32.s(bundle);
                expoVideoPlaybackService.q(c1375h32, z10 && exoPlayer.q0());
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46635a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f46637c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ExoPlayer exoPlayer, Zd.e eVar) {
            super(2, eVar);
            this.f46637c = exoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return ExpoVideoPlaybackService.this.new f(this.f46637c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46635a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            ExpoVideoPlaybackService.this.I(this.f46637c);
            C1375h3 c1375h3 = (C1375h3) ExpoVideoPlaybackService.this.mediaSessions.remove(this.f46637c);
            if (c1375h3 != null) {
                c1375h3.q();
            }
            if (ExpoVideoPlaybackService.this.mediaSessions.isEmpty()) {
                ExpoVideoPlaybackService.this.D();
                ExpoVideoPlaybackService.this.stopSelf();
            } else {
                ExpoVideoPlaybackService expoVideoPlaybackService = ExpoVideoPlaybackService.this;
                expoVideoPlaybackService.L(expoVideoPlaybackService.F());
            }
            return L.f17438a;
        }
    }

    public ExpoVideoPlaybackService() {
        Bundle bundle = Bundle.EMPTY;
        T6 t62 = new T6("SEEK_FORWARD", bundle);
        this.commandSeekForward = t62;
        T6 t63 = new T6("SEEK_REWIND", bundle);
        this.commandSeekBackward = t63;
        C1323b c1323bA = new C1323b.C0050b().c("rewind").i(t62).f(AbstractC1585y.f6655b).a();
        AbstractC5504s.g(c1323bA, "build(...)");
        this.seekForwardButton = c1323bA;
        C1323b c1323bA2 = new C1323b.C0050b().c("forward").i(t63).f(AbstractC1585y.f6654a).a();
        AbstractC5504s.g(c1323bA2, "build(...)");
        this.seekBackwardButton = c1323bA2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        AbstractC1617k.d(G().x(), null, null, new b(null), 3, null);
    }

    private final void E(C1375h3 session, boolean startInForegroundRequired) {
        CharSequence charSequence;
        C6077I c6077i;
        if (session.j().b() == null) {
            return;
        }
        Object systemService = getSystemService("notification");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC6264t.a();
            notificationManager.createNotificationChannel(AbstractC6254i.a("PlaybackService", "PlaybackService", 2));
        }
        C6071C c6071cB = session.j().b();
        if (c6071cB == null || (c6077i = c6071cB.f56331e) == null || (charSequence = c6077i.f56518a) == null) {
            charSequence = "\u200e";
        }
        Notification notificationD = new m.e(this, "PlaybackService").K(P6.f4827h).p(charSequence).O(new K6(session)).d();
        AbstractC5504s.g(notificationD, "build(...)");
        int iHashCode = session.j().hashCode();
        if (!startInForegroundRequired) {
            notificationManager.notify(iHashCode, notificationD);
            return;
        }
        try {
            startForeground(iHashCode, notificationD);
            this.isForeground = true;
            L l10 = L.f17438a;
        } catch (Exception e10) {
            C6752d c6752dU = G().u();
            if (c6752dU != null) {
                c6752dU.b(G.b("Failed to start the expo-video foreground service", null, 2, null), e10);
                L l11 = L.f17438a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1375h3 F() {
        Object obj;
        Object next;
        List listF0 = AbstractC2279u.f0(AbstractC2279u.I0(AbstractC2279u.q(this.mostRecentInteractionSession), AbstractC2279u.b1(this.mediaSessions.values())));
        Iterator it = listF0.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C1375h3 c1375h3 = (C1375h3) next;
            if (O(c1375h3) && c1375h3.j().q0()) {
                break;
            }
        }
        C1375h3 c1375h32 = (C1375h3) next;
        if (c1375h32 != null) {
            return c1375h32;
        }
        Iterator it2 = listF0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (O((C1375h3) next2)) {
                obj = next2;
                break;
            }
        }
        return (C1375h3) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        Object systemService = getSystemService("notification");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancelAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(ExoPlayer player) {
        Object systemService = getSystemService("notification");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(player.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(C1375h3 session) {
        InterfaceC6084P interfaceC6084PJ;
        if (session != null && (interfaceC6084PJ = session.j()) != null && !interfaceC6084PJ.q0()) {
            stopForeground(2);
            this.isForeground = false;
        }
        if (!AbstractC5504s.c(this.mostRecentInteractionSession, session)) {
            H();
        }
        this.mostRecentInteractionSession = session;
        if (session != null) {
            E(session, session.j().q0());
        } else {
            stopForeground(1);
            this.isForeground = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O(C1375h3 c1375h3) {
        return c1375h3.l().getBoolean("showNotification", false);
    }

    public final Ub.d G() throws cc.e {
        WeakReference weakReference = this.weakContext;
        if (weakReference == null) {
            AbstractC5504s.u("weakContext");
            weakReference = null;
        }
        Ub.d dVar = (Ub.d) weakReference.get();
        if (dVar != null) {
            return dVar;
        }
        throw new cc.e();
    }

    public final void J(VideoPlayer videoPlayer) {
        AbstractC5504s.h(videoPlayer, "videoPlayer");
        AbstractC1617k.d(G().x(), null, null, new d(videoPlayer, this, null), 3, null);
    }

    public final void K(Ub.d value) {
        AbstractC5504s.h(value, "value");
        this.weakContext = new WeakReference(value);
    }

    public final void M(boolean showNotification, ExoPlayer player) {
        AbstractC5504s.h(player, "player");
        AbstractC1617k.d(G().x(), null, null, new e(player, showNotification, null), 3, null);
    }

    public final void N(ExoPlayer player) {
        AbstractC5504s.h(player, "player");
        AbstractC1617k.d(G().x(), null, null, new f(player, null), 3, null);
    }

    @Override // E3.W4, android.app.Service
    public IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.binder;
    }

    @Override // E3.W4, android.app.Service
    public void onDestroy() {
        D();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        D();
        stopSelf();
    }

    @Override // E3.W4
    public C1375h3 p(C1375h3.g controllerInfo) {
        AbstractC5504s.h(controllerInfo, "controllerInfo");
        return null;
    }

    @Override // E3.W4
    public void q(C1375h3 session, boolean startInForegroundRequired) {
        AbstractC5504s.h(session, "session");
        AbstractC1617k.d(G().x(), null, null, new c(startInForegroundRequired, this, session, null), 3, null);
    }
}
