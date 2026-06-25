package io.sentry;

import com.adjust.sdk.Constants;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import io.sentry.C5117a3;
import io.sentry.util.C5288a;
import io.sentry.util.p;
import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: io.sentry.z3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5322z3 {
    static final EnumC5215i3 DEFAULT_DIAGNOSTIC_LEVEL = EnumC5215i3.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private a beforeBreadcrumb;
    private b beforeEnvelopeCallback;
    private c beforeSend;
    private c beforeSendFeedback;
    private d beforeSendReplay;
    private e beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.h clientReportRecorder;
    private InterfaceC5211i compositePerformanceCollector;
    private M connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private N continuousProfiler;
    private f cron;
    private final io.sentry.util.p dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private I1 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private EnumC5215i3 diagnosticLevel;
    private String dist;
    private String distinctId;
    private g distribution;
    private O distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.g envelopeDiskCache;
    private final io.sentry.util.p envelopeReader;
    private String environment;
    private final List<C> eventProcessors;
    private InterfaceC5187d0 executorService;
    private final D experimental;
    private ILogger fatalLogger;
    private C5117a3 feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;
    private G fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<F> ignoredCheckIns;
    private List<F> ignoredErrors;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private List<F> ignoredSpanOrigins;
    private List<F> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC5237n0 initPriority;
    private EnumC5242o0 instrumenter;
    private final List<InterfaceC5247p0> integrations;
    private volatile g4 internalTracesSampler;
    protected final C5288a lock;
    private ILogger logger;
    private h logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;
    private n maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private i metrics;
    private io.sentry.internal.modules.b modulesLoader;
    private final List<Z> observers;
    private j onDiscard;
    private k onOversizedEvent;
    private EnumC5280t3 openTelemetryMode;
    private final List<T> optionsObservers;
    private final io.sentry.util.p parsedDsn;
    private final List<U> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private EnumC5278t1 profileLifecycle;
    private Double profileSessionSampleRate;
    private X profilerConverter;
    private Double profilesSampleRate;
    private l profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private m proxy;
    private int readTimeoutMillis;
    private String release;
    private InterfaceC5320z1 replayController;
    private io.sentry.util.runtime.a runtimeManager;
    private Double sampleRate;
    private io.sentry.protocol.r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.p serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private B3 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private InterfaceC5202g0 socketTagger;
    private InterfaceC5212i0 spanFactory;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private o tracesSampler;
    private InterfaceC5222k0 transactionProfiler;
    private InterfaceC5227l0 transportFactory;
    private io.sentry.transport.q transportGate;
    private InterfaceC5232m0 versionDetector;
    private final List<Object> viewHierarchyExporters;

    /* JADX INFO: renamed from: io.sentry.z3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        C5191e a(C5191e c5191e, H h10);
    }

    /* JADX INFO: renamed from: io.sentry.z3$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(C5265q2 c5265q2, H h10);
    }

    /* JADX INFO: renamed from: io.sentry.z3$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        V2 a(V2 v22, H h10);
    }

    /* JADX INFO: renamed from: io.sentry.z3$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
    }

    /* JADX INFO: renamed from: io.sentry.z3$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
    }

    /* JADX INFO: renamed from: io.sentry.z3$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f {

        /* JADX INFO: renamed from: a */
        private Long f51566a;

        /* JADX INFO: renamed from: b */
        private Long f51567b;

        /* JADX INFO: renamed from: c */
        private String f51568c;

        /* JADX INFO: renamed from: d */
        private Long f51569d;

        /* JADX INFO: renamed from: e */
        private Long f51570e;

        public Long a() {
            return this.f51566a;
        }

        public Long b() {
            return this.f51569d;
        }

        public Long c() {
            return this.f51567b;
        }

        public Long d() {
            return this.f51570e;
        }

        public String e() {
            return this.f51568c;
        }

        public void f(Long l10) {
            this.f51566a = l10;
        }

        public void g(Long l10) {
            this.f51569d = l10;
        }

        public void h(Long l10) {
            this.f51567b = l10;
        }

        public void i(Long l10) {
            this.f51570e = l10;
        }

        public void j(String str) {
            this.f51568c = str;
        }
    }

    /* JADX INFO: renamed from: io.sentry.z3$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public String f51571a = "";

        /* JADX INFO: renamed from: b */
        public String f51572b = "";

        /* JADX INFO: renamed from: c */
        public String f51573c = "";

        /* JADX INFO: renamed from: d */
        public String f51574d = "https://sentry.io";

        /* JADX INFO: renamed from: e */
        public String f51575e = null;
    }

    /* JADX INFO: renamed from: io.sentry.z3$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h {

        /* JADX INFO: renamed from: a */
        private boolean f51576a = false;

        /* JADX INFO: renamed from: b */
        private io.sentry.logger.d f51577b = new io.sentry.logger.a();

        public io.sentry.logger.d a() {
            return this.f51577b;
        }

        public boolean b() {
            return this.f51576a;
        }

        public void c(boolean z10) {
            this.f51576a = z10;
        }

        public void d(io.sentry.logger.d dVar) {
            this.f51577b = dVar;
        }
    }

    /* JADX INFO: renamed from: io.sentry.z3$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i {

        /* JADX INFO: renamed from: a */
        private boolean f51578a = true;

        /* JADX INFO: renamed from: b */
        private io.sentry.metrics.d f51579b = new io.sentry.metrics.a();

        public io.sentry.metrics.d a() {
            return this.f51579b;
        }

        public boolean b() {
            return this.f51578a;
        }

        public void c(boolean z10) {
            this.f51578a = z10;
        }

        public void d(io.sentry.metrics.d dVar) {
            this.f51579b = dVar;
        }
    }

    /* JADX INFO: renamed from: io.sentry.z3$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface j {
    }

    /* JADX INFO: renamed from: io.sentry.z3$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface k {
    }

    /* JADX INFO: renamed from: io.sentry.z3$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface l {
    }

    /* JADX INFO: renamed from: io.sentry.z3$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m {

        /* JADX INFO: renamed from: a */
        private String f51580a;

        /* JADX INFO: renamed from: b */
        private String f51581b;

        /* JADX INFO: renamed from: c */
        private String f51582c;

        /* JADX INFO: renamed from: d */
        private String f51583d;

        /* JADX INFO: renamed from: e */
        private Proxy.Type f51584e;

        public m(String str, String str2, String str3, String str4) {
            this(str, str2, null, str3, str4);
        }

        public String a() {
            return this.f51580a;
        }

        public String b() {
            return this.f51583d;
        }

        public String c() {
            return this.f51581b;
        }

        public Proxy.Type d() {
            return this.f51584e;
        }

        public String e() {
            return this.f51582c;
        }

        public m(String str, String str2, Proxy.Type type, String str3, String str4) {
            this.f51580a = str;
            this.f51581b = str2;
            this.f51584e = type;
            this.f51582c = str3;
            this.f51583d = str4;
        }
    }

    /* JADX INFO: renamed from: io.sentry.z3$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum n {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* JADX INFO: renamed from: io.sentry.z3$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface o {
    }

    public C5322z3() {
        this(false);
    }

    public static /* synthetic */ InterfaceC5249p2 a() {
        return new C5214i2();
    }

    public static /* synthetic */ C5298v b(C5322z3 c5322z3) {
        return new C5298v(c5322z3.dsn);
    }

    public static /* synthetic */ P c(C5322z3 c5322z3) {
        c5322z3.getClass();
        return new C5308x((InterfaceC5197f0) c5322z3.serializer.a());
    }

    private io.sentry.protocol.r createSdkVersion() {
        io.sentry.protocol.r rVar = new io.sentry.protocol.r("sentry.java", "8.31.0");
        rVar.k("8.31.0");
        return rVar;
    }

    public static /* synthetic */ InterfaceC5197f0 d(C5322z3 c5322z3) {
        c5322z3.getClass();
        return new C0(c5322z3);
    }

    private void e() {
        C5205g3.d().b("maven:io.sentry:sentry", "8.31.0");
    }

    public static C5322z3 empty() {
        return new C5322z3(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(C c10) {
        this.eventProcessors.add(c10);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new F(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new F(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new F(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new F(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(InterfaceC5247p0 interfaceC5247p0) {
        this.integrations.add(interfaceC5247p0);
    }

    public void addOptionsObserver(T t10) {
        this.optionsObservers.add(t10);
    }

    public void addPerformanceCollector(U u10) {
        this.performanceCollectors.add(u10);
    }

    public void addScopeObserver(Z z10) {
        this.observers.add(z10);
    }

    boolean containsIgnoredExceptionForType(Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public io.sentry.cache.t findPersistingScopeObserver() {
        for (Z z10 : this.observers) {
            if (z10 instanceof io.sentry.cache.t) {
                return (io.sentry.cache.t) z10;
            }
        }
        return null;
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public b getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public c getBeforeSend() {
        return this.beforeSend;
    }

    public c getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    public d getBeforeSendReplay() {
        return null;
    }

    public e getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.h getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public InterfaceC5211i getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public M getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public N getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public f getCron() {
        return this.cron;
    }

    public InterfaceC5249p2 getDateProvider() {
        return (InterfaceC5249p2) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public I1 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public EnumC5215i3 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public g getDistribution() {
        return this.distribution;
    }

    public O getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public io.sentry.cache.g getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public P getEnvelopeReader() {
        return (P) this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : "production";
    }

    public List<C> getEventProcessors() {
        return this.eventProcessors;
    }

    public InterfaceC5187d0 getExecutorService() {
        return this.executorService;
    }

    public D getExperimental() {
        return this.experimental;
    }

    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    public C5117a3 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public G getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<F> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<F> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<F> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<F> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public EnumC5237n0 getInitPriority() {
        return this.initPriority;
    }

    public EnumC5242o0 getInstrumenter() {
        return this.instrumenter;
    }

    public List<InterfaceC5247p0> getIntegrations() {
        return this.integrations;
    }

    public g4 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            InterfaceC5192e0 interfaceC5192e0A = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new g4(this);
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
        return this.internalTracesSampler;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public h getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public n getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public i getMetrics() {
        return this.metrics;
    }

    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    public j getOnDiscard() {
        return null;
    }

    public k getOnOversizedEvent() {
        return null;
    }

    public EnumC5280t3 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<T> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<U> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public EnumC5278t1 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public X getProfilerConverter() {
        return this.profilerConverter;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public l getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public m getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public InterfaceC5320z1 getReplayController() {
        return this.replayController;
    }

    public io.sentry.util.runtime.a getRuntimeManager() {
        return this.runtimeManager;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<Z> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.r getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public InterfaceC5197f0 getSerializer() {
        return (InterfaceC5197f0) this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public B3 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public InterfaceC5202g0 getSocketTagger() {
        return this.socketTagger;
    }

    public InterfaceC5212i0 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public o getTracesSampler() {
        return null;
    }

    public InterfaceC5222k0 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public InterfaceC5227l0 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.q getTransportGate() {
        return this.transportGate;
    }

    public InterfaceC5232m0 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<Object> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d10;
        return this.profilesSampleRate == null && (d10 = this.profileSessionSampleRate) != null && d10.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d10 = this.profilesSampleRate;
        return d10 != null && d10.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(E e10) {
        if (e10.m() != null) {
            setDsn(e10.m());
        }
        if (e10.p() != null) {
            setEnvironment(e10.p());
        }
        if (e10.F() != null) {
            setRelease(e10.F());
        }
        if (e10.l() != null) {
            setDist(e10.l());
        }
        if (e10.H() != null) {
            setServerName(e10.H());
        }
        if (e10.E() != null) {
            setProxy(e10.E());
        }
        if (e10.o() != null) {
            setEnableUncaughtExceptionHandler(e10.o().booleanValue());
        }
        if (e10.y() != null) {
            setPrintUncaughtStackTrace(e10.y().booleanValue());
        }
        if (e10.L() != null) {
            setTracesSampleRate(e10.L());
        }
        if (e10.B() != null) {
            setProfilesSampleRate(e10.B());
        }
        if (e10.k() != null) {
            setDebug(e10.k().booleanValue());
        }
        if (e10.n() != null) {
            setEnableDeduplication(e10.n().booleanValue());
        }
        if (e10.G() != null) {
            setSendClientReports(e10.G().booleanValue());
        }
        if (e10.T() != null) {
            setForceInit(e10.T().booleanValue());
        }
        for (Map.Entry entry : new HashMap(e10.J()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(e10.w()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(e10.v()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(e10.t()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (e10.K() != null) {
            setTracePropagationTargets(new ArrayList(e10.K()));
        }
        Iterator it4 = new ArrayList(e10.i()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (e10.D() != null) {
            setProguardUuid(e10.D());
        }
        if (e10.q() != null) {
            setIdleTimeout(e10.q());
        }
        Iterator it5 = e10.h().iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        if (e10.S() != null) {
            setEnabled(e10.S().booleanValue());
        }
        if (e10.Q() != null) {
            setEnablePrettySerializationOutput(e10.Q().booleanValue());
        }
        if (e10.W() != null) {
            setSendModules(e10.W().booleanValue());
        }
        if (e10.r() != null) {
            setIgnoredCheckIns(new ArrayList(e10.r()));
        }
        if (e10.u() != null) {
            setIgnoredTransactions(new ArrayList(e10.u()));
        }
        if (e10.s() != null) {
            setIgnoredErrors(new ArrayList(e10.s()));
        }
        if (e10.N() != null) {
            setEnableBackpressureHandling(e10.N().booleanValue());
        }
        if (e10.x() != null) {
            setMaxRequestBodySize(e10.x());
        }
        if (e10.V() != null) {
            setSendDefaultPii(e10.V().booleanValue());
        }
        if (e10.M() != null) {
            setCaptureOpenTelemetryEvents(e10.M().booleanValue());
        }
        if (e10.R() != null) {
            setEnableSpotlight(e10.R().booleanValue());
        }
        if (e10.I() != null) {
            setSpotlightConnectionUrl(e10.I());
        }
        if (e10.U() != null) {
            setGlobalHubMode(e10.U());
        }
        if (e10.j() != null) {
            if (getCron() == null) {
                setCron(e10.j());
            } else {
                if (e10.j().a() != null) {
                    getCron().f(e10.j().a());
                }
                if (e10.j().c() != null) {
                    getCron().h(e10.j().c());
                }
                if (e10.j().e() != null) {
                    getCron().j(e10.j().e());
                }
                if (e10.j().b() != null) {
                    getCron().g(e10.j().b());
                }
                if (e10.j().d() != null) {
                    getCron().i(e10.j().d());
                }
            }
        }
        if (e10.O() != null) {
            getLogs().c(e10.O().booleanValue());
        }
        if (e10.P() != null) {
            getMetrics().c(e10.P().booleanValue());
        }
        if (e10.A() != null) {
            setProfileSessionSampleRate(e10.A());
        }
        if (e10.C() != null) {
            setProfilingTracesDirPath(e10.C());
        }
        if (e10.z() != null) {
            setProfileLifecycle(e10.z());
        }
    }

    C5298v retrieveParsedDsn() {
        return (C5298v) this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z10) {
        this.attachServerName = z10;
    }

    public void setAttachStacktrace(boolean z10) {
        this.attachStacktrace = z10;
    }

    public void setAttachThreads(boolean z10) {
        this.attachThreads = z10;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    public void setBeforeEnvelopeCallback(b bVar) {
        this.beforeEnvelopeCallback = bVar;
    }

    public void setBeforeSend(c cVar) {
        this.beforeSend = cVar;
    }

    public void setBeforeSendFeedback(c cVar) {
        this.beforeSendFeedback = cVar;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z10) {
        this.captureOpenTelemetryEvents = z10;
    }

    public void setCompositePerformanceCollector(InterfaceC5211i interfaceC5211i) {
        this.compositePerformanceCollector = interfaceC5211i;
    }

    public void setConnectionStatusProvider(M m10) {
        this.connectionStatusProvider = m10;
    }

    public void setConnectionTimeoutMillis(int i10) {
        this.connectionTimeoutMillis = i10;
    }

    public void setContinuousProfiler(N n10) {
        if (this.continuousProfiler != J0.a() || n10 == null) {
            return;
        }
        this.continuousProfiler = n10;
    }

    public void setCron(f fVar) {
        this.cron = fVar;
    }

    public void setDateProvider(InterfaceC5249p2 interfaceC5249p2) {
        this.dateProvider.c(interfaceC5249p2);
    }

    public void setDeadlineTimeout(long j10) {
        this.deadlineTimeout = j10;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(I1 i12) {
        this.defaultScopeType = i12;
    }

    public void setDiagnosticLevel(EnumC5215i3 enumC5215i3) {
        if (enumC5215i3 == null) {
            enumC5215i3 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC5215i3;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(g gVar) {
        if (gVar == null) {
            gVar = new g();
        }
        this.distribution = gVar;
    }

    public void setDistributionController(O o10) {
        if (o10 == null) {
            o10 = K0.a();
        }
        this.distributionController = o10;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.parsedDsn.b();
        this.dsnHash = io.sentry.util.D.a(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z10) {
        this.enableAppStartProfiling = z10;
    }

    public void setEnableAutoSessionTracking(boolean z10) {
        this.enableAutoSessionTracking = z10;
    }

    public void setEnableBackpressureHandling(boolean z10) {
        this.enableBackpressureHandling = z10;
    }

    public void setEnableDeduplication(boolean z10) {
        this.enableDeduplication = z10;
    }

    public void setEnableEventSizeLimiting(boolean z10) {
        this.enableEventSizeLimiting = z10;
    }

    public void setEnableExternalConfiguration(boolean z10) {
        this.enableExternalConfiguration = z10;
    }

    public void setEnablePrettySerializationOutput(boolean z10) {
        this.enablePrettySerializationOutput = z10;
    }

    public void setEnableScopePersistence(boolean z10) {
        this.enableScopePersistence = z10;
    }

    public void setEnableScreenTracking(boolean z10) {
        this.enableScreenTracking = z10;
    }

    public void setEnableShutdownHook(boolean z10) {
        this.enableShutdownHook = z10;
    }

    public void setEnableSpotlight(boolean z10) {
        this.enableSpotlight = z10;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z10) {
        this.enableTimeToFullDisplayTracing = z10;
    }

    public void setEnableUncaughtExceptionHandler(boolean z10) {
        this.enableUncaughtExceptionHandler = z10;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z10) {
        this.enableUserInteractionBreadcrumbs = z10;
    }

    public void setEnableUserInteractionTracing(boolean z10) {
        this.enableUserInteractionTracing = z10;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.r.b();
        }
        this.envelopeDiskCache = gVar;
    }

    public void setEnvelopeReader(P p10) {
        io.sentry.util.p pVar = this.envelopeReader;
        if (p10 == null) {
            p10 = L0.b();
        }
        pVar.c(p10);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(InterfaceC5187d0 interfaceC5187d0) {
        if (interfaceC5187d0 != null) {
            this.executorService = interfaceC5187d0;
        }
    }

    public void setFatalLogger(ILogger iLogger) {
        if (iLogger == null) {
            iLogger = N0.e();
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(C5117a3 c5117a3) {
        this.feedbackOptions = c5117a3;
    }

    public void setFlushTimeoutMillis(long j10) {
        this.flushTimeoutMillis = j10;
    }

    public void setForceInit(boolean z10) {
        this.forceInit = z10;
    }

    public void setFullyDisplayedReporter(G g10) {
        this.fullyDisplayedReporter = g10;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l10) {
        this.idleTimeout = l10;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new F(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new F(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new F(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new F(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(EnumC5237n0 enumC5237n0) {
        this.initPriority = enumC5237n0;
    }

    @Deprecated
    public void setInstrumenter(EnumC5242o0 enumC5242o0) {
        this.instrumenter = enumC5242o0;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? N0.e() : new r(this, iLogger);
    }

    public void setLogs(h hVar) {
        this.logs = hVar;
    }

    public void setMaxAttachmentSize(long j10) {
        this.maxAttachmentSize = j10;
    }

    public void setMaxBreadcrumbs(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public void setMaxCacheItems(int i10) {
        this.maxCacheItems = i10;
    }

    public void setMaxDepth(int i10) {
        this.maxDepth = i10;
    }

    public void setMaxFeatureFlags(int i10) {
        this.maxFeatureFlags = i10;
    }

    public void setMaxQueueSize(int i10) {
        if (i10 > 0) {
            this.maxQueueSize = i10;
        }
    }

    public void setMaxRequestBodySize(n nVar) {
        this.maxRequestBodySize = nVar;
    }

    public void setMaxSpans(int i10) {
        this.maxSpans = i10;
    }

    public void setMaxTraceFileSize(long j10) {
        this.maxTraceFileSize = j10;
    }

    public void setMetrics(i iVar) {
        this.metrics = iVar;
    }

    public void setModulesLoader(io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setOpenTelemetryMode(EnumC5280t3 enumC5280t3) {
        this.openTelemetryMode = enumC5280t3;
    }

    public void setPrintUncaughtStackTrace(boolean z10) {
        this.printUncaughtStackTrace = z10;
    }

    public void setProfileLifecycle(EnumC5278t1 enumC5278t1) {
        this.profileLifecycle = enumC5278t1;
        if (enumC5278t1 != EnumC5278t1.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.c(EnumC5215i3.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d10) {
        if (io.sentry.util.A.c(d10)) {
            this.profileSessionSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(X x10) {
        this.profilerConverter = x10;
    }

    public void setProfilesSampleRate(Double d10) {
        if (io.sentry.util.A.d(d10)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i10) {
        this.profilingTracesHz = i10;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z10) {
        this.propagateTraceparent = z10;
    }

    public void setProxy(m mVar) {
        this.proxy = mVar;
    }

    public void setReadTimeoutMillis(int i10) {
        this.readTimeoutMillis = i10;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(InterfaceC5320z1 interfaceC5320z1) {
        if (interfaceC5320z1 == null) {
            interfaceC5320z1 = Q0.a();
        }
        this.replayController = interfaceC5320z1;
    }

    public void setRuntimeManager(io.sentry.util.runtime.a aVar) {
        this.runtimeManager = aVar;
    }

    public void setSampleRate(Double d10) {
        if (io.sentry.util.A.f(d10)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.r rVar) {
        io.sentry.protocol.r rVarO = getSessionReplay().o();
        io.sentry.protocol.r rVar2 = this.sdkVersion;
        if (rVar2 != null && rVarO != null && rVar2.equals(rVarO)) {
            getSessionReplay().M(rVar);
        }
        this.sdkVersion = rVar;
    }

    public void setSendClientReports(boolean z10) {
        this.sendClientReports = z10;
        if (z10) {
            this.clientReportRecorder = new io.sentry.clientreport.e(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.j();
        }
    }

    public void setSendDefaultPii(boolean z10) {
        this.sendDefaultPii = z10;
    }

    public void setSendModules(boolean z10) {
        this.sendModules = z10;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC5197f0 interfaceC5197f0) {
        io.sentry.util.p pVar = this.serializer;
        if (interfaceC5197f0 == null) {
            interfaceC5197f0 = C5178b1.g();
        }
        pVar.c(interfaceC5197f0);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j10) {
        this.sessionFlushTimeoutMillis = j10;
    }

    public void setSessionReplay(B3 b32) {
        this.sessionReplay = b32;
    }

    public void setSessionTrackingIntervalMillis(long j10) {
        this.sessionTrackingIntervalMillis = j10;
    }

    public void setShutdownTimeoutMillis(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setSocketTagger(InterfaceC5202g0 interfaceC5202g0) {
        if (interfaceC5202g0 == null) {
            interfaceC5202g0 = C5183c1.c();
        }
        this.socketTagger = interfaceC5202g0;
    }

    public void setSpanFactory(InterfaceC5212i0 interfaceC5212i0) {
        this.spanFactory = interfaceC5212i0;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z10) {
        this.startProfilerOnAppStart = z10;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z10) {
        this.traceOptionsRequests = z10;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z10) {
        this.traceSampling = z10;
    }

    public void setTracesSampleRate(Double d10) {
        if (io.sentry.util.A.g(d10)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTransactionProfiler(InterfaceC5222k0 interfaceC5222k0) {
        if (this.transactionProfiler != C5203g1.c() || interfaceC5222k0 == null) {
            return;
        }
        this.transactionProfiler = interfaceC5222k0;
    }

    public void setTransportFactory(InterfaceC5227l0 interfaceC5227l0) {
        if (interfaceC5227l0 == null) {
            interfaceC5227l0 = C5208h1.b();
        }
        this.transportFactory = interfaceC5227l0;
    }

    public void setTransportGate(io.sentry.transport.q qVar) {
        if (qVar == null) {
            qVar = io.sentry.transport.t.a();
        }
        this.transportGate = qVar;
    }

    public void setVersionDetector(InterfaceC5232m0 interfaceC5232m0) {
        this.versionDetector = interfaceC5232m0;
    }

    public void setViewHierarchyExporters(List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private C5322z3(boolean z10) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.p(new p.a() { // from class: io.sentry.u3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return C5322z3.b(this.f51410a);
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = N0.e();
        this.fatalLogger = N0.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.p(new p.a() { // from class: io.sentry.v3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return C5322z3.d(this.f51485a);
            }
        });
        this.envelopeReader = new io.sentry.util.p(new p.a() { // from class: io.sentry.w3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return C5322z3.c(this.f51546a);
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C5208h1.b();
        this.transportGate = io.sentry.transport.t.a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = HTTPTimeoutManager.DEFAULT_TIMEOUT_MS;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C5115a1.e();
        this.connectionTimeoutMillis = Constants.CONNECTION_TIMEOUT_VERIFY;
        this.readTimeoutMillis = Constants.CONNECTION_TIMEOUT_VERIFY;
        this.envelopeDiskCache = io.sentry.transport.r.b();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = n.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C5203g1.c();
        this.continuousProfiler = J0.a();
        this.profilerConverter = O0.b();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.e(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC5242o0.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.d();
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.p(new p.a() { // from class: io.sentry.x3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return C5322z3.a();
            }
        });
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = H0.g();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = G.a();
        this.connectionStatusProvider = new I0();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.b();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = C5193e1.b();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = Q0.a();
        this.distributionController = K0.a();
        this.enableScreenTracking = true;
        this.defaultScopeType = I1.ISOLATION;
        this.initPriority = EnumC5237n0.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new C5288a();
        this.openTelemetryMode = EnumC5280t3.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = C5213i1.b();
        this.profileLifecycle = EnumC5278t1.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = HTTPTimeoutManager.DEFAULT_TIMEOUT_MS;
        this.logs = new h();
        this.metrics = new i();
        this.socketTagger = C5183c1.c();
        this.runtimeManager = new io.sentry.util.runtime.b();
        this.distribution = new g();
        io.sentry.protocol.r rVarCreateSdkVersion = createSdkVersion();
        this.experimental = new D(z10, rVarCreateSdkVersion);
        this.sessionReplay = new B3(z10, rVarCreateSdkVersion);
        this.feedbackOptions = new C5117a3(new C5117a3.a() { // from class: io.sentry.y3
        });
        if (z10) {
            return;
        }
        setSpanFactory(U3.a(new io.sentry.util.s(), N0.e()));
        Z2 z22 = new Z2(this);
        this.executorService = z22;
        z22.b();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new D0(this));
        copyOnWriteArrayList.add(new C5303w(this));
        if (io.sentry.util.y.c()) {
            copyOnWriteArrayList.add(new C3());
        }
        setSentryClientName("sentry.java/8.31.0");
        setSdkVersion(rVarCreateSdkVersion);
        e();
    }

    public void setBeforeSendReplay(d dVar) {
    }

    public void setBeforeSendTransaction(e eVar) {
    }

    public void setOnDiscard(j jVar) {
    }

    public void setOnOversizedEvent(k kVar) {
    }

    public void setProfilesSampler(l lVar) {
    }

    public void setTracesSampler(o oVar) {
    }
}
