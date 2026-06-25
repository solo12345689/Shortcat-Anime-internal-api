package xf;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import xf.InterfaceC7154f;
import ye.InterfaceC7247z;
import ye.t0;

/* JADX INFO: renamed from: xf.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C7161m implements InterfaceC7154f {

    /* JADX INFO: renamed from: a */
    public static final C7161m f64496a = new C7161m();

    /* JADX INFO: renamed from: b */
    private static final String f64497b = "should not have varargs or parameters with default values";

    private C7161m() {
    }

    @Override // xf.InterfaceC7154f
    public String a(InterfaceC7247z interfaceC7247z) {
        return InterfaceC7154f.a.a(this, interfaceC7247z);
    }

    @Override // xf.InterfaceC7154f
    public boolean b(InterfaceC7247z functionDescriptor) {
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        List<t0> listJ = functionDescriptor.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        if (listJ != null && listJ.isEmpty()) {
            return true;
        }
        for (t0 t0Var : listJ) {
            AbstractC5504s.e(t0Var);
            if (ff.e.f(t0Var) || t0Var.v0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // xf.InterfaceC7154f
    public String getDescription() {
        return f64497b;
    }
}
