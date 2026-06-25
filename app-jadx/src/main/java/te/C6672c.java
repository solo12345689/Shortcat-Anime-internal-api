package te;

import ie.InterfaceC5082a;
import java.util.Map;

/* JADX INFO: renamed from: te.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6672c implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f60918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f60919b;

    public C6672c(Class cls, Map map) {
        this.f60918a = cls;
        this.f60919b = map;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return f.l(this.f60918a, this.f60919b);
    }
}
