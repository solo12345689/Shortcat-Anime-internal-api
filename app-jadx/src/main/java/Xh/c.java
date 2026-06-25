package Xh;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f22047a = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f22048b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f22049c = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f22050d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f22051e = Pattern.compile("[ \t\r\n]+");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final InterfaceC0378c f22052f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final InterfaceC0378c f22053g = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements InterfaceC0378c {
        a() {
        }

        @Override // Xh.c.InterfaceC0378c
        public void a(String str, StringBuilder sb2) {
            if (str.charAt(0) == '\\') {
                sb2.append((CharSequence) str, 1, str.length());
            } else {
                sb2.append(d.a(str));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements InterfaceC0378c {
        b() {
        }

        @Override // Xh.c.InterfaceC0378c
        public void a(String str, StringBuilder sb2) {
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb2.append(str);
                    return;
                } else {
                    sb2.append("%25");
                    sb2.append((CharSequence) str, 1, str.length());
                    return;
                }
            }
            for (byte b10 : str.getBytes(Charset.forName(Constants.ENCODING))) {
                sb2.append('%');
                sb2.append(c.f22050d[(b10 >> 4) & 15]);
                sb2.append(c.f22050d[b10 & 15]);
            }
        }
    }

    /* JADX INFO: renamed from: Xh.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface InterfaceC0378c {
        void a(String str, StringBuilder sb2);
    }

    public static String b(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return f22051e.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }

    private static String c(Pattern pattern, String str, InterfaceC0378c interfaceC0378c) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb2.append((CharSequence) str, iEnd, matcher.start());
            interfaceC0378c.a(matcher.group(), sb2);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb2.append((CharSequence) str, iEnd, str.length());
        }
        return sb2.toString();
    }

    public static String d(String str) {
        return f22047a.matcher(str).find() ? c(f22048b, str, f22052f) : str;
    }
}
