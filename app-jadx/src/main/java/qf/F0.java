package qf;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import ze.C7382p;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class F0 {
    public static final AbstractC6183d0 a(S s10) {
        AbstractC5504s.h(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        AbstractC6183d0 abstractC6183d0 = m0Q0 instanceof AbstractC6183d0 ? (AbstractC6183d0) m0Q0 : null;
        if (abstractC6183d0 != null) {
            return abstractC6183d0;
        }
        throw new IllegalStateException(("This is should be simple type: " + s10).toString());
    }

    public static final S b(S s10, List newArguments, InterfaceC7374h newAnnotations) {
        AbstractC5504s.h(s10, "<this>");
        AbstractC5504s.h(newArguments, "newArguments");
        AbstractC5504s.h(newAnnotations, "newAnnotations");
        return e(s10, newArguments, newAnnotations, null, 4, null);
    }

    public static final S c(S s10, List newArguments, InterfaceC7374h newAnnotations, List newArgumentsForUpperBound) {
        AbstractC5504s.h(s10, "<this>");
        AbstractC5504s.h(newArguments, "newArguments");
        AbstractC5504s.h(newAnnotations, "newAnnotations");
        AbstractC5504s.h(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == s10.L0()) && newAnnotations == s10.getAnnotations()) {
            return s10;
        }
        r0 r0VarM0 = s10.M0();
        if ((newAnnotations instanceof C7382p) && ((C7382p) newAnnotations).isEmpty()) {
            newAnnotations = InterfaceC7374h.f66223k0.b();
        }
        r0 r0VarA = s0.a(r0VarM0, newAnnotations);
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            I i10 = (I) m0Q0;
            return V.e(d(i10.V0(), newArguments, r0VarA), d(i10.W0(), newArgumentsForUpperBound, r0VarA));
        }
        if (m0Q0 instanceof AbstractC6183d0) {
            return d((AbstractC6183d0) m0Q0, newArguments, r0VarA);
        }
        throw new Td.r();
    }

    public static final AbstractC6183d0 d(AbstractC6183d0 abstractC6183d0, List newArguments, r0 newAttributes) {
        AbstractC5504s.h(abstractC6183d0, "<this>");
        AbstractC5504s.h(newArguments, "newArguments");
        AbstractC5504s.h(newAttributes, "newAttributes");
        return (newArguments.isEmpty() && newAttributes == abstractC6183d0.M0()) ? abstractC6183d0 : newArguments.isEmpty() ? abstractC6183d0.T0(newAttributes) : abstractC6183d0 instanceof sf.i ? ((sf.i) abstractC6183d0).Z0(newArguments) : V.k(newAttributes, abstractC6183d0.N0(), newArguments, abstractC6183d0.O0(), null, 16, null);
    }

    public static /* synthetic */ S e(S s10, List list, InterfaceC7374h interfaceC7374h, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = s10.L0();
        }
        if ((i10 & 2) != 0) {
            interfaceC7374h = s10.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(s10, list, interfaceC7374h, list2);
    }

    public static /* synthetic */ AbstractC6183d0 f(AbstractC6183d0 abstractC6183d0, List list, r0 r0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = abstractC6183d0.L0();
        }
        if ((i10 & 2) != 0) {
            r0Var = abstractC6183d0.M0();
        }
        return d(abstractC6183d0, list, r0Var);
    }
}
