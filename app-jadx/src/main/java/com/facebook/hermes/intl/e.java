package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC5833b f35942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f35943b = new HashMap();
    }

    public static String a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf("-");
            if (iLastIndexOf < 0) {
                return "";
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    public static ULocale b(InterfaceC5833b interfaceC5833b) {
        boolean[] zArr = new boolean[1];
        ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{(ULocale) interfaceC5833b.c()}, ULocale.getAvailableLocales(), zArr);
        if (zArr[0] || uLocaleAcceptLanguage == null) {
            return null;
        }
        return uLocaleAcceptLanguage;
    }

    public static a c(String[] strArr) {
        a aVar = new a();
        for (String str : strArr) {
            InterfaceC5833b interfaceC5833bB = o6.g.b(str);
            ULocale uLocaleB = b(interfaceC5833bB);
            if (uLocaleB != null) {
                aVar.f35942a = o6.h.j(uLocaleB);
                aVar.f35943b = interfaceC5833bB.a();
                return aVar;
            }
        }
        aVar.f35942a = o6.h.h();
        return aVar;
    }

    public static String[] d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (b(o6.g.b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] e() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static a f(String[] strArr) {
        return g(strArr, e());
    }

    public static a g(String[] strArr, String[] strArr2) {
        a aVar = new a();
        for (String str : strArr) {
            InterfaceC5833b interfaceC5833bB = o6.g.b(str);
            String strA = a(strArr2, interfaceC5833bB.e());
            if (!strA.isEmpty()) {
                aVar.f35942a = o6.g.b(strA);
                aVar.f35943b = interfaceC5833bB.a();
                return aVar;
            }
        }
        aVar.f35942a = o6.g.a();
        return aVar;
    }

    public static String[] h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] strArrE = e();
        for (String str : strArr) {
            String strA = a(strArrE, o6.g.b(str).e());
            if (strA != null && !strA.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
