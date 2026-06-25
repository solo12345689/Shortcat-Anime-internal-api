package He;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;
import ye.InterfaceC7247z;
import ye.x0;
import ze.InterfaceC7369c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class V {
    public static final InterfaceC7369c a(Ke.k c10, Oe.C wildcardType) {
        Object next;
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(wildcardType, "wildcardType");
        if (wildcardType.w() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator it = new Ke.g(c10, wildcardType, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC7369c interfaceC7369c = (InterfaceC7369c) next;
            for (Xe.c cVar : B.f()) {
                if (AbstractC5504s.c(interfaceC7369c.f(), cVar)) {
                    break loop0;
                }
            }
        }
        return (InterfaceC7369c) next;
    }

    public static final boolean b(InterfaceC7224b memberDescriptor) {
        AbstractC5504s.h(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof InterfaceC7247z) && AbstractC5504s.c(memberDescriptor.n0(Je.e.f9500H), Boolean.TRUE);
    }

    public static final boolean c(D javaTypeEnhancementState) {
        AbstractC5504s.h(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(B.e()) == O.f8502e;
    }

    public static final AbstractC7242u d(x0 x0Var) {
        AbstractC5504s.h(x0Var, "<this>");
        AbstractC7242u abstractC7242uG = y.g(x0Var);
        AbstractC5504s.g(abstractC7242uG, "toDescriptorVisibility(...)");
        return abstractC7242uG;
    }
}
