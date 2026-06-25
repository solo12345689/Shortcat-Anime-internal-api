package p3;

import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.O;
import U2.r;
import U2.u;
import q2.C6080L;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: renamed from: p3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5923d implements InterfaceC2255p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f55753d = new u() { // from class: p3.c
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return C5923d.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f55754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC5928i f55755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55756c;

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new C5923d()};
    }

    private static C6609I e(C6609I c6609i) {
        c6609i.b0(0);
        return c6609i;
    }

    private boolean g(InterfaceC2256q interfaceC2256q) {
        C5925f c5925f = new C5925f();
        if (c5925f.a(interfaceC2256q, true) && (c5925f.f55763b & 2) == 2) {
            int iMin = Math.min(c5925f.f55770i, 8);
            C6609I c6609i = new C6609I(iMin);
            interfaceC2256q.o(c6609i.f(), 0, iMin);
            if (C5921b.p(e(c6609i))) {
                this.f55755b = new C5921b();
            } else if (C5929j.r(e(c6609i))) {
                this.f55755b = new C5929j();
            } else if (C5927h.o(e(c6609i))) {
                this.f55755b = new C5927h();
            }
            return true;
        }
        return false;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        AbstractC5928i abstractC5928i = this.f55755b;
        if (abstractC5928i != null) {
            abstractC5928i.m(j10, j11);
        }
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f55754a = rVar;
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        try {
            return g(interfaceC2256q);
        } catch (C6080L unused) {
            return false;
        }
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        AbstractC6614a.i(this.f55754a);
        if (this.f55755b == null) {
            if (!g(interfaceC2256q)) {
                throw C6080L.a("Failed to determine bitstream type", null);
            }
            interfaceC2256q.g();
        }
        if (!this.f55756c) {
            O oE = this.f55754a.e(0, 1);
            this.f55754a.p();
            this.f55755b.d(this.f55754a, oE);
            this.f55756c = true;
        }
        return this.f55755b.g(interfaceC2256q, i10);
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
