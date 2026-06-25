package Me;

import kotlin.jvm.functions.Function1;
import qf.AbstractC6183d0;
import rf.AbstractC6317g;
import ye.InterfaceC7227e;

/* JADX INFO: loaded from: classes5.dex */
class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7227e f12420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f12421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6183d0 f12422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f12423d;

    public h(InterfaceC7227e interfaceC7227e, i iVar, AbstractC6183d0 abstractC6183d0, a aVar) {
        this.f12420a = interfaceC7227e;
        this.f12421b = iVar;
        this.f12422c = abstractC6183d0;
        this.f12423d = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return i.k(this.f12420a, this.f12421b, this.f12422c, this.f12423d, (AbstractC6317g) obj);
    }
}
