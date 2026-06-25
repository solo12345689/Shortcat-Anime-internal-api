package ze;

import kotlin.jvm.functions.Function1;
import ye.H;

/* JADX INFO: renamed from: ze.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C7372f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve.i f66217a;

    public C7372f(ve.i iVar) {
        this.f66217a = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractC7373g.d(this.f66217a, (H) obj);
    }
}
