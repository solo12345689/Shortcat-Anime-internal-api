package He;

import Xe.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f8573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f8574c;

    static {
        r rVar = new r();
        f8572a = rVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f8573b = linkedHashMap;
        Xe.i iVar = Xe.i.f21842a;
        rVar.c(iVar.l(), rVar.a("java.util.ArrayList", "java.util.LinkedList"));
        rVar.c(iVar.n(), rVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        rVar.c(iVar.m(), rVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b.a aVar = Xe.b.f21759d;
        rVar.c(aVar.c(new Xe.c("java.util.function.Function")), rVar.a("java.util.function.UnaryOperator"));
        rVar.c(aVar.c(new Xe.c("java.util.function.BiFunction")), rVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(Td.z.a(((Xe.b) entry.getKey()).a(), ((Xe.b) entry.getValue()).a()));
        }
        f8574c = Ud.S.w(arrayList);
    }

    private r() {
    }

    private final List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Xe.b.f21759d.c(new Xe.c(str)));
        }
        return arrayList;
    }

    private final void c(Xe.b bVar, List list) {
        Map map = f8573b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }

    public final Xe.c b(Xe.c classFqName) {
        AbstractC5504s.h(classFqName, "classFqName");
        return (Xe.c) f8574c.get(classFqName);
    }
}
