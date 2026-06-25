package jf;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import ye.InterfaceC7230h;

/* JADX INFO: renamed from: jf.n */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5390n {

    /* JADX INFO: renamed from: jf.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static /* synthetic */ Collection a(InterfaceC5390n interfaceC5390n, C5380d c5380d, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                c5380d = C5380d.f51771o;
            }
            if ((i10 & 2) != 0) {
                function1 = InterfaceC5387k.f51797a.c();
            }
            return interfaceC5390n.g(c5380d, function1);
        }
    }

    InterfaceC7230h e(Xe.f fVar, Ge.b bVar);

    Collection g(C5380d c5380d, Function1 function1);
}
