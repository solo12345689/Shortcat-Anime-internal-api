package jg;

import dg.C;
import dg.D;
import dg.E;
import dg.F;
import dg.r;
import java.io.IOException;
import java.net.ProtocolException;
import kg.InterfaceC5481d;
import kotlin.jvm.internal.AbstractC5504s;
import sg.d;
import tg.AbstractC6692q;
import tg.C6683h;
import tg.K;
import tg.X;
import tg.Z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    private final e f51826a;

    /* JADX INFO: renamed from: b */
    private final r f51827b;

    /* JADX INFO: renamed from: c */
    private final d f51828c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5481d f51829d;

    /* JADX INFO: renamed from: e */
    private boolean f51830e;

    /* JADX INFO: renamed from: f */
    private boolean f51831f;

    /* JADX INFO: renamed from: g */
    private final f f51832g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a extends AbstractC6692q {

        /* JADX INFO: renamed from: b */
        private final long f51833b;

        /* JADX INFO: renamed from: c */
        private boolean f51834c;

        /* JADX INFO: renamed from: d */
        private long f51835d;

        /* JADX INFO: renamed from: e */
        private boolean f51836e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ c f51837f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, X delegate, long j10) {
            super(delegate);
            AbstractC5504s.h(delegate, "delegate");
            this.f51837f = cVar;
            this.f51833b = j10;
        }

        private final IOException a(IOException iOException) {
            if (this.f51834c) {
                return iOException;
            }
            this.f51834c = true;
            return this.f51837f.a(this.f51835d, false, true, iOException);
        }

        @Override // tg.AbstractC6692q, tg.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f51836e) {
                return;
            }
            this.f51836e = true;
            long j10 = this.f51833b;
            if (j10 != -1 && this.f51835d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // tg.AbstractC6692q, tg.X, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // tg.AbstractC6692q, tg.X
        public void t0(C6683h source, long j10) throws IOException {
            AbstractC5504s.h(source, "source");
            if (this.f51836e) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f51833b;
            if (j11 == -1 || this.f51835d + j10 <= j11) {
                try {
                    super.t0(source, j10);
                    this.f51835d += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f51833b + " bytes but received " + (this.f51835d + j10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class b extends tg.r {

        /* JADX INFO: renamed from: b */
        private final long f51838b;

        /* JADX INFO: renamed from: c */
        private long f51839c;

        /* JADX INFO: renamed from: d */
        private boolean f51840d;

        /* JADX INFO: renamed from: e */
        private boolean f51841e;

        /* JADX INFO: renamed from: f */
        private boolean f51842f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ c f51843g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, Z delegate, long j10) {
            super(delegate);
            AbstractC5504s.h(delegate, "delegate");
            this.f51843g = cVar;
            this.f51838b = j10;
            this.f51840d = true;
            if (j10 == 0) {
                b(null);
            }
        }

        @Override // tg.r, tg.Z
        public long N0(C6683h sink, long j10) throws IOException {
            AbstractC5504s.h(sink, "sink");
            if (this.f51842f) {
                throw new IllegalStateException("closed");
            }
            try {
                long jN0 = a().N0(sink, j10);
                if (this.f51840d) {
                    this.f51840d = false;
                    this.f51843g.i().w(this.f51843g.g());
                }
                if (jN0 == -1) {
                    b(null);
                    return -1L;
                }
                long j11 = this.f51839c + jN0;
                long j12 = this.f51838b;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f51838b + " bytes but received " + j11);
                }
                this.f51839c = j11;
                if (j11 == j12) {
                    b(null);
                }
                return jN0;
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        public final IOException b(IOException iOException) {
            if (this.f51841e) {
                return iOException;
            }
            this.f51841e = true;
            if (iOException == null && this.f51840d) {
                this.f51840d = false;
                this.f51843g.i().w(this.f51843g.g());
            }
            return this.f51843g.a(this.f51839c, true, false, iOException);
        }

        @Override // tg.r, tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f51842f) {
                return;
            }
            this.f51842f = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public c(e call, r eventListener, d finder, InterfaceC5481d codec) {
        AbstractC5504s.h(call, "call");
        AbstractC5504s.h(eventListener, "eventListener");
        AbstractC5504s.h(finder, "finder");
        AbstractC5504s.h(codec, "codec");
        this.f51826a = call;
        this.f51827b = eventListener;
        this.f51828c = finder;
        this.f51829d = codec;
        this.f51832g = codec.c();
    }

    private final void u(IOException iOException) {
        this.f51831f = true;
        this.f51828c.h(iOException);
        this.f51829d.c().H(this.f51826a, iOException);
    }

    public final IOException a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            u(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.f51827b.s(this.f51826a, iOException);
            } else {
                this.f51827b.q(this.f51826a, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f51827b.x(this.f51826a, iOException);
            } else {
                this.f51827b.v(this.f51826a, j10);
            }
        }
        return this.f51826a.u(this, z11, z10, iOException);
    }

    public final void b() {
        this.f51829d.cancel();
    }

    public final X c(C request, boolean z10) {
        AbstractC5504s.h(request, "request");
        this.f51830e = z10;
        D dE = request.e();
        AbstractC5504s.e(dE);
        long jA = dE.a();
        this.f51827b.r(this.f51826a);
        return new a(this, this.f51829d.g(request, jA), jA);
    }

    public final void d() {
        this.f51829d.cancel();
        this.f51826a.u(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f51829d.a();
        } catch (IOException e10) {
            this.f51827b.s(this.f51826a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f51829d.h();
        } catch (IOException e10) {
            this.f51827b.s(this.f51826a, e10);
            u(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f51826a;
    }

    public final f h() {
        return this.f51832g;
    }

    public final r i() {
        return this.f51827b;
    }

    public final d j() {
        return this.f51828c;
    }

    public final boolean k() {
        return this.f51831f;
    }

    public final boolean l() {
        return !AbstractC5504s.c(this.f51828c.d().l().h(), this.f51832g.A().a().l().h());
    }

    public final boolean m() {
        return this.f51830e;
    }

    public final d.AbstractC0900d n() {
        this.f51826a.C();
        return this.f51829d.c().x(this);
    }

    public final void o() {
        this.f51829d.c().z();
    }

    public final void p() {
        this.f51826a.u(this, true, false, null);
    }

    public final F q(E response) throws IOException {
        AbstractC5504s.h(response, "response");
        try {
            String strD = E.D(response, "Content-Type", null, 2, null);
            long jF = this.f51829d.f(response);
            return new kg.h(strD, jF, K.d(new b(this, this.f51829d.d(response), jF)));
        } catch (IOException e10) {
            this.f51827b.x(this.f51826a, e10);
            u(e10);
            throw e10;
        }
    }

    public final E.a r(boolean z10) throws IOException {
        try {
            E.a aVarE = this.f51829d.e(z10);
            if (aVarE == null) {
                return aVarE;
            }
            aVarE.l(this);
            return aVarE;
        } catch (IOException e10) {
            this.f51827b.x(this.f51826a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void s(E response) {
        AbstractC5504s.h(response, "response");
        this.f51827b.y(this.f51826a, response);
    }

    public final void t() {
        this.f51827b.z(this.f51826a);
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(C request) throws IOException {
        AbstractC5504s.h(request, "request");
        try {
            this.f51827b.u(this.f51826a);
            this.f51829d.b(request);
            this.f51827b.t(this.f51826a, request);
        } catch (IOException e10) {
            this.f51827b.s(this.f51826a, e10);
            u(e10);
            throw e10;
        }
    }
}
