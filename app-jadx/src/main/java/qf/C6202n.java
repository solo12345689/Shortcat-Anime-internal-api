package qf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6202n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6206p f58073a;

    public C6202n(AbstractC6206p abstractC6206p) {
        this.f58073a = abstractC6206p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC6206p.G(this.f58073a, (S) obj);
    }
}
