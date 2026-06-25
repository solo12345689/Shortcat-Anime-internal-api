package Gf;

import Lf.AbstractC1903j;
import Lf.C1902i;
import ae.AbstractC2605b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j1 {
    public static final Object a(Zd.e eVar) {
        Object objF;
        Zd.i context = eVar.getContext();
        F0.j(context);
        Zd.e eVarC = AbstractC2605b.c(eVar);
        C1902i c1902i = eVarC instanceof C1902i ? (C1902i) eVarC : null;
        if (c1902i == null) {
            objF = Td.L.f17438a;
        } else {
            if (AbstractC1903j.d(c1902i.f11571d, context)) {
                c1902i.l(context, Td.L.f17438a);
            } else {
                i1 i1Var = new i1();
                Zd.i iVarW = context.w(i1Var);
                Td.L l10 = Td.L.f17438a;
                c1902i.l(iVarW, l10);
                objF = (!i1Var.f7582b || AbstractC1903j.e(c1902i)) ? AbstractC2605b.f() : l10;
            }
            objF = AbstractC2605b.f();
        }
        if (objF == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objF == AbstractC2605b.f() ? objF : Td.L.f17438a;
    }
}
