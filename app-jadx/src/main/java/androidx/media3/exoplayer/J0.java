package androidx.media3.exoplayer;

import A2.AbstractC1003a;
import B2.InterfaceC1021a;
import B2.K1;
import M2.C1934y;
import M2.C1935z;
import M2.D;
import M2.e0;
import android.util.Pair;
import androidx.media3.exoplayer.J0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q2.C6071C;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.InterfaceC6631s;
import w2.InterfaceC6932F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class J0 {

    /* JADX INFO: renamed from: a */
    private final K1 f30388a;

    /* JADX INFO: renamed from: e */
    private final d f30392e;

    /* JADX INFO: renamed from: h */
    private final InterfaceC1021a f30395h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC6631s f30396i;

    /* JADX INFO: renamed from: k */
    private boolean f30398k;

    /* JADX INFO: renamed from: l */
    private InterfaceC6932F f30399l;

    /* JADX INFO: renamed from: j */
    private M2.e0 f30397j = new e0.a(0);

    /* JADX INFO: renamed from: c */
    private final IdentityHashMap f30390c = new IdentityHashMap();

    /* JADX INFO: renamed from: d */
    private final Map f30391d = new HashMap();

    /* JADX INFO: renamed from: b */
    private final List f30389b = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final HashMap f30393f = new HashMap();

    /* JADX INFO: renamed from: g */
    private final Set f30394g = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class a implements M2.L, F2.t {

        /* JADX INFO: renamed from: a */
        private final c f30400a;

        public a(c cVar) {
            this.f30400a = cVar;
        }

        private Pair I(int i10, D.b bVar) {
            D.b bVar2 = null;
            if (bVar != null) {
                D.b bVarN = J0.n(this.f30400a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(J0.s(this.f30400a, i10)), bVar2);
        }

        @Override // M2.L
        public void G(int i10, D.b bVar, final C1934y c1934y, final M2.B b10, final IOException iOException, final boolean z10) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.H0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f30378a;
                        Pair pair = pairI;
                        J0.this.f30395h.G(((Integer) pair.first).intValue(), (D.b) pair.second, c1934y, b10, iOException, z10);
                    }
                });
            }
        }

        @Override // M2.L
        public void O(int i10, D.b bVar, final C1934y c1934y, final M2.B b10, final int i11) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.G0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f30372a;
                        Pair pair = pairI;
                        J0.this.f30395h.O(((Integer) pair.first).intValue(), (D.b) pair.second, c1934y, b10, i11);
                    }
                });
            }
        }

        @Override // F2.t
        public void U(int i10, D.b bVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.I0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f30385a;
                        Pair pair = pairI;
                        J0.this.f30395h.U(((Integer) pair.first).intValue(), (D.b) pair.second);
                    }
                });
            }
        }

        @Override // M2.L
        public void a0(int i10, D.b bVar, final C1934y c1934y, final M2.B b10) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.A0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f30309a;
                        Pair pair = pairI;
                        J0.this.f30395h.a0(((Integer) pair.first).intValue(), (D.b) pair.second, c1934y, b10);
                    }
                });
            }
        }

        @Override // M2.L
        public void i0(int i10, D.b bVar, final C1934y c1934y, final M2.B b10) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.E0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f30325a;
                        Pair pair = pairI;
                        J0.this.f30395h.i0(((Integer) pair.first).intValue(), (D.b) pair.second, c1934y, b10);
                    }
                });
            }
        }

        @Override // M2.L
        public void j0(int i10, D.b bVar, final M2.B b10) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.C0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f30318a;
                        Pair pair = pairI;
                        J0.this.f30395h.j0(((Integer) pair.first).intValue(), (D.b) pair.second, b10);
                    }
                });
            }
        }

        @Override // F2.t
        public void o0(int i10, D.b bVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f31265a;
                        Pair pair = pairI;
                        J0.this.f30395h.o0(((Integer) pair.first).intValue(), (D.b) pair.second);
                    }
                });
            }
        }

        @Override // F2.t
        public void q0(int i10, D.b bVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.D0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f30322a;
                        Pair pair = pairI;
                        J0.this.f30395h.q0(((Integer) pair.first).intValue(), (D.b) pair.second);
                    }
                });
            }
        }

        @Override // F2.t
        public void u0(int i10, D.b bVar, final int i11) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.F0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f30368a;
                        Pair pair = pairI;
                        J0.this.f30395h.u0(((Integer) pair.first).intValue(), (D.b) pair.second, i11);
                    }
                });
            }
        }

        @Override // F2.t
        public void v0(int i10, D.b bVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f31261a;
                        Pair pair = pairI;
                        J0.this.f30395h.v0(((Integer) pair.first).intValue(), (D.b) pair.second);
                    }
                });
            }
        }

        @Override // F2.t
        public void w0(int i10, D.b bVar, final Exception exc) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.B0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f30314a;
                        Pair pair = pairI;
                        J0.this.f30395h.w0(((Integer) pair.first).intValue(), (D.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // M2.L
        public void x0(int i10, D.b bVar, final M2.B b10) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                J0.this.f30396i.i(new Runnable() { // from class: androidx.media3.exoplayer.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J0.a aVar = this.f31257a;
                        Pair pair = pairI;
                        J0.this.f30395h.x0(((Integer) pair.first).intValue(), (D.b) AbstractC6614a.e((D.b) pair.second), b10);
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a */
        public final M2.D f30402a;

        /* JADX INFO: renamed from: b */
        public final D.c f30403b;

        /* JADX INFO: renamed from: c */
        public final a f30404c;

        public b(M2.D d10, D.c cVar, a aVar) {
            this.f30402a = d10;
            this.f30403b = cVar;
            this.f30404c = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements InterfaceC2914v0 {

        /* JADX INFO: renamed from: a */
        public final M2.A f30405a;

        /* JADX INFO: renamed from: d */
        public int f30408d;

        /* JADX INFO: renamed from: e */
        public boolean f30409e;

        /* JADX INFO: renamed from: c */
        public final List f30407c = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f30406b = new Object();

        public c(M2.D d10, boolean z10) {
            this.f30405a = new M2.A(d10, z10);
        }

        @Override // androidx.media3.exoplayer.InterfaceC2914v0
        public q2.Y a() {
            return this.f30405a.W();
        }

        public void b(int i10) {
            this.f30408d = i10;
            this.f30409e = false;
            this.f30407c.clear();
        }

        @Override // androidx.media3.exoplayer.InterfaceC2914v0
        public Object s() {
            return this.f30406b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void d();
    }

    public J0(d dVar, InterfaceC1021a interfaceC1021a, InterfaceC6631s interfaceC6631s, K1 k12) {
        this.f30388a = k12;
        this.f30392e = dVar;
        this.f30395h = interfaceC1021a;
        this.f30396i = interfaceC6631s;
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f30389b.remove(i12);
            this.f30391d.remove(cVar.f30406b);
            g(i12, -cVar.f30405a.W().t());
            cVar.f30409e = true;
            if (this.f30398k) {
                u(cVar);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f30389b.size()) {
            ((c) this.f30389b.get(i10)).f30408d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = (b) this.f30393f.get(cVar);
        if (bVar != null) {
            bVar.f30402a.p(bVar.f30403b);
        }
    }

    private void k() {
        Iterator it = this.f30394g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f30407c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f30394g.add(cVar);
        b bVar = (b) this.f30393f.get(cVar);
        if (bVar != null) {
            bVar.f30402a.h(bVar.f30403b);
        }
    }

    private static Object m(Object obj) {
        return AbstractC1003a.A(obj);
    }

    public static D.b n(c cVar, D.b bVar) {
        for (int i10 = 0; i10 < cVar.f30407c.size(); i10++) {
            if (((D.b) cVar.f30407c.get(i10)).f11665d == bVar.f11665d) {
                return bVar.a(p(cVar, bVar.f11662a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return AbstractC1003a.B(obj);
    }

    private static Object p(c cVar, Object obj) {
        return AbstractC1003a.D(cVar.f30406b, obj);
    }

    public static int s(c cVar, int i10) {
        return i10 + cVar.f30408d;
    }

    private void u(c cVar) {
        if (cVar.f30409e && cVar.f30407c.isEmpty()) {
            b bVar = (b) AbstractC6614a.e((b) this.f30393f.remove(cVar));
            bVar.f30402a.d(bVar.f30403b);
            bVar.f30402a.k(bVar.f30404c);
            bVar.f30402a.c(bVar.f30404c);
            this.f30394g.remove(cVar);
        }
    }

    private void x(c cVar) {
        M2.A a10 = cVar.f30405a;
        D.c cVar2 = new D.c() { // from class: androidx.media3.exoplayer.w0
            @Override // M2.D.c
            public final void a(M2.D d10, q2.Y y10) {
                this.f31255a.f30392e.d();
            }
        };
        a aVar = new a(cVar);
        this.f30393f.put(cVar, new b(a10, cVar2, aVar));
        a10.q(t2.a0.E(), aVar);
        a10.b(t2.a0.E(), aVar);
        a10.r(cVar2, this.f30399l, this.f30388a);
    }

    public q2.Y A(int i10, int i11, M2.e0 e0Var) {
        AbstractC6614a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f30397j = e0Var;
        B(i10, i11);
        return i();
    }

    public q2.Y C(List list, M2.e0 e0Var) {
        B(0, this.f30389b.size());
        return f(this.f30389b.size(), list, e0Var);
    }

    public q2.Y D(M2.e0 e0Var) {
        int iR = r();
        if (e0Var.getLength() != iR) {
            e0Var = e0Var.e().g(0, iR);
        }
        this.f30397j = e0Var;
        return i();
    }

    public q2.Y E(int i10, int i11, List list) {
        AbstractC6614a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        AbstractC6614a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((c) this.f30389b.get(i12)).f30405a.j((C6071C) list.get(i12 - i10));
        }
        return i();
    }

    public q2.Y f(int i10, List list, M2.e0 e0Var) {
        if (!list.isEmpty()) {
            this.f30397j = e0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f30389b.get(i11 - 1);
                    cVar.b(cVar2.f30408d + cVar2.f30405a.W().t());
                } else {
                    cVar.b(0);
                }
                g(i11, cVar.f30405a.W().t());
                this.f30389b.add(i11, cVar);
                this.f30391d.put(cVar.f30406b, cVar);
                if (this.f30398k) {
                    x(cVar);
                    if (this.f30390c.isEmpty()) {
                        this.f30394g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public M2.C h(D.b bVar, Q2.b bVar2, long j10) {
        Object objO = o(bVar.f11662a);
        D.b bVarA = bVar.a(m(bVar.f11662a));
        c cVar = (c) AbstractC6614a.e((c) this.f30391d.get(objO));
        l(cVar);
        cVar.f30407c.add(bVarA);
        C1935z c1935zF = cVar.f30405a.f(bVarA, bVar2, j10);
        this.f30390c.put(c1935zF, cVar);
        k();
        return c1935zF;
    }

    public q2.Y i() {
        if (this.f30389b.isEmpty()) {
            return q2.Y.f56642a;
        }
        int iT = 0;
        for (int i10 = 0; i10 < this.f30389b.size(); i10++) {
            c cVar = (c) this.f30389b.get(i10);
            cVar.f30408d = iT;
            iT += cVar.f30405a.W().t();
        }
        return new M0(this.f30389b, this.f30397j);
    }

    public M2.e0 q() {
        return this.f30397j;
    }

    public int r() {
        return this.f30389b.size();
    }

    public boolean t() {
        return this.f30398k;
    }

    public q2.Y v(int i10, int i11, int i12, M2.e0 e0Var) {
        AbstractC6614a.a(i10 >= 0 && i10 <= i11 && i11 <= r() && i12 >= 0);
        this.f30397j = e0Var;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int iT = ((c) this.f30389b.get(iMin)).f30408d;
        t2.a0.U0(this.f30389b, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = (c) this.f30389b.get(iMin);
            cVar.f30408d = iT;
            iT += cVar.f30405a.W().t();
            iMin++;
        }
        return i();
    }

    public void w(InterfaceC6932F interfaceC6932F) {
        AbstractC6614a.g(!this.f30398k);
        this.f30399l = interfaceC6932F;
        for (int i10 = 0; i10 < this.f30389b.size(); i10++) {
            c cVar = (c) this.f30389b.get(i10);
            x(cVar);
            this.f30394g.add(cVar);
        }
        this.f30398k = true;
    }

    public void y() {
        for (b bVar : this.f30393f.values()) {
            try {
                bVar.f30402a.d(bVar.f30403b);
            } catch (RuntimeException e10) {
                AbstractC6635w.e("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f30402a.k(bVar.f30404c);
            bVar.f30402a.c(bVar.f30404c);
        }
        this.f30393f.clear();
        this.f30394g.clear();
        this.f30398k = false;
    }

    public void z(M2.C c10) {
        c cVar = (c) AbstractC6614a.e((c) this.f30390c.remove(c10));
        cVar.f30405a.m(c10);
        cVar.f30407c.remove(((C1935z) c10).f12063a);
        if (!this.f30390c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
