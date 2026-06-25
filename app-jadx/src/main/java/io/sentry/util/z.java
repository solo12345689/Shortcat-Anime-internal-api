package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicLong f51444c = new AtomicLong(System.nanoTime());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f51445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f51446b;

    public z() {
        this(a(), a());
    }

    private static long a() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        do {
            atomicLong = f51444c;
            j10 = atomicLong.get();
            long j12 = (j10 >> 12) ^ j10;
            long j13 = j12 ^ (j12 << 25);
            j11 = (j13 ^ (j13 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j10, j11));
        return j11;
    }

    public void b(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            this.f51445a = (this.f51445a * 6364136223846793005L) + this.f51446b;
            bArr[i10] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        }
    }

    public double c() {
        long j10 = this.f51445a * 6364136223846793005L;
        long j11 = this.f51446b;
        long j12 = j10 + j11;
        long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L;
        this.f51445a = (j12 * 6364136223846793005L) + j11;
        return (((j13 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }

    public void d(long j10, long j11) {
        long j12 = (j11 << 1) | 1;
        this.f51446b = j12;
        this.f51445a = j12 + j10;
    }

    public z(long j10, long j11) {
        d(j10, j11);
    }
}
