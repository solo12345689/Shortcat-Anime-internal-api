package He;

import kotlin.jvm.functions.Function1;
import ye.InterfaceC7224b;
import ye.g0;

/* JADX INFO: renamed from: He.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C1658e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f8556a;

    public C1658e(g0 g0Var) {
        this.f8556a = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(C1659f.l(this.f8556a, (InterfaceC7224b) obj));
    }
}
