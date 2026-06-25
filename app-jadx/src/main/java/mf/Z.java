package mf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import ye.C7222A;
import ye.r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Z {
    public static final Pair a(Se.c cVar, Ue.d nameResolver, Ue.h typeTable) {
        List listW0;
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        List<Integer> listR0 = cVar.R0();
        AbstractC5504s.g(listR0, "getMultiFieldValueClassUnderlyingNameList(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listR0, 10));
        for (Integer num : listR0) {
            AbstractC5504s.e(num);
            arrayList.add(L.b(nameResolver, num.intValue()));
        }
        Pair pairA = Td.z.a(Integer.valueOf(cVar.U0()), Integer.valueOf(cVar.T0()));
        if (AbstractC5504s.c(pairA, Td.z.a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> listV0 = cVar.V0();
            AbstractC5504s.g(listV0, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            listW0 = new ArrayList(AbstractC2279u.x(listV0, 10));
            for (Integer num2 : listV0) {
                AbstractC5504s.e(num2);
                listW0.add(typeTable.a(num2.intValue()));
            }
        } else {
            if (!AbstractC5504s.c(pairA, Td.z.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + L.b(nameResolver, cVar.J0()) + " has illegal multi-field value class representation").toString());
            }
            listW0 = cVar.W0();
        }
        return Td.z.a(arrayList, listW0);
    }

    public static final r0 b(Se.c cVar, Ue.d nameResolver, Ue.h typeTable, Function1 typeDeserializer, Function1 typeOfPublicProperty) {
        uf.j jVar;
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        AbstractC5504s.h(typeDeserializer, "typeDeserializer");
        AbstractC5504s.h(typeOfPublicProperty, "typeOfPublicProperty");
        if (cVar.Q0() > 0) {
            Pair pairA = a(cVar, nameResolver, typeTable);
            List list = (List) pairA.getFirst();
            List list2 = (List) pairA.getSecond();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(typeDeserializer.invoke(it.next()));
            }
            return new ye.I(AbstractC2279u.j1(list, arrayList));
        }
        if (!cVar.s1()) {
            return null;
        }
        Xe.f fVarB = L.b(nameResolver, cVar.N0());
        Se.r rVarI = Ue.g.i(cVar, typeTable);
        if ((rVarI != null && (jVar = (uf.j) typeDeserializer.invoke(rVarI)) != null) || (jVar = (uf.j) typeOfPublicProperty.invoke(fVarB)) != null) {
            return new C7222A(fVarB, jVar);
        }
        throw new IllegalStateException(("cannot determine underlying type for value class " + L.b(nameResolver, cVar.J0()) + " with property " + fVarB).toString());
    }
}
