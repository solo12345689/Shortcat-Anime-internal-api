package Ud;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 {
    public static Set a(Set builder) {
        AbstractC5504s.h(builder, "builder");
        return ((Vd.h) builder).d();
    }

    public static Set b() {
        return new Vd.h();
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC5504s.g(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
