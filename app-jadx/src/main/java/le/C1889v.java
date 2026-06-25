package Le;

import kotlin.jvm.functions.Function1;
import ye.g0;

/* JADX INFO: renamed from: Le.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C1889v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f11532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1893z f11533b;

    public C1889v(g0 g0Var, C1893z c1893z) {
        this.f11532a = g0Var;
        this.f11533b = c1893z;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C1893z.g1(this.f11532a, this.f11533b, (Xe.f) obj);
    }
}
