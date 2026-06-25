package Pe;

import Pe.n0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class D implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13827b;

    public D(String str, String str2) {
        this.f13826a = str;
        this.f13827b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return f0.w(this.f13826a, this.f13827b, (n0.a.C0226a) obj);
    }
}
