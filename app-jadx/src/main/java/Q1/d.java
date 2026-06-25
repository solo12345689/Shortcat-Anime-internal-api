package q1;

import t1.C6592e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f56209i = new String("FIXED_DIMENSION");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f56210j = new String("WRAP_DIMENSION");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f56211k = new String("SPREAD_DIMENSION");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f56212l = new String("PARENT_DIMENSION");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f56213m = new String("PERCENT_DIMENSION");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f56214n = new String("RATIO_DIMENSION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f56216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f56217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f56218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f56219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f56220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f56221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f56222h;

    private d() {
        this.f56215a = -2;
        this.f56216b = 0;
        this.f56217c = Integer.MAX_VALUE;
        this.f56218d = 1.0f;
        this.f56219e = 0;
        this.f56220f = null;
        this.f56221g = f56210j;
        this.f56222h = false;
    }

    public static d b(int i10) {
        d dVar = new d(f56209i);
        dVar.i(i10);
        return dVar;
    }

    public static d c(Object obj) {
        d dVar = new d(f56209i);
        dVar.j(obj);
        return dVar;
    }

    public static d d() {
        return new d(f56212l);
    }

    public static d e(Object obj, float f10) {
        d dVar = new d(f56213m);
        dVar.p(obj, f10);
        return dVar;
    }

    public static d f(String str) {
        d dVar = new d(f56214n);
        dVar.q(str);
        return dVar;
    }

    public static d g(Object obj) {
        d dVar = new d();
        dVar.s(obj);
        return dVar;
    }

    public static d h() {
        return new d(f56210j);
    }

    public void a(g gVar, C6592e c6592e, int i10) {
        String str = this.f56220f;
        if (str != null) {
            c6592e.z0(str);
        }
        int i11 = 2;
        if (i10 == 0) {
            if (this.f56222h) {
                c6592e.L0(C6592e.b.MATCH_CONSTRAINT);
                Object obj = this.f56221g;
                if (obj == f56210j) {
                    i11 = 1;
                } else if (obj != f56213m) {
                    i11 = 0;
                }
                c6592e.M0(i11, this.f56216b, this.f56217c, this.f56218d);
                return;
            }
            int i12 = this.f56216b;
            if (i12 > 0) {
                c6592e.W0(i12);
            }
            int i13 = this.f56217c;
            if (i13 < Integer.MAX_VALUE) {
                c6592e.T0(i13);
            }
            Object obj2 = this.f56221g;
            if (obj2 == f56210j) {
                c6592e.L0(C6592e.b.WRAP_CONTENT);
                return;
            }
            if (obj2 == f56212l) {
                c6592e.L0(C6592e.b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    c6592e.L0(C6592e.b.FIXED);
                    c6592e.g1(this.f56219e);
                    return;
                }
                return;
            }
        }
        if (this.f56222h) {
            c6592e.c1(C6592e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f56221g;
            if (obj3 == f56210j) {
                i11 = 1;
            } else if (obj3 != f56213m) {
                i11 = 0;
            }
            c6592e.d1(i11, this.f56216b, this.f56217c, this.f56218d);
            return;
        }
        int i14 = this.f56216b;
        if (i14 > 0) {
            c6592e.V0(i14);
        }
        int i15 = this.f56217c;
        if (i15 < Integer.MAX_VALUE) {
            c6592e.S0(i15);
        }
        Object obj4 = this.f56221g;
        if (obj4 == f56210j) {
            c6592e.c1(C6592e.b.WRAP_CONTENT);
            return;
        }
        if (obj4 == f56212l) {
            c6592e.c1(C6592e.b.MATCH_PARENT);
        } else if (obj4 == null) {
            c6592e.c1(C6592e.b.FIXED);
            c6592e.H0(this.f56219e);
        }
    }

    public d i(int i10) {
        this.f56221g = null;
        this.f56219e = i10;
        return this;
    }

    public d j(Object obj) {
        this.f56221g = obj;
        if (obj instanceof Integer) {
            this.f56219e = ((Integer) obj).intValue();
            this.f56221g = null;
        }
        return this;
    }

    int k() {
        return this.f56219e;
    }

    public d l(int i10) {
        if (this.f56217c >= 0) {
            this.f56217c = i10;
        }
        return this;
    }

    public d m(Object obj) {
        Object obj2 = f56210j;
        if (obj == obj2 && this.f56222h) {
            this.f56221g = obj2;
            this.f56217c = Integer.MAX_VALUE;
        }
        return this;
    }

    public d n(int i10) {
        if (i10 >= 0) {
            this.f56216b = i10;
        }
        return this;
    }

    public d o(Object obj) {
        if (obj == f56210j) {
            this.f56216b = -2;
        }
        return this;
    }

    public d p(Object obj, float f10) {
        this.f56218d = f10;
        return this;
    }

    public d q(String str) {
        this.f56220f = str;
        return this;
    }

    public d r(int i10) {
        this.f56222h = true;
        if (i10 >= 0) {
            this.f56217c = i10;
        }
        return this;
    }

    public d s(Object obj) {
        this.f56221g = obj;
        this.f56222h = true;
        return this;
    }

    private d(Object obj) {
        this.f56215a = -2;
        this.f56216b = 0;
        this.f56217c = Integer.MAX_VALUE;
        this.f56218d = 1.0f;
        this.f56219e = 0;
        this.f56220f = null;
        this.f56222h = false;
        this.f56221g = obj;
    }
}
