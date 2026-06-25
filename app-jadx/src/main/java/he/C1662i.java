package He;

import He.U;
import Ud.AbstractC2279u;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7224b;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: He.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1662i extends U {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1662i f8560o = new C1662i();

    private C1662i() {
    }

    private final boolean k(InterfaceC7224b interfaceC7224b) {
        return AbstractC2279u.e0(U.f8509a.e(), Qe.C.d(interfaceC7224b));
    }

    public static final InterfaceC7247z l(InterfaceC7247z functionDescriptor) {
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        C1662i c1662i = f8560o;
        Xe.f name = functionDescriptor.getName();
        AbstractC5504s.g(name, "getName(...)");
        if (c1662i.n(name)) {
            return (InterfaceC7247z) ff.e.i(functionDescriptor, false, C1660g.f8558a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        return f8560o.k(it);
    }

    public static final U.b o(InterfaceC7224b interfaceC7224b) {
        InterfaceC7224b interfaceC7224bI;
        String strD;
        AbstractC5504s.h(interfaceC7224b, "<this>");
        U.a aVar = U.f8509a;
        if (!aVar.d().contains(interfaceC7224b.getName()) || (interfaceC7224bI = ff.e.i(interfaceC7224b, false, C1661h.f8559a, 1, null)) == null || (strD = Qe.C.d(interfaceC7224bI)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        return (it instanceof InterfaceC7247z) && f8560o.k(it);
    }

    public final boolean n(Xe.f fVar) {
        AbstractC5504s.h(fVar, "<this>");
        return U.f8509a.d().contains(fVar);
    }
}
