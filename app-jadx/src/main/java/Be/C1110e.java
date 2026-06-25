package Be;

import kotlin.jvm.functions.Function1;
import qf.M0;

/* JADX INFO: renamed from: Be.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C1110e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1112g f1773a;

    public C1110e(AbstractC1112g abstractC1112g) {
        this.f1773a = abstractC1112g;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1112g.T0(this.f1773a, (M0) obj);
    }
}
