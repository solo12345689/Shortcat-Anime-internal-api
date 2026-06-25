package qf;

import kotlin.jvm.functions.Function1;
import qf.A0;

/* JADX INFO: loaded from: classes5.dex */
class z0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f58129a;

    public z0(A0 a02) {
        this.f58129a = a02;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return A0.f(this.f58129a, (A0.b) obj);
    }
}
