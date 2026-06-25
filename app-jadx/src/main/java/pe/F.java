package Pe;

import Pe.n0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class F implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13831b;

    public F(String str, String str2) {
        this.f13830a = str;
        this.f13831b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return f0.y(this.f13830a, this.f13831b, (n0.a.C0226a) obj);
    }
}
