package Yf;

import Yf.i;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface i {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static void b(i iVar, InterfaceC6014d kClass, final Rf.b serializer) {
            AbstractC5504s.h(kClass, "kClass");
            AbstractC5504s.h(serializer, "serializer");
            iVar.a(kClass, new Function1() { // from class: Yf.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.a.c(serializer, (List) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Rf.b c(Rf.b bVar, List it) {
            AbstractC5504s.h(it, "it");
            return bVar;
        }
    }

    void a(InterfaceC6014d interfaceC6014d, Function1 function1);

    void b(InterfaceC6014d interfaceC6014d, Rf.b bVar);

    void c(InterfaceC6014d interfaceC6014d, Function1 function1);

    void d(InterfaceC6014d interfaceC6014d, Function1 function1);

    void e(InterfaceC6014d interfaceC6014d, InterfaceC6014d interfaceC6014d2, Rf.b bVar);
}
