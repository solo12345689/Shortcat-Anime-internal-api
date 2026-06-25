package D3;

import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.L;
import U2.r;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC2255p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f3547a = new C6609I(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f3548b = new L(-1, -1, "image/webp");

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f3548b.b(j10, j11);
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f3548b.c(rVar);
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        this.f3547a.X(4);
        interfaceC2256q.o(this.f3547a.f(), 0, 4);
        if (this.f3547a.O() != 1380533830) {
            return false;
        }
        interfaceC2256q.k(4);
        this.f3547a.X(4);
        interfaceC2256q.o(this.f3547a.f(), 0, 4);
        return this.f3547a.O() == 1464156752;
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) {
        return this.f3548b.h(interfaceC2256q, i10);
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
