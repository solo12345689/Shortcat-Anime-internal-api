package qf;

import ye.InterfaceC7235m;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface q0 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static /* synthetic */ r0 a(q0 q0Var, InterfaceC7374h interfaceC7374h, v0 v0Var, InterfaceC7235m interfaceC7235m, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                v0Var = null;
            }
            if ((i10 & 4) != 0) {
                interfaceC7235m = null;
            }
            return q0Var.a(interfaceC7374h, v0Var, interfaceC7235m);
        }
    }

    r0 a(InterfaceC7374h interfaceC7374h, v0 v0Var, InterfaceC7235m interfaceC7235m);
}
