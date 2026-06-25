package K0;

import I0.InterfaceC1690p;
import Td.C2160k;
import a0.C2507c;
import androidx.compose.ui.e;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;
import s0.Z0;

/* JADX INFO: renamed from: K0.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1796k {
    public static final void c(C2507c c2507c, e.c cVar, boolean z10) {
        C2507c c2507cE = e(n(cVar), z10);
        int iP = c2507cE.p() - 1;
        Object[] objArr = c2507cE.f23496a;
        if (iP < objArr.length) {
            while (iP >= 0) {
                c2507c.c(((J) objArr[iP]).t0().k());
                iP--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final E d(e.c cVar) {
        if ((AbstractC1789g0.a(2) & cVar.getKindSet$ui_release()) != 0) {
            if (cVar instanceof E) {
                return (E) cVar;
            }
            if (cVar instanceof AbstractC1800m) {
                e.c cVarF1 = ((AbstractC1800m) cVar).F1();
                while (cVarF1 != 0) {
                    if (cVarF1 instanceof E) {
                        return (E) cVarF1;
                    }
                    cVarF1 = (!(cVarF1 instanceof AbstractC1800m) || (AbstractC1789g0.a(2) & cVarF1.getKindSet$ui_release()) == 0) ? cVarF1.getChild$ui_release() : ((AbstractC1800m) cVarF1).F1();
                }
            }
        }
        return null;
    }

    private static final C2507c e(J j10, boolean z10) {
        return z10 ? j10.H0() : j10.I0();
    }

    public static final boolean f(InterfaceC1794j interfaceC1794j, int i10) {
        return (interfaceC1794j.getNode().getAggregateChildKindSet$ui_release() & i10) != 0;
    }

    public static final boolean g(InterfaceC1794j interfaceC1794j) {
        return interfaceC1794j.getNode() == interfaceC1794j;
    }

    public static final e.c h(C2507c c2507c) {
        if (c2507c == null || c2507c.p() == 0) {
            return null;
        }
        return (e.c) c2507c.y(c2507c.p() - 1);
    }

    public static final AbstractC1785e0 i(InterfaceC1794j interfaceC1794j, int i10) {
        AbstractC1785e0 coordinator$ui_release = interfaceC1794j.getNode().getCoordinator$ui_release();
        AbstractC5504s.e(coordinator$ui_release);
        if (coordinator$ui_release.N2() != interfaceC1794j || !AbstractC1791h0.i(i10)) {
            return coordinator$ui_release;
        }
        AbstractC1785e0 abstractC1785e0O2 = coordinator$ui_release.O2();
        AbstractC5504s.e(abstractC1785e0O2);
        return abstractC1785e0O2;
    }

    public static final InterfaceC5011d j(InterfaceC1794j interfaceC1794j) {
        return n(interfaceC1794j).R();
    }

    public static final Z0 k(InterfaceC1794j interfaceC1794j) {
        return o(interfaceC1794j).getGraphicsContext();
    }

    public static final InterfaceC1690p l(InterfaceC1794j interfaceC1794j) {
        if (!interfaceC1794j.getNode().isAttached()) {
            H0.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        InterfaceC1690p interfaceC1690pX = i(interfaceC1794j, AbstractC1789g0.a(2)).x();
        if (!interfaceC1690pX.b()) {
            H0.a.b("LayoutCoordinates is not attached.");
        }
        return interfaceC1690pX;
    }

    public static final EnumC5027t m(InterfaceC1794j interfaceC1794j) {
        return n(interfaceC1794j).getLayoutDirection();
    }

    public static final J n(InterfaceC1794j interfaceC1794j) {
        AbstractC1785e0 coordinator$ui_release = interfaceC1794j.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.L1();
        }
        H0.a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new C2160k();
    }

    public static final p0 o(InterfaceC1794j interfaceC1794j) {
        p0 p0VarZ0 = n(interfaceC1794j).z0();
        if (p0VarZ0 != null) {
            return p0VarZ0;
        }
        H0.a.c("This node does not have an owner.");
        throw new C2160k();
    }

    public static final R0.n p(InterfaceC1794j interfaceC1794j) {
        return n(interfaceC1794j);
    }
}
