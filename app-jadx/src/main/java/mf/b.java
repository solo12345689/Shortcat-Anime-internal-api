package Mf;

import Gf.C;
import Gf.C1598a0;
import Gf.J0;
import Gf.b1;
import Lf.A;
import Lf.L;
import Td.C2160k;
import Td.u;
import Td.v;
import Zd.e;
import Zd.i;
import ae.AbstractC2605b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    private static final Void a(A a10, C1598a0 c1598a0) throws Throwable {
        a10.r0(new C(c1598a0.getCause(), false, 2, null));
        throw c1598a0.getCause();
    }

    private static final boolean b(A a10, Throwable th2) {
        return ((th2 instanceof b1) && ((b1) th2).f7552a == a10) ? false : true;
    }

    public static final void c(Function2 function2, Object obj, e eVar) {
        e eVarA = h.a(eVar);
        try {
            i context = eVarA.getContext();
            Object objI = L.i(context, null);
            try {
                h.b(eVarA);
                Object objE = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC2605b.e(function2, obj, eVarA) : ((Function2) V.e(function2, 2)).invoke(obj, eVarA);
                L.f(context, objI);
                if (objE != AbstractC2605b.f()) {
                    eVarA.resumeWith(u.b(objE));
                }
            } catch (Throwable th2) {
                L.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof C1598a0) {
                th = ((C1598a0) th).getCause();
            }
            u.a aVar = u.f17466b;
            eVarA.resumeWith(u.b(v.a(th)));
        }
    }

    public static final Object d(A a10, Object obj, Function2 function2) {
        return f(a10, true, obj, function2);
    }

    public static final Object e(A a10, Object obj, Function2 function2) {
        return f(a10, false, obj, function2);
    }

    private static final Object f(A a10, boolean z10, Object obj, Function2 function2) throws Throwable {
        Object c10;
        try {
            c10 = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC2605b.e(function2, obj, a10) : ((Function2) V.e(function2, 2)).invoke(obj, a10);
        } catch (C1598a0 e10) {
            a(a10, e10);
            throw new C2160k();
        } catch (Throwable th2) {
            c10 = new C(th2, false, 2, null);
        }
        if (c10 == AbstractC2605b.f()) {
            return AbstractC2605b.f();
        }
        Object objS0 = a10.s0(c10);
        if (objS0 == J0.f7514b) {
            return AbstractC2605b.f();
        }
        a10.U0();
        if (!(objS0 instanceof C)) {
            return J0.h(objS0);
        }
        if (z10 || b(a10, ((C) objS0).f7489a)) {
            throw ((C) objS0).f7489a;
        }
        if (c10 instanceof C) {
            throw ((C) c10).f7489a;
        }
        return c10;
    }
}
