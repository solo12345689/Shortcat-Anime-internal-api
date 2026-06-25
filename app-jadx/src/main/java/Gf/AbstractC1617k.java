package Gf;

import Zd.f;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Gf.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC1617k {
    public static final W a(O o10, Zd.i iVar, Q q10, Function2 function2) {
        Zd.i iVarJ = I.j(o10, iVar);
        X k02 = q10.c() ? new K0(iVarJ, function2) : new X(iVarJ, true);
        k02.T0(q10, k02, function2);
        return k02;
    }

    public static /* synthetic */ W b(O o10, Zd.i iVar, Q q10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = Zd.j.f23275a;
        }
        if ((i10 & 2) != 0) {
            q10 = Q.f7529a;
        }
        return AbstractC1613i.a(o10, iVar, q10, function2);
    }

    public static final C0 c(O o10, Zd.i iVar, Q q10, Function2 function2) {
        Zd.i iVarJ = I.j(o10, iVar);
        V0 l02 = q10.c() ? new L0(iVarJ, function2) : new V0(iVarJ, true);
        l02.T0(q10, l02, function2);
        return l02;
    }

    public static /* synthetic */ C0 d(O o10, Zd.i iVar, Q q10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = Zd.j.f23275a;
        }
        if ((i10 & 2) != 0) {
            q10 = Q.f7529a;
        }
        return AbstractC1613i.c(o10, iVar, q10, function2);
    }

    public static final Object e(Zd.i iVar, Function2 function2, Zd.e eVar) {
        Object objV0;
        Zd.i context = eVar.getContext();
        Zd.i iVarK = I.k(context, iVar);
        F0.j(iVarK);
        if (iVarK == context) {
            Lf.A a10 = new Lf.A(iVarK, eVar);
            objV0 = Mf.b.d(a10, a10, function2);
        } else {
            f.b bVar = Zd.f.f23273S;
            if (AbstractC5504s.c(iVarK.l(bVar), context.l(bVar))) {
                f1 f1Var = new f1(iVarK, eVar);
                Zd.i context2 = f1Var.getContext();
                Object objI = Lf.L.i(context2, null);
                try {
                    Object objD = Mf.b.d(f1Var, f1Var, function2);
                    Lf.L.f(context2, objI);
                    objV0 = objD;
                } catch (Throwable th2) {
                    Lf.L.f(context2, objI);
                    throw th2;
                }
            } else {
                C1600b0 c1600b0 = new C1600b0(iVarK, eVar);
                Mf.a.c(function2, c1600b0, c1600b0);
                objV0 = c1600b0.V0();
            }
        }
        if (objV0 == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV0;
    }
}
