package A3;

import com.revenuecat.purchases.common.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q2.C6080L;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a */
    private static final Pattern f265a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(C6609I c6609i) {
        String strX;
        while (true) {
            String strX2 = c6609i.x();
            if (strX2 == null) {
                return null;
            }
            if (f265a.matcher(strX2).matches()) {
                do {
                    strX = c6609i.x();
                    if (strX != null) {
                    }
                } while (!strX.isEmpty());
            } else {
                Matcher matcher = e.f239a.matcher(strX2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(C6609I c6609i) {
        String strX = c6609i.x();
        return strX != null && strX.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrW1 = a0.w1(str, "\\.");
        long j10 = 0;
        for (String str2 : a0.v1(strArrW1[0], Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrW1.length == 2) {
            String strTrim = strArrW1[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void e(C6609I c6609i) throws C6080L {
        int iG = c6609i.g();
        if (b(c6609i)) {
            return;
        }
        c6609i.b0(iG);
        throw C6080L.a("Expected WEBVTT. Got " + c6609i.x(), null);
    }
}
