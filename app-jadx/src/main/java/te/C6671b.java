package te;

import ie.InterfaceC5082a;
import java.util.Map;

/* JADX INFO: renamed from: te.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6671b implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f60917a;

    public C6671b(Map map) {
        this.f60917a = map;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return Integer.valueOf(f.j(this.f60917a));
    }
}
