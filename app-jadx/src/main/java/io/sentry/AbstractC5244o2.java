package io.sentry;

/* JADX INFO: renamed from: io.sentry.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5244o2 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC5244o2 abstractC5244o2) {
        return Long.valueOf(m()).compareTo(Long.valueOf(abstractC5244o2.m()));
    }

    public long b(AbstractC5244o2 abstractC5244o2) {
        return m() - abstractC5244o2.m();
    }

    public final boolean c(AbstractC5244o2 abstractC5244o2) {
        return b(abstractC5244o2) > 0;
    }

    public final boolean h(AbstractC5244o2 abstractC5244o2) {
        return b(abstractC5244o2) < 0;
    }

    public long k(AbstractC5244o2 abstractC5244o2) {
        return (abstractC5244o2 == null || compareTo(abstractC5244o2) >= 0) ? m() : abstractC5244o2.m();
    }

    public abstract long m();
}
