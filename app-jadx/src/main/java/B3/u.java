package B3;

import B3.L;
import B3.v;
import P9.AbstractC2011u;
import q2.C6080L;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6608H;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1427a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f1432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private U2.O f1433g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1436j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1439m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1442p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1446t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1448v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1431e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f1428b = new C6609I(new byte[15], 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6608H f1429c = new C6608H();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6609I f1430d = new C6609I();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v.b f1443q = new v.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1444r = -2147483647;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1445s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f1447u = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1437k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1440n = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f1434h = -9.223372036854776E18d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f1435i = -9.223372036854776E18d;

    public u(String str) {
        this.f1427a = str;
    }

    private void a(C6609I c6609i, C6609I c6609i2, boolean z10) {
        int iG = c6609i.g();
        int iMin = Math.min(c6609i.a(), c6609i2.a());
        c6609i.q(c6609i2.f(), c6609i2.g(), iMin);
        c6609i2.c0(iMin);
        if (z10) {
            c6609i.b0(iG);
        }
    }

    private void g() {
        int i10;
        if (this.f1448v) {
            this.f1437k = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = (((double) (this.f1445s - this.f1446t)) * 1000000.0d) / ((double) this.f1444r);
        long jRound = Math.round(this.f1434h);
        if (this.f1436j) {
            this.f1436j = false;
            this.f1434h = this.f1435i;
        } else {
            this.f1434h += d10;
        }
        this.f1433g.a(jRound, i10, this.f1442p, 0, null);
        this.f1448v = false;
        this.f1446t = 0;
        this.f1442p = 0;
    }

    private void h(C6608H c6608h) throws C6080L {
        v.c cVarH = v.h(c6608h);
        this.f1444r = cVarH.f1453b;
        this.f1445s = cVarH.f1454c;
        long j10 = this.f1447u;
        long j11 = this.f1443q.f1450b;
        if (j10 != j11) {
            this.f1447u = j11;
            String str = "mhm1";
            if (cVarH.f1452a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f1452a));
            }
            byte[] bArr = cVarH.f1455d;
            this.f1433g.c(new C6109x.b().j0(this.f1432f).W(this.f1427a).y0("audio/mhm1").z0(this.f1444r).U(str).k0((bArr == null || bArr.length <= 0) ? null : AbstractC2011u.D(a0.f60567f, bArr)).P());
        }
        this.f1448v = true;
    }

    private boolean i() throws C6080L {
        int iJ = this.f1428b.j();
        this.f1429c.o(this.f1428b.f(), iJ);
        boolean zG = v.g(this.f1429c, this.f1443q);
        if (zG) {
            this.f1441o = 0;
            this.f1442p += this.f1443q.f1451c + iJ;
        }
        return zG;
    }

    private boolean j(int i10) {
        return i10 == 1 || i10 == 17;
    }

    private boolean k(C6609I c6609i) {
        int i10 = this.f1438l;
        if ((i10 & 2) == 0) {
            c6609i.b0(c6609i.j());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (c6609i.a() > 0) {
            int i11 = this.f1439m << 8;
            this.f1439m = i11;
            int iM = i11 | c6609i.M();
            this.f1439m = iM;
            if (v.e(iM)) {
                c6609i.b0(c6609i.g() - 3);
                this.f1439m = 0;
                return true;
            }
        }
        return false;
    }

    private void l(C6609I c6609i) {
        int iMin = Math.min(c6609i.a(), this.f1443q.f1451c - this.f1441o);
        this.f1433g.f(c6609i, iMin);
        this.f1441o += iMin;
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) throws C6080L {
        AbstractC6614a.i(this.f1433g);
        while (c6609i.a() > 0) {
            int i10 = this.f1431e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a(c6609i, this.f1428b, false);
                    if (this.f1428b.a() != 0) {
                        this.f1440n = false;
                    } else if (i()) {
                        this.f1428b.b0(0);
                        U2.O o10 = this.f1433g;
                        C6609I c6609i2 = this.f1428b;
                        o10.f(c6609i2, c6609i2.j());
                        this.f1428b.X(2);
                        this.f1430d.X(this.f1443q.f1451c);
                        this.f1440n = true;
                        this.f1431e = 2;
                    } else if (this.f1428b.j() < 15) {
                        C6609I c6609i3 = this.f1428b;
                        c6609i3.a0(c6609i3.j() + 1);
                        this.f1440n = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f1443q.f1449a)) {
                        a(c6609i, this.f1430d, true);
                    }
                    l(c6609i);
                    int i11 = this.f1441o;
                    v.b bVar = this.f1443q;
                    if (i11 == bVar.f1451c) {
                        int i12 = bVar.f1449a;
                        if (i12 == 1) {
                            h(new C6608H(this.f1430d.f()));
                        } else if (i12 == 17) {
                            this.f1446t = v.f(new C6608H(this.f1430d.f()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f1431e = 1;
                    }
                }
            } else if (k(c6609i)) {
                this.f1431e = 1;
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1431e = 0;
        this.f1439m = 0;
        this.f1428b.X(2);
        this.f1441o = 0;
        this.f1442p = 0;
        this.f1444r = -2147483647;
        this.f1445s = -1;
        this.f1446t = 0;
        this.f1447u = -1L;
        this.f1448v = false;
        this.f1436j = false;
        this.f1440n = true;
        this.f1437k = true;
        this.f1434h = -9.223372036854776E18d;
        this.f1435i = -9.223372036854776E18d;
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1432f = dVar.b();
        this.f1433g = rVar.e(dVar.c(), 1);
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1438l = i10;
        if (!this.f1437k && (this.f1442p != 0 || !this.f1440n)) {
            this.f1436j = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f1436j) {
                this.f1435i = j10;
            } else {
                this.f1434h = j10;
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
    }
}
