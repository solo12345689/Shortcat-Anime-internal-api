package B3;

import B3.L;
import U2.F;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f1413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F.a f1414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private U2.O f1418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f1419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f1424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f1426n;

    public t(String str) {
        this(null, 0, str);
    }

    private void a(C6609I c6609i) {
        byte[] bArrF = c6609i.f();
        int iJ = c6609i.j();
        for (int iG = c6609i.g(); iG < iJ; iG++) {
            byte b10 = bArrF[iG];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f1423k && (b10 & 224) == 224;
            this.f1423k = z10;
            if (z11) {
                c6609i.b0(iG + 1);
                this.f1423k = false;
                this.f1413a.f()[1] = bArrF[iG];
                this.f1421i = 2;
                this.f1420h = 1;
                return;
            }
        }
        c6609i.b0(iJ);
    }

    private void g(C6609I c6609i) {
        int iMin = Math.min(c6609i.a(), this.f1425m - this.f1421i);
        this.f1418f.f(c6609i, iMin);
        int i10 = this.f1421i + iMin;
        this.f1421i = i10;
        if (i10 < this.f1425m) {
            return;
        }
        AbstractC6614a.g(this.f1426n != -9223372036854775807L);
        this.f1418f.a(this.f1426n, 1, this.f1425m, 0, null);
        this.f1426n += this.f1424l;
        this.f1421i = 0;
        this.f1420h = 0;
    }

    private void h(C6609I c6609i) {
        int iMin = Math.min(c6609i.a(), 4 - this.f1421i);
        c6609i.q(this.f1413a.f(), this.f1421i, iMin);
        int i10 = this.f1421i + iMin;
        this.f1421i = i10;
        if (i10 < 4) {
            return;
        }
        this.f1413a.b0(0);
        if (!this.f1414b.a(this.f1413a.v())) {
            this.f1421i = 0;
            this.f1420h = 1;
            return;
        }
        F.a aVar = this.f1414b;
        this.f1425m = aVar.f18912c;
        if (!this.f1422j) {
            this.f1424l = (((long) aVar.f18916g) * 1000000) / ((long) aVar.f18913d);
            this.f1418f.c(new C6109x.b().j0(this.f1419g).W(this.f1417e).y0(this.f1414b.f18911b).o0(4096).T(this.f1414b.f18914e).z0(this.f1414b.f18913d).n0(this.f1415c).w0(this.f1416d).P());
            this.f1422j = true;
        }
        this.f1413a.b0(0);
        this.f1418f.f(this.f1413a, 4);
        this.f1420h = 2;
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) {
        AbstractC6614a.i(this.f1418f);
        while (c6609i.a() > 0) {
            int i10 = this.f1420h;
            if (i10 == 0) {
                a(c6609i);
            } else if (i10 == 1) {
                h(c6609i);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(c6609i);
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1420h = 0;
        this.f1421i = 0;
        this.f1423k = false;
        this.f1426n = -9223372036854775807L;
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1419g = dVar.b();
        this.f1418f = rVar.e(dVar.c(), 1);
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1426n = j10;
    }

    public t(String str, int i10, String str2) {
        this.f1420h = 0;
        C6609I c6609i = new C6609I(4);
        this.f1413a = c6609i;
        c6609i.f()[0] = -1;
        this.f1414b = new F.a();
        this.f1426n = -9223372036854775807L;
        this.f1415c = str;
        this.f1416d = i10;
        this.f1417e = str2;
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
    }
}
