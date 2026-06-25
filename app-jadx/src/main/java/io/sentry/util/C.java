package io.sentry.util;

import io.sentry.EnumC5280t3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f51412a = new ConcurrentHashMap();

    public static List a(EnumC5280t3 enumC5280t3) {
        ArrayList arrayList = new ArrayList();
        EnumC5280t3 enumC5280t32 = EnumC5280t3.AGENT;
        if (enumC5280t32 == enumC5280t3 || EnumC5280t3.AGENTLESS_SPRING == enumC5280t3) {
            arrayList.add("auto.http.spring_jakarta.webmvc");
            arrayList.add("auto.http.spring.webmvc");
            arrayList.add("auto.http.spring7.webmvc");
            arrayList.add("auto.spring_jakarta.webflux");
            arrayList.add("auto.spring.webflux");
            arrayList.add("auto.spring7.webflux");
            arrayList.add("auto.db.jdbc");
            arrayList.add("auto.http.spring_jakarta.webclient");
            arrayList.add("auto.http.spring.webclient");
            arrayList.add("auto.http.spring7.webclient");
            arrayList.add("auto.http.spring_jakarta.restclient");
            arrayList.add("auto.http.spring.restclient");
            arrayList.add("auto.http.spring7.restclient");
            arrayList.add("auto.http.spring_jakarta.resttemplate");
            arrayList.add("auto.http.spring.resttemplate");
            arrayList.add("auto.http.spring7.resttemplate");
            arrayList.add("auto.http.openfeign");
            arrayList.add("auto.http.ktor-client");
        }
        if (enumC5280t32 == enumC5280t3) {
            arrayList.add("auto.graphql.graphql");
            arrayList.add("auto.graphql.graphql22");
        }
        return arrayList;
    }

    public static boolean b(List list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Map map = f51412a;
            if (map.containsKey(str)) {
                return ((Boolean) map.get(str)).booleanValue();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((io.sentry.F) it.next()).a().equalsIgnoreCase(str)) {
                    f51412a.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (((io.sentry.F) it2.next()).b(str)) {
                        f51412a.put(str, Boolean.TRUE);
                        return true;
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            f51412a.put(str, Boolean.FALSE);
        }
        return false;
    }
}
