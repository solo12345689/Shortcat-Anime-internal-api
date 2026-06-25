package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.E;
import androidx.work.impl.InterfaceC2955e;
import androidx.work.impl.r;
import androidx.work.impl.w;
import i4.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import n4.C5737m;
import o4.C5819D;
import o4.x;
import p4.InterfaceC5931b;
import p4.InterfaceExecutorC5930a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements InterfaceC2955e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f32816k = i.i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f32817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC5931b f32818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5819D f32819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f32820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f32821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f32822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final List f32823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Intent f32824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f32825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private w f32826j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorA;
            d dVar;
            synchronized (g.this.f32823g) {
                g gVar = g.this;
                gVar.f32824h = (Intent) gVar.f32823g.get(0);
            }
            Intent intent = g.this.f32824h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f32824h.getIntExtra("KEY_START_ID", 0);
                i iVarE = i.e();
                String str = g.f32816k;
                iVarE.a(str, "Processing command " + g.this.f32824h + ", " + intExtra);
                PowerManager.WakeLock wakeLockB = x.b(g.this.f32817a, action + " (" + intExtra + ")");
                try {
                    i.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.acquire();
                    g gVar2 = g.this;
                    gVar2.f32822f.o(gVar2.f32824h, intExtra, gVar2);
                    i.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.release();
                    executorA = g.this.f32818b.a();
                    dVar = new d(g.this);
                } catch (Throwable th2) {
                    try {
                        i iVarE2 = i.e();
                        String str2 = g.f32816k;
                        iVarE2.d(str2, "Unexpected error in onHandleIntent", th2);
                        i.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        executorA = g.this.f32818b.a();
                        dVar = new d(g.this);
                    } catch (Throwable th3) {
                        i.e().a(g.f32816k, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        g.this.f32818b.a().execute(new d(g.this));
                        throw th3;
                    }
                }
                executorA.execute(dVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f32828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f32829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f32830c;

        b(g gVar, Intent intent, int i10) {
            this.f32828a = gVar;
            this.f32829b = intent;
            this.f32830c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32828a.a(this.f32829b, this.f32830c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface c {
        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f32831a;

        d(g gVar) {
            this.f32831a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32831a.c();
        }
    }

    g(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f32823g) {
            try {
                Iterator it = this.f32823g.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void k() {
        b();
        PowerManager.WakeLock wakeLockB = x.b(this.f32817a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f32821e.w().c(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        i iVarE = i.e();
        String str = f32816k;
        iVarE.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            i.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f32823g) {
            try {
                boolean zIsEmpty = this.f32823g.isEmpty();
                this.f32823g.add(intent);
                if (zIsEmpty) {
                    k();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    void c() {
        i iVarE = i.e();
        String str = f32816k;
        iVarE.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f32823g) {
            try {
                if (this.f32824h != null) {
                    i.e().a(str, "Removing command " + this.f32824h);
                    if (!((Intent) this.f32823g.remove(0)).equals(this.f32824h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f32824h = null;
                }
                InterfaceExecutorC5930a interfaceExecutorC5930aB = this.f32818b.b();
                if (!this.f32822f.n() && this.f32823g.isEmpty() && !interfaceExecutorC5930aB.q1()) {
                    i.e().a(str, "No more commands & intents.");
                    c cVar = this.f32825i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f32823g.isEmpty()) {
                    k();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    r d() {
        return this.f32820d;
    }

    InterfaceC5931b e() {
        return this.f32818b;
    }

    @Override // androidx.work.impl.InterfaceC2955e
    public void f(C5737m c5737m, boolean z10) {
        this.f32818b.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f32817a, c5737m, z10), 0));
    }

    E g() {
        return this.f32821e;
    }

    C5819D h() {
        return this.f32819c;
    }

    void j() {
        i.e().a(f32816k, "Destroying SystemAlarmDispatcher");
        this.f32820d.l(this);
        this.f32825i = null;
    }

    void l(c cVar) {
        if (this.f32825i != null) {
            i.e().c(f32816k, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f32825i = cVar;
        }
    }

    g(Context context, r rVar, E e10) {
        Context applicationContext = context.getApplicationContext();
        this.f32817a = applicationContext;
        this.f32826j = new w();
        this.f32822f = new androidx.work.impl.background.systemalarm.b(applicationContext, this.f32826j);
        e10 = e10 == null ? E.q(context) : e10;
        this.f32821e = e10;
        this.f32819c = new C5819D(e10.o().k());
        rVar = rVar == null ? e10.s() : rVar;
        this.f32820d = rVar;
        this.f32818b = e10.w();
        rVar.g(this);
        this.f32823g = new ArrayList();
        this.f32824h = null;
    }
}
