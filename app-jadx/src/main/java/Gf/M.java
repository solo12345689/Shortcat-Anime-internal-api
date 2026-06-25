package Gf;

import Lf.AbstractC1900g;
import Td.AbstractC2156g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class M {
    public static final void a(Zd.i iVar, Throwable th2) {
        if (th2 instanceof C1598a0) {
            th2 = ((C1598a0) th2).getCause();
        }
        try {
            L l10 = (L) iVar.l(L.f7522J);
            if (l10 != null) {
                l10.z(iVar, th2);
            } else {
                AbstractC1900g.a(iVar, th2);
            }
        } catch (Throwable th3) {
            AbstractC1900g.a(iVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        AbstractC2156g.a(runtimeException, th2);
        return runtimeException;
    }
}
