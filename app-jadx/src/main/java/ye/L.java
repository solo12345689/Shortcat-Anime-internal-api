package ye;

import kotlin.jvm.functions.Function1;
import ye.M;

/* JADX INFO: loaded from: classes5.dex */
class L implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M f65070a;

    public L(M m10) {
        this.f65070a = m10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return M.c(this.f65070a, (M.a) obj);
    }
}
