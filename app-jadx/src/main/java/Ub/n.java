package Ub;

import Ud.AbstractC2279u;
import he.AbstractC4945a;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;
import pe.InterfaceC6018h;
import qe.AbstractC6173c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {
    public static final boolean a(InterfaceC6014d interfaceC6014d, Class jClass) {
        AbstractC5504s.h(interfaceC6014d, "<this>");
        AbstractC5504s.h(jClass, "jClass");
        return AbstractC4945a.c(interfaceC6014d).isAssignableFrom(jClass) || AbstractC4945a.b(interfaceC6014d).isAssignableFrom(jClass);
    }

    public static final InterfaceC6018h b(InterfaceC6014d interfaceC6014d) {
        AbstractC5504s.h(interfaceC6014d, "<this>");
        InterfaceC6018h interfaceC6018h = (InterfaceC6018h) AbstractC2279u.N0(interfaceC6014d.i());
        return interfaceC6018h == null ? AbstractC6173c.c(interfaceC6014d) : interfaceC6018h;
    }
}
