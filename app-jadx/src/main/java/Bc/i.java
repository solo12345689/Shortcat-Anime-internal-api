package bc;

import Df.r;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final String a(String eventName) {
        AbstractC5504s.h(eventName, "eventName");
        if (!r.Q(eventName, "on", false, 2, null)) {
            return eventName;
        }
        String strSubstring = eventName.substring(2);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return "top" + strSubstring;
    }
}
