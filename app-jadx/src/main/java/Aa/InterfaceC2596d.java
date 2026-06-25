package aa;

import java.util.Set;
import ma.InterfaceC5655b;

/* JADX INFO: renamed from: aa.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2596d {
    default Object a(Class cls) {
        return f(C2591D.b(cls));
    }

    InterfaceC5655b b(C2591D c2591d);

    default Set c(Class cls) {
        return g(C2591D.b(cls));
    }

    InterfaceC5655b d(C2591D c2591d);

    default InterfaceC5655b e(Class cls) {
        return b(C2591D.b(cls));
    }

    default Object f(C2591D c2591d) {
        InterfaceC5655b interfaceC5655bB = b(c2591d);
        if (interfaceC5655bB == null) {
            return null;
        }
        return interfaceC5655bB.get();
    }

    default Set g(C2591D c2591d) {
        return (Set) d(c2591d).get();
    }
}
