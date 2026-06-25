package io.sentry;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i4 f49094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f49095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f49096c;

    public D1(i4 i4Var, AbstractC5216j abstractC5216j, Double d10, Map map) {
        this.f49094a = (i4) io.sentry.util.w.c(i4Var, "transactionContexts is required");
        this.f49095b = d10;
        this.f49096c = map == null ? Collections.EMPTY_MAP : map;
    }

    public Double a() {
        return this.f49095b;
    }

    public i4 b() {
        return this.f49094a;
    }
}
