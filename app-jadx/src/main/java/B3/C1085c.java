package B3;

import B3.L;
import U2.AbstractC2241b;
import java.util.Objects;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6608H;
import t2.C6609I;

/* JADX INFO: renamed from: B3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1085c implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6608H f1158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f1159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f1163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private U2.O f1164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f1168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C6109x f1169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f1171n;

    public C1085c(String str) {
        this(null, 0, str);
    }

    private boolean a(C6609I c6609i, byte[] bArr, int i10) {
        int iMin = Math.min(c6609i.a(), i10 - this.f1166i);
        c6609i.q(bArr, this.f1166i, iMin);
        int i11 = this.f1166i + iMin;
        this.f1166i = i11;
        return i11 == i10;
    }

    private void g() {
        this.f1158a.p(0);
        AbstractC2241b.C0321b c0321bF = AbstractC2241b.f(this.f1158a);
        C6109x c6109x = this.f1169l;
        if (c6109x == null || c0321bF.f18980d != c6109x.f56997G || c0321bF.f18979c != c6109x.f56998H || !Objects.equals(c0321bF.f18977a, c6109x.f57022o)) {
            C6109x.b bVarT0 = new C6109x.b().j0(this.f1163f).W(this.f1162e).y0(c0321bF.f18977a).T(c0321bF.f18980d).z0(c0321bF.f18979c).n0(this.f1160c).w0(this.f1161d).t0(c0321bF.f18983g);
            if ("audio/ac3".equals(c0321bF.f18977a)) {
                bVarT0.S(c0321bF.f18983g);
            }
            C6109x c6109xP = bVarT0.P();
            this.f1169l = c6109xP;
            this.f1164g.c(c6109xP);
        }
        this.f1170m = c0321bF.f18981e;
        this.f1168k = (((long) c0321bF.f18982f) * 1000000) / ((long) this.f1169l.f56998H);
    }

    private boolean h(C6609I c6609i) {
        while (true) {
            if (c6609i.a() <= 0) {
                return false;
            }
            if (this.f1167j) {
                int iM = c6609i.M();
                if (iM == 119) {
                    this.f1167j = false;
                    return true;
                }
                this.f1167j = iM == 11;
            } else {
                this.f1167j = c6609i.M() == 11;
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) {
        AbstractC6614a.i(this.f1164g);
        while (c6609i.a() > 0) {
            int i10 = this.f1165h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(c6609i.a(), this.f1170m - this.f1166i);
                        this.f1164g.f(c6609i, iMin);
                        int i11 = this.f1166i + iMin;
                        this.f1166i = i11;
                        if (i11 == this.f1170m) {
                            AbstractC6614a.g(this.f1171n != -9223372036854775807L);
                            this.f1164g.a(this.f1171n, 1, this.f1170m, 0, null);
                            this.f1171n += this.f1168k;
                            this.f1165h = 0;
                        }
                    }
                } else if (a(c6609i, this.f1159b.f(), 128)) {
                    g();
                    this.f1159b.b0(0);
                    this.f1164g.f(this.f1159b, 128);
                    this.f1165h = 2;
                }
            } else if (h(c6609i)) {
                this.f1165h = 1;
                this.f1159b.f()[0] = 11;
                this.f1159b.f()[1] = 119;
                this.f1166i = 2;
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1165h = 0;
        this.f1166i = 0;
        this.f1167j = false;
        this.f1171n = -9223372036854775807L;
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1163f = dVar.b();
        this.f1164g = rVar.e(dVar.c(), 1);
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1171n = j10;
    }

    public C1085c(String str, int i10, String str2) {
        C6608H c6608h = new C6608H(new byte[128]);
        this.f1158a = c6608h;
        this.f1159b = new C6609I(c6608h.f60526a);
        this.f1165h = 0;
        this.f1171n = -9223372036854775807L;
        this.f1160c = str;
        this.f1161d = i10;
        this.f1162e = str2;
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
    }
}
