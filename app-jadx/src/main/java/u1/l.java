package u1;

import t1.C6591d;
import t1.C6592e;
import t1.InterfaceC6596i;
import u1.f;
import u1.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k */
    private static int[] f61175k = new int[2];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f61176a;

        static {
            int[] iArr = new int[p.b.values().length];
            f61176a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61176a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61176a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(C6592e c6592e) {
        super(c6592e);
        this.f61209h.f61154e = f.a.LEFT;
        this.f61210i.f61154e = f.a.RIGHT;
        this.f61207f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x02ca  */
    @Override // u1.p, u1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(u1.d r14) {
        /*
            Method dump skipped, instruction units count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.l.a(u1.d):void");
    }

    @Override // u1.p
    void d() {
        C6592e c6592eL;
        C6592e c6592eL2;
        C6592e c6592e = this.f61203b;
        if (c6592e.f60353a) {
            this.f61206e.d(c6592e.V());
        }
        if (this.f61206e.f61159j) {
            C6592e.b bVar = this.f61205d;
            C6592e.b bVar2 = C6592e.b.MATCH_PARENT;
            if (bVar == bVar2 && (c6592eL = this.f61203b.L()) != null && (c6592eL.A() == C6592e.b.FIXED || c6592eL.A() == bVar2)) {
                b(this.f61209h, c6592eL.f60361e.f61209h, this.f61203b.f60341O.f());
                b(this.f61210i, c6592eL.f60361e.f61210i, -this.f61203b.f60343Q.f());
                return;
            }
        } else {
            C6592e.b bVarA = this.f61203b.A();
            this.f61205d = bVarA;
            if (bVarA != C6592e.b.MATCH_CONSTRAINT) {
                C6592e.b bVar3 = C6592e.b.MATCH_PARENT;
                if (bVarA == bVar3 && (c6592eL2 = this.f61203b.L()) != null && (c6592eL2.A() == C6592e.b.FIXED || c6592eL2.A() == bVar3)) {
                    int iV = (c6592eL2.V() - this.f61203b.f60341O.f()) - this.f61203b.f60343Q.f();
                    b(this.f61209h, c6592eL2.f60361e.f61209h, this.f61203b.f60341O.f());
                    b(this.f61210i, c6592eL2.f60361e.f61210i, -this.f61203b.f60343Q.f());
                    this.f61206e.d(iV);
                    return;
                }
                if (this.f61205d == C6592e.b.FIXED) {
                    this.f61206e.d(this.f61203b.V());
                }
            }
        }
        g gVar = this.f61206e;
        if (gVar.f61159j) {
            C6592e c6592e2 = this.f61203b;
            if (c6592e2.f60353a) {
                C6591d[] c6591dArr = c6592e2.f60349W;
                C6591d c6591d = c6591dArr[0];
                C6591d c6591d2 = c6591d.f60302f;
                if (c6591d2 != null && c6591dArr[1].f60302f != null) {
                    if (c6592e2.h0()) {
                        this.f61209h.f61155f = this.f61203b.f60349W[0].f();
                        this.f61210i.f61155f = -this.f61203b.f60349W[1].f();
                        return;
                    }
                    f fVarH = h(this.f61203b.f60349W[0]);
                    if (fVarH != null) {
                        b(this.f61209h, fVarH, this.f61203b.f60349W[0].f());
                    }
                    f fVarH2 = h(this.f61203b.f60349W[1]);
                    if (fVarH2 != null) {
                        b(this.f61210i, fVarH2, -this.f61203b.f60349W[1].f());
                    }
                    this.f61209h.f61151b = true;
                    this.f61210i.f61151b = true;
                    return;
                }
                if (c6591d2 != null) {
                    f fVarH3 = h(c6591d);
                    if (fVarH3 != null) {
                        b(this.f61209h, fVarH3, this.f61203b.f60349W[0].f());
                        b(this.f61210i, this.f61209h, this.f61206e.f61156g);
                        return;
                    }
                    return;
                }
                C6591d c6591d3 = c6591dArr[1];
                if (c6591d3.f60302f != null) {
                    f fVarH4 = h(c6591d3);
                    if (fVarH4 != null) {
                        b(this.f61210i, fVarH4, -this.f61203b.f60349W[1].f());
                        b(this.f61209h, this.f61210i, -this.f61206e.f61156g);
                        return;
                    }
                    return;
                }
                if ((c6592e2 instanceof InterfaceC6596i) || c6592e2.L() == null || this.f61203b.o(C6591d.a.CENTER).f60302f != null) {
                    return;
                }
                b(this.f61209h, this.f61203b.L().f60361e.f61209h, this.f61203b.W());
                b(this.f61210i, this.f61209h, this.f61206e.f61156g);
                return;
            }
        }
        if (this.f61205d == C6592e.b.MATCH_CONSTRAINT) {
            C6592e c6592e3 = this.f61203b;
            int i10 = c6592e3.f60397w;
            if (i10 == 2) {
                C6592e c6592eL3 = c6592e3.L();
                if (c6592eL3 != null) {
                    g gVar2 = c6592eL3.f60363f.f61206e;
                    this.f61206e.f61161l.add(gVar2);
                    gVar2.f61160k.add(this.f61206e);
                    g gVar3 = this.f61206e;
                    gVar3.f61151b = true;
                    gVar3.f61160k.add(this.f61209h);
                    this.f61206e.f61160k.add(this.f61210i);
                }
            } else if (i10 == 3) {
                if (c6592e3.f60399x == 3) {
                    this.f61209h.f61150a = this;
                    this.f61210i.f61150a = this;
                    n nVar = c6592e3.f60363f;
                    nVar.f61209h.f61150a = this;
                    nVar.f61210i.f61150a = this;
                    gVar.f61150a = this;
                    if (c6592e3.j0()) {
                        this.f61206e.f61161l.add(this.f61203b.f60363f.f61206e);
                        this.f61203b.f60363f.f61206e.f61160k.add(this.f61206e);
                        n nVar2 = this.f61203b.f60363f;
                        nVar2.f61206e.f61150a = this;
                        this.f61206e.f61161l.add(nVar2.f61209h);
                        this.f61206e.f61161l.add(this.f61203b.f60363f.f61210i);
                        this.f61203b.f60363f.f61209h.f61160k.add(this.f61206e);
                        this.f61203b.f60363f.f61210i.f61160k.add(this.f61206e);
                    } else if (this.f61203b.h0()) {
                        this.f61203b.f60363f.f61206e.f61161l.add(this.f61206e);
                        this.f61206e.f61160k.add(this.f61203b.f60363f.f61206e);
                    } else {
                        this.f61203b.f60363f.f61206e.f61161l.add(this.f61206e);
                    }
                } else {
                    g gVar4 = c6592e3.f60363f.f61206e;
                    gVar.f61161l.add(gVar4);
                    gVar4.f61160k.add(this.f61206e);
                    this.f61203b.f60363f.f61209h.f61160k.add(this.f61206e);
                    this.f61203b.f60363f.f61210i.f61160k.add(this.f61206e);
                    g gVar5 = this.f61206e;
                    gVar5.f61151b = true;
                    gVar5.f61160k.add(this.f61209h);
                    this.f61206e.f61160k.add(this.f61210i);
                    this.f61209h.f61161l.add(this.f61206e);
                    this.f61210i.f61161l.add(this.f61206e);
                }
            }
        }
        C6592e c6592e4 = this.f61203b;
        C6591d[] c6591dArr2 = c6592e4.f60349W;
        C6591d c6591d4 = c6591dArr2[0];
        C6591d c6591d5 = c6591d4.f60302f;
        if (c6591d5 != null && c6591dArr2[1].f60302f != null) {
            if (c6592e4.h0()) {
                this.f61209h.f61155f = this.f61203b.f60349W[0].f();
                this.f61210i.f61155f = -this.f61203b.f60349W[1].f();
                return;
            }
            f fVarH5 = h(this.f61203b.f60349W[0]);
            f fVarH6 = h(this.f61203b.f60349W[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f61211j = p.b.CENTER;
            return;
        }
        if (c6591d5 != null) {
            f fVarH7 = h(c6591d4);
            if (fVarH7 != null) {
                b(this.f61209h, fVarH7, this.f61203b.f60349W[0].f());
                c(this.f61210i, this.f61209h, 1, this.f61206e);
                return;
            }
            return;
        }
        C6591d c6591d6 = c6591dArr2[1];
        if (c6591d6.f60302f != null) {
            f fVarH8 = h(c6591d6);
            if (fVarH8 != null) {
                b(this.f61210i, fVarH8, -this.f61203b.f60349W[1].f());
                c(this.f61209h, this.f61210i, -1, this.f61206e);
                return;
            }
            return;
        }
        if ((c6592e4 instanceof InterfaceC6596i) || c6592e4.L() == null) {
            return;
        }
        b(this.f61209h, this.f61203b.L().f60361e.f61209h, this.f61203b.W());
        c(this.f61210i, this.f61209h, 1, this.f61206e);
    }

    @Override // u1.p
    public void e() {
        f fVar = this.f61209h;
        if (fVar.f61159j) {
            this.f61203b.i1(fVar.f61156g);
        }
    }

    @Override // u1.p
    void f() {
        this.f61204c = null;
        this.f61209h.c();
        this.f61210i.c();
        this.f61206e.c();
        this.f61208g = false;
    }

    @Override // u1.p
    boolean m() {
        return this.f61205d != C6592e.b.MATCH_CONSTRAINT || this.f61203b.f60397w == 0;
    }

    void r() {
        this.f61208g = false;
        this.f61209h.c();
        this.f61209h.f61159j = false;
        this.f61210i.c();
        this.f61210i.f61159j = false;
        this.f61206e.f61159j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f61203b.t();
    }
}
