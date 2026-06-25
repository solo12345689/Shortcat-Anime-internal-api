package Be;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import qf.G0;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.InterfaceC7247z;
import ye.c0;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1114i extends AbstractC1123s implements InterfaceC7226d {

    /* JADX INFO: renamed from: E */
    protected final boolean f1796E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C1114i(InterfaceC7227e interfaceC7227e, InterfaceC7234l interfaceC7234l, InterfaceC7374h interfaceC7374h, boolean z10, InterfaceC7224b.a aVar, h0 h0Var) {
        super(interfaceC7227e, interfaceC7234l, interfaceC7374h, Xe.h.f21789j, aVar, h0Var);
        if (interfaceC7227e == null) {
            T(0);
        }
        if (interfaceC7374h == null) {
            T(1);
        }
        if (aVar == null) {
            T(2);
        }
        if (h0Var == null) {
            T(3);
        }
        this.f1796E = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void T(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.C1114i.T(int):void");
    }

    private List k1() {
        InterfaceC7227e interfaceC7227eB = b();
        if (interfaceC7227eB.Z().isEmpty()) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                T(16);
            }
            return list;
        }
        List listZ = interfaceC7227eB.Z();
        if (listZ == null) {
            T(15);
        }
        return listZ;
    }

    public static C1114i n1(InterfaceC7227e interfaceC7227e, InterfaceC7374h interfaceC7374h, boolean z10, h0 h0Var) {
        if (interfaceC7227e == null) {
            T(4);
        }
        if (interfaceC7374h == null) {
            T(5);
        }
        if (h0Var == null) {
            T(6);
        }
        return new C1114i(interfaceC7227e, null, interfaceC7374h, z10, InterfaceC7224b.a.DECLARATION, h0Var);
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7224b
    public void E0(Collection collection) {
        if (collection == null) {
            T(22);
        }
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return interfaceC7237o.m(this, obj);
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7247z, ye.InterfaceC7224b
    public Collection e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            T(21);
        }
        return set;
    }

    @Override // ye.InterfaceC7234l
    public boolean e0() {
        return this.f1796E;
    }

    @Override // ye.InterfaceC7234l
    public InterfaceC7227e f0() {
        InterfaceC7227e interfaceC7227eB = b();
        if (interfaceC7227eB == null) {
            T(18);
        }
        return interfaceC7227eB;
    }

    public c0 l1() {
        InterfaceC7227e interfaceC7227eB = b();
        if (!interfaceC7227eB.A()) {
            return null;
        }
        InterfaceC7235m interfaceC7235mB = interfaceC7227eB.b();
        if (interfaceC7235mB instanceof InterfaceC7227e) {
            return ((InterfaceC7227e) interfaceC7235mB).J0();
        }
        return null;
    }

    @Override // ye.InterfaceC7224b
    /* JADX INFO: renamed from: m1 */
    public InterfaceC7226d l0(InterfaceC7235m interfaceC7235m, ye.E e10, AbstractC7242u abstractC7242u, InterfaceC7224b.a aVar, boolean z10) {
        InterfaceC7226d interfaceC7226d = (InterfaceC7226d) super.K0(interfaceC7235m, e10, abstractC7242u, aVar, z10);
        if (interfaceC7226d == null) {
            T(27);
        }
        return interfaceC7226d;
    }

    @Override // Be.AbstractC1123s
    /* JADX INFO: renamed from: o1 */
    public C1114i L0(InterfaceC7235m interfaceC7235m, InterfaceC7247z interfaceC7247z, InterfaceC7224b.a aVar, Xe.f fVar, InterfaceC7374h interfaceC7374h, h0 h0Var) {
        if (interfaceC7235m == null) {
            T(23);
        }
        if (aVar == null) {
            T(24);
        }
        if (interfaceC7374h == null) {
            T(25);
        }
        if (h0Var == null) {
            T(26);
        }
        InterfaceC7224b.a aVar2 = InterfaceC7224b.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC7224b.a.SYNTHESIZED) {
            return new C1114i((InterfaceC7227e) interfaceC7235m, this, interfaceC7374h, this.f1796E, aVar2, h0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC7235m + "\nkind: " + aVar);
    }

    @Override // Be.AbstractC1119n, ye.InterfaceC7235m
    /* JADX INFO: renamed from: p1 */
    public InterfaceC7227e b() {
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) super.b();
        if (interfaceC7227e == null) {
            T(17);
        }
        return interfaceC7227e;
    }

    public C1114i q1(List list, AbstractC7242u abstractC7242u) {
        if (list == null) {
            T(13);
        }
        if (abstractC7242u == null) {
            T(14);
        }
        r1(list, abstractC7242u, b().q());
        return this;
    }

    public C1114i r1(List list, AbstractC7242u abstractC7242u, List list2) {
        if (list == null) {
            T(10);
        }
        if (abstractC7242u == null) {
            T(11);
        }
        if (list2 == null) {
            T(12);
        }
        super.R0(null, l1(), k1(), list2, list, null, ye.E.f65060b, abstractC7242u);
        return this;
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7247z, ye.j0
    public InterfaceC7226d c(G0 g02) {
        if (g02 == null) {
            T(20);
        }
        return (InterfaceC7226d) super.c(g02);
    }

    @Override // Be.AbstractC1123s, Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public InterfaceC7226d a() {
        InterfaceC7226d interfaceC7226d = (InterfaceC7226d) super.a();
        if (interfaceC7226d == null) {
            T(19);
        }
        return interfaceC7226d;
    }
}
