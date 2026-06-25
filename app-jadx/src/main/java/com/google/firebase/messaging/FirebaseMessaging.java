package com.google.firebase.messaging;

import N8.C1972a;
import R8.AbstractC2115p;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Z;
import com.google.firebase.messaging.e0;
import ja.C5356a;
import ja.InterfaceC5357b;
import ja.InterfaceC5359d;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import la.InterfaceC5583a;
import ma.InterfaceC5655b;
import n9.InterfaceC5762f;
import n9.InterfaceC5764h;
import na.InterfaceC5769e;
import p8.InterfaceC5944i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: m */
    private static e0 f43310m;

    /* JADX INFO: renamed from: o */
    static ScheduledExecutorService f43312o;

    /* JADX INFO: renamed from: a */
    private final X9.e f43313a;

    /* JADX INFO: renamed from: b */
    private final Context f43314b;

    /* JADX INFO: renamed from: c */
    private final H f43315c;

    /* JADX INFO: renamed from: d */
    private final Z f43316d;

    /* JADX INFO: renamed from: e */
    private final a f43317e;

    /* JADX INFO: renamed from: f */
    private final Executor f43318f;

    /* JADX INFO: renamed from: g */
    private final Executor f43319g;

    /* JADX INFO: renamed from: h */
    private final n9.i f43320h;

    /* JADX INFO: renamed from: i */
    private final M f43321i;

    /* JADX INFO: renamed from: j */
    private boolean f43322j;

    /* JADX INFO: renamed from: k */
    private final Application.ActivityLifecycleCallbacks f43323k;

    /* JADX INFO: renamed from: l */
    private static final long f43309l = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: n */
    static InterfaceC5655b f43311n = new InterfaceC5655b() { // from class: com.google.firebase.messaging.r
        @Override // ma.InterfaceC5655b
        public final Object get() {
            return FirebaseMessaging.f();
        }
    };

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5359d f43324a;

        /* JADX INFO: renamed from: b */
        private boolean f43325b;

        /* JADX INFO: renamed from: c */
        private InterfaceC5357b f43326c;

        /* JADX INFO: renamed from: d */
        private Boolean f43327d;

        a(InterfaceC5359d interfaceC5359d) {
            this.f43324a = interfaceC5359d;
        }

        public static /* synthetic */ void a(a aVar, C5356a c5356a) {
            if (aVar.c()) {
                FirebaseMessaging.this.M();
            }
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextL = FirebaseMessaging.this.f43313a.l();
            SharedPreferences sharedPreferences = contextL.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextL.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextL.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f43325b) {
                    return;
                }
                Boolean boolD = d();
                this.f43327d = boolD;
                if (boolD == null) {
                    InterfaceC5357b interfaceC5357b = new InterfaceC5357b() { // from class: com.google.firebase.messaging.E
                        @Override // ja.InterfaceC5357b
                        public final void a(C5356a c5356a) {
                            FirebaseMessaging.a.a(this.f43307a, c5356a);
                        }
                    };
                    this.f43326c = interfaceC5357b;
                    this.f43324a.d(X9.b.class, interfaceC5357b);
                }
                this.f43325b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f43327d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f43313a.w();
        }

        synchronized void e(boolean z10) {
            try {
                b();
                InterfaceC5357b interfaceC5357b = this.f43326c;
                if (interfaceC5357b != null) {
                    this.f43324a.c(X9.b.class, interfaceC5357b);
                    this.f43326c = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.f43313a.l().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    FirebaseMessaging.this.M();
                }
                this.f43327d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    FirebaseMessaging(X9.e eVar, InterfaceC5583a interfaceC5583a, InterfaceC5655b interfaceC5655b, InterfaceC5655b interfaceC5655b2, InterfaceC5769e interfaceC5769e, InterfaceC5655b interfaceC5655b3, InterfaceC5359d interfaceC5359d) {
        this(eVar, interfaceC5583a, interfaceC5655b, interfaceC5655b2, interfaceC5769e, interfaceC5655b3, interfaceC5359d, new M(eVar.l()));
    }

    public void A() {
        T.c(this.f43314b);
        V.f(this.f43314b, this.f43315c, K());
        if (K()) {
            z();
        }
    }

    private void B(String str) {
        if ("[DEFAULT]".equals(this.f43313a.p())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f43313a.p());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C3976n(this.f43314b).g(intent);
        }
    }

    private boolean K() {
        T.c(this.f43314b);
        if (!T.d(this.f43314b)) {
            return false;
        }
        if (this.f43313a.j(Y9.a.class) != null) {
            return true;
        }
        return L.a() && f43311n != null;
    }

    private synchronized void L() {
        if (!this.f43322j) {
            O(0L);
        }
    }

    public void M() {
        if (P(x())) {
            L();
        }
    }

    public static /* synthetic */ n9.i b(FirebaseMessaging firebaseMessaging, String str, e0.a aVar, String str2) {
        u(firebaseMessaging.f43314b).g(firebaseMessaging.v(), str, str2, firebaseMessaging.f43321i.a());
        if (aVar == null || !str2.equals(aVar.f43433a)) {
            firebaseMessaging.B(str2);
        }
        return n9.l.f(str2);
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.C()) {
            firebaseMessaging.M();
        }
    }

    public static /* synthetic */ void d(FirebaseMessaging firebaseMessaging, n9.j jVar) {
        firebaseMessaging.getClass();
        try {
            jVar.c(firebaseMessaging.o());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    public static /* synthetic */ InterfaceC5944i f() {
        return null;
    }

    static synchronized FirebaseMessaging getInstance(X9.e eVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) eVar.j(FirebaseMessaging.class);
        AbstractC2115p.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static /* synthetic */ void h(FirebaseMessaging firebaseMessaging, C1972a c1972a) {
        firebaseMessaging.getClass();
        if (c1972a != null) {
            L.y(c1972a.c());
            firebaseMessaging.z();
        }
    }

    public static /* synthetic */ void j(FirebaseMessaging firebaseMessaging, j0 j0Var) {
        if (firebaseMessaging.C()) {
            j0Var.p();
        }
    }

    public static /* synthetic */ void l(FirebaseMessaging firebaseMessaging, n9.j jVar) {
        firebaseMessaging.getClass();
        try {
            n9.l.a(firebaseMessaging.f43315c.c());
            u(firebaseMessaging.f43314b).d(firebaseMessaging.v(), M.c(firebaseMessaging.f43313a));
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    public static synchronized FirebaseMessaging t() {
        return getInstance(X9.e.n());
    }

    private static synchronized e0 u(Context context) {
        try {
            if (f43310m == null) {
                f43310m = new e0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f43310m;
    }

    private String v() {
        return "[DEFAULT]".equals(this.f43313a.p()) ? "" : this.f43313a.r();
    }

    public static InterfaceC5944i y() {
        return (InterfaceC5944i) f43311n.get();
    }

    private void z() {
        this.f43315c.f().f(this.f43318f, new InterfaceC5762f() { // from class: com.google.firebase.messaging.D
            @Override // n9.InterfaceC5762f
            public final void onSuccess(Object obj) {
                FirebaseMessaging.h(this.f43306a, (C1972a) obj);
            }
        });
    }

    public boolean C() {
        return this.f43317e.c();
    }

    boolean D() {
        return this.f43321i.g();
    }

    public boolean E() {
        return T.d(this.f43314b);
    }

    public void F(W w10) {
        if (TextUtils.isEmpty(w10.y())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f43314b, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        w10.A(intent);
        this.f43314b.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void G(boolean z10) {
        this.f43317e.e(z10);
    }

    public void H(boolean z10) {
        L.B(z10);
        V.f(this.f43314b, this.f43315c, K());
    }

    public n9.i I(boolean z10) {
        return T.e(this.f43318f, this.f43314b, z10).f(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5762f() { // from class: com.google.firebase.messaging.v
            @Override // n9.InterfaceC5762f
            public final void onSuccess(Object obj) {
                FirebaseMessaging firebaseMessaging = this.f43523a;
                V.f(firebaseMessaging.f43314b, firebaseMessaging.f43315c, firebaseMessaging.K());
            }
        });
    }

    synchronized void J(boolean z10) {
        this.f43322j = z10;
    }

    public n9.i N(final String str) {
        return this.f43320h.q(new InterfaceC5764h() { // from class: com.google.firebase.messaging.C
            @Override // n9.InterfaceC5764h
            public final n9.i a(Object obj) {
                return ((j0) obj).q(str);
            }
        });
    }

    synchronized void O(long j10) {
        r(new f0(this, Math.min(Math.max(30L, 2 * j10), f43309l)), j10);
        this.f43322j = true;
    }

    boolean P(e0.a aVar) {
        return aVar == null || aVar.b(this.f43321i.a());
    }

    public n9.i Q(final String str) {
        return this.f43320h.q(new InterfaceC5764h() { // from class: com.google.firebase.messaging.s
            @Override // n9.InterfaceC5764h
            public final n9.i a(Object obj) {
                return ((j0) obj).t(str);
            }
        });
    }

    String o() throws IOException {
        final e0.a aVarX = x();
        if (!P(aVarX)) {
            return aVarX.f43433a;
        }
        final String strC = M.c(this.f43313a);
        try {
            return (String) n9.l.a(this.f43316d.b(strC, new Z.a() { // from class: com.google.firebase.messaging.t
                @Override // com.google.firebase.messaging.Z.a
                public final n9.i start() {
                    FirebaseMessaging firebaseMessaging = this.f43517a;
                    return firebaseMessaging.f43315c.g().p(firebaseMessaging.f43319g, new InterfaceC5764h() { // from class: com.google.firebase.messaging.u
                        @Override // n9.InterfaceC5764h
                        public final n9.i a(Object obj) {
                            return FirebaseMessaging.b(firebaseMessaging, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public n9.i p() {
        if (x() == null) {
            return n9.l.f(null);
        }
        final n9.j jVar = new n9.j();
        AbstractC3977o.e().execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.l(this.f43526a, jVar);
            }
        });
        return jVar.a();
    }

    public boolean q() {
        return L.a();
    }

    void r(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f43312o == null) {
                    f43312o = new ScheduledThreadPoolExecutor(1, new W8.a("TAG"));
                }
                f43312o.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    Context s() {
        return this.f43314b;
    }

    public n9.i w() {
        final n9.j jVar = new n9.j();
        this.f43318f.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.d(this.f43524a, jVar);
            }
        });
        return jVar.a();
    }

    e0.a x() {
        return u(this.f43314b).e(v(), M.c(this.f43313a));
    }

    FirebaseMessaging(X9.e eVar, InterfaceC5583a interfaceC5583a, InterfaceC5655b interfaceC5655b, InterfaceC5655b interfaceC5655b2, InterfaceC5769e interfaceC5769e, InterfaceC5655b interfaceC5655b3, InterfaceC5359d interfaceC5359d, M m10) {
        this(eVar, interfaceC5583a, interfaceC5655b3, interfaceC5359d, m10, new H(eVar, m10, interfaceC5655b, interfaceC5655b2, interfaceC5769e), AbstractC3977o.f(), AbstractC3977o.c(), AbstractC3977o.b());
    }

    FirebaseMessaging(X9.e eVar, InterfaceC5583a interfaceC5583a, InterfaceC5655b interfaceC5655b, InterfaceC5359d interfaceC5359d, M m10, H h10, Executor executor, Executor executor2, Executor executor3) {
        this.f43322j = false;
        f43311n = interfaceC5655b;
        this.f43313a = eVar;
        this.f43317e = new a(interfaceC5359d);
        Context contextL = eVar.l();
        this.f43314b = contextL;
        C3979q c3979q = new C3979q();
        this.f43323k = c3979q;
        this.f43321i = m10;
        this.f43315c = h10;
        this.f43316d = new Z(executor);
        this.f43318f = executor2;
        this.f43319g = executor3;
        Context contextL2 = eVar.l();
        if (contextL2 instanceof Application) {
            ((Application) contextL2).registerActivityLifecycleCallbacks(c3979q);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextL2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC5583a != null) {
            interfaceC5583a.a(new InterfaceC5583a.InterfaceC0821a() { // from class: com.google.firebase.messaging.y
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.z
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f43529a);
            }
        });
        n9.i iVarF = j0.f(this, m10, h10, contextL, AbstractC3977o.g());
        this.f43320h = iVarF;
        iVarF.f(executor2, new InterfaceC5762f() { // from class: com.google.firebase.messaging.A
            @Override // n9.InterfaceC5762f
            public final void onSuccess(Object obj) {
                FirebaseMessaging.j(this.f43303a, (j0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f43304a.A();
            }
        });
    }
}
