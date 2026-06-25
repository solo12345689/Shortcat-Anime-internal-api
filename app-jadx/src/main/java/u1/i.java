package u1;

import java.util.ArrayList;
import t1.AbstractC6597j;
import t1.C6592e;
import t1.C6595h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static o a(C6592e c6592e, int i10, ArrayList arrayList, o oVar) {
        int iO1;
        int i11 = i10 == 0 ? c6592e.f60334I0 : c6592e.f60336J0;
        if (i11 != -1 && (oVar == null || i11 != oVar.c())) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((c6592e instanceof AbstractC6597j) && (iO1 = ((AbstractC6597j) c6592e).o1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i13);
                    if (oVar3.c() == iO1) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(c6592e)) {
            if (c6592e instanceof C6595h) {
                C6595h c6595h = (C6595h) c6592e;
                c6595h.n1().c(c6595h.o1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                c6592e.f60334I0 = oVar.c();
                c6592e.f60341O.c(i10, arrayList, oVar);
                c6592e.f60343Q.c(i10, arrayList, oVar);
            } else {
                c6592e.f60336J0 = oVar.c();
                c6592e.f60342P.c(i10, arrayList, oVar);
                c6592e.f60345S.c(i10, arrayList, oVar);
                c6592e.f60344R.c(i10, arrayList, oVar);
            }
            c6592e.f60348V.c(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (i10 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0349  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(t1.C6593f r17, u1.C6718b.InterfaceC0913b r18) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.i.c(t1.f, u1.b$b):boolean");
    }

    public static boolean d(C6592e.b bVar, C6592e.b bVar2, C6592e.b bVar3, C6592e.b bVar4) {
        C6592e.b bVar5;
        C6592e.b bVar6;
        C6592e.b bVar7 = C6592e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = C6592e.b.WRAP_CONTENT) || (bVar3 == C6592e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = C6592e.b.WRAP_CONTENT) || (bVar4 == C6592e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
