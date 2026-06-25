package io.sentry.util;

import io.sentry.EnumC5215i3;
import io.sentry.ILogger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t {
    public static void a(Class cls, Object obj, ILogger iLogger) {
        iLogger.c(EnumC5215i3.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
