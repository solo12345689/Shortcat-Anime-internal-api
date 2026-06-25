package ye;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.c f65081a;

    public Q(Xe.c cVar) {
        this.f65081a = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(S.g(this.f65081a, (Xe.c) obj));
    }
}
