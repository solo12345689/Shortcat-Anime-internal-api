package Gf;

import Lf.AbstractC1903j;
import Lf.C1902i;
import Td.u;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Gf.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1604d0 {
    public static final void a(AbstractC1602c0 abstractC1602c0, int i10) {
        Zd.e eVarD = abstractC1602c0.d();
        boolean z10 = i10 == 4;
        if (z10 || !(eVarD instanceof C1902i) || b(i10) != b(abstractC1602c0.f7553c)) {
            d(abstractC1602c0, eVarD, z10);
            return;
        }
        C1902i c1902i = (C1902i) eVarD;
        K k10 = c1902i.f11571d;
        Zd.i context = c1902i.getContext();
        if (AbstractC1903j.d(k10, context)) {
            AbstractC1903j.c(k10, context, abstractC1602c0);
        } else {
            e(abstractC1602c0);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(AbstractC1602c0 abstractC1602c0, Zd.e eVar, boolean z10) {
        Object objF;
        Object objH = abstractC1602c0.h();
        Throwable thE = abstractC1602c0.e(objH);
        if (thE != null) {
            u.a aVar = Td.u.f17466b;
            objF = Td.v.a(thE);
        } else {
            u.a aVar2 = Td.u.f17466b;
            objF = abstractC1602c0.f(objH);
        }
        Object objB = Td.u.b(objF);
        if (!z10) {
            eVar.resumeWith(objB);
            return;
        }
        AbstractC5504s.f(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C1902i c1902i = (C1902i) eVar;
        Zd.e eVar2 = c1902i.f11572e;
        Object obj = c1902i.f11574g;
        Zd.i context = eVar2.getContext();
        Object objI = Lf.L.i(context, obj);
        f1 f1VarM = objI != Lf.L.f11553a ? I.m(eVar2, context, objI) : null;
        try {
            c1902i.f11572e.resumeWith(objB);
            Td.L l10 = Td.L.f17438a;
            if (f1VarM == null || f1VarM.V0()) {
                Lf.L.f(context, objI);
            }
        } catch (Throwable th2) {
            if (f1VarM == null || f1VarM.V0()) {
                Lf.L.f(context, objI);
            }
            throw th2;
        }
    }

    private static final void e(AbstractC1602c0 abstractC1602c0) {
        AbstractC1620l0 abstractC1620l0B = Z0.f7544a.b();
        if (abstractC1620l0B.i2()) {
            abstractC1620l0B.e2(abstractC1602c0);
            return;
        }
        abstractC1620l0B.g2(true);
        try {
            d(abstractC1602c0, abstractC1602c0.d(), true);
            do {
            } while (abstractC1620l0B.l2());
        } finally {
            try {
            } finally {
            }
        }
    }
}
