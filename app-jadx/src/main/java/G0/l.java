package g0;

import Y.C2456w1;
import Y.InterfaceC2453v1;
import a0.C2507c;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements InterfaceC2453v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f47192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2507c f47193b = new C2507c(new C2456w1[16], 0);

    public l(Set set) {
        this.f47192a = set;
    }

    public final C2507c a() {
        return this.f47193b;
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
        C2507c c2507c = this.f47193b;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        for (int i10 = 0; i10 < iP; i10++) {
            InterfaceC2453v1 interfaceC2453v1B = ((C2456w1) objArr[i10]).b();
            this.f47192a.remove(interfaceC2453v1B);
            interfaceC2453v1B.c();
        }
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
    }
}
