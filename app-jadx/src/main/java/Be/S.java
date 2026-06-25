package Be;

import ie.InterfaceC5082a;
import ye.InterfaceC7226d;

/* JADX INFO: loaded from: classes5.dex */
class S implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f1740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7226d f1741b;

    public S(T t10, InterfaceC7226d interfaceC7226d) {
        this.f1740a = t10;
        this.f1741b = interfaceC7226d;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return T.r1(this.f1740a, this.f1741b);
    }
}
