package N9;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f12759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f12760b;

    static {
        HashMap map = new HashMap();
        f12759a = map;
        HashMap map2 = new HashMap();
        f12760b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i10) {
        Map map = f12759a;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f12760b.get(numValueOf)) + ")";
    }
}
