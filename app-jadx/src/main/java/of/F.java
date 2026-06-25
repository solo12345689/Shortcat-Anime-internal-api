package of;

import ie.InterfaceC5082a;
import of.w;

/* JADX INFO: loaded from: classes5.dex */
class F implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.b f55420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f55421b;

    public F(w.b bVar, w wVar) {
        this.f55420a = bVar;
        this.f55421b = wVar;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return w.b.D(this.f55420a, this.f55421b);
    }
}
