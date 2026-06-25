package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class N3 implements G0 {

    /* JADX INFO: renamed from: d */
    static final boolean f40232d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.f34641ag));

    /* JADX INFO: renamed from: e */
    private static final Logger f40233e = Logger.getLogger(N3.class.getName());

    /* JADX INFO: renamed from: f */
    static final H0 f40234f;

    /* JADX INFO: renamed from: g */
    private static final Object f40235g;

    /* JADX INFO: renamed from: a */
    volatile Object f40236a;

    /* JADX INFO: renamed from: b */
    volatile C3730s2 f40237b;

    /* JADX INFO: renamed from: c */
    volatile L3 f40238c;

    static {
        H0 k32;
        try {
            k32 = new C3707n3(AtomicReferenceFieldUpdater.newUpdater(L3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(L3.class, L3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(N3.class, L3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(N3.class, C3730s2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(N3.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            k32 = new K3();
        }
        Throwable th3 = th;
        f40234f = k32;
        if (th3 != null) {
            f40233e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f40235g = new Object();
    }

    protected N3() {
    }

    static void b(N3 n32) {
        L3 l32;
        H0 h02;
        C3730s2 c3730s2;
        C3730s2 c3730s22;
        C3730s2 c3730s23;
        do {
            l32 = n32.f40238c;
            h02 = f40234f;
        } while (!h02.e(n32, l32, L3.f40222c));
        while (true) {
            c3730s2 = null;
            if (l32 == null) {
                break;
            }
            Thread thread = l32.f40223a;
            if (thread != null) {
                l32.f40223a = null;
                LockSupport.unpark(thread);
            }
            l32 = l32.f40224b;
        }
        do {
            c3730s22 = n32.f40237b;
        } while (!h02.c(n32, c3730s22, C3730s2.f40550d));
        while (true) {
            c3730s23 = c3730s2;
            c3730s2 = c3730s22;
            if (c3730s2 == null) {
                break;
            }
            c3730s22 = c3730s2.f40553c;
            c3730s2.f40553c = c3730s23;
        }
        while (c3730s23 != null) {
            Runnable runnable = c3730s23.f40551a;
            C3730s2 c3730s24 = c3730s23.f40553c;
            e(runnable, c3730s23.f40552b);
            c3730s23 = c3730s24;
        }
    }

    private final void d(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (RuntimeException e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e11) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e11.getCause());
                    sb2.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    private static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f40233e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    private final void f(L3 l32) {
        l32.f40223a = null;
        while (true) {
            L3 l33 = this.f40238c;
            if (l33 != L3.f40222c) {
                L3 l34 = null;
                while (l33 != null) {
                    L3 l35 = l33.f40224b;
                    if (l33.f40223a != null) {
                        l34 = l33;
                    } else if (l34 != null) {
                        l34.f40224b = l35;
                        if (l34.f40223a == null) {
                            break;
                        }
                    } else if (!f40234f.e(this, l33, l35)) {
                        break;
                    }
                    l33 = l35;
                }
                return;
            }
            return;
        }
    }

    private static final Object g(Object obj) throws ExecutionException {
        if (obj instanceof C3670g1) {
            Throwable th2 = ((C3670g1) obj).f40463a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof V1) {
            throw new ExecutionException(((V1) obj).f40413a);
        }
        if (obj == f40235g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean c(Object obj) {
        if (obj == null) {
            obj = f40235g;
        }
        if (!f40234f.d(this, null, obj)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f40236a;
        if (obj == null) {
            if (f40234f.d(this, obj, f40232d ? new C3670g1(z10, new CancellationException("Future.cancel() was called.")) : z10 ? C3670g1.f40461b : C3670g1.f40462c)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f40236a;
        if (obj2 != null) {
            return g(obj2);
        }
        L3 l32 = this.f40238c;
        L3 l33 = L3.f40222c;
        if (l32 != l33) {
            L3 l34 = new L3();
            do {
                H0 h02 = f40234f;
                h02.a(l34, l32);
                if (h02.e(this, l32, l34)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(l34);
                            throw new InterruptedException();
                        }
                        obj = this.f40236a;
                    } while (!(obj != null));
                    return g(obj);
                }
                l32 = this.f40238c;
            } while (l32 != l33);
        }
        return g(this.f40236a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40236a instanceof C3670g1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40236a != null;
    }

    @Override // com.google.android.gms.internal.play_billing.G0
    public final void p(Runnable runnable, Executor executor) {
        executor.getClass();
        C3730s2 c3730s2 = this.f40237b;
        C3730s2 c3730s22 = C3730s2.f40550d;
        if (c3730s2 != c3730s22) {
            C3730s2 c3730s23 = new C3730s2(runnable, executor);
            do {
                c3730s23.f40553c = c3730s2;
                if (f40234f.c(this, c3730s2, c3730s23)) {
                    return;
                } else {
                    c3730s2 = this.f40237b;
                }
            } while (c3730s2 != c3730s22);
        }
        e(runnable, executor);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f40236a instanceof C3670g1) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            d(sb2);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                d(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f40236a;
            if (obj != null) {
                return g(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                L3 l32 = this.f40238c;
                L3 l33 = L3.f40222c;
                if (l32 != l33) {
                    L3 l34 = new L3();
                    do {
                        H0 h02 = f40234f;
                        h02.a(l34, l32);
                        if (h02.e(this, l32, l34)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f40236a;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    f(l34);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(l34);
                        } else {
                            l32 = this.f40238c;
                        }
                    } while (l32 != l33);
                }
                return g(this.f40236a);
            }
            while (nanos > 0) {
                Object obj3 = this.f40236a;
                if (obj3 != null) {
                    return g(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                boolean z10 = jConvert == 0 || nanos2 > 1000;
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z10) {
                        strConcat3 = strConcat3.concat(com.amazon.a.a.o.b.f.f34694a);
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z10) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
