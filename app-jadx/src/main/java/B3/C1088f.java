package B3;

import B3.L;
import U2.AbstractC2242c;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6608H;
import t2.C6609I;

/* JADX INFO: renamed from: B3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1088f implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6608H f1176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f1177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f1181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private U2.O f1182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f1187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C6109x f1188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1189n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f1190o;

    public C1088f(String str) {
        this(null, 0, str);
    }

    private boolean a(C6609I c6609i, byte[] bArr, int i10) {
        int iMin = Math.min(c6609i.a(), i10 - this.f1184i);
        c6609i.q(bArr, this.f1184i, iMin);
        int i11 = this.f1184i + iMin;
        this.f1184i = i11;
        return i11 == i10;
    }

    private void g() {
        this.f1176a.p(0);
        AbstractC2242c.C0322c c0322cG = AbstractC2242c.g(this.f1176a);
        C6109x c6109x = this.f1188m;
        if (c6109x == null || c0322cG.f18994c != c6109x.f56997G || c0322cG.f18993b != c6109x.f56998H || !"audio/ac4".equals(c6109x.f57022o)) {
            C6109x c6109xP = new C6109x.b().j0(this.f1181f).W(this.f1180e).y0("audio/ac4").T(c0322cG.f18994c).z0(c0322cG.f18993b).n0(this.f1178c).w0(this.f1179d).P();
            this.f1188m = c6109xP;
            this.f1182g.c(c6109xP);
        }
        this.f1189n = c0322cG.f18995d;
        this.f1187l = (((long) c0322cG.f18996e) * 1000000) / ((long) this.f1188m.f56998H);
    }

    private boolean h(C6609I c6609i) {
        int iM;
        while (true) {
            if (c6609i.a() <= 0) {
                return false;
            }
            if (this.f1185j) {
                iM = c6609i.M();
                this.f1185j = iM == 172;
                if (iM == 64 || iM == 65) {
                    break;
                }
            } else {
                this.f1185j = c6609i.M() == 172;
            }
        }
        this.f1186k = iM == 65;
        return true;
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) {
        AbstractC6614a.i(this.f1182g);
        while (c6609i.a() > 0) {
            int i10 = this.f1183h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(c6609i.a(), this.f1189n - this.f1184i);
                        this.f1182g.f(c6609i, iMin);
                        int i11 = this.f1184i + iMin;
                        this.f1184i = i11;
                        if (i11 == this.f1189n) {
                            AbstractC6614a.g(this.f1190o != -9223372036854775807L);
                            this.f1182g.a(this.f1190o, 1, this.f1189n, 0, null);
                            this.f1190o += this.f1187l;
                            this.f1183h = 0;
                        }
                    }
                } else if (a(c6609i, this.f1177b.f(), 16)) {
                    g();
                    this.f1177b.b0(0);
                    this.f1182g.f(this.f1177b, 16);
                    this.f1183h = 2;
                }
            } else if (h(c6609i)) {
                this.f1183h = 1;
                this.f1177b.f()[0] = -84;
                this.f1177b.f()[1] = (byte) (this.f1186k ? 65 : 64);
                this.f1184i = 2;
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1183h = 0;
        this.f1184i = 0;
        this.f1185j = false;
        this.f1186k = false;
        this.f1190o = -9223372036854775807L;
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1181f = dVar.b();
        this.f1182g = rVar.e(dVar.c(), 1);
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1190o = j10;
    }

    public C1088f(String str, int i10, String str2) {
        C6608H c6608h = new C6608H(new byte[16]);
        this.f1176a = c6608h;
        this.f1177b = new C6609I(c6608h.f60526a);
        this.f1183h = 0;
        this.f1184i = 0;
        this.f1185j = false;
        this.f1186k = false;
        this.f1190o = -9223372036854775807L;
        this.f1178c = str;
        this.f1179d = i10;
        this.f1180e = str2;
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
    }
}
