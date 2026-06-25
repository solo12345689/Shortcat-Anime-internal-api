package Z2;

import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import U2.O;
import U2.r;
import U2.u;
import U2.v;
import U2.w;
import U2.x;
import U2.y;
import q2.C6078J;
import q2.C6080L;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC2255p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f23132o = new u() { // from class: Z2.c
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return d.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f23133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f23134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v.a f23136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f23137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private O f23138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C6078J f23140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y f23141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f23144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23146n;

    public d() {
        this(0);
    }

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new d()};
    }

    private long e(C6609I c6609i, boolean z10) {
        boolean zD;
        AbstractC6614a.e(this.f23141i);
        int iG = c6609i.g();
        while (iG <= c6609i.j() - 16) {
            c6609i.b0(iG);
            if (v.d(c6609i, this.f23141i, this.f23143k, this.f23136d)) {
                c6609i.b0(iG);
                return this.f23136d.f19094a;
            }
            iG++;
        }
        if (!z10) {
            c6609i.b0(iG);
            return -1L;
        }
        while (iG <= c6609i.j() - this.f23142j) {
            c6609i.b0(iG);
            try {
                zD = v.d(c6609i, this.f23141i, this.f23143k, this.f23136d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (c6609i.g() <= c6609i.j() ? zD : false) {
                c6609i.b0(iG);
                return this.f23136d.f19094a;
            }
            iG++;
        }
        c6609i.b0(c6609i.j());
        return -1L;
    }

    private void g(InterfaceC2256q interfaceC2256q) {
        this.f23143k = w.b(interfaceC2256q);
        ((r) a0.l(this.f23137e)).t(j(interfaceC2256q.getPosition(), interfaceC2256q.getLength()));
        this.f23139g = 5;
    }

    private J j(long j10, long j11) {
        AbstractC6614a.e(this.f23141i);
        y yVar = this.f23141i;
        y.a aVar = yVar.f19108k;
        if (aVar != null && aVar.f19110a.length > 0) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f19107j <= 0) {
            return new J.b(yVar.f());
        }
        b bVar = new b(yVar, this.f23143k, j10, j11);
        this.f23144l = bVar;
        return bVar.b();
    }

    private void k(InterfaceC2256q interfaceC2256q) {
        byte[] bArr = this.f23133a;
        interfaceC2256q.o(bArr, 0, bArr.length);
        interfaceC2256q.g();
        this.f23139g = 2;
    }

    private void m() {
        ((O) a0.l(this.f23138f)).a((this.f23146n * 1000000) / ((long) ((y) a0.l(this.f23141i)).f19102e), 1, this.f23145m, 0, null);
    }

    private int n(InterfaceC2256q interfaceC2256q, I i10) {
        boolean z10;
        AbstractC6614a.e(this.f23138f);
        AbstractC6614a.e(this.f23141i);
        b bVar = this.f23144l;
        if (bVar != null && bVar.d()) {
            return this.f23144l.c(interfaceC2256q, i10);
        }
        if (this.f23146n == -1) {
            this.f23146n = v.i(interfaceC2256q, this.f23141i);
            return 0;
        }
        int iJ = this.f23134b.j();
        if (iJ < 32768) {
            int i11 = interfaceC2256q.read(this.f23134b.f(), iJ, 32768 - iJ);
            z10 = i11 == -1;
            if (!z10) {
                this.f23134b.a0(iJ + i11);
            } else if (this.f23134b.a() == 0) {
                m();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iG = this.f23134b.g();
        int i12 = this.f23145m;
        int i13 = this.f23142j;
        if (i12 < i13) {
            C6609I c6609i = this.f23134b;
            c6609i.c0(Math.min(i13 - i12, c6609i.a()));
        }
        long jE = e(this.f23134b, z10);
        int iG2 = this.f23134b.g() - iG;
        this.f23134b.b0(iG);
        this.f23138f.f(this.f23134b, iG2);
        this.f23145m += iG2;
        if (jE != -1) {
            m();
            this.f23145m = 0;
            this.f23146n = jE;
        }
        int length = this.f23134b.f().length - this.f23134b.j();
        if (this.f23134b.a() < 16 && length < 16) {
            int iA = this.f23134b.a();
            System.arraycopy(this.f23134b.f(), this.f23134b.g(), this.f23134b.f(), 0, iA);
            this.f23134b.b0(0);
            this.f23134b.a0(iA);
        }
        return 0;
    }

    private void o(InterfaceC2256q interfaceC2256q) {
        this.f23140h = w.d(interfaceC2256q, !this.f23135c);
        this.f23139g = 1;
    }

    private void p(InterfaceC2256q interfaceC2256q) {
        w.a aVar = new w.a(this.f23141i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(interfaceC2256q, aVar);
            this.f23141i = (y) a0.l(aVar.f19095a);
        }
        AbstractC6614a.e(this.f23141i);
        this.f23142j = Math.max(this.f23141i.f19100c, 6);
        ((O) a0.l(this.f23138f)).c(this.f23141i.g(this.f23133a, this.f23140h).b().W("audio/flac").P());
        ((O) a0.l(this.f23138f)).d(this.f23141i.f());
        this.f23139g = 4;
    }

    private void q(InterfaceC2256q interfaceC2256q) throws C6080L {
        w.i(interfaceC2256q);
        this.f23139g = 3;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f23139g = 0;
        } else {
            b bVar = this.f23144l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f23146n = j11 != 0 ? -1L : 0L;
        this.f23145m = 0;
        this.f23134b.X(0);
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f23137e = rVar;
        this.f23138f = rVar.e(0, 1);
        rVar.p();
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) throws Throwable {
        w.c(interfaceC2256q, false);
        return w.a(interfaceC2256q);
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        int i11 = this.f23139g;
        if (i11 == 0) {
            o(interfaceC2256q);
            return 0;
        }
        if (i11 == 1) {
            k(interfaceC2256q);
            return 0;
        }
        if (i11 == 2) {
            q(interfaceC2256q);
            return 0;
        }
        if (i11 == 3) {
            p(interfaceC2256q);
            return 0;
        }
        if (i11 == 4) {
            g(interfaceC2256q);
            return 0;
        }
        if (i11 == 5) {
            return n(interfaceC2256q, i10);
        }
        throw new IllegalStateException();
    }

    public d(int i10) {
        this.f23133a = new byte[42];
        this.f23134b = new C6609I(new byte[32768], 0);
        this.f23135c = (i10 & 1) != 0;
        this.f23136d = new v.a();
        this.f23139g = 0;
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
