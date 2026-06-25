package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class U3 {
    public static InterfaceC5212i0 a(io.sentry.util.s sVar, ILogger iLogger) {
        Class clsG;
        if (io.sentry.util.y.c() && sVar.c("io.sentry.opentelemetry.OtelSpanFactory", iLogger) && (clsG = sVar.g("io.sentry.opentelemetry.OtelSpanFactory", iLogger)) != null) {
            try {
                Object objNewInstance = clsG.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof InterfaceC5212i0)) {
                    return (InterfaceC5212i0) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C5246p();
    }
}
