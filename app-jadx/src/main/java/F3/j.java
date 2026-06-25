package F3;

import F3.b;
import F3.c;
import F3.n;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a */
    private final b f6397a;

    /* JADX INFO: renamed from: b */
    private final n.j f6398b;

    /* JADX INFO: renamed from: c */
    private final Set f6399c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        int A();

        boolean B();

        CharSequence E();

        List G();

        void H(l lVar);

        e a();

        void b(a aVar, Handler handler);

        void c(a aVar);

        void d(String str, Bundle bundle, ResultReceiver resultReceiver);

        f e();

        void f(l lVar, int i10);

        void g(int i10, int i11);

        Bundle getExtras();

        m getMetadata();

        boolean h(KeyEvent keyEvent);

        void i(int i10, int i11);

        boolean j();

        Object k();

        v p();

        String r();

        long w();

        int x();

        int y();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c implements b {

        /* JADX INFO: renamed from: a */
        protected final MediaController f6407a;

        /* JADX INFO: renamed from: b */
        final Object f6408b = new Object();

        /* JADX INFO: renamed from: c */
        private final List f6409c = new ArrayList();

        /* JADX INFO: renamed from: d */
        private final HashMap f6410d = new HashMap();

        /* JADX INFO: renamed from: e */
        final n.j f6411e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class a extends ResultReceiver {

            /* JADX INFO: renamed from: a */
            private final WeakReference f6412a;

            a(c cVar) {
                super(null);
                this.f6412a = new WeakReference(cVar);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i10, Bundle bundle) {
                c cVar = (c) this.f6412a.get();
                if (cVar == null || bundle == null) {
                    return;
                }
                synchronized (cVar.f6408b) {
                    cVar.f6411e.f(c.a.c(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER")));
                    cVar.f6411e.g(Y3.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    cVar.l();
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class b extends a.c {
            b(a aVar) {
                super(aVar);
            }

            @Override // F3.b
            public void F2(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // F3.b
            public void J1(m mVar) {
                throw new AssertionError();
            }

            @Override // F3.b
            public void L0() {
                throw new AssertionError();
            }

            @Override // F3.b
            public void c2(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // F3.b
            public void f1(u uVar) {
                throw new AssertionError();
            }

            @Override // F3.b
            public void j0(List list) {
                throw new AssertionError();
            }
        }

        c(Context context, n.j jVar) {
            this.f6411e = jVar;
            this.f6407a = new MediaController(context, jVar.e());
            if (jVar.c() == null) {
                m();
            }
        }

        private void m() {
            d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new a(this));
        }

        @Override // F3.j.b
        public int A() {
            F3.c cVarC = this.f6411e.c();
            if (cVarC == null) {
                return -1;
            }
            try {
                return cVarC.A();
            } catch (RemoteException | SecurityException e10) {
                Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e10);
                return -1;
            }
        }

        @Override // F3.j.b
        public boolean B() {
            F3.c cVarC = this.f6411e.c();
            if (cVarC == null) {
                return false;
            }
            try {
                return cVarC.B();
            } catch (RemoteException | SecurityException e10) {
                Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e10);
                return false;
            }
        }

        @Override // F3.j.b
        public CharSequence E() {
            return this.f6407a.getQueueTitle();
        }

        @Override // F3.j.b
        public List G() {
            List<MediaSession.QueueItem> queue = this.f6407a.getQueue();
            if (queue != null) {
                return n.h.b(queue);
            }
            return null;
        }

        @Override // F3.j.b
        public void H(l lVar) {
            if ((w() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", F3.d.a(lVar, MediaDescriptionCompat.CREATOR));
            d("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
        }

        @Override // F3.j.b
        public e a() {
            MediaController.PlaybackInfo playbackInfo = this.f6407a.getPlaybackInfo();
            if (playbackInfo != null) {
                return new e(playbackInfo.getPlaybackType(), F3.a.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
            }
            return null;
        }

        @Override // F3.j.b
        public final void b(a aVar, Handler handler) {
            this.f6407a.registerCallback((MediaController.Callback) AbstractC6614a.e(aVar.f6400a), handler);
            synchronized (this.f6408b) {
                F3.c cVarC = this.f6411e.c();
                if (cVarC != null) {
                    b bVar = new b(aVar);
                    this.f6410d.put(aVar, bVar);
                    aVar.f6402c = bVar;
                    try {
                        cVarC.n1(bVar);
                        aVar.m(13, null, null);
                    } catch (RemoteException | SecurityException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                } else {
                    aVar.f6402c = null;
                    this.f6409c.add(aVar);
                }
            }
        }

        @Override // F3.j.b
        public final void c(a aVar) {
            this.f6407a.unregisterCallback((MediaController.Callback) AbstractC6614a.e(aVar.f6400a));
            synchronized (this.f6408b) {
                F3.c cVarC = this.f6411e.c();
                if (cVarC != null) {
                    try {
                        b bVar = (b) this.f6410d.remove(aVar);
                        if (bVar != null) {
                            aVar.f6402c = null;
                            cVarC.M0(bVar);
                        }
                    } catch (RemoteException | SecurityException e10) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e10);
                    }
                } else {
                    this.f6409c.remove(aVar);
                }
            }
        }

        @Override // F3.j.b
        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f6407a.sendCommand(str, bundle, resultReceiver);
        }

        @Override // F3.j.b
        public f e() {
            MediaController.TransportControls transportControls = this.f6407a.getTransportControls();
            return Build.VERSION.SDK_INT >= 29 ? new C0083j(transportControls) : new i(transportControls);
        }

        @Override // F3.j.b
        public void f(l lVar, int i10) {
            if ((w() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", F3.d.a(lVar, MediaDescriptionCompat.CREATOR));
            bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i10);
            d("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
        }

        @Override // F3.j.b
        public void g(int i10, int i11) {
            this.f6407a.adjustVolume(i10, i11);
        }

        @Override // F3.j.b
        public Bundle getExtras() {
            return this.f6407a.getExtras();
        }

        @Override // F3.j.b
        public m getMetadata() {
            MediaMetadata metadata = this.f6407a.getMetadata();
            if (metadata != null) {
                return m.b(metadata);
            }
            return null;
        }

        @Override // F3.j.b
        public boolean h(KeyEvent keyEvent) {
            return this.f6407a.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // F3.j.b
        public void i(int i10, int i11) {
            this.f6407a.setVolumeTo(i10, i11);
        }

        @Override // F3.j.b
        public boolean j() {
            return this.f6411e.c() != null;
        }

        @Override // F3.j.b
        public Object k() {
            return this.f6407a;
        }

        void l() {
            F3.c cVarC = this.f6411e.c();
            if (cVarC == null) {
                return;
            }
            for (a aVar : this.f6409c) {
                b bVar = new b(aVar);
                this.f6410d.put(aVar, bVar);
                aVar.f6402c = bVar;
                try {
                    cVarC.n1(bVar);
                    aVar.m(13, null, null);
                } catch (RemoteException | SecurityException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            this.f6409c.clear();
        }

        @Override // F3.j.b
        public v p() {
            F3.c cVarC = this.f6411e.c();
            if (cVarC != null) {
                try {
                    return cVarC.p();
                } catch (RemoteException | SecurityException e10) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e10);
                }
            }
            PlaybackState playbackState = this.f6407a.getPlaybackState();
            if (playbackState != null) {
                return v.a(playbackState);
            }
            return null;
        }

        @Override // F3.j.b
        public String r() {
            return this.f6407a.getPackageName();
        }

        @Override // F3.j.b
        public long w() {
            return this.f6407a.getFlags();
        }

        @Override // F3.j.b
        public int x() {
            F3.c cVarC = this.f6411e.c();
            if (cVarC == null) {
                return -1;
            }
            try {
                return cVarC.x();
            } catch (RemoteException | SecurityException e10) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e10);
                return -1;
            }
        }

        @Override // F3.j.b
        public int y() {
            return this.f6407a.getRatingType();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d extends c {
        d(Context context, n.j jVar) {
            super(context, jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a */
        private final int f6413a;

        /* JADX INFO: renamed from: b */
        private final F3.a f6414b;

        /* JADX INFO: renamed from: c */
        private final int f6415c;

        /* JADX INFO: renamed from: d */
        private final int f6416d;

        /* JADX INFO: renamed from: e */
        private final int f6417e;

        e(int i10, F3.a aVar, int i11, int i12, int i13) {
            this.f6413a = i10;
            this.f6414b = aVar;
            this.f6415c = i11;
            this.f6416d = i12;
            this.f6417e = i13;
        }

        public F3.a a() {
            return this.f6414b;
        }

        public int b() {
            return this.f6417e;
        }

        public int c() {
            return this.f6416d;
        }

        public int d() {
            return this.f6413a;
        }

        public int e() {
            return this.f6415c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f {
        f() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d(String str, Bundle bundle);

        public abstract void e(String str, Bundle bundle);

        public abstract void f(Uri uri, Bundle bundle);

        public abstract void g();

        public abstract void h(String str, Bundle bundle);

        public abstract void i(String str, Bundle bundle);

        public abstract void j(Uri uri, Bundle bundle);

        public abstract void k();

        public abstract void l(long j10);

        public abstract void m(String str, Bundle bundle);

        public abstract void n(float f10);

        public abstract void o(int i10);

        public abstract void p(int i10);

        public abstract void q();

        public abstract void r();

        public abstract void s(long j10);

        public abstract void t();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class g extends f {

        /* JADX INFO: renamed from: a */
        protected final MediaController.TransportControls f6418a;

        g(MediaController.TransportControls transportControls) {
            this.f6418a = transportControls;
        }

        @Override // F3.j.f
        public void a() {
            this.f6418a.fastForward();
        }

        @Override // F3.j.f
        public void b() {
            this.f6418a.pause();
        }

        @Override // F3.j.f
        public void c() {
            this.f6418a.play();
        }

        @Override // F3.j.f
        public void d(String str, Bundle bundle) {
            this.f6418a.playFromMediaId(str, bundle);
        }

        @Override // F3.j.f
        public void e(String str, Bundle bundle) {
            this.f6418a.playFromSearch(str, bundle);
        }

        @Override // F3.j.f
        public void k() {
            this.f6418a.rewind();
        }

        @Override // F3.j.f
        public void l(long j10) {
            this.f6418a.seekTo(j10);
        }

        @Override // F3.j.f
        public void m(String str, Bundle bundle) {
            j.x(str, bundle);
            this.f6418a.sendCustomAction(str, bundle);
        }

        @Override // F3.j.f
        public void n(float f10) {
            if (f10 == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f10);
            m("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
        }

        @Override // F3.j.f
        public void o(int i10) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i10);
            m("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
        }

        @Override // F3.j.f
        public void p(int i10) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i10);
            m("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
        }

        @Override // F3.j.f
        public void q() {
            this.f6418a.skipToNext();
        }

        @Override // F3.j.f
        public void r() {
            this.f6418a.skipToPrevious();
        }

        @Override // F3.j.f
        public void s(long j10) {
            this.f6418a.skipToQueueItem(j10);
        }

        @Override // F3.j.f
        public void t() {
            this.f6418a.stop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class h extends g {
        h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // F3.j.f
        public void f(Uri uri, Bundle bundle) {
            this.f6418a.playFromUri(uri, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class i extends h {
        i(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // F3.j.f
        public void g() {
            this.f6418a.prepare();
        }

        @Override // F3.j.f
        public void h(String str, Bundle bundle) {
            this.f6418a.prepareFromMediaId(str, bundle);
        }

        @Override // F3.j.f
        public void i(String str, Bundle bundle) {
            this.f6418a.prepareFromSearch(str, bundle);
        }

        @Override // F3.j.f
        public void j(Uri uri, Bundle bundle) {
            this.f6418a.prepareFromUri(uri, bundle);
        }
    }

    /* JADX INFO: renamed from: F3.j$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C0083j extends i {
        C0083j(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // F3.j.g, F3.j.f
        public void n(float f10) {
            if (f10 == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            this.f6418a.setPlaybackSpeed(f10);
        }
    }

    public j(Context context, n nVar) {
        this(context, nVar.e());
    }

    static void x(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
            if (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    public void a(l lVar, int i10) {
        this.f6397a.f(lVar, i10);
    }

    public void b(int i10, int i11) {
        this.f6397a.g(i10, i11);
    }

    public boolean c(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f6397a.h(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle d() {
        return this.f6397a.getExtras();
    }

    public long e() {
        return this.f6397a.w();
    }

    public Object f() {
        return this.f6397a.k();
    }

    public m g() {
        return this.f6397a.getMetadata();
    }

    public String h() {
        return this.f6397a.r();
    }

    public e i() {
        return this.f6397a.a();
    }

    public v j() {
        return this.f6397a.p();
    }

    public List k() {
        return this.f6397a.G();
    }

    public CharSequence l() {
        return this.f6397a.E();
    }

    public int m() {
        return this.f6397a.y();
    }

    public int n() {
        return this.f6397a.x();
    }

    public int o() {
        return this.f6397a.A();
    }

    public f p() {
        return this.f6397a.e();
    }

    public boolean q() {
        return this.f6397a.B();
    }

    public boolean r() {
        return this.f6397a.j();
    }

    public void s(a aVar, Handler handler) {
        if (!this.f6399c.add(aVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        aVar.n(handler);
        this.f6397a.b(aVar, handler);
    }

    public void t(l lVar) {
        this.f6397a.H(lVar);
    }

    public void u(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        this.f6397a.d(str, bundle, resultReceiver);
    }

    public void v(int i10, int i11) {
        this.f6397a.i(i10, i11);
    }

    public void w(a aVar) {
        if (!this.f6399c.remove(aVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.f6397a.c(aVar);
        } finally {
            aVar.n(null);
        }
    }

    public j(Context context, n.j jVar) {
        this.f6399c = Collections.synchronizedSet(new HashSet());
        this.f6398b = jVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6397a = new d(context, jVar);
        } else {
            this.f6397a = new c(context, jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a */
        final MediaController.Callback f6400a = new C0082a(this);

        /* JADX INFO: renamed from: b */
        b f6401b;

        /* JADX INFO: renamed from: c */
        F3.b f6402c;

        /* JADX INFO: renamed from: F3.j$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0082a extends MediaController.Callback {

            /* JADX INFO: renamed from: a */
            private final WeakReference f6403a;

            C0082a(a aVar) {
                this.f6403a = new WeakReference(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = (a) this.f6403a.get();
                if (aVar == null || playbackInfo == null) {
                    return;
                }
                aVar.a(new e(playbackInfo.getPlaybackType(), F3.a.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                n.a(bundle);
                a aVar = (a) this.f6403a.get();
                if (aVar != null) {
                    aVar.c(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = (a) this.f6403a.get();
                if (aVar != null) {
                    aVar.d(m.b(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = (a) this.f6403a.get();
                if (aVar == null || aVar.f6402c != null) {
                    return;
                }
                aVar.e(v.a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List list) {
                a aVar = (a) this.f6403a.get();
                if (aVar != null) {
                    aVar.f(n.h.b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = (a) this.f6403a.get();
                if (aVar != null) {
                    aVar.g(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = (a) this.f6403a.get();
                if (aVar != null) {
                    aVar.i();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                n.a(bundle);
                a aVar = (a) this.f6403a.get();
                if (aVar != null) {
                    aVar.j(str, bundle);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private class b extends Handler {

            /* JADX INFO: renamed from: a */
            boolean f6404a;

            b(Looper looper) {
                super(looper);
                this.f6404a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f6404a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            n.a(data);
                            a.this.j((String) message.obj, data);
                            break;
                        case 2:
                            a.this.e((v) message.obj);
                            break;
                        case 3:
                            a.this.d((m) message.obj);
                            break;
                        case 4:
                            a.this.a((e) message.obj);
                            break;
                        case 5:
                            a.this.f((List) message.obj);
                            break;
                        case 6:
                            a.this.g((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            n.a(bundle);
                            a.this.c(bundle);
                            break;
                        case 8:
                            a.this.i();
                            break;
                        case 9:
                            a.this.h(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            a.this.b(((Boolean) message.obj).booleanValue());
                            break;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            a.this.l(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            a.this.k();
                            break;
                    }
                }
            }
        }

        public abstract void a(e eVar);

        public abstract void b(boolean z10);

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m(8, null, null);
        }

        public abstract void c(Bundle bundle);

        public abstract void d(m mVar);

        public abstract void e(v vVar);

        public abstract void f(List list);

        public abstract void g(CharSequence charSequence);

        public abstract void h(int i10);

        public abstract void i();

        public abstract void j(String str, Bundle bundle);

        public abstract void k();

        public abstract void l(int i10);

        void m(int i10, Object obj, Bundle bundle) {
            b bVar = this.f6401b;
            if (bVar != null) {
                Message messageObtainMessage = bVar.obtainMessage(i10, obj);
                if (bundle != null) {
                    messageObtainMessage.setData(bundle);
                }
                messageObtainMessage.sendToTarget();
            }
        }

        void n(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.f6401b = bVar;
                bVar.f6404a = true;
            } else {
                b bVar2 = this.f6401b;
                if (bVar2 != null) {
                    bVar2.f6404a = false;
                    bVar2.removeCallbacksAndMessages(null);
                    this.f6401b = null;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class c extends b.a {

            /* JADX INFO: renamed from: a */
            private final WeakReference f6406a;

            c(a aVar) {
                this.f6406a = new WeakReference(aVar);
            }

            @Override // F3.b
            public void D3(String str, Bundle bundle) {
                a aVar = (a) this.f6406a.get();
                if (aVar != null) {
                    aVar.m(1, str, bundle);
                }
            }

            @Override // F3.b
            public void F(int i10) {
                a aVar = (a) this.f6406a.get();
                if (aVar != null) {
                    aVar.m(9, Integer.valueOf(i10), null);
                }
            }

            @Override // F3.b
            public void K1(v vVar) {
                a aVar = (a) this.f6406a.get();
                if (aVar != null) {
                    aVar.m(2, vVar, null);
                }
            }

            @Override // F3.b
            public void e1(int i10) {
                a aVar = (a) this.f6406a.get();
                if (aVar != null) {
                    aVar.m(12, Integer.valueOf(i10), null);
                }
            }

            @Override // F3.b
            public void g0() {
                a aVar = (a) this.f6406a.get();
                if (aVar != null) {
                    aVar.m(13, null, null);
                }
            }

            @Override // F3.b
            public void s2(boolean z10) {
                a aVar = (a) this.f6406a.get();
                if (aVar != null) {
                    aVar.m(11, Boolean.valueOf(z10), null);
                }
            }

            @Override // F3.b
            public void D2(boolean z10) {
            }
        }
    }
}
