package Y;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {
    public static final void c(InterfaceC2425m interfaceC2425m, final Function1 function1) {
        if (interfaceC2425m.e()) {
            interfaceC2425m.m(Td.L.f17438a, new Function2() { // from class: Y.l2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m2.d(function1, obj, (Td.L) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L d(Function1 function1, Object obj, Td.L l10) {
        function1.invoke(obj);
        return Td.L.f17438a;
    }

    public static final void e(InterfaceC2425m interfaceC2425m, Object obj, Function2 function2) {
        if (interfaceC2425m.e() || !AbstractC5504s.c(interfaceC2425m.D(), obj)) {
            interfaceC2425m.u(obj);
            interfaceC2425m.m(obj, function2);
        }
    }

    public static InterfaceC2425m b(InterfaceC2425m interfaceC2425m) {
        return interfaceC2425m;
    }
}
