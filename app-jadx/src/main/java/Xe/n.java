package xe;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f64427a;

    public n(u uVar) {
        this.f64427a = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return u.s(this.f64427a, (Pair) obj);
    }
}
