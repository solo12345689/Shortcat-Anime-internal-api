package com.facebook.hermes.intl;

import com.facebook.hermes.intl.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static HashMap a(List list, Object obj, List list2) {
        HashMap map = new HashMap();
        e.a aVarF = o6.d.h(o6.d.a(obj, "localeMatcher")).equals("lookup") ? e.f((String[]) list.toArray(new String[list.size()])) : e.c((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objB = o6.d.b();
            Object obj2 = objB;
            if (!aVarF.f35943b.isEmpty()) {
                obj2 = objB;
                if (aVarF.f35943b.containsKey(str)) {
                    String str2 = (String) aVarF.f35943b.get(str);
                    boolean zIsEmpty = str2.isEmpty();
                    Object objR = str2;
                    if (zIsEmpty) {
                        objR = o6.d.r(com.amazon.a.a.o.b.f34640af);
                    }
                    hashSet.add(str);
                    obj2 = objR;
                }
            }
            Object obj3 = obj2;
            if (o6.d.g(obj).containsKey(str)) {
                Object objA = o6.d.a(obj, str);
                boolean zM = o6.d.m(objA);
                Object objO = objA;
                if (zM) {
                    boolean zIsEmpty2 = o6.d.h(objA).isEmpty();
                    objO = objA;
                    if (zIsEmpty2) {
                        objO = o6.d.o(true);
                    }
                }
                obj3 = obj2;
                if (!o6.d.n(objO)) {
                    boolean zEquals = objO.equals(obj2);
                    obj3 = obj2;
                    if (!zEquals) {
                        hashSet.remove(str);
                        obj3 = objO;
                    }
                }
            }
            boolean zJ = o6.d.j(obj3);
            Object objF = obj3;
            if (!zJ) {
                objF = o6.j.f(str, obj3);
            }
            if (!o6.d.m(objF) || o6.j.c(str, o6.d.h(objF), aVarF.f35942a)) {
                map.put(str, objF);
            } else {
                map.put(str, o6.d.b());
            }
        }
        for (String str3 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String strH = o6.d.h(o6.j.f(str3, o6.d.r((String) aVarF.f35943b.get(str3))));
            if (!o6.d.m(strH) || o6.j.c(str3, o6.d.h(strH), aVarF.f35942a)) {
                arrayList.add(strH);
                aVarF.f35942a.f(str3, arrayList);
            }
        }
        map.put("locale", aVarF.f35942a);
        return map;
    }
}
