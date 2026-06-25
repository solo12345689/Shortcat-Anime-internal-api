package mg;

import Td.L;
import dg.t;
import fg.AbstractC4807e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6681f;
import tg.C6683h;
import tg.InterfaceC6685j;
import tg.X;
import tg.Z;
import tg.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f53638o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f53640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f53641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f53642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f53643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f53645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f53647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f53648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f53649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f53650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private mg.b f53651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IOException f53652n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class b implements X {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f53653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C6683h f53654b = new C6683h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t f53655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f53656d;

        public b(boolean z10) {
            this.f53653a = z10;
        }

        /* JADX WARN: Finally extract failed */
        private final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            i iVar = i.this;
            synchronized (iVar) {
                try {
                    iVar.s().v();
                    while (iVar.r() >= iVar.q() && !this.f53653a && !this.f53656d && iVar.h() == null) {
                        try {
                            iVar.D();
                        } catch (Throwable th2) {
                            iVar.s().C();
                            throw th2;
                        }
                    }
                    iVar.s().C();
                    iVar.c();
                    jMin = Math.min(iVar.q() - iVar.r(), this.f53654b.size());
                    iVar.B(iVar.r() + jMin);
                    z11 = z10 && jMin == this.f53654b.size();
                    L l10 = L.f17438a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            i.this.s().v();
            try {
                i.this.g().j2(i.this.j(), z11, this.f53654b, jMin);
            } finally {
                i.this.s().C();
            }
        }

        public final boolean b() {
            return this.f53656d;
        }

        @Override // tg.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (AbstractC4807e.f47069h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                if (this.f53656d) {
                    return;
                }
                boolean z10 = iVar2.h() == null;
                L l10 = L.f17438a;
                if (!i.this.o().f53653a) {
                    boolean z11 = this.f53654b.size() > 0;
                    if (this.f53655c != null) {
                        while (this.f53654b.size() > 0) {
                            a(false);
                        }
                        f fVarG = i.this.g();
                        int iJ = i.this.j();
                        t tVar = this.f53655c;
                        AbstractC5504s.e(tVar);
                        fVarG.k2(iJ, z10, AbstractC4807e.P(tVar));
                    } else if (z11) {
                        while (this.f53654b.size() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        i.this.g().j2(i.this.j(), true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f53656d = true;
                    L l11 = L.f17438a;
                }
                i.this.g().flush();
                i.this.b();
            }
        }

        @Override // tg.X, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (AbstractC4807e.f47069h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                iVar2.c();
                L l10 = L.f17438a;
            }
            while (this.f53654b.size() > 0) {
                a(false);
                i.this.g().flush();
            }
        }

        public final boolean g() {
            return this.f53653a;
        }

        @Override // tg.X
        public a0 t() {
            return i.this.s();
        }

        @Override // tg.X
        public void t0(C6683h source, long j10) throws IOException {
            AbstractC5504s.h(source, "source");
            i iVar = i.this;
            if (!AbstractC4807e.f47069h || !Thread.holdsLock(iVar)) {
                this.f53654b.t0(source, j10);
                while (this.f53654b.size() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class c implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f53658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f53659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C6683h f53660c = new C6683h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C6683h f53661d = new C6683h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private t f53662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f53663f;

        public c(long j10, boolean z10) {
            this.f53658a = j10;
            this.f53659b = z10;
        }

        private final void k(long j10) {
            i iVar = i.this;
            if (!AbstractC4807e.f47069h || !Thread.holdsLock(iVar)) {
                i.this.g().i2(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        @Override // tg.Z
        public long N0(C6683h sink, long j10) throws IOException {
            IOException iOExceptionI;
            boolean z10;
            long jN0;
            AbstractC5504s.h(sink, "sink");
            long j11 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                i iVar = i.this;
                synchronized (iVar) {
                    iVar.m().v();
                    try {
                        if (iVar.h() == null || this.f53659b) {
                            iOExceptionI = null;
                        } else {
                            iOExceptionI = iVar.i();
                            if (iOExceptionI == null) {
                                mg.b bVarH = iVar.h();
                                AbstractC5504s.e(bVarH);
                                iOExceptionI = new n(bVarH);
                            }
                        }
                        if (this.f53663f) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.f53661d.size() > j11) {
                            C6683h c6683h = this.f53661d;
                            jN0 = c6683h.N0(sink, Math.min(j10, c6683h.size()));
                            iVar.A(iVar.l() + jN0);
                            long jL = iVar.l() - iVar.k();
                            if (iOExceptionI == null && jL >= iVar.g().G0().c() / 2) {
                                iVar.g().o2(iVar.j(), jL);
                                iVar.z(iVar.l());
                            }
                        } else {
                            if (!this.f53659b && iOExceptionI == null) {
                                iVar.D();
                                z10 = true;
                            }
                            jN0 = -1;
                        }
                        iVar.m().C();
                        L l10 = L.f17438a;
                    } finally {
                    }
                }
                if (!z10) {
                    if (jN0 != -1) {
                        return jN0;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    throw iOExceptionI;
                }
                j11 = 0;
            }
        }

        public final boolean a() {
            return this.f53663f;
        }

        public final boolean b() {
            return this.f53659b;
        }

        @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            i iVar = i.this;
            synchronized (iVar) {
                this.f53663f = true;
                size = this.f53661d.size();
                this.f53661d.g();
                AbstractC5504s.f(iVar, "null cannot be cast to non-null type java.lang.Object");
                iVar.notifyAll();
                L l10 = L.f17438a;
            }
            if (size > 0) {
                k(size);
            }
            i.this.b();
        }

        public final void g(InterfaceC6685j source, long j10) throws EOFException {
            boolean z10;
            boolean z11;
            AbstractC5504s.h(source, "source");
            i iVar = i.this;
            if (AbstractC4807e.f47069h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (i.this) {
                    z10 = this.f53659b;
                    z11 = this.f53661d.size() + j11 > this.f53658a;
                    L l10 = L.f17438a;
                }
                if (z11) {
                    source.skip(j11);
                    i.this.f(mg.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j11);
                    return;
                }
                long jN0 = source.N0(this.f53660c, j11);
                if (jN0 == -1) {
                    throw new EOFException();
                }
                j11 -= jN0;
                i iVar2 = i.this;
                synchronized (iVar2) {
                    try {
                        if (this.f53663f) {
                            this.f53660c.g();
                        } else {
                            boolean z12 = this.f53661d.size() == 0;
                            this.f53661d.O0(this.f53660c);
                            if (z12) {
                                AbstractC5504s.f(iVar2, "null cannot be cast to non-null type java.lang.Object");
                                iVar2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            k(j10);
        }

        public final void h(boolean z10) {
            this.f53659b = z10;
        }

        public final void j(t tVar) {
            this.f53662e = tVar;
        }

        @Override // tg.Z
        public a0 t() {
            return i.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class d extends C6681f {
        public d() {
        }

        @Override // tg.C6681f
        protected void B() {
            i.this.f(mg.b.CANCEL);
            i.this.g().c2();
        }

        public final void C() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // tg.C6681f
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public i(int i10, f connection, boolean z10, boolean z11, t tVar) {
        AbstractC5504s.h(connection, "connection");
        this.f53639a = i10;
        this.f53640b = connection;
        this.f53644f = connection.M0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f53645g = arrayDeque;
        this.f53647i = new c(connection.G0().c(), z11);
        this.f53648j = new b(z10);
        this.f53649k = new d();
        this.f53650l = new d();
        if (tVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(tVar);
        }
    }

    private final boolean e(mg.b bVar, IOException iOException) {
        if (AbstractC4807e.f47069h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f53651m != null) {
                return false;
            }
            this.f53651m = bVar;
            this.f53652n = iOException;
            AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f53647i.b() && this.f53648j.g()) {
                return false;
            }
            L l10 = L.f17438a;
            this.f53640b.b2(this.f53639a);
            return true;
        }
    }

    public final void A(long j10) {
        this.f53641c = j10;
    }

    public final void B(long j10) {
        this.f53643e = j10;
    }

    public final synchronized t C() throws IOException {
        Object objRemoveFirst;
        this.f53649k.v();
        while (this.f53645g.isEmpty() && this.f53651m == null) {
            try {
                D();
            } catch (Throwable th2) {
                this.f53649k.C();
                throw th2;
            }
        }
        this.f53649k.C();
        if (this.f53645g.isEmpty()) {
            IOException iOException = this.f53652n;
            if (iOException != null) {
                throw iOException;
            }
            mg.b bVar = this.f53651m;
            AbstractC5504s.e(bVar);
            throw new n(bVar);
        }
        objRemoveFirst = this.f53645g.removeFirst();
        AbstractC5504s.g(objRemoveFirst, "headersQueue.removeFirst()");
        return (t) objRemoveFirst;
    }

    public final void D() throws InterruptedIOException {
        try {
            AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final a0 E() {
        return this.f53650l;
    }

    public final void a(long j10) {
        this.f53644f += j10;
        if (j10 > 0) {
            AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean zU;
        if (AbstractC4807e.f47069h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !this.f53647i.b() && this.f53647i.a() && (this.f53648j.g() || this.f53648j.b());
                zU = u();
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            d(mg.b.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.f53640b.b2(this.f53639a);
        }
    }

    public final void c() throws IOException {
        if (this.f53648j.b()) {
            throw new IOException("stream closed");
        }
        if (this.f53648j.g()) {
            throw new IOException("stream finished");
        }
        if (this.f53651m != null) {
            IOException iOException = this.f53652n;
            if (iOException != null) {
                throw iOException;
            }
            mg.b bVar = this.f53651m;
            AbstractC5504s.e(bVar);
            throw new n(bVar);
        }
    }

    public final void d(mg.b rstStatusCode, IOException iOException) {
        AbstractC5504s.h(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f53640b.m2(this.f53639a, rstStatusCode);
        }
    }

    public final void f(mg.b errorCode) {
        AbstractC5504s.h(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f53640b.n2(this.f53639a, errorCode);
        }
    }

    public final f g() {
        return this.f53640b;
    }

    public final synchronized mg.b h() {
        return this.f53651m;
    }

    public final IOException i() {
        return this.f53652n;
    }

    public final int j() {
        return this.f53639a;
    }

    public final long k() {
        return this.f53642d;
    }

    public final long l() {
        return this.f53641c;
    }

    public final d m() {
        return this.f53649k;
    }

    public final X n() {
        synchronized (this) {
            try {
                if (!this.f53646h && !t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f53648j;
    }

    public final b o() {
        return this.f53648j;
    }

    public final c p() {
        return this.f53647i;
    }

    public final long q() {
        return this.f53644f;
    }

    public final long r() {
        return this.f53643e;
    }

    public final d s() {
        return this.f53650l;
    }

    public final boolean t() {
        return this.f53640b.h0() == ((this.f53639a & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.f53651m != null) {
                return false;
            }
            if (this.f53647i.b() || this.f53647i.a()) {
                if (this.f53648j.g() || this.f53648j.b()) {
                    if (this.f53646h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final a0 v() {
        return this.f53649k;
    }

    public final void w(InterfaceC6685j source, int i10) {
        AbstractC5504s.h(source, "source");
        if (!AbstractC4807e.f47069h || !Thread.holdsLock(this)) {
            this.f53647i.g(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void x(t headers, boolean z10) {
        boolean zU;
        AbstractC5504s.h(headers, "headers");
        if (AbstractC4807e.f47069h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f53646h && z10) {
                    this.f53647i.j(headers);
                } else {
                    this.f53646h = true;
                    this.f53645g.add(headers);
                }
                if (z10) {
                    this.f53647i.h(true);
                }
                zU = u();
                AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zU) {
            return;
        }
        this.f53640b.b2(this.f53639a);
    }

    public final synchronized void y(mg.b errorCode) {
        AbstractC5504s.h(errorCode, "errorCode");
        if (this.f53651m == null) {
            this.f53651m = errorCode;
            AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.f53642d = j10;
    }
}
