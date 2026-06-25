package Qe;

import He.C1662i;
import He.T;
import Qe.s;
import Ud.AbstractC2279u;
import gf.C4881d;
import gf.EnumC4882e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ve.o;
import xe.C7139c;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.c0;
import ye.g0;
import ye.t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C {
    private static final void a(StringBuilder sb2, S s10) {
        sb2.append(g(s10));
    }

    public static final String b(InterfaceC7247z interfaceC7247z, boolean z10, boolean z11) {
        String strB;
        AbstractC5504s.h(interfaceC7247z, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (interfaceC7247z instanceof InterfaceC7234l) {
                strB = "<init>";
            } else {
                strB = interfaceC7247z.getName().b();
                AbstractC5504s.g(strB, "asString(...)");
            }
            sb2.append(strB);
        }
        sb2.append("(");
        c0 c0VarO = interfaceC7247z.O();
        if (c0VarO != null) {
            S type = c0VarO.getType();
            AbstractC5504s.g(type, "getType(...)");
            a(sb2, type);
        }
        Iterator it = interfaceC7247z.j().iterator();
        while (it.hasNext()) {
            S type2 = ((t0) it.next()).getType();
            AbstractC5504s.g(type2, "getType(...)");
            a(sb2, type2);
        }
        sb2.append(")");
        if (z10) {
            if (AbstractC2091j.c(interfaceC7247z)) {
                sb2.append("V");
            } else {
                S returnType = interfaceC7247z.getReturnType();
                AbstractC5504s.e(returnType);
                a(sb2, returnType);
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String c(InterfaceC7247z interfaceC7247z, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(interfaceC7247z, z10, z11);
    }

    public static final String d(InterfaceC7223a interfaceC7223a) {
        AbstractC5504s.h(interfaceC7223a, "<this>");
        F f10 = F.f14805a;
        if (bf.i.E(interfaceC7223a)) {
            return null;
        }
        InterfaceC7235m interfaceC7235mB = interfaceC7223a.b();
        InterfaceC7227e interfaceC7227e = interfaceC7235mB instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mB : null;
        if (interfaceC7227e == null || interfaceC7227e.getName().n()) {
            return null;
        }
        InterfaceC7223a interfaceC7223aA = interfaceC7223a.a();
        g0 g0Var = interfaceC7223aA instanceof g0 ? (g0) interfaceC7223aA : null;
        if (g0Var == null) {
            return null;
        }
        return B.a(f10, interfaceC7227e, c(g0Var, false, false, 3, null));
    }

    public static final boolean e(InterfaceC7223a f10) {
        InterfaceC7247z interfaceC7247zL;
        AbstractC5504s.h(f10, "f");
        if (!(f10 instanceof InterfaceC7247z)) {
            return false;
        }
        InterfaceC7247z interfaceC7247z = (InterfaceC7247z) f10;
        if (AbstractC5504s.c(interfaceC7247z.getName().b(), "remove") && interfaceC7247z.j().size() == 1 && !T.n((InterfaceC7224b) f10)) {
            List listJ = interfaceC7247z.a().j();
            AbstractC5504s.g(listJ, "getValueParameters(...)");
            S type = ((t0) AbstractC2279u.M0(listJ)).getType();
            AbstractC5504s.g(type, "getType(...)");
            s sVarG = g(type);
            s.d dVar = sVarG instanceof s.d ? (s.d) sVarG : null;
            if ((dVar != null ? dVar.i() : null) != EnumC4882e.INT || (interfaceC7247zL = C1662i.l(interfaceC7247z)) == null) {
                return false;
            }
            List listJ2 = interfaceC7247zL.a().j();
            AbstractC5504s.g(listJ2, "getValueParameters(...)");
            S type2 = ((t0) AbstractC2279u.M0(listJ2)).getType();
            AbstractC5504s.g(type2, "getType(...)");
            s sVarG2 = g(type2);
            InterfaceC7235m interfaceC7235mB = interfaceC7247zL.b();
            AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
            if (AbstractC5504s.c(ff.e.p(interfaceC7235mB), o.a.f62242f0.i()) && (sVarG2 instanceof s.c) && AbstractC5504s.c(((s.c) sVarG2).i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String f(InterfaceC7227e interfaceC7227e) {
        AbstractC5504s.h(interfaceC7227e, "<this>");
        Xe.b bVarN = C7139c.f64375a.n(ff.e.o(interfaceC7227e).i());
        if (bVarN == null) {
            return AbstractC2091j.b(interfaceC7227e, null, 2, null);
        }
        String strH = C4881d.h(bVarN);
        AbstractC5504s.g(strH, "internalNameByClassId(...)");
        return strH;
    }

    public static final s g(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return (s) AbstractC2091j.e(s10, u.f14912a, I.f14811o, H.f14806a, null, null, 32, null);
    }
}
