package Gf;

import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Gf.n */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC1623n extends Zd.e {

    /* JADX INFO: renamed from: Gf.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC1623n interfaceC1623n, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return interfaceC1623n.L(th2);
        }
    }

    Object B(Throwable th2);

    void I(Object obj, InterfaceC5096o interfaceC5096o);

    boolean L(Throwable th2);

    void N(K k10, Object obj);

    void U(Object obj);

    Object V(Object obj, Object obj2, InterfaceC5096o interfaceC5096o);

    boolean b();

    boolean isCancelled();

    boolean j();

    void p(Function1 function1);
}
