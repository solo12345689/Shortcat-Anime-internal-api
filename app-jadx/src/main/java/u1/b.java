package U1;

import T1.C2140d;
import T1.InterfaceC2141e;
import Zd.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC2141e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f18877a;

    public b(Function1 produceNewData) {
        AbstractC5504s.h(produceNewData, "produceNewData");
        this.f18877a = produceNewData;
    }

    @Override // T1.InterfaceC2141e
    public Object a(C2140d c2140d, e eVar) {
        return this.f18877a.invoke(c2140d);
    }
}
