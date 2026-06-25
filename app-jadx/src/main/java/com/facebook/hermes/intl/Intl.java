package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Intl {
    private static List a(List list) throws o6.f {
        if (list.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                throw new o6.f("Incorrect locale information provided");
            }
            if (str.isEmpty()) {
                throw new o6.f("Incorrect locale information provided");
            }
            String strA = d.a(str);
            if (!strA.isEmpty() && !arrayList.contains(strA)) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    public static List<String> getCanonicalLocales(List<String> list) {
        return a(list);
    }

    public static String toLocaleLowerCase(List<String> list, String str) {
        return UCharacter.toLowerCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f35942a.getLocale(), str);
    }

    public static String toLocaleUpperCase(List<String> list, String str) {
        return UCharacter.toUpperCase((ULocale) e.c((String[]) list.toArray(new String[list.size()])).f35942a.getLocale(), str);
    }
}
