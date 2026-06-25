package Gf;

import Lf.C1898e;
import ae.AbstractC2605b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class P {
    public static final O a(Zd.i iVar) {
        if (iVar.l(C0.f7490K) == null) {
            iVar = iVar.w(G0.b(null, 1, null));
        }
        return new C1898e(iVar);
    }

    public static final O b() {
        return new C1898e(X0.b(null, 1, null).w(C1608f0.c()));
    }

    public static final void c(O o10, CancellationException cancellationException) {
        C0 c02 = (C0) o10.getCoroutineContext().l(C0.f7490K);
        if (c02 != null) {
            c02.k(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o10).toString());
    }

    public static /* synthetic */ void d(O o10, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(o10, cancellationException);
    }

    public static final Object e(Function2 function2, Zd.e eVar) {
        Lf.A a10 = new Lf.A(eVar.getContext(), eVar);
        Object objD = Mf.b.d(a10, a10, function2);
        if (objD == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objD;
    }

    public static final void f(O o10) {
        F0.j(o10.getCoroutineContext());
    }

    public static final boolean g(O o10) {
        C0 c02 = (C0) o10.getCoroutineContext().l(C0.f7490K);
        if (c02 != null) {
            return c02.b();
        }
        return true;
    }

    public static final O h(O o10, Zd.i iVar) {
        return new C1898e(o10.getCoroutineContext().w(iVar));
    }
}
