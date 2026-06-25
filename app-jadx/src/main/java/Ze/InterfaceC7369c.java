package ze;

import java.util.Map;
import qf.S;
import ye.InterfaceC7227e;
import ye.h0;

/* JADX INFO: renamed from: ze.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC7369c {

    /* JADX INFO: renamed from: ze.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static Xe.c a(InterfaceC7369c interfaceC7369c) {
            InterfaceC7227e interfaceC7227eL = ff.e.l(interfaceC7369c);
            if (interfaceC7227eL != null) {
                if (sf.l.m(interfaceC7227eL)) {
                    interfaceC7227eL = null;
                }
                if (interfaceC7227eL != null) {
                    return ff.e.k(interfaceC7227eL);
                }
            }
            return null;
        }
    }

    Map a();

    Xe.c f();

    S getType();

    h0 k();
}
