package Pe;

import Pe.n0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class M implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13841b;

    public M(String str, String str2) {
        this.f13840a = str;
        this.f13841b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return f0.E(this.f13840a, this.f13841b, (n0.a.C0226a) obj);
    }
}
