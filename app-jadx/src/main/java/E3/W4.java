package E3;

import E3.C1375h3;
import E3.C1427o;
import E3.I6;
import E3.InterfaceC1458s;
import E3.W4;
import F3.q;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.C6551a;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class W4 extends Service {

    /* JADX INFO: renamed from: c */
    private e f5020c;

    /* JADX INFO: renamed from: d */
    private C1367g3 f5021d;

    /* JADX INFO: renamed from: e */
    private C1419n f5022e;

    /* JADX INFO: renamed from: a */
    private final Object f5018a = new Object();

    /* JADX INFO: renamed from: b */
    private final Handler f5019b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    private final Map f5023f = new C6551a();

    /* JADX INFO: renamed from: g */
    private boolean f5024g = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public static boolean a(IllegalStateException illegalStateException) {
            return X4.a(illegalStateException);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class d implements C1375h3.h {
        private d() {
        }

        @Override // E3.C1375h3.h
        public void a(C1375h3 c1375h3) {
            W4.this.r(c1375h3, false);
        }

        @Override // E3.C1375h3.h
        public boolean b(C1375h3 c1375h3) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 31 || i10 >= 33 || W4.this.j().i()) {
                return true;
            }
            return W4.this.r(c1375h3, true);
        }

        /* synthetic */ d(W4 w42, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends InterfaceC1458s.a {

        /* JADX INFO: renamed from: a */
        private final WeakReference f5026a;

        /* JADX INFO: renamed from: b */
        private final Handler f5027b;

        /* JADX INFO: renamed from: c */
        private final Set f5028c = Collections.synchronizedSet(new HashSet());

        public e(W4 w42) {
            this.f5026a = new WeakReference(w42);
            this.f5027b = new Handler(w42.getApplicationContext().getMainLooper());
        }

        public static /* synthetic */ void e(e eVar, InterfaceC1443q interfaceC1443q, q.b bVar, C1371h c1371h, boolean z10) {
            eVar.f5028c.remove(interfaceC1443q);
            try {
                try {
                    W4 w42 = (W4) eVar.f5026a.get();
                    if (w42 == null) {
                        a7.a(interfaceC1443q);
                        return;
                    }
                    int i10 = c1371h.f5287a;
                    int i11 = c1371h.f5288b;
                    C1375h3.g gVar = new C1375h3.g(bVar, i10, i11, z10, new I6.a(interfaceC1443q, i11), c1371h.f5291e, c1371h.f5292f);
                    C1375h3 c1375h3P = w42.p(gVar);
                    if (c1375h3P == null) {
                        a7.a(interfaceC1443q);
                        return;
                    } else {
                        w42.f(c1375h3P);
                        c1375h3P.o(interfaceC1443q, gVar);
                        return;
                    }
                } catch (Exception e10) {
                    AbstractC6635w.j("MSessionService", "Failed to add a session to session service", e10);
                    a7.a(interfaceC1443q);
                    return;
                }
            } catch (Throwable th2) {
                a7.a(interfaceC1443q);
                throw th2;
            }
            a7.a(interfaceC1443q);
            throw th2;
        }

        public void G3() {
            this.f5026a.clear();
            this.f5027b.removeCallbacksAndMessages(null);
            Iterator it = this.f5028c.iterator();
            while (it.hasNext()) {
                a7.a((InterfaceC1443q) it.next());
            }
            this.f5028c.clear();
        }

        @Override // E3.InterfaceC1458s
        public void s3(final InterfaceC1443q interfaceC1443q, Bundle bundle) {
            if (interfaceC1443q == null || bundle == null) {
                a7.a(interfaceC1443q);
                return;
            }
            try {
                final C1371h c1371hA = C1371h.a(bundle);
                W4 w42 = (W4) this.f5026a.get();
                if (w42 == null) {
                    a7.a(interfaceC1443q);
                    return;
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = c1371hA.f5290d;
                }
                final q.b bVar = new q.b(c1371hA.f5289c, callingPid, callingUid);
                final boolean zB = F3.q.a(w42.getApplicationContext()).b(bVar);
                this.f5028c.add(interfaceC1443q);
                try {
                    this.f5027b.post(new Runnable() { // from class: E3.Y4
                        @Override // java.lang.Runnable
                        public final void run() {
                            W4.e.e(this.f5080a, interfaceC1443q, bVar, c1371hA, zB);
                        }
                    });
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e10);
                a7.a(interfaceC1443q);
            }
        }
    }

    public static /* synthetic */ void a(I3 i32, Intent intent) {
        C1375h3.g gVarF0 = i32.f0();
        if (gVarF0 == null) {
            gVarF0 = g(intent);
        }
        if (i32.B0(gVarF0, intent)) {
            return;
        }
        AbstractC6635w.b("MSessionService", "Ignored unrecognized media button intent.");
    }

    public static /* synthetic */ void c(W4 w42, C1375h3 c1375h3) {
        w42.j().f(c1375h3);
        c1375h3.r(new d());
    }

    public static /* synthetic */ void d(W4 w42, C1375h3 c1375h3) {
        w42.j().l(c1375h3);
        c1375h3.a();
    }

    private static C1375h3.g g(Intent intent) {
        ComponentName component = intent.getComponent();
        return new C1375h3.g(new q.b(component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService", -1, -1), 1008000300, 7, false, null, Bundle.EMPTY, 0);
    }

    private C1419n h() {
        if (this.f5022e == null) {
            this.f5022e = new C1419n(this);
        }
        return this.f5022e;
    }

    public c i() {
        synchronized (this.f5018a) {
        }
        return null;
    }

    public C1367g3 j() {
        return k(null);
    }

    private C1367g3 k(InterfaceC1327b3 interfaceC1327b3) {
        if (this.f5021d == null) {
            if (interfaceC1327b3 == null) {
                AbstractC6614a.j(getBaseContext(), "Accessing service context before onCreate()");
                interfaceC1327b3 = new C1427o.b(getApplicationContext()).e();
            }
            this.f5021d = new C1367g3(this, interfaceC1327b3, h());
        }
        return this.f5021d;
    }

    private void o() {
        this.f5019b.post(new Runnable() { // from class: E3.U4
            @Override // java.lang.Runnable
            public final void run() {
                this.f4985a.i();
            }
        });
    }

    public final void f(final C1375h3 c1375h3) {
        C1375h3 c1375h32;
        AbstractC6614a.f(c1375h3, "session must not be null");
        boolean z10 = true;
        AbstractC6614a.b(!c1375h3.p(), "session is already released");
        synchronized (this.f5018a) {
            c1375h32 = (C1375h3) this.f5023f.get(c1375h3.d());
            if (c1375h32 != null && c1375h32 != c1375h3) {
                z10 = false;
            }
            AbstractC6614a.b(z10, "Session ID should be unique");
            this.f5023f.put(c1375h3.d(), c1375h3);
        }
        if (c1375h32 == null) {
            t2.a0.g1(this.f5019b, new Runnable() { // from class: E3.T4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.c(this.f4967a, c1375h3);
                }
            });
        }
    }

    IBinder l() {
        return ((e) AbstractC6614a.i(this.f5020c)).asBinder();
    }

    public final List m() {
        ArrayList arrayList;
        synchronized (this.f5018a) {
            arrayList = new ArrayList(this.f5023f.values());
        }
        return arrayList;
    }

    public final boolean n(C1375h3 c1375h3) {
        boolean zContainsKey;
        synchronized (this.f5018a) {
            zContainsKey = this.f5023f.containsKey(c1375h3.d());
        }
        return zContainsKey;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action;
        C1375h3 c1375h3P;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            return l();
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (c1375h3P = p(C1375h3.g.a())) == null) {
            return null;
        }
        f(c1375h3P);
        return c1375h3P.f();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f5020c = new e(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e eVar = this.f5020c;
        if (eVar != null) {
            eVar.G3();
            this.f5020c = null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i10, int i11) {
        String strA;
        if (intent == null) {
            return 1;
        }
        C1419n c1419nH = h();
        Uri data = intent.getData();
        C1375h3 c1375h3K = data != null ? C1375h3.k(data) : null;
        if (c1419nH.e(intent)) {
            if (c1375h3K == null) {
                c1375h3K = p(C1375h3.g.a());
                if (c1375h3K == null) {
                    return 1;
                }
                f(c1375h3K);
            }
            final I3 i3E = c1375h3K.e();
            i3E.X().post(new Runnable() { // from class: E3.S4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a(i3E, intent);
                }
            });
        } else {
            if (c1375h3K == null || !c1419nH.d(intent) || (strA = c1419nH.a(intent)) == null) {
                return 1;
            }
            j().j(c1375h3K, strA, c1419nH.b(intent));
        }
        return 1;
    }

    public abstract C1375h3 p(C1375h3.g gVar);

    public abstract void q(C1375h3 c1375h3, boolean z10);

    boolean r(C1375h3 c1375h3, boolean z10) {
        try {
            q(c1375h3, j().n(z10));
            return true;
        } catch (IllegalStateException e10) {
            if (Build.VERSION.SDK_INT < 31 || !b.a(e10)) {
                throw e10;
            }
            AbstractC6635w.e("MSessionService", "Failed to start foreground", e10);
            o();
            return false;
        }
    }

    public final void s(final C1375h3 c1375h3) {
        AbstractC6614a.f(c1375h3, "session must not be null");
        synchronized (this.f5018a) {
            AbstractC6614a.b(this.f5023f.containsKey(c1375h3.d()), "session not found");
            this.f5023f.remove(c1375h3.d());
        }
        t2.a0.g1(this.f5019b, new Runnable() { // from class: E3.V4
            @Override // java.lang.Runnable
            public final void run() {
                W4.d(this.f4999a, c1375h3);
            }
        });
    }
}
