package X2;

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
    private final C6609I f21624a = new C6609I(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f21625b = new L(-1, -1, "image/avif");

    private boolean d(InterfaceC2256q interfaceC2256q, int i10) {
        this.f21624a.X(4);
        interfaceC2256q.o(this.f21624a.f(), 0, 4);
        return this.f21624a.O() == ((long) i10);
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f21625b.b(j10, j11);
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f21625b.c(rVar);
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        interfaceC2256q.k(4);
        return d(interfaceC2256q, 1718909296) && d(interfaceC2256q, 1635150182);
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) {
        return this.f21625b.h(interfaceC2256q, i10);
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
