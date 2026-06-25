package E3;

import E3.A;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q2.InterfaceC6084P;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: renamed from: E3.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1367g3 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W4 f5254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1319a3 f5255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.app.q f5256c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Intent f5259f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC1327b3 f5261h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5263j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f5257d = t2.a0.B(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f5258e = new Executor() { // from class: E3.c3
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            t2.a0.g1(this.f5175a.f5257d, runnable);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f5260g = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5262i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5264k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5265l = HTTPTimeoutManager.TIMEOUT_RESET_INTERVAL_MS;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f5266m = 3;

    /* JADX INFO: renamed from: E3.g3$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.common.util.concurrent.p f5269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5271c;

        public b(com.google.common.util.concurrent.p pVar) {
            this.f5269a = pVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3.g3$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class c implements A.c, InterfaceC6084P.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final W4 f5272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1375h3 f5273b;

        public c(W4 w42, C1375h3 c1375h3) {
            this.f5272a = w42;
            this.f5273b = c1375h3;
        }

        @Override // E3.A.c
        public void G(A a10, List list) {
            this.f5272a.r(this.f5273b, false);
        }

        @Override // q2.InterfaceC6084P.d
        public void X(InterfaceC6084P interfaceC6084P, InterfaceC6084P.c cVar) {
            if (cVar.a(4, 5, 14, 0)) {
                this.f5272a.r(this.f5273b, false);
            }
        }

        @Override // E3.A.c
        public void i0(A a10, U6 u62) {
            this.f5272a.r(this.f5273b, false);
        }

        @Override // E3.A.c
        public void o0(A a10) {
            if (this.f5272a.n(this.f5273b)) {
                this.f5272a.s(this.f5273b);
            }
            this.f5272a.r(this.f5273b, false);
        }

        @Override // E3.A.c
        public com.google.common.util.concurrent.p q0(A a10, T6 t62, Bundle bundle) {
            int i10;
            if (t62.f4975b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
                C1367g3.this.k(this.f5273b);
                i10 = 0;
            } else {
                i10 = -6;
            }
            return com.google.common.util.concurrent.j.d(new X6(i10));
        }

        public void u0(boolean z10) {
            if (z10) {
                this.f5272a.r(this.f5273b, false);
            }
        }
    }

    public C1367g3(W4 w42, InterfaceC1327b3 interfaceC1327b3, InterfaceC1319a3 interfaceC1319a3) {
        this.f5254a = w42;
        this.f5261h = interfaceC1327b3;
        this.f5255b = interfaceC1319a3;
        this.f5256c = androidx.core.app.q.i(w42);
        this.f5259f = new Intent(w42, w42.getClass());
    }

    public static /* synthetic */ void b(final C1367g3 c1367g3, C1375h3 c1375h3, final String str, final Bundle bundle, final A a10) {
        if (c1367g3.f5261h.a(c1375h3, str, bundle)) {
            return;
        }
        c1367g3.f5258e.execute(new Runnable() { // from class: E3.f3
            @Override // java.lang.Runnable
            public final void run() {
                this.f5227a.m(a10, str, bundle);
            }
        });
    }

    public static /* synthetic */ void d(C1367g3 c1367g3, com.google.common.util.concurrent.p pVar, c cVar, C1375h3 c1375h3) {
        c1367g3.getClass();
        try {
            A a10 = (A) pVar.get(0L, TimeUnit.MILLISECONDS);
            cVar.u0(c1367g3.o(c1375h3));
            a10.a0(cVar);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
            c1367g3.f5254a.s(c1375h3);
        }
    }

    private A g(C1375h3 c1375h3) {
        b bVar = (b) this.f5260g.get(c1375h3);
        if (bVar == null || !bVar.f5269a.isDone()) {
            return null;
        }
        try {
            return (A) com.google.common.util.concurrent.j.b(bVar.f5269a);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private boolean h(boolean z10) {
        List listM = this.f5254a.m();
        for (int i10 = 0; i10 < listM.size(); i10++) {
            A aG = g((C1375h3) listM.get(i10));
            if (aG != null && ((aG.q0() || z10) && (aG.p() == 3 || aG.p() == 2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(C1375h3 c1375h3) {
        b bVar = (b) this.f5260g.get(c1375h3);
        if (bVar != null) {
            bVar.f5270b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(A a10, String str, Bundle bundle) {
        T6 t62;
        P9.X it = a10.c1().f4988a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t62 = null;
                break;
            }
            t62 = (T6) it.next();
            if (t62.f4974a == 0 && t62.f4975b.equals(str)) {
                break;
            }
        }
        if (t62 == null || !a10.c1().c(t62)) {
            return;
        }
        com.google.common.util.concurrent.j.a(a10.l1(new T6(str, bundle), Bundle.EMPTY), new a(str), com.google.common.util.concurrent.s.a());
    }

    private boolean o(C1375h3 c1375h3) {
        A aG = g(c1375h3);
        if (aG == null || aG.h0().u()) {
            return false;
        }
        b bVar = (b) AbstractC6614a.e((b) this.f5260g.get(c1375h3));
        if (aG.p() != 1) {
            bVar.f5270b = false;
            bVar.f5271c = true;
            return true;
        }
        int i10 = this.f5266m;
        if (i10 == 1) {
            return !bVar.f5270b;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return !bVar.f5270b && bVar.f5271c;
        }
        throw new IllegalStateException();
    }

    public void f(final C1375h3 c1375h3) {
        if (this.f5260g.containsKey(c1375h3)) {
            return;
        }
        final c cVar = new c(this.f5254a, c1375h3);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
        final com.google.common.util.concurrent.p pVarB = new A.a(this.f5254a, c1375h3.m()).d(bundle).e(cVar).c(Looper.getMainLooper()).b();
        this.f5260g.put(c1375h3, new b(pVarB));
        pVarB.k(new Runnable() { // from class: E3.e3
            @Override // java.lang.Runnable
            public final void run() {
                C1367g3.d(this.f5208a, pVarB, cVar, c1375h3);
            }
        }, this.f5258e);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        List listM = this.f5254a.m();
        for (int i10 = 0; i10 < listM.size(); i10++) {
            this.f5254a.r((C1375h3) listM.get(i10), false);
        }
        return true;
    }

    public boolean i() {
        return this.f5262i;
    }

    public void j(final C1375h3 c1375h3, final String str, final Bundle bundle) {
        final A aG = g(c1375h3);
        if (aG == null) {
            return;
        }
        t2.a0.g1(new Handler(c1375h3.j().m()), new Runnable() { // from class: E3.d3
            @Override // java.lang.Runnable
            public final void run() {
                C1367g3.b(this.f5188a, c1375h3, str, bundle, aG);
            }
        });
    }

    public void l(C1375h3 c1375h3) {
        b bVar = (b) this.f5260g.remove(c1375h3);
        if (bVar != null) {
            A.j1(bVar.f5269a);
        }
    }

    boolean n(boolean z10) {
        boolean zH = h(z10);
        boolean z11 = this.f5264k && this.f5265l > 0;
        if (this.f5263j && !zH && z11) {
            this.f5257d.sendEmptyMessageDelayed(1, this.f5265l);
        } else if (zH) {
            this.f5257d.removeMessages(1);
        }
        this.f5263j = zH;
        return zH || this.f5257d.hasMessages(1);
    }

    /* JADX INFO: renamed from: E3.g3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5267a;

        a(String str) {
            this.f5267a = str;
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
            AbstractC6635w.j("MediaNtfMng", "custom command " + this.f5267a + " produced an error: " + th2.getMessage(), th2);
        }

        @Override // com.google.common.util.concurrent.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(X6 x62) {
        }
    }
}
