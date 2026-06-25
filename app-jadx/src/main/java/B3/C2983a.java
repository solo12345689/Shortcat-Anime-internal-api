package b3;

import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.L;
import U2.r;
import t2.C6609I;

/* JADX INFO: renamed from: b3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2983a implements InterfaceC2255p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f33088a = new C6609I(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f33089b = new L(-1, -1, "image/heif");

    private boolean d(InterfaceC2256q interfaceC2256q, int i10) {
        this.f33088a.X(4);
        interfaceC2256q.o(this.f33088a.f(), 0, 4);
        return this.f33088a.O() == ((long) i10);
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f33089b.b(j10, j11);
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f33089b.c(rVar);
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        interfaceC2256q.k(4);
        return d(interfaceC2256q, 1718909296) && d(interfaceC2256q, 1751476579);
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) {
        return this.f33089b.h(interfaceC2256q, i10);
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
