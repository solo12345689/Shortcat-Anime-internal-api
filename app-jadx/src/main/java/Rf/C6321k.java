package rf;

import ie.InterfaceC5082a;
import java.util.List;

/* JADX INFO: renamed from: rf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6321k implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f58784a;

    public C6321k(List list) {
        this.f58784a = list;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return n.b(this.f58784a);
    }
}
