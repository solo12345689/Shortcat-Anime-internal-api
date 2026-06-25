package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import n4.AbstractC5748x;
import n4.C5737m;
import n4.C5745u;
import n4.InterfaceC5726b;
import n4.InterfaceC5746v;
import o4.C5817B;
import o4.C5818C;
import o4.RunnableC5816A;
import p4.InterfaceC5931b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class K implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f32737s = i4.i.i("WorkerWrapper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f32738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f32740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WorkerParameters.a f32741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    C5745u f32742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.work.c f32743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    InterfaceC5931b f32744g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.work.a f32746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.work.impl.foreground.a f32747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkDatabase f32748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC5746v f32749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InterfaceC5726b f32750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f32751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f32752o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile boolean f32755r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    c.a f32745h = c.a.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f32753p = androidx.work.impl.utils.futures.c.u();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f32754q = androidx.work.impl.utils.futures.c.u();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.p f32756a;

        a(com.google.common.util.concurrent.p pVar) {
            this.f32756a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (K.this.f32754q.isCancelled()) {
                return;
            }
            try {
                this.f32756a.get();
                i4.i.e().a(K.f32737s, "Starting work for " + K.this.f32742e.f53945c);
                K k10 = K.this;
                k10.f32754q.s(k10.f32743f.m());
            } catch (Throwable th2) {
                K.this.f32754q.r(th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32758a;

        b(String str) {
            this.f32758a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    c.a aVar = (c.a) K.this.f32754q.get();
                    if (aVar == null) {
                        i4.i.e().c(K.f32737s, K.this.f32742e.f53945c + " returned a null result. Treating it as a failure.");
                    } else {
                        i4.i.e().a(K.f32737s, K.this.f32742e.f53945c + " returned a " + aVar + ".");
                        K.this.f32745h = aVar;
                    }
                    K.this.i();
                } catch (InterruptedException e10) {
                    e = e10;
                    i4.i.e().d(K.f32737s, this.f32758a + " failed because it threw an exception/error", e);
                    K.this.i();
                } catch (CancellationException e11) {
                    i4.i.e().g(K.f32737s, this.f32758a + " was cancelled", e11);
                    K.this.i();
                } catch (ExecutionException e12) {
                    e = e12;
                    i4.i.e().d(K.f32737s, this.f32758a + " failed because it threw an exception/error", e);
                    K.this.i();
                }
            } catch (Throwable th2) {
                K.this.i();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f32760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.work.c f32761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.work.impl.foreground.a f32762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        InterfaceC5931b f32763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.work.a f32764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        WorkDatabase f32765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        C5745u f32766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List f32767h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List f32768i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        WorkerParameters.a f32769j = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, InterfaceC5931b interfaceC5931b, androidx.work.impl.foreground.a aVar2, WorkDatabase workDatabase, C5745u c5745u, List list) {
            this.f32760a = context.getApplicationContext();
            this.f32763d = interfaceC5931b;
            this.f32762c = aVar2;
            this.f32764e = aVar;
            this.f32765f = workDatabase;
            this.f32766g = c5745u;
            this.f32768i = list;
        }

        public K b() {
            return new K(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f32769j = aVar;
            }
            return this;
        }

        public c d(List list) {
            this.f32767h = list;
            return this;
        }
    }

    K(c cVar) {
        this.f32738a = cVar.f32760a;
        this.f32744g = cVar.f32763d;
        this.f32747j = cVar.f32762c;
        C5745u c5745u = cVar.f32766g;
        this.f32742e = c5745u;
        this.f32739b = c5745u.f53943a;
        this.f32740c = cVar.f32767h;
        this.f32741d = cVar.f32769j;
        this.f32743f = cVar.f32761b;
        this.f32746i = cVar.f32764e;
        WorkDatabase workDatabase = cVar.f32765f;
        this.f32748k = workDatabase;
        this.f32749l = workDatabase.J();
        this.f32750m = this.f32748k.E();
        this.f32751n = cVar.f32768i;
    }

    public static /* synthetic */ void a(K k10, com.google.common.util.concurrent.p pVar) {
        if (k10.f32754q.isCancelled()) {
            pVar.cancel(true);
        }
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f32739b);
        sb2.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void f(c.a aVar) {
        if (aVar instanceof c.a.C0547c) {
            i4.i.e().f(f32737s, "Worker result SUCCESS for " + this.f32752o);
            if (this.f32742e.j()) {
                k();
                return;
            } else {
                p();
                return;
            }
        }
        if (aVar instanceof c.a.b) {
            i4.i.e().f(f32737s, "Worker result RETRY for " + this.f32752o);
            j();
            return;
        }
        i4.i.e().f(f32737s, "Worker result FAILURE for " + this.f32752o);
        if (this.f32742e.j()) {
            k();
        } else {
            o();
        }
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f32749l.g(str2) != i4.s.CANCELLED) {
                this.f32749l.q(i4.s.FAILED, str2);
            }
            linkedList.addAll(this.f32750m.a(str2));
        }
    }

    private void j() {
        this.f32748k.e();
        try {
            this.f32749l.q(i4.s.ENQUEUED, this.f32739b);
            this.f32749l.i(this.f32739b, System.currentTimeMillis());
            this.f32749l.n(this.f32739b, -1L);
            this.f32748k.B();
        } finally {
            this.f32748k.i();
            l(true);
        }
    }

    private void k() {
        this.f32748k.e();
        try {
            this.f32749l.i(this.f32739b, System.currentTimeMillis());
            this.f32749l.q(i4.s.ENQUEUED, this.f32739b);
            this.f32749l.v(this.f32739b);
            this.f32749l.c(this.f32739b);
            this.f32749l.n(this.f32739b, -1L);
            this.f32748k.B();
        } finally {
            this.f32748k.i();
            l(false);
        }
    }

    private void l(boolean z10) {
        this.f32748k.e();
        try {
            if (!this.f32748k.J().u()) {
                o4.p.a(this.f32738a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f32749l.q(i4.s.ENQUEUED, this.f32739b);
                this.f32749l.n(this.f32739b, -1L);
            }
            if (this.f32742e != null && this.f32743f != null && this.f32747j.b(this.f32739b)) {
                this.f32747j.a(this.f32739b);
            }
            this.f32748k.B();
            this.f32748k.i();
            this.f32753p.q(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f32748k.i();
            throw th2;
        }
    }

    private void m() {
        i4.s sVarG = this.f32749l.g(this.f32739b);
        if (sVarG == i4.s.RUNNING) {
            i4.i.e().a(f32737s, "Status for " + this.f32739b + " is RUNNING; not doing any work and rescheduling for later execution");
            l(true);
            return;
        }
        i4.i.e().a(f32737s, "Status for " + this.f32739b + " is " + sVarG + " ; not doing any work");
        l(false);
    }

    private void n() {
        androidx.work.b bVarB;
        if (q()) {
            return;
        }
        this.f32748k.e();
        try {
            C5745u c5745u = this.f32742e;
            if (c5745u.f53944b != i4.s.ENQUEUED) {
                m();
                this.f32748k.B();
                i4.i.e().a(f32737s, this.f32742e.f53945c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((c5745u.j() || this.f32742e.i()) && System.currentTimeMillis() < this.f32742e.c()) {
                i4.i.e().a(f32737s, String.format("Delaying execution for %s because it is being executed before schedule.", this.f32742e.f53945c));
                l(true);
                this.f32748k.B();
                return;
            }
            this.f32748k.B();
            this.f32748k.i();
            if (this.f32742e.j()) {
                bVarB = this.f32742e.f53947e;
            } else {
                i4.g gVarB = this.f32746i.f().b(this.f32742e.f53946d);
                if (gVarB == null) {
                    i4.i.e().c(f32737s, "Could not create Input Merger " + this.f32742e.f53946d);
                    o();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f32742e.f53947e);
                arrayList.addAll(this.f32749l.k(this.f32739b));
                bVarB = gVarB.b(arrayList);
            }
            androidx.work.b bVar = bVarB;
            UUID uuidFromString = UUID.fromString(this.f32739b);
            List list = this.f32751n;
            WorkerParameters.a aVar = this.f32741d;
            C5745u c5745u2 = this.f32742e;
            WorkerParameters workerParameters = new WorkerParameters(uuidFromString, bVar, list, aVar, c5745u2.f53953k, c5745u2.f(), this.f32746i.d(), this.f32744g, this.f32746i.n(), new C5818C(this.f32748k, this.f32744g), new C5817B(this.f32748k, this.f32747j, this.f32744g));
            if (this.f32743f == null) {
                this.f32743f = this.f32746i.n().b(this.f32738a, this.f32742e.f53945c, workerParameters);
            }
            androidx.work.c cVar = this.f32743f;
            if (cVar == null) {
                i4.i.e().c(f32737s, "Could not create Worker " + this.f32742e.f53945c);
                o();
                return;
            }
            if (cVar.j()) {
                i4.i.e().c(f32737s, "Received an already-used Worker " + this.f32742e.f53945c + "; Worker Factory should return new instances");
                o();
                return;
            }
            this.f32743f.l();
            if (!r()) {
                m();
                return;
            }
            if (q()) {
                return;
            }
            RunnableC5816A runnableC5816A = new RunnableC5816A(this.f32738a, this.f32742e, this.f32743f, workerParameters.b(), this.f32744g);
            this.f32744g.a().execute(runnableC5816A);
            final com.google.common.util.concurrent.p pVarB = runnableC5816A.b();
            this.f32754q.k(new Runnable() { // from class: androidx.work.impl.J
                @Override // java.lang.Runnable
                public final void run() {
                    K.a(this.f32735a, pVarB);
                }
            }, new o4.w());
            pVarB.k(new a(pVarB), this.f32744g.a());
            this.f32754q.k(new b(this.f32752o), this.f32744g.b());
        } finally {
            this.f32748k.i();
        }
    }

    private void p() {
        this.f32748k.e();
        try {
            this.f32749l.q(i4.s.SUCCEEDED, this.f32739b);
            this.f32749l.r(this.f32739b, ((c.a.C0547c) this.f32745h).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f32750m.a(this.f32739b)) {
                if (this.f32749l.g(str) == i4.s.BLOCKED && this.f32750m.c(str)) {
                    i4.i.e().f(f32737s, "Setting status to enqueued for " + str);
                    this.f32749l.q(i4.s.ENQUEUED, str);
                    this.f32749l.i(str, jCurrentTimeMillis);
                }
            }
            this.f32748k.B();
            this.f32748k.i();
            l(false);
        } catch (Throwable th2) {
            this.f32748k.i();
            l(false);
            throw th2;
        }
    }

    private boolean q() {
        if (!this.f32755r) {
            return false;
        }
        i4.i.e().a(f32737s, "Work interrupted for " + this.f32752o);
        if (this.f32749l.g(this.f32739b) == null) {
            l(false);
        } else {
            l(!r0.b());
        }
        return true;
    }

    private boolean r() {
        boolean z10;
        this.f32748k.e();
        try {
            if (this.f32749l.g(this.f32739b) == i4.s.ENQUEUED) {
                this.f32749l.q(i4.s.RUNNING, this.f32739b);
                this.f32749l.x(this.f32739b);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32748k.B();
            this.f32748k.i();
            return z10;
        } catch (Throwable th2) {
            this.f32748k.i();
            throw th2;
        }
    }

    public com.google.common.util.concurrent.p c() {
        return this.f32753p;
    }

    public C5737m d() {
        return AbstractC5748x.a(this.f32742e);
    }

    public C5745u e() {
        return this.f32742e;
    }

    public void g() {
        this.f32755r = true;
        q();
        this.f32754q.cancel(true);
        if (this.f32743f != null && this.f32754q.isCancelled()) {
            this.f32743f.n();
            return;
        }
        i4.i.e().a(f32737s, "WorkSpec " + this.f32742e + " is already done. Not interrupting.");
    }

    void i() {
        if (!q()) {
            this.f32748k.e();
            try {
                i4.s sVarG = this.f32749l.g(this.f32739b);
                this.f32748k.I().a(this.f32739b);
                if (sVarG == null) {
                    l(false);
                } else if (sVarG == i4.s.RUNNING) {
                    f(this.f32745h);
                } else if (!sVarG.b()) {
                    j();
                }
                this.f32748k.B();
                this.f32748k.i();
            } catch (Throwable th2) {
                this.f32748k.i();
                throw th2;
            }
        }
        List list = this.f32740c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((t) it.next()).c(this.f32739b);
            }
            u.b(this.f32746i, this.f32748k, this.f32740c);
        }
    }

    void o() {
        this.f32748k.e();
        try {
            h(this.f32739b);
            this.f32749l.r(this.f32739b, ((c.a.C0546a) this.f32745h).e());
            this.f32748k.B();
        } finally {
            this.f32748k.i();
            l(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f32752o = b(this.f32751n);
        n();
    }
}
