package c3;

import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.L;
import U2.r;

/* JADX INFO: renamed from: c3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3068a implements InterfaceC2255p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2255p f33434a;

    public C3068a(int i10) {
        if ((i10 & 1) != 0) {
            this.f33434a = new L(65496, 2, "image/jpeg");
        } else {
            this.f33434a = new C3069b();
        }
    }

    @Override // U2.InterfaceC2255p
    public void a() {
        this.f33434a.a();
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f33434a.b(j10, j11);
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f33434a.c(rVar);
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        return this.f33434a.f(interfaceC2256q);
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) {
        return this.f33434a.h(interfaceC2256q, i10);
    }
}
