package zc;

import Td.u;
import Td.v;
import Ud.AbstractC2279u;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f66055a = AbstractC2279u.p("US", "LR", "MM");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f66056b = AbstractC2279u.p("AG", "BZ", "VG", "FM", "MH", "MS", "KN", "BS", "CY", "TC", "US", "LR", "PW", "KY");

    public static final String a(Locale locale) {
        Object objB;
        AbstractC5504s.h(locale, "locale");
        try {
            u.a aVar = u.f17466b;
            String country = locale.getCountry();
            if (TextUtils.isEmpty(country)) {
                country = null;
            }
            objB = u.b(country);
        } catch (Throwable th2) {
            u.a aVar2 = u.f17466b;
            objB = u.b(v.a(th2));
        }
        return (String) (u.g(objB) ? null : objB);
    }

    public static final String b(Locale locale) {
        AbstractC5504s.h(locale, "locale");
        String strC = c("ro.miui.region");
        return strC.length() == 0 ? a(locale) : strC;
    }

    public static final String c(String key) {
        Object objB;
        AbstractC5504s.h(key, "key");
        try {
            u.a aVar = u.f17466b;
            Class<?> cls = Class.forName(com.amazon.a.a.o.b.at);
            Object objInvoke = cls.getMethod(com.amazon.a.a.o.b.au, String.class).invoke(cls, key);
            AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.String");
            objB = u.b((String) objInvoke);
        } catch (Throwable th2) {
            u.a aVar2 = u.f17466b;
            objB = u.b(v.a(th2));
        }
        if (u.g(objB)) {
            objB = null;
        }
        String str = (String) objB;
        return str == null ? "" : str;
    }

    public static final String d(Locale locale) {
        AbstractC5504s.h(locale, "locale");
        String strB = b(locale);
        if (strB == null) {
            return null;
        }
        return f66056b.contains(strB) ? "fahrenheit" : "celsius";
    }

    public static final List e() {
        return f66055a;
    }
}
