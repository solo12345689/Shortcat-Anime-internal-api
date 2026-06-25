package Pe;

import Pe.AbstractC2019d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Pe.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C2018c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2019d f13860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uf.r f13861b;

    public C2018c(AbstractC2019d abstractC2019d, uf.r rVar) {
        this.f13860a = abstractC2019d;
        this.f13861b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC2019d.I(this.f13860a, this.f13861b, (AbstractC2019d.a) obj);
    }
}
