package io.sentry.util;

import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.util.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class s {
    public boolean c(String str, ILogger iLogger) {
        return g(str, iLogger) != null;
    }

    public boolean d(String str, C5322z3 c5322z3) {
        return c(str, c5322z3 != null ? c5322z3.getLogger() : null);
    }

    public p e(final String str, final ILogger iLogger) {
        return new p(new p.a() { // from class: io.sentry.util.r
            @Override // io.sentry.util.p.a
            public final Object a() {
                return Boolean.valueOf(this.f51431a.c(str, iLogger));
            }
        });
    }

    public p f(final String str, final C5322z3 c5322z3) {
        return new p(new p.a() { // from class: io.sentry.util.q
            @Override // io.sentry.util.p.a
            public final Object a() {
                return Boolean.valueOf(this.f51428a.d(str, c5322z3));
            }
        });
    }

    public Class g(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.c(EnumC5215i3.INFO, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e10) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(EnumC5215i3.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e10);
            return null;
        } catch (Throwable th2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(EnumC5215i3.ERROR, "Failed to initialize " + str, th2);
            return null;
        }
    }
}
