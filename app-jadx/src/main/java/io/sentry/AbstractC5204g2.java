package io.sentry;

import com.adjust.sdk.Constants;
import io.sentry.util.AbstractC5291d;
import io.sentry.util.AbstractC5296i;
import io.sentry.util.C5288a;
import io.sentry.util.runtime.a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.g2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5204g2 {

    /* JADX INFO: renamed from: a */
    private static volatile InterfaceC5177b0 f50697a = W0.c();

    /* JADX INFO: renamed from: b */
    private static volatile InterfaceC5114a0 f50698b = U0.i();

    /* JADX INFO: renamed from: c */
    private static final Y f50699c = new E1(C5322z3.empty());

    /* JADX INFO: renamed from: d */
    private static volatile boolean f50700d = false;

    /* JADX INFO: renamed from: e */
    private static final Charset f50701e = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: f */
    private static final long f50702f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g */
    private static final C5288a f50703g = new C5288a();

    /* JADX INFO: renamed from: io.sentry.g2$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(C5322z3 c5322z3);
    }

    private static void A(C5322z3 c5322z3) {
        io.sentry.opentelemetry.a.c(c5322z3, new io.sentry.util.s());
        if (EnumC5280t3.OFF == c5322z3.getOpenTelemetryMode()) {
            c5322z3.setSpanFactory(new C5246p());
        }
        D(c5322z3);
        io.sentry.opentelemetry.a.a(c5322z3);
    }

    private static void B(C5322z3 c5322z3) {
        io.sentry.util.m.c(c5322z3);
        io.sentry.util.m.b(c5322z3);
    }

    private static void C(C5322z3 c5322z3) {
        if (c5322z3.isDebug() && (c5322z3.getLogger() instanceof N0)) {
            c5322z3.setLogger(new e4());
        }
    }

    private static void D(C5322z3 c5322z3) {
        u().close();
        if (EnumC5280t3.OFF == c5322z3.getOpenTelemetryMode()) {
            f50697a = new C5241o();
        } else {
            f50697a = R1.a(new io.sentry.util.s(), N0.e());
        }
    }

    public static Boolean E() {
        return r().A();
    }

    public static boolean F() {
        return r().isEnabled();
    }

    public static boolean G() {
        return r().f();
    }

    private static void H(C5322z3 c5322z3) {
        try {
            c5322z3.getExecutorService().submit(new G0(c5322z3));
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.DEBUG, "Failed to move previous session.", th2);
        }
    }

    private static void I(final C5322z3 c5322z3) {
        try {
            c5322z3.getExecutorService().submit(new Runnable() { // from class: io.sentry.f2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC5204g2.d(c5322z3);
                }
            });
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.DEBUG, "Failed to notify options observers.", th2);
        }
    }

    private static boolean J(C5322z3 c5322z3) {
        if (c5322z3.isEnableExternalConfiguration()) {
            c5322z3.merge(E.g(io.sentry.config.g.a(), c5322z3.getLogger()));
        }
        String dsn = c5322z3.getDsn();
        if (!c5322z3.isEnabled() || (dsn != null && dsn.isEmpty())) {
            k();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        c5322z3.retrieveParsedDsn();
        return true;
    }

    private static h4 K(C5322z3 c5322z3) {
        i4 i4Var = new i4("app.launch", "profile");
        i4Var.B(true);
        return c5322z3.getInternalTracesSampler().a(new D1(i4Var, null, Double.valueOf(io.sentry.util.B.a().c()), null));
    }

    public static void L() {
        r().p();
    }

    public static InterfaceC5217j0 M(i4 i4Var, k4 k4Var) {
        return r().z(i4Var, k4Var);
    }

    public static /* synthetic */ void a(C5322z3 c5322z3) {
        String cacheDirPathWithoutDsn = c5322z3.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
            try {
                AbstractC5296i.a(file);
                if (c5322z3.isEnableAppStartProfiling() || c5322z3.isStartProfilerOnAppStart()) {
                    if (!c5322z3.isStartProfilerOnAppStart() && !c5322z3.isTracingEnabled()) {
                        c5322z3.getLogger().c(EnumC5215i3.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        C5209h2 c5209h2 = new C5209h2(c5322z3, c5322z3.isEnableAppStartProfiling() ? K(c5322z3) : new h4(Boolean.FALSE));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f50701e));
                            try {
                                c5322z3.getSerializer().a(c5209h2, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                c5322z3.getLogger().b(EnumC5215i3.ERROR, "Unable to create app start profiling config file. ", th2);
            }
        }
    }

    public static /* synthetic */ void d(C5322z3 c5322z3) {
        for (T t10 : c5322z3.getOptionsObservers()) {
            t10.k(c5322z3.getRelease());
            t10.i(c5322z3.getProguardUuid());
            t10.j(c5322z3.getSdkVersion());
            t10.f(c5322z3.getDist());
            t10.h(c5322z3.getEnvironment());
            t10.e(c5322z3.getTags());
            t10.g(c5322z3.getSessionReplay().l());
        }
        io.sentry.cache.t tVarFindPersistingScopeObserver = c5322z3.findPersistingScopeObserver();
        if (tVarFindPersistingScopeObserver != null) {
            tVarFindPersistingScopeObserver.C();
        }
    }

    public static /* synthetic */ void f(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < f50702f - TimeUnit.MINUTES.toMillis(5L)) {
                AbstractC5296i.a(file2);
            }
        }
    }

    public static void h(C5191e c5191e, H h10) {
        r().e(c5191e, h10);
    }

    private static void i(a aVar, C5322z3 c5322z3) {
        try {
            aVar.a(c5322z3);
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
    }

    public static io.sentry.protocol.x j(V2 v22, H h10) {
        return r().y(v22, h10);
    }

    public static void k() {
        InterfaceC5192e0 interfaceC5192e0A = f50703g.a();
        try {
            InterfaceC5114a0 interfaceC5114a0R = r();
            f50698b = U0.i();
            u().close();
            interfaceC5114a0R.c(false);
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

    public static void l(G1 g12) {
        m(null, g12);
    }

    public static void m(I1 i12, G1 g12) {
        r().t(i12, g12);
    }

    public static void n() {
        r().l();
    }

    private static void o(C5322z3 c5322z3, InterfaceC5114a0 interfaceC5114a0) {
        try {
            c5322z3.getExecutorService().submit(new RunnableC5264q1(c5322z3, interfaceC5114a0));
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.DEBUG, "Failed to finalize previous session.", th2);
        }
    }

    public static void p(long j10) {
        r().d(j10);
    }

    public static InterfaceC5114a0 q(String str) {
        return r().C(str);
    }

    public static InterfaceC5114a0 r() {
        return s(true);
    }

    public static InterfaceC5114a0 s(boolean z10) {
        if (f50700d) {
            return f50698b;
        }
        InterfaceC5114a0 interfaceC5114a0 = u().get();
        if (interfaceC5114a0 != null && !interfaceC5114a0.s()) {
            return interfaceC5114a0;
        }
        if (!z10) {
            return U0.i();
        }
        InterfaceC5114a0 interfaceC5114a0C = f50698b.C("getCurrentScopes");
        u().b(interfaceC5114a0C);
        return interfaceC5114a0C;
    }

    public static Y t() {
        return f50699c;
    }

    private static InterfaceC5177b0 u() {
        return f50697a;
    }

    private static void v(final C5322z3 c5322z3, InterfaceC5187d0 interfaceC5187d0) {
        try {
            interfaceC5187d0.submit(new Runnable() { // from class: io.sentry.a2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC5204g2.a(c5322z3);
                }
            });
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th2);
        }
    }

    public static void w(C5228l1 c5228l1, a aVar, boolean z10) {
        C5322z3 c5322z3 = (C5322z3) c5228l1.b();
        i(aVar, c5322z3);
        x(c5322z3, z10);
    }

    private static void x(final C5322z3 c5322z3, boolean z10) {
        InterfaceC5192e0 interfaceC5192e0A = f50703g.a();
        try {
            if (!c5322z3.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.y.a()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. " + c5322z3.getClass().getName());
            }
            if (!J(c5322z3)) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            Boolean boolIsGlobalHubMode = c5322z3.isGlobalHubMode();
            if (boolIsGlobalHubMode != null) {
                z10 = boolIsGlobalHubMode.booleanValue();
            }
            c5322z3.getLogger().c(EnumC5215i3.INFO, "GlobalHubMode: '%s'", String.valueOf(z10));
            f50700d = z10;
            z(c5322z3);
            Y y10 = f50699c;
            if (io.sentry.util.m.d(y10.h(), c5322z3, F())) {
                if (F()) {
                    c5322z3.getLogger().c(EnumC5215i3.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                r().c(true);
                y10.q(c5322z3);
                f50698b = new P1(new E1(c5322z3), new E1(c5322z3), y10, "Sentry.init");
                C(c5322z3);
                A(c5322z3);
                u().b(f50698b);
                y(c5322z3);
                y10.D(new C5234m2(c5322z3));
                if (c5322z3.getExecutorService().isClosed()) {
                    c5322z3.setExecutorService(new Z2(c5322z3));
                    c5322z3.getExecutorService().b();
                }
                try {
                    c5322z3.getExecutorService().submit(new Runnable() { // from class: io.sentry.Z1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c5322z3.loadLazyFields();
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    c5322z3.getLogger().b(EnumC5215i3.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e10);
                }
                H(c5322z3);
                for (InterfaceC5247p0 interfaceC5247p0 : c5322z3.getIntegrations()) {
                    try {
                        interfaceC5247p0.g(Q1.b(), c5322z3);
                    } catch (Throwable th2) {
                        c5322z3.getLogger().b(EnumC5215i3.WARNING, "Failed to register the integration " + interfaceC5247p0.getClass().getName(), th2);
                    }
                }
                I(c5322z3);
                o(c5322z3, Q1.b());
                v(c5322z3, c5322z3.getExecutorService());
                ILogger logger = c5322z3.getLogger();
                EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
                logger.c(enumC5215i3, "Using openTelemetryMode %s", c5322z3.getOpenTelemetryMode());
                c5322z3.getLogger().c(enumC5215i3, "Using span factory %s", c5322z3.getSpanFactory().getClass().getName());
                c5322z3.getLogger().c(enumC5215i3, "Using scopes storage %s", f50697a.getClass().getName());
            } else {
                c5322z3.getLogger().c(EnumC5215i3.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
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

    private static void y(C5322z3 c5322z3) {
        ILogger logger = c5322z3.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.INFO;
        logger.c(enumC5215i3, "Initializing SDK with DSN: '%s'", c5322z3.getDsn());
        String outboxPath = c5322z3.getOutboxPath();
        if (outboxPath != null) {
            final File file = new File(outboxPath);
            c5322z3.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.b2
                @Override // io.sentry.util.runtime.a.InterfaceC0806a
                public final Object run() {
                    return Boolean.valueOf(file.mkdirs());
                }
            });
        } else {
            logger.c(enumC5215i3, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = c5322z3.getCacheDirPath();
        if (cacheDirPath != null) {
            final File file2 = new File(cacheDirPath);
            c5322z3.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.c2
                @Override // io.sentry.util.runtime.a.InterfaceC0806a
                public final Object run() {
                    return Boolean.valueOf(file2.mkdirs());
                }
            });
            if (c5322z3.getEnvelopeDiskCache() instanceof io.sentry.transport.r) {
                c5322z3.setEnvelopeDiskCache(io.sentry.cache.f.y(c5322z3));
            }
        }
        String profilingTracesDirPath = c5322z3.getProfilingTracesDirPath();
        if ((c5322z3.isProfilingEnabled() || c5322z3.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            final File file3 = new File(profilingTracesDirPath);
            c5322z3.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.d2
                @Override // io.sentry.util.runtime.a.InterfaceC0806a
                public final Object run() {
                    return Boolean.valueOf(file3.mkdirs());
                }
            });
            try {
                c5322z3.getExecutorService().submit(new Runnable() { // from class: io.sentry.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC5204g2.f(file3);
                    }
                });
            } catch (RejectedExecutionException e10) {
                c5322z3.getLogger().b(EnumC5215i3.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e10);
            }
        }
        io.sentry.internal.modules.b modulesLoader = c5322z3.getModulesLoader();
        if (!c5322z3.isSendModules()) {
            c5322z3.setModulesLoader(io.sentry.internal.modules.e.b());
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            c5322z3.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(c5322z3.getLogger()), new io.sentry.internal.modules.f(c5322z3.getLogger())), c5322z3.getLogger()));
        }
        if (c5322z3.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            c5322z3.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(c5322z3.getLogger()));
        }
        AbstractC5291d.a(c5322z3, c5322z3.getDebugMetaLoader().a());
        if (c5322z3.getThreadChecker() instanceof io.sentry.util.thread.b) {
            c5322z3.setThreadChecker(io.sentry.util.thread.c.d());
        }
        if (c5322z3.getPerformanceCollectors().isEmpty()) {
            c5322z3.addPerformanceCollector(new C5263q0());
        }
        if (c5322z3.isEnableBackpressureHandling() && io.sentry.util.y.c()) {
            if (c5322z3.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                c5322z3.setBackpressureMonitor(new io.sentry.backpressure.a(c5322z3, Q1.b()));
            }
            c5322z3.getBackpressureMonitor().start();
        }
        B(c5322z3);
        c5322z3.getLogger().c(EnumC5215i3.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(c5322z3.isContinuousProfilingEnabled()), c5322z3.getProfileLifecycle());
    }

    private static void z(C5322z3 c5322z3) {
        if (c5322z3.getFatalLogger() instanceof N0) {
            c5322z3.setFatalLogger(new e4());
        }
    }
}
