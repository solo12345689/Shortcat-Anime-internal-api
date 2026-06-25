package rf;

import ie.InterfaceC5082a;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
class y implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f58804a;

    public y(Set set) {
        this.f58804a = set;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return z.f(this.f58804a);
    }
}
