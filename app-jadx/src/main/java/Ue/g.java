package Ue;

import Se.o;
import Se.r;
import Se.s;
import Se.t;
import Se.v;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {
    public static final r a(r rVar, h typeTable) {
        AbstractC5504s.h(rVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (rVar.k0()) {
            return rVar.S();
        }
        if (rVar.l0()) {
            return typeTable.a(rVar.T());
        }
        return null;
    }

    public static final List b(Se.c cVar, h typeTable) {
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        List listC0 = cVar.C0();
        if (listC0.isEmpty()) {
            listC0 = null;
        }
        if (listC0 == null) {
            List<Integer> listB0 = cVar.B0();
            AbstractC5504s.g(listB0, "getContextReceiverTypeIdList(...)");
            listC0 = new ArrayList(AbstractC2279u.x(listB0, 10));
            for (Integer num : listB0) {
                AbstractC5504s.e(num);
                listC0.add(typeTable.a(num.intValue()));
            }
        }
        return listC0;
    }

    public static final List c(Se.j jVar, h typeTable) {
        AbstractC5504s.h(jVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        List listD0 = jVar.d0();
        if (listD0.isEmpty()) {
            listD0 = null;
        }
        if (listD0 == null) {
            List<Integer> listC0 = jVar.c0();
            AbstractC5504s.g(listC0, "getContextReceiverTypeIdList(...)");
            listD0 = new ArrayList(AbstractC2279u.x(listC0, 10));
            for (Integer num : listC0) {
                AbstractC5504s.e(num);
                listD0.add(typeTable.a(num.intValue()));
            }
        }
        return listD0;
    }

    public static final List d(o oVar, h typeTable) {
        AbstractC5504s.h(oVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        List listC0 = oVar.c0();
        if (listC0.isEmpty()) {
            listC0 = null;
        }
        if (listC0 == null) {
            List<Integer> listB0 = oVar.b0();
            AbstractC5504s.g(listB0, "getContextReceiverTypeIdList(...)");
            listC0 = new ArrayList(AbstractC2279u.x(listB0, 10));
            for (Integer num : listB0) {
                AbstractC5504s.e(num);
                listC0.add(typeTable.a(num.intValue()));
            }
        }
        return listC0;
    }

    public static final r e(s sVar, h typeTable) {
        AbstractC5504s.h(sVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (sVar.i0()) {
            r rVarY = sVar.Y();
            AbstractC5504s.g(rVarY, "getExpandedType(...)");
            return rVarY;
        }
        if (sVar.j0()) {
            return typeTable.a(sVar.Z());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final r f(r rVar, h typeTable) {
        AbstractC5504s.h(rVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (rVar.p0()) {
            return rVar.c0();
        }
        if (rVar.q0()) {
            return typeTable.a(rVar.d0());
        }
        return null;
    }

    public static final boolean g(Se.j jVar) {
        AbstractC5504s.h(jVar, "<this>");
        return jVar.A0() || jVar.B0();
    }

    public static final boolean h(o oVar) {
        AbstractC5504s.h(oVar, "<this>");
        return oVar.x0() || oVar.y0();
    }

    public static final r i(Se.c cVar, h typeTable) {
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (cVar.t1()) {
            return cVar.O0();
        }
        if (cVar.u1()) {
            return typeTable.a(cVar.P0());
        }
        return null;
    }

    public static final r j(r rVar, h typeTable) {
        AbstractC5504s.h(rVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (rVar.s0()) {
            return rVar.f0();
        }
        if (rVar.t0()) {
            return typeTable.a(rVar.g0());
        }
        return null;
    }

    public static final r k(Se.j jVar, h typeTable) {
        AbstractC5504s.h(jVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (jVar.A0()) {
            return jVar.k0();
        }
        if (jVar.B0()) {
            return typeTable.a(jVar.l0());
        }
        return null;
    }

    public static final r l(o oVar, h typeTable) {
        AbstractC5504s.h(oVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (oVar.x0()) {
            return oVar.j0();
        }
        if (oVar.y0()) {
            return typeTable.a(oVar.k0());
        }
        return null;
    }

    public static final r m(Se.j jVar, h typeTable) {
        AbstractC5504s.h(jVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (jVar.C0()) {
            r rVarM0 = jVar.m0();
            AbstractC5504s.g(rVarM0, "getReturnType(...)");
            return rVarM0;
        }
        if (jVar.D0()) {
            return typeTable.a(jVar.n0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final r n(o oVar, h typeTable) {
        AbstractC5504s.h(oVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (oVar.z0()) {
            r rVarL0 = oVar.l0();
            AbstractC5504s.g(rVarL0, "getReturnType(...)");
            return rVarL0;
        }
        if (oVar.A0()) {
            return typeTable.a(oVar.m0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List o(Se.c cVar, h typeTable) {
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        List listF1 = cVar.f1();
        if (listF1.isEmpty()) {
            listF1 = null;
        }
        if (listF1 == null) {
            List<Integer> listE1 = cVar.e1();
            AbstractC5504s.g(listE1, "getSupertypeIdList(...)");
            listF1 = new ArrayList(AbstractC2279u.x(listE1, 10));
            for (Integer num : listE1) {
                AbstractC5504s.e(num);
                listF1.add(typeTable.a(num.intValue()));
            }
        }
        return listF1;
    }

    public static final r p(r.b bVar, h typeTable) {
        AbstractC5504s.h(bVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (bVar.C()) {
            return bVar.z();
        }
        if (bVar.D()) {
            return typeTable.a(bVar.A());
        }
        return null;
    }

    public static final r q(v vVar, h typeTable) {
        AbstractC5504s.h(vVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (vVar.T()) {
            r rVarN = vVar.N();
            AbstractC5504s.g(rVarN, "getType(...)");
            return rVarN;
        }
        if (vVar.U()) {
            return typeTable.a(vVar.O());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final r r(s sVar, h typeTable) {
        AbstractC5504s.h(sVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (sVar.m0()) {
            r rVarF0 = sVar.f0();
            AbstractC5504s.g(rVarF0, "getUnderlyingType(...)");
            return rVarF0;
        }
        if (sVar.n0()) {
            return typeTable.a(sVar.g0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List s(t tVar, h typeTable) {
        AbstractC5504s.h(tVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        List listT = tVar.T();
        if (listT.isEmpty()) {
            listT = null;
        }
        if (listT == null) {
            List<Integer> listS = tVar.S();
            AbstractC5504s.g(listS, "getUpperBoundIdList(...)");
            listT = new ArrayList(AbstractC2279u.x(listS, 10));
            for (Integer num : listS) {
                AbstractC5504s.e(num);
                listT.add(typeTable.a(num.intValue()));
            }
        }
        return listT;
    }

    public static final r t(v vVar, h typeTable) {
        AbstractC5504s.h(vVar, "<this>");
        AbstractC5504s.h(typeTable, "typeTable");
        if (vVar.V()) {
            return vVar.P();
        }
        if (vVar.W()) {
            return typeTable.a(vVar.Q());
        }
        return null;
    }
}
