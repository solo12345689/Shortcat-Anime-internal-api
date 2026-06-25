package Y0;

import b1.AbstractC2968a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Y0.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2481p {
    public static String a(String str) {
        if (!(str.length() > 0)) {
            AbstractC2968a.a("name may not be empty");
        }
        return str;
    }

    public static final boolean b(String str, String str2) {
        return AbstractC5504s.c(str, str2);
    }

    public static int c(String str) {
        return str.hashCode();
    }

    public static String d(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }
}
