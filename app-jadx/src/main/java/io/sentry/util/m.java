package io.sentry.util;

import io.sentry.C5213i1;
import io.sentry.C5322z3;
import io.sentry.E0;
import io.sentry.EnumC5215i3;
import io.sentry.J0;
import io.sentry.N;
import io.sentry.O0;
import io.sentry.X;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {
    private static String a(C5322z3 c5322z3) {
        String profilingTracesDirPath = c5322z3.getProfilingTracesDirPath();
        if (profilingTracesDirPath != null) {
            return profilingTracesDirPath;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            String absolutePath = file.getAbsolutePath();
            c5322z3.setProfilingTracesDirPath(absolutePath);
            return absolutePath;
        }
        throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
    }

    public static X b(C5322z3 c5322z3) {
        if (!e(c5322z3)) {
            return c5322z3.getProfilerConverter();
        }
        X xB = io.sentry.profiling.c.b();
        if (xB instanceof O0) {
            c5322z3.getLogger().c(EnumC5215i3.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
        } else {
            c5322z3.setProfilerConverter(xB);
            c5322z3.getLogger().c(EnumC5215i3.INFO, "Successfully loaded profile converter", new Object[0]);
        }
        return c5322z3.getProfilerConverter();
    }

    public static N c(C5322z3 c5322z3) {
        if (!f(c5322z3)) {
            return c5322z3.getContinuousProfiler();
        }
        try {
            N nA = io.sentry.profiling.c.a(c5322z3.getLogger(), a(c5322z3), c5322z3.getProfilingTracesHz(), c5322z3.getExecutorService());
            if (nA instanceof J0) {
                c5322z3.getLogger().c(EnumC5215i3.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            } else {
                c5322z3.setContinuousProfiler(nA);
                c5322z3.getLogger().c(EnumC5215i3.INFO, "Successfully loaded profiler", new Object[0]);
            }
        } catch (Exception e10) {
            c5322z3.getLogger().b(EnumC5215i3.ERROR, "Failed to create default profiling traces directory", e10);
        }
        return c5322z3.getContinuousProfiler();
    }

    public static boolean d(C5322z3 c5322z3, C5322z3 c5322z32, boolean z10) {
        if (y.c() && (c5322z32.getVersionDetector() instanceof C5213i1)) {
            c5322z32.setVersionDetector(new E0(c5322z32));
        }
        if (!c5322z32.getVersionDetector().a()) {
            return !z10 || c5322z3 == null || c5322z32.isForceInit() || c5322z3.getInitPriority().ordinal() <= c5322z32.getInitPriority().ordinal();
        }
        c5322z32.getLogger().c(EnumC5215i3.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See " + (y.a() ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions") + " for more details.");
    }

    private static boolean e(C5322z3 c5322z3) {
        return y.c() && c5322z3.isContinuousProfilingEnabled() && (c5322z3.getProfilerConverter() instanceof O0);
    }

    private static boolean f(C5322z3 c5322z3) {
        return y.c() && c5322z3.isContinuousProfilingEnabled() && (c5322z3.getContinuousProfiler() instanceof J0);
    }
}
