package M2;

import F2.t;
import M2.D;
import M2.L;
import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import t2.AbstractC6614a;
import w2.InterfaceC6932F;

/* JADX INFO: renamed from: M2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1918h extends AbstractC1911a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f11956h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f11957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC6932F f11958j;

    /* JADX INFO: renamed from: M2.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements L, F2.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f11959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private L.a f11960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t.a f11961c;

        public a(Object obj) {
            this.f11960b = AbstractC1918h.this.v(null);
            this.f11961c = AbstractC1918h.this.t(null);
            this.f11959a = obj;
        }

        private boolean b(int i10, D.b bVar) {
            D.b bVarE;
            if (bVar != null) {
                bVarE = AbstractC1918h.this.E(this.f11959a, bVar);
                if (bVarE == null) {
                    return false;
                }
            } else {
                bVarE = null;
            }
            int iG = AbstractC1918h.this.G(this.f11959a, i10);
            L.a aVar = this.f11960b;
            if (aVar.f11689a != iG || !Objects.equals(aVar.f11690b, bVarE)) {
                this.f11960b = AbstractC1918h.this.u(iG, bVarE);
            }
            t.a aVar2 = this.f11961c;
            if (aVar2.f6268a == iG && Objects.equals(aVar2.f6269b, bVarE)) {
                return true;
            }
            this.f11961c = AbstractC1918h.this.s(iG, bVarE);
            return true;
        }

        private B d(B b10, D.b bVar) {
            long jF = AbstractC1918h.this.F(this.f11959a, b10.f11659f, bVar);
            long jF2 = AbstractC1918h.this.F(this.f11959a, b10.f11660g, bVar);
            return (jF == b10.f11659f && jF2 == b10.f11660g) ? b10 : new B(b10.f11654a, b10.f11655b, b10.f11656c, b10.f11657d, b10.f11658e, jF, jF2);
        }

        @Override // M2.L
        public void G(int i10, D.b bVar, C1934y c1934y, B b10, IOException iOException, boolean z10) {
            if (b(i10, bVar)) {
                this.f11960b.t(c1934y, d(b10, bVar), iOException, z10);
            }
        }

        @Override // M2.L
        public void O(int i10, D.b bVar, C1934y c1934y, B b10, int i11) {
            if (b(i10, bVar)) {
                this.f11960b.w(c1934y, d(b10, bVar), i11);
            }
        }

        @Override // F2.t
        public void U(int i10, D.b bVar) {
            if (b(i10, bVar)) {
                this.f11961c.i();
            }
        }

        @Override // M2.L
        public void a0(int i10, D.b bVar, C1934y c1934y, B b10) {
            if (b(i10, bVar)) {
                this.f11960b.n(c1934y, d(b10, bVar));
            }
        }

        @Override // M2.L
        public void i0(int i10, D.b bVar, C1934y c1934y, B b10) {
            if (b(i10, bVar)) {
                this.f11960b.q(c1934y, d(b10, bVar));
            }
        }

        @Override // M2.L
        public void j0(int i10, D.b bVar, B b10) {
            if (b(i10, bVar)) {
                this.f11960b.k(d(b10, bVar));
            }
        }

        @Override // F2.t
        public void o0(int i10, D.b bVar) {
            if (b(i10, bVar)) {
                this.f11961c.h();
            }
        }

        @Override // F2.t
        public void q0(int i10, D.b bVar) {
            if (b(i10, bVar)) {
                this.f11961c.m();
            }
        }

        @Override // F2.t
        public void u0(int i10, D.b bVar, int i11) {
            if (b(i10, bVar)) {
                this.f11961c.k(i11);
            }
        }

        @Override // F2.t
        public void v0(int i10, D.b bVar) {
            if (b(i10, bVar)) {
                this.f11961c.j();
            }
        }

        @Override // F2.t
        public void w0(int i10, D.b bVar, Exception exc) {
            if (b(i10, bVar)) {
                this.f11961c.l(exc);
            }
        }

        @Override // M2.L
        public void x0(int i10, D.b bVar, B b10) {
            if (b(i10, bVar)) {
                this.f11960b.z(d(b10, bVar));
            }
        }
    }

    /* JADX INFO: renamed from: M2.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D f11963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D.c f11964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f11965c;

        public b(D d10, D.c cVar, a aVar) {
            this.f11963a = d10;
            this.f11964b = cVar;
            this.f11965c = aVar;
        }
    }

    protected AbstractC1918h() {
    }

    @Override // M2.AbstractC1911a
    protected void A(InterfaceC6932F interfaceC6932F) {
        this.f11958j = interfaceC6932F;
        this.f11957i = t2.a0.C();
    }

    @Override // M2.AbstractC1911a
    protected void C() {
        for (b bVar : this.f11956h.values()) {
            bVar.f11963a.d(bVar.f11964b);
            bVar.f11963a.k(bVar.f11965c);
            bVar.f11963a.c(bVar.f11965c);
        }
        this.f11956h.clear();
    }

    protected abstract D.b E(Object obj, D.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void H(Object obj, D d10, q2.Y y10);

    protected final void I(final Object obj, D d10) {
        AbstractC6614a.a(!this.f11956h.containsKey(obj));
        D.c cVar = new D.c() { // from class: M2.g
            @Override // M2.D.c
            public final void a(D d11, q2.Y y10) {
                this.f11933a.H(obj, d11, y10);
            }
        };
        a aVar = new a(obj);
        this.f11956h.put(obj, new b(d10, cVar, aVar));
        d10.q((Handler) AbstractC6614a.e(this.f11957i), aVar);
        d10.b((Handler) AbstractC6614a.e(this.f11957i), aVar);
        d10.r(cVar, this.f11958j, y());
        if (z()) {
            return;
        }
        d10.p(cVar);
    }

    @Override // M2.D
    public void l() {
        Iterator it = this.f11956h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f11963a.l();
        }
    }

    @Override // M2.AbstractC1911a
    protected void w() {
        for (b bVar : this.f11956h.values()) {
            bVar.f11963a.p(bVar.f11964b);
        }
    }

    @Override // M2.AbstractC1911a
    protected void x() {
        for (b bVar : this.f11956h.values()) {
            bVar.f11963a.h(bVar.f11964b);
        }
    }

    protected int G(Object obj, int i10) {
        return i10;
    }

    protected long F(Object obj, long j10, D.b bVar) {
        return j10;
    }
}
