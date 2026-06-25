package u1;

import t1.C6591d;
import t1.C6592e;
import t1.InterfaceC6596i;
import u1.f;
import u1.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f61185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f61186l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f61187a;

        static {
            int[] iArr = new int[p.b.values().length];
            f61187a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61187a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61187a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(C6592e c6592e) {
        super(c6592e);
        f fVar = new f(this);
        this.f61185k = fVar;
        this.f61186l = null;
        this.f61209h.f61154e = f.a.TOP;
        this.f61210i.f61154e = f.a.BOTTOM;
        fVar.f61154e = f.a.BASELINE;
        this.f61207f = 1;
    }

    @Override // u1.p, u1.d
    public void a(d dVar) {
        float f10;
        float fV;
        float fV2;
        int i10;
        int i11 = a.f61187a[this.f61211j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            C6592e c6592e = this.f61203b;
            n(dVar, c6592e.f60342P, c6592e.f60344R, 1);
            return;
        }
        g gVar = this.f61206e;
        if (gVar.f61152c && !gVar.f61159j && this.f61205d == C6592e.b.MATCH_CONSTRAINT) {
            C6592e c6592e2 = this.f61203b;
            int i12 = c6592e2.f60399x;
            if (i12 == 2) {
                C6592e c6592eL = c6592e2.L();
                if (c6592eL != null) {
                    if (c6592eL.f60363f.f61206e.f61159j) {
                        this.f61206e.d((int) ((r7.f61156g * this.f61203b.f60325E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && c6592e2.f60361e.f61206e.f61159j) {
                int iW = c6592e2.w();
                if (iW == -1) {
                    C6592e c6592e3 = this.f61203b;
                    f10 = c6592e3.f60361e.f61206e.f61156g;
                    fV = c6592e3.v();
                } else if (iW == 0) {
                    fV2 = r7.f60361e.f61206e.f61156g * this.f61203b.v();
                    i10 = (int) (fV2 + 0.5f);
                    this.f61206e.d(i10);
                } else if (iW != 1) {
                    i10 = 0;
                    this.f61206e.d(i10);
                } else {
                    C6592e c6592e4 = this.f61203b;
                    f10 = c6592e4.f60361e.f61206e.f61156g;
                    fV = c6592e4.v();
                }
                fV2 = f10 / fV;
                i10 = (int) (fV2 + 0.5f);
                this.f61206e.d(i10);
            }
        }
        f fVar = this.f61209h;
        if (fVar.f61152c) {
            f fVar2 = this.f61210i;
            if (fVar2.f61152c) {
                if (fVar.f61159j && fVar2.f61159j && this.f61206e.f61159j) {
                    return;
                }
                if (!this.f61206e.f61159j && this.f61205d == C6592e.b.MATCH_CONSTRAINT) {
                    C6592e c6592e5 = this.f61203b;
                    if (c6592e5.f60397w == 0 && !c6592e5.j0()) {
                        f fVar3 = (f) this.f61209h.f61161l.get(0);
                        f fVar4 = (f) this.f61210i.f61161l.get(0);
                        int i13 = fVar3.f61156g;
                        f fVar5 = this.f61209h;
                        int i14 = i13 + fVar5.f61155f;
                        int i15 = fVar4.f61156g + this.f61210i.f61155f;
                        fVar5.d(i14);
                        this.f61210i.d(i15);
                        this.f61206e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f61206e.f61159j && this.f61205d == C6592e.b.MATCH_CONSTRAINT && this.f61202a == 1 && this.f61209h.f61161l.size() > 0 && this.f61210i.f61161l.size() > 0) {
                    f fVar6 = (f) this.f61209h.f61161l.get(0);
                    int i16 = (((f) this.f61210i.f61161l.get(0)).f61156g + this.f61210i.f61155f) - (fVar6.f61156g + this.f61209h.f61155f);
                    g gVar2 = this.f61206e;
                    int i17 = gVar2.f61171m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f61206e.f61159j && this.f61209h.f61161l.size() > 0 && this.f61210i.f61161l.size() > 0) {
                    f fVar7 = (f) this.f61209h.f61161l.get(0);
                    f fVar8 = (f) this.f61210i.f61161l.get(0);
                    int i18 = fVar7.f61156g + this.f61209h.f61155f;
                    int i19 = fVar8.f61156g + this.f61210i.f61155f;
                    float fQ = this.f61203b.Q();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f61156g;
                        i19 = fVar8.f61156g;
                        fQ = 0.5f;
                    }
                    this.f61209h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f61206e.f61156g) * fQ)));
                    this.f61210i.d(this.f61209h.f61156g + this.f61206e.f61156g);
                }
            }
        }
    }

    @Override // u1.p
    void d() {
        C6592e c6592eL;
        C6592e c6592eL2;
        C6592e c6592e = this.f61203b;
        if (c6592e.f60353a) {
            this.f61206e.d(c6592e.x());
        }
        if (!this.f61206e.f61159j) {
            this.f61205d = this.f61203b.S();
            if (this.f61203b.Y()) {
                this.f61186l = new C6717a(this);
            }
            C6592e.b bVar = this.f61205d;
            if (bVar != C6592e.b.MATCH_CONSTRAINT) {
                if (bVar == C6592e.b.MATCH_PARENT && (c6592eL2 = this.f61203b.L()) != null && c6592eL2.S() == C6592e.b.FIXED) {
                    int iX = (c6592eL2.x() - this.f61203b.f60342P.f()) - this.f61203b.f60344R.f();
                    b(this.f61209h, c6592eL2.f60363f.f61209h, this.f61203b.f60342P.f());
                    b(this.f61210i, c6592eL2.f60363f.f61210i, -this.f61203b.f60344R.f());
                    this.f61206e.d(iX);
                    return;
                }
                if (this.f61205d == C6592e.b.FIXED) {
                    this.f61206e.d(this.f61203b.x());
                }
            }
        } else if (this.f61205d == C6592e.b.MATCH_PARENT && (c6592eL = this.f61203b.L()) != null && c6592eL.S() == C6592e.b.FIXED) {
            b(this.f61209h, c6592eL.f60363f.f61209h, this.f61203b.f60342P.f());
            b(this.f61210i, c6592eL.f60363f.f61210i, -this.f61203b.f60344R.f());
            return;
        }
        g gVar = this.f61206e;
        boolean z10 = gVar.f61159j;
        if (z10) {
            C6592e c6592e2 = this.f61203b;
            if (c6592e2.f60353a) {
                C6591d[] c6591dArr = c6592e2.f60349W;
                C6591d c6591d = c6591dArr[2];
                C6591d c6591d2 = c6591d.f60302f;
                if (c6591d2 != null && c6591dArr[3].f60302f != null) {
                    if (c6592e2.j0()) {
                        this.f61209h.f61155f = this.f61203b.f60349W[2].f();
                        this.f61210i.f61155f = -this.f61203b.f60349W[3].f();
                    } else {
                        f fVarH = h(this.f61203b.f60349W[2]);
                        if (fVarH != null) {
                            b(this.f61209h, fVarH, this.f61203b.f60349W[2].f());
                        }
                        f fVarH2 = h(this.f61203b.f60349W[3]);
                        if (fVarH2 != null) {
                            b(this.f61210i, fVarH2, -this.f61203b.f60349W[3].f());
                        }
                        this.f61209h.f61151b = true;
                        this.f61210i.f61151b = true;
                    }
                    if (this.f61203b.Y()) {
                        b(this.f61185k, this.f61209h, this.f61203b.p());
                        return;
                    }
                    return;
                }
                if (c6591d2 != null) {
                    f fVarH3 = h(c6591d);
                    if (fVarH3 != null) {
                        b(this.f61209h, fVarH3, this.f61203b.f60349W[2].f());
                        b(this.f61210i, this.f61209h, this.f61206e.f61156g);
                        if (this.f61203b.Y()) {
                            b(this.f61185k, this.f61209h, this.f61203b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C6591d c6591d3 = c6591dArr[3];
                if (c6591d3.f60302f != null) {
                    f fVarH4 = h(c6591d3);
                    if (fVarH4 != null) {
                        b(this.f61210i, fVarH4, -this.f61203b.f60349W[3].f());
                        b(this.f61209h, this.f61210i, -this.f61206e.f61156g);
                    }
                    if (this.f61203b.Y()) {
                        b(this.f61185k, this.f61209h, this.f61203b.p());
                        return;
                    }
                    return;
                }
                C6591d c6591d4 = c6591dArr[4];
                if (c6591d4.f60302f != null) {
                    f fVarH5 = h(c6591d4);
                    if (fVarH5 != null) {
                        b(this.f61185k, fVarH5, 0);
                        b(this.f61209h, this.f61185k, -this.f61203b.p());
                        b(this.f61210i, this.f61209h, this.f61206e.f61156g);
                        return;
                    }
                    return;
                }
                if ((c6592e2 instanceof InterfaceC6596i) || c6592e2.L() == null || this.f61203b.o(C6591d.a.CENTER).f60302f != null) {
                    return;
                }
                b(this.f61209h, this.f61203b.L().f60363f.f61209h, this.f61203b.X());
                b(this.f61210i, this.f61209h, this.f61206e.f61156g);
                if (this.f61203b.Y()) {
                    b(this.f61185k, this.f61209h, this.f61203b.p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f61205d != C6592e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            C6592e c6592e3 = this.f61203b;
            int i10 = c6592e3.f60399x;
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
            } else if (i10 == 3 && !c6592e3.j0()) {
                C6592e c6592e4 = this.f61203b;
                if (c6592e4.f60397w != 3) {
                    g gVar4 = c6592e4.f60361e.f61206e;
                    this.f61206e.f61161l.add(gVar4);
                    gVar4.f61160k.add(this.f61206e);
                    g gVar5 = this.f61206e;
                    gVar5.f61151b = true;
                    gVar5.f61160k.add(this.f61209h);
                    this.f61206e.f61160k.add(this.f61210i);
                }
            }
        }
        C6592e c6592e5 = this.f61203b;
        C6591d[] c6591dArr2 = c6592e5.f60349W;
        C6591d c6591d5 = c6591dArr2[2];
        C6591d c6591d6 = c6591d5.f60302f;
        if (c6591d6 != null && c6591dArr2[3].f60302f != null) {
            if (c6592e5.j0()) {
                this.f61209h.f61155f = this.f61203b.f60349W[2].f();
                this.f61210i.f61155f = -this.f61203b.f60349W[3].f();
            } else {
                f fVarH6 = h(this.f61203b.f60349W[2]);
                f fVarH7 = h(this.f61203b.f60349W[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f61211j = p.b.CENTER;
            }
            if (this.f61203b.Y()) {
                c(this.f61185k, this.f61209h, 1, this.f61186l);
            }
        } else if (c6591d6 != null) {
            f fVarH8 = h(c6591d5);
            if (fVarH8 != null) {
                b(this.f61209h, fVarH8, this.f61203b.f60349W[2].f());
                c(this.f61210i, this.f61209h, 1, this.f61206e);
                if (this.f61203b.Y()) {
                    c(this.f61185k, this.f61209h, 1, this.f61186l);
                }
                C6592e.b bVar2 = this.f61205d;
                C6592e.b bVar3 = C6592e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f61203b.v() > 0.0f) {
                    l lVar = this.f61203b.f60361e;
                    if (lVar.f61205d == bVar3) {
                        lVar.f61206e.f61160k.add(this.f61206e);
                        this.f61206e.f61161l.add(this.f61203b.f60361e.f61206e);
                        this.f61206e.f61150a = this;
                    }
                }
            }
        } else {
            C6591d c6591d7 = c6591dArr2[3];
            if (c6591d7.f60302f != null) {
                f fVarH9 = h(c6591d7);
                if (fVarH9 != null) {
                    b(this.f61210i, fVarH9, -this.f61203b.f60349W[3].f());
                    c(this.f61209h, this.f61210i, -1, this.f61206e);
                    if (this.f61203b.Y()) {
                        c(this.f61185k, this.f61209h, 1, this.f61186l);
                    }
                }
            } else {
                C6591d c6591d8 = c6591dArr2[4];
                if (c6591d8.f60302f != null) {
                    f fVarH10 = h(c6591d8);
                    if (fVarH10 != null) {
                        b(this.f61185k, fVarH10, 0);
                        c(this.f61209h, this.f61185k, -1, this.f61186l);
                        c(this.f61210i, this.f61209h, 1, this.f61206e);
                    }
                } else if (!(c6592e5 instanceof InterfaceC6596i) && c6592e5.L() != null) {
                    b(this.f61209h, this.f61203b.L().f60363f.f61209h, this.f61203b.X());
                    c(this.f61210i, this.f61209h, 1, this.f61206e);
                    if (this.f61203b.Y()) {
                        c(this.f61185k, this.f61209h, 1, this.f61186l);
                    }
                    C6592e.b bVar4 = this.f61205d;
                    C6592e.b bVar5 = C6592e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f61203b.v() > 0.0f) {
                        l lVar2 = this.f61203b.f60361e;
                        if (lVar2.f61205d == bVar5) {
                            lVar2.f61206e.f61160k.add(this.f61206e);
                            this.f61206e.f61161l.add(this.f61203b.f60361e.f61206e);
                            this.f61206e.f61150a = this;
                        }
                    }
                }
            }
        }
        if (this.f61206e.f61161l.size() == 0) {
            this.f61206e.f61152c = true;
        }
    }

    @Override // u1.p
    public void e() {
        f fVar = this.f61209h;
        if (fVar.f61159j) {
            this.f61203b.j1(fVar.f61156g);
        }
    }

    @Override // u1.p
    void f() {
        this.f61204c = null;
        this.f61209h.c();
        this.f61210i.c();
        this.f61185k.c();
        this.f61206e.c();
        this.f61208g = false;
    }

    @Override // u1.p
    boolean m() {
        return this.f61205d != C6592e.b.MATCH_CONSTRAINT || this.f61203b.f60399x == 0;
    }

    void q() {
        this.f61208g = false;
        this.f61209h.c();
        this.f61209h.f61159j = false;
        this.f61210i.c();
        this.f61210i.f61159j = false;
        this.f61185k.c();
        this.f61185k.f61159j = false;
        this.f61206e.f61159j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f61203b.t();
    }
}
