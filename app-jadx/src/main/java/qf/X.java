package qf;

import ie.InterfaceC5082a;
import rf.AbstractC6317g;

/* JADX INFO: loaded from: classes5.dex */
class X implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6317g f58029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y f58030b;

    public X(AbstractC6317g abstractC6317g, Y y10) {
        this.f58029a = abstractC6317g;
        this.f58030b = y10;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return Y.V0(this.f58029a, this.f58030b);
    }
}
