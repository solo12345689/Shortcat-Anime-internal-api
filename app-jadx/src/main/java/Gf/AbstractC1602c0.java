package Gf;

import Lf.C1902i;
import Td.u;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Gf.c0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1602c0 extends Nf.h {

    /* JADX INFO: renamed from: c */
    public int f7553c;

    public AbstractC1602c0(int i10) {
        this.f7553c = i10;
    }

    public abstract Zd.e d();

    public Throwable e(Object obj) {
        C c10 = obj instanceof C ? (C) obj : null;
        if (c10 != null) {
            return c10.f7489a;
        }
        return null;
    }

    public final void g(Throwable th2) {
        M.a(d().getContext(), new S("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Zd.e eVarD = d();
            AbstractC5504s.f(eVarD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C1902i c1902i = (C1902i) eVarD;
            Zd.e eVar = c1902i.f11572e;
            Object obj = c1902i.f11574g;
            Zd.i context = eVar.getContext();
            Object objI = Lf.L.i(context, obj);
            C0 c02 = null;
            f1 f1VarM = objI != Lf.L.f11553a ? I.m(eVar, context, objI) : null;
            try {
                Zd.i context2 = eVar.getContext();
                Object objH = h();
                Throwable thE = e(objH);
                if (thE == null && AbstractC1604d0.b(this.f7553c)) {
                    c02 = (C0) context2.l(C0.f7490K);
                }
                if (c02 != null && !c02.b()) {
                    CancellationException cancellationExceptionD = c02.D();
                    a(objH, cancellationExceptionD);
                    u.a aVar = Td.u.f17466b;
                    eVar.resumeWith(Td.u.b(Td.v.a(cancellationExceptionD)));
                } else if (thE != null) {
                    u.a aVar2 = Td.u.f17466b;
                    eVar.resumeWith(Td.u.b(Td.v.a(thE)));
                } else {
                    u.a aVar3 = Td.u.f17466b;
                    eVar.resumeWith(Td.u.b(f(objH)));
                }
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
        } catch (C1598a0 e10) {
            M.a(d().getContext(), e10.getCause());
        } catch (Throwable th3) {
            g(th3);
        }
    }

    public Object f(Object obj) {
        return obj;
    }

    public void a(Object obj, Throwable th2) {
    }
}
