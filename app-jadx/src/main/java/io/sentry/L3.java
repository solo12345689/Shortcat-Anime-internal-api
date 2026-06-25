package io.sentry;

import io.sentry.E1;
import io.sentry.protocol.C5253c;
import io.sentry.util.AbstractC5290c;
import io.sentry.util.C5288a;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class L3 implements InterfaceC5217j0 {

    /* JADX INFO: renamed from: b */
    private final S3 f49226b;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5114a0 f49228d;

    /* JADX INFO: renamed from: e */
    private String f49229e;

    /* JADX INFO: renamed from: g */
    private volatile TimerTask f49231g;

    /* JADX INFO: renamed from: h */
    private volatile TimerTask f49232h;

    /* JADX INFO: renamed from: i */
    private volatile Timer f49233i;

    /* JADX INFO: renamed from: n */
    private io.sentry.protocol.H f49238n;

    /* JADX INFO: renamed from: o */
    private final EnumC5242o0 f49239o;

    /* JADX INFO: renamed from: p */
    private final C5253c f49240p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC5211i f49241q;

    /* JADX INFO: renamed from: r */
    private final k4 f49242r;

    /* JADX INFO: renamed from: a */
    private final io.sentry.protocol.x f49225a = new io.sentry.protocol.x();

    /* JADX INFO: renamed from: c */
    private final List f49227c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    private c f49230f = c.f49245c;

    /* JADX INFO: renamed from: j */
    private final C5288a f49234j = new C5288a();

    /* JADX INFO: renamed from: k */
    private final C5288a f49235k = new C5288a();

    /* JADX INFO: renamed from: l */
    private final AtomicBoolean f49236l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m */
    private final AtomicBoolean f49237m = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            L3.this.S();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            L3.this.R();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: c */
        static final c f49245c = d();

        /* JADX INFO: renamed from: a */
        private final boolean f49246a;

        /* JADX INFO: renamed from: b */
        private final a4 f49247b;

        private c(boolean z10, a4 a4Var) {
            this.f49246a = z10;
            this.f49247b = a4Var;
        }

        static c c(a4 a4Var) {
            return new c(true, a4Var);
        }

        private static c d() {
            return new c(false, null);
        }
    }

    L3(i4 i4Var, InterfaceC5114a0 interfaceC5114a0, k4 k4Var, InterfaceC5211i interfaceC5211i) {
        this.f49233i = null;
        C5253c c5253c = new C5253c();
        this.f49240p = c5253c;
        io.sentry.util.w.c(i4Var, "context is required");
        io.sentry.util.w.c(interfaceC5114a0, "scopes are required");
        S3 s32 = new S3(i4Var, this, interfaceC5114a0, k4Var);
        this.f49226b = s32;
        this.f49229e = i4Var.y();
        this.f49239o = i4Var.e();
        this.f49228d = interfaceC5114a0;
        Boolean bool = Boolean.TRUE;
        interfaceC5211i = bool.equals(c()) ? interfaceC5211i : null;
        this.f49241q = interfaceC5211i;
        this.f49238n = i4Var.A();
        this.f49242r = k4Var;
        U(s32);
        io.sentry.protocol.x xVarK = K();
        if (!xVarK.equals(io.sentry.protocol.x.f51153b) && bool.equals(c())) {
            c5253c.v(new C5273s1(xVarK));
        }
        if (interfaceC5211i != null) {
            interfaceC5211i.e(this);
        }
        if (k4Var.l() == null && k4Var.k() == null) {
            return;
        }
        this.f49233i = new Timer(true);
        T();
        p();
    }

    private void C() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49234j.a();
        try {
            if (this.f49232h != null) {
                this.f49232h.cancel();
                this.f49237m.set(false);
                this.f49232h = null;
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void D() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49234j.a();
        try {
            if (this.f49231g != null) {
                this.f49231g.cancel();
                this.f49236l.set(false);
                this.f49231g = null;
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private InterfaceC5207h0 E(T3 t32, Z3 z32) {
        if (this.f49226b.isFinished()) {
            return C5188d1.u();
        }
        if (!this.f49239o.equals(t32.e())) {
            return C5188d1.u();
        }
        if (io.sentry.util.C.b(this.f49228d.h().getIgnoredSpanOrigins(), z32.a())) {
            return C5188d1.u();
        }
        Y3 y3H = t32.h();
        String strF = t32.f();
        String strC = t32.c();
        if (this.f49227c.size() >= this.f49228d.h().getMaxSpans()) {
            this.f49228d.h().getLogger().c(EnumC5215i3.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", strF, strC);
            return C5188d1.u();
        }
        io.sentry.util.w.c(y3H, "parentSpanId is required");
        io.sentry.util.w.c(strF, "operation is required");
        D();
        S3 s32 = new S3(this, this.f49228d, t32, z32, new V3() { // from class: io.sentry.H3
            @Override // io.sentry.V3
            public final void a(S3 s33) {
                L3.y(this.f49193a, s33);
            }
        });
        U(s32);
        this.f49227c.add(s32);
        InterfaceC5211i interfaceC5211i = this.f49241q;
        if (interfaceC5211i != null) {
            interfaceC5211i.b(s32);
        }
        return s32;
    }

    private InterfaceC5207h0 F(String str, String str2, AbstractC5244o2 abstractC5244o2, EnumC5242o0 enumC5242o0, Z3 z32) {
        if (this.f49226b.isFinished()) {
            return C5188d1.u();
        }
        if (!this.f49239o.equals(enumC5242o0)) {
            return C5188d1.u();
        }
        if (this.f49227c.size() < this.f49228d.h().getMaxSpans()) {
            return this.f49226b.o(str, str2, abstractC5244o2, enumC5242o0, z32);
        }
        this.f49228d.h().getLogger().c(EnumC5215i3.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return C5188d1.u();
    }

    private io.sentry.protocol.x K() {
        return !this.f49226b.q().j().equals(io.sentry.protocol.x.f51153b) ? this.f49226b.q().j() : this.f49228d.h().getContinuousProfiler().h();
    }

    private boolean P() {
        ListIterator listIterator = this.f49227c.listIterator();
        while (listIterator.hasNext()) {
            S3 s32 = (S3) listIterator.next();
            if (!s32.isFinished() && s32.r() == null) {
                return false;
            }
        }
        return true;
    }

    public void R() {
        a4 a4VarB = b();
        if (a4VarB == null) {
            a4VarB = a4.DEADLINE_EXCEEDED;
        }
        a(a4VarB, this.f49242r.l() != null, null);
        this.f49237m.set(false);
    }

    public void S() {
        a4 a4VarB = b();
        if (a4VarB == null) {
            a4VarB = a4.OK;
        }
        j(a4VarB);
        this.f49236l.set(false);
    }

    private void T() {
        Long lK = this.f49242r.k();
        if (lK != null) {
            InterfaceC5192e0 interfaceC5192e0A = this.f49234j.a();
            try {
                if (this.f49233i != null) {
                    C();
                    this.f49237m.set(true);
                    this.f49232h = new b();
                    try {
                        this.f49233i.schedule(this.f49232h, lK.longValue());
                    } catch (Throwable th2) {
                        this.f49228d.h().getLogger().b(EnumC5215i3.WARNING, "Failed to schedule finish timer", th2);
                        R();
                    }
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } catch (Throwable th3) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    private void U(InterfaceC5207h0 interfaceC5207h0) {
        io.sentry.util.thread.a threadChecker = this.f49228d.h().getThreadChecker();
        io.sentry.protocol.x xVarK = K();
        if (!xVarK.equals(io.sentry.protocol.x.f51153b) && Boolean.TRUE.equals(interfaceC5207h0.c())) {
            interfaceC5207h0.i("profiler_id", xVarK.toString());
        }
        interfaceC5207h0.i("thread.id", String.valueOf(threadChecker.c()));
        interfaceC5207h0.i("thread.name", threadChecker.b());
    }

    private void Y(C5186d c5186d) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49235k.a();
        try {
            if (c5186d.q()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f49228d.r(new G1() { // from class: io.sentry.I3
                    @Override // io.sentry.G1
                    public final void a(Y y10) {
                        atomicReference.set(y10.G());
                    }
                });
                c5186d.I(q().p(), (io.sentry.protocol.x) atomicReference.get(), this.f49228d.h(), M(), getName(), O());
                c5186d.b();
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A == null) {
                throw th2;
            }
            try {
                interfaceC5192e0A.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void v(L3 l32, Y y10, InterfaceC5217j0 interfaceC5217j0) {
        l32.getClass();
        if (interfaceC5217j0 == l32) {
            y10.B();
        }
    }

    public static /* synthetic */ void w(final L3 l32, final Y y10) {
        l32.getClass();
        y10.O(new E1.c() { // from class: io.sentry.K3
            @Override // io.sentry.E1.c
            public final void a(InterfaceC5217j0 interfaceC5217j0) {
                L3.v(this.f49218a, y10, interfaceC5217j0);
            }
        });
    }

    public static /* synthetic */ void x(L3 l32, Y y10) {
        l32.getClass();
        y10.x(l32);
    }

    public static /* synthetic */ void y(L3 l32, S3 s32) {
        InterfaceC5211i interfaceC5211i = l32.f49241q;
        if (interfaceC5211i != null) {
            interfaceC5211i.a(s32);
        }
        c cVar = l32.f49230f;
        if (l32.f49242r.l() == null) {
            if (cVar.f49246a) {
                l32.j(cVar.f49247b);
            }
        } else if (!l32.f49242r.q() || l32.P()) {
            l32.p();
        }
    }

    public static /* synthetic */ void z(L3 l32, V3 v32, AtomicReference atomicReference, S3 s32) {
        if (v32 != null) {
            l32.getClass();
            v32.a(s32);
        }
        j4 j4VarN = l32.f49242r.n();
        if (j4VarN != null) {
            j4VarN.a(l32);
        }
        InterfaceC5211i interfaceC5211i = l32.f49241q;
        if (interfaceC5211i != null) {
            atomicReference.set(interfaceC5211i.d(l32));
        }
    }

    public void G(a4 a4Var, AbstractC5244o2 abstractC5244o2, boolean z10, H h10) {
        AbstractC5244o2 abstractC5244o2R = this.f49226b.r();
        if (abstractC5244o2 == null) {
            abstractC5244o2 = abstractC5244o2R;
        }
        if (abstractC5244o2 == null) {
            abstractC5244o2 = this.f49228d.h().getDateProvider().now();
        }
        for (S3 s32 : this.f49227c) {
            if (s32.y().d()) {
                s32.s(a4Var != null ? a4Var : q().f49335g, abstractC5244o2);
            }
        }
        this.f49230f = c.c(a4Var);
        if (this.f49226b.isFinished()) {
            return;
        }
        if (!this.f49242r.q() || P()) {
            final AtomicReference atomicReference = new AtomicReference();
            final V3 v3B = this.f49226b.B();
            this.f49226b.G(new V3() { // from class: io.sentry.F3
                @Override // io.sentry.V3
                public final void a(S3 s33) {
                    L3.z(this.f49175a, v3B, atomicReference, s33);
                }
            });
            this.f49226b.s(this.f49230f.f49247b, abstractC5244o2);
            Boolean bool = Boolean.TRUE;
            C5300v1 c5300v1B = (bool.equals(c()) && bool.equals(Q())) ? this.f49228d.h().getTransactionProfiler().b(this, (List) atomicReference.get(), this.f49228d.h()) : null;
            if (this.f49228d.h().isContinuousProfilingEnabled()) {
                EnumC5278t1 profileLifecycle = this.f49228d.h().getProfileLifecycle();
                EnumC5278t1 enumC5278t1 = EnumC5278t1.TRACE;
                if (profileLifecycle == enumC5278t1 && this.f49226b.q().j().equals(io.sentry.protocol.x.f51153b)) {
                    this.f49228d.h().getContinuousProfiler().g(enumC5278t1);
                }
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.f49228d.r(new G1() { // from class: io.sentry.G3
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    L3.w(this.f49182a, y10);
                }
            });
            io.sentry.protocol.E e10 = new io.sentry.protocol.E(this);
            if (this.f49233i != null) {
                InterfaceC5192e0 interfaceC5192e0A = this.f49234j.a();
                try {
                    if (this.f49233i != null) {
                        D();
                        C();
                        this.f49233i.cancel();
                        this.f49233i = null;
                    }
                    if (interfaceC5192e0A != null) {
                        interfaceC5192e0A.close();
                    }
                } catch (Throwable th2) {
                    if (interfaceC5192e0A != null) {
                        try {
                            interfaceC5192e0A.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (z10 && this.f49227c.isEmpty() && this.f49242r.l() != null) {
                this.f49228d.h().getLogger().c(EnumC5215i3.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f49229e);
            } else {
                e10.m0().putAll(this.f49226b.w());
                this.f49228d.B(e10, h(), h10, c5300v1B);
            }
        }
    }

    public List H() {
        return this.f49227c;
    }

    public C5253c I() {
        return this.f49240p;
    }

    public Map J() {
        return this.f49226b.u();
    }

    S3 L() {
        return this.f49226b;
    }

    public h4 M() {
        return this.f49226b.A();
    }

    public List N() {
        return this.f49227c;
    }

    public io.sentry.protocol.H O() {
        return this.f49238n;
    }

    public Boolean Q() {
        return this.f49226b.F();
    }

    public void V(String str, Number number) {
        if (this.f49226b.w().containsKey(str)) {
            return;
        }
        g(str, number);
    }

    public void W(String str, Number number, F0 f02) {
        if (this.f49226b.w().containsKey(str)) {
            return;
        }
        l(str, number, f02);
    }

    InterfaceC5207h0 X(Y3 y32, String str, String str2, AbstractC5244o2 abstractC5244o2, EnumC5242o0 enumC5242o0, Z3 z32) {
        T3 t3A = q().a(str, y32, null);
        t3A.r(str2);
        t3A.s(enumC5242o0);
        z32.h(abstractC5244o2);
        return E(t3A, z32);
    }

    @Override // io.sentry.InterfaceC5217j0
    public void a(a4 a4Var, boolean z10, H h10) {
        if (isFinished()) {
            return;
        }
        AbstractC5244o2 abstractC5244o2Now = this.f49228d.h().getDateProvider().now();
        ListIterator listIteratorD = AbstractC5290c.d((CopyOnWriteArrayList) this.f49227c);
        while (listIteratorD.hasPrevious()) {
            S3 s32 = (S3) listIteratorD.previous();
            s32.G(null);
            s32.s(a4Var, abstractC5244o2Now);
        }
        G(a4Var, abstractC5244o2Now, z10, h10);
    }

    @Override // io.sentry.InterfaceC5207h0
    public a4 b() {
        return this.f49226b.b();
    }

    @Override // io.sentry.InterfaceC5207h0
    public Boolean c() {
        return this.f49226b.c();
    }

    @Override // io.sentry.InterfaceC5207h0
    public void d() {
        j(b());
    }

    @Override // io.sentry.InterfaceC5207h0
    public void e(String str) {
        if (this.f49226b.isFinished()) {
            this.f49228d.h().getLogger().c(EnumC5215i3.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.f49226b.e(str);
        }
    }

    @Override // io.sentry.InterfaceC5217j0
    public io.sentry.protocol.x f() {
        return this.f49225a;
    }

    @Override // io.sentry.InterfaceC5207h0
    public void g(String str, Number number) {
        this.f49226b.g(str, number);
    }

    @Override // io.sentry.InterfaceC5207h0
    public String getDescription() {
        return this.f49226b.getDescription();
    }

    @Override // io.sentry.InterfaceC5217j0
    public String getName() {
        return this.f49229e;
    }

    @Override // io.sentry.InterfaceC5207h0
    public f4 h() {
        C5186d c5186dB;
        if (!this.f49228d.h().isTraceSampling() || (c5186dB = q().b()) == null) {
            return null;
        }
        Y(c5186dB);
        return c5186dB.J();
    }

    @Override // io.sentry.InterfaceC5207h0
    public void i(String str, Object obj) {
        if (this.f49226b.isFinished()) {
            this.f49228d.h().getLogger().c(EnumC5215i3.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.f49226b.i(str, obj);
        }
    }

    @Override // io.sentry.InterfaceC5207h0
    public boolean isFinished() {
        return this.f49226b.isFinished();
    }

    @Override // io.sentry.InterfaceC5207h0
    public void j(a4 a4Var) {
        s(a4Var, null);
    }

    @Override // io.sentry.InterfaceC5207h0
    public InterfaceC5207h0 k(String str, String str2, AbstractC5244o2 abstractC5244o2, EnumC5242o0 enumC5242o0) {
        return o(str, str2, abstractC5244o2, enumC5242o0, new Z3());
    }

    @Override // io.sentry.InterfaceC5207h0
    public void l(String str, Number number, F0 f02) {
        this.f49226b.l(str, number, f02);
    }

    @Override // io.sentry.InterfaceC5207h0
    public InterfaceC5192e0 m() {
        this.f49228d.r(new G1() { // from class: io.sentry.J3
            @Override // io.sentry.G1
            public final void a(Y y10) {
                L3.x(this.f49204a, y10);
            }
        });
        return V0.a();
    }

    @Override // io.sentry.InterfaceC5217j0
    public InterfaceC5207h0 n() {
        ListIterator listIteratorD = AbstractC5290c.d((CopyOnWriteArrayList) this.f49227c);
        while (listIteratorD.hasPrevious()) {
            S3 s32 = (S3) listIteratorD.previous();
            if (!s32.isFinished()) {
                return s32;
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC5207h0
    public InterfaceC5207h0 o(String str, String str2, AbstractC5244o2 abstractC5244o2, EnumC5242o0 enumC5242o0, Z3 z32) {
        return F(str, str2, abstractC5244o2, enumC5242o0, z32);
    }

    @Override // io.sentry.InterfaceC5217j0
    public void p() {
        Long l10;
        InterfaceC5192e0 interfaceC5192e0A = this.f49234j.a();
        try {
            if (this.f49233i != null && (l10 = this.f49242r.l()) != null) {
                D();
                this.f49236l.set(true);
                this.f49231g = new a();
                try {
                    this.f49233i.schedule(this.f49231g, l10.longValue());
                } catch (Throwable th2) {
                    this.f49228d.h().getLogger().b(EnumC5215i3.WARNING, "Failed to schedule finish timer", th2);
                    S();
                }
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th3) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC5207h0
    public T3 q() {
        return this.f49226b.q();
    }

    @Override // io.sentry.InterfaceC5207h0
    public AbstractC5244o2 r() {
        return this.f49226b.r();
    }

    @Override // io.sentry.InterfaceC5207h0
    public void s(a4 a4Var, AbstractC5244o2 abstractC5244o2) {
        G(a4Var, abstractC5244o2, true, null);
    }

    @Override // io.sentry.InterfaceC5207h0
    public AbstractC5244o2 t() {
        return this.f49226b.t();
    }
}
