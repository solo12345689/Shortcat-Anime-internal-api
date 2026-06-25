package qf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6196k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6206p f58063a;

    public C6196k(AbstractC6206p abstractC6206p) {
        this.f58063a = abstractC6206p;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC6206p.D(this.f58063a, (v0) obj);
    }
}
