package Bd;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;
import sd.EnumC6452b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements e {
    @Override // Bd.e
    public List a(List updates, rd.d dVar, JSONObject jSONObject) {
        AbstractC5504s.h(updates, "updates");
        if (dVar == null) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = updates.iterator();
        rd.d dVar2 = null;
        rd.d dVar3 = null;
        while (it.hasNext()) {
            rd.d dVar4 = (rd.d) it.next();
            if (AbstractC5504s.c(dVar4.l(), dVar.l()) && dVar4.b().before(dVar.b())) {
                arrayList.add(dVar4);
                if (dVar3 == null || dVar3.b().before(dVar4.b())) {
                    dVar3 = dVar4;
                }
                if (g.f1655a.a(dVar4, jSONObject) && (dVar2 == null || dVar2.b().before(dVar4.b()))) {
                    dVar2 = dVar4;
                }
            }
        }
        if (dVar2 != null) {
            arrayList.remove(dVar2);
        } else if (dVar3 != null) {
            arrayList.remove(dVar3);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((rd.d) obj).m() != EnumC6452b.f59350c) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
