package ye;

import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import vf.AbstractC6867d;
import xf.C7168t;

/* JADX INFO: renamed from: ye.s */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7240s {
    public static final InterfaceC7230h a(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        InterfaceC7235m interfaceC7235mB = interfaceC7235m.b();
        if (interfaceC7235mB != null && !(interfaceC7235m instanceof N)) {
            if (!b(interfaceC7235mB)) {
                return a(interfaceC7235mB);
            }
            if (interfaceC7235mB instanceof InterfaceC7230h) {
                return (InterfaceC7230h) interfaceC7235mB;
            }
        }
        return null;
    }

    public static final boolean b(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        return interfaceC7235m.b() instanceof N;
    }

    public static final boolean c(InterfaceC7247z interfaceC7247z) {
        AbstractC6183d0 abstractC6183d0P;
        qf.S sD;
        qf.S returnType;
        AbstractC5504s.h(interfaceC7247z, "<this>");
        InterfaceC7235m interfaceC7235mB = interfaceC7247z.b();
        InterfaceC7227e interfaceC7227e = interfaceC7235mB instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mB : null;
        if (interfaceC7227e != null) {
            InterfaceC7227e interfaceC7227e2 = bf.k.g(interfaceC7227e) ? interfaceC7227e : null;
            if (interfaceC7227e2 != null && (abstractC6183d0P = interfaceC7227e2.p()) != null && (sD = AbstractC6867d.D(abstractC6183d0P)) != null && (returnType = interfaceC7247z.getReturnType()) != null && AbstractC5504s.c(interfaceC7247z.getName(), C7168t.f64541e) && ((AbstractC6867d.s(returnType) || AbstractC6867d.t(returnType)) && interfaceC7247z.j().size() == 1)) {
                qf.S type = ((t0) interfaceC7247z.j().get(0)).getType();
                AbstractC5504s.g(type, "getType(...)");
                if (AbstractC5504s.c(AbstractC6867d.D(type), sD) && interfaceC7247z.y0().isEmpty() && interfaceC7247z.O() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final InterfaceC7227e d(H h10, Xe.c fqName, Ge.b lookupLocation) {
        InterfaceC5387k interfaceC5387kU;
        AbstractC5504s.h(h10, "<this>");
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(lookupLocation, "lookupLocation");
        if (fqName.c()) {
            return null;
        }
        InterfaceC7230h interfaceC7230hE = h10.S(fqName.d()).o().e(fqName.f(), lookupLocation);
        InterfaceC7227e interfaceC7227e = interfaceC7230hE instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hE : null;
        if (interfaceC7227e != null) {
            return interfaceC7227e;
        }
        InterfaceC7227e interfaceC7227eD = d(h10, fqName.d(), lookupLocation);
        InterfaceC7230h interfaceC7230hE2 = (interfaceC7227eD == null || (interfaceC5387kU = interfaceC7227eD.U()) == null) ? null : interfaceC5387kU.e(fqName.f(), lookupLocation);
        if (interfaceC7230hE2 instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC7230hE2;
        }
        return null;
    }
}
