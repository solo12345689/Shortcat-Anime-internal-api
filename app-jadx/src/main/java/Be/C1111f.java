package Be;

import kotlin.jvm.functions.Function1;
import rf.AbstractC6317g;

/* JADX INFO: renamed from: Be.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C1111f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1112g f1774a;

    public C1111f(AbstractC1112g abstractC1112g) {
        this.f1774a = abstractC1112g;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC1112g.N0(this.f1774a, (AbstractC6317g) obj);
    }
}
