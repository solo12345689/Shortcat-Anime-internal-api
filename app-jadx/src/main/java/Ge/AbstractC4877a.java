package ge;

import Td.AbstractC2156g;
import z1.e;

/* JADX INFO: renamed from: ge.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4877a {
    public static final void a(AutoCloseable autoCloseable, Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 == null) {
                e.a(autoCloseable);
                return;
            }
            try {
                e.a(autoCloseable);
            } catch (Throwable th3) {
                AbstractC2156g.a(th2, th3);
            }
        }
    }
}
