package E;

import i1.AbstractC5010c;
import i1.C5009b;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: E.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1283d implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f3875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3876b = AbstractC5010c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private E f3878d;

    public C1283d(Function2 function2) {
        this.f3875a = function2;
    }

    @Override // E.F
    public E a(InterfaceC5011d interfaceC5011d, long j10) {
        if (this.f3878d != null && C5009b.f(this.f3876b, j10) && this.f3877c == interfaceC5011d.getDensity()) {
            E e10 = this.f3878d;
            AbstractC5504s.e(e10);
            return e10;
        }
        this.f3876b = j10;
        this.f3877c = interfaceC5011d.getDensity();
        E e11 = (E) this.f3875a.invoke(interfaceC5011d, C5009b.a(j10));
        this.f3878d = e11;
        return e11;
    }
}
