package Ub;

import Ud.AbstractC2279u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;
import pe.InterfaceC6018h;
import pe.InterfaceC6022l;
import pe.InterfaceC6025o;
import qe.AbstractC6173c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final String a(Enum r42) {
        List parameters;
        Object next;
        AbstractC5504s.h(r42, "<this>");
        InterfaceC6014d interfaceC6014dB = O.b(r42.getClass());
        InterfaceC6018h interfaceC6018hB = n.b(interfaceC6014dB);
        if (interfaceC6018hB == null || (parameters = interfaceC6018hB.getParameters()) == null || parameters.size() != 1) {
            return r42.name();
        }
        String name = ((InterfaceC6022l) AbstractC2279u.m0(interfaceC6018hB.getParameters())).getName();
        Iterator it = AbstractC6173c.a(interfaceC6014dB).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5504s.c(((InterfaceC6025o) next).getName(), name)) {
                break;
            }
        }
        InterfaceC6025o interfaceC6025o = (InterfaceC6025o) next;
        if (interfaceC6025o != null) {
            if (AbstractC5504s.c(interfaceC6025o.getReturnType().c(), O.b(String.class))) {
                return (String) interfaceC6025o.get(r42);
            }
            throw new IllegalArgumentException("The enum parameter has to be a string.");
        }
        throw new IllegalArgumentException(("Cannot find a property for " + name + " parameter").toString());
    }
}
