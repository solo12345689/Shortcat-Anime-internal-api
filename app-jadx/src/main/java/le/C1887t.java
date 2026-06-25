package Le;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Le.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C1887t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1893z f11529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ke.k f11530b;

    public C1887t(C1893z c1893z, Ke.k kVar) {
        this.f11529a = c1893z;
        this.f11530b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C1893z.i1(this.f11529a, this.f11530b, (Xe.f) obj);
    }
}
