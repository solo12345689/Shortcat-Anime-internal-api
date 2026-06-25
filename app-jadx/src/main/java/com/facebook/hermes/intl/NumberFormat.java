package com.facebook.hermes.intl;

import com.adjust.sdk.Constants;
import com.facebook.hermes.intl.c;
import com.facebook.hermes.intl.g;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o6.AbstractC5832a;
import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NumberFormat {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String[] f35784v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.h f35785a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.i f35790f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c.f f35797m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f35800p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c.b f35803s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35786b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.EnumC0602c f35787c = c.EnumC0602c.SYMBOL;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.d f35788d = c.d.STANDARD;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35789e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35791g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35792h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35793i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35794j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35795k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35796l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c.g f35798n = c.g.AUTO;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f35801q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c.e f35802r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC5833b f35804t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC5833b f35805u = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f35799o = new j();

    public NumberFormat(List<String> list, Map<String, Object> map) throws o6.f {
        a(list, map);
        this.f35799o.d(this.f35804t, this.f35800p ? "" : this.f35801q, this.f35785a, this.f35788d, this.f35802r, this.f35803s).e(this.f35786b, this.f35787c).h(this.f35791g).g(this.f35792h).f(this.f35797m, this.f35795k, this.f35796l).i(this.f35797m, this.f35793i, this.f35794j).k(this.f35798n).j(this.f35789e, this.f35790f);
    }

    private void a(List list, Map map) throws o6.f {
        Object objP;
        Object objP2;
        Object objQ = o6.d.q();
        g.a aVar = g.a.STRING;
        o6.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, AbstractC5832a.f54554a, "best fit"));
        Object objC = g.c(map, "numberingSystem", aVar, o6.d.d(), o6.d.d());
        if (!o6.d.n(objC) && !b(o6.d.h(objC))) {
            throw new o6.f("Invalid numbering system !");
        }
        o6.d.c(objQ, "nu", objC);
        HashMap mapA = f.a(list, objQ, Collections.singletonList("nu"));
        InterfaceC5833b interfaceC5833b = (InterfaceC5833b) o6.d.g(mapA).get("locale");
        this.f35804t = interfaceC5833b;
        this.f35805u = interfaceC5833b.d();
        Object objA = o6.d.a(mapA, "nu");
        if (o6.d.j(objA)) {
            this.f35800p = true;
            this.f35801q = this.f35799o.b(this.f35804t);
        } else {
            this.f35800p = false;
            this.f35801q = o6.d.h(objA);
        }
        h(map);
        if (this.f35785a == c.h.CURRENCY) {
            double dN = j.n(this.f35786b);
            objP = o6.d.p(dN);
            objP2 = o6.d.p(dN);
        } else {
            objP = o6.d.p(0.0d);
            objP2 = this.f35785a == c.h.PERCENT ? o6.d.p(0.0d) : o6.d.p(3.0d);
        }
        this.f35802r = (c.e) g.d(c.e.class, o6.d.h(g.c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        g(map, objP, objP2);
        Object objC2 = g.c(map, "compactDisplay", aVar, new String[]{"short", Constants.LONG}, "short");
        if (this.f35802r == c.e.COMPACT) {
            this.f35803s = (c.b) g.d(c.b.class, o6.d.h(objC2));
        }
        this.f35791g = o6.d.e(g.c(map, "useGrouping", g.a.BOOLEAN, o6.d.d(), o6.d.o(true)));
        this.f35798n = (c.g) g.d(c.g.class, o6.d.h(g.c(map, "signDisplay", aVar, new String[]{"auto", "never", "always", "exceptZero"}, "auto")));
    }

    private boolean b(String str) {
        return o6.c.e(str, 0, str.length() - 1);
    }

    private boolean c(String str) {
        return Arrays.binarySearch(f35784v, str) >= 0;
    }

    private boolean d(String str) {
        return f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean e(String str) {
        if (c(str)) {
            return true;
        }
        int iIndexOf = str.indexOf("-per-");
        return iIndexOf >= 0 && str.indexOf("-per-", iIndexOf + 1) < 0 && c(str.substring(0, iIndexOf)) && c(str.substring(iIndexOf + 5));
    }

    private String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt - ' '));
            }
        }
        return sb2.toString();
    }

    private void g(Map map, Object obj, Object obj2) throws o6.f {
        Object objB = g.b(map, "minimumIntegerDigits", o6.d.p(1.0d), o6.d.p(21.0d), o6.d.p(1.0d));
        Object objA = o6.d.a(map, "minimumFractionDigits");
        Object objA2 = o6.d.a(map, "maximumFractionDigits");
        Object objA3 = o6.d.a(map, "minimumSignificantDigits");
        Object objA4 = o6.d.a(map, "maximumSignificantDigits");
        this.f35792h = (int) Math.floor(o6.d.f(objB));
        if (!o6.d.n(objA3) || !o6.d.n(objA4)) {
            this.f35797m = c.f.SIGNIFICANT_DIGITS;
            Object objA5 = g.a("minimumSignificantDigits", objA3, o6.d.p(1.0d), o6.d.p(21.0d), o6.d.p(1.0d));
            Object objA6 = g.a("maximumSignificantDigits", objA4, objA5, o6.d.p(21.0d), o6.d.p(21.0d));
            this.f35795k = (int) Math.floor(o6.d.f(objA5));
            this.f35796l = (int) Math.floor(o6.d.f(objA6));
            return;
        }
        if (o6.d.n(objA) && o6.d.n(objA2)) {
            c.e eVar = this.f35802r;
            if (eVar == c.e.COMPACT) {
                this.f35797m = c.f.COMPACT_ROUNDING;
                return;
            }
            if (eVar == c.e.ENGINEERING) {
                this.f35797m = c.f.FRACTION_DIGITS;
                this.f35794j = 5;
                return;
            } else {
                this.f35797m = c.f.FRACTION_DIGITS;
                this.f35793i = (int) Math.floor(o6.d.f(obj));
                this.f35794j = (int) Math.floor(o6.d.f(obj2));
                return;
            }
        }
        this.f35797m = c.f.FRACTION_DIGITS;
        Object objA7 = g.a("minimumFractionDigits", objA, o6.d.p(0.0d), o6.d.p(20.0d), o6.d.d());
        Object objA8 = g.a("maximumFractionDigits", objA2, o6.d.p(0.0d), o6.d.p(20.0d), o6.d.d());
        if (o6.d.n(objA7)) {
            objA7 = o6.d.p(Math.min(o6.d.f(obj), o6.d.f(objA8)));
        } else if (o6.d.n(objA8)) {
            objA8 = o6.d.p(Math.max(o6.d.f(obj2), o6.d.f(objA7)));
        } else if (o6.d.f(objA7) > o6.d.f(objA8)) {
            throw new o6.f("minimumFractionDigits is greater than maximumFractionDigits");
        }
        this.f35793i = (int) Math.floor(o6.d.f(objA7));
        this.f35794j = (int) Math.floor(o6.d.f(objA8));
    }

    private void h(Map map) throws o6.f {
        g.a aVar = g.a.STRING;
        this.f35785a = (c.h) g.d(c.h.class, o6.d.h(g.c(map, "style", aVar, new String[]{"decimal", "percent", com.amazon.a.a.o.b.f34634a, "unit"}, "decimal")));
        Object objC = g.c(map, com.amazon.a.a.o.b.f34634a, aVar, o6.d.d(), o6.d.d());
        if (o6.d.n(objC)) {
            if (this.f35785a == c.h.CURRENCY) {
                throw new o6.f("Expected currency style !");
            }
        } else if (!d(o6.d.h(objC))) {
            throw new o6.f("Malformed currency code !");
        }
        Object objC2 = g.c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object objC3 = g.c(map, "currencySign", aVar, new String[]{"accounting", "standard"}, "standard");
        Object objC4 = g.c(map, "unit", aVar, o6.d.d(), o6.d.d());
        if (o6.d.n(objC4)) {
            if (this.f35785a == c.h.UNIT) {
                throw new o6.f("Expected unit !");
            }
        } else if (!e(o6.d.h(objC4))) {
            throw new o6.f("Malformed unit identifier !");
        }
        Object objC5 = g.c(map, "unitDisplay", aVar, new String[]{Constants.LONG, "short", "narrow"}, "short");
        c.h hVar = this.f35785a;
        if (hVar == c.h.CURRENCY) {
            this.f35786b = f(o6.d.h(objC));
            this.f35787c = (c.EnumC0602c) g.d(c.EnumC0602c.class, o6.d.h(objC2));
            this.f35788d = (c.d) g.d(c.d.class, o6.d.h(objC3));
        } else if (hVar == c.h.UNIT) {
            this.f35789e = o6.d.h(objC4);
            this.f35790f = (c.i) g.d(c.i.class, o6.d.h(objC5));
        }
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String strH = o6.d.h(g.c(map, "localeMatcher", g.a.STRING, AbstractC5832a.f54554a, "best fit"));
        String[] strArr = new String[list.size()];
        return strH.equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(strArr))) : Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    public String format(double d10) {
        return this.f35799o.c(d10);
    }

    public List<Map<String, String>> formatToParts(double d10) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f35799o.a(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb2.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strL = it.hasNext() ? this.f35799o.l(it.next(), d10) : "literal";
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strL);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f35805u.g());
        linkedHashMap.put("numberingSystem", this.f35801q);
        linkedHashMap.put("style", this.f35785a.toString());
        c.h hVar = this.f35785a;
        if (hVar == c.h.CURRENCY) {
            linkedHashMap.put(com.amazon.a.a.o.b.f34634a, this.f35786b);
            linkedHashMap.put("currencyDisplay", this.f35787c.toString());
            linkedHashMap.put("currencySign", this.f35788d.toString());
        } else if (hVar == c.h.UNIT) {
            linkedHashMap.put("unit", this.f35789e);
            linkedHashMap.put("unitDisplay", this.f35790f.toString());
        }
        int i10 = this.f35792h;
        if (i10 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i10));
        }
        c.f fVar = this.f35797m;
        if (fVar == c.f.SIGNIFICANT_DIGITS) {
            int i11 = this.f35796l;
            if (i11 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i11));
            }
            int i12 = this.f35795k;
            if (i12 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i12));
            }
        } else if (fVar == c.f.FRACTION_DIGITS) {
            int i13 = this.f35793i;
            if (i13 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i13));
            }
            int i14 = this.f35794j;
            if (i14 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i14));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f35791g));
        linkedHashMap.put("notation", this.f35802r.toString());
        if (this.f35802r == c.e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f35803s.toString());
        }
        linkedHashMap.put("signDisplay", this.f35798n.toString());
        return linkedHashMap;
    }
}
