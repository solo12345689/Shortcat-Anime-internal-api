package W2;

import P9.X;
import U2.G;
import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import U2.O;
import java.util.ArrayList;
import q2.AbstractC6079K;
import q2.C6080L;
import q2.C6109x;
import r3.r;
import r3.s;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC2255p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f20643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f20644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.a f20646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private U2.r f20648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private W2.c f20649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e[] f20651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f20652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f20653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f20655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f20656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20658p;

    /* JADX INFO: renamed from: W2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class C0362b implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f20659a;

        public C0362b(long j10) {
            this.f20659a = j10;
        }

        @Override // U2.J
        public J.a g(long j10) {
            J.a aVarI = b.this.f20651i[0].i(j10);
            for (int i10 = 1; i10 < b.this.f20651i.length; i10++) {
                J.a aVarI2 = b.this.f20651i[i10].i(j10);
                if (aVarI2.f18918a.f18924b < aVarI.f18918a.f18924b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // U2.J
        public boolean k() {
            return true;
        }

        @Override // U2.J
        public long n() {
            return this.f20659a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20663c;

        private c() {
        }

        public void a(C6609I c6609i) {
            this.f20661a = c6609i.z();
            this.f20662b = c6609i.z();
            this.f20663c = 0;
        }

        public void b(C6609I c6609i) throws C6080L {
            a(c6609i);
            if (this.f20661a == 1414744396) {
                this.f20663c = c6609i.z();
                return;
            }
            throw C6080L.a("LIST expected, found: " + this.f20661a, null);
        }
    }

    public b(int i10, r.a aVar) {
        this.f20646d = aVar;
        this.f20645c = (i10 & 1) == 0;
        this.f20643a = new C6609I(12);
        this.f20644b = new c();
        this.f20648f = new G();
        this.f20651i = new e[0];
        this.f20655m = -1L;
        this.f20656n = -1L;
        this.f20654l = -1;
        this.f20650h = -9223372036854775807L;
    }

    private static void e(InterfaceC2256q interfaceC2256q) {
        if ((interfaceC2256q.getPosition() & 1) == 1) {
            interfaceC2256q.m(1);
        }
    }

    private e g(int i10) {
        for (e eVar : this.f20651i) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void j(C6609I c6609i) throws C6080L {
        f fVarC = f.c(1819436136, c6609i);
        if (fVarC.getType() != 1819436136) {
            throw C6080L.a("Unexpected header list type " + fVarC.getType(), null);
        }
        W2.c cVar = (W2.c) fVarC.b(W2.c.class);
        if (cVar == null) {
            throw C6080L.a("AviHeader not found", null);
        }
        this.f20649g = cVar;
        this.f20650h = ((long) cVar.f20666c) * ((long) cVar.f20664a);
        ArrayList arrayList = new ArrayList();
        X it = fVarC.f20689a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            W2.a aVar = (W2.a) it.next();
            if (aVar.getType() == 1819440243) {
                int i11 = i10 + 1;
                e eVarN = n((f) aVar, i10);
                if (eVarN != null) {
                    arrayList.add(eVarN);
                }
                i10 = i11;
            }
        }
        this.f20651i = (e[]) arrayList.toArray(new e[0]);
        this.f20648f.p();
    }

    private void k(C6609I c6609i) {
        int i10;
        long jM = m(c6609i);
        while (true) {
            if (c6609i.a() < 16) {
                break;
            }
            int iZ = c6609i.z();
            int iZ2 = c6609i.z();
            long jZ = ((long) c6609i.z()) + jM;
            c6609i.c0(4);
            e eVarG = g(iZ);
            if (eVarG != null) {
                eVarG.b(jZ, (iZ2 & 16) == 16);
            }
        }
        for (e eVar : this.f20651i) {
            eVar.c();
        }
        this.f20658p = true;
        if (this.f20651i.length == 0) {
            this.f20648f.t(new J.b(this.f20650h));
        } else {
            this.f20648f.t(new C0362b(this.f20650h));
        }
    }

    private long m(C6609I c6609i) {
        if (c6609i.a() < 16) {
            return 0L;
        }
        int iG = c6609i.g();
        c6609i.c0(8);
        long jZ = c6609i.z();
        long j10 = this.f20655m;
        long j11 = jZ <= j10 ? j10 + 8 : 0L;
        c6609i.b0(iG);
        return j11;
    }

    private e n(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            AbstractC6635w.i("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            AbstractC6635w.i("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        C6109x c6109x = gVar.f20691a;
        C6109x.b bVarB = c6109x.b();
        bVarB.i0(i10);
        int i11 = dVar.f20673f;
        if (i11 != 0) {
            bVarB.o0(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.l0(hVar.f20692a);
        }
        int iK = AbstractC6079K.k(c6109x.f57022o);
        if (iK != 1 && iK != 2) {
            return null;
        }
        O oE = this.f20648f.e(i10, iK);
        oE.c(bVarB.P());
        oE.d(jA);
        this.f20650h = Math.max(this.f20650h, jA);
        return new e(i10, dVar, oE);
    }

    private int o(InterfaceC2256q interfaceC2256q) {
        if (interfaceC2256q.getPosition() >= this.f20656n) {
            return -1;
        }
        e eVar = this.f20653k;
        if (eVar == null) {
            e(interfaceC2256q);
            interfaceC2256q.o(this.f20643a.f(), 0, 12);
            this.f20643a.b0(0);
            int iZ = this.f20643a.z();
            if (iZ == 1414744396) {
                this.f20643a.b0(8);
                interfaceC2256q.m(this.f20643a.z() != 1769369453 ? 8 : 12);
                interfaceC2256q.g();
                return 0;
            }
            int iZ2 = this.f20643a.z();
            if (iZ == 1263424842) {
                this.f20652j = interfaceC2256q.getPosition() + ((long) iZ2) + 8;
                return 0;
            }
            interfaceC2256q.m(8);
            interfaceC2256q.g();
            e eVarG = g(iZ);
            if (eVarG == null) {
                this.f20652j = interfaceC2256q.getPosition() + ((long) iZ2);
                return 0;
            }
            eVarG.n(iZ2);
            this.f20653k = eVarG;
        } else if (eVar.m(interfaceC2256q)) {
            this.f20653k = null;
        }
        return 0;
    }

    private boolean p(InterfaceC2256q interfaceC2256q, I i10) {
        boolean z10;
        if (this.f20652j != -1) {
            long position = interfaceC2256q.getPosition();
            long j10 = this.f20652j;
            if (j10 < position || j10 > 262144 + position) {
                i10.f18917a = j10;
                z10 = true;
            } else {
                interfaceC2256q.m((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f20652j = -1L;
        return z10;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f20652j = -1L;
        this.f20653k = null;
        for (e eVar : this.f20651i) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f20647e = 6;
        } else if (this.f20651i.length == 0) {
            this.f20647e = 0;
        } else {
            this.f20647e = 3;
        }
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        this.f20647e = 0;
        if (this.f20645c) {
            rVar = new s(rVar, this.f20646d);
        }
        this.f20648f = rVar;
        this.f20652j = -1L;
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        interfaceC2256q.o(this.f20643a.f(), 0, 12);
        this.f20643a.b0(0);
        if (this.f20643a.z() != 1179011410) {
            return false;
        }
        this.f20643a.c0(4);
        return this.f20643a.z() == 541677121;
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        if (p(interfaceC2256q, i10)) {
            return 1;
        }
        switch (this.f20647e) {
            case 0:
                if (!f(interfaceC2256q)) {
                    throw C6080L.a("AVI Header List not found", null);
                }
                interfaceC2256q.m(12);
                this.f20647e = 1;
                return 0;
            case 1:
                interfaceC2256q.readFully(this.f20643a.f(), 0, 12);
                this.f20643a.b0(0);
                this.f20644b.b(this.f20643a);
                c cVar = this.f20644b;
                if (cVar.f20663c == 1819436136) {
                    this.f20654l = cVar.f20662b;
                    this.f20647e = 2;
                    return 0;
                }
                throw C6080L.a("hdrl expected, found: " + this.f20644b.f20663c, null);
            case 2:
                int i11 = this.f20654l - 4;
                C6609I c6609i = new C6609I(i11);
                interfaceC2256q.readFully(c6609i.f(), 0, i11);
                j(c6609i);
                this.f20647e = 3;
                return 0;
            case 3:
                if (this.f20655m != -1) {
                    long position = interfaceC2256q.getPosition();
                    long j10 = this.f20655m;
                    if (position != j10) {
                        this.f20652j = j10;
                        return 0;
                    }
                }
                interfaceC2256q.o(this.f20643a.f(), 0, 12);
                interfaceC2256q.g();
                this.f20643a.b0(0);
                this.f20644b.a(this.f20643a);
                int iZ = this.f20643a.z();
                int i12 = this.f20644b.f20661a;
                if (i12 == 1179011410) {
                    interfaceC2256q.m(12);
                    return 0;
                }
                if (i12 != 1414744396 || iZ != 1769369453) {
                    this.f20652j = interfaceC2256q.getPosition() + ((long) this.f20644b.f20662b) + 8;
                    return 0;
                }
                long position2 = interfaceC2256q.getPosition();
                this.f20655m = position2;
                this.f20656n = position2 + ((long) this.f20644b.f20662b) + 8;
                if (!this.f20658p) {
                    if (((W2.c) AbstractC6614a.e(this.f20649g)).a()) {
                        this.f20647e = 4;
                        this.f20652j = this.f20656n;
                        return 0;
                    }
                    this.f20648f.t(new J.b(this.f20650h));
                    this.f20658p = true;
                }
                this.f20652j = interfaceC2256q.getPosition() + 12;
                this.f20647e = 6;
                return 0;
            case 4:
                interfaceC2256q.readFully(this.f20643a.f(), 0, 8);
                this.f20643a.b0(0);
                int iZ2 = this.f20643a.z();
                int iZ3 = this.f20643a.z();
                if (iZ2 == 829973609) {
                    this.f20647e = 5;
                    this.f20657o = iZ3;
                } else {
                    this.f20652j = interfaceC2256q.getPosition() + ((long) iZ3);
                }
                return 0;
            case 5:
                C6609I c6609i2 = new C6609I(this.f20657o);
                interfaceC2256q.readFully(c6609i2.f(), 0, this.f20657o);
                k(c6609i2);
                this.f20647e = 6;
                this.f20652j = this.f20655m;
                return 0;
            case 6:
                return o(interfaceC2256q);
            default:
                throw new AssertionError();
        }
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
