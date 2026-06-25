package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.C5183c1;
import io.sentry.C5203g1;
import io.sentry.C5213i1;
import io.sentry.C5231m;
import io.sentry.C5236n;
import io.sentry.C5262q;
import io.sentry.EnumC5215i3;
import io.sentry.EnumC5280t3;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5211i;
import io.sentry.InterfaceC5222k0;
import io.sentry.U1;
import io.sentry.X1;
import io.sentry.Y1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C5142g;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.util.p;
import io.sentry.util.runtime.a;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class K {
    public static File f(Context context) {
        return new File(context.getCacheDir(), "sentry");
    }

    private static String g(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    static void h(SentryAndroidOptions sentryAndroidOptions, Context context, C5131g0 c5131g0, io.sentry.util.s sVar, C5134i c5134i, boolean z10) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.r)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.f(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof io.sentry.I0) {
            sentryAndroidOptions.setConnectionStatusProvider(new C5142g(context, sentryAndroidOptions, c5131g0, io.sentry.android.core.internal.util.h.a()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.t(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.h(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new C5231m(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C5165u0(context, c5131g0, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new S0(sentryAndroidOptions, c5134i));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c5131g0));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C5127e0(context, sentryAndroidOptions, c5131g0));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.t) {
            sentryAndroidOptions.setTransportGate(new Q(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.b(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof C5213i1) {
            sentryAndroidOptions.setVersionDetector(new C5262q(sentryAndroidOptions));
        }
        io.sentry.util.p pVarF = sVar.f("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean zD = sVar.d("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(pVarF));
            if (zD && sVar.d("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zD && sVar.d("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.l.e());
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof C5183c1) {
            sentryAndroidOptions.setSocketTagger(N.c());
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new C());
            sentryAndroidOptions.addPerformanceCollector(new C5168w(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                sentryAndroidOptions.addPerformanceCollector(new d1(sentryAndroidOptions, (io.sentry.android.core.internal.util.G) io.sentry.util.w.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof io.sentry.H0) {
            sentryAndroidOptions.setCompositePerformanceCollector(new C5236n(sentryAndroidOptions));
        }
        if (z10 && (sentryAndroidOptions.getReplayController().getReplayBreadcrumbConverter() instanceof io.sentry.P0)) {
            sentryAndroidOptions.getReplayController().k(new io.sentry.android.replay.a(sentryAndroidOptions));
        }
        InterfaceC5192e0 interfaceC5192e0A = io.sentry.android.core.performance.h.f49978q.a();
        try {
            InterfaceC5222k0 interfaceC5222k0J = hVarQ.j();
            io.sentry.N nI = hVarQ.i();
            hVarQ.x(null);
            hVarQ.w(null);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            l(sentryAndroidOptions, context, c5131g0, interfaceC5222k0J, nI, sentryAndroidOptions.getCompositePerformanceCollector());
        } finally {
        }
    }

    static void i(Context context, final SentryAndroidOptions sentryAndroidOptions, C5131g0 c5131g0, io.sentry.util.s sVar, C5134i c5134i, boolean z10, boolean z11, boolean z12, boolean z13) {
        io.sentry.util.p pVar = new io.sentry.util.p(new p.a() { // from class: io.sentry.android.core.G
            @Override // io.sentry.util.p.a
            public final Object a() {
                return Boolean.valueOf(io.sentry.android.core.cache.f.W(sentryAndroidOptions));
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new X1(new U1() { // from class: io.sentry.android.core.H
            @Override // io.sentry.U1
            public final String a() {
                return sentryAndroidOptions.getCacheDirPath();
            }
        }), pVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(sVar.g("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        if (c5131g0.d() >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
        }
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.b());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new Y1(new U1() { // from class: io.sentry.android.core.I
            @Override // io.sentry.U1
            public final String a() {
                return sentryAndroidOptions.getOutboxPath();
            }
        }), pVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(U.a(context, c5131g0));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, c5131g0, c5134i));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, sVar));
            if (z10) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(EnumC5215i3.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z11) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, c5131g0));
        if (z12) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.m.a());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z13) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().g(new SentryAndroidOptions.a());
    }

    static void j(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, C5131g0 c5131g0) {
        io.sentry.util.w.c(context, "The context is required.");
        final Context contextG = AbstractC5156p0.g(context);
        io.sentry.util.w.c(sentryAndroidOptions, "The options object is required.");
        io.sentry.util.w.c(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setFatalLogger(new C5172y());
        sentryAndroidOptions.setDefaultScopeType(I1.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(EnumC5280t3.OFF);
        sentryAndroidOptions.setDateProvider(new Z0());
        sentryAndroidOptions.setRuntimeManager(new io.sentry.android.core.internal.util.j());
        sentryAndroidOptions.getLogs().d(new B());
        sentryAndroidOptions.getMetrics().d(new E());
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.G(contextG, iLogger, c5131g0));
        O0.a(contextG, sentryAndroidOptions, c5131g0);
        sentryAndroidOptions.setCacheDirPath((String) sentryAndroidOptions.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.F
            @Override // io.sentry.util.runtime.a.InterfaceC0806a
            public final Object run() {
                return K.f(contextG).getAbsolutePath();
            }
        }));
        k(sentryAndroidOptions, contextG, c5131g0);
        C5123c0.l().o(sentryAndroidOptions);
    }

    private static void k(SentryAndroidOptions sentryAndroidOptions, final Context context, C5131g0 c5131g0) {
        PackageInfo packageInfoP = AbstractC5156p0.p(context, c5131g0);
        if (packageInfoP != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(g(packageInfoP, AbstractC5156p0.q(packageInfoP, c5131g0)));
            }
            String str = packageInfoP.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId((String) sentryAndroidOptions.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.J
                    @Override // io.sentry.util.runtime.a.InterfaceC0806a
                    public final Object run() {
                        return E0.a(context);
                    }
                }));
            } catch (RuntimeException e10) {
                sentryAndroidOptions.getLogger().b(EnumC5215i3.ERROR, "Could not generate distinct Id.", e10);
            }
        }
    }

    private static void l(SentryAndroidOptions sentryAndroidOptions, Context context, C5131g0 c5131g0, InterfaceC5222k0 interfaceC5222k0, io.sentry.N n10, InterfaceC5211i interfaceC5211i) {
        if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
            sentryAndroidOptions.setContinuousProfiler(io.sentry.J0.a());
            if (n10 != null) {
                n10.c(true);
            }
            if (interfaceC5222k0 != null) {
                sentryAndroidOptions.setTransactionProfiler(interfaceC5222k0);
                return;
            } else {
                sentryAndroidOptions.setTransactionProfiler(new P(context, sentryAndroidOptions, c5131g0, (io.sentry.android.core.internal.util.G) io.sentry.util.w.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                return;
            }
        }
        sentryAndroidOptions.setTransactionProfiler(C5203g1.c());
        if (interfaceC5222k0 != null) {
            interfaceC5222k0.close();
        }
        if (n10 == null) {
            sentryAndroidOptions.setContinuousProfiler(new C5166v(c5131g0, (io.sentry.android.core.internal.util.G) io.sentry.util.w.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required"), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
            return;
        }
        sentryAndroidOptions.setContinuousProfiler(n10);
        io.sentry.protocol.x xVarF = n10.f();
        if (!n10.isRunning() || xVarF.equals(io.sentry.protocol.x.f51153b)) {
            return;
        }
        interfaceC5211i.f(xVarF.toString());
    }
}
