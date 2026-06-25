package n3;

import U2.B;
import U2.C2253n;
import U2.D;
import U2.F;
import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.O;
import U2.r;
import U2.u;
import i3.h;
import i3.l;
import i3.n;
import java.io.EOFException;
import java.math.RoundingMode;
import n3.g;
import q2.C6078J;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC2255p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f53854v = new u() { // from class: n3.d
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return f.d();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final h.a f53855w = new h.a() { // from class: n3.e
        @Override // i3.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return f.e(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f53857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f53858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F.a f53859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B f53860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D f53861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O f53862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f53863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private O f53864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private O f53865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C6078J f53867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f53868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f53869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f53870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f53871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f53872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f53873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f53874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f53875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f53876u;

    public f() {
        this(0);
    }

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new f()};
    }

    public static /* synthetic */ boolean e(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    private void g() {
        AbstractC6614a.i(this.f53864i);
        a0.l(this.f53863h);
    }

    private g j(InterfaceC2256q interfaceC2256q) {
        long jP;
        long j10;
        long j11;
        g gVarT = t(interfaceC2256q);
        c cVarS = s(this.f53867l, interfaceC2256q.getPosition());
        if (this.f53874s) {
            return new g.a();
        }
        if ((this.f53856a & 4) != 0) {
            if (cVarS != null) {
                jP = cVarS.n();
                j11 = cVarS.j();
            } else if (gVarT != null) {
                jP = gVarT.n();
                j11 = gVarT.j();
            } else {
                jP = p(this.f53867l);
                j10 = -1;
                gVarT = new C5722b(jP, interfaceC2256q.getPosition(), j10);
            }
            j10 = j11;
            gVarT = new C5722b(jP, interfaceC2256q.getPosition(), j10);
        } else if (cVarS != null) {
            gVarT = cVarS;
        } else if (gVarT == null) {
            gVarT = null;
        }
        if (gVarT != null && y(gVarT) && gVarT.n() != -9223372036854775807L && (gVarT.j() != -1 || interfaceC2256q.getLength() != -1)) {
            long jE = gVarT.e() != -1 ? gVarT.e() : 0L;
            long j12 = gVarT.j() != -1 ? gVarT.j() : interfaceC2256q.getLength();
            gVarT = new C5721a(j12, jE, S9.f.n(a0.o1(j12 - jE, 8000000L, gVarT.n(), RoundingMode.HALF_UP)), -1, false);
        } else if (gVarT == null || y(gVarT)) {
            gVarT = o(interfaceC2256q, (this.f53856a & 2) != 0);
        }
        this.f53864i.d(gVarT.n());
        return gVarT;
    }

    private long k(long j10) {
        return this.f53868m + ((j10 * 1000000) / ((long) this.f53859d.f18913d));
    }

    private g n(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f53885c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - ((long) iVar.f53883a.f18912c);
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - ((long) iVar.f53883a.f18912c);
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new C5721a(j13, j10 + ((long) iVar.f53883a.f18912c), S9.f.e(a0.o1(j16, 8000000L, jA, roundingMode)), S9.f.e(R9.e.b(j16, iVar.f53884b, roundingMode)), false);
    }

    private g o(InterfaceC2256q interfaceC2256q, boolean z10) {
        interfaceC2256q.o(this.f53858c.f(), 0, 4);
        this.f53858c.b0(0);
        this.f53859d.a(this.f53858c.v());
        return new C5721a(interfaceC2256q.getLength(), interfaceC2256q.getPosition(), this.f53859d, z10);
    }

    private static long p(C6078J c6078j) {
        if (c6078j == null) {
            return -9223372036854775807L;
        }
        int iE = c6078j.e();
        for (int i10 = 0; i10 < iE; i10++) {
            C6078J.a aVarD = c6078j.d(i10);
            if (aVarD instanceof n) {
                n nVar = (n) aVarD;
                if (nVar.f48620a.equals("TLEN")) {
                    return a0.V0(Long.parseLong((String) nVar.f48634d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int q(C6609I c6609i, int i10) {
        if (c6609i.j() >= i10 + 4) {
            c6609i.b0(i10);
            int iV = c6609i.v();
            if (iV == 1483304551 || iV == 1231971951) {
                return iV;
            }
        }
        if (c6609i.j() < 40) {
            return 0;
        }
        c6609i.b0(36);
        return c6609i.v() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean r(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private static c s(C6078J c6078j, long j10) {
        if (c6078j == null) {
            return null;
        }
        int iE = c6078j.e();
        for (int i10 = 0; i10 < iE; i10++) {
            C6078J.a aVarD = c6078j.d(i10);
            if (aVarD instanceof l) {
                return c.a(j10, (l) aVarD, p(c6078j));
            }
        }
        return null;
    }

    private g t(InterfaceC2256q interfaceC2256q) {
        int i10;
        int i11;
        C6609I c6609i = new C6609I(this.f53859d.f18912c);
        interfaceC2256q.o(c6609i.f(), 0, this.f53859d.f18912c);
        F.a aVar = this.f53859d;
        int i12 = 21;
        if ((aVar.f18910a & 1) != 0) {
            if (aVar.f18914e != 1) {
                i12 = 36;
            }
        } else if (aVar.f18914e == 1) {
            i12 = 13;
        }
        int iQ = q(c6609i, i12);
        if (iQ != 1231971951) {
            if (iQ == 1447187017) {
                h hVarA = h.a(interfaceC2256q.getLength(), interfaceC2256q.getPosition(), this.f53859d, c6609i);
                interfaceC2256q.m(this.f53859d.f18912c);
                return hVarA;
            }
            if (iQ != 1483304551) {
                interfaceC2256q.g();
                return null;
            }
        }
        i iVarB = i.b(this.f53859d, c6609i);
        if (!this.f53860e.a() && (i10 = iVarB.f53886d) != -1 && (i11 = iVarB.f53887e) != -1) {
            B b10 = this.f53860e;
            b10.f18880a = i10;
            b10.f18881b = i11;
        }
        long position = interfaceC2256q.getPosition();
        if (interfaceC2256q.getLength() != -1 && iVarB.f53885c != -1 && interfaceC2256q.getLength() != iVarB.f53885c + position) {
            AbstractC6635w.g("Mp3Extractor", "Data size mismatch between stream (" + interfaceC2256q.getLength() + ") and Xing frame (" + (iVarB.f53885c + position) + "), using Xing value.");
        }
        interfaceC2256q.m(this.f53859d.f18912c);
        return iQ == 1483304551 ? j.a(iVarB, position) : n(position, iVarB, interfaceC2256q.getLength());
    }

    private void u() {
        g gVar = this.f53873r;
        if ((gVar instanceof C5721a) && gVar.k()) {
            long j10 = this.f53871p;
            if (j10 == -1 || j10 == this.f53873r.j()) {
                return;
            }
            this.f53873r = ((C5721a) this.f53873r).f(this.f53871p);
            ((r) AbstractC6614a.e(this.f53863h)).t(this.f53873r);
            ((O) AbstractC6614a.e(this.f53864i)).d(this.f53873r.n());
        }
    }

    private boolean v(InterfaceC2256q interfaceC2256q) {
        g gVar = this.f53873r;
        if (gVar != null) {
            long j10 = gVar.j();
            if (j10 != -1 && interfaceC2256q.j() > j10 - 4) {
                return true;
            }
        }
        try {
            return !interfaceC2256q.e(this.f53858c.f(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int w(InterfaceC2256q interfaceC2256q) throws Throwable {
        if (this.f53866k == 0) {
            try {
                z(interfaceC2256q, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f53873r == null) {
            g gVarJ = j(interfaceC2256q);
            this.f53873r = gVarJ;
            this.f53863h.t(gVarJ);
            C6109x.b bVarR0 = new C6109x.b().W("audio/mpeg").y0(this.f53859d.f18911b).o0(4096).T(this.f53859d.f18914e).z0(this.f53859d.f18913d).d0(this.f53860e.f18880a).e0(this.f53860e.f18881b).r0((this.f53856a & 8) != 0 ? null : this.f53867l);
            if (this.f53873r.m() != -2147483647) {
                bVarR0.S(this.f53873r.m());
            }
            this.f53865j.c(bVarR0.P());
            this.f53870o = interfaceC2256q.getPosition();
        } else if (this.f53870o != 0) {
            long position = interfaceC2256q.getPosition();
            long j10 = this.f53870o;
            if (position < j10) {
                interfaceC2256q.m((int) (j10 - position));
            }
        }
        return x(interfaceC2256q);
    }

    private int x(InterfaceC2256q interfaceC2256q) {
        if (this.f53872q == 0) {
            interfaceC2256q.g();
            if (v(interfaceC2256q)) {
                return -1;
            }
            this.f53858c.b0(0);
            int iV = this.f53858c.v();
            if (!r(iV, this.f53866k) || F.j(iV) == -1) {
                interfaceC2256q.m(1);
                this.f53866k = 0;
                return 0;
            }
            this.f53859d.a(iV);
            if (this.f53868m == -9223372036854775807L) {
                this.f53868m = this.f53873r.d(interfaceC2256q.getPosition());
                if (this.f53857b != -9223372036854775807L) {
                    this.f53868m += this.f53857b - this.f53873r.d(0L);
                }
            }
            this.f53872q = this.f53859d.f18912c;
            long position = interfaceC2256q.getPosition();
            F.a aVar = this.f53859d;
            this.f53871p = position + ((long) aVar.f18912c);
            g gVar = this.f53873r;
            if (gVar instanceof C5722b) {
                C5722b c5722b = (C5722b) gVar;
                c5722b.b(k(this.f53869n + ((long) aVar.f18916g)), this.f53871p);
                if (this.f53875t && c5722b.a(this.f53876u)) {
                    this.f53875t = false;
                    this.f53865j = this.f53864i;
                }
            }
        }
        int iE = this.f53865j.e(interfaceC2256q, this.f53872q, true);
        if (iE == -1) {
            return -1;
        }
        int i10 = this.f53872q - iE;
        this.f53872q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f53865j.a(k(this.f53869n), 1, this.f53859d.f18912c, 0, null);
        this.f53869n += (long) this.f53859d.f18916g;
        this.f53872q = 0;
        return 0;
    }

    private boolean y(g gVar) {
        return (gVar.k() || (this.f53856a & 1) == 0) ? false : true;
    }

    private boolean z(InterfaceC2256q interfaceC2256q, boolean z10) throws Throwable {
        int iJ;
        int i10;
        int iJ2;
        int i11 = z10 ? 32768 : 131072;
        interfaceC2256q.g();
        if (interfaceC2256q.getPosition() == 0) {
            C6078J c6078jA = this.f53861f.a(interfaceC2256q, (this.f53856a & 8) == 0 ? null : f53855w);
            this.f53867l = c6078jA;
            if (c6078jA != null) {
                this.f53860e.c(c6078jA);
            }
            iJ = (int) interfaceC2256q.j();
            if (!z10) {
                interfaceC2256q.m(iJ);
            }
            i10 = 0;
        } else {
            iJ = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!v(interfaceC2256q)) {
                this.f53858c.b0(0);
                int iV = this.f53858c.v();
                if ((i10 == 0 || r(iV, i10)) && (iJ2 = F.j(iV)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f53859d.a(iV);
                        i10 = iV;
                    }
                    interfaceC2256q.k(iJ2 - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        u();
                        throw new EOFException();
                    }
                    if (z10) {
                        interfaceC2256q.g();
                        interfaceC2256q.k(iJ + i14);
                    } else {
                        interfaceC2256q.m(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                u();
                throw new EOFException();
            }
        }
        if (z10) {
            interfaceC2256q.m(iJ + i13);
        } else {
            interfaceC2256q.g();
        }
        this.f53866k = i10;
        return true;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f53866k = 0;
        this.f53868m = -9223372036854775807L;
        this.f53869n = 0L;
        this.f53872q = 0;
        this.f53876u = j11;
        g gVar = this.f53873r;
        if (!(gVar instanceof C5722b) || ((C5722b) gVar).a(j11)) {
            return;
        }
        this.f53875t = true;
        this.f53865j = this.f53862g;
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f53863h = rVar;
        O oE = rVar.e(0, 1);
        this.f53864i = oE;
        this.f53865j = oE;
        this.f53863h.p();
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        return z(interfaceC2256q, true);
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) throws Throwable {
        g();
        int iW = w(interfaceC2256q);
        if (iW == -1 && (this.f53873r instanceof C5722b)) {
            long jK = k(this.f53869n);
            if (this.f53873r.n() != jK) {
                ((C5722b) this.f53873r).c(jK);
                this.f53863h.t(this.f53873r);
                this.f53864i.d(this.f53873r.n());
            }
        }
        return iW;
    }

    public void m() {
        this.f53874s = true;
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f53856a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f53857b = j10;
        this.f53858c = new C6609I(10);
        this.f53859d = new F.a();
        this.f53860e = new B();
        this.f53868m = -9223372036854775807L;
        this.f53861f = new D();
        C2253n c2253n = new C2253n();
        this.f53862g = c2253n;
        this.f53865j = c2253n;
        this.f53871p = -1L;
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
