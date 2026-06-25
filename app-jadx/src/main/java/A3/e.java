package A3;

import A3.e;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s2.AbstractC6412j;
import s2.C6403a;
import s2.C6409g;
import s2.C6411i;
import s2.C6414l;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f239a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f240b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f242d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f243c = new Comparator() { // from class: A3.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((e.b) obj).f244a.f247b, ((e.b) obj2).f244a.f247b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f245b;

        private b(c cVar, int i10) {
            this.f244a = cVar;
            this.f245b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f249d;

        private c(String str, int i10, String str2, Set set) {
            this.f247b = i10;
            this.f246a = str;
            this.f248c = str2;
            this.f249d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            AbstractC6614a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrV1 = a0.v1(strTrim, "\\.");
            String str3 = strArrV1[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrV1.length; i11++) {
                hashSet.add(strArrV1[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final A3.c f251b;

        public d(int i10, A3.c cVar) {
            this.f250a = i10;
            this.f251b = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f250a, dVar.f250a);
        }
    }

    /* JADX INFO: renamed from: A3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0002e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f254c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f252a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f253b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f255d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f256e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f257f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f258g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f259h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f260i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f261j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f262k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            AbstractC6635w.i("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public A3.d a() {
            return new A3.d(g().a(), this.f252a, this.f253b);
        }

        public C6403a.b g() {
            float fE = this.f259h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f255d);
            }
            int iF = this.f260i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f255d);
            }
            C6403a.b bVarR = new C6403a.b().p(c(this.f255d)).h(b(this.f256e, this.f257f), this.f257f).i(this.f258g).k(fE).l(iF).n(Math.min(this.f261j, d(iF, fE))).r(this.f262k);
            CharSequence charSequence = this.f254c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f241c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f242d = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i10, int i11) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f241c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i10, i11, 33);
            } else {
                Map map2 = f242d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                AbstractC6635w.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int iJ = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f243c);
        int i10 = cVar.f247b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((b) arrayList.get(i11)).f244a.f246a)) {
                b bVar = (b) arrayList.get(i11);
                int iH = h(j(list2, str, bVar.f244a), iJ, 1);
                int i12 = bVar.f244a.f247b - length;
                int i13 = bVar.f245b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new C6411i(charSequenceSubSequence.toString(), iH), i10, i12, 33);
                length += charSequenceSubSequence.length();
                i10 = i12;
            }
        }
    }

    private static void d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10;
        int length;
        i10 = cVar.f247b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f246a;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f249d, i10, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.f248c, i10, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List listI = i(list2, str, cVar);
        for (int i11 = 0; i11 < listI.size(); i11++) {
            e(spannableStringBuilder, ((d) listI.get(i11)).f251b, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, A3.c cVar, int i10, int i11) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            AbstractC6412j.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (cVar.k()) {
            AbstractC6412j.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
        }
        if (cVar.j()) {
            AbstractC6412j.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
        }
        if (cVar.d() != null) {
            AbstractC6412j.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            AbstractC6412j.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            AbstractC6412j.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            AbstractC6412j.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new C6409g(), i10, i11, 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        spannableStringBuilder.setSpan(new C6414l(str), i10, i11, 33);
    }

    private static int g(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int h(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List i(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            A3.c cVar2 = (A3.c) list.get(i10);
            int iH = cVar2.h(str, cVar.f246a, cVar.f249d, cVar.f248c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List list, String str, c cVar) {
        List listI = i(list, str, cVar);
        for (int i10 = 0; i10 < listI.size(); i10++) {
            A3.c cVar2 = ((d) listI.get(i10)).f251b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String strTrim = str.trim();
        AbstractC6614a.a(!strTrim.isEmpty());
        return a0.w1(strTrim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static C6403a m(CharSequence charSequence) {
        C0002e c0002e = new C0002e();
        c0002e.f254c = charSequence;
        return c0002e.g().a();
    }

    private static A3.d n(String str, Matcher matcher, C6609I c6609i, List list) {
        C0002e c0002e = new C0002e();
        try {
            c0002e.f252a = h.d((String) AbstractC6614a.e(matcher.group(1)));
            c0002e.f253b = h.d((String) AbstractC6614a.e(matcher.group(2)));
            q((String) AbstractC6614a.e(matcher.group(3)), c0002e);
            StringBuilder sb2 = new StringBuilder();
            String strX = c6609i.x();
            while (!TextUtils.isEmpty(strX)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strX.trim());
                strX = c6609i.x();
            }
            c0002e.f254c = r(str, sb2.toString(), list);
            return c0002e.a();
        } catch (IllegalArgumentException unused) {
            AbstractC6635w.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static A3.d o(C6609I c6609i, List list) {
        String strX = c6609i.x();
        if (strX == null) {
            return null;
        }
        Pattern pattern = f239a;
        Matcher matcher = pattern.matcher(strX);
        if (matcher.matches()) {
            return n(null, matcher, c6609i, list);
        }
        String strX2 = c6609i.x();
        if (strX2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strX2);
        if (matcher2.matches()) {
            return n(strX.trim(), matcher2, c6609i, list);
        }
        return null;
    }

    static C6403a.b p(String str) {
        C0002e c0002e = new C0002e();
        q(str, c0002e);
        return c0002e.g();
    }

    private static void q(String str, C0002e c0002e) {
        Matcher matcher = f240b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC6614a.e(matcher.group(1));
            String str3 = (String) AbstractC6614a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, c0002e);
                } else if ("align".equals(str2)) {
                    c0002e.f255d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, c0002e);
                } else if ("size".equals(str2)) {
                    c0002e.f261j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c0002e.f262k = x(str3);
                } else {
                    AbstractC6635w.i("WebvttCueParser", "Unknown cue setting " + str2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str3);
                }
            } catch (NumberFormatException unused) {
                AbstractC6635w.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString r(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iG = i10 + 1;
                if (iG < str2.length()) {
                    boolean z10 = str2.charAt(iG) == '/';
                    iG = g(str2, iG);
                    int i11 = iG - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iG - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strK = k(strSubstring);
                        if (l(strK)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f246a.equals(strK)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iG;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int s(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                AbstractC6635w.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void t(String str, C0002e c0002e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0002e.f258g = s(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0002e.f256e = h.c(str);
            c0002e.f257f = 0;
        } else {
            c0002e.f256e = Integer.parseInt(str);
            c0002e.f257f = 1;
        }
    }

    private static int u(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                AbstractC6635w.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void v(String str, C0002e c0002e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0002e.f260i = u(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c0002e.f259h = h.c(str);
    }

    private static int w(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                AbstractC6635w.i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        AbstractC6635w.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
