package Td;

import Td.u;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {
    public static final Object a(Throwable exception) {
        AbstractC5504s.h(exception, "exception");
        return new u.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof u.b) {
            throw ((u.b) obj).f17468a;
        }
    }
}
