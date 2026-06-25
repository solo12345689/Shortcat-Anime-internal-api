package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5231m implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f50827a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5322z3 f50828b;

    public C5231m(C5322z3 c5322z3) {
        this.f50828b = c5322z3;
    }

    @Override // io.sentry.C
    public V2 b(V2 v22, H h10) {
        io.sentry.protocol.s sVarX0;
        String strK;
        Long lJ;
        if (!io.sentry.util.l.f(h10, UncaughtExceptionHandlerIntegration.a.class) || (sVarX0 = v22.x0()) == null || (strK = sVarX0.k()) == null || (lJ = sVarX0.j()) == null) {
            return v22;
        }
        Long l10 = (Long) this.f50827a.get(strK);
        if (l10 == null || l10.equals(lJ)) {
            this.f50827a.put(strK, lJ);
            return v22;
        }
        this.f50828b.getLogger().c(EnumC5215i3.INFO, "Event %s has been dropped due to multi-threaded deduplication", v22.G());
        io.sentry.util.l.k(h10, io.sentry.hints.h.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
