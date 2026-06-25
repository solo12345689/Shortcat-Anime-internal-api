package androidx.work.impl.utils.futures;

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
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f32917d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.f34641ag));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f32918e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f32919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f32920g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f32921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f32922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f32923c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f32924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f32925d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f32926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f32927b;

        static {
            if (a.f32917d) {
                f32925d = null;
                f32924c = null;
            } else {
                f32925d = new c(false, null);
                f32924c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f32926a = z10;
            this.f32927b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f32928b = new d(new C0551a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f32929a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0551a extends Throwable {
            C0551a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f32929a = (Throwable) a.d(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f32930d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f32931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f32932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f32933c;

        e(Runnable runnable, Executor executor) {
            this.f32931a = runnable;
            this.f32932b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f32934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f32935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f32936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f32937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f32938e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f32934a = atomicReferenceFieldUpdater;
            this.f32935b = atomicReferenceFieldUpdater2;
            this.f32936c = atomicReferenceFieldUpdater3;
            this.f32937d = atomicReferenceFieldUpdater4;
            this.f32938e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f32937d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f32938e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f32936c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f32935b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f32934a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f32939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p f32940b;

        g(a aVar, p pVar) {
            this.f32939a = aVar;
            this.f32940b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f32939a.f32921a != this) {
                return;
            }
            if (a.f32919f.b(this.f32939a, this, a.i(this.f32940b))) {
                a.f(this.f32939a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f32922b != eVar) {
                        return false;
                    }
                    aVar.f32922b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f32921a != obj) {
                        return false;
                    }
                    aVar.f32921a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f32923c != iVar) {
                        return false;
                    }
                    aVar.f32923c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f32943b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f32942a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f32941c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f32942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f32943b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f32919f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f32942a;
            if (thread != null) {
                this.f32942a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f32919f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f32919f = hVar;
        if (th != null) {
            f32918e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f32920g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object objJ = j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(t(objJ));
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

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f32922b;
        } while (!f32919f.a(this, eVar2, e.f32930d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f32933c;
            eVar4.f32933c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void f(a aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e eVarE = aVar.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.f32933c;
                Runnable runnable = eVarE.f32931a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f32939a;
                    if (aVar.f32921a == gVar) {
                        if (f32919f.b(aVar, gVar, i(gVar.f32940b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, eVarE.f32932b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f32918e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f32927b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f32929a);
        }
        if (obj == f32920g) {
            return null;
        }
        return obj;
    }

    static Object i(p pVar) {
        if (pVar instanceof a) {
            Object obj = ((a) pVar).f32921a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f32926a ? cVar.f32927b != null ? new c(false, cVar.f32927b) : c.f32925d : obj;
        }
        boolean zIsCancelled = pVar.isCancelled();
        if ((!f32917d) && zIsCancelled) {
            return c.f32925d;
        }
        try {
            Object objJ = j(pVar);
            return objJ == null ? f32920g : objJ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + pVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static Object j(Future future) {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f32923c;
        } while (!f32919f.c(this, iVar, i.f32941c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f32943b;
        }
    }

    private void o(i iVar) {
        iVar.f32942a = null;
        while (true) {
            i iVar2 = this.f32923c;
            if (iVar2 == i.f32941c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f32943b;
                if (iVar2.f32942a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f32943b = iVar4;
                    if (iVar3.f32942a == null) {
                        break;
                    }
                } else if (!f32919f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f32921a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f32917d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f32924c : c.f32925d;
        a aVar = this;
        boolean z11 = false;
        while (true) {
            if (f32919f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.l();
                }
                f(aVar);
                if (!(obj instanceof g)) {
                    break;
                }
                p pVar = ((g) obj).f32940b;
                if (!(pVar instanceof a)) {
                    pVar.cancel(z10);
                    break;
                }
                aVar = (a) pVar;
                obj = aVar.f32921a;
                if (!(obj == null) && !(obj instanceof g)) {
                    break;
                }
                z11 = true;
            } else {
                obj = aVar.f32921a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f32921a;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f32923c;
            if (iVar != i.f32941c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f32919f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f32921a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f32923c;
                    }
                } while (iVar != i.f32941c);
            }
            return h(this.f32921a);
        }
        while (nanos > 0) {
            Object obj3 = this.f32921a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
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
        return this.f32921a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f32921a != null);
    }

    @Override // com.google.common.util.concurrent.p
    public final void k(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f32922b;
        if (eVar != e.f32930d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f32933c = eVar;
                if (f32919f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f32922b;
                }
            } while (eVar != e.f32930d);
        }
        g(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String m() {
        Object obj = this.f32921a;
        if (obj instanceof g) {
            return "setFuture=[" + t(((g) obj).f32940b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean q(Object obj) {
        if (obj == null) {
            obj = f32920g;
        }
        if (!f32919f.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean r(Throwable th2) {
        if (!f32919f.b(this, null, new d((Throwable) d(th2)))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean s(p pVar) {
        d dVar;
        d(pVar);
        Object obj = this.f32921a;
        if (obj == null) {
            if (pVar.isDone()) {
                if (!f32919f.b(this, null, i(pVar))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, pVar);
            if (f32919f.b(this, null, gVar)) {
                try {
                    pVar.k(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f32928b;
                    }
                    f32919f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f32921a;
        }
        if (obj instanceof c) {
            pVar.cancel(((c) obj).f32926a);
        }
        return false;
    }

    public String toString() {
        String strM;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e10) {
                strM = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM);
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

    protected void b() {
    }

    protected void l() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f32921a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f32923c;
            if (iVar != i.f32941c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f32919f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f32921a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f32923c;
                } while (iVar != i.f32941c);
            }
            return h(this.f32921a);
        }
        throw new InterruptedException();
    }
}
