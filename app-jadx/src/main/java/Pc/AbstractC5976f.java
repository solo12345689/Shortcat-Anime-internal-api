package pc;

import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: pc.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5976f {
    public static final boolean a(InterfaceC6027q type, Class clazz) {
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(clazz, "clazz");
        if (AbstractC5504s.c(clazz, boolean[].class) || AbstractC5504s.c(clazz, byte[].class) || AbstractC5504s.c(clazz, char[].class) || AbstractC5504s.c(clazz, short[].class) || AbstractC5504s.c(clazz, int[].class) || AbstractC5504s.c(clazz, long[].class) || AbstractC5504s.c(clazz, float[].class) || AbstractC5504s.c(clazz, double[].class)) {
            return type.e().isEmpty();
        }
        return false;
    }
}
