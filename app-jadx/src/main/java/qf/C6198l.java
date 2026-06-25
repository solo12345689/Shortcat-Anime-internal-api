package qf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6198l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6206p f58066a;

    public C6198l(AbstractC6206p abstractC6206p) {
        this.f58066a = abstractC6206p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC6206p.E(this.f58066a, (S) obj);
    }
}
