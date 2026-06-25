package Le;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Le.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C1869a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1870b f11466a;

    public C1869a(C1870b c1870b) {
        this.f11466a = c1870b;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(C1870b.h(this.f11466a, (Oe.r) obj));
    }
}
