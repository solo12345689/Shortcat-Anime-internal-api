package io.sentry;

import java.time.Instant;

/* JADX INFO: renamed from: io.sentry.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5195e3 extends AbstractC5244o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Instant f50658a;

    public C5195e3() {
        this(Instant.now());
    }

    @Override // io.sentry.AbstractC5244o2
    public long m() {
        return AbstractC5226l.n(this.f50658a.getEpochSecond()) + ((long) this.f50658a.getNano());
    }

    public C5195e3(Instant instant) {
        this.f50658a = instant;
    }
}
