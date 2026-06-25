package B3;

import B3.L;
import U2.AbstractC2241b;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import t2.C6609I;

/* JADX INFO: renamed from: B3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1084b implements InterfaceC2255p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U2.u f1154d = new U2.u() { // from class: B3.a
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return C1084b.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1085c f1155a = new C1085c("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f1156b = new C6609I(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1157c;

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new C1084b()};
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f1157c = false;
        this.f1155a.c();
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        this.f1155a.e(rVar, new L.d(0, 1));
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
            interfaceC2256q.o(c6609i.f(), 0, 6);
            c6609i.b0(0);
            if (c6609i.U() != 2935) {
                interfaceC2256q.g();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC2256q.k(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG = AbstractC2241b.g(c6609i.f());
                if (iG == -1) {
                    return false;
                }
                interfaceC2256q.k(iG - 6);
            }
        }
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, U2.I i10) {
        int i11 = interfaceC2256q.read(this.f1156b.f(), 0, 2786);
        if (i11 == -1) {
            return -1;
        }
        this.f1156b.b0(0);
        this.f1156b.a0(i11);
        if (!this.f1157c) {
            this.f1155a.f(0L, 4);
            this.f1157c = true;
        }
        this.f1155a.b(this.f1156b);
        return 0;
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
