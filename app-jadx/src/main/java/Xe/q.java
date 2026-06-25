package xe;

import Le.C1882n;
import ie.InterfaceC5082a;
import ye.InterfaceC7227e;

/* JADX INFO: loaded from: classes5.dex */
class q implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1882n f64430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7227e f64431b;

    public q(C1882n c1882n, InterfaceC7227e interfaceC7227e) {
        this.f64430a = c1882n;
        this.f64431b = interfaceC7227e;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return u.u(this.f64430a, this.f64431b);
    }
}
