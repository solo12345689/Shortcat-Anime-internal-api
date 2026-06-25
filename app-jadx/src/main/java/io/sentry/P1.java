package io.sentry;

import io.sentry.E1;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class P1 implements InterfaceC5114a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y f49279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y f49280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y f49281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P1 f49282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f49283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5211i f49284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5206h f49285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.logger.b f49286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.sentry.metrics.b f49287i;

    public P1(Y y10, Y y11, Y y12, String str) {
        this(y10, y11, y12, null, str);
    }

    private void F(V2 v22) {
        K().L(v22);
    }

    private Y G(Y y10, G1 g12) {
        if (g12 != null) {
            try {
                Y yM962clone = y10.m962clone();
                g12.a(yM962clone);
                return yM962clone;
            } catch (Throwable th2) {
                h().getLogger().b(EnumC5215i3.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return y10;
    }

    private io.sentry.protocol.x H(V2 v22, H h10, G1 g12) {
        io.sentry.protocol.x xVarJ = io.sentry.protocol.x.f51153b;
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return xVarJ;
        }
        if (v22 == null) {
            h().getLogger().c(EnumC5215i3.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return xVarJ;
        }
        try {
            F(v22);
            xVarJ = J().j(v22, G(K(), g12), h10);
            N(xVarJ);
            return xVarJ;
        } catch (Throwable th2) {
            h().getLogger().b(EnumC5215i3.ERROR, "Error while capturing event with id: " + v22.G(), th2);
            return xVarJ;
        }
    }

    private InterfaceC5217j0 I(i4 i4Var, k4 k4Var) {
        InterfaceC5217j0 interfaceC5217j0A;
        io.sentry.util.w.c(i4Var, "transactionContext is required");
        i4Var.t(k4Var.a());
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC5217j0A = C5198f1.u();
        } else if (io.sentry.util.C.b(h().getIgnoredSpanOrigins(), i4Var.g())) {
            h().getLogger().c(EnumC5215i3.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", i4Var.g());
            interfaceC5217j0A = C5198f1.u();
        } else if (!h().getInstrumenter().equals(i4Var.e())) {
            h().getLogger().c(EnumC5215i3.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", i4Var.e(), h().getInstrumenter());
            interfaceC5217j0A = C5198f1.u();
        } else if (h().isTracingEnabled()) {
            Double dL = L(i4Var);
            k4Var.j();
            h4 h4VarA = h().getInternalTracesSampler().a(new D1(i4Var, null, dL, null));
            i4Var.u(h4VarA);
            InterfaceC5212i0 interfaceC5212i0M = k4Var.m();
            if (interfaceC5212i0M == null) {
                interfaceC5212i0M = h().getSpanFactory();
            }
            if (h4VarA.e().booleanValue() && h().isContinuousProfilingEnabled()) {
                EnumC5278t1 profileLifecycle = h().getProfileLifecycle();
                EnumC5278t1 enumC5278t1 = EnumC5278t1.TRACE;
                if (profileLifecycle == enumC5278t1 && i4Var.j().equals(io.sentry.protocol.x.f51153b)) {
                    h().getContinuousProfiler().d(enumC5278t1, h().getInternalTracesSampler());
                }
            }
            interfaceC5217j0A = interfaceC5212i0M.a(i4Var, this, k4Var, this.f49284f);
            if (h4VarA.e().booleanValue() && h4VarA.b().booleanValue()) {
                InterfaceC5222k0 transactionProfiler = h().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.a(interfaceC5217j0A);
                } else if (k4Var.o()) {
                    transactionProfiler.a(interfaceC5217j0A);
                }
            }
        } else {
            h().getLogger().c(EnumC5215i3.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC5217j0A = C5198f1.u();
        }
        if (k4Var.p()) {
            interfaceC5217j0A.m();
        }
        return interfaceC5217j0A;
    }

    private Double L(i4 i4Var) {
        Double dI;
        C5186d c5186dB = i4Var.b();
        return (c5186dB == null || (dI = c5186dB.i()) == null) ? K().H().c() : dI;
    }

    private void N(io.sentry.protocol.x xVar) {
        K().P(xVar);
    }

    private static void O(C5322z3 c5322z3) {
        io.sentry.util.w.c(c5322z3, "SentryOptions is required.");
        if (c5322z3.getDsn() == null || c5322z3.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    @Override // io.sentry.InterfaceC5114a0
    public Boolean A() {
        return C5239n2.a().b(h().getCacheDirPath(), !h().isEnableAutoSessionTracking());
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x B(io.sentry.protocol.E e10, f4 f4Var, H h10, C5300v1 c5300v1) {
        io.sentry.protocol.E e11;
        io.sentry.util.w.c(e10, "transaction is required");
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!e10.q0()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", e10.G());
        } else {
            if (Boolean.TRUE.equals(Boolean.valueOf(e10.r0()))) {
                try {
                    e11 = e10;
                } catch (Throwable th2) {
                    th = th2;
                    e11 = e10;
                }
                try {
                    return J().b(e11, f4Var, K(), h10, c5300v1);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    h().getLogger().b(EnumC5215i3.ERROR, "Error while capturing transaction with id: " + e11.G(), th4);
                    return xVar;
                }
            }
            h().getLogger().c(EnumC5215i3.DEBUG, "Transaction %s was dropped due to sampling decision.", e10.G());
            if (h().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.h clientReportRecorder = h().getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.BACKPRESSURE;
                clientReportRecorder.a(fVar, EnumC5221k.Transaction);
                h().getClientReportRecorder().c(fVar, EnumC5221k.Span, e10.o0().size() + 1);
            } else {
                io.sentry.clientreport.h clientReportRecorder2 = h().getClientReportRecorder();
                io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.SAMPLE_RATE;
                clientReportRecorder2.a(fVar2, EnumC5221k.Transaction);
                h().getClientReportRecorder().c(fVar2, EnumC5221k.Span, e10.o0().size() + 1);
            }
        }
        return xVar;
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5114a0 C(String str) {
        return new P1(this.f49279a.m962clone(), this.f49280b.m962clone(), this.f49281c, this, str);
    }

    public InterfaceC5182c0 J() {
        return K().J();
    }

    public Y K() {
        return this.f49285g;
    }

    public Y M() {
        return this.f49279a;
    }

    @Override // io.sentry.InterfaceC5114a0
    public void a(C5191e c5191e) {
        e(c5191e, new H());
    }

    @Override // io.sentry.InterfaceC5114a0
    public void c(final boolean z10) {
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC5247p0 interfaceC5247p0 : h().getIntegrations()) {
                if (interfaceC5247p0 instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC5247p0).close();
                    } catch (Throwable th2) {
                        h().getLogger().c(EnumC5215i3.WARNING, "Failed to close the integration {}.", interfaceC5247p0, th2);
                    }
                }
            }
            r(new G1() { // from class: io.sentry.J1
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    y10.clear();
                }
            });
            t(I1.ISOLATION, new G1() { // from class: io.sentry.K1
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    y10.clear();
                }
            });
            h().getBackpressureMonitor().close();
            h().getTransactionProfiler().close();
            h().getContinuousProfiler().c(true);
            h().getCompositePerformanceCollector().close();
            h().getConnectionStatusProvider().close();
            final InterfaceC5187d0 executorService = h().getExecutorService();
            if (z10) {
                try {
                    executorService.submit(new Runnable() { // from class: io.sentry.L1
                        @Override // java.lang.Runnable
                        public final void run() {
                            executorService.a(this.f49222a.h().getShutdownTimeoutMillis());
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    h().getLogger().b(EnumC5215i3.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e10);
                    executorService.a(h().getShutdownTimeoutMillis());
                }
            } else {
                executorService.a(h().getShutdownTimeoutMillis());
            }
            t(I1.CURRENT, new G1() { // from class: io.sentry.M1
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    y10.J().c(z10);
                }
            });
            t(I1.ISOLATION, new G1() { // from class: io.sentry.N1
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    y10.J().c(z10);
                }
            });
            t(I1.GLOBAL, new G1() { // from class: io.sentry.O1
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    y10.J().c(z10);
                }
            });
        } catch (Throwable th3) {
            h().getLogger().b(EnumC5215i3.ERROR, "Error while closing the Scopes.", th3);
        }
    }

    @Override // io.sentry.InterfaceC5114a0
    public void d(long j10) {
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            J().d(j10);
        } catch (Throwable th2) {
            h().getLogger().b(EnumC5215i3.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.InterfaceC5114a0
    public void e(C5191e c5191e, H h10) {
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (c5191e == null) {
            h().getLogger().c(EnumC5215i3.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            K().e(c5191e, h10);
        }
    }

    @Override // io.sentry.InterfaceC5114a0
    public boolean f() {
        return J().f();
    }

    @Override // io.sentry.InterfaceC5114a0
    public void g(Throwable th2, InterfaceC5207h0 interfaceC5207h0, String str) {
        K().g(th2, interfaceC5207h0, str);
    }

    @Override // io.sentry.InterfaceC5114a0
    public C5322z3 h() {
        return this.f49285g.h();
    }

    @Override // io.sentry.InterfaceC5114a0
    public boolean isEnabled() {
        return J().isEnabled();
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5217j0 j() {
        if (isEnabled()) {
            return K().j();
        }
        h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC5114a0
    public void l() {
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        O3 o3L = K().l();
        if (o3L != null) {
            J().e(o3L, io.sentry.util.l.c(new io.sentry.hints.n()));
        }
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.transport.z n() {
        return J().n();
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x o(C5265q2 c5265q2, H h10) {
        io.sentry.util.w.c(c5265q2, "SentryEnvelope is required.");
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        if (isEnabled()) {
            try {
                io.sentry.protocol.x xVarO = J().o(c5265q2, h10);
                if (xVarO != null) {
                    return xVarO;
                }
            } catch (Throwable th2) {
                h().getLogger().b(EnumC5215i3.ERROR, "Error while capturing envelope.", th2);
            }
        } else {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        }
        return xVar;
    }

    @Override // io.sentry.InterfaceC5114a0
    public void p() {
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        E1.d dVarP = K().p();
        if (dVarP == null) {
            h().getLogger().c(EnumC5215i3.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (dVarP.b() != null) {
            J().e(dVarP.b(), io.sentry.util.l.c(new io.sentry.hints.n()));
        }
        J().e(dVarP.a(), io.sentry.util.l.c(new io.sentry.hints.p()));
    }

    @Override // io.sentry.InterfaceC5114a0
    public void t(I1 i12, G1 g12) {
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            g12.a(this.f49285g.T(i12));
        } catch (Throwable th2) {
            h().getLogger().b(EnumC5215i3.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x u(A3 a32, H h10) {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        if (isEnabled()) {
            try {
                return J().a(a32, K(), h10);
            } catch (Throwable th2) {
                h().getLogger().b(EnumC5215i3.ERROR, "Error while capturing replay", th2);
            }
        } else {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        }
        return xVar;
    }

    @Override // io.sentry.InterfaceC5114a0
    public Y v() {
        return this.f49281c;
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x w(C5268r1 c5268r1) {
        io.sentry.util.w.c(c5268r1, "profilingContinuousData is required");
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        if (isEnabled()) {
            try {
                return J().i(c5268r1, M());
            } catch (Throwable th2) {
                h().getLogger().b(EnumC5215i3.ERROR, "Error while capturing profile chunk with id: " + c5268r1.n(), th2);
            }
        } else {
            h().getLogger().c(EnumC5215i3.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        }
        return xVar;
    }

    @Override // io.sentry.InterfaceC5114a0
    public io.sentry.protocol.x y(V2 v22, H h10) {
        return H(v22, h10, null);
    }

    @Override // io.sentry.InterfaceC5114a0
    public InterfaceC5217j0 z(i4 i4Var, k4 k4Var) {
        return I(i4Var, k4Var);
    }

    private P1(Y y10, Y y11, Y y12, P1 p12, String str) {
        this.f49285g = new C5206h(y12, y11, y10);
        this.f49279a = y10;
        this.f49280b = y11;
        this.f49281c = y12;
        this.f49282d = p12;
        this.f49283e = str;
        C5322z3 c5322z3H = h();
        O(c5322z3H);
        this.f49284f = c5322z3H.getCompositePerformanceCollector();
        this.f49286h = new io.sentry.logger.e(this);
        this.f49287i = new io.sentry.metrics.e(this);
    }

    @Override // io.sentry.InterfaceC5114a0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public S m949clone() {
        if (!isEnabled()) {
            h().getLogger().c(EnumC5215i3.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new L(C("scopes clone"));
    }
}
