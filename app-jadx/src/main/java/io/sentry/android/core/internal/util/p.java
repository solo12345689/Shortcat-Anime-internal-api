package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f49911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.o f49912b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49914d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f49913c = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f49915e = new AtomicLong(0);

    public p(io.sentry.transport.o oVar, long j10, int i10) {
        this.f49912b = oVar;
        this.f49911a = j10;
        this.f49914d = i10 <= 0 ? 1 : i10;
    }

    public boolean a() {
        long currentTimeMillis = this.f49912b.getCurrentTimeMillis();
        if (this.f49915e.get() == 0 || this.f49915e.get() + this.f49911a <= currentTimeMillis) {
            this.f49913c.set(0);
            this.f49915e.set(currentTimeMillis);
            return false;
        }
        if (this.f49913c.incrementAndGet() < this.f49914d) {
            return false;
        }
        this.f49913c.set(0);
        return true;
    }
}
