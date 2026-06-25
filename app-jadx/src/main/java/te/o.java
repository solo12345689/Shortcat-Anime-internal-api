package te;

import Ud.AbstractC2279u;
import he.AbstractC4945a;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.F0;
import qf.J0;
import qf.S;
import se.Y0;
import se.j1;
import vf.AbstractC6867d;
import ye.I;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.Z;
import ye.c0;
import ye.t0;
import ye.u0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class o {
    private static final boolean a(Member member) {
        if (member.getDeclaringClass() == null) {
            return false;
        }
        return !AbstractC4945a.e(r0).s();
    }

    public static final void g(h hVar, int i10, InterfaceC7224b interfaceC7224b, boolean z10) {
        if (j.a(hVar) == i10) {
            return;
        }
        throw new Y0("Inconsistent number of parameters in the descriptor and Java reflection object: " + j.a(hVar) + " != " + i10 + "\nCalling: " + interfaceC7224b + "\nParameter types: " + hVar.a() + ")\nDefault: " + z10);
    }

    public static final Object h(Object obj, InterfaceC7224b descriptor) {
        S sL;
        Class clsS;
        Method methodM;
        AbstractC5504s.h(descriptor, "descriptor");
        return (((descriptor instanceof Z) && bf.k.e((u0) descriptor)) || (sL = l(descriptor)) == null || (clsS = s(sL)) == null || (methodM = m(clsS, descriptor)) == null) ? obj : methodM.invoke(obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final te.h i(te.h r3, ye.InterfaceC7224b r4, boolean r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC5504s.h(r3, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
            boolean r0 = bf.k.a(r4)
            if (r0 != 0) goto L88
            java.util.List r0 = r4.y0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
            java.lang.String r1 = "getType(...)"
            if (r0 == 0) goto L24
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L24
            goto L42
        L24:
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()
            ye.c0 r2 = (ye.c0) r2
            qf.S r2 = r2.getType()
            kotlin.jvm.internal.AbstractC5504s.g(r2, r1)
            boolean r2 = bf.k.h(r2)
            if (r2 == 0) goto L28
            goto L88
        L42:
            java.util.List r0 = r4.j()
            java.lang.String r2 = "getValueParameters(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r2)
            if (r0 == 0) goto L54
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L54
            goto L72
        L54:
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            ye.t0 r2 = (ye.t0) r2
            qf.S r2 = r2.getType()
            kotlin.jvm.internal.AbstractC5504s.g(r2, r1)
            boolean r2 = bf.k.h(r2)
            if (r2 == 0) goto L58
            goto L88
        L72:
            qf.S r0 = r4.getReturnType()
            if (r0 == 0) goto L80
            boolean r0 = bf.k.c(r0)
            r1 = 1
            if (r0 != r1) goto L80
            goto L88
        L80:
            boolean r0 = q(r4)
            if (r0 == 0) goto L87
            goto L88
        L87:
            return r3
        L88:
            te.n r0 = new te.n
            r0.<init>(r4, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: te.o.i(te.h, ye.b, boolean):te.h");
    }

    public static /* synthetic */ h j(h hVar, InterfaceC7224b interfaceC7224b, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(hVar, interfaceC7224b, z10);
    }

    public static final Method k(Class cls, InterfaceC7224b interfaceC7224b) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", m(cls, interfaceC7224b).getReturnType());
            AbstractC5504s.e(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new Y0("No box method found in inline class: " + cls + " (calling " + interfaceC7224b + ')');
        }
    }

    private static final S l(InterfaceC7224b interfaceC7224b) {
        c0 c0VarO = interfaceC7224b.O();
        c0 c0VarK = interfaceC7224b.K();
        if (c0VarO != null) {
            return c0VarO.getType();
        }
        if (c0VarK == null) {
            return null;
        }
        if (interfaceC7224b instanceof InterfaceC7234l) {
            return c0VarK.getType();
        }
        InterfaceC7235m interfaceC7235mB = interfaceC7224b.b();
        InterfaceC7227e interfaceC7227e = interfaceC7235mB instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mB : null;
        if (interfaceC7227e != null) {
            return interfaceC7227e.p();
        }
        return null;
    }

    public static final Method m(Class cls, InterfaceC7224b descriptor) {
        AbstractC5504s.h(cls, "<this>");
        AbstractC5504s.h(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            AbstractC5504s.e(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new Y0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final List n(AbstractC6183d0 type) {
        AbstractC5504s.h(type, "type");
        List listO = o(F0.a(type));
        if (listO == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listO, 10));
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC7230h interfaceC7230hP = type.N0().p();
        AbstractC5504s.f(interfaceC7230hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsQ = j1.q((InterfaceC7227e) interfaceC7230hP);
        AbstractC5504s.e(clsQ);
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    private static final List o(AbstractC6183d0 abstractC6183d0) {
        Collection collectionE;
        if (!bf.k.i(abstractC6183d0)) {
            return null;
        }
        InterfaceC7230h interfaceC7230hP = abstractC6183d0.N0().p();
        AbstractC5504s.f(interfaceC7230hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        I iT = ff.e.t((InterfaceC7227e) interfaceC7230hP);
        AbstractC5504s.e(iT);
        List<Pair> listC = iT.c();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : listC) {
            Xe.f fVar = (Xe.f) pair.getFirst();
            List listO = o((AbstractC6183d0) pair.getSecond());
            if (listO != null) {
                collectionE = new ArrayList(AbstractC2279u.x(listO, 10));
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    collectionE.add(fVar.h() + '-' + ((String) it.next()));
                }
            } else {
                collectionE = AbstractC2279u.e(fVar.h());
            }
            AbstractC2279u.D(arrayList, collectionE);
        }
        return arrayList;
    }

    public static final List p(AbstractC6183d0 abstractC6183d0, InterfaceC7224b interfaceC7224b) {
        Method methodM;
        List listN = n(abstractC6183d0);
        if (listN != null) {
            return listN;
        }
        Class clsS = s(abstractC6183d0);
        if (clsS == null || (methodM = m(clsS, interfaceC7224b)) == null) {
            return null;
        }
        return AbstractC2279u.e(methodM);
    }

    private static final boolean q(InterfaceC7224b interfaceC7224b) {
        S sL = l(interfaceC7224b);
        return sL != null && bf.k.h(sL);
    }

    public static final List r(InterfaceC7224b interfaceC7224b, Member member, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        c0 c0VarO = interfaceC7224b.O();
        S type = c0VarO != null ? c0VarO.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (interfaceC7224b instanceof InterfaceC7234l) {
            InterfaceC7227e interfaceC7227eF0 = ((InterfaceC7234l) interfaceC7224b).f0();
            AbstractC5504s.g(interfaceC7227eF0, "getConstructedClass(...)");
            if (interfaceC7227eF0.A()) {
                InterfaceC7235m interfaceC7235mB = interfaceC7227eF0.b();
                AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((InterfaceC7227e) interfaceC7235mB).p());
            }
        } else {
            InterfaceC7235m interfaceC7235mB2 = interfaceC7224b.b();
            AbstractC5504s.g(interfaceC7235mB2, "getContainingDeclaration(...)");
            if ((interfaceC7235mB2 instanceof InterfaceC7227e) && ((Boolean) function1.invoke(interfaceC7235mB2)).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((InterfaceC7227e) interfaceC7235mB2).p());
                } else {
                    AbstractC6183d0 abstractC6183d0P = ((InterfaceC7227e) interfaceC7235mB2).p();
                    AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
                    arrayList.add(AbstractC6867d.B(abstractC6183d0P));
                }
            }
        }
        List listJ = interfaceC7224b.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).getType());
        }
        return arrayList;
    }

    public static final Class s(S s10) {
        S sK;
        Class clsT = t(s10.N0().p());
        if (clsT == null) {
            return null;
        }
        if (J0.l(s10) && ((sK = bf.k.k(s10)) == null || J0.l(sK) || ve.i.t0(sK))) {
            return null;
        }
        return clsT;
    }

    public static final Class t(InterfaceC7235m interfaceC7235m) {
        if (!(interfaceC7235m instanceof InterfaceC7227e) || !bf.k.b(interfaceC7235m)) {
            return null;
        }
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) interfaceC7235m;
        Class clsQ = j1.q(interfaceC7227e);
        if (clsQ != null) {
            return clsQ;
        }
        throw new Y0("Class object for the class " + interfaceC7227e.getName() + " cannot be found (classId=" + ff.e.n((InterfaceC7230h) interfaceC7235m) + ')');
    }

    public static final String u(InterfaceC7230h interfaceC7230h) {
        AbstractC5504s.h(interfaceC7230h, "<this>");
        Xe.b bVarN = ff.e.n(interfaceC7230h);
        AbstractC5504s.e(bVarN);
        return We.b.b(bVarN.b());
    }
}
