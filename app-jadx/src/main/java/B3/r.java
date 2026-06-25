package B3;

import B3.L;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1383a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U2.O f1385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1386d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1389g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f1384b = new C6609I(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f1387e = -9223372036854775807L;

    public r(String str) {
        this.f1383a = str;
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) {
        AbstractC6614a.i(this.f1385c);
        if (this.f1386d) {
            int iA = c6609i.a();
            int i10 = this.f1389g;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(c6609i.f(), c6609i.g(), this.f1384b.f(), this.f1389g, iMin);
                if (this.f1389g + iMin == 10) {
                    this.f1384b.b0(0);
                    if (73 != this.f1384b.M() || 68 != this.f1384b.M() || 51 != this.f1384b.M()) {
                        AbstractC6635w.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f1386d = false;
                        return;
                    } else {
                        this.f1384b.c0(3);
                        this.f1388f = this.f1384b.L() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f1388f - this.f1389g);
            this.f1385c.f(c6609i, iMin2);
            this.f1389g += iMin2;
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1386d = false;
        this.f1387e = -9223372036854775807L;
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
        int i10;
        AbstractC6614a.i(this.f1385c);
        if (this.f1386d && (i10 = this.f1388f) != 0 && this.f1389g == i10) {
            AbstractC6614a.g(this.f1387e != -9223372036854775807L);
            this.f1385c.a(this.f1387e, 1, this.f1388f, 0, null);
            this.f1386d = false;
        }
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        U2.O oE = rVar.e(dVar.c(), 5);
        this.f1385c = oE;
        oE.c(new C6109x.b().j0(dVar.b()).W(this.f1383a).y0("application/id3").P());
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f1386d = true;
        this.f1387e = j10;
        this.f1388f = 0;
        this.f1389g = 0;
    }
}
