package G2;

import B3.C1084b;
import B3.C1087e;
import B3.C1090h;
import B3.K;
import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import q2.C6109x;
import r3.r;
import t2.AbstractC6614a;
import t2.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final I f6990f = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC2255p f6991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6109x f6992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f6993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.a f6994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6995e;

    a(InterfaceC2255p interfaceC2255p, C6109x c6109x, O o10, r.a aVar, boolean z10) {
        this.f6991a = interfaceC2255p;
        this.f6992b = c6109x;
        this.f6993c = o10;
        this.f6994d = aVar;
        this.f6995e = z10;
    }

    @Override // G2.f
    public boolean b(InterfaceC2256q interfaceC2256q) {
        return this.f6991a.h(interfaceC2256q, f6990f) == 0;
    }

    @Override // G2.f
    public void c(U2.r rVar) {
        this.f6991a.c(rVar);
    }

    @Override // G2.f
    public void d() {
        this.f6991a.b(0L, 0L);
    }

    @Override // G2.f
    public boolean e() {
        InterfaceC2255p interfaceC2255pI = this.f6991a.i();
        return (interfaceC2255pI instanceof K) || (interfaceC2255pI instanceof o3.h);
    }

    @Override // G2.f
    public boolean f() {
        InterfaceC2255p interfaceC2255pI = this.f6991a.i();
        return (interfaceC2255pI instanceof C1090h) || (interfaceC2255pI instanceof C1084b) || (interfaceC2255pI instanceof C1087e) || (interfaceC2255pI instanceof n3.f);
    }

    @Override // G2.f
    public f g() {
        InterfaceC2255p fVar;
        AbstractC6614a.g(!e());
        AbstractC6614a.h(this.f6991a.i() == this.f6991a, "Can't recreate wrapped extractors. Outer type: " + this.f6991a.getClass());
        InterfaceC2255p interfaceC2255p = this.f6991a;
        if (interfaceC2255p instanceof k) {
            fVar = new k(this.f6992b.f57011d, this.f6993c, this.f6994d, this.f6995e);
        } else if (interfaceC2255p instanceof C1090h) {
            fVar = new C1090h();
        } else if (interfaceC2255p instanceof C1084b) {
            fVar = new C1084b();
        } else if (interfaceC2255p instanceof C1087e) {
            fVar = new C1087e();
        } else {
            if (!(interfaceC2255p instanceof n3.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f6991a.getClass().getSimpleName());
            }
            fVar = new n3.f();
        }
        return new a(fVar, this.f6992b, this.f6993c, this.f6994d, this.f6995e);
    }
}
