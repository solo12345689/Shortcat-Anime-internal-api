package mf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class T implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f53391a;

    public T(X x10) {
        this.f53391a = x10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return X.v(this.f53391a, ((Number) obj).intValue());
    }
}
