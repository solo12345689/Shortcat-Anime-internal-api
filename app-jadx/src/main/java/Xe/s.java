package xe;

import kotlin.jvm.functions.Function1;
import ye.InterfaceC7224b;

/* JADX INFO: loaded from: classes5.dex */
class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f64433a;

    public s(u uVar) {
        this.f64433a = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return u.G(this.f64433a, (InterfaceC7224b) obj);
    }
}
