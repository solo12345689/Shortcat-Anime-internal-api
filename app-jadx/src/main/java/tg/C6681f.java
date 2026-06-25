package tg;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tg.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C6681f extends a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f61020i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f61021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Condition f61022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f61023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f61024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C6681f f61025n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f61026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C6681f f61027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f61028h;

    /* JADX INFO: renamed from: tg.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C6681f c6681f) {
            ReentrantLock reentrantLockF = C6681f.f61020i.f();
            reentrantLockF.lock();
            try {
                if (!c6681f.f61026f) {
                    return false;
                }
                c6681f.f61026f = false;
                for (C6681f c6681f2 = C6681f.f61025n; c6681f2 != null; c6681f2 = c6681f2.f61027g) {
                    if (c6681f2.f61027g == c6681f) {
                        c6681f2.f61027g = c6681f.f61027g;
                        c6681f.f61027g = null;
                        return false;
                    }
                }
                reentrantLockF.unlock();
                return true;
            } finally {
                reentrantLockF.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C6681f c6681f, long j10, boolean z10) {
            ReentrantLock reentrantLockF = C6681f.f61020i.f();
            reentrantLockF.lock();
            try {
                if (c6681f.f61026f) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                c6681f.f61026f = true;
                if (C6681f.f61025n == null) {
                    C6681f.f61025n = new C6681f();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    c6681f.f61028h = Math.min(j10, c6681f.c() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    c6681f.f61028h = j10 + jNanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    c6681f.f61028h = c6681f.c();
                }
                long jY = c6681f.y(jNanoTime);
                C6681f c6681f2 = C6681f.f61025n;
                AbstractC5504s.e(c6681f2);
                while (c6681f2.f61027g != null) {
                    C6681f c6681f3 = c6681f2.f61027g;
                    AbstractC5504s.e(c6681f3);
                    if (jY < c6681f3.y(jNanoTime)) {
                        break;
                    }
                    c6681f2 = c6681f2.f61027g;
                    AbstractC5504s.e(c6681f2);
                }
                c6681f.f61027g = c6681f2.f61027g;
                c6681f2.f61027g = c6681f;
                if (c6681f2 == C6681f.f61025n) {
                    C6681f.f61020i.e().signal();
                }
                Td.L l10 = Td.L.f17438a;
                reentrantLockF.unlock();
            } catch (Throwable th2) {
                reentrantLockF.unlock();
                throw th2;
            }
        }

        public final C6681f c() throws InterruptedException {
            C6681f c6681f = C6681f.f61025n;
            AbstractC5504s.e(c6681f);
            C6681f c6681f2 = c6681f.f61027g;
            if (c6681f2 == null) {
                long jNanoTime = System.nanoTime();
                e().await(C6681f.f61023l, TimeUnit.MILLISECONDS);
                C6681f c6681f3 = C6681f.f61025n;
                AbstractC5504s.e(c6681f3);
                if (c6681f3.f61027g != null || System.nanoTime() - jNanoTime < C6681f.f61024m) {
                    return null;
                }
                return C6681f.f61025n;
            }
            long jY = c6681f2.y(System.nanoTime());
            if (jY > 0) {
                e().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            C6681f c6681f4 = C6681f.f61025n;
            AbstractC5504s.e(c6681f4);
            c6681f4.f61027g = c6681f2.f61027g;
            c6681f2.f61027g = null;
            return c6681f2;
        }

        public final Condition e() {
            return C6681f.f61022k;
        }

        public final ReentrantLock f() {
            return C6681f.f61021j;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: tg.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockF;
            C6681f c6681fC;
            while (true) {
                try {
                    a aVar = C6681f.f61020i;
                    reentrantLockF = aVar.f();
                    reentrantLockF.lock();
                    try {
                        c6681fC = aVar.c();
                    } finally {
                        reentrantLockF.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c6681fC == C6681f.f61025n) {
                    C6681f.f61025n = null;
                    return;
                }
                Td.L l10 = Td.L.f17438a;
                reentrantLockF.unlock();
                if (c6681fC != null) {
                    c6681fC.B();
                }
            }
        }
    }

    /* JADX INFO: renamed from: tg.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements X {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ X f61030b;

        c(X x10) {
            this.f61030b = x10;
        }

        @Override // tg.X
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6681f t() {
            return C6681f.this;
        }

        @Override // tg.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C6681f c6681f = C6681f.this;
            X x10 = this.f61030b;
            c6681f.v();
            try {
                x10.close();
                Td.L l10 = Td.L.f17438a;
                if (c6681f.w()) {
                    throw c6681f.p(null);
                }
            } catch (IOException e10) {
                if (!c6681f.w()) {
                    throw e10;
                }
                throw c6681f.p(e10);
            } finally {
                c6681f.w();
            }
        }

        @Override // tg.X, java.io.Flushable
        public void flush() throws IOException {
            C6681f c6681f = C6681f.this;
            X x10 = this.f61030b;
            c6681f.v();
            try {
                x10.flush();
                Td.L l10 = Td.L.f17438a;
                if (c6681f.w()) {
                    throw c6681f.p(null);
                }
            } catch (IOException e10) {
                if (!c6681f.w()) {
                    throw e10;
                }
                throw c6681f.p(e10);
            } finally {
                c6681f.w();
            }
        }

        @Override // tg.X
        public void t0(C6683h source, long j10) throws IOException {
            AbstractC5504s.h(source, "source");
            AbstractC6680e.b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                U u10 = source.f61033a;
                AbstractC5504s.e(u10);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (u10.f60988c - u10.f60987b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        u10 = u10.f60991f;
                        AbstractC5504s.e(u10);
                    }
                }
                C6681f c6681f = C6681f.this;
                X x10 = this.f61030b;
                c6681f.v();
                try {
                    try {
                        x10.t0(source, j11);
                        Td.L l10 = Td.L.f17438a;
                        if (c6681f.w()) {
                            throw c6681f.p(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!c6681f.w()) {
                            throw e10;
                        }
                        throw c6681f.p(e10);
                    }
                } catch (Throwable th2) {
                    c6681f.w();
                    throw th2;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f61030b + ')';
        }
    }

    /* JADX INFO: renamed from: tg.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z f61032b;

        d(Z z10) {
            this.f61032b = z10;
        }

        @Override // tg.Z
        public long N0(C6683h sink, long j10) throws IOException {
            AbstractC5504s.h(sink, "sink");
            C6681f c6681f = C6681f.this;
            Z z10 = this.f61032b;
            c6681f.v();
            try {
                long jN0 = z10.N0(sink, j10);
                if (c6681f.w()) {
                    throw c6681f.p(null);
                }
                return jN0;
            } catch (IOException e10) {
                if (c6681f.w()) {
                    throw c6681f.p(e10);
                }
                throw e10;
            } finally {
                c6681f.w();
            }
        }

        @Override // tg.Z
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6681f t() {
            return C6681f.this;
        }

        @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C6681f c6681f = C6681f.this;
            Z z10 = this.f61032b;
            c6681f.v();
            try {
                z10.close();
                Td.L l10 = Td.L.f17438a;
                if (c6681f.w()) {
                    throw c6681f.p(null);
                }
            } catch (IOException e10) {
                if (!c6681f.w()) {
                    throw e10;
                }
                throw c6681f.p(e10);
            } finally {
                c6681f.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f61032b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f61021j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC5504s.g(conditionNewCondition, "newCondition(...)");
        f61022k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f61023l = millis;
        f61024m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j10) {
        return this.f61028h - j10;
    }

    public final Z A(Z source) {
        AbstractC5504s.h(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            f61020i.g(this, jH, zE);
        }
    }

    public final boolean w() {
        return f61020i.d(this);
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final X z(X sink) {
        AbstractC5504s.h(sink, "sink");
        return new c(sink);
    }

    protected void B() {
    }
}
