package F2;

import android.util.Pair;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    private static long a(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair b(InterfaceC1558m interfaceC1558m) {
        Map mapF = interfaceC1558m.f();
        if (mapF == null) {
            return null;
        }
        return new Pair(Long.valueOf(a(mapF, "LicenseDurationRemaining")), Long.valueOf(a(mapF, "PlaybackDurationRemaining")));
    }
}
