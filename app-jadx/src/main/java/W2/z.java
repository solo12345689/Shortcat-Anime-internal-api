package w2;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f62900a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f62901b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append("-");
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    public static long b(String str, String str2) {
        long j10;
        if (TextUtils.isEmpty(str)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                AbstractC6635w.d("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j10 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f62900a.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong((String) AbstractC6614a.e(matcher.group(2))) - Long.parseLong((String) AbstractC6614a.e(matcher.group(1)))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            AbstractC6635w.i("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            AbstractC6635w.d("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j10;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f62901b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) AbstractC6614a.e(matcher.group(1)));
        }
        return -1L;
    }
}
