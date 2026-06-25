package Db;

import Df.r;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3682a = k.class.getSimpleName();

    public static final String b(String str) {
        if (str == null) {
            return null;
        }
        return r.Q(str, "file:///", false, 2, null) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}
