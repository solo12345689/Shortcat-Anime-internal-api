package io.sentry;

import io.sentry.protocol.C5254d;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class D0 implements C, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f49090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E3 f49091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W2 f49092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile K f49093d = null;

    public D0(C5322z3 c5322z3) {
        C5322z3 c5322z32 = (C5322z3) io.sentry.util.w.c(c5322z3, "The SentryOptions is required.");
        this.f49090a = c5322z32;
        D3 d32 = new D3(c5322z32);
        this.f49092c = new W2(d32);
        this.f49091b = new E3(d32);
    }

    private void C(V2 v22) {
        Map mapA = this.f49090a.getModulesLoader().a();
        if (mapA == null) {
            return;
        }
        Map mapT0 = v22.t0();
        if (mapT0 == null) {
            v22.E0(mapA);
        } else {
            mapT0.putAll(mapA);
        }
    }

    private void D(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.I() == null) {
            abstractC5219j2.Y("java");
        }
    }

    private void E(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.J() == null) {
            abstractC5219j2.Z(this.f49090a.getRelease());
        }
    }

    private void H(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.L() == null) {
            abstractC5219j2.b0(this.f49090a.getSdkVersion());
        }
    }

    private void J(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.M() == null) {
            abstractC5219j2.c0(this.f49090a.getServerName());
        }
        if (this.f49090a.isAttachServerName() && abstractC5219j2.M() == null) {
            h();
            if (this.f49093d != null) {
                abstractC5219j2.c0(this.f49093d.d());
            }
        }
    }

    private void O(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.N() == null) {
            abstractC5219j2.e0(new HashMap(this.f49090a.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f49090a.getTags().entrySet()) {
            if (!abstractC5219j2.N().containsKey(entry.getKey())) {
                abstractC5219j2.d0(entry.getKey(), entry.getValue());
            }
        }
    }

    private void S(V2 v22, H h10) {
        boolean zF;
        if (v22.u0() == null) {
            List<io.sentry.protocol.s> listP0 = v22.p0();
            ArrayList arrayList = null;
            if (listP0 != null && !listP0.isEmpty()) {
                for (io.sentry.protocol.s sVar : listP0) {
                    if (sVar.g() != null && sVar.j() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(sVar.j());
                    }
                }
            }
            if (this.f49090a.isAttachThreads() || io.sentry.util.l.f(h10, io.sentry.hints.a.class)) {
                Object objE = io.sentry.util.l.e(h10);
                boolean zIsAttachStacktrace = this.f49090a.isAttachStacktrace();
                if (objE instanceof io.sentry.hints.a) {
                    zF = ((io.sentry.hints.a) objE).f();
                    zIsAttachStacktrace = true;
                } else {
                    zF = false;
                }
                v22.F0(this.f49091b.b(arrayList, zF, zIsAttachStacktrace));
                return;
            }
            if (this.f49090a.isAttachStacktrace()) {
                if ((listP0 == null || listP0.isEmpty()) && !j(h10)) {
                    v22.F0(this.f49091b.a(this.f49090a.isAttachStacktrace()));
                }
            }
        }
    }

    private boolean Y(AbstractC5219j2 abstractC5219j2, H h10) {
        if (io.sentry.util.l.n(h10)) {
            return true;
        }
        this.f49090a.getLogger().c(EnumC5215i3.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC5219j2.G());
        return false;
    }

    private void h() {
        if (this.f49093d == null) {
            this.f49093d = K.e();
        }
    }

    private boolean j(H h10) {
        return io.sentry.util.l.f(h10, io.sentry.hints.e.class);
    }

    private void k(AbstractC5219j2 abstractC5219j2) {
        io.sentry.protocol.I iQ = abstractC5219j2.Q();
        if (iQ == null) {
            iQ = new io.sentry.protocol.I();
            abstractC5219j2.f0(iQ);
        }
        if (iQ.j() == null && this.f49090a.isSendDefaultPii()) {
            iQ.p("{{auto}}");
        }
    }

    private void l(AbstractC5219j2 abstractC5219j2) {
        E(abstractC5219j2);
        w(abstractC5219j2);
        J(abstractC5219j2);
        q(abstractC5219j2);
        H(abstractC5219j2);
        O(abstractC5219j2);
        k(abstractC5219j2);
    }

    private void m(AbstractC5219j2 abstractC5219j2) {
        D(abstractC5219j2);
    }

    private void o(AbstractC5219j2 abstractC5219j2) {
        C5254d c5254dC = C5254d.c(abstractC5219j2.D(), this.f49090a);
        if (c5254dC != null) {
            abstractC5219j2.T(c5254dC);
        }
    }

    private void q(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.E() == null) {
            abstractC5219j2.U(this.f49090a.getDist());
        }
    }

    private void w(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.F() == null) {
            abstractC5219j2.V(this.f49090a.getEnvironment());
        }
    }

    private void z(V2 v22) {
        Throwable thP = v22.P();
        if (thP != null) {
            v22.A0(this.f49092c.d(thP));
        }
    }

    @Override // io.sentry.C
    public A3 a(A3 a32, H h10) {
        m(a32);
        if (Y(a32, h10)) {
            l(a32);
            io.sentry.protocol.r rVarO = this.f49090a.getSessionReplay().o();
            if (rVarO != null) {
                a32.b0(rVarO);
            }
        }
        return a32;
    }

    @Override // io.sentry.C
    public V2 b(V2 v22, H h10) {
        m(v22);
        z(v22);
        o(v22);
        C(v22);
        if (Y(v22, h10)) {
            l(v22);
            S(v22, h10);
        }
        return v22;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f49093d != null) {
            this.f49093d.c();
        }
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E g(io.sentry.protocol.E e10, H h10) {
        m(e10);
        o(e10);
        if (Y(e10, h10)) {
            l(e10);
        }
        return e10;
    }
}
