package k5;

import U4.q;
import android.graphics.drawable.Drawable;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.InterfaceC5642b;
import o5.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d implements InterfaceFutureC5450b, e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f52082k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f52085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f52086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f52087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC5451c f52088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f52090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f52091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q f52092j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j10) throws InterruptedException {
            obj.wait(j10);
        }
    }

    public d(int i10, int i11) {
        this(i10, i11, true, f52082k);
    }

    private synchronized Object o(Long l10) {
        try {
            if (this.f52085c && !isDone()) {
                l.a();
            }
            if (this.f52089g) {
                throw new CancellationException();
            }
            if (this.f52091i) {
                throw new ExecutionException(this.f52092j);
            }
            if (this.f52090h) {
                return this.f52087e;
            }
            if (l10 == null) {
                this.f52086d.b(this, 0L);
            } else if (l10.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l10.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f52086d.b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f52091i) {
                throw new ExecutionException(this.f52092j);
            }
            if (this.f52089g) {
                throw new CancellationException();
            }
            if (!this.f52090h) {
                throw new TimeoutException();
            }
            return this.f52087e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // l5.d
    public synchronized InterfaceC5451c c() {
        return this.f52088f;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f52089g = true;
                this.f52086d.a(this);
                InterfaceC5451c interfaceC5451c = null;
                if (z10) {
                    InterfaceC5451c interfaceC5451c2 = this.f52088f;
                    this.f52088f = null;
                    interfaceC5451c = interfaceC5451c2;
                }
                if (interfaceC5451c != null) {
                    interfaceC5451c.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k5.e
    public synchronized boolean e(Object obj, Object obj2, l5.d dVar, S4.a aVar, boolean z10) {
        this.f52090h = true;
        this.f52087e = obj;
        this.f52086d.a(this);
        return false;
    }

    @Override // k5.e
    public synchronized boolean g(q qVar, Object obj, l5.d dVar, boolean z10) {
        this.f52091i = true;
        this.f52092j = qVar;
        this.f52086d.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            return o(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f52089g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f52089g     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f52090h     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f52091i     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.d.isDone():boolean");
    }

    @Override // l5.d
    public synchronized void j(InterfaceC5451c interfaceC5451c) {
        this.f52088f = interfaceC5451c;
    }

    @Override // l5.d
    public synchronized void l(Drawable drawable) {
    }

    @Override // l5.d
    public synchronized void m(Object obj, InterfaceC5642b interfaceC5642b) {
    }

    @Override // l5.d
    public void n(l5.c cVar) {
        cVar.c(this.f52083a, this.f52084b);
    }

    public String toString() {
        InterfaceC5451c interfaceC5451c;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                interfaceC5451c = null;
                if (this.f52089g) {
                    str = "CANCELLED";
                } else if (this.f52091i) {
                    str = "FAILURE";
                } else if (this.f52090h) {
                    str = HybridPurchaseLogicBridge.RESULT_SUCCESS;
                } else {
                    str = "PENDING";
                    interfaceC5451c = this.f52088f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC5451c == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + interfaceC5451c + "]]";
    }

    d(int i10, int i11, boolean z10, a aVar) {
        this.f52083a = i10;
        this.f52084b = i11;
        this.f52085c = z10;
        this.f52086d = aVar;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return o(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // h5.l
    public void a() {
    }

    @Override // h5.l
    public void b() {
    }

    @Override // h5.l
    public void d() {
    }

    @Override // l5.d
    public void f(l5.c cVar) {
    }

    @Override // l5.d
    public void h(Drawable drawable) {
    }

    @Override // l5.d
    public void i(Drawable drawable) {
    }
}
