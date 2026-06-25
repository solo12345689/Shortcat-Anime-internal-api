package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class R1 {
    public static InterfaceC5177b0 a(io.sentry.util.s sVar, ILogger iLogger) {
        InterfaceC5177b0 interfaceC5177b0B = b(sVar, iLogger);
        interfaceC5177b0B.a();
        return interfaceC5177b0B;
    }

    private static InterfaceC5177b0 b(io.sentry.util.s sVar, ILogger iLogger) {
        Class clsG;
        if (io.sentry.util.y.c() && sVar.c("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger) && (clsG = sVar.g("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger)) != null) {
            try {
                Object objNewInstance = clsG.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof InterfaceC5177b0)) {
                    return (InterfaceC5177b0) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C5241o();
    }
}
