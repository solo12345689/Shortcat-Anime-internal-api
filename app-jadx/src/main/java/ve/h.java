package ve;

import Td.z;
import Ud.AbstractC2279u;
import df.AbstractC4598g;
import df.C4605n;
import df.C4615x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.B0;
import qf.S;
import qf.V;
import qf.s0;
import ve.o;
import vf.AbstractC6867d;
import we.AbstractC6971f;
import we.C6972g;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ze.C7378l;
import ze.InterfaceC7369c;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {
    public static final int a(S s10) {
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7369c interfaceC7369cH = s10.getAnnotations().h(o.a.f62189D);
        if (interfaceC7369cH == null) {
            return 0;
        }
        AbstractC4598g abstractC4598g = (AbstractC4598g) Ud.S.j(interfaceC7369cH.a(), o.f62173q);
        AbstractC5504s.f(abstractC4598g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C4605n) abstractC4598g).b()).intValue();
    }

    public static final AbstractC6183d0 b(i builtIns, InterfaceC7374h annotations, S s10, List contextReceiverTypes, List parameterTypes, List list, S returnType, boolean z10) {
        AbstractC5504s.h(builtIns, "builtIns");
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(contextReceiverTypes, "contextReceiverTypes");
        AbstractC5504s.h(parameterTypes, "parameterTypes");
        AbstractC5504s.h(returnType, "returnType");
        List listG = g(s10, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        InterfaceC7227e interfaceC7227eF = f(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (s10 == null ? 0 : 1), z10);
        if (s10 != null) {
            annotations = u(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = t(annotations, builtIns, contextReceiverTypes.size());
        }
        return V.h(s0.b(annotations), interfaceC7227eF, listG);
    }

    public static final Xe.f d(S s10) {
        String str;
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7369c interfaceC7369cH = s10.getAnnotations().h(o.a.f62191E);
        if (interfaceC7369cH == null) {
            return null;
        }
        Object objN0 = AbstractC2279u.N0(interfaceC7369cH.a().values());
        C4615x c4615x = objN0 instanceof C4615x ? (C4615x) objN0 : null;
        if (c4615x != null && (str = (String) c4615x.b()) != null) {
            if (!Xe.f.p(str)) {
                str = null;
            }
            if (str != null) {
                return Xe.f.m(str);
            }
        }
        return null;
    }

    public static final List e(S s10) {
        AbstractC5504s.h(s10, "<this>");
        p(s10);
        int iA = a(s10);
        if (iA == 0) {
            return AbstractC2279u.m();
        }
        List listSubList = s10.L0().subList(0, iA);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).getType());
        }
        return arrayList;
    }

    public static final InterfaceC7227e f(i builtIns, int i10, boolean z10) {
        AbstractC5504s.h(builtIns, "builtIns");
        InterfaceC7227e interfaceC7227eY = z10 ? builtIns.Y(i10) : builtIns.D(i10);
        AbstractC5504s.e(interfaceC7227eY);
        return interfaceC7227eY;
    }

    public static final List g(S s10, List contextReceiverTypes, List parameterTypes, List list, S returnType, i builtIns) {
        Xe.f fVar;
        i iVar;
        AbstractC5504s.h(contextReceiverTypes, "contextReceiverTypes");
        AbstractC5504s.h(parameterTypes, "parameterTypes");
        AbstractC5504s.h(returnType, "returnType");
        AbstractC5504s.h(builtIns, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (s10 != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(contextReceiverTypes, 10));
        Iterator it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC6867d.d((S) it.next()));
        }
        arrayList.addAll(arrayList2);
        Af.a.a(arrayList, s10 != null ? AbstractC6867d.d(s10) : null);
        for (Object obj : parameterTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            S sC = (S) obj;
            if (list == null || (fVar = (Xe.f) list.get(i10)) == null || fVar.n()) {
                fVar = null;
            }
            if (fVar != null) {
                Xe.c cVar = o.a.f62191E;
                Xe.f fVar2 = o.f62169m;
                String strB = fVar.b();
                AbstractC5504s.g(strB, "asString(...)");
                Map mapF = Ud.S.f(z.a(fVar2, new C4615x(strB)));
                iVar = builtIns;
                sC = AbstractC6867d.C(sC, InterfaceC7374h.f66223k0.a(AbstractC2279u.H0(sC.getAnnotations(), new C7378l(iVar, cVar, mapF, false, 8, null))));
            } else {
                iVar = builtIns;
            }
            arrayList.add(AbstractC6867d.d(sC));
            i10 = i11;
            builtIns = iVar;
        }
        arrayList.add(AbstractC6867d.d(returnType));
        return arrayList;
    }

    private static final AbstractC6971f h(Xe.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        C6972g c6972gA = C6972g.f63191c.a();
        Xe.c cVarD = dVar.m().d();
        String strB = dVar.j().b();
        AbstractC5504s.g(strB, "asString(...)");
        return c6972gA.b(cVarD, strB);
    }

    public static final AbstractC6971f i(S s10) {
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP != null) {
            return j(interfaceC7230hP);
        }
        return null;
    }

    public static final AbstractC6971f j(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        if ((interfaceC7235m instanceof InterfaceC7227e) && i.C0(interfaceC7235m)) {
            return h(ff.e.p(interfaceC7235m));
        }
        return null;
    }

    public static final S k(S s10) {
        AbstractC5504s.h(s10, "<this>");
        p(s10);
        if (!s(s10)) {
            return null;
        }
        return ((B0) s10.L0().get(a(s10))).getType();
    }

    public static final S l(S s10) {
        AbstractC5504s.h(s10, "<this>");
        p(s10);
        S type = ((B0) AbstractC2279u.y0(s10.L0())).getType();
        AbstractC5504s.g(type, "getType(...)");
        return type;
    }

    public static final List m(S s10) {
        AbstractC5504s.h(s10, "<this>");
        p(s10);
        return s10.L0().subList(a(s10) + (n(s10) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean n(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return p(s10) && s(s10);
    }

    public static final boolean o(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        AbstractC6971f abstractC6971fJ = j(interfaceC7235m);
        return AbstractC5504s.c(abstractC6971fJ, AbstractC6971f.a.f63187f) || AbstractC5504s.c(abstractC6971fJ, AbstractC6971f.d.f63190f);
    }

    public static final boolean p(S s10) {
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        return interfaceC7230hP != null && o(interfaceC7230hP);
    }

    public static final boolean q(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return AbstractC5504s.c(i(s10), AbstractC6971f.a.f63187f);
    }

    public static final boolean r(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return AbstractC5504s.c(i(s10), AbstractC6971f.d.f63190f);
    }

    private static final boolean s(S s10) {
        return s10.getAnnotations().h(o.a.f62187C) != null;
    }

    public static final InterfaceC7374h t(InterfaceC7374h interfaceC7374h, i builtIns, int i10) {
        AbstractC5504s.h(interfaceC7374h, "<this>");
        AbstractC5504s.h(builtIns, "builtIns");
        Xe.c cVar = o.a.f62189D;
        return interfaceC7374h.k0(cVar) ? interfaceC7374h : InterfaceC7374h.f66223k0.a(AbstractC2279u.H0(interfaceC7374h, new C7378l(builtIns, cVar, Ud.S.f(z.a(o.f62173q, new C4605n(i10))), false, 8, null)));
    }

    public static final InterfaceC7374h u(InterfaceC7374h interfaceC7374h, i builtIns) {
        AbstractC5504s.h(interfaceC7374h, "<this>");
        AbstractC5504s.h(builtIns, "builtIns");
        Xe.c cVar = o.a.f62187C;
        return interfaceC7374h.k0(cVar) ? interfaceC7374h : InterfaceC7374h.f66223k0.a(AbstractC2279u.H0(interfaceC7374h, new C7378l(builtIns, cVar, Ud.S.i(), false, 8, null)));
    }
}
