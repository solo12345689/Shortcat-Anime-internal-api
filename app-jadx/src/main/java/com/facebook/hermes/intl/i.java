package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.b;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements com.facebook.hermes.intl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DateFormat f35950a = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f35952b;

        static {
            int[] iArr = new int[b.k.values().length];
            f35952b = iArr;
            try {
                iArr[b.k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35952b[b.k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35952b[b.k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35952b[b.k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35952b[b.k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[b.EnumC0601b.values().length];
            f35951a = iArr2;
            try {
                iArr2[b.EnumC0601b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35951a[b.EnumC0601b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35951a[b.EnumC0601b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35951a[b.EnumC0601b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35951a[b.EnumC0601b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        public static String a(String str) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\'') {
                    z10 = !z10;
                } else if (!z10 && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    sb2.append(str.charAt(i10));
                }
            }
            return sb2.toString();
        }
    }

    i() {
    }

    private static String i(InterfaceC5833b interfaceC5833b, b.EnumC0601b enumC0601b, b.k kVar) {
        return enumC0601b == b.EnumC0601b.UNDEFINED ? ((SimpleDateFormat) DateFormat.getTimeInstance(m(kVar), (ULocale) interfaceC5833b.getLocale())).toLocalizedPattern() : kVar == b.k.UNDEFINED ? ((SimpleDateFormat) DateFormat.getDateInstance(l(enumC0601b), (ULocale) interfaceC5833b.getLocale())).toLocalizedPattern() : ((SimpleDateFormat) DateFormat.getDateTimeInstance(l(enumC0601b), m(kVar), (ULocale) interfaceC5833b.getLocale())).toLocalizedPattern();
    }

    private static String j(InterfaceC5833b interfaceC5833b, b.m mVar, b.d dVar, b.n nVar, b.i iVar, b.c cVar, b.f fVar, b.h hVar, b.j jVar, b.l lVar, b.g gVar, b.EnumC0601b enumC0601b, b.k kVar, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        if (enumC0601b == b.EnumC0601b.UNDEFINED && kVar == b.k.UNDEFINED) {
            sb2.append(mVar.b());
            sb2.append(dVar.b());
            sb2.append(nVar.b());
            sb2.append(iVar.b());
            sb2.append(cVar.b());
            if (gVar == b.g.H11 || gVar == b.g.H12) {
                sb2.append(fVar.b());
            } else {
                sb2.append(fVar.c());
            }
            sb2.append(hVar.b());
            sb2.append(jVar.b());
            sb2.append(lVar.b());
        } else {
            sb2.append(i(interfaceC5833b, enumC0601b, kVar));
            HashMap mapA = interfaceC5833b.a();
            if (mapA.containsKey("hc")) {
                String str = (String) mapA.get("hc");
                if (str == "h11" || str == "h12") {
                    k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str == "h23" || str == "h24") {
                    k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (gVar == b.g.H11 || gVar == b.g.H12) {
                k(sb2, new char[]{'H', 'K', 'k'}, 'h');
            } else if (gVar == b.g.H23 || gVar == b.g.H24) {
                k(sb2, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!o6.d.n(obj) && !o6.d.j(obj)) {
                if (o6.d.e(obj)) {
                    k(sb2, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    k(sb2, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        return sb2.toString();
    }

    private static void k(StringBuilder sb2, char[] cArr, char c10) {
        for (int i10 = 0; i10 < sb2.length(); i10++) {
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (sb2.charAt(i10) == cArr[i11]) {
                        sb2.setCharAt(i10, c10);
                        break;
                    }
                    i11++;
                }
            }
        }
    }

    static int l(b.EnumC0601b enumC0601b) throws o6.f {
        int i10 = a.f35951a[enumC0601b.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new o6.f("Invalid DateStyle: " + enumC0601b.toString());
    }

    static int m(b.k kVar) throws o6.f {
        int i10 = a.f35952b[kVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new o6.f("Invalid DateStyle: " + kVar.toString());
    }

    @Override // com.facebook.hermes.intl.b
    public AttributedCharacterIterator a(double d10) {
        return this.f35950a.formatToCharacterIterator(Double.valueOf(d10));
    }

    @Override // com.facebook.hermes.intl.b
    public String b(InterfaceC5833b interfaceC5833b) {
        return NumberingSystem.getInstance((ULocale) interfaceC5833b.getLocale()).getName();
    }

    @Override // com.facebook.hermes.intl.b
    public String c(double d10) {
        return this.f35950a.format(new Date((long) d10));
    }

    @Override // com.facebook.hermes.intl.b
    public void d(InterfaceC5833b interfaceC5833b, String str, String str2, b.e eVar, b.m mVar, b.d dVar, b.n nVar, b.i iVar, b.c cVar, b.f fVar, b.h hVar, b.j jVar, b.l lVar, b.g gVar, Object obj, b.EnumC0601b enumC0601b, b.k kVar, Object obj2) throws o6.f {
        Calendar calendar;
        InterfaceC5833b interfaceC5833b2;
        String strJ = j(interfaceC5833b, mVar, dVar, nVar, iVar, cVar, fVar, hVar, jVar, lVar, gVar, enumC0601b, kVar, obj2);
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(o6.d.h(str));
            InterfaceC5833b interfaceC5833bD = interfaceC5833b.d();
            interfaceC5833bD.f("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) interfaceC5833bD.getLocale());
        }
        if (str2.isEmpty()) {
            interfaceC5833b2 = interfaceC5833b;
        } else {
            try {
                if (NumberingSystem.getInstanceByName(o6.d.h(str2)) == null) {
                    throw new o6.f("Invalid numbering system: " + str2);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(o6.d.h(str2));
                interfaceC5833b2 = interfaceC5833b;
                interfaceC5833b2.f("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new o6.f("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            this.f35950a = DateFormat.getPatternInstance(calendar, strJ, (ULocale) interfaceC5833b2.getLocale());
        } else {
            this.f35950a = DateFormat.getPatternInstance(strJ, (ULocale) interfaceC5833b2.getLocale());
        }
        if (o6.d.n(obj) || o6.d.j(obj)) {
            return;
        }
        this.f35950a.setTimeZone(TimeZone.getTimeZone(o6.d.h(obj)));
    }

    @Override // com.facebook.hermes.intl.b
    public String e(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute != DateFormat.Field.YEAR) {
            return attribute == DateFormat.Field.MONTH ? "month" : attribute == DateFormat.Field.DAY_OF_MONTH ? "day" : (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) ? "hour" : attribute == DateFormat.Field.MINUTE ? "minute" : attribute == DateFormat.Field.SECOND ? "second" : attribute == DateFormat.Field.TIME_ZONE ? "timeZoneName" : attribute == DateFormat.Field.AM_PM ? "dayPeriod" : attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
        }
        try {
            Double.parseDouble(str);
            return "year";
        } catch (NumberFormatException unused) {
            return "yearName";
        }
    }

    @Override // com.facebook.hermes.intl.b
    public b.g f(InterfaceC5833b interfaceC5833b) {
        try {
            String strA = b.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) interfaceC5833b.getLocale())).toPattern());
            return strA.contains(String.valueOf('h')) ? b.g.H12 : strA.contains(String.valueOf('K')) ? b.g.H11 : strA.contains(String.valueOf('H')) ? b.g.H23 : b.g.H24;
        } catch (ClassCastException unused) {
            return b.g.H24;
        }
    }

    @Override // com.facebook.hermes.intl.b
    public String g(InterfaceC5833b interfaceC5833b) {
        return Calendar.getInstance((ULocale) interfaceC5833b.getLocale()).getTimeZone().getID();
    }

    @Override // com.facebook.hermes.intl.b
    public String h(InterfaceC5833b interfaceC5833b) {
        return o6.j.d(DateFormat.getDateInstance(3, (ULocale) interfaceC5833b.getLocale()).getCalendar().getType());
    }
}
