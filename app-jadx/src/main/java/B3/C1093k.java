package B3;

import B3.L;
import U2.AbstractC2254o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C6080L;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.a0;

/* JADX INFO: renamed from: B3.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1093k implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f1230a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f1235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private U2.O f1236g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f1240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C6109x f1241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1243n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1237h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f1246q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f1231b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1244o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1245p = -1;

    public C1093k(String str, int i10, int i11, String str2) {
        this.f1230a = new C6609I(new byte[i11]);
        this.f1232c = str;
        this.f1233d = i10;
        this.f1234e = str2;
    }

    private boolean a(C6609I c6609i, byte[] bArr, int i10) {
        int iMin = Math.min(c6609i.a(), i10 - this.f1238i);
        c6609i.q(bArr, this.f1238i, iMin);
        int i11 = this.f1238i + iMin;
        this.f1238i = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] bArrF = this.f1230a.f();
        if (this.f1241l == null) {
            C6109x c6109xH = AbstractC2254o.h(bArrF, this.f1235f, this.f1232c, this.f1233d, this.f1234e, null);
            this.f1241l = c6109xH;
            this.f1236g.c(c6109xH);
        }
        this.f1242m = AbstractC2254o.b(bArrF);
        this.f1240k = S9.f.e(a0.l1(AbstractC2254o.g(bArrF), this.f1241l.f56998H));
    }

    private void h() throws C6080L {
        AbstractC2254o.b bVarI = AbstractC2254o.i(this.f1230a.f());
        k(bVarI);
        this.f1242m = bVarI.f19089d;
        long j10 = bVarI.f19090e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f1240k = j10;
    }

    private void i() throws C6080L {
        AbstractC2254o.b bVarK = AbstractC2254o.k(this.f1230a.f(), this.f1231b);
        if (this.f1243n == 3) {
            k(bVarK);
        }
        this.f1242m = bVarK.f19089d;
        long j10 = bVarK.f19090e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f1240k = j10;
    }

    private boolean j(C6609I c6609i) {
        while (c6609i.a() > 0) {
            int i10 = this.f1239j << 8;
            this.f1239j = i10;
            int iM = i10 | c6609i.M();
            this.f1239j = iM;
            int iC = AbstractC2254o.c(iM);
            this.f1243n = iC;
            if (iC != 0) {
                byte[] bArrF = this.f1230a.f();
                int i11 = this.f1239j;
                bArrF[0] = (byte) ((i11 >> 24) & 255);
                bArrF[1] = (byte) ((i11 >> 16) & 255);
                bArrF[2] = (byte) ((i11 >> 8) & 255);
                bArrF[3] = (byte) (i11 & 255);
                this.f1238i = 4;
                this.f1239j = 0;
                return true;
            }
        }
        return false;
    }

    private void k(AbstractC2254o.b bVar) {
        int i10;
        int i11 = bVar.f19087b;
        if (i11 == -2147483647 || (i10 = bVar.f19088c) == -1) {
            return;
        }
        C6109x c6109x = this.f1241l;
        if (c6109x != null && i10 == c6109x.f56997G && i11 == c6109x.f56998H && Objects.equals(bVar.f19086a, c6109x.f57022o)) {
            return;
        }
        C6109x c6109x2 = this.f1241l;
        C6109x c6109xP = (c6109x2 == null ? new C6109x.b() : c6109x2.b()).j0(this.f1235f).W(this.f1234e).y0(bVar.f19086a).T(bVar.f19088c).z0(bVar.f19087b).n0(this.f1232c).w0(this.f1233d).P();
        this.f1241l = c6109xP;
        this.f1236g.c(c6109xP);
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) throws C6080L {
        AbstractC6614a.i(this.f1236g);
        while (c6609i.a() > 0) {
            switch (this.f1237h) {
                case 0:
                    if (j(c6609i)) {
                        int i10 = this.f1243n;
                        if (i10 == 3 || i10 == 4) {
                            this.f1237h = 4;
                        } else if (i10 != 1) {
                            this.f1237h = 2;
                        } else {
                            this.f1237h = 1;
                        }
                    }
                    break;
                case 1:
                    if (a(c6609i, this.f1230a.f(), 18)) {
                        g();
                        this.f1230a.b0(0);
                        this.f1236g.f(this.f1230a, 18);
                        this.f1237h = 6;
                    }
                    break;
                case 2:
                    if (a(c6609i, this.f1230a.f(), 7)) {
                        this.f1244o = AbstractC2254o.j(this.f1230a.f());
                        this.f1237h = 3;
                    }
                    break;
                case 3:
                    if (a(c6609i, this.f1230a.f(), this.f1244o)) {
                        h();
                        this.f1230a.b0(0);
                        this.f1236g.f(this.f1230a, this.f1244o);
                        this.f1237h = 6;
                    }
                    break;
                case 4:
                    if (a(c6609i, this.f1230a.f(), 6)) {
                        int iL = AbstractC2254o.l(this.f1230a.f());
                        this.f1245p = iL;
                        int i11 = this.f1238i;
                        if (i11 > iL) {
                            int i12 = i11 - iL;
                            this.f1238i = i11 - i12;
                            c6609i.b0(c6609i.g() - i12);
                        }
                        this.f1237h = 5;
                    }
                    break;
                case 5:
                    if (a(c6609i, this.f1230a.f(), this.f1245p)) {
                        i();
                        this.f1230a.b0(0);
                        this.f1236g.f(this.f1230a, this.f1245p);
                        this.f1237h = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c6609i.a(), this.f1242m - this.f1238i);
                    this.f1236g.f(c6609i, iMin);
                    int i13 = this.f1238i + iMin;
                    this.f1238i = i13;
                    if (i13 == this.f1242m) {
                        AbstractC6614a.g(this.f1246q != -9223372036854775807L);
                        this.f1236g.a(this.f1246q, this.f1243n == 4 ? 0 : 1, this.f1242m, 0, null);
                        this.f1246q += this.f1240k;
                        this.f1237h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1237h = 0;
        this.f1238i = 0;
        this.f1239j = 0;
        this.f1246q = -9223372036854775807L;
        this.f1231b.set(0);
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1235f = dVar.b();
        this.f1236g = rVar.e(dVar.c(), 1);
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1246q = j10;
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
    }
}
