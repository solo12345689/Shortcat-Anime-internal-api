package B3;

import B3.L;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6608H;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1095m f1464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6608H f1465b = new C6608H(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1466c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t2.O f1468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f1475l;

    public y(InterfaceC1095m interfaceC1095m) {
        this.f1464a = interfaceC1095m;
    }

    private boolean e(C6609I c6609i, byte[] bArr, int i10) {
        int iMin = Math.min(c6609i.a(), i10 - this.f1467d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c6609i.c0(iMin);
        } else {
            c6609i.q(bArr, this.f1467d, iMin);
        }
        int i11 = this.f1467d + iMin;
        this.f1467d = i11;
        return i11 == i10;
    }

    private boolean f() {
        this.f1465b.p(0);
        int iH = this.f1465b.h(24);
        if (iH != 1) {
            AbstractC6635w.i("PesReader", "Unexpected start code prefix: " + iH);
            this.f1473j = -1;
            return false;
        }
        this.f1465b.r(8);
        int iH2 = this.f1465b.h(16);
        this.f1465b.r(5);
        this.f1474k = this.f1465b.g();
        this.f1465b.r(2);
        this.f1469f = this.f1465b.g();
        this.f1470g = this.f1465b.g();
        this.f1465b.r(6);
        int iH3 = this.f1465b.h(8);
        this.f1472i = iH3;
        if (iH2 == 0) {
            this.f1473j = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f1473j = i10;
            if (i10 < 0) {
                AbstractC6635w.i("PesReader", "Found negative packet payload size: " + this.f1473j);
                this.f1473j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.f1465b.p(0);
        this.f1475l = -9223372036854775807L;
        if (this.f1469f) {
            this.f1465b.r(4);
            long jH = ((long) this.f1465b.h(3)) << 30;
            this.f1465b.r(1);
            long jH2 = jH | ((long) (this.f1465b.h(15) << 15));
            this.f1465b.r(1);
            long jH3 = jH2 | ((long) this.f1465b.h(15));
            this.f1465b.r(1);
            if (!this.f1471h && this.f1470g) {
                this.f1465b.r(4);
                long jH4 = ((long) this.f1465b.h(3)) << 30;
                this.f1465b.r(1);
                long jH5 = jH4 | ((long) (this.f1465b.h(15) << 15));
                this.f1465b.r(1);
                long jH6 = jH5 | ((long) this.f1465b.h(15));
                this.f1465b.r(1);
                this.f1468e.b(jH6);
                this.f1471h = true;
            }
            this.f1475l = this.f1468e.b(jH3);
        }
    }

    private void h(int i10) {
        this.f1466c = i10;
        this.f1467d = 0;
    }

    @Override // B3.L
    public void a(t2.O o10, U2.r rVar, L.d dVar) {
        this.f1468e = o10;
        this.f1464a.e(rVar, dVar);
    }

    @Override // B3.L
    public void b(C6609I c6609i, int i10) {
        AbstractC6614a.i(this.f1468e);
        if ((i10 & 1) != 0) {
            int i11 = this.f1466c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    AbstractC6635w.i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f1473j != -1) {
                        AbstractC6635w.i("PesReader", "Unexpected start indicator: expected " + this.f1473j + " more bytes");
                    }
                    this.f1464a.d(c6609i.j() == 0);
                }
            }
            h(1);
        }
        while (c6609i.a() > 0) {
            int i12 = this.f1466c;
            if (i12 == 0) {
                c6609i.c0(c6609i.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(c6609i, this.f1465b.f60526a, Math.min(10, this.f1472i)) && e(c6609i, null, this.f1472i)) {
                        g();
                        i10 |= this.f1474k ? 4 : 0;
                        this.f1464a.f(this.f1475l, i10);
                        h(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = c6609i.a();
                    int i13 = this.f1473j;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        c6609i.a0(c6609i.g() + iA);
                    }
                    this.f1464a.b(c6609i);
                    int i15 = this.f1473j;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f1473j = i16;
                        if (i16 == 0) {
                            this.f1464a.d(false);
                            h(1);
                        }
                    }
                }
            } else if (e(c6609i, this.f1465b.f60526a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // B3.L
    public void c() {
        this.f1466c = 0;
        this.f1467d = 0;
        this.f1471h = false;
        this.f1464a.c();
    }

    public boolean d(boolean z10) {
        return this.f1466c == 3 && this.f1473j == -1 && !(z10 && (this.f1464a instanceof C1096n)) && (!z10 || f());
    }
}
