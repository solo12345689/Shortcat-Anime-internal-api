package Xf;

import Td.u;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Xf.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2373j {

    /* JADX INFO: renamed from: a */
    private static final int f21996a;

    static {
        Object objB;
        try {
            u.a aVar = Td.u.f17466b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC5504s.g(property, "getProperty(...)");
            objB = Td.u.b(Df.r.r(property));
        } catch (Throwable th2) {
            u.a aVar2 = Td.u.f17466b;
            objB = Td.u.b(Td.v.a(th2));
        }
        if (Td.u.g(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f21996a = num != null ? num.intValue() : 2097152;
    }
}
