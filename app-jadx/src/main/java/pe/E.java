package Pe;

import Pe.n0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class E implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13829b;

    public E(String str, String str2) {
        this.f13828a = str;
        this.f13829b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return f0.x(this.f13828a, this.f13829b, (n0.a.C0226a) obj);
    }
}
