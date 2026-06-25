package B3;

import B3.L;
import U2.AbstractC2240a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Collections;
import q2.C6080L;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6608H;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6609I f1393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6608H f1394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private U2.O f1395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f1396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C6109x f1397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f1402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f1408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f1410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f1412w;

    public s(String str, int i10, String str2) {
        this.f1390a = str;
        this.f1391b = i10;
        this.f1392c = str2;
        C6609I c6609i = new C6609I(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        this.f1393d = c6609i;
        this.f1394e = new C6608H(c6609i.f());
        this.f1402m = -9223372036854775807L;
    }

    private static long a(C6608H c6608h) {
        return c6608h.h((c6608h.h(2) + 1) * 8);
    }

    private void g(C6608H c6608h) throws C6080L {
        if (!c6608h.g()) {
            this.f1403n = true;
            l(c6608h);
        } else if (!this.f1403n) {
            return;
        }
        if (this.f1404o != 0) {
            throw C6080L.a(null, null);
        }
        if (this.f1405p != 0) {
            throw C6080L.a(null, null);
        }
        k(c6608h, j(c6608h));
        if (this.f1407r) {
            c6608h.r((int) this.f1408s);
        }
    }

    private int h(C6608H c6608h) throws C6080L {
        int iB = c6608h.b();
        AbstractC2240a.b bVarD = AbstractC2240a.d(c6608h, true);
        this.f1412w = bVarD.f18970c;
        this.f1409t = bVarD.f18968a;
        this.f1411v = bVarD.f18969b;
        return iB - c6608h.b();
    }

    private void i(C6608H c6608h) {
        int iH = c6608h.h(3);
        this.f1406q = iH;
        if (iH == 0) {
            c6608h.r(8);
            return;
        }
        if (iH == 1) {
            c6608h.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            c6608h.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            c6608h.r(1);
        }
    }

    private int j(C6608H c6608h) throws C6080L {
        int iH;
        if (this.f1406q != 0) {
            throw C6080L.a(null, null);
        }
        int i10 = 0;
        do {
            iH = c6608h.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    private void k(C6608H c6608h, int i10) {
        int iE = c6608h.e();
        if ((iE & 7) == 0) {
            this.f1393d.b0(iE >> 3);
        } else {
            c6608h.i(this.f1393d.f(), 0, i10 * 8);
            this.f1393d.b0(0);
        }
        this.f1395f.f(this.f1393d, i10);
        AbstractC6614a.g(this.f1402m != -9223372036854775807L);
        this.f1395f.a(this.f1402m, 1, i10, 0, null);
        this.f1402m += this.f1410u;
    }

    private void l(C6608H c6608h) throws C6080L {
        boolean zG;
        int iH = c6608h.h(1);
        int iH2 = iH == 1 ? c6608h.h(1) : 0;
        this.f1404o = iH2;
        if (iH2 != 0) {
            throw C6080L.a(null, null);
        }
        if (iH == 1) {
            a(c6608h);
        }
        if (!c6608h.g()) {
            throw C6080L.a(null, null);
        }
        this.f1405p = c6608h.h(6);
        int iH3 = c6608h.h(4);
        int iH4 = c6608h.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw C6080L.a(null, null);
        }
        if (iH == 0) {
            int iE = c6608h.e();
            int iH5 = h(c6608h);
            c6608h.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            c6608h.i(bArr, 0, iH5);
            C6109x c6109xP = new C6109x.b().j0(this.f1396g).W(this.f1392c).y0("audio/mp4a-latm").U(this.f1412w).T(this.f1411v).z0(this.f1409t).k0(Collections.singletonList(bArr)).n0(this.f1390a).w0(this.f1391b).P();
            if (!c6109xP.equals(this.f1397h)) {
                this.f1397h = c6109xP;
                this.f1410u = 1024000000 / ((long) c6109xP.f56998H);
                this.f1395f.c(c6109xP);
            }
        } else {
            c6608h.r(((int) a(c6608h)) - h(c6608h));
        }
        i(c6608h);
        boolean zG2 = c6608h.g();
        this.f1407r = zG2;
        this.f1408s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f1408s = a(c6608h);
            } else {
                do {
                    zG = c6608h.g();
                    this.f1408s = (this.f1408s << 8) + ((long) c6608h.h(8));
                } while (zG);
            }
        }
        if (c6608h.g()) {
            c6608h.r(8);
        }
    }

    private void m(int i10) {
        this.f1393d.X(i10);
        this.f1394e.n(this.f1393d.f());
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) throws C6080L {
        AbstractC6614a.i(this.f1395f);
        while (c6609i.a() > 0) {
            int i10 = this.f1398i;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iM = c6609i.M();
                    if ((iM & 224) == 224) {
                        this.f1401l = iM;
                        this.f1398i = 2;
                    } else if (iM != 86) {
                        this.f1398i = 0;
                    }
                } else if (i10 == 2) {
                    int iM2 = ((this.f1401l & (-225)) << 8) | c6609i.M();
                    this.f1400k = iM2;
                    if (iM2 > this.f1393d.f().length) {
                        m(this.f1400k);
                    }
                    this.f1399j = 0;
                    this.f1398i = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(c6609i.a(), this.f1400k - this.f1399j);
                    c6609i.q(this.f1394e.f60526a, this.f1399j, iMin);
                    int i11 = this.f1399j + iMin;
                    this.f1399j = i11;
                    if (i11 == this.f1400k) {
                        this.f1394e.p(0);
                        g(this.f1394e);
                        this.f1398i = 0;
                    }
                }
            } else if (c6609i.M() == 86) {
                this.f1398i = 1;
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1398i = 0;
        this.f1402m = -9223372036854775807L;
        this.f1403n = false;
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1395f = rVar.e(dVar.c(), 1);
        this.f1396g = dVar.b();
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1402m = j10;
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
    }
}
