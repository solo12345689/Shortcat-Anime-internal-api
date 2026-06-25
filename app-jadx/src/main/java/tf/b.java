package Tf;

import Vf.s0;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final InterfaceC6014d a(e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        if (eVar instanceof s0) {
            return a(((s0) eVar).b());
        }
        return null;
    }

    public static final e b(Yf.e eVar, e descriptor) {
        Rf.b bVarC;
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(descriptor, "descriptor");
        InterfaceC6014d interfaceC6014dA = a(descriptor);
        if (interfaceC6014dA == null || (bVarC = Yf.e.c(eVar, interfaceC6014dA, null, 2, null)) == null) {
            return null;
        }
        return bVarC.getDescriptor();
    }
}
