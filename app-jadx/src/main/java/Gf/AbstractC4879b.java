package gf;

import bf.i;
import bf.k;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ve.o;
import vf.AbstractC6867d;
import ye.AbstractC7241t;
import ye.InterfaceC7224b;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.m0;
import ye.t0;

/* JADX INFO: renamed from: gf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4879b {
    private static final boolean a(InterfaceC7227e interfaceC7227e) {
        return AbstractC5504s.c(ff.e.o(interfaceC7227e), o.f62179w);
    }

    private static final boolean b(S s10, boolean z10) {
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        m0 m0Var = interfaceC7230hP instanceof m0 ? (m0) interfaceC7230hP : null;
        if (m0Var == null) {
            return false;
        }
        return (z10 || !k.d(m0Var)) && e(AbstractC6867d.o(m0Var));
    }

    public static final boolean c(S s10) {
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        return interfaceC7230hP != null && ((k.b(interfaceC7230hP) && d(interfaceC7230hP)) || k.i(s10));
    }

    public static final boolean d(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        return k.g(interfaceC7235m) && !a((InterfaceC7227e) interfaceC7235m);
    }

    private static final boolean e(S s10) {
        return c(s10) || b(s10, true);
    }

    public static final boolean f(InterfaceC7224b descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        InterfaceC7226d interfaceC7226d = descriptor instanceof InterfaceC7226d ? (InterfaceC7226d) descriptor : null;
        if (interfaceC7226d == null || AbstractC7241t.g(interfaceC7226d.getVisibility())) {
            return false;
        }
        InterfaceC7227e interfaceC7227eF0 = interfaceC7226d.f0();
        AbstractC5504s.g(interfaceC7227eF0, "getConstructedClass(...)");
        if (k.g(interfaceC7227eF0) || i.G(interfaceC7226d.f0())) {
            return false;
        }
        List listJ = interfaceC7226d.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        if (listJ != null && listJ.isEmpty()) {
            return false;
        }
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            S type = ((t0) it.next()).getType();
            AbstractC5504s.g(type, "getType(...)");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
