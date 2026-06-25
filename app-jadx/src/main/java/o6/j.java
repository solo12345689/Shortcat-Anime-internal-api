package o6;

import android.icu.text.Collator;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f54564a = "calendar";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f54565b = "ca";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f54566c = "numbers";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f54567d = "nu";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f54568e = "hours";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f54569f = "hc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f54570g = "collation";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f54571h = "co";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f54572i = "colnumeric";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f54573j = "kn";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f54574k = "colcasefirst";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f54575l = "kf";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static HashMap f54576m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static HashMap f54577n = new b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f54578o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Map f54579p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Map f54580q = new e();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Map f54581r = new f();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends HashMap {
        a() {
            put(j.f54565b, j.f54564a);
            put(j.f54567d, j.f54566c);
            put(j.f54569f, j.f54568e);
            put(j.f54571h, j.f54570g);
            put(j.f54573j, j.f54572i);
            put(j.f54575l, j.f54574k);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends HashMap {
        b() {
            put(j.f54564a, j.f54565b);
            put(j.f54566c, j.f54567d);
            put(j.f54568e, j.f54569f);
            put(j.f54570g, j.f54571h);
            put(j.f54572i, j.f54573j);
            put(j.f54574k, j.f54575l);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends HashMap {
        c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends HashMap {
        d() {
            put("gregorian", "gregory");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e extends HashMap {
        e() {
            put("traditional", "traditio");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends HashMap {
        f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    public static String a(String str) {
        return f54576m.containsKey(str) ? (String) f54576m.get(str) : str;
    }

    public static String b(String str) {
        return f54577n.containsKey(str) ? (String) f54577n.get(str) : str;
    }

    public static boolean c(String str, String str2, InterfaceC5833b interfaceC5833b) {
        ULocale uLocale = (ULocale) interfaceC5833b.getLocale();
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            availableNames = Collator.getKeywordValuesForLocale("co", uLocale, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }

    public static String d(String str) {
        return !f54579p.containsKey(str) ? str : (String) f54579p.get(str);
    }

    public static String e(String str) {
        Map map = f54578o;
        return !map.containsKey(str) ? str : (String) map.get(str);
    }

    public static Object f(String str, Object obj) {
        return (str.equals("ca") && o6.d.m(obj)) ? d((String) obj) : (str.equals("nu") && o6.d.m(obj)) ? g((String) obj) : (str.equals("co") && o6.d.m(obj)) ? e((String) obj) : (str.equals("kn") && o6.d.m(obj) && obj.equals("yes")) ? o6.d.r(com.amazon.a.a.o.b.f34640af) : ((str.equals("kn") || str.equals("kf")) && o6.d.m(obj) && obj.equals("no")) ? o6.d.r(com.amazon.a.a.o.b.f34641ag) : obj;
    }

    public static String g(String str) {
        return !f54580q.containsKey(str) ? str : (String) f54580q.get(str);
    }
}
