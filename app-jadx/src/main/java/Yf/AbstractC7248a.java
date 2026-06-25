package yf;

import Df.r;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: yf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7248a {
    public static final String a(String str) {
        char cCharAt;
        AbstractC5504s.h(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        return sb2.toString();
    }

    public static final String b(String str) {
        char cCharAt;
        AbstractC5504s.h(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    public static final String c(String str, boolean z10) {
        Object next;
        AbstractC5504s.h(str, "<this>");
        if (str.length() == 0 || !d(str, 0, z10)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z10)) {
            if (z10) {
                return b(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            AbstractC5504s.g(strSubstring, "substring(...)");
            return lowerCase + strSubstring;
        }
        Iterator it = r.c0(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!d(str, ((Number) next).intValue(), z10)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            return e(str, z10);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        AbstractC5504s.g(strSubstring2, "substring(...)");
        sb2.append(e(strSubstring2, z10));
        String strSubstring3 = str.substring(iIntValue);
        AbstractC5504s.g(strSubstring3, "substring(...)");
        sb2.append(strSubstring3);
        return sb2.toString();
    }

    private static final boolean d(String str, int i10, boolean z10) {
        char cCharAt = str.charAt(i10);
        return z10 ? 'A' <= cCharAt && cCharAt < '[' : Character.isUpperCase(cCharAt);
    }

    private static final String e(String str, boolean z10) {
        if (z10) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String f(String str) {
        AbstractC5504s.h(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }
}
