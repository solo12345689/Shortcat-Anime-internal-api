package Le;

import Be.AbstractC1107b;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.I0;
import qf.N0;
import ye.InterfaceC7235m;
import ye.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends AbstractC1107b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Ke.k f11479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Oe.y f11480l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Ke.k c10, Oe.y javaTypeParameter, int i10, InterfaceC7235m containingDeclaration) {
        super(c10.e(), containingDeclaration, new Ke.g(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), N0.f57999e, false, i10, h0.f65112a, c10.a().v());
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(javaTypeParameter, "javaTypeParameter");
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        this.f11479k = c10;
        this.f11480l = javaTypeParameter;
    }

    private final List M0() {
        Collection upperBounds = this.f11480l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            AbstractC6183d0 abstractC6183d0I = this.f11479k.d().n().i();
            AbstractC5504s.g(abstractC6183d0I, "getAnyType(...)");
            AbstractC6183d0 abstractC6183d0J = this.f11479k.d().n().J();
            AbstractC5504s.g(abstractC6183d0J, "getNullableAnyType(...)");
            return AbstractC2279u.e(qf.V.e(abstractC6183d0I, abstractC6183d0J));
        }
        Collection collection = upperBounds;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f11479k.g().p((Oe.j) it.next(), Me.b.b(I0.f57982b, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // Be.AbstractC1113h
    protected List H0(List bounds) {
        AbstractC5504s.h(bounds, "bounds");
        return this.f11479k.a().r().r(this, bounds, this.f11479k);
    }

    @Override // Be.AbstractC1113h
    protected void K0(qf.S type) {
        AbstractC5504s.h(type, "type");
    }

    @Override // Be.AbstractC1113h
    protected List L0() {
        return M0();
    }
}
