package Df;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class v extends s {
    private static final Function1 d(final String str) {
        return str.length() == 0 ? new Function1() { // from class: Df.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.e((String) obj);
            }
        } : new Function1() { // from class: Df.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.f(str, (String) obj);
            }
        };
    }

    public static final String e(String line) {
        AbstractC5504s.h(line, "line");
        return line;
    }

    public static final String f(String str, String line) {
        AbstractC5504s.h(line, "line");
        return str + line;
    }

    private static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!AbstractC1269b.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String h(String str, String newIndent) {
        String str2;
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(newIndent, "newIndent");
        List listS0 = F.s0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS0) {
            if (!F.l0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) AbstractC2279u.D0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listS0.size());
        Function1 function1D = d(newIndent);
        int iO = AbstractC2279u.o(listS0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listS0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iO) && F.l0(str3)) {
                str3 = null;
            } else {
                String strN1 = H.n1(str3, iIntValue);
                if (strN1 != null && (str2 = (String) function1D.invoke(strN1)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) Ud.F.t0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String i(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(newIndent, "newIndent");
        AbstractC5504s.h(marginPrefix, "marginPrefix");
        if (F.l0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listS0 = F.s0(str);
        int length = str.length() + (newIndent.length() * listS0.size());
        Function1 function1D = d(newIndent);
        int iO = AbstractC2279u.o(listS0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listS0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iO) && F.l0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!AbstractC1269b.c(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (C.P(str4, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        AbstractC5504s.f(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        AbstractC5504s.g(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) function1D.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) Ud.F.t0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String j(String str) {
        AbstractC5504s.h(str, "<this>");
        return h(str, "");
    }

    public static final String k(String str, String marginPrefix) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(marginPrefix, "marginPrefix");
        return i(str, "", marginPrefix);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = com.amazon.a.a.o.b.f.f34696c;
        }
        return k(str, str2);
    }
}
