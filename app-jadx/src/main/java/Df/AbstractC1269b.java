package Df;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import oe.C5870f;

/* JADX INFO: renamed from: Df.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1269b {
    public static int a(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C5870f(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static boolean c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static String d(char c10, Locale locale) {
        AbstractC5504s.h(locale, "locale");
        String strE = e(c10, locale);
        if (strE.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            AbstractC5504s.f(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC5504s.g(upperCase, "toUpperCase(...)");
            if (AbstractC5504s.c(strE, upperCase)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = strE.charAt(0);
            AbstractC5504s.f(strE, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strE.substring(1);
            AbstractC5504s.g(strSubstring, "substring(...)");
            AbstractC5504s.f(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strE;
    }

    public static final String e(char c10, Locale locale) {
        AbstractC5504s.h(locale, "locale");
        String strValueOf = String.valueOf(c10);
        AbstractC5504s.f(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC5504s.g(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
