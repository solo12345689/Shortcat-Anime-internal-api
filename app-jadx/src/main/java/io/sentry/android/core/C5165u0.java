package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.A3;
import io.sentry.AbstractC5219j2;
import io.sentry.AbstractC5226l;
import io.sentry.EnumC5215i3;
import io.sentry.V2;
import io.sentry.android.core.AbstractC5156p0;
import io.sentry.protocol.C5251a;
import io.sentry.util.p;
import io.sentry.util.runtime.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: io.sentry.android.core.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C5165u0 implements io.sentry.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f50015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5131g0 f50016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f50017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Future f50018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.p f50019e = new io.sentry.util.p(new p.a() { // from class: io.sentry.android.core.r0
        @Override // io.sentry.util.p.a
        public final Object a() {
            return AbstractC5156p0.l(io.sentry.N0.e());
        }
    });

    public C5165u0(Context context, C5131g0 c5131g0, final SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        this.f50015a = (Context) io.sentry.util.w.c(AbstractC5156p0.g(context), "The application context is required.");
        this.f50016b = (C5131g0) io.sentry.util.w.c(c5131g0, "The BuildInfoProvider is required.");
        this.f50017c = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.s0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C5175z0.k(this.f50008a.f50015a, sentryAndroidOptions);
                }
            });
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().b(EnumC5215i3.WARNING, "Device info caching task rejected.", e10);
            futureSubmit = null;
        }
        this.f50018d = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    private static void f(V2 v22) {
        io.sentry.protocol.C cI;
        List listE;
        List listP0 = v22.p0();
        if (listP0 == null || listP0.size() <= 1) {
            return;
        }
        io.sentry.protocol.s sVar = (io.sentry.protocol.s) listP0.get(listP0.size() - 1);
        if (!"java.lang".equals(sVar.h()) || (cI = sVar.i()) == null || (listE = cI.e()) == null) {
            return;
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.B) it.next()).v())) {
                Collections.reverse(listP0);
                return;
            }
        }
    }

    private void h(AbstractC5219j2 abstractC5219j2) {
        String str;
        io.sentry.protocol.n nVarH = abstractC5219j2.C().h();
        Future future = this.f50018d;
        if (future != null) {
            try {
                abstractC5219j2.C().u(((C5175z0) future.get()).l());
            } catch (Throwable th2) {
                this.f50017c.getLogger().b(EnumC5215i3.ERROR, "Failed to retrieve os system", th2);
            }
        } else {
            this.f50017c.getLogger().c(EnumC5215i3.ERROR, "Failed to retrieve device info", new Object[0]);
        }
        if (nVarH != null) {
            String strG = nVarH.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            abstractC5219j2.C().l(str, nVarH);
        }
    }

    private void i(AbstractC5219j2 abstractC5219j2) {
        io.sentry.protocol.I iQ = abstractC5219j2.Q();
        if (iQ == null) {
            iQ = new io.sentry.protocol.I();
            abstractC5219j2.f0(iQ);
        }
        if (iQ.i() == null) {
            iQ.o((String) this.f50017c.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.t0
                @Override // io.sentry.util.runtime.a.InterfaceC0806a
                public final Object run() {
                    return E0.a(this.f50011a.f50015a);
                }
            }));
        }
        if (iQ.j() == null && this.f50017c.isSendDefaultPii()) {
            iQ.p("{{auto}}");
        }
    }

    private void j(AbstractC5219j2 abstractC5219j2, io.sentry.H h10) {
        C5251a c5251aD = abstractC5219j2.C().d();
        if (c5251aD == null) {
            c5251aD = new C5251a();
        }
        k(c5251aD, h10);
        o(abstractC5219j2, c5251aD);
        abstractC5219j2.C().o(c5251aD);
    }

    private void k(C5251a c5251a, io.sentry.H h10) {
        Boolean boolM;
        c5251a.o(AbstractC5156p0.i(this.f50015a));
        io.sentry.android.core.performance.i iVarM = io.sentry.android.core.performance.h.q().m(this.f50017c);
        if (iVarM.u()) {
            c5251a.p(AbstractC5226l.o(iVarM.n()));
        }
        if (io.sentry.util.l.g(h10) || c5251a.l() != null || (boolM = C5123c0.l().m()) == null) {
            return;
        }
        c5251a.r(Boolean.valueOf(!boolM.booleanValue()));
    }

    private void l(AbstractC5219j2 abstractC5219j2, boolean z10, boolean z11) {
        i(abstractC5219j2);
        m(abstractC5219j2, z10, z11);
        p(abstractC5219j2);
    }

    private void m(AbstractC5219j2 abstractC5219j2, boolean z10, boolean z11) {
        if (abstractC5219j2.C().e() == null) {
            if (this.f50018d != null) {
                try {
                    abstractC5219j2.C().q(((C5175z0) this.f50018d.get()).c(z10, z11));
                } catch (Throwable th2) {
                    this.f50017c.getLogger().b(EnumC5215i3.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                this.f50017c.getLogger().c(EnumC5215i3.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            h(abstractC5219j2);
        }
    }

    private void n(AbstractC5219j2 abstractC5219j2, String str) {
        if (abstractC5219j2.E() == null) {
            abstractC5219j2.U(str);
        }
    }

    private void o(AbstractC5219j2 abstractC5219j2, C5251a c5251a) {
        C5175z0 c5175z0;
        PackageInfo packageInfoO = AbstractC5156p0.o(this.f50015a, 4096, this.f50017c.getLogger(), this.f50016b);
        if (packageInfoO != null) {
            n(abstractC5219j2, AbstractC5156p0.q(packageInfoO, this.f50016b));
            Future future = this.f50018d;
            if (future != null) {
                try {
                    c5175z0 = (C5175z0) future.get();
                } catch (Throwable th2) {
                    this.f50017c.getLogger().b(EnumC5215i3.ERROR, "Failed to retrieve device info", th2);
                    c5175z0 = null;
                }
                AbstractC5156p0.x(packageInfoO, this.f50016b, c5175z0, c5251a);
            }
            this.f50017c.getLogger().c(EnumC5215i3.ERROR, "Failed to retrieve device info", new Object[0]);
            c5175z0 = null;
            AbstractC5156p0.x(packageInfoO, this.f50016b, c5175z0, c5251a);
        }
    }

    private void p(AbstractC5219j2 abstractC5219j2) {
        Future future = this.f50018d;
        if (future == null) {
            this.f50017c.getLogger().c(EnumC5215i3.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            AbstractC5156p0.a aVarN = ((C5175z0) future.get()).n();
            if (aVarN != null) {
                for (Map.Entry entry : aVarN.a().entrySet()) {
                    abstractC5219j2.d0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f50017c.getLogger().b(EnumC5215i3.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void q(V2 v22, io.sentry.H h10) {
        if (v22.u0() != null) {
            boolean zG = io.sentry.util.l.g(h10);
            for (io.sentry.protocol.D d10 : v22.u0()) {
                boolean zG2 = io.sentry.android.core.internal.util.l.e().g(d10);
                if (d10.o() == null) {
                    d10.r(Boolean.valueOf(zG2));
                }
                if (!zG && d10.p() == null) {
                    d10.v(Boolean.valueOf(zG2));
                }
            }
        }
    }

    private boolean r(AbstractC5219j2 abstractC5219j2, io.sentry.H h10) {
        if (io.sentry.util.l.n(h10)) {
            return true;
        }
        this.f50017c.getLogger().c(EnumC5215i3.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC5219j2.G());
        return false;
    }

    @Override // io.sentry.C
    public A3 a(A3 a32, io.sentry.H h10) {
        boolean zR = r(a32, h10);
        if (zR) {
            j(a32, h10);
        }
        l(a32, false, zR);
        return a32;
    }

    @Override // io.sentry.C
    public V2 b(V2 v22, io.sentry.H h10) {
        boolean zR = r(v22, h10);
        if (zR) {
            j(v22, h10);
            q(v22, h10);
        }
        l(v22, true, zR);
        f(v22);
        return v22;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E g(io.sentry.protocol.E e10, io.sentry.H h10) {
        boolean zR = r(e10, h10);
        if (zR) {
            j(e10, h10);
        }
        l(e10, false, zR);
        return e10;
    }
}
