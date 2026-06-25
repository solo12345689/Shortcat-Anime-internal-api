package G;

import F.AbstractC1542m;
import F.G;
import F.InterfaceC1533d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class p extends AbstractC1542m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ie.p f6890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f6891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1533d f6893d;

    public p(ie.p pVar, Function1 function1, int i10) {
        this.f6890a = pVar;
        this.f6891b = function1;
        this.f6892c = i10;
        G g10 = new G();
        g10.b(i10, new l(function1, pVar));
        this.f6893d = g10;
    }

    @Override // F.AbstractC1542m
    public InterfaceC1533d g() {
        return this.f6893d;
    }
}
