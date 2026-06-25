package androidx.media3.exoplayer;

import A2.AbstractC1007e;
import A2.AbstractC1014l;
import A2.AbstractC1016n;
import A2.AbstractC1020s;
import P9.AbstractC2011u;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.C2894l;
import androidx.media3.exoplayer.g1;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import t2.AbstractC6614a;
import t2.C6620g;
import t2.InterfaceC6623j;

/* JADX INFO: renamed from: androidx.media3.exoplayer.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2894l implements g1 {

    /* JADX INFO: renamed from: a */
    private final g1 f31057a;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.l$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements g1 {

        /* JADX INFO: renamed from: a */
        private AudioManager f31058a;

        /* JADX INFO: renamed from: b */
        private AudioDeviceCallback f31059b;

        /* JADX INFO: renamed from: c */
        private C6620g f31060c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.l$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f31060c.g(Boolean.valueOf(b.this.h()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f31060c.g(Boolean.valueOf(b.this.h()));
            }
        }

        private b() {
        }

        public static /* synthetic */ void d(b bVar, Context context) {
            AudioManager audioManager;
            AbstractC6614a.e(bVar.f31060c);
            if (t2.a0.Q0(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                bVar.f31058a = audioManager;
                a aVar = bVar.new a();
                bVar.f31059b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) AbstractC6614a.e(Looper.myLooper())));
                bVar.f31060c.g(Boolean.valueOf(bVar.h()));
            }
        }

        public static /* synthetic */ void e(b bVar) {
            AudioManager audioManager = bVar.f31058a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) AbstractC6614a.e(bVar.f31059b));
            }
        }

        public boolean h() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) AbstractC6614a.i(this.f31058a)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.g1
        public void a(final g1.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC6623j interfaceC6623j) {
            C6620g c6620g = new C6620g(Boolean.TRUE, looper2, looper, interfaceC6623j, new C6620g.a() { // from class: androidx.media3.exoplayer.n
                @Override // t2.C6620g.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f31060c = c6620g;
            c6620g.e(new Runnable() { // from class: androidx.media3.exoplayer.o
                @Override // java.lang.Runnable
                public final void run() {
                    C2894l.b.d(this.f31084a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.g1
        public boolean b() {
            C6620g c6620g = this.f31060c;
            if (c6620g == null) {
                return true;
            }
            return ((Boolean) c6620g.d()).booleanValue();
        }

        @Override // androidx.media3.exoplayer.g1
        public void disable() {
            ((C6620g) AbstractC6614a.e(this.f31060c)).e(new Runnable() { // from class: androidx.media3.exoplayer.m
                @Override // java.lang.Runnable
                public final void run() {
                    C2894l.b.e(this.f31073a);
                }
            });
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.l$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements g1 {

        /* JADX INFO: renamed from: e */
        private static final RouteDiscoveryPreference f31062e;

        /* JADX INFO: renamed from: a */
        private MediaRouter2 f31063a;

        /* JADX INFO: renamed from: b */
        private MediaRouter2$RouteCallback f31064b;

        /* JADX INFO: renamed from: c */
        private MediaRouter2$ControllerCallback f31065c;

        /* JADX INFO: renamed from: d */
        private C6620g f31066d;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.l$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends MediaRouter2$RouteCallback {
            a() {
            }
        }

        /* JADX INFO: renamed from: androidx.media3.exoplayer.l$c$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b extends MediaRouter2$ControllerCallback {
            b() {
            }

            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f31066d.g(Boolean.valueOf(c.j(c.this.f31063a)));
            }
        }

        static {
            AbstractC1016n.a();
            f31062e = AbstractC1007e.a(AbstractC2011u.A(), false).build();
        }

        private c() {
        }

        public static /* synthetic */ void c(c cVar) {
            AbstractC1020s.a(AbstractC6614a.e(cVar.f31063a)).unregisterControllerCallback(A2.t.a(AbstractC6614a.e(cVar.f31065c)));
            cVar.f31065c = null;
            cVar.f31063a.unregisterRouteCallback(A2.v.a(AbstractC6614a.e(cVar.f31064b)));
        }

        public static /* synthetic */ void e(c cVar, Context context) {
            AbstractC6614a.e(cVar.f31066d);
            cVar.f31063a = MediaRouter2.getInstance(context);
            cVar.f31064b = cVar.new a();
            final C6620g c6620g = cVar.f31066d;
            Objects.requireNonNull(c6620g);
            Executor executor = new Executor() { // from class: A2.w
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    c6620g.e(runnable);
                }
            };
            cVar.f31063a.registerRouteCallback(executor, cVar.f31064b, f31062e);
            b bVar = cVar.new b();
            cVar.f31065c = bVar;
            cVar.f31063a.registerControllerCallback(executor, bVar);
            cVar.f31066d.g(Boolean.valueOf(j(cVar.f31063a)));
        }

        private static boolean i(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            return suitabilityStatus == 1 ? (i10 == 1 || i10 == 2) && z10 : suitabilityStatus == 0;
        }

        public static boolean j(MediaRouter2 mediaRouter2) {
            int transferReason = AbstractC1020s.a(AbstractC6614a.e(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (i(AbstractC1014l.a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.g1
        public void a(final g1.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC6623j interfaceC6623j) {
            C6620g c6620g = new C6620g(Boolean.TRUE, looper2, looper, interfaceC6623j, new C6620g.a() { // from class: androidx.media3.exoplayer.q
                @Override // t2.C6620g.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f31066d = c6620g;
            c6620g.e(new Runnable() { // from class: androidx.media3.exoplayer.r
                @Override // java.lang.Runnable
                public final void run() {
                    C2894l.c.e(this.f31193a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.g1
        public boolean b() {
            C6620g c6620g = this.f31066d;
            if (c6620g == null) {
                return true;
            }
            return ((Boolean) c6620g.d()).booleanValue();
        }

        @Override // androidx.media3.exoplayer.g1
        public void disable() {
            ((C6620g) AbstractC6614a.i(this.f31066d)).e(new Runnable() { // from class: androidx.media3.exoplayer.p
                @Override // java.lang.Runnable
                public final void run() {
                    C2894l.c.c(this.f31175a);
                }
            });
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    public C2894l() {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f31057a = new c();
        } else {
            this.f31057a = new b();
        }
    }

    @Override // androidx.media3.exoplayer.g1
    public void a(g1.a aVar, Context context, Looper looper, Looper looper2, InterfaceC6623j interfaceC6623j) {
        g1 g1Var = this.f31057a;
        if (g1Var != null) {
            g1Var.a(aVar, context, looper, looper2, interfaceC6623j);
        }
    }

    @Override // androidx.media3.exoplayer.g1
    public boolean b() {
        g1 g1Var = this.f31057a;
        return g1Var == null || g1Var.b();
    }

    @Override // androidx.media3.exoplayer.g1
    public void disable() {
        g1 g1Var = this.f31057a;
        if (g1Var != null) {
            g1Var.disable();
        }
    }
}
