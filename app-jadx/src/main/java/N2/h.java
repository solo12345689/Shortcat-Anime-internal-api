package N2;

import A2.J;
import A2.Q;
import F2.t;
import F2.u;
import M2.B;
import M2.C1934y;
import M2.L;
import M2.b0;
import M2.c0;
import M2.d0;
import Q2.k;
import Q2.m;
import androidx.media3.exoplayer.C2905q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q2.AbstractC6079K;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class h implements c0, d0, m.b, m.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f12617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6109x[] f12618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f12619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f12620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0.a f12621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L.a f12622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Q2.k f12623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q2.m f12624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f12625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f12626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f12627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b0 f12628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b0[] f12629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c f12630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private e f12631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C6109x f12632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f12633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f12634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f12635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f12636u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private N2.a f12637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f12638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f12639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f12640y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void h(h hVar);
    }

    public h(int i10, int[] iArr, C6109x[] c6109xArr, i iVar, d0.a aVar, Q2.b bVar, long j10, u uVar, t.a aVar2, Q2.k kVar, L.a aVar3, boolean z10, R2.a aVar4) {
        this.f12616a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f12617b = iArr;
        this.f12618c = c6109xArr == null ? new C6109x[0] : c6109xArr;
        this.f12620e = iVar;
        this.f12621f = aVar;
        this.f12622g = aVar3;
        this.f12623h = kVar;
        this.f12638w = z10;
        this.f12624i = aVar4 != null ? new Q2.m(aVar4) : new Q2.m("ChunkSampleStream");
        this.f12625j = new g();
        ArrayList arrayList = new ArrayList();
        this.f12626k = arrayList;
        this.f12627l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f12629n = new b0[length];
        this.f12619d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        b0[] b0VarArr = new b0[i12];
        b0 b0VarL = b0.l(bVar, uVar, aVar2);
        this.f12628m = b0VarL;
        iArr2[0] = i10;
        b0VarArr[0] = b0VarL;
        while (i11 < length) {
            b0 b0VarM = b0.m(bVar);
            this.f12629n[i11] = b0VarM;
            int i13 = i11 + 1;
            b0VarArr[i13] = b0VarM;
            iArr2[i13] = this.f12617b[i11];
            i11 = i13;
        }
        this.f12630o = new c(iArr2, b0VarArr);
        this.f12634s = j10;
        this.f12635t = j10;
    }

    private void C(int i10) {
        int iMin = Math.min(R(i10, 0), this.f12636u);
        if (iMin > 0) {
            a0.k1(this.f12626k, 0, iMin);
            this.f12636u -= iMin;
        }
    }

    private void D(int i10) {
        AbstractC6614a.g(!this.f12624i.j());
        int size = this.f12626k.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!I(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = H().f12612h;
        N2.a aVarE = E(i10);
        if (this.f12626k.isEmpty()) {
            this.f12634s = this.f12635t;
        }
        this.f12640y = false;
        this.f12622g.y(this.f12616a, aVarE.f12611g, j10);
    }

    private N2.a E(int i10) {
        N2.a aVar = (N2.a) this.f12626k.get(i10);
        ArrayList arrayList = this.f12626k;
        a0.k1(arrayList, i10, arrayList.size());
        this.f12636u = Math.max(this.f12636u, this.f12626k.size());
        int i11 = 0;
        this.f12628m.w(aVar.i(0));
        while (true) {
            b0[] b0VarArr = this.f12629n;
            if (i11 >= b0VarArr.length) {
                return aVar;
            }
            b0 b0Var = b0VarArr[i11];
            i11++;
            b0Var.w(aVar.i(i11));
        }
    }

    private N2.a H() {
        return (N2.a) this.f12626k.get(r0.size() - 1);
    }

    private boolean I(int i10) {
        int iF;
        N2.a aVar = (N2.a) this.f12626k.get(i10);
        if (this.f12628m.F() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b0[] b0VarArr = this.f12629n;
            if (i11 >= b0VarArr.length) {
                return false;
            }
            iF = b0VarArr[i11].F();
            i11++;
        } while (iF <= aVar.i(i11));
        return true;
    }

    private boolean J(e eVar) {
        return eVar instanceof N2.a;
    }

    private void L() {
        int iR = R(this.f12628m.F(), this.f12636u - 1);
        while (true) {
            int i10 = this.f12636u;
            if (i10 > iR) {
                return;
            }
            this.f12636u = i10 + 1;
            M(i10);
        }
    }

    private void M(int i10) {
        N2.a aVar = (N2.a) this.f12626k.get(i10);
        C6109x c6109x = aVar.f12608d;
        if (!c6109x.equals(this.f12632q)) {
            this.f12622g.j(this.f12616a, c6109x, aVar.f12609e, aVar.f12610f, aVar.f12611g);
        }
        this.f12632q = c6109x;
    }

    private int R(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f12626k.size()) {
                return this.f12626k.size() - 1;
            }
        } while (((N2.a) this.f12626k.get(i11)).i(0) <= i10);
        return i11 - 1;
    }

    private void T() {
        this.f12628m.X();
        for (b0 b0Var : this.f12629n) {
            b0Var.X();
        }
    }

    public boolean B() {
        try {
            return this.f12639x;
        } finally {
            this.f12639x = false;
        }
    }

    public void F(long j10) {
        AbstractC6614a.g(!this.f12624i.j());
        if (K() || j10 == -9223372036854775807L || this.f12626k.isEmpty()) {
            return;
        }
        N2.a aVarH = H();
        long j11 = aVarH.f12576l;
        if (j11 == -9223372036854775807L) {
            j11 = aVarH.f12612h;
        }
        if (j11 <= j10) {
            return;
        }
        long jC = this.f12628m.C();
        if (jC <= j10) {
            return;
        }
        this.f12628m.u(Math.max(j10, this.f12628m.D() + 1));
        for (b0 b0Var : this.f12629n) {
            b0Var.u(Math.max(j10, b0Var.D() + 1));
        }
        this.f12622g.y(this.f12616a, j10, jC);
    }

    public i G() {
        return this.f12620e;
    }

    boolean K() {
        return this.f12634s != -9223372036854775807L;
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void h(e eVar, long j10, long j11, boolean z10) {
        this.f12631p = null;
        this.f12637v = null;
        C1934y c1934y = new C1934y(eVar.f12605a, eVar.f12606b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f12623h.d(eVar.f12605a);
        this.f12622g.m(c1934y, eVar.f12607c, this.f12616a, eVar.f12608d, eVar.f12609e, eVar.f12610f, eVar.f12611g, eVar.f12612h);
        if (z10) {
            return;
        }
        if (K()) {
            T();
        } else if (J(eVar)) {
            E(this.f12626k.size() - 1);
            if (this.f12626k.isEmpty()) {
                this.f12634s = this.f12635t;
            }
        }
        this.f12621f.j(this);
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void j(e eVar, long j10, long j11) {
        this.f12631p = null;
        this.f12620e.j(eVar);
        C1934y c1934y = new C1934y(eVar.f12605a, eVar.f12606b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f12623h.d(eVar.f12605a);
        this.f12622g.p(c1934y, eVar.f12607c, this.f12616a, eVar.f12608d, eVar.f12609e, eVar.f12610f, eVar.f12611g, eVar.f12612h);
        this.f12621f.j(this);
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public m.c n(e eVar, long j10, long j11, IOException iOException, int i10) {
        m.c cVarH;
        long jB = eVar.b();
        boolean zJ = J(eVar);
        int size = this.f12626k.size() - 1;
        boolean z10 = (jB != 0 && zJ && I(size)) ? false : true;
        C1934y c1934y = new C1934y(eVar.f12605a, eVar.f12606b, eVar.f(), eVar.e(), j10, j11, jB);
        k.c cVar = new k.c(c1934y, new B(eVar.f12607c, this.f12616a, eVar.f12608d, eVar.f12609e, eVar.f12610f, a0.F1(eVar.f12611g), a0.F1(eVar.f12612h)), iOException, i10);
        if (!this.f12620e.c(eVar, z10, cVar, this.f12623h)) {
            cVarH = null;
        } else if (z10) {
            cVarH = Q2.m.f14327f;
            if (zJ) {
                AbstractC6614a.g(E(size) == eVar);
                if (this.f12626k.isEmpty()) {
                    this.f12634s = this.f12635t;
                }
            }
        } else {
            AbstractC6635w.i("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarH = null;
        }
        if (cVarH == null) {
            long jC = this.f12623h.c(cVar);
            cVarH = jC != -9223372036854775807L ? Q2.m.h(false, jC) : Q2.m.f14328g;
        }
        boolean zC = cVarH.c();
        this.f12622g.r(c1934y, eVar.f12607c, this.f12616a, eVar.f12608d, eVar.f12609e, eVar.f12610f, eVar.f12611g, eVar.f12612h, iOException, !zC);
        if (!zC) {
            this.f12631p = null;
            this.f12623h.d(eVar.f12605a);
            this.f12621f.j(this);
        }
        return cVarH;
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void v(e eVar, long j10, long j11, int i10) {
        this.f12622g.v(i10 == 0 ? new C1934y(eVar.f12605a, eVar.f12606b, j10) : new C1934y(eVar.f12605a, eVar.f12606b, eVar.f(), eVar.e(), j10, j11, eVar.b()), eVar.f12607c, this.f12616a, eVar.f12608d, eVar.f12609e, eVar.f12610f, eVar.f12611g, eVar.f12612h, i10);
    }

    public void S(b bVar) {
        this.f12633r = bVar;
        this.f12628m.T();
        for (b0 b0Var : this.f12629n) {
            b0Var.T();
        }
        this.f12624i.m(this);
    }

    public void U(long j10) throws Throwable {
        N2.a aVar;
        boolean zB0;
        this.f12635t = j10;
        int i10 = 0;
        this.f12638w = false;
        if (K()) {
            this.f12634s = j10;
            return;
        }
        for (int i11 = 0; i11 < this.f12626k.size(); i11++) {
            aVar = (N2.a) this.f12626k.get(i11);
            long j11 = aVar.f12611g;
            if (j11 == j10 && aVar.f12575k == -9223372036854775807L) {
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null) {
            zB0 = this.f12628m.a0(aVar.i(0));
        } else {
            long jC = c();
            zB0 = this.f12628m.b0(j10, jC == Long.MIN_VALUE || j10 < jC);
        }
        if (zB0) {
            this.f12636u = R(this.f12628m.F(), 0);
            b0[] b0VarArr = this.f12629n;
            int length = b0VarArr.length;
            while (i10 < length) {
                b0VarArr[i10].b0(j10, true);
                i10++;
            }
            return;
        }
        this.f12634s = j10;
        this.f12640y = false;
        this.f12626k.clear();
        this.f12636u = 0;
        if (!this.f12624i.j()) {
            this.f12624i.g();
            T();
            return;
        }
        this.f12628m.s();
        b0[] b0VarArr2 = this.f12629n;
        int length2 = b0VarArr2.length;
        while (i10 < length2) {
            b0VarArr2[i10].s();
            i10++;
        }
        this.f12624i.f();
    }

    public a V(long j10, int i10) throws Throwable {
        for (int i11 = 0; i11 < this.f12629n.length; i11++) {
            if (this.f12617b[i11] == i10) {
                AbstractC6614a.g(!this.f12619d[i11]);
                this.f12619d[i11] = true;
                this.f12629n[i11].b0(j10, true);
                return new a(this, this.f12629n[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // M2.d0
    public boolean a(C2905q0 c2905q0) {
        List list;
        long j10;
        if (this.f12640y || this.f12624i.j() || this.f12624i.i()) {
            return false;
        }
        boolean zK = K();
        if (zK) {
            list = Collections.EMPTY_LIST;
            j10 = this.f12634s;
        } else {
            list = this.f12627l;
            j10 = H().f12612h;
        }
        this.f12620e.e(c2905q0, j10, list, this.f12625j);
        g gVar = this.f12625j;
        boolean z10 = gVar.f12615b;
        e eVar = gVar.f12614a;
        gVar.a();
        if (z10) {
            this.f12634s = -9223372036854775807L;
            this.f12640y = true;
            return true;
        }
        if (eVar == null) {
            return false;
        }
        this.f12631p = eVar;
        if (J(eVar)) {
            N2.a aVar = (N2.a) eVar;
            if (zK) {
                long j11 = aVar.f12611g;
                long j12 = this.f12634s;
                if (j11 < j12) {
                    this.f12628m.d0(j12);
                    for (b0 b0Var : this.f12629n) {
                        b0Var.d0(this.f12634s);
                    }
                    if (this.f12638w) {
                        C6109x c6109x = aVar.f12608d;
                        this.f12639x = !AbstractC6079K.a(c6109x.f57022o, c6109x.f57018k);
                    }
                }
                this.f12638w = false;
                this.f12634s = -9223372036854775807L;
            }
            aVar.k(this.f12630o);
            this.f12626k.add(aVar);
        } else if (eVar instanceof l) {
            ((l) eVar).g(this.f12630o);
        }
        this.f12624i.n(eVar, this, this.f12623h.a(eVar.f12607c));
        return true;
    }

    @Override // M2.c0
    public void b() throws IOException {
        this.f12624i.b();
        this.f12628m.P();
        if (this.f12624i.j()) {
            return;
        }
        this.f12620e.b();
    }

    @Override // M2.d0
    public long c() {
        if (K()) {
            return this.f12634s;
        }
        if (this.f12640y) {
            return Long.MIN_VALUE;
        }
        return H().f12612h;
    }

    public long d(long j10, Q q10) {
        return this.f12620e.d(j10, q10);
    }

    @Override // M2.c0
    public int e(long j10) throws Throwable {
        if (K()) {
            return 0;
        }
        int iH = this.f12628m.H(j10, this.f12640y);
        N2.a aVar = this.f12637v;
        if (aVar != null) {
            iH = Math.min(iH, aVar.i(0) - this.f12628m.F());
        }
        this.f12628m.g0(iH);
        L();
        return iH;
    }

    @Override // M2.d0
    public long f() {
        if (this.f12640y) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.f12634s;
        }
        long jMax = this.f12635t;
        N2.a aVarH = H();
        if (!aVarH.h()) {
            if (this.f12626k.size() > 1) {
                aVarH = (N2.a) this.f12626k.get(r2.size() - 2);
            } else {
                aVarH = null;
            }
        }
        if (aVarH != null) {
            jMax = Math.max(jMax, aVarH.f12612h);
        }
        return Math.max(jMax, this.f12628m.C());
    }

    @Override // M2.d0
    public void g(long j10) {
        if (this.f12624i.i() || K()) {
            return;
        }
        if (!this.f12624i.j()) {
            int i10 = this.f12620e.i(j10, this.f12627l);
            if (i10 < this.f12626k.size()) {
                D(i10);
                return;
            }
            return;
        }
        e eVar = (e) AbstractC6614a.e(this.f12631p);
        if (!(J(eVar) && I(this.f12626k.size() - 1)) && this.f12620e.f(j10, eVar, this.f12627l)) {
            this.f12624i.f();
            if (J(eVar)) {
                this.f12637v = (N2.a) eVar;
            }
        }
    }

    @Override // M2.c0
    public boolean isReady() {
        return !K() && this.f12628m.N(this.f12640y);
    }

    @Override // Q2.m.f
    public void m() {
        this.f12628m.V();
        for (b0 b0Var : this.f12629n) {
            b0Var.V();
        }
        this.f12620e.a();
        b bVar = this.f12633r;
        if (bVar != null) {
            bVar.h(this);
        }
    }

    @Override // M2.c0
    public int p(J j10, z2.f fVar, int i10) {
        if (K()) {
            return -3;
        }
        N2.a aVar = this.f12637v;
        if (aVar != null && aVar.i(0) <= this.f12628m.F()) {
            return -3;
        }
        L();
        return this.f12628m.U(j10, fVar, i10, this.f12640y);
    }

    @Override // M2.d0
    public boolean q() {
        return this.f12624i.j();
    }

    public void u(long j10, boolean z10) {
        if (K()) {
            return;
        }
        int iA = this.f12628m.A();
        this.f12628m.r(j10, z10, true);
        int iA2 = this.f12628m.A();
        if (iA2 > iA) {
            long jB = this.f12628m.B();
            int i10 = 0;
            while (true) {
                b0[] b0VarArr = this.f12629n;
                if (i10 >= b0VarArr.length) {
                    break;
                }
                b0VarArr[i10].r(jB, z10, this.f12619d[i10]);
                i10++;
            }
        }
        C(iA2);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f12641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f12642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12644d;

        public a(h hVar, b0 b0Var, int i10) {
            this.f12641a = hVar;
            this.f12642b = b0Var;
            this.f12643c = i10;
        }

        private void a() {
            if (this.f12644d) {
                return;
            }
            h.this.f12622g.j(h.this.f12617b[this.f12643c], h.this.f12618c[this.f12643c], 0, null, h.this.f12635t);
            this.f12644d = true;
        }

        public void c() {
            AbstractC6614a.g(h.this.f12619d[this.f12643c]);
            h.this.f12619d[this.f12643c] = false;
        }

        @Override // M2.c0
        public int e(long j10) throws Throwable {
            if (h.this.K()) {
                return 0;
            }
            int iH = this.f12642b.H(j10, h.this.f12640y);
            if (h.this.f12637v != null) {
                iH = Math.min(iH, h.this.f12637v.i(this.f12643c + 1) - this.f12642b.F());
            }
            this.f12642b.g0(iH);
            if (iH > 0) {
                a();
            }
            return iH;
        }

        @Override // M2.c0
        public boolean isReady() {
            return !h.this.K() && this.f12642b.N(h.this.f12640y);
        }

        @Override // M2.c0
        public int p(J j10, z2.f fVar, int i10) {
            if (h.this.K()) {
                return -3;
            }
            if (h.this.f12637v != null && h.this.f12637v.i(this.f12643c + 1) <= this.f12642b.F()) {
                return -3;
            }
            a();
            return this.f12642b.U(j10, fVar, i10, h.this.f12640y);
        }

        @Override // M2.c0
        public void b() {
        }
    }
}
