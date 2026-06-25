package ve;

import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import qf.J0;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a */
    public static final s f62301a = new s();

    /* JADX INFO: renamed from: b */
    private static final Set f62302b;

    /* JADX INFO: renamed from: c */
    private static final Set f62303c;

    /* JADX INFO: renamed from: d */
    private static final HashMap f62304d;

    /* JADX INFO: renamed from: e */
    private static final HashMap f62305e;

    /* JADX INFO: renamed from: f */
    private static final HashMap f62306f;

    /* JADX INFO: renamed from: g */
    private static final Set f62307g;

    static {
        r[] rVarArrValues = r.values();
        ArrayList arrayList = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList.add(rVar.h());
        }
        f62302b = AbstractC2279u.f1(arrayList);
        q[] qVarArrValues = q.values();
        ArrayList arrayList2 = new ArrayList(qVarArrValues.length);
        for (q qVar : qVarArrValues) {
            arrayList2.add(qVar.b());
        }
        f62303c = AbstractC2279u.f1(arrayList2);
        f62304d = new HashMap();
        f62305e = new HashMap();
        f62306f = S.k(z.a(q.f62284c, Xe.f.m("ubyteArrayOf")), z.a(q.f62285d, Xe.f.m("ushortArrayOf")), z.a(q.f62286e, Xe.f.m("uintArrayOf")), z.a(q.f62287f, Xe.f.m("ulongArrayOf")));
        r[] rVarArrValues2 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar2 : rVarArrValues2) {
            linkedHashSet.add(rVar2.b().h());
        }
        f62307g = linkedHashSet;
        for (r rVar3 : r.values()) {
            f62304d.put(rVar3.b(), rVar3.c());
            f62305e.put(rVar3.c(), rVar3.b());
        }
    }

    private s() {
    }

    public static final boolean d(qf.S type) {
        InterfaceC7230h interfaceC7230hP;
        AbstractC5504s.h(type, "type");
        if (J0.w(type) || (interfaceC7230hP = type.N0().p()) == null) {
            return false;
        }
        return f62301a.c(interfaceC7230hP);
    }

    public final Xe.b a(Xe.b arrayClassId) {
        AbstractC5504s.h(arrayClassId, "arrayClassId");
        return (Xe.b) f62304d.get(arrayClassId);
    }

    public final boolean b(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return f62307g.contains(name);
    }

    public final boolean c(InterfaceC7235m descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        InterfaceC7235m interfaceC7235mB = descriptor.b();
        return (interfaceC7235mB instanceof N) && AbstractC5504s.c(((N) interfaceC7235mB).f(), o.f62147A) && f62302b.contains(descriptor.getName());
    }
}
