package qf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import vf.AbstractC6867d;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static G0 b(List list, E0 e02, InterfaceC7235m interfaceC7235m, List list2) {
        if (list == null) {
            a(0);
        }
        if (e02 == null) {
            a(1);
        }
        if (interfaceC7235m == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        G0 g0C = c(list, e02, interfaceC7235m, list2, null);
        if (g0C != null) {
            return g0C;
        }
        throw new AssertionError("Substitution failed");
    }

    public static G0 c(List list, E0 e02, InterfaceC7235m interfaceC7235m, List list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (e02 == null) {
            a(6);
        }
        if (interfaceC7235m == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ye.m0 m0Var = (ye.m0) it.next();
            Be.U uQ0 = Be.U.Q0(interfaceC7235m, m0Var.getAnnotations(), m0Var.y(), m0Var.m(), m0Var.getName(), i10, ye.h0.f65112a, m0Var.M());
            map.put(m0Var.l(), new D0(uQ0.p()));
            map2.put(m0Var, uQ0);
            list2.add(uQ0);
            i10++;
        }
        w0 w0VarJ = w0.j(map);
        G0 g0H = G0.h(e02, w0VarJ);
        G0 g0H2 = G0.h(e02.h(), w0VarJ);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ye.m0 m0Var2 = (ye.m0) it2.next();
            Be.U u10 = (Be.U) map2.get(m0Var2);
            for (S s10 : m0Var2.getUpperBounds()) {
                InterfaceC7230h interfaceC7230hP = s10.N0().p();
                S sP = (((interfaceC7230hP instanceof ye.m0) && AbstractC6867d.p((ye.m0) interfaceC7230hP)) ? g0H : g0H2).p(s10, N0.f58001g);
                if (sP == null) {
                    return null;
                }
                if (sP != s10 && zArr != null) {
                    zArr[0] = true;
                }
                u10.M0(sP);
            }
            u10.V0();
        }
        return g0H;
    }
}
