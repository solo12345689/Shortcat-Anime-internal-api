package com.facebook.hermes.intl;

import com.adjust.sdk.Constants;
import com.facebook.hermes.intl.b;
import com.facebook.hermes.intl.g;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import o6.AbstractC5832a;
import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class DateTimeFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f35769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b.g f35770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b.e f35771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b.m f35772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b.d f35773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b.n f35774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b.i f35775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b.c f35776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b.f f35777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b.h f35778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b.j f35779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b.l f35780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b.EnumC0601b f35781t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.k f35782u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5833b f35763b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5833b f35764c = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f35783v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f35762a = new i();

    public DateTimeFormat(List<String> list, Map<String, Object> map) throws o6.f {
        c(list, map);
        this.f35762a.d(this.f35763b, this.f35765d ? "" : this.f35766e, this.f35767f ? "" : this.f35768g, this.f35771j, this.f35772k, this.f35773l, this.f35774m, this.f35775n, this.f35776o, this.f35777p, this.f35778q, this.f35779r, this.f35780s, this.f35770i, this.f35783v, this.f35781t, this.f35782u, this.f35769h);
    }

    private Object a() {
        return this.f35762a.g(this.f35763b);
    }

    private Object b(Object obj, String str, String str2) throws o6.f {
        if (!o6.d.l(obj)) {
            throw new o6.f("Invalid options object !");
        }
        boolean z10 = true;
        if (str.equals("date") || str.equals("any")) {
            String[] strArr = {"weekday", "year", "month", "day"};
            for (int i10 = 0; i10 < 4; i10++) {
                if (!o6.d.n(o6.d.a(obj, strArr[i10]))) {
                    z10 = false;
                }
            }
        }
        if (str.equals(com.amazon.a.a.h.a.f34344b) || str.equals("any")) {
            String[] strArr2 = {"hour", "minute", "second"};
            for (int i11 = 0; i11 < 3; i11++) {
                if (!o6.d.n(o6.d.a(obj, strArr2[i11]))) {
                    z10 = false;
                }
            }
        }
        if (!o6.d.n(o6.d.a(obj, "dateStyle")) || !o6.d.n(o6.d.a(obj, "timeStyle"))) {
            z10 = false;
        }
        if (z10 && (str2.equals("date") || str2.equals("all"))) {
            String[] strArr3 = {"year", "month", "day"};
            for (int i12 = 0; i12 < 3; i12++) {
                o6.d.c(obj, strArr3[i12], "numeric");
            }
        }
        if (z10 && (str2.equals(com.amazon.a.a.h.a.f34344b) || str2.equals("all"))) {
            String[] strArr4 = {"hour", "minute", "second"};
            for (int i13 = 0; i13 < 3; i13++) {
                o6.d.c(obj, strArr4[i13], "numeric");
            }
        }
        return obj;
    }

    private void c(List list, Map map) throws o6.f {
        List listAsList = Arrays.asList("ca", "nu", "hc");
        Object objB = b(map, "any", "date");
        Object objQ = o6.d.q();
        g.a aVar = g.a.STRING;
        o6.d.c(objQ, "localeMatcher", g.c(objB, "localeMatcher", aVar, AbstractC5832a.f54554a, "best fit"));
        Object objC = g.c(objB, "calendar", aVar, o6.d.d(), o6.d.d());
        if (!o6.d.n(objC) && !d(o6.d.h(objC))) {
            throw new o6.f("Invalid calendar option !");
        }
        o6.d.c(objQ, "ca", objC);
        Object objC2 = g.c(objB, "numberingSystem", aVar, o6.d.d(), o6.d.d());
        if (!o6.d.n(objC2) && !d(o6.d.h(objC2))) {
            throw new o6.f("Invalid numbering system !");
        }
        o6.d.c(objQ, "nu", objC2);
        Object objC3 = g.c(objB, "hour12", g.a.BOOLEAN, o6.d.d(), o6.d.d());
        Object objC4 = g.c(objB, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, o6.d.d());
        if (!o6.d.n(objC3)) {
            objC4 = o6.d.b();
        }
        o6.d.c(objQ, "hc", objC4);
        HashMap mapA = f.a(list, objQ, listAsList);
        InterfaceC5833b interfaceC5833b = (InterfaceC5833b) o6.d.g(mapA).get("locale");
        this.f35763b = interfaceC5833b;
        this.f35764c = interfaceC5833b.d();
        Object objA = o6.d.a(mapA, "ca");
        if (o6.d.j(objA)) {
            this.f35765d = true;
            this.f35766e = this.f35762a.h(this.f35763b);
        } else {
            this.f35765d = false;
            this.f35766e = o6.d.h(objA);
        }
        Object objA2 = o6.d.a(mapA, "nu");
        if (o6.d.j(objA2)) {
            this.f35767f = true;
            this.f35768g = this.f35762a.b(this.f35763b);
        } else {
            this.f35767f = false;
            this.f35768g = o6.d.h(objA2);
        }
        Object objA3 = o6.d.a(mapA, "hc");
        Object objA4 = o6.d.a(objB, "timeZone");
        this.f35783v = o6.d.n(objA4) ? a() : e(objA4.toString());
        this.f35771j = (b.e) g.d(b.e.class, o6.d.h(g.c(objB, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
        this.f35772k = (b.m) g.d(b.m.class, g.c(objB, "weekday", aVar, new String[]{Constants.LONG, "short", "narrow"}, o6.d.d()));
        this.f35773l = (b.d) g.d(b.d.class, g.c(objB, "era", aVar, new String[]{Constants.LONG, "short", "narrow"}, o6.d.d()));
        this.f35774m = (b.n) g.d(b.n.class, g.c(objB, "year", aVar, new String[]{"numeric", "2-digit"}, o6.d.d()));
        this.f35775n = (b.i) g.d(b.i.class, g.c(objB, "month", aVar, new String[]{"numeric", "2-digit", Constants.LONG, "short", "narrow"}, o6.d.d()));
        this.f35776o = (b.c) g.d(b.c.class, g.c(objB, "day", aVar, new String[]{"numeric", "2-digit"}, o6.d.d()));
        Object objC5 = g.c(objB, "hour", aVar, new String[]{"numeric", "2-digit"}, o6.d.d());
        this.f35777p = (b.f) g.d(b.f.class, objC5);
        this.f35778q = (b.h) g.d(b.h.class, g.c(objB, "minute", aVar, new String[]{"numeric", "2-digit"}, o6.d.d()));
        this.f35779r = (b.j) g.d(b.j.class, g.c(objB, "second", aVar, new String[]{"numeric", "2-digit"}, o6.d.d()));
        this.f35780s = (b.l) g.d(b.l.class, g.c(objB, "timeZoneName", aVar, new String[]{Constants.LONG, "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, o6.d.d()));
        this.f35781t = (b.EnumC0601b) g.d(b.EnumC0601b.class, g.c(objB, "dateStyle", aVar, new String[]{"full", Constants.LONG, Constants.MEDIUM, "short"}, o6.d.d()));
        Object objC6 = g.c(objB, "timeStyle", aVar, new String[]{"full", Constants.LONG, Constants.MEDIUM, "short"}, o6.d.d());
        this.f35782u = (b.k) g.d(b.k.class, objC6);
        if (o6.d.n(objC5) && o6.d.n(objC6)) {
            this.f35770i = b.g.UNDEFINED;
        } else {
            b.g gVarF = this.f35762a.f(this.f35763b);
            b.g gVar = o6.d.j(objA3) ? gVarF : (b.g) g.d(b.g.class, objA3);
            if (!o6.d.n(objC3)) {
                if (o6.d.e(objC3)) {
                    gVar = b.g.H11;
                    if (gVarF != gVar && gVarF != b.g.H23) {
                        gVar = b.g.H12;
                    }
                } else {
                    gVar = (gVarF == b.g.H11 || gVarF == b.g.H23) ? b.g.H23 : b.g.H24;
                }
            }
            this.f35770i = gVar;
        }
        this.f35769h = objC3;
    }

    private boolean d(String str) {
        return o6.c.e(str, 0, str.length() - 1);
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String strH = o6.d.h(g.c(map, "localeMatcher", g.a.STRING, AbstractC5832a.f54554a, "best fit"));
        String[] strArr = new String[list.size()];
        return strH.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    public String e(String str) throws o6.f {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new o6.f("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt + ' '));
            }
        }
        return sb2.toString();
    }

    public String format(double d10) {
        return this.f35762a.c(d10);
    }

    public List<Map<String, String>> formatToParts(double d10) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f35762a.a(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb2.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strE = it.hasNext() ? this.f35762a.e(it.next(), sb2.toString()) : "literal";
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strE);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f35764c.g());
        linkedHashMap.put("numberingSystem", this.f35768g);
        linkedHashMap.put("calendar", this.f35766e);
        linkedHashMap.put("timeZone", this.f35783v);
        b.g gVar = this.f35770i;
        if (gVar != b.g.UNDEFINED) {
            linkedHashMap.put("hourCycle", gVar.toString());
            b.g gVar2 = this.f35770i;
            if (gVar2 == b.g.H11 || gVar2 == b.g.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        b.m mVar = this.f35772k;
        if (mVar != b.m.UNDEFINED) {
            linkedHashMap.put("weekday", mVar.toString());
        }
        b.d dVar = this.f35773l;
        if (dVar != b.d.UNDEFINED) {
            linkedHashMap.put("era", dVar.toString());
        }
        b.n nVar = this.f35774m;
        if (nVar != b.n.UNDEFINED) {
            linkedHashMap.put("year", nVar.toString());
        }
        b.i iVar = this.f35775n;
        if (iVar != b.i.UNDEFINED) {
            linkedHashMap.put("month", iVar.toString());
        }
        b.c cVar = this.f35776o;
        if (cVar != b.c.UNDEFINED) {
            linkedHashMap.put("day", cVar.toString());
        }
        b.f fVar = this.f35777p;
        if (fVar != b.f.UNDEFINED) {
            linkedHashMap.put("hour", fVar.toString());
        }
        b.h hVar = this.f35778q;
        if (hVar != b.h.UNDEFINED) {
            linkedHashMap.put("minute", hVar.toString());
        }
        b.j jVar = this.f35779r;
        if (jVar != b.j.UNDEFINED) {
            linkedHashMap.put("second", jVar.toString());
        }
        b.l lVar = this.f35780s;
        if (lVar != b.l.UNDEFINED) {
            linkedHashMap.put("timeZoneName", lVar.toString());
        }
        b.EnumC0601b enumC0601b = this.f35781t;
        if (enumC0601b != b.EnumC0601b.UNDEFINED) {
            linkedHashMap.put("dateStyle", enumC0601b.toString());
        }
        b.k kVar = this.f35782u;
        if (kVar != b.k.UNDEFINED) {
            linkedHashMap.put("timeStyle", kVar.toString());
        }
        return linkedHashMap;
    }
}
