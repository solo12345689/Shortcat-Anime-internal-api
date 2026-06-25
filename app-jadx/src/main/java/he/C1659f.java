package He;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7224b;
import ye.g0;

/* JADX INFO: renamed from: He.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1659f extends U {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1659f f8557o = new C1659f();

    private C1659f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(g0 g0Var, InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        return U.f8509a.j().containsKey(Qe.C.d(g0Var));
    }

    public final Xe.f j(g0 functionDescriptor) {
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        Map mapJ = U.f8509a.j();
        String strD = Qe.C.d(functionDescriptor);
        if (strD == null) {
            return null;
        }
        return (Xe.f) mapJ.get(strD);
    }

    public final boolean k(g0 functionDescriptor) {
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        return ve.i.h0(functionDescriptor) && ff.e.i(functionDescriptor, false, new C1658e(functionDescriptor), 1, null) != null;
    }

    public final boolean m(g0 g0Var) {
        AbstractC5504s.h(g0Var, "<this>");
        return AbstractC5504s.c(g0Var.getName().b(), "removeAt") && AbstractC5504s.c(Qe.C.d(g0Var), U.f8509a.h().d());
    }
}
