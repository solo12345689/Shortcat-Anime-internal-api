package mf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class S implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f53390a;

    public S(X x10) {
        this.f53390a = x10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return X.f(this.f53390a, ((Number) obj).intValue());
    }
}
