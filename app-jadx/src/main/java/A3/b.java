package A3;

import android.text.TextUtils;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t2.AbstractC6614a;
import t2.AbstractC6625l;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f215c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f216d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f217a = new C6609I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f218b = new StringBuilder();

    private void a(c cVar, String str) {
        if (str.isEmpty()) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f215c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) AbstractC6614a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrV1 = a0.v1(str, "\\.");
        String str2 = strArrV1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrV1.length > 1) {
            cVar.w((String[]) a0.c1(strArrV1, 1, strArrV1.length));
        }
    }

    private static boolean b(C6609I c6609i) {
        int iG = c6609i.g();
        int iJ = c6609i.j();
        byte[] bArrF = c6609i.f();
        if (iG + 2 > iJ) {
            return false;
        }
        int i10 = iG + 1;
        if (bArrF[iG] != 47) {
            return false;
        }
        int i11 = iG + 2;
        if (bArrF[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iJ) {
                c6609i.c0(iJ - c6609i.g());
                return true;
            }
            if (((char) bArrF[i11]) == '*' && ((char) bArrF[i12]) == '/') {
                i11 += 2;
                iJ = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(C6609I c6609i) {
        char cK = k(c6609i, c6609i.g());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        c6609i.c0(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f216d.matcher(O9.c.e(str));
        if (!matcher.matches()) {
            AbstractC6635w.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) AbstractC6614a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) AbstractC6614a.e(matcher.group(1))));
    }

    private static String f(C6609I c6609i, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iG = c6609i.g();
        int iJ = c6609i.j();
        while (iG < iJ && !z10) {
            char c10 = (char) c6609i.f()[iG];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iG++;
                sb2.append(c10);
            }
        }
        c6609i.c0(iG - c6609i.g());
        return sb2.toString();
    }

    static String g(C6609I c6609i, StringBuilder sb2) {
        n(c6609i);
        if (c6609i.a() == 0) {
            return null;
        }
        String strF = f(c6609i, sb2);
        if (!strF.isEmpty()) {
            return strF;
        }
        return "" + ((char) c6609i.M());
    }

    private static String h(C6609I c6609i, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iG = c6609i.g();
            String strG = g(c6609i, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                c6609i.b0(iG);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    private static String i(C6609I c6609i, StringBuilder sb2) {
        n(c6609i);
        if (c6609i.a() < 5 || !"::cue".equals(c6609i.J(5))) {
            return null;
        }
        int iG = c6609i.g();
        String strG = g(c6609i, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            c6609i.b0(iG);
            return "";
        }
        String strL = "(".equals(strG) ? l(c6609i) : null;
        if (")".equals(g(c6609i, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(C6609I c6609i, c cVar, StringBuilder sb2) {
        n(c6609i);
        String strF = f(c6609i, sb2);
        if (!strF.isEmpty() && Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(g(c6609i, sb2))) {
            n(c6609i);
            String strH = h(c6609i, sb2);
            if (strH == null || strH.isEmpty()) {
                return;
            }
            int iG = c6609i.g();
            String strG = g(c6609i, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    c6609i.b0(iG);
                }
            }
            if ("color".equals(strF)) {
                cVar.q(AbstractC6625l.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                cVar.n(AbstractC6625l.b(strH));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z10 = false;
                }
                cVar.p(z10);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                cVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, cVar);
            }
        }
    }

    private static char k(C6609I c6609i, int i10) {
        return (char) c6609i.f()[i10];
    }

    private static String l(C6609I c6609i) {
        int iG = c6609i.g();
        int iJ = c6609i.j();
        boolean z10 = false;
        while (iG < iJ && !z10) {
            int i10 = iG + 1;
            z10 = ((char) c6609i.f()[iG]) == ')';
            iG = i10;
        }
        return c6609i.J((iG - 1) - c6609i.g()).trim();
    }

    static void m(C6609I c6609i) {
        while (!TextUtils.isEmpty(c6609i.x())) {
        }
    }

    static void n(C6609I c6609i) {
        while (true) {
            for (boolean z10 = true; c6609i.a() > 0 && z10; z10 = false) {
                if (c(c6609i) || b(c6609i)) {
                    break;
                }
            }
            return;
        }
    }

    public List d(C6609I c6609i) {
        this.f218b.setLength(0);
        int iG = c6609i.g();
        m(c6609i);
        this.f217a.Z(c6609i.f(), c6609i.g());
        this.f217a.b0(iG);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f217a, this.f218b);
            if (strI == null || !"{".equals(g(this.f217a, this.f218b))) {
                break;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iG2 = this.f217a.g();
                String strG = g(this.f217a, this.f218b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f217a.b0(iG2);
                    j(this.f217a, cVar, this.f218b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
