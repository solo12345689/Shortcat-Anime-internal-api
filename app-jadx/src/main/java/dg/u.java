package dg;

import Ud.AbstractC2279u;
import com.adjust.sdk.Constants;
import com.facebook.imageutils.JfifUtil;
import fg.AbstractC4803a;
import fg.AbstractC4807e;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5868d;
import tg.C6683h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: k */
    public static final b f45583k = new b(null);

    /* JADX INFO: renamed from: l */
    private static final char[] f45584l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    private final String f45585a;

    /* JADX INFO: renamed from: b */
    private final String f45586b;

    /* JADX INFO: renamed from: c */
    private final String f45587c;

    /* JADX INFO: renamed from: d */
    private final String f45588d;

    /* JADX INFO: renamed from: e */
    private final int f45589e;

    /* JADX INFO: renamed from: f */
    private final List f45590f;

    /* JADX INFO: renamed from: g */
    private final List f45591g;

    /* JADX INFO: renamed from: h */
    private final String f45592h;

    /* JADX INFO: renamed from: i */
    private final String f45593i;

    /* JADX INFO: renamed from: j */
    private final boolean f45594j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: i */
        public static final C0721a f45595i = new C0721a(null);

        /* JADX INFO: renamed from: a */
        private String f45596a;

        /* JADX INFO: renamed from: d */
        private String f45599d;

        /* JADX INFO: renamed from: f */
        private final List f45601f;

        /* JADX INFO: renamed from: g */
        private List f45602g;

        /* JADX INFO: renamed from: h */
        private String f45603h;

        /* JADX INFO: renamed from: b */
        private String f45597b = "";

        /* JADX INFO: renamed from: c */
        private String f45598c = "";

        /* JADX INFO: renamed from: e */
        private int f45600e = -1;

        /* JADX INFO: renamed from: dg.u$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0721a {
            public /* synthetic */ C0721a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int e(String str, int i10, int i11) {
                int i12;
                try {
                    i12 = Integer.parseInt(b.b(u.f45583k, str, i10, i11, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i12 || i12 >= 65536) {
                    return -1;
                }
                return i12;
            }

            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((AbstractC5504s.i(cCharAt, 97) >= 0 && AbstractC5504s.i(cCharAt, 122) <= 0) || (AbstractC5504s.i(cCharAt, 65) >= 0 && AbstractC5504s.i(cCharAt, 90) <= 0)) {
                    while (true) {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            private C0721a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f45601f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i10 = this.f45600e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = u.f45583k;
            String str = this.f45596a;
            AbstractC5504s.e(str);
            return bVar.c(str);
        }

        private final boolean f(String str) {
            return AbstractC5504s.c(str, ".") || Df.r.B(str, "%2e", true);
        }

        private final boolean g(String str) {
            return AbstractC5504s.c(str, "..") || Df.r.B(str, "%2e.", true) || Df.r.B(str, ".%2e", true) || Df.r.B(str, "%2e%2e", true);
        }

        private final void j() {
            if (((String) this.f45601f.remove(r0.size() - 1)).length() != 0 || this.f45601f.isEmpty()) {
                this.f45601f.add("");
            } else {
                this.f45601f.set(r0.size() - 1, "");
            }
        }

        private final void l(String str, int i10, int i11, boolean z10, boolean z11) {
            String strB = b.b(u.f45583k, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (f(strB)) {
                return;
            }
            if (g(strB)) {
                j();
                return;
            }
            if (((CharSequence) this.f45601f.get(r14.size() - 1)).length() == 0) {
                this.f45601f.set(r14.size() - 1, strB);
            } else {
                this.f45601f.add(strB);
            }
            if (z10) {
                this.f45601f.add("");
            }
        }

        private final void n(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f45601f.clear();
                this.f45601f.add("");
                i10++;
            } else {
                List list = this.f45601f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iQ = AbstractC4807e.q(str, "/\\", i12, i11);
                boolean z10 = iQ < i11;
                String str2 = str;
                l(str2, i12, iQ, z10, true);
                if (z10) {
                    i12 = iQ + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iQ;
                }
            }
        }

        public final u a() {
            ArrayList arrayList;
            String str = this.f45596a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = u.f45583k;
            String strH = b.h(bVar, this.f45597b, 0, 0, false, 7, null);
            String strH2 = b.h(bVar, this.f45598c, 0, 0, false, 7, null);
            String str2 = this.f45599d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List list = this.f45601f;
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.h(u.f45583k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f45602g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? b.h(u.f45583k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f45603h;
            return new u(str, strH, strH2, str2, iB, arrayList2, arrayList, str4 != null ? b.h(u.f45583k, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final a c(String str) {
            b bVar;
            String strB;
            this.f45602g = (str == null || (strB = b.b((bVar = u.f45583k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.j(strB);
            return this;
        }

        public final List d() {
            return this.f45601f;
        }

        public final a e(String host) {
            AbstractC5504s.h(host, "host");
            String strE = AbstractC4803a.e(b.h(u.f45583k, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.f45599d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a h(u uVar, String str) {
            String str2;
            int iQ;
            int i10;
            String str3;
            int i11;
            String str4;
            boolean z10;
            int i12;
            int i13;
            int i14;
            char c10;
            int i15;
            String input = str;
            AbstractC5504s.h(input, "input");
            int iA = AbstractC4807e.A(input, 0, 0, 3, null);
            int iC = AbstractC4807e.C(input, iA, 0, 2, null);
            C0721a c0721a = f45595i;
            int iG = c0721a.g(input, iA, iC);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z11 = true;
            int i16 = -1;
            if (iG != -1) {
                if (Df.r.N(input, "https:", iA, true)) {
                    this.f45596a = Constants.SCHEME;
                    iA += 6;
                } else {
                    if (!Df.r.N(input, "http:", iA, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f45596a = "http";
                    iA += 5;
                }
            } else {
                if (uVar == null) {
                    if (input.length() > 6) {
                        str2 = Df.r.s1(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f45596a = uVar.q();
            }
            int iH = c0721a.h(input, iA, iC);
            int i17 = 63;
            int i18 = 35;
            if (iH >= 2 || uVar == null || !AbstractC5504s.c(uVar.q(), this.f45596a)) {
                int i19 = iA + iH;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    iQ = AbstractC4807e.q(input, "@/\\?#", i19, iC);
                    int iCharAt = iQ != iC ? input.charAt(iQ) : i16;
                    if (iCharAt == i16 || iCharAt == i18 || iCharAt == 47 || iCharAt == 92 || iCharAt == i17) {
                        break;
                    }
                    if (iCharAt == 64) {
                        if (z12) {
                            i11 = iC;
                            str4 = str5;
                            z10 = z11;
                            i12 = i16;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f45598c);
                            sb3.append("%40");
                            input = str;
                            i13 = iQ;
                            sb3.append(b.b(u.f45583k, input, i19, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f45598c = sb3.toString();
                        } else {
                            int iP = AbstractC4807e.p(input, ':', i19, iQ);
                            b bVar = u.f45583k;
                            str4 = str5;
                            i12 = i16;
                            i11 = iC;
                            z10 = z11;
                            String strB = b.b(bVar, input, i19, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z13) {
                                strB = this.f45597b + "%40" + strB;
                            }
                            this.f45597b = strB;
                            if (iP != iQ) {
                                i14 = iQ;
                                this.f45598c = b.b(bVar, str, iP + 1, i14, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = z10;
                            } else {
                                i14 = iQ;
                            }
                            input = str;
                            i13 = i14;
                            z13 = z10;
                        }
                        i19 = i13 + 1;
                        i16 = i12;
                        iC = i11;
                        str5 = str4;
                        z11 = z10;
                        i17 = 63;
                        i18 = 35;
                    }
                }
                i10 = iC;
                String str6 = str5;
                int i20 = i16;
                C0721a c0721a2 = f45595i;
                int iF = c0721a2.f(input, i19, iQ);
                int i21 = iF + 1;
                if (i21 < iQ) {
                    this.f45599d = AbstractC4803a.e(b.h(u.f45583k, input, i19, iF, false, 4, null));
                    int iE = c0721a2.e(input, i21, iQ);
                    this.f45600e = iE;
                    if (iE == i20) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i21, iQ);
                        AbstractC5504s.g(strSubstring2, str6);
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str3 = str6;
                } else {
                    str3 = str6;
                    b bVar2 = u.f45583k;
                    this.f45599d = AbstractC4803a.e(b.h(bVar2, input, i19, iF, false, 4, null));
                    String str7 = this.f45596a;
                    AbstractC5504s.e(str7);
                    this.f45600e = bVar2.c(str7);
                }
                if (this.f45599d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i19, iF);
                    AbstractC5504s.g(strSubstring3, str3);
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iA = iQ;
            } else {
                this.f45597b = uVar.g();
                this.f45598c = uVar.c();
                this.f45599d = uVar.h();
                this.f45600e = uVar.m();
                this.f45601f.clear();
                this.f45601f.addAll(uVar.e());
                if (iA == iC || input.charAt(iA) == '#') {
                    c(uVar.f());
                }
                i10 = iC;
            }
            int i22 = i10;
            int iQ2 = AbstractC4807e.q(input, "?#", iA, i22);
            n(input, iA, iQ2);
            if (iQ2 >= i22 || input.charAt(iQ2) != '?') {
                c10 = '#';
                i15 = iQ2;
            } else {
                c10 = '#';
                int iP2 = AbstractC4807e.p(input, '#', iQ2, i22);
                b bVar3 = u.f45583k;
                this.f45602g = bVar3.j(b.b(bVar3, input, iQ2 + 1, iP2, " \"'<>#", true, false, true, false, null, JfifUtil.MARKER_RST0, null));
                i15 = iP2;
            }
            if (i15 < i22 && input.charAt(i15) == c10) {
                this.f45603h = b.b(u.f45583k, input, i15 + 1, i22, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a i(String password) {
            AbstractC5504s.h(password, "password");
            this.f45598c = b.b(u.f45583k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a k(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f45600e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a m() {
            String str = this.f45599d;
            this.f45599d = str != null ? new Df.p("[\"<>^`{|}]").i(str, "") : null;
            int size = this.f45601f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f45601f;
                list.set(i10, b.b(u.f45583k, (String) list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f45602g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? b.b(u.f45583k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f45603h;
            this.f45603h = str3 != null ? b.b(u.f45583k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a o(String scheme) {
            AbstractC5504s.h(scheme, "scheme");
            if (Df.r.B(scheme, "http", true)) {
                this.f45596a = "http";
                return this;
            }
            if (Df.r.B(scheme, Constants.SCHEME, true)) {
                this.f45596a = Constants.SCHEME;
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void p(String str) {
            this.f45603h = str;
        }

        public final void q(String str) {
            AbstractC5504s.h(str, "<set-?>");
            this.f45598c = str;
        }

        public final void r(String str) {
            AbstractC5504s.h(str, "<set-?>");
            this.f45597b = str;
        }

        public final void s(String str) {
            this.f45599d = str;
        }

        public final void t(int i10) {
            this.f45600e = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f45596a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f45597b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f45598c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f45597b
                r0.append(r1)
                java.lang.String r1 = r6.f45598c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f45598c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f45599d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.AbstractC5504s.e(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = Df.r.V(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f45599d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f45599d
                r0.append(r1)
            L69:
                int r1 = r6.f45600e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f45596a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.b()
                java.lang.String r3 = r6.f45596a
                if (r3 == 0) goto L85
                dg.u$b r4 = dg.u.f45583k
                kotlin.jvm.internal.AbstractC5504s.e(r3)
                int r3 = r4.c(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                dg.u$b r1 = dg.u.f45583k
                java.util.List r2 = r6.f45601f
                r1.i(r2, r0)
                java.util.List r2 = r6.f45602g
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.f45602g
                kotlin.jvm.internal.AbstractC5504s.e(r2)
                r1.k(r2, r0)
            La3:
                java.lang.String r1 = r6.f45603h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f45603h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dg.u.a.toString():java.lang.String");
        }

        public final void u(String str) {
            this.f45596a = str;
        }

        public final a v(String username) {
            AbstractC5504s.h(username, "username");
            this.f45597b = b.b(u.f45583k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return bVar.a(str, i10, i11, str2, z10, z11, z12, z13, charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && AbstractC4807e.I(str.charAt(i10 + 1)) != -1 && AbstractC4807e.I(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        private final void l(C6683h c6683h, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            int iCharCount = i10;
            C6683h c6683h2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        c6683h.s0(z10 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z13)) {
                            if (!Df.r.V(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z10 && (!z11 || e(str, iCharCount, i11))))) {
                                c6683h.k2(iCodePointAt);
                            }
                        }
                        if (c6683h2 == null) {
                            c6683h2 = new C6683h();
                        }
                        if (charset == null || AbstractC5504s.c(charset, StandardCharsets.UTF_8)) {
                            c6683h2.k2(iCodePointAt);
                        } else {
                            c6683h2.g2(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c6683h2.f1()) {
                            byte b10 = c6683h2.readByte();
                            c6683h.writeByte(37);
                            c6683h.writeByte(u.f45584l[((b10 & 255) >> 4) & 15]);
                            c6683h.writeByte(u.f45584l[b10 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void m(C6683h c6683h, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int I10 = AbstractC4807e.I(str.charAt(i10 + 1));
                    int I11 = AbstractC4807e.I(str.charAt(i12));
                    if (I10 == -1 || I11 == -1) {
                        c6683h.k2(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        c6683h.writeByte((I10 << 4) + I11);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    c6683h.writeByte(32);
                    i10++;
                } else {
                    c6683h.k2(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        public final String a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            AbstractC5504s.h(str, "<this>");
            AbstractC5504s.h(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || Df.r.V(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                    C6683h c6683h = new C6683h();
                    c6683h.j2(str, i10, iCharCount);
                    l(c6683h, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                    return c6683h.M1();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int c(String scheme) {
            AbstractC5504s.h(scheme, "scheme");
            if (AbstractC5504s.c(scheme, "http")) {
                return 80;
            }
            return AbstractC5504s.c(scheme, Constants.SCHEME) ? 443 : -1;
        }

        public final u d(String str) {
            AbstractC5504s.h(str, "<this>");
            return new a().h(null, str).a();
        }

        public final u f(String str) {
            AbstractC5504s.h(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            AbstractC5504s.h(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    C6683h c6683h = new C6683h();
                    c6683h.j2(str, i10, i12);
                    m(c6683h, str, i12, i11, z10);
                    return c6683h.M1();
                }
            }
            String strSubstring = str.substring(i10, i11);
            AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void i(List list, StringBuilder out) {
            AbstractC5504s.h(list, "<this>");
            AbstractC5504s.h(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append((String) list.get(i10));
            }
        }

        public final List j(String str) {
            AbstractC5504s.h(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iI0 = Df.r.i0(str2, '&', i10, false, 4, null);
                if (iI0 == -1) {
                    iI0 = str2.length();
                }
                int iI02 = Df.r.i0(str2, '=', i10, false, 4, null);
                if (iI02 == -1 || iI02 > iI0) {
                    String strSubstring = str2.substring(i10, iI0);
                    AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iI02);
                    AbstractC5504s.g(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iI02 + 1, iI0);
                    AbstractC5504s.g(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iI0 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void k(List list, StringBuilder out) {
            AbstractC5504s.h(list, "<this>");
            AbstractC5504s.h(out, "out");
            C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, list.size()), 2);
            int iF = c5868dV.f();
            int i10 = c5868dV.i();
            int iL = c5868dV.l();
            if ((iL <= 0 || iF > i10) && (iL >= 0 || i10 > iF)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iF);
                String str2 = (String) list.get(iF + 1);
                if (iF > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iF == i10) {
                    return;
                } else {
                    iF += iL;
                }
            }
        }

        private b() {
        }
    }

    public u(String scheme, String username, String password, String host, int i10, List pathSegments, List list, String str, String url) {
        AbstractC5504s.h(scheme, "scheme");
        AbstractC5504s.h(username, "username");
        AbstractC5504s.h(password, "password");
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(pathSegments, "pathSegments");
        AbstractC5504s.h(url, "url");
        this.f45585a = scheme;
        this.f45586b = username;
        this.f45587c = password;
        this.f45588d = host;
        this.f45589e = i10;
        this.f45590f = pathSegments;
        this.f45591g = list;
        this.f45592h = str;
        this.f45593i = url;
        this.f45594j = AbstractC5504s.c(scheme, Constants.SCHEME);
    }

    public static final u l(String str) {
        return f45583k.f(str);
    }

    public final String b() {
        if (this.f45592h == null) {
            return null;
        }
        String strSubstring = this.f45593i.substring(Df.r.i0(this.f45593i, '#', 0, false, 6, null) + 1);
        AbstractC5504s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f45587c.length() == 0) {
            return "";
        }
        String strSubstring = this.f45593i.substring(Df.r.i0(this.f45593i, ':', this.f45585a.length() + 3, false, 4, null) + 1, Df.r.i0(this.f45593i, '@', 0, false, 6, null));
        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iI0 = Df.r.i0(this.f45593i, '/', this.f45585a.length() + 3, false, 4, null);
        String str = this.f45593i;
        String strSubstring = this.f45593i.substring(iI0, AbstractC4807e.q(str, "?#", iI0, str.length()));
        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iI0 = Df.r.i0(this.f45593i, '/', this.f45585a.length() + 3, false, 4, null);
        String str = this.f45593i;
        int iQ = AbstractC4807e.q(str, "?#", iI0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iI0 < iQ) {
            int i10 = iI0 + 1;
            int iP = AbstractC4807e.p(this.f45593i, '/', i10, iQ);
            String strSubstring = this.f45593i.substring(i10, iP);
            AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iI0 = iP;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && AbstractC5504s.c(((u) obj).f45593i, this.f45593i);
    }

    public final String f() {
        if (this.f45591g == null) {
            return null;
        }
        int iI0 = Df.r.i0(this.f45593i, '?', 0, false, 6, null) + 1;
        String str = this.f45593i;
        String strSubstring = this.f45593i.substring(iI0, AbstractC4807e.p(str, '#', iI0, str.length()));
        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.f45586b.length() == 0) {
            return "";
        }
        int length = this.f45585a.length() + 3;
        String str = this.f45593i;
        String strSubstring = this.f45593i.substring(length, AbstractC4807e.q(str, ":@", length, str.length()));
        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String h() {
        return this.f45588d;
    }

    public int hashCode() {
        return this.f45593i.hashCode();
    }

    public final boolean i() {
        return this.f45594j;
    }

    public final a j() {
        a aVar = new a();
        aVar.u(this.f45585a);
        aVar.r(g());
        aVar.q(c());
        aVar.s(this.f45588d);
        aVar.t(this.f45589e != f45583k.c(this.f45585a) ? this.f45589e : -1);
        aVar.d().clear();
        aVar.d().addAll(e());
        aVar.c(f());
        aVar.p(b());
        return aVar;
    }

    public final a k(String link) {
        AbstractC5504s.h(link, "link");
        try {
            return new a().h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int m() {
        return this.f45589e;
    }

    public final String n() {
        if (this.f45591g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f45583k.k(this.f45591g, sb2);
        return sb2.toString();
    }

    public final String o() {
        a aVarK = k("/...");
        AbstractC5504s.e(aVarK);
        return aVarK.v("").i("").a().toString();
    }

    public final u p(String link) {
        AbstractC5504s.h(link, "link");
        a aVarK = k(link);
        if (aVarK != null) {
            return aVarK.a();
        }
        return null;
    }

    public final String q() {
        return this.f45585a;
    }

    public final URI r() {
        String string = j().m().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Df.p("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").i(string, ""));
                AbstractC5504s.g(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL s() {
        try {
            return new URL(this.f45593i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f45593i;
    }
}
