package dg;

import Ud.AbstractC2279u;
import fg.AbstractC4803a;
import fg.AbstractC4807e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kg.AbstractC5480c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f45533j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f45534k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f45535l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f45536m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f45537n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f45540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f45541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f45543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f45544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f45545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f45546i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f45547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45548b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f45550d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f45552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f45553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f45554h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f45555i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f45549c = 253402300799999L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f45551e = "/";

        private final a c(String str, boolean z10) {
            String strE = AbstractC4803a.e(str);
            if (strE != null) {
                this.f45550d = strE;
                this.f45555i = z10;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final m a() {
            String str = this.f45547a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f45548b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.f45549c;
            String str3 = this.f45550d;
            if (str3 != null) {
                return new m(str, str2, j10, str3, this.f45551e, this.f45552f, this.f45553g, this.f45554h, this.f45555i, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final a b(String domain) {
            AbstractC5504s.h(domain, "domain");
            return c(domain, false);
        }

        public final a d(String name) {
            AbstractC5504s.h(name, "name");
            if (!AbstractC5504s.c(Df.r.k1(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f45547a = name;
            return this;
        }

        public final a e(String value) {
            AbstractC5504s.h(value, "value");
            if (!AbstractC5504s.c(Df.r.k1(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f45548b = value;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (AbstractC5504s.c(str, str2)) {
                return true;
            }
            return Df.r.A(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !AbstractC4807e.i(str);
        }

        private final String f(String str) {
            if (Df.r.A(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = AbstractC4803a.e(Df.r.C0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = m.f45537n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iJ0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(m.f45537n).matches()) {
                    String strGroup = matcher.group(1);
                    AbstractC5504s.g(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    AbstractC5504s.g(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    AbstractC5504s.g(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(m.f45536m).matches()) {
                    String strGroup4 = matcher.group(1);
                    AbstractC5504s.g(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iJ0 == -1 && matcher.usePattern(m.f45535l).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC5504s.g(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    AbstractC5504s.g(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    AbstractC5504s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f45535l.pattern();
                    AbstractC5504s.g(strPattern, "MONTH_PATTERN.pattern()");
                    iJ0 = Df.r.j0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f45534k).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC5504s.g(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iJ0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC4807e.f47067f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iJ0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Df.p("-?\\d+").h(str)) {
                    return Df.r.Q(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final m c(u url, String setCookie) {
            AbstractC5504s.h(url, "url");
            AbstractC5504s.h(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final m d(long j10, u url, String setCookie) {
            long j11;
            AbstractC5504s.h(url, "url");
            AbstractC5504s.h(setCookie, "setCookie");
            int iR = AbstractC4807e.r(setCookie, ';', 0, 0, 6, null);
            int iR2 = AbstractC4807e.r(setCookie, '=', 0, iR, 2, null);
            m mVar = null;
            if (iR2 == iR) {
                return null;
            }
            String strA0 = AbstractC4807e.a0(setCookie, 0, iR2, 1, null);
            if (strA0.length() == 0 || AbstractC4807e.y(strA0) != -1) {
                return null;
            }
            String strZ = AbstractC4807e.Z(setCookie, iR2 + 1, iR);
            if (AbstractC4807e.y(strZ) != -1) {
                return null;
            }
            int i10 = iR + 1;
            int length = setCookie.length();
            String strF = null;
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i10 < length) {
                int iP = AbstractC4807e.p(setCookie, ';', i10, length);
                int iP2 = AbstractC4807e.p(setCookie, '=', i10, iP);
                String strZ2 = AbstractC4807e.Z(setCookie, i10, iP2);
                String strZ3 = iP2 < iP ? AbstractC4807e.Z(setCookie, iP2 + 1, iP) : "";
                m mVar2 = mVar;
                if (Df.r.B(strZ2, "expires", true)) {
                    try {
                        jG = g(strZ3, 0, strZ3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (Df.r.B(strZ2, "max-age", true)) {
                    jH = h(strZ3);
                    z11 = true;
                } else if (Df.r.B(strZ2, "domain", true)) {
                    strF = f(strZ3);
                    z13 = false;
                } else if (Df.r.B(strZ2, "path", true)) {
                    str = strZ3;
                } else if (Df.r.B(strZ2, "secure", true)) {
                    z12 = true;
                } else if (Df.r.B(strZ2, "httponly", true)) {
                    z10 = true;
                }
                i10 = iP + 1;
                mVar = mVar2;
            }
            m mVar3 = mVar;
            if (jH == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j12 = j10 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jG;
            }
            String strH = url.h();
            if (strF == null) {
                strF = strH;
            } else if (!b(strH, strF)) {
                return mVar3;
            }
            if (strH.length() != strF.length() && PublicSuffixDatabase.INSTANCE.c().c(strF) == null) {
                return mVar3;
            }
            String strSubstring = "/";
            if (str == null || !Df.r.Q(str, "/", false, 2, mVar3)) {
                String strD = url.d();
                int iO0 = Df.r.o0(strD, '/', 0, false, 6, null);
                if (iO0 != 0) {
                    strSubstring = strD.substring(0, iO0);
                    AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new m(strA0, strZ, j11, strF, str, z12, z10, z11, z13, null);
        }

        public final List e(u url, t headers) {
            AbstractC5504s.h(url, "url");
            AbstractC5504s.h(headers, "headers");
            List listR = headers.r("Set-Cookie");
            int size = listR.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m mVarC = c(url, (String) listR.get(i10));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            if (arrayList == null) {
                return AbstractC2279u.m();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC5504s.g(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        private b() {
        }
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String a() {
        return this.f45538a;
    }

    public final String b() {
        return this.f45539b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC5504s.c(mVar.f45538a, this.f45538a) && AbstractC5504s.c(mVar.f45539b, this.f45539b) && mVar.f45540c == this.f45540c && AbstractC5504s.c(mVar.f45541d, this.f45541d) && AbstractC5504s.c(mVar.f45542e, this.f45542e) && mVar.f45543f == this.f45543f && mVar.f45544g == this.f45544g && mVar.f45545h == this.f45545h && mVar.f45546i == this.f45546i;
    }

    public final String g() {
        return this.f45538a;
    }

    public final String h(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45538a);
        sb2.append('=');
        sb2.append(this.f45539b);
        if (this.f45545h) {
            if (this.f45540c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(AbstractC5480c.b(new Date(this.f45540c)));
            }
        }
        if (!this.f45546i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f45541d);
        }
        sb2.append("; path=");
        sb2.append(this.f45542e);
        if (this.f45543f) {
            sb2.append("; secure");
        }
        if (this.f45544g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString()");
        return string;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f45538a.hashCode()) * 31) + this.f45539b.hashCode()) * 31) + Long.hashCode(this.f45540c)) * 31) + this.f45541d.hashCode()) * 31) + this.f45542e.hashCode()) * 31) + Boolean.hashCode(this.f45543f)) * 31) + Boolean.hashCode(this.f45544g)) * 31) + Boolean.hashCode(this.f45545h)) * 31) + Boolean.hashCode(this.f45546i);
    }

    public final String i() {
        return this.f45539b;
    }

    public String toString() {
        return h(false);
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f45538a = str;
        this.f45539b = str2;
        this.f45540c = j10;
        this.f45541d = str3;
        this.f45542e = str4;
        this.f45543f = z10;
        this.f45544g = z11;
        this.f45545h = z12;
        this.f45546i = z13;
    }
}
