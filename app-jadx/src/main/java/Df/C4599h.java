package df;

import kotlin.jvm.functions.Function1;
import ye.H;

/* JADX INFO: renamed from: df.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C4599h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve.l f45155a;

    public C4599h(ve.l lVar) {
        this.f45155a = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C4600i.d(this.f45155a, (H) obj);
    }
}
