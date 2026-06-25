package com.facebook.hermes.intl;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        BOOLEAN,
        STRING
    }

    public static Object a(String str, Object obj, Object obj2, Object obj3, Object obj4) throws o6.f {
        if (o6.d.n(obj)) {
            return obj4;
        }
        if (!o6.d.k(obj)) {
            throw new o6.f(str + " value is invalid.");
        }
        double dF = o6.d.f(obj);
        if (!Double.isNaN(dF) && dF <= o6.d.f(obj3) && dF >= o6.d.f(obj2)) {
            return obj;
        }
        throw new o6.f(str + " value is invalid.");
    }

    public static Object b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return a(str, o6.d.a(obj, str), obj2, obj3, obj4);
    }

    public static Object c(Object obj, String str, a aVar, Object obj2, Object obj3) throws o6.f {
        Object objA = o6.d.a(obj, str);
        if (o6.d.n(objA)) {
            return obj3;
        }
        if (o6.d.j(objA)) {
            objA = "";
        }
        if (aVar == a.BOOLEAN && !o6.d.i(objA)) {
            throw new o6.f("Boolean option expected but not found");
        }
        if (aVar == a.STRING && !o6.d.m(objA)) {
            throw new o6.f("String option expected but not found");
        }
        if (o6.d.n(obj2) || Arrays.asList((Object[]) obj2).contains(objA)) {
            return objA;
        }
        throw new o6.f("String option expected but not found");
    }

    public static Enum d(Class cls, Object obj) {
        if (o6.d.n(obj)) {
            return Enum.valueOf(cls, "UNDEFINED");
        }
        if (o6.d.j(obj)) {
            return null;
        }
        String strH = o6.d.h(obj);
        if (strH.equals("2-digit")) {
            return Enum.valueOf(cls, "DIGIT2");
        }
        for (Enum r32 : (Enum[]) cls.getEnumConstants()) {
            if (r32.name().compareToIgnoreCase(strH) == 0) {
                return r32;
            }
        }
        return null;
    }
}
