package io.sentry.profiling;

import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5187d0;
import io.sentry.J0;
import io.sentry.N;
import io.sentry.O0;
import io.sentry.Q1;
import io.sentry.X;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static N a(ILogger iLogger, String str, int i10, InterfaceC5187d0 interfaceC5187d0) {
        try {
            android.support.v4.media.session.b.a(c(a.class));
            iLogger.c(EnumC5215i3.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
            return J0.a();
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th2);
            return J0.a();
        }
    }

    public static X b() {
        ILogger logger = Q1.b().v().h().getLogger();
        try {
            android.support.v4.media.session.b.a(c(b.class));
            logger.c(EnumC5215i3.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
            return O0.b();
        } catch (Throwable th2) {
            logger.b(EnumC5215i3.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
            return O0.b();
        }
    }

    private static Object c(Class cls) {
        Iterator it = ServiceLoader.load(cls).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
