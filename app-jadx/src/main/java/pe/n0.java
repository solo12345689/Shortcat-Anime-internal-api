package Pe;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import gf.EnumC4882e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class n0 {

    /* JADX INFO: renamed from: a */
    private final Map f13910a = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class a {

        /* JADX INFO: renamed from: a */
        private final String f13911a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ n0 f13912b;

        /* JADX INFO: renamed from: Pe.n0$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public final class C0226a {

            /* JADX INFO: renamed from: a */
            private final String f13913a;

            /* JADX INFO: renamed from: b */
            private final String f13914b;

            /* JADX INFO: renamed from: c */
            private final List f13915c;

            /* JADX INFO: renamed from: d */
            private Pair f13916d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ a f13917e;

            public C0226a(a aVar, String functionName, String str) {
                AbstractC5504s.h(functionName, "functionName");
                this.f13917e = aVar;
                this.f13913a = functionName;
                this.f13914b = str;
                this.f13915c = new ArrayList();
                this.f13916d = Td.z.a("V", null);
            }

            public final Pair a() {
                Qe.F f10 = Qe.F.f14805a;
                String strC = this.f13917e.c();
                String str = this.f13913a;
                List list = this.f13915c;
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).c());
                }
                String strM = f10.m(strC, f10.k(str, arrayList, (String) this.f13916d.c()));
                r0 r0Var = (r0) this.f13916d.d();
                List list2 = this.f13915c;
                ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((r0) ((Pair) it2.next()).d());
                }
                return Td.z.a(strM, new g0(r0Var, arrayList2, this.f13914b));
            }

            public final void b(String type, C2023h... qualifiers) {
                r0 r0Var;
                AbstractC5504s.h(type, "type");
                AbstractC5504s.h(qualifiers, "qualifiers");
                List list = this.f13915c;
                if (qualifiers.length == 0) {
                    r0Var = null;
                } else {
                    Iterable<Ud.L> iterableJ1 = AbstractC2273n.j1(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(iterableJ1, 10)), 16));
                    for (Ud.L l10 : iterableJ1) {
                        linkedHashMap.put(Integer.valueOf(l10.c()), (C2023h) l10.d());
                    }
                    r0Var = new r0(linkedHashMap);
                }
                list.add(Td.z.a(type, r0Var));
            }

            public final void c(EnumC4882e type) {
                AbstractC5504s.h(type, "type");
                String strH = type.h();
                AbstractC5504s.g(strH, "getDesc(...)");
                this.f13916d = Td.z.a(strH, null);
            }

            public final void d(String type, C2023h... qualifiers) {
                AbstractC5504s.h(type, "type");
                AbstractC5504s.h(qualifiers, "qualifiers");
                Iterable<Ud.L> iterableJ1 = AbstractC2273n.j1(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(iterableJ1, 10)), 16));
                for (Ud.L l10 : iterableJ1) {
                    linkedHashMap.put(Integer.valueOf(l10.c()), (C2023h) l10.d());
                }
                this.f13916d = Td.z.a(type, new r0(linkedHashMap));
            }
        }

        public a(n0 n0Var, String className) {
            AbstractC5504s.h(className, "className");
            this.f13912b = n0Var;
            this.f13911a = className;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, Function1 function1, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, function1);
        }

        public final void a(String name, String str, Function1 block) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(block, "block");
            Map map = this.f13912b.f13910a;
            C0226a c0226a = new C0226a(this, name, str);
            block.invoke(c0226a);
            Pair pairA = c0226a.a();
            map.put(pairA.c(), pairA.d());
        }

        public final String c() {
            return this.f13911a;
        }
    }

    public final Map b() {
        return this.f13910a;
    }
}
