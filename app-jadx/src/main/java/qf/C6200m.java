package qf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6200m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6206p f58068a;

    public C6200m(AbstractC6206p abstractC6206p) {
        this.f58068a = abstractC6206p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC6206p.F(this.f58068a, (v0) obj);
    }
}
