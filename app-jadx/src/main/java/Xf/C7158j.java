package xf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ve.n;
import vf.AbstractC6867d;
import xf.InterfaceC7154f;
import ye.InterfaceC7247z;
import ye.t0;

/* JADX INFO: renamed from: xf.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C7158j implements InterfaceC7154f {

    /* JADX INFO: renamed from: a */
    public static final C7158j f64490a = new C7158j();

    /* JADX INFO: renamed from: b */
    private static final String f64491b = "second parameter must be of type KProperty<*> or its supertype";

    private C7158j() {
    }

    @Override // xf.InterfaceC7154f
    public String a(InterfaceC7247z interfaceC7247z) {
        return InterfaceC7154f.a.a(this, interfaceC7247z);
    }

    @Override // xf.InterfaceC7154f
    public boolean b(InterfaceC7247z functionDescriptor) {
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        t0 t0Var = (t0) functionDescriptor.j().get(1);
        n.b bVar = ve.n.f62134k;
        AbstractC5504s.e(t0Var);
        S sA = bVar.a(ff.e.s(t0Var));
        if (sA == null) {
            return false;
        }
        S type = t0Var.getType();
        AbstractC5504s.g(type, "getType(...)");
        return AbstractC6867d.w(sA, AbstractC6867d.A(type));
    }

    @Override // xf.InterfaceC7154f
    public String getDescription() {
        return f64491b;
    }
}
