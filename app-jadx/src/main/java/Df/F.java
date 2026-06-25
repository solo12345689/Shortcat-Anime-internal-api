package Df;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import oe.C5868d;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class F extends C {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Cf.i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CharSequence f3716a;

        public a(CharSequence charSequence) {
            this.f3716a = charSequence;
        }

        @Override // Cf.i
        public Iterator iterator() {
            return new C1276i(this.f3716a);
        }
    }

    public static final Pair A0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC5504s.h(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair pairB0 = b0(DelimitedRangesSequence, list, i10, z10, false);
        if (pairB0 != null) {
            return Td.z.a(pairB0.c(), Integer.valueOf(((String) pairB0.d()).length()));
        }
        return null;
    }

    public static final boolean B0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!AbstractC1270c.f(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String C0(String str, CharSequence prefix) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(prefix, "prefix");
        if (!R0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String D0(String str, CharSequence suffix) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(suffix, "suffix");
        if (!a0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String E0(String str, CharSequence delimiter) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(delimiter, "delimiter");
        return F0(str, delimiter, delimiter);
    }

    public static final String F0(String str, CharSequence prefix, CharSequence suffix) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !R0(str, prefix, false, 2, null) || !a0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence G0(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            AbstractC5504s.g(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            AbstractC5504s.g(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static CharSequence H0(CharSequence charSequence, C5870f range, CharSequence replacement) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(range, "range");
        AbstractC5504s.h(replacement, "replacement");
        return G0(charSequence, range.b().intValue(), range.e().intValue() + 1, replacement);
    }

    public static final void I0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List J0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return L0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableU = Cf.l.u(x0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(iterableU, 10));
        Iterator it = iterableU.iterator();
        while (it.hasNext()) {
            arrayList.add(S0(charSequence, (C5870f) it.next()));
        }
        return arrayList;
    }

    public static final List K0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return L0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableU = Cf.l.u(y0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(iterableU, 10));
        Iterator it = iterableU.iterator();
        while (it.hasNext()) {
            arrayList.add(S0(charSequence, (C5870f) it.next()));
        }
        return arrayList;
    }

    private static final List L0(CharSequence charSequence, String str, boolean z10, int i10) {
        I0(i10);
        int length = 0;
        int iF0 = f0(charSequence, str, 0, z10);
        if (iF0 == -1 || i10 == 1) {
            return AbstractC2279u.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? AbstractC5874j.i(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iF0).toString());
            length = str.length() + iF0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iF0 = f0(charSequence, str, length, z10);
        } while (iF0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List M0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return J0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List N0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return K0(charSequence, strArr, z10, i10);
    }

    public static final boolean O0(CharSequence charSequence, char c10, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC1270c.f(charSequence.charAt(0), c10, z10);
    }

    public static final boolean P0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? C.Q((String) charSequence, (String) prefix, false, 2, null) : B0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean Q0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return O0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean R0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return P0(charSequence, charSequence2, z10);
    }

    public static final String S0(CharSequence charSequence, C5870f range) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(range, "range");
        return charSequence.subSequence(range.b().intValue(), range.e().intValue() + 1).toString();
    }

    public static final boolean T(CharSequence charSequence, char c10, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        return i0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static String T0(String str, char c10, String missingDelimiterValue) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = i0(str, c10, 0, false, 6, null);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iI0 + 1, str.length());
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean U(CharSequence charSequence, CharSequence other, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(other, "other");
        return other instanceof String ? j0(charSequence, (String) other, 0, z10, 2, null) >= 0 : h0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static String U0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(delimiter, "delimiter");
        AbstractC5504s.h(missingDelimiterValue, "missingDelimiterValue");
        int iJ0 = j0(str, delimiter, 0, false, 6, null);
        if (iJ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iJ0 + delimiter.length(), str.length());
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean V(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return T(charSequence, c10, z10);
    }

    public static /* synthetic */ String V0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return T0(str, c10, str2);
    }

    public static /* synthetic */ boolean W(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return U(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String W0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return U0(str, str2, str3);
    }

    public static final boolean X(CharSequence charSequence, char c10, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC1270c.f(charSequence.charAt(d0(charSequence)), c10, z10);
    }

    public static String X0(String str, char c10, String missingDelimiterValue) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(missingDelimiterValue, "missingDelimiterValue");
        int iO0 = o0(str, c10, 0, false, 6, null);
        if (iO0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iO0 + 1, str.length());
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean Y(CharSequence charSequence, CharSequence suffix, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? C.A((String) charSequence, (String) suffix, false, 2, null) : B0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static final String Y0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(delimiter, "delimiter");
        AbstractC5504s.h(missingDelimiterValue, "missingDelimiterValue");
        int iP0 = p0(str, delimiter, 0, false, 6, null);
        if (iP0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iP0 + delimiter.length(), str.length());
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean Z(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return X(charSequence, c10, z10);
    }

    public static /* synthetic */ String Z0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return X0(str, c10, str2);
    }

    public static /* synthetic */ boolean a0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Y(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String a1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return Y0(str, str2, str3);
    }

    private static final Pair b0(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) AbstractC2279u.L0(collection);
            int iJ0 = !z11 ? j0(charSequence, str, i10, false, 4, null) : p0(charSequence, str, i10, false, 4, null);
            if (iJ0 < 0) {
                return null;
            }
            return Td.z.a(Integer.valueOf(iJ0), str);
        }
        CharSequence charSequence3 = charSequence;
        C5868d c5870f = !z11 ? new C5870f(AbstractC5874j.e(i10, 0), charSequence3.length()) : AbstractC5874j.s(AbstractC5874j.i(i10, d0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iF = c5870f.f();
            int i11 = c5870f.i();
            int iL = c5870f.l();
            if ((iL > 0 && iF <= i11) || (iL < 0 && i11 <= iF)) {
                int i12 = iF;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (C.E(str2, 0, (String) charSequence3, i12, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i12 == i11) {
                            break;
                        }
                        i12 += iL;
                        z10 = z12;
                    } else {
                        return Td.z.a(Integer.valueOf(i12), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iF2 = c5870f.f();
            int i13 = c5870f.i();
            int iL2 = c5870f.l();
            if ((iL2 > 0 && iF2 <= i13) || (iL2 < 0 && i13 <= iF2)) {
                int i14 = iF2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (B0(str4, 0, charSequence2, i14, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i14 == i13) {
                            break;
                        }
                        i14 += iL2;
                        charSequence3 = charSequence2;
                    } else {
                        return Td.z.a(Integer.valueOf(i14), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final String b1(String str, char c10, String missingDelimiterValue) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = i0(str, c10, 0, false, 6, null);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iI0);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static C5870f c0(CharSequence charSequence) {
        AbstractC5504s.h(charSequence, "<this>");
        return new C5870f(0, charSequence.length() - 1);
    }

    public static final String c1(String str, String delimiter, String missingDelimiterValue) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(delimiter, "delimiter");
        AbstractC5504s.h(missingDelimiterValue, "missingDelimiterValue");
        int iJ0 = j0(str, delimiter, 0, false, 6, null);
        if (iJ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iJ0);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static int d0(CharSequence charSequence) {
        AbstractC5504s.h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ String d1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return b1(str, c10, str2);
    }

    public static final int e0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? k0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ String e1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return c1(str, str2, str3);
    }

    public static final int f0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(string, "string");
        return (z10 || !(charSequence instanceof String)) ? h0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static String f1(String str, char c10, String missingDelimiterValue) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(missingDelimiterValue, "missingDelimiterValue");
        int iO0 = o0(str, c10, 0, false, 6, null);
        if (iO0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iO0);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final int g0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C5868d c5870f = !z11 ? new C5870f(AbstractC5874j.e(i10, 0), AbstractC5874j.i(i11, charSequence.length())) : AbstractC5874j.s(AbstractC5874j.i(i10, d0(charSequence)), AbstractC5874j.e(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iF = c5870f.f();
            int i12 = c5870f.i();
            int iL = c5870f.l();
            if ((iL <= 0 || iF > i12) && (iL >= 0 || i12 > iF)) {
                return -1;
            }
            int i13 = iF;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (C.E(str, 0, (String) charSequence, i13, str.length(), z12)) {
                    return i13;
                }
                if (i13 == i12) {
                    return -1;
                }
                i13 += iL;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iF2 = c5870f.f();
            int i14 = c5870f.i();
            int iL2 = c5870f.l();
            if ((iL2 <= 0 || iF2 > i14) && (iL2 >= 0 || i14 > iF2)) {
                return -1;
            }
            int i15 = iF2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (B0(charSequence4, 0, charSequence3, i15, charSequence2.length(), z14)) {
                    return i15;
                }
                if (i15 == i14) {
                    return -1;
                }
                i15 += iL2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static String g1(String str, String delimiter, String missingDelimiterValue) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(delimiter, "delimiter");
        AbstractC5504s.h(missingDelimiterValue, "missingDelimiterValue");
        int iP0 = p0(str, delimiter, 0, false, 6, null);
        if (iP0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iP0);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    static /* synthetic */ int h0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return g0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ String h1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return f1(str, c10, str2);
    }

    public static /* synthetic */ int i0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return e0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ String i1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return g1(str, str2, str3);
    }

    public static /* synthetic */ int j0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return f0(charSequence, str, i10, z10);
    }

    public static Boolean j1(String str) {
        AbstractC5504s.h(str, "<this>");
        if (AbstractC5504s.c(str, com.amazon.a.a.o.b.f34640af)) {
            return Boolean.TRUE;
        }
        if (AbstractC5504s.c(str, com.amazon.a.a.o.b.f34641ag)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int k0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC2273n.G0(chars), i10);
        }
        int iE = AbstractC5874j.e(i10, 0);
        int iD0 = d0(charSequence);
        if (iE > iD0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iE);
            for (char c10 : chars) {
                if (AbstractC1270c.f(c10, cCharAt, z10)) {
                    return iE;
                }
            }
            if (iE == iD0) {
                return -1;
            }
            iE++;
        }
    }

    public static CharSequence k1(CharSequence charSequence) {
        AbstractC5504s.h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = AbstractC1269b.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static boolean l0(CharSequence charSequence) {
        AbstractC5504s.h(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!AbstractC1269b.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String l1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!AbstractC2273n.O(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final int m0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? q0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static String m1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(chars, "chars");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!AbstractC2273n.O(chars, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                break;
            }
            i10++;
        }
        return charSequenceSubSequence.toString();
    }

    public static final int n0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(string, "string");
        return (z10 || !(charSequence instanceof String)) ? g0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int o0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = d0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int p0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = d0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return n0(charSequence, str, i10, z10);
    }

    public static final int q0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC5504s.h(charSequence, "<this>");
        AbstractC5504s.h(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC2273n.G0(chars), i10);
        }
        for (int i11 = AbstractC5874j.i(i10, d0(charSequence)); -1 < i11; i11--) {
            char cCharAt = charSequence.charAt(i11);
            for (char c10 : chars) {
                if (AbstractC1270c.f(c10, cCharAt, z10)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public static final Cf.i r0(CharSequence charSequence) {
        AbstractC5504s.h(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List s0(CharSequence charSequence) {
        AbstractC5504s.h(charSequence, "<this>");
        return Cf.l.T(r0(charSequence));
    }

    public static final CharSequence t0(CharSequence charSequence, int i10, char c10) {
        AbstractC5504s.h(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String u0(String str, int i10, char c10) {
        AbstractC5504s.h(str, "<this>");
        return t0(str, i10, c10).toString();
    }

    private static final Cf.i v0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        I0(i11);
        return new C1272e(charSequence, i10, i11, new Function2() { // from class: Df.D
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return F.z0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final Cf.i w0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        I0(i11);
        final List listE = AbstractC2273n.e(strArr);
        return new C1272e(charSequence, i10, i11, new Function2() { // from class: Df.E
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return F.A0(listE, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ Cf.i x0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return v0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ Cf.i y0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return w0(charSequence, strArr, i10, z10, i11);
    }

    public static final Pair z0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC5504s.h(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iK0 = k0(DelimitedRangesSequence, cArr, i10, z10);
        if (iK0 < 0) {
            return null;
        }
        return Td.z.a(Integer.valueOf(iK0), 1);
    }
}
