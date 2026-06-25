package ff;

import kotlin.jvm.functions.Function1;
import ye.InterfaceC7224b;

/* JADX INFO: loaded from: classes5.dex */
class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f47054a;

    public d(boolean z10) {
        this.f47054a = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return e.A(this.f47054a, (InterfaceC7224b) obj);
    }
}
