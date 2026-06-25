package hg;

import Df.r;
import dg.C;
import dg.C4622c;
import dg.E;
import dg.EnumC4619B;
import dg.F;
import dg.InterfaceC4624e;
import dg.t;
import dg.v;
import fg.AbstractC4807e;
import hg.C4951c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kg.AbstractC5482e;
import kg.C5483f;
import kg.h;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6683h;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;
import tg.K;
import tg.X;
import tg.Z;
import tg.a0;

/* JADX INFO: renamed from: hg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4949a implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0768a f47855b = new C0768a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4622c f47856a;

    /* JADX INFO: renamed from: hg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0768a {
        public /* synthetic */ C0768a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final t c(t tVar, t tVar2) {
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strF = tVar.f(i10);
                String strP = tVar.p(i10);
                if ((!r.B("Warning", strF, true) || !r.Q(strP, "1", false, 2, null)) && (d(strF) || !e(strF) || tVar2.d(strF) == null)) {
                    aVar.c(strF, strP);
                }
            }
            int size2 = tVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strF2 = tVar2.f(i11);
                if (!d(strF2) && e(strF2)) {
                    aVar.c(strF2, tVar2.p(i11));
                }
            }
            return aVar.e();
        }

        private final boolean d(String str) {
            return r.B("Content-Length", str, true) || r.B("Content-Encoding", str, true) || r.B("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (r.B("Connection", str, true) || r.B("Keep-Alive", str, true) || r.B("Proxy-Authenticate", str, true) || r.B("Proxy-Authorization", str, true) || r.B("TE", str, true) || r.B("Trailers", str, true) || r.B("Transfer-Encoding", str, true) || r.B("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final E f(E e10) {
            return (e10 != null ? e10.j() : null) != null ? e10.Y().b(null).c() : e10;
        }

        private C0768a() {
        }
    }

    /* JADX INFO: renamed from: hg.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f47857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6685j f47858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC4950b f47859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6684i f47860d;

        b(InterfaceC6685j interfaceC6685j, InterfaceC4950b interfaceC4950b, InterfaceC6684i interfaceC6684i) {
            this.f47858b = interfaceC6685j;
            this.f47859c = interfaceC4950b;
            this.f47860d = interfaceC6684i;
        }

        @Override // tg.Z
        public long N0(C6683h sink, long j10) throws IOException {
            AbstractC5504s.h(sink, "sink");
            try {
                long jN0 = this.f47858b.N0(sink, j10);
                if (jN0 != -1) {
                    sink.m(this.f47860d.s(), sink.size() - jN0, jN0);
                    this.f47860d.g0();
                    return jN0;
                }
                if (!this.f47857a) {
                    this.f47857a = true;
                    this.f47860d.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (this.f47857a) {
                    throw e10;
                }
                this.f47857a = true;
                this.f47859c.a();
                throw e10;
            }
        }

        @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f47857a && !AbstractC4807e.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f47857a = true;
                this.f47859c.a();
            }
            this.f47858b.close();
        }

        @Override // tg.Z
        public a0 t() {
            return this.f47858b.t();
        }
    }

    public C4949a(C4622c c4622c) {
        this.f47856a = c4622c;
    }

    private final E b(InterfaceC4950b interfaceC4950b, E e10) {
        if (interfaceC4950b == null) {
            return e10;
        }
        X xB = interfaceC4950b.b();
        F fJ = e10.j();
        AbstractC5504s.e(fJ);
        b bVar = new b(fJ.k(), interfaceC4950b, K.c(xB));
        return e10.Y().b(new h(E.D(e10, "Content-Type", null, 2, null), e10.j().h(), K.d(bVar))).c();
    }

    @Override // dg.v
    public E a(v.a chain) {
        dg.r rVarN;
        F fJ;
        F fJ2;
        AbstractC5504s.h(chain, "chain");
        InterfaceC4624e interfaceC4624eCall = chain.call();
        C4622c c4622c = this.f47856a;
        E eB = c4622c != null ? c4622c.b(chain.z()) : null;
        C4951c c4951cB = new C4951c.b(System.currentTimeMillis(), chain.z(), eB).b();
        C cB = c4951cB.b();
        E eA = c4951cB.a();
        C4622c c4622c2 = this.f47856a;
        if (c4622c2 != null) {
            c4622c2.q(c4951cB);
        }
        jg.e eVar = interfaceC4624eCall instanceof jg.e ? (jg.e) interfaceC4624eCall : null;
        if (eVar == null || (rVarN = eVar.n()) == null) {
            rVarN = dg.r.f45571b;
        }
        if (eB != null && eA == null && (fJ2 = eB.j()) != null) {
            AbstractC4807e.m(fJ2);
        }
        if (cB == null && eA == null) {
            E eC = new E.a().s(chain.z()).p(EnumC4619B.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(AbstractC4807e.f47064c).t(-1L).q(System.currentTimeMillis()).c();
            rVarN.A(interfaceC4624eCall, eC);
            return eC;
        }
        if (cB == null) {
            AbstractC5504s.e(eA);
            E eC2 = eA.Y().d(f47855b.f(eA)).c();
            rVarN.b(interfaceC4624eCall, eC2);
            return eC2;
        }
        if (eA != null) {
            rVarN.a(interfaceC4624eCall, eA);
        } else if (this.f47856a != null) {
            rVarN.c(interfaceC4624eCall);
        }
        try {
            E eA2 = chain.a(cB);
            if (eA2 == null && eB != null && fJ != null) {
            }
            if (eA != null) {
                if (eA2 != null && eA2.o() == 304) {
                    E.a aVarY = eA.Y();
                    C0768a c0768a = f47855b;
                    E eC3 = aVarY.k(c0768a.c(eA.E(), eA2.E())).t(eA2.G0()).q(eA2.B0()).d(c0768a.f(eA)).n(c0768a.f(eA2)).c();
                    F fJ3 = eA2.j();
                    AbstractC5504s.e(fJ3);
                    fJ3.close();
                    C4622c c4622c3 = this.f47856a;
                    AbstractC5504s.e(c4622c3);
                    c4622c3.o();
                    this.f47856a.w(eA, eC3);
                    rVarN.b(interfaceC4624eCall, eC3);
                    return eC3;
                }
                F fJ4 = eA.j();
                if (fJ4 != null) {
                    AbstractC4807e.m(fJ4);
                }
            }
            AbstractC5504s.e(eA2);
            E.a aVarY2 = eA2.Y();
            C0768a c0768a2 = f47855b;
            E eC4 = aVarY2.d(c0768a2.f(eA)).n(c0768a2.f(eA2)).c();
            if (this.f47856a != null) {
                if (AbstractC5482e.b(eC4) && C4951c.f47861c.a(eC4, cB)) {
                    E eB2 = b(this.f47856a.j(eC4), eC4);
                    if (eA != null) {
                        rVarN.c(interfaceC4624eCall);
                    }
                    return eB2;
                }
                if (C5483f.f52206a.a(cB.l())) {
                    try {
                        this.f47856a.k(cB);
                    } catch (IOException unused) {
                    }
                }
            }
            return eC4;
        } finally {
            if (eB != null && (fJ = eB.j()) != null) {
                AbstractC4807e.m(fJ);
            }
        }
    }
}
