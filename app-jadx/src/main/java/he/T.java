package He;

import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.Y;
import ye.Z;
import ye.g0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class T {
    public static final boolean d(InterfaceC7224b interfaceC7224b) {
        AbstractC5504s.h(interfaceC7224b, "<this>");
        return g(interfaceC7224b) != null;
    }

    public static final String e(InterfaceC7224b callableMemberDescriptor) {
        InterfaceC7224b interfaceC7224bW;
        Xe.f fVarJ;
        AbstractC5504s.h(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC7224b interfaceC7224bF = f(callableMemberDescriptor);
        if (interfaceC7224bF != null && (interfaceC7224bW = ff.e.w(interfaceC7224bF)) != null) {
            if (interfaceC7224bW instanceof Z) {
                return C1666m.f8568a.b(interfaceC7224bW);
            }
            if ((interfaceC7224bW instanceof g0) && (fVarJ = C1659f.f8557o.j((g0) interfaceC7224bW)) != null) {
                return fVarJ.b();
            }
        }
        return null;
    }

    private static final InterfaceC7224b f(InterfaceC7224b interfaceC7224b) {
        if (ve.i.h0(interfaceC7224b)) {
            return g(interfaceC7224b);
        }
        return null;
    }

    public static final InterfaceC7224b g(InterfaceC7224b interfaceC7224b) {
        AbstractC5504s.h(interfaceC7224b, "<this>");
        if (!U.f8509a.g().contains(interfaceC7224b.getName()) && !C1663j.f8561a.d().contains(ff.e.w(interfaceC7224b).getName())) {
            return null;
        }
        if ((interfaceC7224b instanceof Z) || (interfaceC7224b instanceof Y)) {
            return ff.e.i(interfaceC7224b, false, P.f8506a, 1, null);
        }
        if (interfaceC7224b instanceof g0) {
            return ff.e.i(interfaceC7224b, false, Q.f8507a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        return C1666m.f8568a.d(ff.e.w(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        return C1659f.f8557o.k((g0) it);
    }

    public static final InterfaceC7224b j(InterfaceC7224b interfaceC7224b) {
        AbstractC5504s.h(interfaceC7224b, "<this>");
        InterfaceC7224b interfaceC7224bG = g(interfaceC7224b);
        if (interfaceC7224bG != null) {
            return interfaceC7224bG;
        }
        C1662i c1662i = C1662i.f8560o;
        Xe.f name = interfaceC7224b.getName();
        AbstractC5504s.g(name, "getName(...)");
        if (c1662i.n(name)) {
            return ff.e.i(interfaceC7224b, false, S.f8508a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        return ve.i.h0(it) && C1662i.o(it) != null;
    }

    public static final boolean l(InterfaceC7227e interfaceC7227e, InterfaceC7223a specialCallableDescriptor) {
        AbstractC5504s.h(interfaceC7227e, "<this>");
        AbstractC5504s.h(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC7235m interfaceC7235mB = specialCallableDescriptor.b();
        AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC6183d0 abstractC6183d0P = ((InterfaceC7227e) interfaceC7235mB).p();
        AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
        for (InterfaceC7227e interfaceC7227eS = bf.i.s(interfaceC7227e); interfaceC7227eS != null; interfaceC7227eS = bf.i.s(interfaceC7227eS)) {
            if (!(interfaceC7227eS instanceof Je.c) && rf.w.b(interfaceC7227eS.p(), abstractC6183d0P) != null) {
                return !ve.i.h0(interfaceC7227eS);
            }
        }
        return false;
    }

    public static final boolean m(InterfaceC7224b interfaceC7224b) {
        AbstractC5504s.h(interfaceC7224b, "<this>");
        return ff.e.w(interfaceC7224b).b() instanceof Je.c;
    }

    public static final boolean n(InterfaceC7224b interfaceC7224b) {
        AbstractC5504s.h(interfaceC7224b, "<this>");
        return m(interfaceC7224b) || ve.i.h0(interfaceC7224b);
    }
}
