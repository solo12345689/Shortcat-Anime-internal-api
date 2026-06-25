package of;

import ie.InterfaceC5082a;
import of.w;

/* JADX INFO: loaded from: classes5.dex */
class K implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.c f55427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f55428b;

    public K(w.c cVar, w wVar) {
        this.f55427a = cVar;
        this.f55428b = wVar;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return w.c.p(this.f55427a, this.f55428b);
    }
}
