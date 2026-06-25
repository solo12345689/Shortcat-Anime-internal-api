package jg;

import Td.AbstractC2156g;
import Td.L;
import Ud.AbstractC2279u;
import dg.C;
import dg.C4618A;
import dg.C4620a;
import dg.C4626g;
import dg.E;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import dg.p;
import dg.r;
import dg.u;
import fg.AbstractC4807e;
import hg.C4949a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kg.C5478a;
import kg.C5479b;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6681f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements InterfaceC4624e {

    /* JADX INFO: renamed from: a */
    private final C4618A f51854a;

    /* JADX INFO: renamed from: b */
    private final C f51855b;

    /* JADX INFO: renamed from: c */
    private final boolean f51856c;

    /* JADX INFO: renamed from: d */
    private final g f51857d;

    /* JADX INFO: renamed from: e */
    private final r f51858e;

    /* JADX INFO: renamed from: f */
    private final c f51859f;

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f51860g;

    /* JADX INFO: renamed from: h */
    private Object f51861h;

    /* JADX INFO: renamed from: i */
    private d f51862i;

    /* JADX INFO: renamed from: j */
    private f f51863j;

    /* JADX INFO: renamed from: k */
    private boolean f51864k;

    /* JADX INFO: renamed from: l */
    private jg.c f51865l;

    /* JADX INFO: renamed from: m */
    private boolean f51866m;

    /* JADX INFO: renamed from: n */
    private boolean f51867n;

    /* JADX INFO: renamed from: o */
    private boolean f51868o;

    /* JADX INFO: renamed from: p */
    private volatile boolean f51869p;

    /* JADX INFO: renamed from: q */
    private volatile jg.c f51870q;

    /* JADX INFO: renamed from: r */
    private volatile f f51871r;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final InterfaceC4625f f51872a;

        /* JADX INFO: renamed from: b */
        private volatile AtomicInteger f51873b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ e f51874c;

        public a(e eVar, InterfaceC4625f responseCallback) {
            AbstractC5504s.h(responseCallback, "responseCallback");
            this.f51874c = eVar;
            this.f51872a = responseCallback;
            this.f51873b = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            AbstractC5504s.h(executorService, "executorService");
            p pVarT = this.f51874c.k().t();
            if (AbstractC4807e.f47069h && Thread.holdsLock(pVarT)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + pVarT);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f51874c.v(interruptedIOException);
                    this.f51872a.j(this.f51874c, interruptedIOException);
                    this.f51874c.k().t().f(this);
                }
            } catch (Throwable th2) {
                this.f51874c.k().t().f(this);
                throw th2;
            }
        }

        public final e b() {
            return this.f51874c;
        }

        public final AtomicInteger c() {
            return this.f51873b;
        }

        public final String d() {
            return this.f51874c.r().p().h();
        }

        public final void e(a other) {
            AbstractC5504s.h(other, "other");
            this.f51873b = other.f51873b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            C4618A c4618aK;
            String str = "OkHttp " + this.f51874c.x();
            e eVar = this.f51874c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                eVar.f51859f.v();
                try {
                    try {
                        z10 = true;
                    } catch (IOException e11) {
                        z10 = false;
                        e10 = e11;
                    } catch (Throwable th3) {
                        z10 = false;
                        th2 = th3;
                    }
                    try {
                        this.f51872a.h(eVar, eVar.s());
                        c4618aK = eVar.k();
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z10) {
                            og.j.f55583a.g().k("Callback failure for " + eVar.E(), 4, e10);
                        } else {
                            this.f51872a.j(eVar, e10);
                        }
                        c4618aK = eVar.k();
                    } catch (Throwable th4) {
                        th2 = th4;
                        eVar.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th2);
                            AbstractC2156g.a(iOException, th2);
                            this.f51872a.j(eVar, iOException);
                        }
                        throw th2;
                    }
                    c4618aK.t().f(this);
                } catch (Throwable th5) {
                    eVar.k().t().f(this);
                    throw th5;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends WeakReference {

        /* JADX INFO: renamed from: a */
        private final Object f51875a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            AbstractC5504s.h(referent, "referent");
            this.f51875a = obj;
        }

        public final Object a() {
            return this.f51875a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends C6681f {
        c() {
        }

        @Override // tg.C6681f
        protected void B() {
            e.this.cancel();
        }
    }

    public e(C4618A client, C originalRequest, boolean z10) {
        AbstractC5504s.h(client, "client");
        AbstractC5504s.h(originalRequest, "originalRequest");
        this.f51854a = client;
        this.f51855b = originalRequest;
        this.f51856c = z10;
        this.f51857d = client.q().a();
        this.f51858e = client.v().a(this);
        c cVar = new c();
        cVar.g(client.k(), TimeUnit.MILLISECONDS);
        this.f51859f = cVar;
        this.f51860g = new AtomicBoolean();
        this.f51868o = true;
    }

    private final IOException D(IOException iOException) {
        if (this.f51864k || !this.f51859f.w()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final String E() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u1() ? "canceled " : "");
        sb2.append(this.f51856c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(x());
        return sb2.toString();
    }

    private final IOException e(IOException iOException) {
        Socket socketY;
        boolean z10 = AbstractC4807e.f47069h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        f fVar = this.f51863j;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                socketY = y();
            }
            if (this.f51863j == null) {
                if (socketY != null) {
                    AbstractC4807e.n(socketY);
                }
                this.f51858e.l(this, fVar);
            } else if (socketY != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionD = D(iOException);
        if (iOException == null) {
            this.f51858e.d(this);
            return iOExceptionD;
        }
        r rVar = this.f51858e;
        AbstractC5504s.e(iOExceptionD);
        rVar.e(this, iOExceptionD);
        return iOExceptionD;
    }

    private final void f() {
        this.f51861h = og.j.f55583a.g().i("response.body().close()");
        this.f51858e.f(this);
    }

    private final C4620a h(u uVar) {
        SSLSocketFactory sSLSocketFactoryP;
        HostnameVerifier hostnameVerifierB;
        C4626g c4626gN;
        if (uVar.i()) {
            sSLSocketFactoryP = this.f51854a.P();
            hostnameVerifierB = this.f51854a.B();
            c4626gN = this.f51854a.n();
        } else {
            sSLSocketFactoryP = null;
            hostnameVerifierB = null;
            c4626gN = null;
        }
        return new C4620a(uVar.h(), uVar.m(), this.f51854a.u(), this.f51854a.O(), sSLSocketFactoryP, hostnameVerifierB, c4626gN, this.f51854a.K(), this.f51854a.J(), this.f51854a.I(), this.f51854a.r(), this.f51854a.L());
    }

    public final boolean A() {
        d dVar = this.f51862i;
        AbstractC5504s.e(dVar);
        return dVar.e();
    }

    public final void B(f fVar) {
        this.f51871r = fVar;
    }

    public final void C() {
        if (this.f51864k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f51864k = true;
        this.f51859f.w();
    }

    @Override // dg.InterfaceC4624e
    public void O1(InterfaceC4625f responseCallback) {
        AbstractC5504s.h(responseCallback, "responseCallback");
        if (!this.f51860g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        f();
        this.f51854a.t().a(new a(this, responseCallback));
    }

    @Override // dg.InterfaceC4624e
    public E b() {
        if (!this.f51860g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f51859f.v();
        f();
        try {
            this.f51854a.t().b(this);
            return s();
        } finally {
            this.f51854a.t().g(this);
        }
    }

    @Override // dg.InterfaceC4624e
    public void cancel() {
        if (this.f51869p) {
            return;
        }
        this.f51869p = true;
        jg.c cVar = this.f51870q;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f51871r;
        if (fVar != null) {
            fVar.d();
        }
        this.f51858e.g(this);
    }

    public final void d(f connection) {
        AbstractC5504s.h(connection, "connection");
        if (!AbstractC4807e.f47069h || Thread.holdsLock(connection)) {
            if (this.f51863j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f51863j = connection;
            connection.n().add(new b(this, this.f51861h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    /* JADX INFO: renamed from: g */
    public e clone() {
        return new e(this.f51854a, this.f51855b, this.f51856c);
    }

    public final void i(C request, boolean z10) {
        AbstractC5504s.h(request, "request");
        if (this.f51865l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f51867n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f51866m) {
                throw new IllegalStateException("Check failed.");
            }
            L l10 = L.f17438a;
        }
        if (z10) {
            this.f51862i = new d(this.f51857d, h(request.p()), this, this.f51858e);
        }
    }

    public final void j(boolean z10) {
        jg.c cVar;
        synchronized (this) {
            if (!this.f51868o) {
                throw new IllegalStateException("released");
            }
            L l10 = L.f17438a;
        }
        if (z10 && (cVar = this.f51870q) != null) {
            cVar.d();
        }
        this.f51865l = null;
    }

    public final C4618A k() {
        return this.f51854a;
    }

    public final f m() {
        return this.f51863j;
    }

    public final r n() {
        return this.f51858e;
    }

    public final boolean p() {
        return this.f51856c;
    }

    public final jg.c q() {
        return this.f51865l;
    }

    public final C r() {
        return this.f51855b;
    }

    public final E s() {
        ArrayList arrayList = new ArrayList();
        AbstractC2279u.D(arrayList, this.f51854a.C());
        arrayList.add(new kg.j(this.f51854a));
        arrayList.add(new C5478a(this.f51854a.s()));
        arrayList.add(new C4949a(this.f51854a.j()));
        arrayList.add(C5401a.f51821a);
        if (!this.f51856c) {
            AbstractC2279u.D(arrayList, this.f51854a.E());
        }
        arrayList.add(new C5479b(this.f51856c));
        try {
            try {
                E eA = new kg.g(this, arrayList, 0, null, this.f51855b, this.f51854a.p(), this.f51854a.M(), this.f51854a.R()).a(this.f51855b);
                if (u1()) {
                    AbstractC4807e.m(eA);
                    throw new IOException("Canceled");
                }
                v(null);
                return eA;
            } catch (IOException e10) {
                IOException iOExceptionV = v(e10);
                AbstractC5504s.f(iOExceptionV, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionV;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                v(null);
            }
            throw th2;
        }
    }

    public final jg.c t(kg.g chain) throws IOException {
        AbstractC5504s.h(chain, "chain");
        synchronized (this) {
            if (!this.f51868o) {
                throw new IllegalStateException("released");
            }
            if (this.f51867n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f51866m) {
                throw new IllegalStateException("Check failed.");
            }
            L l10 = L.f17438a;
        }
        d dVar = this.f51862i;
        AbstractC5504s.e(dVar);
        jg.c cVar = new jg.c(this, this.f51858e, dVar, dVar.a(this.f51854a, chain));
        this.f51865l = cVar;
        this.f51870q = cVar;
        synchronized (this) {
            this.f51866m = true;
            this.f51867n = true;
        }
        if (this.f51869p) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    public final IOException u(jg.c exchange, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        AbstractC5504s.h(exchange, "exchange");
        if (AbstractC5504s.c(exchange, this.f51870q)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f51866m) {
                            if (z11 || !this.f51867n) {
                                z13 = false;
                            }
                            L l10 = L.f17438a;
                        }
                        if (z10) {
                            this.f51866m = false;
                        }
                        if (z11) {
                            this.f51867n = false;
                        }
                        boolean z14 = this.f51866m;
                        boolean z15 = (z14 || this.f51867n) ? false : true;
                        if (!z14 && !this.f51867n && !this.f51868o) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                        L l102 = L.f17438a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                    L l1022 = L.f17438a;
                }
            }
            if (z12) {
                this.f51870q = null;
                f fVar = this.f51863j;
                if (fVar != null) {
                    fVar.s();
                }
            }
            if (z13) {
                return e(iOException);
            }
        }
        return iOException;
    }

    @Override // dg.InterfaceC4624e
    public boolean u1() {
        return this.f51869p;
    }

    public final IOException v(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f51868o) {
                    this.f51868o = false;
                    if (!this.f51866m && !this.f51867n) {
                        z10 = true;
                    }
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? e(iOException) : iOException;
    }

    public final String x() {
        return this.f51855b.p().o();
    }

    public final Socket y() {
        f fVar = this.f51863j;
        AbstractC5504s.e(fVar);
        if (AbstractC4807e.f47069h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List listN = fVar.n();
        Iterator it = listN.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC5504s.c(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listN.remove(i10);
        this.f51863j = null;
        if (listN.isEmpty()) {
            fVar.C(System.nanoTime());
            if (this.f51857d.c(fVar)) {
                return fVar.E();
            }
        }
        return null;
    }

    @Override // dg.InterfaceC4624e
    public C z() {
        return this.f51855b;
    }
}
