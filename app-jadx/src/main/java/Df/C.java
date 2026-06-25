package Df;

import Ud.AbstractC2263d;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.U;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C extends B {
    public static /* synthetic */ boolean A(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return z(str, str2, z10);
    }

    public static boolean B(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean C(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return B(str, str2, z10);
    }

    public static Comparator D(U u10) {
        AbstractC5504s.h(u10, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC5504s.g(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean E(String str, int i10, String other, int i11, int i12, boolean z10) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean F(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return E(str, i10, str2, i11, i12, z10);
    }

    public static String G(CharSequence charSequence, int i10) {
        AbstractC5504s.h(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + com.amazon.a.a.o.c.a.b.f34706a).toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC5504s.e(string);
        return string;
    }

    public static final String H(String str, char c10, char c11, boolean z10) {
        AbstractC5504s.h(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            AbstractC5504s.g(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC1270c.f(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static final String I(String str, String oldValue, String newValue, boolean z10) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(oldValue, "oldValue");
        AbstractC5504s.h(newValue, "newValue");
        int i10 = 0;
        int iF0 = F.f0(str, oldValue, 0, z10);
        if (iF0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iE = AbstractC5874j.e(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iF0);
            sb2.append(newValue);
            i10 = iF0 + length;
            if (iF0 >= str.length()) {
                break;
            }
            iF0 = F.f0(str, oldValue, iF0 + iE, z10);
        } while (iF0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String J(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return H(str, c10, c11, z10);
    }

    public static /* synthetic */ String K(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return I(str, str2, str3, z10);
    }

    public static final String L(String str, String oldValue, String newValue, boolean z10) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(oldValue, "oldValue");
        AbstractC5504s.h(newValue, "newValue");
        int iJ0 = F.j0(str, oldValue, 0, z10, 2, null);
        return iJ0 < 0 ? str : F.G0(str, iJ0, oldValue.length() + iJ0, newValue).toString();
    }

    public static /* synthetic */ String M(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return L(str, str2, str3, z10);
    }

    public static boolean N(String str, String prefix, int i10, boolean z10) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : E(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean O(String str, String prefix, boolean z10) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : E(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean P(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return N(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean Q(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return O(str, str2, z10);
    }

    public static String v(char[] cArr) {
        AbstractC5504s.h(cArr, "<this>");
        return new String(cArr);
    }

    public static String w(char[] cArr, int i10, int i11) {
        AbstractC5504s.h(cArr, "<this>");
        AbstractC2263d.f19502a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static String x(byte[] bArr) {
        AbstractC5504s.h(bArr, "<this>");
        return new String(bArr, C1271d.f3718b);
    }

    public static byte[] y(String str) {
        AbstractC5504s.h(str, "<this>");
        byte[] bytes = str.getBytes(C1271d.f3718b);
        AbstractC5504s.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean z(String str, String suffix, boolean z10) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : E(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }
}
