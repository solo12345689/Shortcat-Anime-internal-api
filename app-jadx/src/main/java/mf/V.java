package mf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class V implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f53394a;

    public V(X x10) {
        this.f53394a = x10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return X.z(this.f53394a, (Se.r) obj);
    }
}
