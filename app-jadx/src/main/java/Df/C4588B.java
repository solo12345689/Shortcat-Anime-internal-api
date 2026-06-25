package df;

import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.S;
import ve.o;
import ye.AbstractC7246y;
import ye.H;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: df.B */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4588B extends AbstractC4591E {
    public C4588B(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // df.AbstractC4598g
    public S a(H module) {
        AbstractC6183d0 abstractC6183d0P;
        AbstractC5504s.h(module, "module");
        InterfaceC7227e interfaceC7227eB = AbstractC7246y.b(module, o.a.f62194F0);
        return (interfaceC7227eB == null || (abstractC6183d0P = interfaceC7227eB.p()) == null) ? sf.l.d(sf.k.f59667V0, "UInt") : abstractC6183d0P;
    }

    @Override // df.AbstractC4598g
    public String toString() {
        return ((Number) b()).intValue() + ".toUInt()";
    }
}
