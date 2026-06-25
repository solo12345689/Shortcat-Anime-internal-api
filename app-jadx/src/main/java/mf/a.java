package Mf;

import Gf.C1598a0;
import Lf.AbstractC1903j;
import Td.L;
import Td.u;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    private static final void a(e eVar, Throwable th2) throws Throwable {
        if (th2 instanceof C1598a0) {
            th2 = ((C1598a0) th2).getCause();
        }
        u.a aVar = u.f17466b;
        eVar.resumeWith(u.b(v.a(th2)));
        throw th2;
    }

    public static final void b(e eVar, e eVar2) throws Throwable {
        try {
            e eVarC = AbstractC2605b.c(eVar);
            u.a aVar = u.f17466b;
            AbstractC1903j.b(eVarC, u.b(L.f17438a));
        } catch (Throwable th2) {
            a(eVar2, th2);
        }
    }

    public static final void c(Function2 function2, Object obj, e eVar) {
        try {
            e eVarC = AbstractC2605b.c(AbstractC2605b.a(function2, obj, eVar));
            u.a aVar = u.f17466b;
            AbstractC1903j.b(eVarC, u.b(L.f17438a));
        } catch (Throwable th2) {
            a(eVar, th2);
        }
    }
}
