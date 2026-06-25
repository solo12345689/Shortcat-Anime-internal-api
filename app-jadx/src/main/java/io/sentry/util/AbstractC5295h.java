package io.sentry.util;

import java.util.Set;

/* JADX INFO: renamed from: io.sentry.util.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5295h {
    public static Throwable a(Throwable th2) {
        w.c(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static boolean b(Set set, Throwable th2) {
        return set.contains(th2.getClass());
    }
}
