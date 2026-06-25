package L9;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f11352a = new HashSet(Arrays.asList("native", "unity"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f11353b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final M9.i f11354c = new M9.i("PlayCoreVersion");

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map mapB = b();
        bundle.putInt("playcore_version_code", ((Integer) mapB.get("java")).intValue());
        if (mapB.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) mapB.get("native")).intValue());
        }
        if (mapB.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) mapB.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b() {
        Map map;
        map = f11353b;
        map.put("java", 11004);
        return map;
    }
}
