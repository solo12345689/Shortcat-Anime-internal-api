package B3;

import B3.L;
import U2.C2248i;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import java.io.EOFException;
import q2.C6080L;
import t2.AbstractC6614a;
import t2.C6608H;
import t2.C6609I;

/* JADX INFO: renamed from: B3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1090h implements InterfaceC2255p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final U2.u f1191m = new U2.u() { // from class: B3.g
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return C1090h.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1091i f1193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f1194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6609I f1195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6608H f1196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private U2.r f1197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1203l;

    public C1090h() {
        this(0);
    }

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new C1090h()};
    }

    private void e(InterfaceC2256q interfaceC2256q) throws C6080L {
        int iH;
        if (this.f1201j) {
            return;
        }
        this.f1200i = -1;
        interfaceC2256q.g();
        long j10 = 0;
        if (interfaceC2256q.getPosition() == 0) {
            m(interfaceC2256q);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!interfaceC2256q.e(this.f1195d.f(), 0, 2, true)) {
                    break;
                }
                this.f1195d.b0(0);
                if (!C1091i.m(this.f1195d.U())) {
                    break;
                }
                if (!interfaceC2256q.e(this.f1195d.f(), 0, 4, true)) {
                    break;
                }
                this.f1196e.p(14);
                iH = this.f1196e.h(13);
                if (iH <= 6) {
                    this.f1201j = true;
                    throw C6080L.a("Malformed ADTS stream", null);
                }
                j10 += (long) iH;
                i11++;
                if (i11 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC2256q.n(iH - 6, true));
        i10 = i11;
        interfaceC2256q.g();
        if (i10 > 0) {
            this.f1200i = (int) (j10 / ((long) i10));
        } else {
            this.f1200i = -1;
        }
        this.f1201j = true;
    }

    private static int g(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private U2.J j(long j10, boolean z10) {
        return new C2248i(j10, this.f1199h, g(this.f1200i, this.f1193b.k()), this.f1200i, z10);
    }

    private void k(long j10, boolean z10) {
        if (this.f1203l) {
            return;
        }
        boolean z11 = (this.f1192a & 1) != 0 && this.f1200i > 0;
        if (z11 && this.f1193b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f1193b.k() == -9223372036854775807L) {
            this.f1197f.t(new J.b(-9223372036854775807L));
        } else {
            this.f1197f.t(j(j10, (this.f1192a & 2) != 0));
        }
        this.f1203l = true;
    }

    private int m(InterfaceC2256q interfaceC2256q) {
        int i10 = 0;
        while (true) {
            interfaceC2256q.o(this.f1195d.f(), 0, 10);
            this.f1195d.b0(0);
            if (this.f1195d.P() != 4801587) {
                break;
            }
            this.f1195d.c0(3);
            int iL = this.f1195d.L();
            i10 += iL + 10;
            interfaceC2256q.k(iL);
        }
        interfaceC2256q.g();
        interfaceC2256q.k(i10);
        if (this.f1199h == -1) {
            this.f1199h = i10;
        }
        return i10;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f1202k = false;
        this.f1193b.c();
        this.f1198g = j11;
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        this.f1197f = rVar;
        this.f1193b.e(rVar, new L.d(0, 1));
        rVar.p();
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        int iM = m(interfaceC2256q);
        int i10 = iM;
        int i11 = 0;
        int i12 = 0;
        do {
            interfaceC2256q.o(this.f1195d.f(), 0, 2);
            this.f1195d.b0(0);
            if (C1091i.m(this.f1195d.U())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                interfaceC2256q.o(this.f1195d.f(), 0, 4);
                this.f1196e.p(14);
                int iH = this.f1196e.h(13);
                if (iH <= 6) {
                    i10++;
                    interfaceC2256q.g();
                    interfaceC2256q.k(i10);
                } else {
                    interfaceC2256q.k(iH - 6);
                    i12 += iH;
                }
            } else {
                i10++;
                interfaceC2256q.g();
                interfaceC2256q.k(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iM < 8192);
        return false;
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, U2.I i10) throws C6080L {
        AbstractC6614a.i(this.f1197f);
        long length = interfaceC2256q.getLength();
        int i11 = this.f1192a;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && length != -1)) {
            e(interfaceC2256q);
        }
        int i12 = interfaceC2256q.read(this.f1194c.f(), 0, 2048);
        boolean z10 = i12 == -1;
        k(length, z10);
        if (z10) {
            return -1;
        }
        this.f1194c.b0(0);
        this.f1194c.a0(i12);
        if (!this.f1202k) {
            this.f1193b.f(this.f1198g, 4);
            this.f1202k = true;
        }
        this.f1193b.b(this.f1194c);
        return 0;
    }

    public C1090h(int i10) {
        this.f1192a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f1193b = new C1091i(true, "audio/mp4a-latm");
        this.f1194c = new C6609I(2048);
        this.f1200i = -1;
        this.f1199h = -1L;
        C6609I c6609i = new C6609I(10);
        this.f1195d = c6609i;
        this.f1196e = new C6608H(c6609i.f());
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
