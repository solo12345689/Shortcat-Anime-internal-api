package Je;

import Be.V;
import Le.a0;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ye.InterfaceC7223a;
import ye.InterfaceC7227e;
import ye.h0;
import ye.t0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {
    public static final List a(Collection newValueParameterTypes, Collection oldValueParameters, InterfaceC7223a interfaceC7223a) {
        AbstractC5504s.h(newValueParameterTypes, "newValueParameterTypes");
        AbstractC5504s.h(oldValueParameters, "oldValueParameters");
        InterfaceC7223a newOwner = interfaceC7223a;
        AbstractC5504s.h(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List<Pair> listJ1 = AbstractC2279u.j1(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listJ1, 10));
        for (Pair pair : listJ1) {
            S s10 = (S) pair.getFirst();
            t0 t0Var = (t0) pair.getSecond();
            int index = t0Var.getIndex();
            InterfaceC7374h annotations = t0Var.getAnnotations();
            Xe.f name = t0Var.getName();
            AbstractC5504s.g(name, "getName(...)");
            boolean zB0 = t0Var.B0();
            boolean zS0 = t0Var.s0();
            boolean zR0 = t0Var.r0();
            S sK = t0Var.v0() != null ? ff.e.s(newOwner).n().k(s10) : null;
            h0 h0VarK = t0Var.k();
            AbstractC5504s.g(h0VarK, "getSource(...)");
            arrayList.add(new V(newOwner, null, index, annotations, name, s10, zB0, zS0, zR0, sK, h0VarK));
            newOwner = interfaceC7223a;
        }
        return arrayList;
    }

    public static final a0 b(InterfaceC7227e interfaceC7227e) {
        AbstractC5504s.h(interfaceC7227e, "<this>");
        InterfaceC7227e interfaceC7227eX = ff.e.x(interfaceC7227e);
        if (interfaceC7227eX == null) {
            return null;
        }
        InterfaceC5387k interfaceC5387kO0 = interfaceC7227eX.o0();
        a0 a0Var = interfaceC5387kO0 instanceof a0 ? (a0) interfaceC5387kO0 : null;
        return a0Var == null ? b(interfaceC7227eX) : a0Var;
    }
}
