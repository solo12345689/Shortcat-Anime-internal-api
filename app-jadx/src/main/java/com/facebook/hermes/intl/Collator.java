package com.facebook.hermes.intl;

import com.facebook.hermes.intl.a;
import com.facebook.hermes.intl.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o6.AbstractC5832a;
import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Collator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.d f35753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.c f35754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35755c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a.b f35758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5833b f35759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC5833b f35760h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35756d = "default";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f35761i = new h();

    public Collator(List<String> list, Map<String, Object> map) throws o6.f {
        a(list, map);
        this.f35761i.e(this.f35759g).f(this.f35757e).d(this.f35758f).g(this.f35754b).c(this.f35755c);
    }

    private void a(List list, Map map) throws o6.f {
        g.a aVar = g.a.STRING;
        this.f35753a = (a.d) g.d(a.d.class, o6.d.h(g.c(map, "usage", aVar, AbstractC5832a.f54558e, "sort")));
        Object objQ = o6.d.q();
        o6.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, AbstractC5832a.f54554a, "best fit"));
        Object objC = g.c(map, "numeric", g.a.BOOLEAN, o6.d.d(), o6.d.d());
        if (!o6.d.n(objC)) {
            objC = o6.d.r(String.valueOf(o6.d.e(objC)));
        }
        o6.d.c(objQ, "kn", objC);
        o6.d.c(objQ, "kf", g.c(map, "caseFirst", aVar, AbstractC5832a.f54557d, o6.d.d()));
        HashMap mapA = f.a(list, objQ, Arrays.asList("co", "kf", "kn"));
        InterfaceC5833b interfaceC5833b = (InterfaceC5833b) o6.d.g(mapA).get("locale");
        this.f35759g = interfaceC5833b;
        this.f35760h = interfaceC5833b.d();
        Object objA = o6.d.a(mapA, "co");
        if (o6.d.j(objA)) {
            objA = o6.d.r("default");
        }
        this.f35756d = o6.d.h(objA);
        Object objA2 = o6.d.a(mapA, "kn");
        if (o6.d.j(objA2)) {
            this.f35757e = false;
        } else {
            this.f35757e = Boolean.parseBoolean(o6.d.h(objA2));
        }
        Object objA3 = o6.d.a(mapA, "kf");
        if (o6.d.j(objA3)) {
            objA3 = o6.d.r(com.amazon.a.a.o.b.f34641ag);
        }
        this.f35758f = (a.b) g.d(a.b.class, o6.d.h(objA3));
        if (this.f35753a == a.d.SEARCH) {
            ArrayList arrayListB = this.f35759g.b("collation");
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                arrayList.add(o6.j.e((String) it.next()));
            }
            arrayList.add(o6.j.e("search"));
            this.f35759g.f("co", arrayList);
        }
        Object objC2 = g.c(map, "sensitivity", g.a.STRING, AbstractC5832a.f54556c, o6.d.d());
        if (!o6.d.n(objC2)) {
            this.f35754b = (a.c) g.d(a.c.class, o6.d.h(objC2));
        } else if (this.f35753a == a.d.SORT) {
            this.f35754b = a.c.VARIANT;
        } else {
            this.f35754b = a.c.LOCALE;
        }
        this.f35755c = o6.d.e(g.c(map, "ignorePunctuation", g.a.BOOLEAN, o6.d.d(), Boolean.FALSE));
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        return o6.d.h(g.c(map, "localeMatcher", g.a.STRING, AbstractC5832a.f54554a, "best fit")).equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(e.h((String[]) list.toArray(new String[list.size()])));
    }

    public double compare(String str, String str2) {
        return this.f35761i.a(str, str2);
    }

    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f35760h.g().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f35753a.toString());
        a.c cVar = this.f35754b;
        if (cVar == a.c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f35761i.b().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f35755c));
        linkedHashMap.put("collation", this.f35756d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f35757e));
        linkedHashMap.put("caseFirst", this.f35758f.toString());
        return linkedHashMap;
    }
}
