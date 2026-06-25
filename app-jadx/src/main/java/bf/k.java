package bf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.G0;
import qf.N0;
import qf.S;
import ye.C7222A;
import ye.I;
import ye.InterfaceC7223a;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.Z;
import ye.a0;
import ye.r0;
import ye.u0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: renamed from: a */
    private static final Xe.c f33308a;

    /* JADX INFO: renamed from: b */
    private static final Xe.b f33309b;

    static {
        Xe.c cVar = new Xe.c("kotlin.jvm.JvmInline");
        f33308a = cVar;
        f33309b = Xe.b.f21759d.c(cVar);
    }

    public static final boolean a(InterfaceC7223a interfaceC7223a) {
        AbstractC5504s.h(interfaceC7223a, "<this>");
        if (!(interfaceC7223a instanceof a0)) {
            return false;
        }
        Z zW = ((a0) interfaceC7223a).W();
        AbstractC5504s.g(zW, "getCorrespondingProperty(...)");
        return f(zW);
    }

    public static final boolean b(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        return (interfaceC7235m instanceof InterfaceC7227e) && (((InterfaceC7227e) interfaceC7235m).V() instanceof C7222A);
    }

    public static final boolean c(S s10) {
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP != null) {
            return b(interfaceC7230hP);
        }
        return false;
    }

    public static final boolean d(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        return (interfaceC7235m instanceof InterfaceC7227e) && (((InterfaceC7227e) interfaceC7235m).V() instanceof I);
    }

    public static final boolean e(u0 u0Var) {
        C7222A c7222aQ;
        AbstractC5504s.h(u0Var, "<this>");
        if (u0Var.O() != null) {
            return false;
        }
        InterfaceC7235m interfaceC7235mB = u0Var.b();
        Xe.f fVarC = null;
        InterfaceC7227e interfaceC7227e = interfaceC7235mB instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mB : null;
        if (interfaceC7227e != null && (c7222aQ = ff.e.q(interfaceC7227e)) != null) {
            fVarC = c7222aQ.c();
        }
        return AbstractC5504s.c(fVarC, u0Var.getName());
    }

    public static final boolean f(u0 u0Var) {
        r0 r0VarV;
        AbstractC5504s.h(u0Var, "<this>");
        if (u0Var.O() != null) {
            return false;
        }
        InterfaceC7235m interfaceC7235mB = u0Var.b();
        InterfaceC7227e interfaceC7227e = interfaceC7235mB instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mB : null;
        if (interfaceC7227e == null || (r0VarV = interfaceC7227e.V()) == null) {
            return false;
        }
        Xe.f name = u0Var.getName();
        AbstractC5504s.g(name, "getName(...)");
        return r0VarV.a(name);
    }

    public static final boolean g(InterfaceC7235m interfaceC7235m) {
        AbstractC5504s.h(interfaceC7235m, "<this>");
        return b(interfaceC7235m) || d(interfaceC7235m);
    }

    public static final boolean h(S s10) {
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP != null) {
            return g(interfaceC7230hP);
        }
        return false;
    }

    public static final boolean i(S s10) {
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        return (interfaceC7230hP == null || !d(interfaceC7230hP) || rf.s.f58800a.M(s10)) ? false : true;
    }

    public static final S j(S s10) {
        AbstractC5504s.h(s10, "<this>");
        S sK = k(s10);
        if (sK != null) {
            return G0.f(s10).p(sK, N0.f57999e);
        }
        return null;
    }

    public static final S k(S s10) {
        C7222A c7222aQ;
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
        if (interfaceC7227e == null || (c7222aQ = ff.e.q(interfaceC7227e)) == null) {
            return null;
        }
        return (AbstractC6183d0) c7222aQ.d();
    }
}
