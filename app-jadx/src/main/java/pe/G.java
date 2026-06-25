package Pe;

import Pe.n0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class G implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13833b;

    public G(String str, String str2) {
        this.f13832a = str;
        this.f13833b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return f0.z(this.f13832a, this.f13833b, (n0.a.C0226a) obj);
    }
}
