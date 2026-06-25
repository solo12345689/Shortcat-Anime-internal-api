package dg;

import Ud.AbstractC2279u;
import dg.t;
import java.io.Closeable;
import java.io.EOFException;
import java.util.List;
import kg.AbstractC5482e;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6683h;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class E implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f45271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC4619B f45272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f45275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f45276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F f45277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final E f45278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E f45279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final E f45280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f45281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f45282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final jg.c f45283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C4623d f45284n;

    public E(C request, EnumC4619B protocol, String message, int i10, s sVar, t headers, F f10, E e10, E e11, E e12, long j10, long j11, jg.c cVar) {
        AbstractC5504s.h(request, "request");
        AbstractC5504s.h(protocol, "protocol");
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(headers, "headers");
        this.f45271a = request;
        this.f45272b = protocol;
        this.f45273c = message;
        this.f45274d = i10;
        this.f45275e = sVar;
        this.f45276f = headers;
        this.f45277g = f10;
        this.f45278h = e10;
        this.f45279i = e11;
        this.f45280j = e12;
        this.f45281k = j10;
        this.f45282l = j11;
        this.f45283m = cVar;
    }

    public static /* synthetic */ String D(E e10, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return e10.C(str, str2);
    }

    public final long B0() {
        return this.f45282l;
    }

    public final String C(String name, String str) {
        AbstractC5504s.h(name, "name");
        String strD = this.f45276f.d(name);
        return strD == null ? str : strD;
    }

    public final t E() {
        return this.f45276f;
    }

    public final C F0() {
        return this.f45271a;
    }

    public final long G0() {
        return this.f45281k;
    }

    public final boolean H() {
        int i10 = this.f45274d;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean J() {
        int i10 = this.f45274d;
        return 200 <= i10 && i10 < 300;
    }

    public final String O() {
        return this.f45273c;
    }

    public final E S() {
        return this.f45278h;
    }

    public final a Y() {
        return new a(this);
    }

    public final F a() {
        return this.f45277g;
    }

    public final int b() {
        return this.f45274d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        F f10 = this.f45277g;
        if (f10 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        f10.close();
    }

    public final t g() {
        return this.f45276f;
    }

    public final C h() {
        return this.f45271a;
    }

    public final F h0(long j10) throws EOFException {
        F f10 = this.f45277g;
        AbstractC5504s.e(f10);
        InterfaceC6685j interfaceC6685jPeek = f10.k().peek();
        C6683h c6683h = new C6683h();
        interfaceC6685jPeek.y0(j10);
        c6683h.S1(interfaceC6685jPeek, Math.min(j10, interfaceC6685jPeek.s().size()));
        return F.f45298a.c(c6683h, this.f45277g.j(), c6683h.size());
    }

    public final F j() {
        return this.f45277g;
    }

    public final C4623d k() {
        C4623d c4623d = this.f45284n;
        if (c4623d != null) {
            return c4623d;
        }
        C4623d c4623dB = C4623d.f45360n.b(this.f45276f);
        this.f45284n = c4623dB;
        return c4623dB;
    }

    public final E k0() {
        return this.f45280j;
    }

    public final E l() {
        return this.f45279i;
    }

    public final List m() {
        String str;
        t tVar = this.f45276f;
        int i10 = this.f45274d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return AbstractC2279u.m();
            }
            str = "Proxy-Authenticate";
        }
        return AbstractC5482e.a(tVar, str);
    }

    public final int o() {
        return this.f45274d;
    }

    public final EnumC4619B p0() {
        return this.f45272b;
    }

    public final jg.c q() {
        return this.f45283m;
    }

    public String toString() {
        return "Response{protocol=" + this.f45272b + ", code=" + this.f45274d + ", message=" + this.f45273c + ", url=" + this.f45271a.p() + '}';
    }

    public final s w() {
        return this.f45275e;
    }

    public final String z(String name) {
        AbstractC5504s.h(name, "name");
        return D(this, name, null, 2, null);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C f45285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EnumC4619B f45286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f45287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f45288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s f45289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t.a f45290f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private F f45291g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private E f45292h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private E f45293i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private E f45294j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f45295k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f45296l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private jg.c f45297m;

        public a() {
            this.f45287c = -1;
            this.f45290f = new t.a();
        }

        private final void e(E e10) {
            if (e10 != null && e10.j() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, E e10) {
            if (e10 != null) {
                if (e10.j() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (e10.S() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (e10.l() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (e10.k0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String name, String value) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(value, "value");
            this.f45290f.a(name, value);
            return this;
        }

        public a b(F f10) {
            this.f45291g = f10;
            return this;
        }

        public E c() {
            int i10 = this.f45287c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f45287c).toString());
            }
            C c10 = this.f45285a;
            if (c10 == null) {
                throw new IllegalStateException("request == null");
            }
            EnumC4619B enumC4619B = this.f45286b;
            if (enumC4619B == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f45288d;
            if (str != null) {
                return new E(c10, enumC4619B, str, i10, this.f45289e, this.f45290f.e(), this.f45291g, this.f45292h, this.f45293i, this.f45294j, this.f45295k, this.f45296l, this.f45297m);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(E e10) {
            f("cacheResponse", e10);
            this.f45293i = e10;
            return this;
        }

        public a g(int i10) {
            this.f45287c = i10;
            return this;
        }

        public final int h() {
            return this.f45287c;
        }

        public a i(s sVar) {
            this.f45289e = sVar;
            return this;
        }

        public a j(String name, String value) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(value, "value");
            this.f45290f.i(name, value);
            return this;
        }

        public a k(t headers) {
            AbstractC5504s.h(headers, "headers");
            this.f45290f = headers.l();
            return this;
        }

        public final void l(jg.c deferredTrailers) {
            AbstractC5504s.h(deferredTrailers, "deferredTrailers");
            this.f45297m = deferredTrailers;
        }

        public a m(String message) {
            AbstractC5504s.h(message, "message");
            this.f45288d = message;
            return this;
        }

        public a n(E e10) {
            f("networkResponse", e10);
            this.f45292h = e10;
            return this;
        }

        public a o(E e10) {
            e(e10);
            this.f45294j = e10;
            return this;
        }

        public a p(EnumC4619B protocol) {
            AbstractC5504s.h(protocol, "protocol");
            this.f45286b = protocol;
            return this;
        }

        public a q(long j10) {
            this.f45296l = j10;
            return this;
        }

        public a r(String name) {
            AbstractC5504s.h(name, "name");
            this.f45290f.h(name);
            return this;
        }

        public a s(C request) {
            AbstractC5504s.h(request, "request");
            this.f45285a = request;
            return this;
        }

        public a t(long j10) {
            this.f45295k = j10;
            return this;
        }

        public a(E response) {
            AbstractC5504s.h(response, "response");
            this.f45287c = -1;
            this.f45285a = response.F0();
            this.f45286b = response.p0();
            this.f45287c = response.o();
            this.f45288d = response.O();
            this.f45289e = response.w();
            this.f45290f = response.E().l();
            this.f45291g = response.j();
            this.f45292h = response.S();
            this.f45293i = response.l();
            this.f45294j = response.k0();
            this.f45295k = response.G0();
            this.f45296l = response.B0();
            this.f45297m = response.q();
        }
    }
}
