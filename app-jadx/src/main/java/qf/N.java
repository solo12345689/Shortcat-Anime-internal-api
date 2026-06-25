package qf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class N implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f57998a;

    public N(Function1 function1) {
        this.f57998a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Q.m(this.f57998a, (S) obj);
    }
}
