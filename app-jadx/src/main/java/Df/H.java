package Df;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class H extends G {
    public static String n1(String str, int i10) {
        AbstractC5504s.h(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(AbstractC5874j.i(i10, str.length()));
            AbstractC5504s.g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String o1(String str, int i10) {
        AbstractC5504s.h(str, "<this>");
        if (i10 >= 0) {
            return s1(str, AbstractC5874j.e(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char p1(CharSequence charSequence) {
        AbstractC5504s.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char q1(CharSequence charSequence) {
        AbstractC5504s.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(F.d0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char r1(CharSequence charSequence) {
        AbstractC5504s.h(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String s1(String str, int i10) {
        AbstractC5504s.h(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, AbstractC5874j.i(i10, str.length()));
            AbstractC5504s.g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String t1(String str, int i10) {
        AbstractC5504s.h(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - AbstractC5874j.i(i10, length));
            AbstractC5504s.g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
