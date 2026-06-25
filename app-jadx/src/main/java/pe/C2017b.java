package Pe;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Pe.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C2017b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f13857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2023h[] f13858b;

    public C2017b(r0 r0Var, C2023h[] c2023hArr) {
        this.f13857a = r0Var;
        this.f13858b = c2023hArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC2019d.e(this.f13857a, this.f13858b, ((Number) obj).intValue());
    }
}
