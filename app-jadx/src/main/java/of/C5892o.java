package of;

import kotlin.jvm.functions.Function1;
import of.C5890m;

/* JADX INFO: renamed from: of.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C5892o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5890m.c f55506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5890m f55507b;

    public C5892o(C5890m.c cVar, C5890m c5890m) {
        this.f55506a = cVar;
        this.f55507b = c5890m;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C5890m.c.f(this.f55506a, this.f55507b, (Xe.f) obj);
    }
}
