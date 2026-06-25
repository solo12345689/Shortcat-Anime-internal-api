package dg;

import ce.AbstractC3098c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: e */
    public static final a f45605e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final Pattern f45606f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g */
    private static final Pattern f45607g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    private final String f45608a;

    /* JADX INFO: renamed from: b */
    private final String f45609b;

    /* JADX INFO: renamed from: c */
    private final String f45610c;

    /* JADX INFO: renamed from: d */
    private final String[] f45611d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(String mediaType) {
            AbstractC5504s.h(mediaType, "mediaType");
            return c(mediaType);
        }

        public final x b(String str) {
            AbstractC5504s.h(str, "<this>");
            Matcher matcher = x.f45606f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            AbstractC5504s.g(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            AbstractC5504s.g(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            AbstractC5504s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            AbstractC5504s.g(strGroup2, "typeSubtype.group(2)");
            AbstractC5504s.g(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            AbstractC5504s.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = x.f45607g.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    AbstractC5504s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (Df.r.Q(strGroup4, "'", false, 2, null) && Df.r.A(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        AbstractC5504s.g(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new x(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        public final x c(String str) {
            AbstractC5504s.h(str, "<this>");
            try {
                return b(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset d(x xVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return xVar.c(charset);
    }

    public final Charset c(Charset charset) {
        String strE = e("charset");
        if (strE == null) {
            return charset;
        }
        try {
            return Charset.forName(strE);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String e(String name) {
        AbstractC5504s.h(name, "name");
        int i10 = 0;
        int iC = AbstractC3098c.c(0, this.f45611d.length - 1, 2);
        if (iC < 0) {
            return null;
        }
        while (!Df.r.B(this.f45611d[i10], name, true)) {
            if (i10 == iC) {
                return null;
            }
            i10 += 2;
        }
        return this.f45611d[i10 + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && AbstractC5504s.c(((x) obj).f45608a, this.f45608a);
    }

    public final String f() {
        return this.f45609b;
    }

    public int hashCode() {
        return this.f45608a.hashCode();
    }

    public String toString() {
        return this.f45608a;
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.f45608a = str;
        this.f45609b = str2;
        this.f45610c = str3;
        this.f45611d = strArr;
    }
}
