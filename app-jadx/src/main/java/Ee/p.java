package Ee;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f5946a;

    public p(q qVar) {
        this.f5946a = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(q.S(this.f5946a, (Method) obj));
    }
}
