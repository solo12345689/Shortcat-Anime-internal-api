package androidx.media3.exoplayer.dash;

import B2.K1;
import D2.h;
import E2.i;
import E2.j;
import M2.C1912b;
import N2.d;
import N2.f;
import N2.g;
import N2.l;
import N2.m;
import N2.o;
import P2.A;
import P9.AbstractC2012v;
import Q2.f;
import Q2.k;
import Q2.n;
import U2.C2246g;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.C2905q0;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import q2.AbstractC6079K;
import q2.C6109x;
import r3.r;
import t2.AbstractC6614a;
import t2.Q;
import t2.a0;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;
import w2.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class d implements androidx.media3.exoplayer.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f30696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D2.b f30697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f30698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6940g f30700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f30701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f30702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f.c f30703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final b[] f30704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private A f30705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private E2.c f30706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f30707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f30708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f30710o = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements a.InterfaceC0521a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC6940g.a f30711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f.a f30713c;

        public a(InterfaceC6940g.a aVar) {
            this(aVar, 1);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0521a
        public C6109x d(C6109x c6109x) {
            return this.f30713c.d(c6109x);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0521a
        public androidx.media3.exoplayer.dash.a e(n nVar, E2.c cVar, D2.b bVar, int i10, int[] iArr, A a10, int i11, long j10, boolean z10, List list, f.c cVar2, InterfaceC6932F interfaceC6932F, K1 k12, Q2.e eVar) {
            InterfaceC6940g interfaceC6940gA = this.f30711a.a();
            if (interfaceC6932F != null) {
                interfaceC6940gA.i(interfaceC6932F);
            }
            return new d(this.f30713c, nVar, cVar, bVar, i10, iArr, a10, i11, interfaceC6940gA, j10, this.f30712b, z10, list, cVar2, k12, eVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0521a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(boolean z10) {
            this.f30713c.c(z10);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0521a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f30713c.b(i10);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0521a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(r.a aVar) {
            this.f30713c.a(aVar);
            return this;
        }

        public a(InterfaceC6940g.a aVar, int i10) {
            this(new d.b(), aVar, i10);
        }

        public a(f.a aVar, InterfaceC6940g.a aVar2, int i10) {
            this.f30713c = aVar;
            this.f30711a = aVar2;
            this.f30712b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final N2.f f30714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f30715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final E2.b f30716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final D2.f f30717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f30718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f30719f;

        b(long j10, j jVar, E2.b bVar, N2.f fVar, long j11, D2.f fVar2) {
            this.f30718e = j10;
            this.f30715b = jVar;
            this.f30716c = bVar;
            this.f30719f = j11;
            this.f30714a = fVar;
            this.f30717d = fVar2;
        }

        b b(long j10, j jVar) throws C1912b {
            long jI;
            long jI2;
            D2.f fVarB = this.f30715b.b();
            D2.f fVarB2 = jVar.b();
            if (fVarB == null) {
                return new b(j10, jVar, this.f30716c, this.f30714a, this.f30719f, fVarB);
            }
            if (!fVarB.k()) {
                return new b(j10, jVar, this.f30716c, this.f30714a, this.f30719f, fVarB2);
            }
            long j11 = fVarB.j(j10);
            if (j11 == 0) {
                return new b(j10, jVar, this.f30716c, this.f30714a, this.f30719f, fVarB2);
            }
            AbstractC6614a.i(fVarB2);
            long jL = fVarB.l();
            long jD = fVarB.d(jL);
            long j12 = j11 + jL;
            long j13 = j12 - 1;
            long jD2 = fVarB.d(j13) + fVarB.e(j13, j10);
            long jL2 = fVarB2.l();
            long jD3 = fVarB2.d(jL2);
            long j14 = this.f30719f;
            if (jD2 == jD3) {
                jI = j12 - jL2;
            } else {
                if (jD2 < jD3) {
                    throw new C1912b();
                }
                if (jD3 < jD) {
                    jI2 = j14 - (fVarB2.i(jD, j10) - jL);
                    return new b(j10, jVar, this.f30716c, this.f30714a, jI2, fVarB2);
                }
                jI = fVarB.i(jD3, j10) - jL2;
            }
            jI2 = j14 + jI;
            return new b(j10, jVar, this.f30716c, this.f30714a, jI2, fVarB2);
        }

        b c(D2.f fVar) {
            return new b(this.f30718e, this.f30715b, this.f30716c, this.f30714a, this.f30719f, fVar);
        }

        b d(E2.b bVar) {
            return new b(this.f30718e, this.f30715b, bVar, this.f30714a, this.f30719f, this.f30717d);
        }

        public long e(long j10) {
            return ((D2.f) AbstractC6614a.i(this.f30717d)).f(this.f30718e, j10) + this.f30719f;
        }

        public long f() {
            return ((D2.f) AbstractC6614a.i(this.f30717d)).l() + this.f30719f;
        }

        public long g(long j10) {
            return (e(j10) + ((D2.f) AbstractC6614a.i(this.f30717d)).m(this.f30718e, j10)) - 1;
        }

        public long h() {
            return ((D2.f) AbstractC6614a.i(this.f30717d)).j(this.f30718e);
        }

        public long i(long j10) {
            return k(j10) + ((D2.f) AbstractC6614a.i(this.f30717d)).e(j10 - this.f30719f, this.f30718e);
        }

        public long j(long j10) {
            return ((D2.f) AbstractC6614a.i(this.f30717d)).i(j10, this.f30718e) + this.f30719f;
        }

        public long k(long j10) {
            return ((D2.f) AbstractC6614a.i(this.f30717d)).d(j10 - this.f30719f);
        }

        public i l(long j10) {
            return ((D2.f) AbstractC6614a.i(this.f30717d)).h(j10 - this.f30719f);
        }

        public boolean m(long j10, long j11) {
            return ((D2.f) AbstractC6614a.i(this.f30717d)).k() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class c extends N2.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f30720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f30721f;

        public c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f30720e = bVar;
            this.f30721f = j12;
        }

        @Override // N2.n
        public long a() {
            c();
            return this.f30720e.k(d());
        }

        @Override // N2.n
        public long b() {
            c();
            return this.f30720e.i(d());
        }
    }

    public d(f.a aVar, n nVar, E2.c cVar, D2.b bVar, int i10, int[] iArr, A a10, int i11, InterfaceC6940g interfaceC6940g, long j10, int i12, boolean z10, List list, f.c cVar2, K1 k12, Q2.e eVar) {
        this.f30696a = nVar;
        this.f30706k = cVar;
        this.f30697b = bVar;
        this.f30698c = iArr;
        this.f30705j = a10;
        int i13 = i11;
        this.f30699d = i13;
        this.f30700e = interfaceC6940g;
        this.f30707l = i10;
        this.f30701f = j10;
        this.f30702g = i12;
        f.c cVar3 = cVar2;
        this.f30703h = cVar3;
        long jG = cVar.g(i10);
        ArrayList arrayListO = o();
        this.f30704i = new b[a10.length()];
        int i14 = 0;
        while (i14 < this.f30704i.length) {
            j jVar = (j) arrayListO.get(a10.f(i14));
            E2.b bVarJ = bVar.j(jVar.f4260c);
            b[] bVarArr = this.f30704i;
            E2.b bVar2 = bVarJ == null ? (E2.b) jVar.f4260c.get(0) : bVarJ;
            N2.f fVarE = aVar.e(i13, jVar.f4259b, z10, list, cVar3, k12);
            long j11 = jG;
            int i15 = i14;
            bVarArr[i15] = new b(j11, jVar, bVar2, fVarE, 0L, jVar.b());
            i14 = i15 + 1;
            i13 = i11;
            jG = j11;
            cVar3 = cVar2;
        }
    }

    private k.a k(A a10, List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = a10.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (a10.a(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        int iF = D2.b.f(list);
        return new k.a(iF, iF - this.f30697b.g(list), length, i10);
    }

    private long l(long j10, long j11) {
        if (!this.f30706k.f4211d || this.f30704i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(n(j10), this.f30704i[0].i(this.f30704i[0].g(j10))) - j11);
    }

    private Pair m(long j10, i iVar, b bVar) {
        long j11 = j10 + 1;
        if (j11 >= bVar.h()) {
            return null;
        }
        i iVarL = bVar.l(j11);
        String strA = Q.a(iVar.b(bVar.f30716c.f4204a), iVarL.b(bVar.f30716c.f4204a));
        String str = iVarL.f4254a + "-";
        if (iVarL.f4255b != -1) {
            str = str + (iVarL.f4254a + iVarL.f4255b);
        }
        return new Pair(strA, str);
    }

    private long n(long j10) {
        E2.c cVar = this.f30706k;
        long j11 = cVar.f4208a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - a0.V0(j11 + cVar.d(this.f30707l).f4245b);
    }

    private ArrayList o() {
        List list = this.f30706k.d(this.f30707l).f4246c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f30698c) {
            arrayList.addAll(((E2.a) list.get(i10)).f4200c);
        }
        return arrayList;
    }

    private long p(b bVar, m mVar, long j10, long j11, long j12) {
        return mVar != null ? mVar.g() : a0.s(bVar.j(j10), j11, j12);
    }

    private b s(int i10) {
        b bVar = this.f30704i[i10];
        E2.b bVarJ = this.f30697b.j(bVar.f30715b.f4260c);
        if (bVarJ == null || bVarJ.equals(bVar.f30716c)) {
            return bVar;
        }
        b bVarD = bVar.d(bVarJ);
        this.f30704i[i10] = bVarD;
        return bVarD;
    }

    @Override // N2.i
    public void a() {
        for (b bVar : this.f30704i) {
            N2.f fVar = bVar.f30714a;
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    @Override // N2.i
    public void b() throws IOException {
        IOException iOException = this.f30708m;
        if (iOException != null) {
            throw iOException;
        }
        this.f30696a.b();
    }

    @Override // N2.i
    public boolean c(N2.e eVar, boolean z10, k.c cVar, k kVar) {
        k.b bVarB;
        if (!z10) {
            return false;
        }
        f.c cVar2 = this.f30703h;
        if (cVar2 != null && cVar2.k(eVar)) {
            return true;
        }
        if (!this.f30706k.f4211d && (eVar instanceof m)) {
            IOException iOException = cVar.f14323c;
            if ((iOException instanceof x) && ((x) iOException).f62894d == 404) {
                b bVar = this.f30704i[this.f30705j.e(eVar.f12608d)];
                long jH = bVar.h();
                if (jH != -1 && jH != 0) {
                    if (((m) eVar).g() > (bVar.f() + jH) - 1) {
                        this.f30709n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f30704i[this.f30705j.e(eVar.f12608d)];
        E2.b bVarJ = this.f30697b.j(bVar2.f30715b.f4260c);
        if (bVarJ != null && !bVar2.f30716c.equals(bVarJ)) {
            return true;
        }
        k.a aVarK = k(this.f30705j, bVar2.f30715b.f4260c);
        if ((aVarK.a(2) || aVarK.a(1)) && (bVarB = kVar.b(aVarK, cVar)) != null && aVarK.a(bVarB.f14319a)) {
            int i10 = bVarB.f14319a;
            if (i10 == 2) {
                A a10 = this.f30705j;
                return a10.g(a10.e(eVar.f12608d), bVarB.f14320b);
            }
            if (i10 == 1) {
                this.f30697b.e(bVar2.f30716c, bVarB.f14320b);
                return true;
            }
        }
        return false;
    }

    @Override // N2.i
    public long d(long j10, A2.Q q10) {
        long j11 = j10;
        b[] bVarArr = this.f30704i;
        int length = bVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            b bVar = bVarArr[i10];
            if (bVar.f30717d != null) {
                long jH = bVar.h();
                if (jH != 0) {
                    long j12 = bVar.j(j11);
                    long jK = bVar.k(j12);
                    return q10.a(j11, jK, (jK >= j11 || (jH != -1 && j12 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j12 + 1));
                }
            }
            i10++;
            j11 = j10;
        }
        return j10;
    }

    @Override // N2.i
    public void e(C2905q0 c2905q0, long j10, List list, g gVar) {
        boolean z10;
        N2.n[] nVarArr;
        long j11;
        int i10;
        int i11;
        d dVar;
        m mVar;
        d dVar2 = this;
        if (dVar2.f30708m != null) {
            return;
        }
        long j12 = c2905q0.f31187a;
        long j13 = j10 - j12;
        long jV0 = a0.V0(dVar2.f30706k.f4208a) + a0.V0(dVar2.f30706k.d(dVar2.f30707l).f4245b) + j10;
        f.c cVar = dVar2.f30703h;
        if (cVar == null || !cVar.i(jV0)) {
            long jV02 = a0.V0(a0.k0(dVar2.f30701f));
            long jN = dVar2.n(jV02);
            boolean z11 = true;
            m mVar2 = list.isEmpty() ? null : (m) list.get(list.size() - 1);
            int length = dVar2.f30705j.length();
            N2.n[] nVarArr2 = new N2.n[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = dVar2.f30704i[i12];
                if (bVar.f30717d == null) {
                    nVarArr2[i12] = N2.n.f12660a;
                    dVar = dVar2;
                    mVar = mVar2;
                    z10 = z11;
                    nVarArr = nVarArr2;
                    j11 = j13;
                    i11 = length;
                    i10 = i12;
                } else {
                    N2.n[] nVarArr3 = nVarArr2;
                    long jE = bVar.e(jV02);
                    z10 = z11;
                    nVarArr = nVarArr3;
                    m mVar3 = mVar2;
                    long jG = bVar.g(jV02);
                    j11 = j13;
                    i10 = i12;
                    i11 = length;
                    long jP = dVar2.p(bVar, mVar3, j10, jE, jG);
                    dVar = dVar2;
                    mVar = mVar3;
                    if (jP < jE) {
                        nVarArr[i10] = N2.n.f12660a;
                    } else {
                        nVarArr[i10] = new c(dVar.s(i10), jP, jG, jN);
                    }
                }
                i12 = i10 + 1;
                dVar2 = dVar;
                length = i11;
                mVar2 = mVar;
                nVarArr2 = nVarArr;
                z11 = z10;
                j13 = j11;
            }
            d dVar3 = dVar2;
            m mVar4 = mVar2;
            boolean z12 = z11;
            dVar3.f30705j.k(j12, j13, dVar3.l(jV02, j12), list, nVarArr2);
            int iB = dVar3.f30705j.b();
            dVar3.f30710o = SystemClock.elapsedRealtime();
            b bVarS = dVar3.s(iB);
            N2.f fVar = bVarS.f30714a;
            if (fVar != null) {
                j jVar = bVarS.f30715b;
                i iVarN = fVar.f() == null ? jVar.n() : null;
                i iVarC = bVarS.f30717d == null ? jVar.c() : null;
                if (iVarN != null || iVarC != null) {
                    gVar.f12614a = dVar3.q(bVarS, dVar3.f30700e, dVar3.f30705j.q(), dVar3.f30705j.r(), dVar3.f30705j.i(), iVarN, iVarC, null);
                    return;
                }
            }
            long j14 = bVarS.f30718e;
            E2.c cVar2 = dVar3.f30706k;
            boolean z13 = (cVar2.f4211d && dVar3.f30707l == cVar2.e() + (-1)) ? z12 : false;
            boolean z14 = (z13 && j14 == -9223372036854775807L) ? false : z12;
            if (bVarS.h() == 0) {
                gVar.f12615b = z14;
                return;
            }
            long jE2 = bVarS.e(jV02);
            long jG2 = bVarS.g(jV02);
            if (z13) {
                long jI = bVarS.i(jG2);
                z14 &= jI + (jI - bVarS.k(jG2)) >= j14 ? z12 : false;
            }
            boolean z15 = z14;
            long jP2 = dVar3.p(bVarS, mVar4, j10, jE2, jG2);
            if (jP2 < jE2) {
                dVar3.f30708m = new C1912b();
                return;
            }
            if (jP2 > jG2 || (dVar3.f30709n && jP2 >= jG2)) {
                gVar.f12615b = z15;
                return;
            }
            if (z15 && bVarS.k(jP2) >= j14) {
                gVar.f12615b = z12;
                return;
            }
            int iMin = (int) Math.min(dVar3.f30702g, (jG2 - jP2) + 1);
            if (j14 != -9223372036854775807L) {
                while (iMin > 1 && bVarS.k((((long) iMin) + jP2) - 1) >= j14) {
                    iMin--;
                }
            }
            gVar.f12614a = dVar3.r(bVarS, dVar3.f30700e, dVar3.f30699d, dVar3.f30705j.q(), dVar3.f30705j.r(), dVar3.f30705j.i(), jP2, iMin, list.isEmpty() ? j10 : -9223372036854775807L, jN, null);
        }
    }

    @Override // N2.i
    public boolean f(long j10, N2.e eVar, List list) {
        if (this.f30708m != null) {
            return false;
        }
        return this.f30705j.c(j10, eVar, list);
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void g(E2.c cVar, int i10) {
        try {
            this.f30706k = cVar;
            this.f30707l = i10;
            long jG = cVar.g(i10);
            ArrayList arrayListO = o();
            for (int i11 = 0; i11 < this.f30704i.length; i11++) {
                j jVar = (j) arrayListO.get(this.f30705j.f(i11));
                b[] bVarArr = this.f30704i;
                bVarArr[i11] = bVarArr[i11].b(jG, jVar);
            }
        } catch (C1912b e10) {
            this.f30708m = e10;
        }
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void h(A a10) {
        this.f30705j = a10;
    }

    @Override // N2.i
    public int i(long j10, List list) {
        return (this.f30708m != null || this.f30705j.length() < 2) ? list.size() : this.f30705j.o(j10, list);
    }

    @Override // N2.i
    public void j(N2.e eVar) {
        C2246g c2246gD;
        if (eVar instanceof l) {
            int iE = this.f30705j.e(((l) eVar).f12608d);
            b bVar = this.f30704i[iE];
            if (bVar.f30717d == null && (c2246gD = ((N2.f) AbstractC6614a.i(bVar.f30714a)).d()) != null) {
                this.f30704i[iE] = bVar.c(new h(c2246gD, bVar.f30715b.f4261d));
            }
        }
        f.c cVar = this.f30703h;
        if (cVar != null) {
            cVar.j(eVar);
        }
    }

    protected N2.e q(b bVar, InterfaceC6940g interfaceC6940g, C6109x c6109x, int i10, Object obj, i iVar, i iVar2, f.a aVar) {
        i iVar3 = iVar;
        j jVar = bVar.f30715b;
        if (iVar3 != null) {
            i iVarA = iVar3.a(iVar2, bVar.f30716c.f4204a);
            if (iVarA != null) {
                iVar3 = iVarA;
            }
        } else {
            iVar3 = (i) AbstractC6614a.e(iVar2);
        }
        return new l(interfaceC6940g, D2.g.a(jVar, bVar.f30716c.f4204a, iVar3, 0, AbstractC2012v.k()), c6109x, i10, obj, bVar.f30714a);
    }

    protected N2.e r(b bVar, InterfaceC6940g interfaceC6940g, int i10, C6109x c6109x, int i11, Object obj, long j10, int i12, long j11, long j12, f.a aVar) {
        j jVar = bVar.f30715b;
        long jK = bVar.k(j10);
        i iVarL = bVar.l(j10);
        if (bVar.f30714a == null) {
            int i13 = 8;
            long jI = bVar.i(j10);
            if (bVar.m(j10, j12)) {
                i13 = 0;
            }
            return new o(interfaceC6940g, D2.g.a(jVar, bVar.f30716c.f4204a, iVarL, i13, AbstractC2012v.k()), c6109x, i11, obj, jK, jI, j10, i10, c6109x);
        }
        int i14 = 8;
        int i15 = 1;
        int i16 = 1;
        while (i15 < i12) {
            i iVarA = iVarL.a(bVar.l(j10 + ((long) i15)), bVar.f30716c.f4204a);
            if (iVarA == null) {
                break;
            }
            i16++;
            i15++;
            iVarL = iVarA;
        }
        long j13 = (j10 + ((long) i16)) - 1;
        int i17 = i16;
        long jI2 = bVar.i(j13);
        long j14 = bVar.f30718e;
        if (j14 == -9223372036854775807L || j14 > jI2) {
            j14 = -9223372036854775807L;
        }
        if (bVar.m(j13, j12)) {
            i14 = 0;
        }
        w2.o oVarA = D2.g.a(jVar, bVar.f30716c.f4204a, iVarL, i14, AbstractC2012v.k());
        long j15 = -jVar.f4261d;
        if (AbstractC6079K.q(c6109x.f57022o)) {
            j15 += jK;
        }
        return new N2.j(interfaceC6940g, oVarA, c6109x, i11, obj, jK, jI2, j11, j14, j10, i17, j15, bVar.f30714a);
    }
}
