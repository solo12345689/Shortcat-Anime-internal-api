package G1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f6981b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f6982a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f6983a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getDefault();
        }
    }

    private i(j jVar) {
        this.f6982a = jVar;
    }

    public static i a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f34694a, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static i d() {
        return i(b.b());
    }

    public static i e() {
        return f6981b;
    }

    public static i i(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i10) {
        return this.f6982a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f6982a.equals(((i) obj).f6982a);
    }

    public boolean f() {
        return this.f6982a.isEmpty();
    }

    public int g() {
        return this.f6982a.size();
    }

    public String h() {
        return this.f6982a.a();
    }

    public int hashCode() {
        return this.f6982a.hashCode();
    }

    public String toString() {
        return this.f6982a.toString();
    }
}
