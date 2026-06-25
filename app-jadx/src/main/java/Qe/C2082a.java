package Qe;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C2082a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2085d f14828a;

    public C2082a(AbstractC2085d abstractC2085d) {
        this.f14828a = abstractC2085d;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC2085d.L(this.f14828a, (x) obj);
    }
}
