package Gf;

import Zd.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface C0 extends i.b {

    /* JADX INFO: renamed from: K */
    public static final b f7490K = b.f7491a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static /* synthetic */ void a(C0 c02, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            c02.k(cancellationException);
        }

        public static Object b(C0 c02, Object obj, Function2 function2) {
            return i.b.a.a(c02, obj, function2);
        }

        public static i.b c(C0 c02, i.c cVar) {
            return i.b.a.b(c02, cVar);
        }

        public static Zd.i d(C0 c02, i.c cVar) {
            return i.b.a.c(c02, cVar);
        }

        public static Zd.i e(C0 c02, Zd.i iVar) {
            return i.b.a.d(c02, iVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements i.c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ b f7491a = new b();

        private b() {
        }
    }

    InterfaceC1612h0 C(boolean z10, boolean z11, Function1 function1);

    CancellationException D();

    InterfaceC1612h0 H(Function1 function1);

    boolean b();

    Cf.i g();

    Object h0(Zd.e eVar);

    boolean j();

    void k(CancellationException cancellationException);

    boolean start();

    InterfaceC1636u t1(InterfaceC1640w interfaceC1640w);
}
