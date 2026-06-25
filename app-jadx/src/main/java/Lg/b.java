package lg;

import Df.r;
import dg.C;
import dg.C4618A;
import dg.E;
import dg.n;
import dg.t;
import dg.u;
import fg.AbstractC4807e;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kg.AbstractC5482e;
import kg.InterfaceC5481d;
import kg.i;
import kg.k;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6683h;
import tg.C6693s;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;
import tg.X;
import tg.Z;
import tg.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements InterfaceC5481d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f52777h = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4618A f52778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jg.f f52779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6685j f52780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6684i f52781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5595a f52783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t f52784g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private abstract class a implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6693s f52785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52786b;

        public a() {
            this.f52785a = new C6693s(b.this.f52780c.t());
        }

        @Override // tg.Z
        public long N0(C6683h sink, long j10) throws IOException {
            AbstractC5504s.h(sink, "sink");
            try {
                return b.this.f52780c.N0(sink, j10);
            } catch (IOException e10) {
                b.this.c().z();
                b();
                throw e10;
            }
        }

        protected final boolean a() {
            return this.f52786b;
        }

        public final void b() {
            if (b.this.f52782e == 6) {
                return;
            }
            if (b.this.f52782e == 5) {
                b.this.r(this.f52785a);
                b.this.f52782e = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.f52782e);
            }
        }

        protected final void g(boolean z10) {
            this.f52786b = z10;
        }

        @Override // tg.Z
        public a0 t() {
            return this.f52785a;
        }
    }

    /* JADX INFO: renamed from: lg.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class C0825b implements X {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6693s f52788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52789b;

        public C0825b() {
            this.f52788a = new C6693s(b.this.f52781d.t());
        }

        @Override // tg.X, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f52789b) {
                return;
            }
            this.f52789b = true;
            b.this.f52781d.s0("0\r\n\r\n");
            b.this.r(this.f52788a);
            b.this.f52782e = 3;
        }

        @Override // tg.X, java.io.Flushable
        public synchronized void flush() {
            if (this.f52789b) {
                return;
            }
            b.this.f52781d.flush();
        }

        @Override // tg.X
        public a0 t() {
            return this.f52788a;
        }

        @Override // tg.X
        public void t0(C6683h source, long j10) {
            AbstractC5504s.h(source, "source");
            if (this.f52789b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            b.this.f52781d.z1(j10);
            b.this.f52781d.s0("\r\n");
            b.this.f52781d.t0(source, j10);
            b.this.f52781d.s0("\r\n");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u f52791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f52792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f52793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f52794g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, u url) {
            super();
            AbstractC5504s.h(url, "url");
            this.f52794g = bVar;
            this.f52791d = url;
            this.f52792e = -1L;
            this.f52793f = true;
        }

        private final void h() throws ProtocolException {
            if (this.f52792e != -1) {
                this.f52794g.f52780c.D0();
            }
            try {
                this.f52792e = this.f52794g.f52780c.X1();
                String string = r.k1(this.f52794g.f52780c.D0()).toString();
                if (this.f52792e < 0 || (string.length() > 0 && !r.Q(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f52792e + string + '\"');
                }
                if (this.f52792e == 0) {
                    this.f52793f = false;
                    b bVar = this.f52794g;
                    bVar.f52784g = bVar.f52783f.a();
                    C4618A c4618a = this.f52794g.f52778a;
                    AbstractC5504s.e(c4618a);
                    n nVarS = c4618a.s();
                    u uVar = this.f52791d;
                    t tVar = this.f52794g.f52784g;
                    AbstractC5504s.e(tVar);
                    AbstractC5482e.f(nVarS, uVar, tVar);
                    b();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // lg.b.a, tg.Z
        public long N0(C6683h sink, long j10) throws IOException {
            AbstractC5504s.h(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f52793f) {
                return -1L;
            }
            long j11 = this.f52792e;
            if (j11 == 0 || j11 == -1) {
                h();
                if (!this.f52793f) {
                    return -1L;
                }
            }
            long jN0 = super.N0(sink, Math.min(j10, this.f52792e));
            if (jN0 != -1) {
                this.f52792e -= jN0;
                return jN0;
            }
            this.f52794g.c().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f52793f && !AbstractC4807e.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f52794g.c().z();
                b();
            }
            g(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f52795d;

        public e(long j10) {
            super();
            this.f52795d = j10;
            if (j10 == 0) {
                b();
            }
        }

        @Override // lg.b.a, tg.Z
        public long N0(C6683h sink, long j10) throws IOException {
            AbstractC5504s.h(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f52795d;
            if (j11 == 0) {
                return -1L;
            }
            long jN0 = super.N0(sink, Math.min(j11, j10));
            if (jN0 == -1) {
                b.this.c().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j12 = this.f52795d - jN0;
            this.f52795d = j12;
            if (j12 == 0) {
                b();
            }
            return jN0;
        }

        @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f52795d != 0 && !AbstractC4807e.s(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.c().z();
                b();
            }
            g(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class f implements X {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6693s f52797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52798b;

        public f() {
            this.f52797a = new C6693s(b.this.f52781d.t());
        }

        @Override // tg.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f52798b) {
                return;
            }
            this.f52798b = true;
            b.this.r(this.f52797a);
            b.this.f52782e = 3;
        }

        @Override // tg.X, java.io.Flushable
        public void flush() {
            if (this.f52798b) {
                return;
            }
            b.this.f52781d.flush();
        }

        @Override // tg.X
        public a0 t() {
            return this.f52797a;
        }

        @Override // tg.X
        public void t0(C6683h source, long j10) {
            AbstractC5504s.h(source, "source");
            if (this.f52798b) {
                throw new IllegalStateException("closed");
            }
            AbstractC4807e.l(source.size(), 0L, j10);
            b.this.f52781d.t0(source, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f52800d;

        public g() {
            super();
        }

        @Override // lg.b.a, tg.Z
        public long N0(C6683h sink, long j10) throws IOException {
            AbstractC5504s.h(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f52800d) {
                return -1L;
            }
            long jN0 = super.N0(sink, j10);
            if (jN0 != -1) {
                return jN0;
            }
            this.f52800d = true;
            b();
            return -1L;
        }

        @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f52800d) {
                b();
            }
            g(true);
        }
    }

    public b(C4618A c4618a, jg.f connection, InterfaceC6685j source, InterfaceC6684i sink) {
        AbstractC5504s.h(connection, "connection");
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(sink, "sink");
        this.f52778a = c4618a;
        this.f52779b = connection;
        this.f52780c = source;
        this.f52781d = sink;
        this.f52783f = new C5595a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(C6693s c6693s) {
        a0 a0VarI = c6693s.i();
        c6693s.j(a0.f61004e);
        a0VarI.a();
        a0VarI.b();
    }

    private final boolean s(C c10) {
        return r.B("chunked", c10.h("Transfer-Encoding"), true);
    }

    private final boolean t(E e10) {
        return r.B("chunked", E.D(e10, "Transfer-Encoding", null, 2, null), true);
    }

    private final X u() {
        if (this.f52782e == 1) {
            this.f52782e = 2;
            return new C0825b();
        }
        throw new IllegalStateException(("state: " + this.f52782e).toString());
    }

    private final Z v(u uVar) {
        if (this.f52782e == 4) {
            this.f52782e = 5;
            return new c(this, uVar);
        }
        throw new IllegalStateException(("state: " + this.f52782e).toString());
    }

    private final Z w(long j10) {
        if (this.f52782e == 4) {
            this.f52782e = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f52782e).toString());
    }

    private final X x() {
        if (this.f52782e == 1) {
            this.f52782e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f52782e).toString());
    }

    private final Z y() {
        if (this.f52782e == 4) {
            this.f52782e = 5;
            c().z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f52782e).toString());
    }

    public final void A(t headers, String requestLine) {
        AbstractC5504s.h(headers, "headers");
        AbstractC5504s.h(requestLine, "requestLine");
        if (this.f52782e != 0) {
            throw new IllegalStateException(("state: " + this.f52782e).toString());
        }
        this.f52781d.s0(requestLine).s0("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f52781d.s0(headers.f(i10)).s0(": ").s0(headers.p(i10)).s0("\r\n");
        }
        this.f52781d.s0("\r\n");
        this.f52782e = 1;
    }

    @Override // kg.InterfaceC5481d
    public void a() {
        this.f52781d.flush();
    }

    @Override // kg.InterfaceC5481d
    public void b(C request) {
        AbstractC5504s.h(request, "request");
        i iVar = i.f52219a;
        Proxy.Type type = c().A().b().type();
        AbstractC5504s.g(type, "connection.route().proxy.type()");
        A(request.i(), iVar.a(request, type));
    }

    @Override // kg.InterfaceC5481d
    public jg.f c() {
        return this.f52779b;
    }

    @Override // kg.InterfaceC5481d
    public void cancel() {
        c().d();
    }

    @Override // kg.InterfaceC5481d
    public Z d(E response) {
        AbstractC5504s.h(response, "response");
        if (!AbstractC5482e.b(response)) {
            return w(0L);
        }
        if (t(response)) {
            return v(response.F0().p());
        }
        long jV = AbstractC4807e.v(response);
        return jV != -1 ? w(jV) : y();
    }

    @Override // kg.InterfaceC5481d
    public E.a e(boolean z10) {
        int i10 = this.f52782e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f52782e).toString());
        }
        try {
            k kVarA = k.f52222d.a(this.f52783f.b());
            E.a aVarK = new E.a().p(kVarA.f52223a).g(kVarA.f52224b).m(kVarA.f52225c).k(this.f52783f.a());
            if (z10 && kVarA.f52224b == 100) {
                return null;
            }
            int i11 = kVarA.f52224b;
            if (i11 == 100) {
                this.f52782e = 3;
                return aVarK;
            }
            if (102 > i11 || i11 >= 200) {
                this.f52782e = 4;
                return aVarK;
            }
            this.f52782e = 3;
            return aVarK;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + c().A().a().l().o(), e10);
        }
    }

    @Override // kg.InterfaceC5481d
    public long f(E response) {
        AbstractC5504s.h(response, "response");
        if (!AbstractC5482e.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return AbstractC4807e.v(response);
    }

    @Override // kg.InterfaceC5481d
    public X g(C request, long j10) throws ProtocolException {
        AbstractC5504s.h(request, "request");
        if (request.e() != null && request.e().d()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (j10 != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // kg.InterfaceC5481d
    public void h() {
        this.f52781d.flush();
    }

    public final void z(E response) {
        AbstractC5504s.h(response, "response");
        long jV = AbstractC4807e.v(response);
        if (jV == -1) {
            return;
        }
        Z zW = w(jV);
        AbstractC4807e.M(zW, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        zW.close();
    }
}
