package Pe;

import Pe.AbstractC2019d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Pe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C2016a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2019d f13854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC2019d.a f13855b;

    public C2016a(AbstractC2019d abstractC2019d, AbstractC2019d.a aVar) {
        this.f13854a = abstractC2019d;
        this.f13855b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractC2019d.i(this.f13854a, this.f13855b, obj));
    }
}
