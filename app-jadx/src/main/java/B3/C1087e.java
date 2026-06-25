package B3;

import B3.L;
import U2.AbstractC2242c;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import t2.C6609I;

/* JADX INFO: renamed from: B3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1087e implements InterfaceC2255p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U2.u f1172d = new U2.u() { // from class: B3.d
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return C1087e.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1088f f1173a = new C1088f("audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f1174b = new C6609I(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1175c;

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new C1087e()};
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f1175c = false;
        this.f1173a.c();
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        this.f1173a.e(rVar, new L.d(0, 1));
        rVar.p();
        rVar.t(new J.b(-9223372036854775807L));
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        C6609I c6609i = new C6609I(10);
        int i10 = 0;
        while (true) {
            interfaceC2256q.o(c6609i.f(), 0, 10);
            c6609i.b0(0);
            if (c6609i.P() != 4801587) {
                break;
            }
            c6609i.c0(3);
            int iL = c6609i.L();
            i10 += iL + 10;
            interfaceC2256q.k(iL);
        }
        interfaceC2256q.g();
        interfaceC2256q.k(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            interfaceC2256q.o(c6609i.f(), 0, 7);
            c6609i.b0(0);
            int iU = c6609i.U();
            if (iU == 44096 || iU == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iH = AbstractC2242c.h(c6609i.f(), iU);
                if (iH == -1) {
                    return false;
                }
                interfaceC2256q.k(iH - 7);
            } else {
                interfaceC2256q.g();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC2256q.k(i12);
                i11 = 0;
            }
        }
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, U2.I i10) {
        int i11 = interfaceC2256q.read(this.f1174b.f(), 0, 16384);
        if (i11 == -1) {
            return -1;
        }
        this.f1174b.b0(0);
        this.f1174b.a0(i11);
        if (!this.f1175c) {
            this.f1173a.f(0L, 4);
            this.f1175c = true;
        }
        this.f1173a.b(this.f1174b);
        return 0;
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
