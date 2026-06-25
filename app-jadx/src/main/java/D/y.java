package D;

import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface y {
    static /* synthetic */ void a(y yVar, Object obj, Object obj2, InterfaceC5096o interfaceC5096o, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        yVar.c(obj, obj2, interfaceC5096o);
    }

    void c(Object obj, Object obj2, InterfaceC5096o interfaceC5096o);

    void d(int i10, Function1 function1, Function1 function12, ie.p pVar);
}
