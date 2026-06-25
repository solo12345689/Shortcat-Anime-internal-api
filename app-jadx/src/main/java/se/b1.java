package se;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC5492f;
import kotlin.jvm.internal.AbstractC5501o;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.AbstractC5508w;
import kotlin.jvm.internal.AbstractC5510y;
import kotlin.jvm.internal.InterfaceC5494h;
import kotlin.jvm.internal.InterfaceC5500n;
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
import qe.AbstractC6174d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class b1 extends kotlin.jvm.internal.P {
    private static AbstractC6484d0 l(AbstractC5492f abstractC5492f) {
        InterfaceC6017g owner = abstractC5492f.getOwner();
        return owner instanceof AbstractC6484d0 ? (AbstractC6484d0) owner : C6497k.f59520d;
    }

    @Override // kotlin.jvm.internal.P
    public InterfaceC6018h a(AbstractC5501o abstractC5501o) {
        return new C6494i0(l(abstractC5501o), abstractC5501o.getName(), abstractC5501o.getSignature(), abstractC5501o.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public InterfaceC6014d b(Class cls) {
        return AbstractC6491h.m(cls);
    }

    @Override // kotlin.jvm.internal.P
    public InterfaceC6017g c(Class cls, String str) {
        return AbstractC6491h.n(cls);
    }

    @Override // kotlin.jvm.internal.P
    public InterfaceC6020j d(AbstractC5508w abstractC5508w) {
        return new C6498k0(l(abstractC5508w), abstractC5508w.getName(), abstractC5508w.getSignature(), abstractC5508w.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public InterfaceC6021k e(AbstractC5510y abstractC5510y) {
        return new C6502m0(l(abstractC5510y), abstractC5510y.getName(), abstractC5510y.getSignature(), abstractC5510y.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public InterfaceC6024n f(kotlin.jvm.internal.C c10) {
        return new B0(l(c10), c10.getName(), c10.getSignature(), c10.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public InterfaceC6025o g(kotlin.jvm.internal.E e10) {
        return new E0(l(e10), e10.getName(), e10.getSignature(), e10.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public InterfaceC6026p h(kotlin.jvm.internal.G g10) {
        return new H0(l(g10), g10.getName(), g10.getSignature());
    }

    @Override // kotlin.jvm.internal.P
    public String i(InterfaceC5500n interfaceC5500n) {
        C6494i0 c6494i0C;
        InterfaceC6018h interfaceC6018hA = re.d.a(interfaceC5500n);
        return (interfaceC6018hA == null || (c6494i0C = j1.c(interfaceC6018hA)) == null) ? super.i(interfaceC5500n) : e1.f59490a.h(c6494i0C.b0());
    }

    @Override // kotlin.jvm.internal.P
    public String j(AbstractC5506u abstractC5506u) {
        return i(abstractC5506u);
    }

    @Override // kotlin.jvm.internal.P
    public InterfaceC6027q k(InterfaceC6016f interfaceC6016f, List list, boolean z10) {
        return interfaceC6016f instanceof InterfaceC5494h ? AbstractC6491h.k(((InterfaceC5494h) interfaceC6016f).j(), list, z10) : AbstractC6174d.b(interfaceC6016f, list, z10, Collections.EMPTY_LIST);
    }
}
