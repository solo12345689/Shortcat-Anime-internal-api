package dg;

import Td.L;
import Ud.AbstractC2279u;
import fg.AbstractC4807e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jg.e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f45562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f45563d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45560a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45561b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f45564e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f45565f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f45566g = new ArrayDeque();

    private final e.a d(String str) {
        for (e.a aVar : this.f45565f) {
            if (AbstractC5504s.c(aVar.d(), str)) {
                return aVar;
            }
        }
        for (e.a aVar2 : this.f45564e) {
            if (AbstractC5504s.c(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f45562c;
            L l10 = L.f17438a;
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean h() {
        int i10;
        boolean z10;
        if (AbstractC4807e.f47069h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f45564e.iterator();
                AbstractC5504s.g(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    e.a asyncCall = (e.a) it.next();
                    if (this.f45565f.size() >= this.f45560a) {
                        break;
                    }
                    if (asyncCall.c().get() < this.f45561b) {
                        it.remove();
                        asyncCall.c().incrementAndGet();
                        AbstractC5504s.g(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f45565f.add(asyncCall);
                    }
                }
                z10 = k() > 0;
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a(c());
        }
        return z10;
    }

    public final void a(e.a call) {
        e.a aVarD;
        AbstractC5504s.h(call, "call");
        synchronized (this) {
            try {
                this.f45564e.add(call);
                if (!call.b().p() && (aVarD = d(call.d())) != null) {
                    call.e(aVarD);
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h();
    }

    public final synchronized void b(jg.e call) {
        AbstractC5504s.h(call, "call");
        this.f45566g.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f45563d == null) {
                this.f45563d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC4807e.N(AbstractC4807e.f47070i + " Dispatcher", false));
            }
            executorService = this.f45563d;
            AbstractC5504s.e(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final void f(e.a call) {
        AbstractC5504s.h(call, "call");
        call.c().decrementAndGet();
        e(this.f45565f, call);
    }

    public final void g(jg.e call) {
        AbstractC5504s.h(call, "call");
        e(this.f45566g, call);
    }

    public final synchronized List i() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f45564e;
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(arrayDeque, 10));
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC5504s.g(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    public final synchronized List j() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f45566g;
            ArrayDeque arrayDeque2 = this.f45565f;
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(arrayDeque2, 10));
            Iterator it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(AbstractC2279u.I0(arrayDeque, arrayList));
            AbstractC5504s.g(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    public final synchronized int k() {
        return this.f45565f.size() + this.f45566g.size();
    }
}
