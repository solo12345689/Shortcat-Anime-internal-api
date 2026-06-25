package ig;

import Td.L;
import fg.AbstractC4807e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final e f48886a;

    /* JADX INFO: renamed from: b */
    private final String f48887b;

    /* JADX INFO: renamed from: c */
    private boolean f48888c;

    /* JADX INFO: renamed from: d */
    private AbstractC5097a f48889d;

    /* JADX INFO: renamed from: e */
    private final List f48890e;

    /* JADX INFO: renamed from: f */
    private boolean f48891f;

    public d(e taskRunner, String name) {
        AbstractC5504s.h(taskRunner, "taskRunner");
        AbstractC5504s.h(name, "name");
        this.f48886a = taskRunner;
        this.f48887b = name;
        this.f48890e = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, AbstractC5097a abstractC5097a, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(abstractC5097a, j10);
    }

    public final void a() {
        if (AbstractC4807e.f47069h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f48886a) {
            try {
                if (b()) {
                    this.f48886a.h(this);
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        AbstractC5097a abstractC5097a = this.f48889d;
        if (abstractC5097a != null) {
            AbstractC5504s.e(abstractC5097a);
            if (abstractC5097a.a()) {
                this.f48891f = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f48890e.size() - 1; -1 < size; size--) {
            if (((AbstractC5097a) this.f48890e.get(size)).a()) {
                AbstractC5097a abstractC5097a2 = (AbstractC5097a) this.f48890e.get(size);
                if (e.f48892h.a().isLoggable(Level.FINE)) {
                    AbstractC5098b.c(abstractC5097a2, this, "canceled");
                }
                this.f48890e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final AbstractC5097a c() {
        return this.f48889d;
    }

    public final boolean d() {
        return this.f48891f;
    }

    public final List e() {
        return this.f48890e;
    }

    public final String f() {
        return this.f48887b;
    }

    public final boolean g() {
        return this.f48888c;
    }

    public final e h() {
        return this.f48886a;
    }

    public final void i(AbstractC5097a task, long j10) {
        AbstractC5504s.h(task, "task");
        synchronized (this.f48886a) {
            if (!this.f48888c) {
                if (k(task, j10, false)) {
                    this.f48886a.h(this);
                }
                L l10 = L.f17438a;
            } else if (task.a()) {
                if (e.f48892h.a().isLoggable(Level.FINE)) {
                    AbstractC5098b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f48892h.a().isLoggable(Level.FINE)) {
                    AbstractC5098b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(AbstractC5097a task, long j10, boolean z10) {
        String str;
        AbstractC5504s.h(task, "task");
        task.e(this);
        long jB = this.f48886a.g().b();
        long j11 = jB + j10;
        int iIndexOf = this.f48890e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j11) {
                if (e.f48892h.a().isLoggable(Level.FINE)) {
                    AbstractC5098b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f48890e.remove(iIndexOf);
        }
        task.g(j11);
        if (e.f48892h.a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + AbstractC5098b.b(j11 - jB);
            } else {
                str = "scheduled after " + AbstractC5098b.b(j11 - jB);
            }
            AbstractC5098b.c(task, this, str);
        }
        Iterator it = this.f48890e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC5097a) it.next()).c() - jB > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f48890e.size();
        }
        this.f48890e.add(size, task);
        return size == 0;
    }

    public final void l(AbstractC5097a abstractC5097a) {
        this.f48889d = abstractC5097a;
    }

    public final void m(boolean z10) {
        this.f48891f = z10;
    }

    public final void n() {
        if (AbstractC4807e.f47069h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f48886a) {
            try {
                this.f48888c = true;
                if (b()) {
                    this.f48886a.h(this);
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return this.f48887b;
    }
}
