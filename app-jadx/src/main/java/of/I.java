package of;

import kotlin.jvm.functions.Function1;
import of.w;

/* JADX INFO: loaded from: classes5.dex */
class I implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.c f55425a;

    public I(w.c cVar) {
        this.f55425a = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return w.c.s(this.f55425a, (Xe.f) obj);
    }
}
