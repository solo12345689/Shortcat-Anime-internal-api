package u1;

import t1.C6591d;
import t1.C6592e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a */
    public int f61202a;

    /* JADX INFO: renamed from: b */
    C6592e f61203b;

    /* JADX INFO: renamed from: c */
    m f61204c;

    /* JADX INFO: renamed from: d */
    protected C6592e.b f61205d;

    /* JADX INFO: renamed from: e */
    g f61206e = new g(this);

    /* JADX INFO: renamed from: f */
    public int f61207f = 0;

    /* JADX INFO: renamed from: g */
    boolean f61208g = false;

    /* JADX INFO: renamed from: h */
    public f f61209h = new f(this);

    /* JADX INFO: renamed from: i */
    public f f61210i = new f(this);

    /* JADX INFO: renamed from: j */
    protected b f61211j = b.NONE;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f61212a;

        static {
            int[] iArr = new int[C6591d.a.values().length];
            f61212a = iArr;
            try {
                iArr[C6591d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61212a[C6591d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61212a[C6591d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f61212a[C6591d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f61212a[C6591d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(C6592e c6592e) {
        this.f61203b = c6592e;
    }

    private void l(int i10, int i11) {
        int i12 = this.f61202a;
        if (i12 == 0) {
            this.f61206e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f61206e.d(Math.min(g(this.f61206e.f61171m, i10), i11));
            return;
        }
        if (i12 == 2) {
            C6592e c6592eL = this.f61203b.L();
            if (c6592eL != null) {
                if ((i10 == 0 ? c6592eL.f60361e : c6592eL.f60363f).f61206e.f61159j) {
                    this.f61206e.d(g((int) ((r9.f61156g * (i10 == 0 ? this.f61203b.f60319B : this.f61203b.f60325E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        C6592e c6592e = this.f61203b;
        p pVar = c6592e.f60361e;
        C6592e.b bVar = pVar.f61205d;
        C6592e.b bVar2 = C6592e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f61202a == 3) {
            n nVar = c6592e.f60363f;
            if (nVar.f61205d == bVar2 && nVar.f61202a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = c6592e.f60363f;
        }
        if (pVar.f61206e.f61159j) {
            float fV = c6592e.v();
            this.f61206e.d(i10 == 1 ? (int) ((pVar.f61206e.f61156g / fV) + 0.5f) : (int) ((fV * pVar.f61206e.f61156g) + 0.5f));
        }
    }

    @Override // u1.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f61161l.add(fVar2);
        fVar.f61155f = i10;
        fVar2.f61160k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f61161l.add(fVar2);
        fVar.f61161l.add(this.f61206e);
        fVar.f61157h = i10;
        fVar.f61158i = gVar;
        fVar2.f61160k.add(fVar);
        gVar.f61160k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            C6592e c6592e = this.f61203b;
            int i12 = c6592e.f60317A;
            int iMax = Math.max(c6592e.f60403z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            C6592e c6592e2 = this.f61203b;
            int i13 = c6592e2.f60323D;
            int iMax2 = Math.max(c6592e2.f60321C, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final f h(C6591d c6591d) {
        C6591d c6591d2 = c6591d.f60302f;
        if (c6591d2 == null) {
            return null;
        }
        C6592e c6592e = c6591d2.f60300d;
        int i10 = a.f61212a[c6591d2.f60301e.ordinal()];
        if (i10 == 1) {
            return c6592e.f60361e.f61209h;
        }
        if (i10 == 2) {
            return c6592e.f60361e.f61210i;
        }
        if (i10 == 3) {
            return c6592e.f60363f.f61209h;
        }
        if (i10 == 4) {
            return c6592e.f60363f.f61185k;
        }
        if (i10 != 5) {
            return null;
        }
        return c6592e.f60363f.f61210i;
    }

    protected final f i(C6591d c6591d, int i10) {
        C6591d c6591d2 = c6591d.f60302f;
        if (c6591d2 == null) {
            return null;
        }
        C6592e c6592e = c6591d2.f60300d;
        p pVar = i10 == 0 ? c6592e.f60361e : c6592e.f60363f;
        int i11 = a.f61212a[c6591d2.f60301e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f61210i;
        }
        return pVar.f61209h;
    }

    public long j() {
        if (this.f61206e.f61159j) {
            return r0.f61156g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f61208g;
    }

    abstract boolean m();

    protected void n(d dVar, C6591d c6591d, C6591d c6591d2, int i10) {
        f fVarH = h(c6591d);
        f fVarH2 = h(c6591d2);
        if (fVarH.f61159j && fVarH2.f61159j) {
            int iF = fVarH.f61156g + c6591d.f();
            int iF2 = fVarH2.f61156g - c6591d2.f();
            int i11 = iF2 - iF;
            if (!this.f61206e.f61159j && this.f61205d == C6592e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f61206e;
            if (gVar.f61159j) {
                if (gVar.f61156g == i11) {
                    this.f61209h.d(iF);
                    this.f61210i.d(iF2);
                    return;
                }
                float fY = i10 == 0 ? this.f61203b.y() : this.f61203b.Q();
                if (fVarH == fVarH2) {
                    iF = fVarH.f61156g;
                    iF2 = fVarH2.f61156g;
                    fY = 0.5f;
                }
                this.f61209h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f61206e.f61156g) * fY)));
                this.f61210i.d(this.f61209h.f61156g + this.f61206e.f61156g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
