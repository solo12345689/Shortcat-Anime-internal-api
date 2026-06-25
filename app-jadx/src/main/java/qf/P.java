package qf;

import kotlin.jvm.functions.Function1;
import rf.AbstractC6317g;

/* JADX INFO: loaded from: classes5.dex */
class P implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q f58009a;

    public P(Q q10) {
        this.f58009a = q10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Q.g(this.f58009a, (AbstractC6317g) obj);
    }
}
