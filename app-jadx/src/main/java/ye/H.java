package ye;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface H extends InterfaceC7235m {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static Object a(H h10, InterfaceC7237o visitor, Object obj) {
            AbstractC5504s.h(visitor, "visitor");
            return visitor.j(h10, obj);
        }

        public static InterfaceC7235m b(H h10) {
            return null;
        }
    }

    List A0();

    V S(Xe.c cVar);

    Object a0(G g10);

    ve.i n();

    Collection t(Xe.c cVar, Function1 function1);

    boolean x0(H h10);
}
