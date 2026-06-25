package qf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.q0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s0 {
    public static final r0 a(r0 r0Var, InterfaceC7374h newAnnotations) {
        r0 r0VarU;
        AbstractC5504s.h(r0Var, "<this>");
        AbstractC5504s.h(newAnnotations, "newAnnotations");
        if (AbstractC6209t.a(r0Var) == newAnnotations) {
            return r0Var;
        }
        C6208s c6208sB = AbstractC6209t.b(r0Var);
        if (c6208sB != null && (r0VarU = r0Var.u(c6208sB)) != null) {
            r0Var = r0VarU;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? r0Var.t(new C6208s(newAnnotations)) : r0Var;
    }

    public static final r0 b(InterfaceC7374h interfaceC7374h) {
        AbstractC5504s.h(interfaceC7374h, "<this>");
        return q0.a.a(C6213x.f58121a, interfaceC7374h, null, null, 6, null);
    }
}
