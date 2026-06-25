package q2;

import java.util.HashSet;

/* JADX INFO: renamed from: q2.H, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6076H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f56470a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f56471b = "media3.common";

    public static synchronized void a(String str) {
        if (f56470a.add(str)) {
            f56471b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f56471b;
    }
}
