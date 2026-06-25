package io.sentry;

import io.sentry.util.C5288a;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class K {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile K f49207i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f49209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f49210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f49211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f49212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Callable f49213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f49214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f49205g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f49206h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C5288a f49208j = new C5288a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49215a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i10 = this.f49215a;
            this.f49215a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private K() {
        this(f49205g);
    }

    public static /* synthetic */ Void b(K k10) {
        k10.getClass();
        try {
            k10.f49210b = ((InetAddress) k10.f49213e.call()).getCanonicalHostName();
            k10.f49211c = System.currentTimeMillis() + k10.f49209a;
            k10.f49212d.set(false);
            return null;
        } catch (Throwable th2) {
            k10.f49212d.set(false);
            throw th2;
        }
    }

    public static K e() {
        if (f49207i == null) {
            InterfaceC5192e0 interfaceC5192e0A = f49208j.a();
            try {
                if (f49207i == null) {
                    f49207i = new K();
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } catch (Throwable th2) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f49207i;
    }

    private void f() {
        this.f49211c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    private void g() {
        try {
            this.f49214f.submit(new Callable() { // from class: io.sentry.J
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return K.b(this.f49201a);
                }
            }).get(f49206h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    void c() {
        this.f49214f.shutdown();
    }

    public String d() {
        if (this.f49211c < System.currentTimeMillis() && this.f49212d.compareAndSet(false, true)) {
            g();
        }
        return this.f49210b;
    }

    K(long j10) {
        this(j10, new Callable() { // from class: io.sentry.I
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    K(long j10, Callable callable) {
        this.f49212d = new AtomicBoolean(false);
        this.f49214f = Executors.newSingleThreadExecutor(new b());
        this.f49209a = j10;
        this.f49213e = (Callable) io.sentry.util.w.c(callable, "getLocalhost is required");
        g();
    }
}
