package Ie;

import ie.InterfaceC5082a;

/* JADX INFO: loaded from: classes5.dex */
class b implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ke.k f9079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f9080b;

    public b(Ke.k kVar, c cVar) {
        this.f9079a = kVar;
        this.f9080b = cVar;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return c.g(this.f9079a, this.f9080b);
    }
}
