package androidx.concurrent.futures;

import com.google.common.util.concurrent.p;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f27903d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.f34641ag));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f27904e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f27905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f27906g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f27907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f27908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile h f27909c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f27910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f27911d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f27912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f27913b;

        static {
            if (a.f27903d) {
                f27911d = null;
                f27910c = null;
            } else {
                f27911d = new c(false, null);
                f27910c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f27912a = z10;
            this.f27913b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f27914b = new d(new C0485a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f27915a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0485a extends Throwable {
            C0485a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f27915a = (Throwable) a.h(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f27916d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f27917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f27918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f27919c;

        e(Runnable runnable, Executor executor) {
            this.f27917a = runnable;
            this.f27918b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f27920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f27921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f27922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f27923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f27924e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f27920a = atomicReferenceFieldUpdater;
            this.f27921b = atomicReferenceFieldUpdater2;
            this.f27922c = atomicReferenceFieldUpdater3;
            this.f27923d = atomicReferenceFieldUpdater4;
            this.f27924e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f27923d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f27924e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f27922c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f27921b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f27920a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f27908b != eVar) {
                        return false;
                    }
                    aVar.f27908b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f27907a != obj) {
                        return false;
                    }
                    aVar.f27907a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f27909c != hVar) {
                        return false;
                    }
                    aVar.f27909c = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f27927b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f27926a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final h f27925c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f27926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile h f27927b;

        h(boolean z10) {
        }

        void a(h hVar) {
            a.f27905f.d(this, hVar);
        }

        void b() {
            Thread thread = this.f27926a;
            if (thread != null) {
                this.f27926a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f27905f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f27905f = gVar;
        if (th != null) {
            f27904e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f27906g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object objS = s(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(z(objS));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static Object h(Object obj) {
        obj.getClass();
        return obj;
    }

    private e m(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f27908b;
        } while (!f27905f.a(this, eVar2, e.f27916d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f27919c;
            eVar4.f27919c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void n(a aVar) {
        aVar.v();
        aVar.b();
        e eVarM = aVar.m(null);
        while (eVarM != null) {
            e eVar = eVarM.f27919c;
            q(eVarM.f27917a, eVarM.f27918b);
            eVarM = eVar;
        }
    }

    private static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f27904e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object r(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f27913b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f27915a);
        }
        if (obj == f27906g) {
            return null;
        }
        return obj;
    }

    static Object s(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
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
        return obj;
    }

    private void v() {
        h hVar;
        do {
            hVar = this.f27909c;
        } while (!f27905f.c(this, hVar, h.f27925c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f27927b;
        }
    }

    private void w(h hVar) {
        hVar.f27926a = null;
        while (true) {
            h hVar2 = this.f27909c;
            if (hVar2 == h.f27925c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f27927b;
                if (hVar2.f27926a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f27927b = hVar4;
                    if (hVar3.f27926a == null) {
                        break;
                    }
                } else if (!f27905f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String z(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected final boolean A() {
        Object obj = this.f27907a;
        return (obj instanceof c) && ((c) obj).f27912a;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f27907a;
        if (obj == null) {
            if (f27905f.b(this, obj, f27903d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f27910c : c.f27911d)) {
                if (z10) {
                    t();
                }
                n(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f27907a;
        if (obj != null) {
            return r(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f27909c;
            if (hVar != h.f27925c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f27905f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                w(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f27907a;
                            if (obj2 != null) {
                                return r(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        w(hVar2);
                    } else {
                        hVar = this.f27909c;
                    }
                } while (hVar != h.f27925c);
            }
            return r(this.f27907a);
        }
        while (nanos > 0) {
            Object obj3 = this.f27907a;
            if (obj3 != null) {
                return r(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + com.amazon.a.a.o.b.f.f34694a;
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27907a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27907a != null;
    }

    @Override // com.google.common.util.concurrent.p
    public final void k(Runnable runnable, Executor executor) {
        h(runnable);
        h(executor);
        e eVar = this.f27908b;
        if (eVar != e.f27916d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f27919c = eVar;
                if (f27905f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f27908b;
                }
            } while (eVar != e.f27916d);
        }
        q(runnable, executor);
    }

    public String toString() {
        String strU;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strU = u();
            } catch (RuntimeException e10) {
                strU = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strU != null && !strU.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strU);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String u() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean x(Object obj) {
        if (obj == null) {
            obj = f27906g;
        }
        if (!f27905f.b(this, null, obj)) {
            return false;
        }
        n(this);
        return true;
    }

    protected boolean y(Throwable th2) {
        if (!f27905f.b(this, null, new d((Throwable) h(th2)))) {
            return false;
        }
        n(this);
        return true;
    }

    protected void b() {
    }

    protected void t() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f27907a;
            if (obj2 != null) {
                return r(obj2);
            }
            h hVar = this.f27909c;
            if (hVar != h.f27925c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f27905f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f27907a;
                            } else {
                                w(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return r(obj);
                    }
                    hVar = this.f27909c;
                } while (hVar != h.f27925c);
            }
            return r(this.f27907a);
        }
        throw new InterruptedException();
    }
}
