package Gf;

import Zd.i;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class I {
    private static final Zd.i d(Zd.i iVar, Zd.i iVar2, final boolean z10) {
        boolean zH = h(iVar);
        boolean zH2 = h(iVar2);
        if (!zH && !zH2) {
            return iVar.w(iVar2);
        }
        final kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        n10.f52259a = iVar2;
        Zd.j jVar = Zd.j.f23275a;
        Zd.i iVar3 = (Zd.i) iVar.y1(jVar, new Function2() { // from class: Gf.G
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I.e(n10, z10, (Zd.i) obj, (i.b) obj2);
            }
        });
        if (zH2) {
            n10.f52259a = ((Zd.i) n10.f52259a).y1(jVar, new Function2() { // from class: Gf.H
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I.f((Zd.i) obj, (i.b) obj2);
                }
            });
        }
        return iVar3.w((Zd.i) n10.f52259a);
    }

    public static final Zd.i e(kotlin.jvm.internal.N n10, boolean z10, Zd.i iVar, i.b bVar) {
        return iVar.w(bVar);
    }

    public static final Zd.i f(Zd.i iVar, i.b bVar) {
        return iVar.w(bVar);
    }

    public static final String g(Zd.i iVar) {
        return null;
    }

    private static final boolean h(Zd.i iVar) {
        return ((Boolean) iVar.y1(Boolean.FALSE, new Function2() { // from class: Gf.F
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(I.i(((Boolean) obj).booleanValue(), (i.b) obj2));
            }
        })).booleanValue();
    }

    public static final boolean i(boolean z10, i.b bVar) {
        return z10;
    }

    public static final Zd.i j(O o10, Zd.i iVar) {
        Zd.i iVarD = d(o10.getCoroutineContext(), iVar, true);
        return (iVarD == C1608f0.a() || iVarD.l(Zd.f.f23273S) != null) ? iVarD : iVarD.w(C1608f0.a());
    }

    public static final Zd.i k(Zd.i iVar, Zd.i iVar2) {
        return !h(iVar2) ? iVar.w(iVar2) : d(iVar, iVar2, false);
    }

    public static final f1 l(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof C1600b0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof f1) {
                return (f1) eVar;
            }
        }
        return null;
    }

    public static final f1 m(Zd.e eVar, Zd.i iVar, Object obj) {
        if (!(eVar instanceof kotlin.coroutines.jvm.internal.e) || iVar.l(g1.f7578a) == null) {
            return null;
        }
        f1 f1VarL = l((kotlin.coroutines.jvm.internal.e) eVar);
        if (f1VarL != null) {
            f1VarL.X0(iVar, obj);
        }
        return f1VarL;
    }
}
