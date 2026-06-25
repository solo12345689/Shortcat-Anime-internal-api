package pa;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: pa.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C5954e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f55863d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f55864e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f55865a = i.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f55866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55867c;

    C5954e() {
    }

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f55867c) + this.f55865a.e(), f55864e);
        }
        return f55863d;
    }

    private static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f55867c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f55867c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            com.google.firebase.installations.i r0 = r4.f55865a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f55866b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.C5954e.b():boolean");
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f55867c++;
        this.f55866b = this.f55865a.a() + a(i10);
    }
}
