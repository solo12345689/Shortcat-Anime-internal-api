package rf;

import cf.AbstractC3103e;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.B0;
import qf.J0;
import qf.N0;
import qf.S;
import qf.v0;
import qf.w0;
import wf.AbstractC6975c;
import ye.InterfaceC7235m;

/* JADX INFO: renamed from: rf.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6310A {
    private static final S a(S s10) {
        return (S) AbstractC6975c.b(s10).d();
    }

    private static final String b(v0 v0Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + v0Var, sb2);
        c("hashCode: " + v0Var.hashCode(), sb2);
        c("javaClass: " + v0Var.getClass().getCanonicalName(), sb2);
        for (InterfaceC7235m interfaceC7235mP = v0Var.p(); interfaceC7235mP != null; interfaceC7235mP = interfaceC7235mP.b()) {
            c("fqName: " + af.n.f23993h.M(interfaceC7235mP), sb2);
            c("javaClass: " + interfaceC7235mP.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        AbstractC5504s.h(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
        return sb2;
    }

    public static final S d(S subtype, S supertype, x typeCheckingProcedureCallbacks) {
        AbstractC5504s.h(subtype, "subtype");
        AbstractC5504s.h(supertype, "supertype");
        AbstractC5504s.h(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new u(subtype, null));
        v0 v0VarN0 = supertype.N0();
        while (!arrayDeque.isEmpty()) {
            u uVar = (u) arrayDeque.poll();
            S sB = uVar.b();
            v0 v0VarN02 = sB.N0();
            if (typeCheckingProcedureCallbacks.a(v0VarN02, v0VarN0)) {
                boolean zO0 = sB.O0();
                for (u uVarA = uVar.a(); uVarA != null; uVarA = uVarA.a()) {
                    S sB2 = uVarA.b();
                    List listL0 = sB2.L0();
                    if (listL0 == null || !listL0.isEmpty()) {
                        Iterator it = listL0.iterator();
                        while (it.hasNext()) {
                            N0 n0B = ((B0) it.next()).b();
                            N0 n02 = N0.f57999e;
                            if (n0B != n02) {
                                S sN = AbstractC3103e.h(w0.f58118c.a(sB2), false, 1, null).c().n(sB, n02);
                                AbstractC5504s.g(sN, "safeSubstitute(...)");
                                sB = a(sN);
                                break;
                            }
                        }
                        sB = w0.f58118c.a(sB2).c().n(sB, N0.f57999e);
                        AbstractC5504s.e(sB);
                    } else {
                        sB = w0.f58118c.a(sB2).c().n(sB, N0.f57999e);
                        AbstractC5504s.e(sB);
                    }
                    zO0 = zO0 || sB2.O0();
                }
                v0 v0VarN03 = sB.N0();
                if (typeCheckingProcedureCallbacks.a(v0VarN03, v0VarN0)) {
                    return J0.p(sB, zO0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(v0VarN03) + ", \n\nsupertype: " + b(v0VarN0) + " \n" + typeCheckingProcedureCallbacks.a(v0VarN03, v0VarN0));
            }
            for (S s10 : v0VarN02.k()) {
                AbstractC5504s.e(s10);
                arrayDeque.add(new u(s10, uVar));
            }
        }
        return null;
    }
}
