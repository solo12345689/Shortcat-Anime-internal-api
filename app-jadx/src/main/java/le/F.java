package Le;

import Le.G;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class F implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f11414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ke.k f11415b;

    public F(G g10, Ke.k kVar) {
        this.f11414a = g10;
        this.f11415b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return G.i0(this.f11414a, this.f11415b, (G.a) obj);
    }
}
