package com.facebook.react.views.text;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38372a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f38366c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f38367d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.f38368e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38372a = iArr;
        }
    }

    public static final String a(String str, t tVar) {
        AbstractC5504s.h(str, "<this>");
        int i10 = tVar == null ? -1 : a.f38372a[tVar.ordinal()];
        if (i10 == 1) {
            Locale locale = Locale.getDefault();
            AbstractC5504s.g(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            AbstractC5504s.g(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (i10 == 2) {
            Locale locale2 = Locale.getDefault();
            AbstractC5504s.g(locale2, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale2);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (i10 != 3) {
            return str;
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb2 = new StringBuilder(str.length());
        int iFirst = wordInstance.first();
        int next = wordInstance.next();
        while (true) {
            int i11 = next;
            int i12 = iFirst;
            iFirst = i11;
            if (iFirst == -1) {
                String string = sb2.toString();
                AbstractC5504s.e(string);
                return string;
            }
            String strSubstring = str.substring(i12, iFirst);
            AbstractC5504s.g(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                char upperCase2 = Character.toUpperCase(strSubstring.charAt(0));
                String strSubstring2 = strSubstring.substring(1);
                AbstractC5504s.g(strSubstring2, "substring(...)");
                strSubstring = upperCase2 + strSubstring2;
            }
            sb2.append(strSubstring);
            next = wordInstance.next();
        }
    }
}
