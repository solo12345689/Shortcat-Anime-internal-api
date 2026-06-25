package kotlin.jvm.internal;

import java.util.List;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6017g;
import pe.InterfaceC6018h;
import pe.InterfaceC6020j;
import pe.InterfaceC6021k;
import pe.InterfaceC6024n;
import pe.InterfaceC6025o;
import pe.InterfaceC6026p;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class P {
    public InterfaceC6014d b(Class cls) {
        return new C5495i(cls);
    }

    public InterfaceC6017g c(Class cls, String str) {
        return new B(cls, str);
    }

    public String i(InterfaceC5500n interfaceC5500n) {
        String string = interfaceC5500n.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(AbstractC5506u abstractC5506u) {
        return i(abstractC5506u);
    }

    public InterfaceC6027q k(InterfaceC6016f interfaceC6016f, List list, boolean z10) {
        return new Y(interfaceC6016f, list, z10);
    }

    public InterfaceC6018h a(AbstractC5501o abstractC5501o) {
        return abstractC5501o;
    }

    public InterfaceC6020j d(AbstractC5508w abstractC5508w) {
        return abstractC5508w;
    }

    public InterfaceC6021k e(AbstractC5510y abstractC5510y) {
        return abstractC5510y;
    }

    public InterfaceC6024n f(C c10) {
        return c10;
    }

    public InterfaceC6025o g(E e10) {
        return e10;
    }

    public InterfaceC6026p h(G g10) {
        return g10;
    }
}
