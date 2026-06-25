package Bd;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.updates.d f1653b;

    public b(String runtimeVersion, expo.modules.updates.d config) {
        AbstractC5504s.h(runtimeVersion, "runtimeVersion");
        AbstractC5504s.h(config, "config");
        this.f1652a = runtimeVersion;
        this.f1653b = config;
    }

    @Override // Bd.a
    public rd.d a(List updates, JSONObject jSONObject) {
        Object obj;
        AbstractC5504s.h(updates, "updates");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : updates) {
            rd.d dVar = (rd.d) obj2;
            if (AbstractC5504s.c(this.f1652a, dVar.k()) && g.f1655a.a(dVar, jSONObject)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            rd.d dVar2 = (rd.d) obj3;
            if ((dVar2.o() == null && dVar2.j() == null) || (AbstractC5504s.c(dVar2.o(), this.f1653b.t()) && AbstractC5504s.c(dVar2.j(), this.f1653b.p()))) {
                arrayList2.add(obj3);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date dateB = ((rd.d) next).b();
                do {
                    Object next2 = it.next();
                    Date dateB2 = ((rd.d) next2).b();
                    if (dateB.compareTo(dateB2) < 0) {
                        next = next2;
                        dateB = dateB2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (rd.d) obj;
    }
}
