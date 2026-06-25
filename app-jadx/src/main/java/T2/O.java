package t2;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f60548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f60549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f60550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f60551d = new ThreadLocal();

    public O(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return a0.m1(j10, 1000000L, 90000L);
    }

    public static long k(long j10) {
        return a0.m1(j10, 90000L, 1000000L);
    }

    public static long l(long j10) {
        return k(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f60548a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) AbstractC6614a.e((Long) this.f60551d.get())).longValue();
                }
                this.f60549b = jLongValue - j10;
                notifyAll();
            }
            this.f60550c = j10;
            return j10 + this.f60549b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f60550c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = (4294967296L + jK) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                j10 += j12 * 8589934592L;
                if (Math.abs(j13 - jK) < Math.abs(j10 - jK)) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f60550c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = jK / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 += (j12 + 1) * 8589934592L;
                if (j13 >= jK) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long d() {
        long j10;
        j10 = this.f60548a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f60550c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != -9223372036854775807L ? j10 + this.f60549b : d();
    }

    public synchronized long f() {
        return this.f60549b;
    }

    public synchronized boolean g() {
        return this.f60549b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f60548a = j10;
        this.f60549b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f60550c = -9223372036854775807L;
    }

    public synchronized void j(boolean z10, long j10, long j11) {
        try {
            AbstractC6614a.g(this.f60548a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z10) {
                this.f60551d.set(Long.valueOf(j10));
            } else {
                long jElapsedRealtime = 0;
                long j12 = j11;
                while (!g()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        AbstractC6614a.g(j12 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j12);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j11 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                        }
                        j12 = j11 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
