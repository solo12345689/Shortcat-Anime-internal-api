package io.sentry;

import java.util.Date;

/* JADX INFO: renamed from: io.sentry.r3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5270r3 extends AbstractC5244o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f51198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f51199b;

    public C5270r3() {
        this(AbstractC5226l.d(), System.nanoTime());
    }

    private long n(C5270r3 c5270r3, C5270r3 c5270r32) {
        return c5270r3.m() + (c5270r32.f51199b - c5270r3.f51199b);
    }

    @Override // io.sentry.AbstractC5244o2, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public int compareTo(AbstractC5244o2 abstractC5244o2) {
        if (!(abstractC5244o2 instanceof C5270r3)) {
            return super.compareTo(abstractC5244o2);
        }
        C5270r3 c5270r3 = (C5270r3) abstractC5244o2;
        long time = this.f51198a.getTime();
        long time2 = c5270r3.f51198a.getTime();
        return time == time2 ? Long.valueOf(this.f51199b).compareTo(Long.valueOf(c5270r3.f51199b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC5244o2
    public long b(AbstractC5244o2 abstractC5244o2) {
        return abstractC5244o2 instanceof C5270r3 ? this.f51199b - ((C5270r3) abstractC5244o2).f51199b : super.b(abstractC5244o2);
    }

    @Override // io.sentry.AbstractC5244o2
    public long k(AbstractC5244o2 abstractC5244o2) {
        if (abstractC5244o2 == null || !(abstractC5244o2 instanceof C5270r3)) {
            return super.k(abstractC5244o2);
        }
        C5270r3 c5270r3 = (C5270r3) abstractC5244o2;
        return compareTo(abstractC5244o2) < 0 ? n(this, c5270r3) : n(c5270r3, this);
    }

    @Override // io.sentry.AbstractC5244o2
    public long m() {
        return AbstractC5226l.a(this.f51198a);
    }

    public C5270r3(Date date, long j10) {
        this.f51198a = date;
        this.f51199b = j10;
    }
}
