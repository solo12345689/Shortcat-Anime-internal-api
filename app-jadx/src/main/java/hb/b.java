package Hb;

import Td.z;
import Ud.S;
import com.adjust.sdk.Constants;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8370a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f8371b = S.l(z.a("light", new g(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), z.a("soft", new g(new long[]{0, 50}, new int[]{0, 30}, new long[]{0, 20})), z.a(Constants.MEDIUM, new g(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), z.a("rigid", new g(new long[]{0, 43}, new int[]{0, 50}, new long[]{0, 43})), z.a("heavy", new g(new long[]{0, 60}, new int[]{0, 70}, new long[]{0, 61})));

    private b() {
    }

    public final g a(String style) throws c {
        AbstractC5504s.h(style, "style");
        Object obj = f8371b.get(style);
        if (obj != null) {
            return (g) obj;
        }
        throw new c("'style' must be one of ['light', 'medium', 'heavy', 'rigid', 'soft']. Obtained " + style + "'.");
    }
}
