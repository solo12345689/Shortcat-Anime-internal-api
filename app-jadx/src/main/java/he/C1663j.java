package He;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import ve.o;
import xe.C7139c;

/* JADX INFO: renamed from: He.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1663j {

    /* JADX INFO: renamed from: a */
    public static final C1663j f8561a = new C1663j();

    /* JADX INFO: renamed from: b */
    private static final Map f8562b;

    /* JADX INFO: renamed from: c */
    private static final Map f8563c;

    /* JADX INFO: renamed from: d */
    private static final Set f8564d;

    /* JADX INFO: renamed from: e */
    private static final Set f8565e;

    /* JADX INFO: renamed from: f */
    private static final Set f8566f;

    static {
        Xe.d dVar = o.a.f62267s;
        Pair pairA = Td.z.a(AbstractC1664k.d(dVar, "name"), ve.o.f62169m);
        Pair pairA2 = Td.z.a(AbstractC1664k.d(dVar, "ordinal"), Xe.f.m("ordinal"));
        Pair pairA3 = Td.z.a(AbstractC1664k.c(o.a.f62228X, "size"), Xe.f.m("size"));
        Xe.c cVar = o.a.f62234b0;
        Map mapL = Ud.S.l(pairA, pairA2, pairA3, Td.z.a(AbstractC1664k.c(cVar, "size"), Xe.f.m("size")), Td.z.a(AbstractC1664k.d(o.a.f62243g, "length"), Xe.f.m("length")), Td.z.a(AbstractC1664k.c(cVar, "keys"), Xe.f.m("keySet")), Td.z.a(AbstractC1664k.c(cVar, "values"), Xe.f.m("values")), Td.z.a(AbstractC1664k.c(cVar, "entries"), Xe.f.m("entrySet")), Td.z.a(AbstractC1664k.c(o.a.f62214P0, "size"), Xe.f.m("length")), Td.z.a(AbstractC1664k.c(o.a.f62216Q0, "size"), Xe.f.m("length")), Td.z.a(AbstractC1664k.c(o.a.f62218R0, "size"), Xe.f.m("length")));
        f8562b = mapL;
        Set<Map.Entry> setEntrySet = mapL.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(AbstractC2279u.x(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((Xe.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Xe.f fVar = (Xe.f) pair.d();
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((Xe.f) pair.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Ud.S.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), AbstractC2279u.f0((Iterable) entry2.getValue()));
        }
        f8563c = linkedHashMap2;
        Map map = f8562b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            Xe.b bVarN = C7139c.f64375a.n(((Xe.c) entry3.getKey()).d().i());
            AbstractC5504s.e(bVarN);
            linkedHashSet.add(bVarN.a().b((Xe.f) entry3.getValue()));
        }
        f8564d = linkedHashSet;
        Set setKeySet = f8562b.keySet();
        f8565e = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Xe.c) it.next()).f());
        }
        f8566f = AbstractC2279u.f1(arrayList3);
    }

    private C1663j() {
    }

    public final Map a() {
        return f8562b;
    }

    public final List b(Xe.f name1) {
        AbstractC5504s.h(name1, "name1");
        List list = (List) f8563c.get(name1);
        return list == null ? AbstractC2279u.m() : list;
    }

    public final Set c() {
        return f8565e;
    }

    public final Set d() {
        return f8566f;
    }
}
