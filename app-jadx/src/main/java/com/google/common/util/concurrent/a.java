package com.google.common.util.concurrent;

import com.google.android.gms.internal.play_billing.AbstractC3728s0;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends T9.a implements p {

    /* JADX INFO: renamed from: d */
    static final boolean f43129d;

    /* JADX INFO: renamed from: e */
    static final o f43130e;

    /* JADX INFO: renamed from: f */
    private static final b f43131f;

    /* JADX INFO: renamed from: g */
    private static final Object f43132g;

    /* JADX INFO: renamed from: a */
    private volatile Object f43133a;

    /* JADX INFO: renamed from: b */
    private volatile e f43134b;

    /* JADX INFO: renamed from: c */
    private volatile l f43135c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, l lVar, l lVar2);

        abstract e d(a aVar, e eVar);

        abstract l e(a aVar, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);

        /* synthetic */ b(C0646a c0646a) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: c */
        static final c f43136c;

        /* JADX INFO: renamed from: d */
        static final c f43137d;

        /* JADX INFO: renamed from: a */
        final boolean f43138a;

        /* JADX INFO: renamed from: b */
        final Throwable f43139b;

        static {
            if (a.f43129d) {
                f43137d = null;
                f43136c = null;
            } else {
                f43137d = new c(false, null);
                f43136c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f43138a = z10;
            this.f43139b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: b */
        static final d f43140b = new d(new C0647a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        final Throwable f43141a;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0647a extends Throwable {
            C0647a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f43141a = (Throwable) O9.n.j(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f extends b {

        /* JADX INFO: renamed from: a */
        final AtomicReferenceFieldUpdater f43146a;

        /* JADX INFO: renamed from: b */
        final AtomicReferenceFieldUpdater f43147b;

        /* JADX INFO: renamed from: c */
        final AtomicReferenceFieldUpdater f43148c;

        /* JADX INFO: renamed from: d */
        final AtomicReferenceFieldUpdater f43149d;

        /* JADX INFO: renamed from: e */
        final AtomicReferenceFieldUpdater f43150e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f43146a = atomicReferenceFieldUpdater;
            this.f43147b = atomicReferenceFieldUpdater2;
            this.f43148c = atomicReferenceFieldUpdater3;
            this.f43149d = atomicReferenceFieldUpdater4;
            this.f43150e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f43149d, aVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f43150e, aVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a aVar, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f43148c, aVar, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a aVar, e eVar) {
            return (e) this.f43149d.getAndSet(aVar, eVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a aVar, l lVar) {
            return (l) this.f43148c.getAndSet(aVar, lVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            this.f43147b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            this.f43146a.lazySet(lVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final a f43151a;

        /* JADX INFO: renamed from: b */
        final p f43152b;

        g(a aVar, p pVar) {
            this.f43151a = aVar;
            this.f43152b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f43151a.f43133a != this) {
                return;
            }
            if (a.f43131f.b(this.f43151a, this, a.y(this.f43152b))) {
                a.v(this.f43151a, false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f43134b != eVar) {
                        return false;
                    }
                    aVar.f43134b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f43133a != obj) {
                        return false;
                    }
                    aVar.f43133a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f43135c != lVar) {
                        return false;
                    }
                    aVar.f43135c = lVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                try {
                    eVar2 = aVar.f43134b;
                    if (eVar2 != eVar) {
                        aVar.f43134b = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a aVar, l lVar) {
            l lVar2;
            synchronized (aVar) {
                try {
                    lVar2 = aVar.f43135c;
                    if (lVar2 != lVar) {
                        aVar.f43135c = lVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            lVar.f43161b = lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            lVar.f43160a = thread;
        }

        /* synthetic */ h(C0646a c0646a) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface i extends p {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class j extends a implements i {
        j() {
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.p
        public void k(Runnable runnable, Executor executor) {
            super.k(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final Object get(long j10, TimeUnit timeUnit) {
            return super.get(j10, timeUnit);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class k extends b {

        /* JADX INFO: renamed from: a */
        static final Unsafe f43153a;

        /* JADX INFO: renamed from: b */
        static final long f43154b;

        /* JADX INFO: renamed from: c */
        static final long f43155c;

        /* JADX INFO: renamed from: d */
        static final long f43156d;

        /* JADX INFO: renamed from: e */
        static final long f43157e;

        /* JADX INFO: renamed from: f */
        static final long f43158f;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a$k$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0648a implements PrivilegedExceptionAction {
            C0648a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new C0648a());
                }
                try {
                    f43155c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                    f43154b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                    f43156d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                    f43157e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                    f43158f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    f43153a = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return AbstractC3728s0.a(f43153a, aVar, f43154b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return AbstractC3728s0.a(f43153a, aVar, f43156d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a aVar, l lVar, l lVar2) {
            return AbstractC3728s0.a(f43153a, aVar, f43155c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = aVar.f43134b;
                if (eVar == eVar2) {
                    break;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a aVar, l lVar) {
            l lVar2;
            do {
                lVar2 = aVar.f43135c;
                if (lVar == lVar2) {
                    break;
                }
            } while (!c(aVar, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            f43153a.putObject(lVar, f43158f, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            f43153a.putObject(lVar, f43157e, thread);
        }

        /* synthetic */ k(C0646a c0646a) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class l {

        /* JADX INFO: renamed from: c */
        static final l f43159c = new l(false);

        /* JADX INFO: renamed from: a */
        volatile Thread f43160a;

        /* JADX INFO: renamed from: b */
        volatile l f43161b;

        l(boolean z10) {
        }

        void a(l lVar) {
            a.f43131f.f(this, lVar);
        }

        void b() {
            Thread thread = this.f43160a;
            if (thread != null) {
                this.f43160a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            a.f43131f.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        Throwable th2;
        b hVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.f34641ag));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f43129d = z10;
        f43130e = new o(a.class);
        Throwable th3 = null;
        try {
            hVar = new k();
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Error | Exception e11) {
                th3 = e11;
                hVar = new h();
            }
        }
        f43131f = hVar;
        if (th3 != null) {
            o oVar = f43130e;
            Logger loggerA = oVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            oVar.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        f43132g = new Object();
    }

    protected a() {
    }

    private void D() {
        for (l lVarE = f43131f.e(this, l.f43159c); lVarE != null; lVarE = lVarE.f43161b) {
            lVarE.b();
        }
    }

    private void E(l lVar) {
        lVar.f43160a = null;
        while (true) {
            l lVar2 = this.f43135c;
            if (lVar2 == l.f43159c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f43161b;
                if (lVar2.f43160a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f43161b = lVar4;
                    if (lVar3.f43160a == null) {
                        break;
                    }
                } else if (!f43131f.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void n(StringBuilder sb2) {
        try {
            Object objZ = z(this);
            sb2.append("SUCCESS, result=[");
            r(sb2, objZ);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private void o(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f43133a;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            s(sb2, ((g) obj).f43152b);
            sb2.append("]");
        } else {
            try {
                strA = O9.s.a(C());
            } catch (Exception | StackOverflowError e10) {
                strA = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strA != null) {
                sb2.append(", info=[");
                sb2.append(strA);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            n(sb2);
        }
    }

    private void r(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void s(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    private static CancellationException t(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private e u(e eVar) {
        e eVar2 = eVar;
        e eVarD = f43131f.d(this, e.f43142d);
        while (eVarD != null) {
            e eVar3 = eVarD.f43145c;
            eVarD.f43145c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    public static void v(a aVar, boolean z10) {
        e eVar = null;
        while (true) {
            aVar.D();
            if (z10) {
                aVar.A();
                z10 = false;
            }
            aVar.q();
            e eVarU = aVar.u(eVar);
            while (eVarU != null) {
                eVar = eVarU.f43145c;
                Runnable runnable = eVarU.f43143a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    aVar = gVar.f43151a;
                    if (aVar.f43133a == gVar) {
                        if (f43131f.b(aVar, gVar, y(gVar.f43152b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarU.f43144b;
                    Objects.requireNonNull(executor);
                    w(runnable2, executor);
                }
                eVarU = eVar;
            }
            return;
        }
    }

    private static void w(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f43130e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object x(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw t("Task was cancelled.", ((c) obj).f43139b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f43141a);
        }
        return obj == f43132g ? t.b() : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object y(p pVar) {
        Throwable thA;
        if (pVar instanceof i) {
            Object cVar = ((a) pVar).f43133a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f43138a) {
                    cVar = cVar2.f43139b != null ? new c(false, cVar2.f43139b) : c.f43137d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((pVar instanceof T9.a) && (thA = T9.b.a((T9.a) pVar)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = pVar.isCancelled();
        if ((!f43129d) && zIsCancelled) {
            c cVar3 = c.f43137d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objZ = z(pVar);
            if (!zIsCancelled) {
                return objZ == null ? f43132g : objZ;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + pVar));
        } catch (Error | Exception e10) {
            return new d(e10);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + pVar, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new d(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + pVar, e12));
        }
    }

    private static Object z(Future future) {
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

    final void B(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(I());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String C() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean F(Object obj) {
        if (obj == null) {
            obj = f43132g;
        }
        if (!f43131f.b(this, null, obj)) {
            return false;
        }
        v(this, false);
        return true;
    }

    protected boolean G(Throwable th2) {
        if (!f43131f.b(this, null, new d((Throwable) O9.n.j(th2)))) {
            return false;
        }
        v(this, false);
        return true;
    }

    protected boolean H(p pVar) {
        d dVar;
        O9.n.j(pVar);
        Object obj = this.f43133a;
        if (obj == null) {
            if (pVar.isDone()) {
                if (!f43131f.b(this, null, y(pVar))) {
                    return false;
                }
                v(this, false);
                return true;
            }
            g gVar = new g(this, pVar);
            if (f43131f.b(this, null, gVar)) {
                try {
                    pVar.k(gVar, com.google.common.util.concurrent.e.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Error | Exception unused) {
                        dVar = d.f43140b;
                    }
                    f43131f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f43133a;
        }
        if (obj instanceof c) {
            pVar.cancel(((c) obj).f43138a);
        }
        return false;
    }

    protected final boolean I() {
        Object obj = this.f43133a;
        return (obj instanceof c) && ((c) obj).f43138a;
    }

    @Override // T9.a
    protected final Throwable c() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f43133a;
        if (obj instanceof d) {
            return ((d) obj).f43141a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f43133a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f43129d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f43136c : c.f43137d;
            Objects.requireNonNull(cVar);
        }
        a aVar = this;
        boolean z11 = false;
        while (true) {
            if (f43131f.b(aVar, obj, cVar)) {
                v(aVar, z10);
                if (!(obj instanceof g)) {
                    break;
                }
                p pVar = ((g) obj).f43152b;
                if (!(pVar instanceof i)) {
                    pVar.cancel(z10);
                    break;
                }
                aVar = (a) pVar;
                obj = aVar.f43133a;
                if (!(obj == null) && !(obj instanceof g)) {
                    break;
                }
                z11 = true;
            } else {
                obj = aVar.f43133a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f43133a;
        if ((obj != null) && (!(obj instanceof g))) {
            return x(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f43135c;
            if (lVar != l.f43159c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f43131f.c(this, lVar, lVar2)) {
                        do {
                            u.a(this, nanos);
                            if (Thread.interrupted()) {
                                E(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f43133a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return x(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        E(lVar2);
                    } else {
                        lVar = this.f43135c;
                    }
                } while (lVar != l.f43159c);
            }
            Object obj3 = this.f43133a;
            Objects.requireNonNull(obj3);
            return x(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f43133a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return x(obj4);
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
    public boolean isCancelled() {
        return this.f43133a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f43133a != null);
    }

    @Override // com.google.common.util.concurrent.p
    public void k(Runnable runnable, Executor executor) {
        e eVar;
        O9.n.k(runnable, "Runnable was null.");
        O9.n.k(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f43134b) != e.f43142d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f43145c = eVar;
                if (f43131f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f43134b;
                }
            } while (eVar != e.f43142d);
        }
        w(runnable, executor);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            n(sb2);
        } else {
            o(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e {

        /* JADX INFO: renamed from: d */
        static final e f43142d = new e();

        /* JADX INFO: renamed from: a */
        final Runnable f43143a;

        /* JADX INFO: renamed from: b */
        final Executor f43144b;

        /* JADX INFO: renamed from: c */
        e f43145c;

        e(Runnable runnable, Executor executor) {
            this.f43143a = runnable;
            this.f43144b = executor;
        }

        e() {
            this.f43143a = null;
            this.f43144b = null;
        }
    }

    protected void A() {
    }

    protected void q() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f43133a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return x(obj2);
            }
            l lVar = this.f43135c;
            if (lVar != l.f43159c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f43131f.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f43133a;
                            } else {
                                E(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return x(obj);
                    }
                    lVar = this.f43135c;
                } while (lVar != l.f43159c);
            }
            Object obj3 = this.f43133a;
            Objects.requireNonNull(obj3);
            return x(obj3);
        }
        throw new InterruptedException();
    }
}
